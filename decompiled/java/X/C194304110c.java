package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.110c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194304110c implements InterfaceC19456811Ag {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler();
    public final SoundPool LJ;
    public final LinkedList<Integer> LJFF;
    public Integer LJI;

    public final void LIZIZ() {
        Integer numPoll = this.LJFF.poll();
        this.LJI = numPoll;
        if (numPoll != null) {
            this.LJ.play(numPoll.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            C786410Ut5.LJLIIL(1000L, this.LIZLLL, new ARunnableS129S0100000_29(this, 58));
        }
    }

    @Override // X.InterfaceC19456811Ag
    public final void release() {
        this.LIZLLL.removeCallbacksAndMessages(null);
        this.LJ.release();
        this.LJI = null;
        this.LJFF.clear();
    }

    public C194304110c(Context context) {
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        this.LJ = soundPoolBuild;
        this.LIZ = soundPoolBuild.load(context, R.raw.shot_count_down_a, 1);
        this.LIZIZ = soundPoolBuild.load(context, R.raw.shot_count_down_b, 1);
        this.LIZJ = soundPoolBuild.load(context, R.raw.shot_count_down_c, 1);
        this.LJFF = new LinkedList<>();
    }

    @Override // X.InterfaceC19456811Ag
    public final void LIZ(int i) {
        if (i == 10) {
            int i2 = 0;
            do {
                this.LJFF.offer(Integer.valueOf(this.LIZ));
                i2++;
            } while (i2 < 7);
        }
        this.LJFF.offer(Integer.valueOf(this.LIZIZ));
        this.LJFF.offer(Integer.valueOf(this.LIZIZ));
        this.LJFF.offer(Integer.valueOf(this.LIZJ));
        LIZIZ();
    }
}
