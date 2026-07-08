package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.lynx.animax.audio.AudioPlayer;
import com.lynx.animax.util.AnimaXLog;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1BrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217841BrC implements AudioTrack.OnPlaybackPositionUpdateListener {
    public final int LIZ;
    public final int LIZIZ;
    public final ByteBuffer LIZJ;
    public AudioPlayer LIZLLL;
    public int LJ;
    public final AudioTrack LJFF;

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
    }

    public C2217841BrC(C1285570jYh c1285570jYh) {
        int i;
        int i2 = c1285570jYh.LIZJ;
        int i3 = c1285570jYh.LIZIZ;
        int i4 = 4;
        if (i3 == 1) {
            i = 4;
        } else if (i3 == 2) {
            i = 12;
        } else {
            i = 1;
        }
        int i5 = c1285570jYh.LJ;
        if (i5 == 3) {
            i4 = 1;
        } else if (i5 != 4) {
            i4 = 2;
        }
        int i6 = i3 * i4;
        this.LIZIZ = i6;
        int iMin = Math.min(((int) Math.ceil(((double) i2) / 30.0d)) * 2, (int) ((((long) c1285570jYh.LIZJ) * c1285570jYh.LIZLLL) / 1000000.0d));
        int iMax = Math.max(iMin, (AudioTrack.getMinBufferSize(i2, i, i5) / i6) + 1) * i6;
        this.LIZ = iMax;
        this.LIZJ = ByteBuffer.allocate(iMax);
        AudioTrack audioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setEncoding(i5).setSampleRate(i2).setChannelMask(i).build(), iMax, 1, 0);
        this.LJFF = audioTrack;
        if (audioTrack.getState() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AudioTrack initialization success. sampleRate=");
            sbLIZ.append(i2);
            sbLIZ.append(", channelConfig=");
            sbLIZ.append(i);
            sbLIZ.append(", encoding=");
            sbLIZ.append(i5);
            sbLIZ.append(", bufferSize=");
            sbLIZ.append(iMax);
            AnimaXLog.LIZIZ("AudioRenderer", C2188811AlT.LIZIZ(sbLIZ));
            audioTrack.setPositionNotificationPeriod(iMin / 2);
            audioTrack.setPlaybackPositionUpdateListener(this);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AudioTrack initialization failed. sampleRate=");
        sbLIZ2.append(i2);
        sbLIZ2.append(", channelConfig=");
        sbLIZ2.append(i);
        sbLIZ2.append(", encoding=");
        sbLIZ2.append(i5);
        sbLIZ2.append(", bufferSize=");
        sbLIZ2.append(iMax);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
        if (this.LIZLLL == null) {
            return;
        }
        long playbackHeadPosition = ((long) this.LIZ) - (((long) this.LJ) - ((((long) this.LJFF.getPlaybackHeadPosition()) & 4294967295L) * ((long) this.LIZIZ)));
        int i = (int) playbackHeadPosition;
        if (playbackHeadPosition == i) {
            this.LIZJ.clear();
            this.LIZJ.limit(i);
            AudioPlayer audioPlayer = this.LIZLLL;
            long j = this.LJ;
            ByteBuffer byteBuffer = this.LIZJ;
            long j2 = ((long) audioPlayer.LJ) + j;
            int i2 = audioPlayer.LIZLLL;
            long j3 = j2 % ((long) i2);
            int i3 = (int) j3;
            if (j3 == i3) {
                int i4 = i + i3;
                int iMin = Math.min(i2, i4);
                audioPlayer.LIZJ.position(i3);
                audioPlayer.LIZJ.limit(iMin);
                byteBuffer.put(audioPlayer.LIZJ);
                int i5 = audioPlayer.LIZLLL;
                if (i5 < i4) {
                    audioPlayer.LIZJ.position(0);
                    audioPlayer.LIZJ.limit(i4 % i5);
                    byteBuffer.put(audioPlayer.LIZJ);
                }
                audioPlayer.LIZJ.position(0);
                audioPlayer.LIZJ.limit(audioPlayer.LIZLLL);
                this.LIZJ.flip();
                int iWrite = this.LJFF.write(this.LIZJ, i, 1);
                if (iWrite > 0) {
                    this.LJ += iWrite;
                    return;
                }
                return;
            }
            throw new ArithmeticException();
        }
        throw new ArithmeticException();
    }
}
