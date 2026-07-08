package X;

import Y.ARunnableS1S1301000_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS31S0101000_20;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.codec.DefaultAudioEncoderFactory;
import com.ss.ttlivestreamer.core.codec.DefaultVideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.MediaTrack;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.engine.VideoSource;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270500jAO implements InterfaceC1270540jAS, InterfaceC1270200j9u, InterfaceC1267880j6A, InterfaceC1270480jAM {
    public final InterfaceC1270540jAS LL;
    public MediaEngineFactory LLILLJJLI;
    public MediaEncodeStream LLILLL;
    public DefaultVideoEncoderFactory LLILZ;
    public DefaultAudioEncoderFactory LLILZIL;
    public VideoTrack LLILZLL;
    public AudioTrack LLIZ;
    public Transport LLIZLLLIL;
    public C1270410jAF LLJ;
    public C1270150j9p LLJI;
    public C1270520jAQ LLJIJIL;
    public GLThread LLJILJIL;
    public Handler LLJILJILJ;
    public SafeHandlerThread LLJILLL;
    public InterfaceC1270560jAU LLJJ;
    public String LLJJI;
    public Intent LLJJIJI;
    public Context LLJJIJIIJIL;
    public AbstractC1268600j7K LLJJIJIL;
    public AudioCapturer LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public TEBundle LLJJJJJIL;
    public C1270530jAR LLJJJJLIIL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public AudioDeviceModule LLJZIJLIL;
    public final C1269160j8E LLL;
    public int LLJJLIIIJLLLLLLLZ = -1;
    public int LLJL = -1;
    public final List<AudioTrack> LLJZ = new ArrayList();
    public final AtomicInteger LLJJIII = new AtomicInteger(2);
    public final ArrayList<Transport.c> LLJJL = new ArrayList<>();
    public C1268610j7L LLJLLL = new C1268610j7L();

    @Override // X.InterfaceC1270200j9u
    public final void LJ() {
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIILIIL(int i, int i2, int i3, String str) {
    }

    public final void LJFF() {
        if (this.LLILLL == null) {
            this.LLILZ = new DefaultVideoEncoderFactory();
            this.LLILZIL = new DefaultAudioEncoderFactory();
            C1270530jAR c1270530jAR = this.LLJJJJLIIL;
            if (c1270530jAR instanceof Transport) {
                this.LLIZLLLIL = c1270530jAR;
            } else {
                this.LLIZLLLIL = new Transport() { // from class: X.0jAP
                    @Override // com.ss.ttlivestreamer.core.engine.Transport
                    public final void registerFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN) {
                    }

                    @Override // com.ss.ttlivestreamer.core.engine.Transport
                    public final void unRegisterFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN) {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
                    @Override // com.ss.ttlivestreamer.core.engine.Transport
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void sendPacket(com.ss.ttlivestreamer.core.engine.Transport.c r17) {
                        /*
                            Method dump skipped, instruction units count: 327
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1270510jAP.sendPacket(com.ss.ttlivestreamer.core.engine.Transport$c):void");
                    }
                };
            }
            MediaEncodeStream mediaEncodeStreamCreateMediaEncodeStream = this.LLILLJJLI.createMediaEncodeStream(this.LLILZ, this.LLILZIL, this.LLIZLLLIL);
            this.LLILLL = mediaEncodeStreamCreateMediaEncodeStream;
            mediaEncodeStreamCreateMediaEncodeStream.registerObserver(this);
            this.LLILLL.stop();
        }
    }

    public final void LJIIIIZZ() {
        if (this.LLJIJIL.LJI) {
            if (this.LLJJJ == null) {
                this.LLJJIII.set(3);
                this.LLJJ.LIZIZ(-4, new Exception("Not found shared audio capture."));
                return;
            }
            LJFF();
            this.LLIZ = this.LLILLJJLI.createAudioTrack(this.LLJJJ);
            if (this.LLJJJJJIL == null) {
                this.LLJJJJJIL = this.LLILLL.getParameter();
            }
            this.LLJJJJJIL.setString("audio_type", "audio/faac");
            this.LLJJJJJIL.setInt("audio_sample", this.LLJIJIL.LJII);
            this.LLJJJJJIL.setInt("audio_channels", this.LLJIJIL.LJIIIIZZ);
            this.LLJJJJJIL.setLong("audio_bit_rate", this.LLJIJIL.LJIIIZ);
            this.LLILLL.setParameter(this.LLJJJJJIL);
            this.LLILLL.addTrack(this.LLIZ);
            this.LLILLL.getAudioMixer().setEnable(true);
            this.LLILLL.setOriginAudioTrack(this.LLIZ.id());
            this.LLILLL.setAudioMixerDescription(this.LLIZ.id(), new AudioMixer.AudioMixerDescription());
            for (MediaTrack mediaTrack : (ArrayList) this.LLJZ) {
                this.LLILLL.addTrack(mediaTrack);
                this.LLILLL.setAudioMixerDescription(mediaTrack.id(), new AudioMixer.AudioMixerDescription());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" add audio track to encode stream ");
                sbLIZ.append(mediaTrack.id());
                AVLog.iod("RecorderManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        AudioCapturer audioCapturer = this.LLJJJ;
        if (audioCapturer != null) {
            audioCapturer.resume();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("encoderStream cfg:");
        sbLIZ2.append(this.LLJJJJJIL.toString());
        AVLog.iod("RecorderManager", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1270540jAS
    public final C1270520jAQ getConfig() {
        C1270520jAQ c1270520jAQ = this.LLJIJIL;
        c1270520jAQ.getClass();
        C1270520jAQ c1270520jAQ2 = new C1270520jAQ();
        c1270520jAQ2.LJFF = c1270520jAQ.LJFF;
        c1270520jAQ2.LIZIZ = c1270520jAQ.LIZIZ;
        c1270520jAQ2.LIZJ = c1270520jAQ.LIZJ;
        c1270520jAQ2.LJ = c1270520jAQ.LJ;
        c1270520jAQ2.LIZ = c1270520jAQ.LIZ;
        c1270520jAQ2.LIZLLL = c1270520jAQ.LIZLLL;
        c1270520jAQ2.LJI = c1270520jAQ.LJI;
        c1270520jAQ2.LJIIIIZZ = c1270520jAQ.LJIIIIZZ;
        c1270520jAQ2.LJII = c1270520jAQ.LJII;
        c1270520jAQ2.LJIIIZ = c1270520jAQ.LJIIIZ;
        return c1270520jAQ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // X.InterfaceC1270540jAS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void stop() {
        /*
            r5 = this;
            com.ss.ttlivestreamer.core.engine.AudioDeviceModule r4 = r5.LLJZIJLIL
            if (r4 == 0) goto L15
            X.0j8E r0 = r5.LLL
            r3 = 0
            if (r0 == 0) goto L36
            X.0j8C r0 = r0.LJLJI
            X.0j6K r2 = r0.LJJLI
            X.0j6K r1 = X.EnumC1267980j6K.NORMAL_LIVE
            r0 = 1
            if (r2 == r1) goto L36
        L12:
            r4.forceEnableAudioPushStream(r3, r0)
        L15:
            com.ss.ttlivestreamer.core.utils.SafeHandlerThread r2 = r5.LLJILLL
            java.util.concurrent.atomic.AtomicInteger r0 = r5.LLJJIII
            int r1 = r0.get()
            r0 = 4
            if (r1 == r0) goto L35
            java.util.concurrent.atomic.AtomicInteger r0 = r5.LLJJIII
            int r1 = r0.get()
            r0 = 2
            if (r1 == r0) goto L35
            if (r2 == 0) goto L35
            Y.ARunnableS120S0100000_20 r1 = new Y.ARunnableS120S0100000_20
            r0 = 297(0x129, float:4.16E-43)
            r1.<init>(r5, r0)
            r2.post(r1)
        L35:
            return
        L36:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270500jAO.stop():void");
    }

    public final void LJII() {
        LJFF();
        MediaEngineFactory mediaEngineFactory = this.LLILLJJLI;
        VideoSource videoSource = this.LLJI;
        if (videoSource == null) {
            videoSource = this.LLJJIJIL;
        }
        this.LLILZLL = mediaEngineFactory.createVideoTrack(videoSource);
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = this.LLILLL.getParameter();
        }
        this.LLJJJJJIL.setString("video_type", this.LLJJJJ ? "video/avc" : "video/bytevc0");
        this.LLJJJJJIL.setBool("video_enable_accelera", this.LLJJJJ);
        this.LLJJJJJIL.setInt("video_width", this.LLJIJIL.LIZIZ);
        this.LLJJJJJIL.setInt("video_height", this.LLJIJIL.LIZJ);
        this.LLJJJJJIL.setLong("video_bitrate", this.LLJIJIL.LIZLLL);
        this.LLJJJJJIL.setInt("video_fps", this.LLJIJIL.LJ);
        this.LLJJJJJIL.setBool("enableBFrame", false);
        this.LLJJJJJIL.setInt("configuration_type", 1);
        if (this.LLJIJIL.LJFF) {
            this.LLJJJJJIL.setInt("video_profileLevel", 3);
        } else {
            this.LLJJJJJIL.setInt("video_profileLevel", 1);
        }
        if (this.LLJJJJ) {
            this.LLJJJJJIL.setInt("video_profileLevel", 1);
        }
        this.LLILLL.setParameter(this.LLJJJJJIL);
        this.LLILLL.addTrack(this.LLILZLL);
    }

    public static int LIZLLL(ByteBuffer byteBuffer) {
        int i;
        int iPosition = byteBuffer.position();
        int iPosition2 = byteBuffer.position();
        if (byteBuffer.get(iPosition2) == 0 && byteBuffer.get(iPosition2 + 1) == 0 && byteBuffer.get(iPosition2 + 2) == 0 && byteBuffer.get(iPosition2 + 3) == 1) {
            iPosition2 += 4;
            i = 4;
        } else if (byteBuffer.get(iPosition2) == 0 && byteBuffer.get(iPosition2 + 1) == 0 && byteBuffer.get(iPosition2 + 2) == 1) {
            iPosition2 += 3;
            i = 3;
        } else {
            i = 0;
        }
        int i2 = -1;
        while (i + iPosition < byteBuffer.capacity() - 3) {
            byte b = byteBuffer.get(iPosition2);
            iPosition2++;
            i2 = (i2 << 8) | b;
            i++;
            if (i2 == 1) {
                return i - 4;
            }
            if ((16777215 & i2) == 1) {
                return i - 3;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1270540jAS
    public final void LIZIZ(Intent intent) {
        this.LLJJIJI = intent;
    }

    public final void LIZJ(Transport.c cVar) {
        int iLimit;
        cVar.LIZ.position(cVar.LIZJ);
        cVar.LIZ.limit(cVar.LIZLLL);
        ByteBuffer byteBufferSlice = cVar.LIZ.slice();
        C1270520jAQ c1270520jAQ = this.LLJIJIL;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", c1270520jAQ.LIZIZ, c1270520jAQ.LIZJ);
        byteBufferSlice.position(0);
        byteBufferSlice.position(0);
        int iLIZLLL = LIZLLL(byteBufferSlice);
        if (iLIZLLL > 0 && iLIZLLL < byteBufferSlice.capacity()) {
            byteBufferSlice.position(iLIZLLL);
            int iLIZLLL2 = LIZLLL(byteBufferSlice);
            if (iLIZLLL2 <= 0) {
                if (byteBufferSlice.capacity() < 50) {
                    iLimit = byteBufferSlice.limit();
                } else {
                    AVLog.w("RecorderManager", "Not found spspps");
                    return;
                }
            } else {
                iLimit = iLIZLLL2 + iLIZLLL;
            }
            if (iLIZLLL >= 1 && iLimit >= 1) {
                byteBufferSlice.position(0);
                byteBufferSlice.limit(iLIZLLL);
                ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
                byteBufferSlice.limit(iLimit);
                byteBufferSlice.position(iLIZLLL);
                ByteBuffer byteBufferSlice3 = byteBufferSlice.slice();
                mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBufferSlice2);
                mediaFormatCreateVideoFormat.setByteBuffer("csd-1", byteBufferSlice3);
                mediaFormatCreateVideoFormat.setInteger("color-format", 19);
                this.LLJJJJLIIL.getClass();
                throw new AndroidRuntimeException("Should not be here.");
            }
        }
        AVLog.w("RecorderManager", "Not found spspps on recorder.");
    }

    public final void LJIIIZ(Transport.c cVar) {
        int i;
        String str;
        String str2;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i2 = cVar.LJFF;
        int i3 = 0;
        if ((i2 & 1) != 0) {
            i = 2;
        } else {
            i = 0;
        }
        bufferInfo.flags = i;
        if ((i2 & 2) != 0) {
            i3 = 1;
        }
        bufferInfo.flags = i | i3;
        bufferInfo.presentationTimeUs = cVar.LJ;
        bufferInfo.offset = cVar.LIZJ;
        bufferInfo.size = cVar.LIZLLL;
        if (cVar.LIZIZ) {
            int i4 = this.LLJL;
            if (i4 >= 0 && this.LLJJJJLIIL != null) {
                this.LLJLIL++;
                C1270530jAR.LLIZ(i4, bufferInfo, cVar.LIZ);
                throw null;
            }
        } else {
            int i5 = this.LLJJLIIIJLLLLLLLZ;
            if (i5 >= 0 && this.LLJJJJLIIL != null) {
                this.LLJLILLLLZIIL++;
                C1270530jAR.LLIZ(i5, bufferInfo, cVar.LIZ);
                throw null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Maybe we are receiver a ");
        if (cVar.LIZIZ) {
            str = "video";
        } else {
            str = "audio";
        }
        sbLIZ.append(str);
        sbLIZ.append("frame and size ");
        sbLIZ.append(cVar.LIZLLL);
        sbLIZ.append(", but the recorder no config it or have a internal error (statue:");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(",v/a:");
        String str3 = "y";
        if (this.LLJIJIL.LIZ) {
            str2 = "y";
        } else {
            str2 = "n";
        }
        sbLIZ.append(str2);
        sbLIZ.append("/");
        if (!this.LLJIJIL.LJI) {
            str3 = "n";
        }
        sbLIZ.append(str3);
        sbLIZ.append(",idx v/a:");
        sbLIZ.append(this.LLJL);
        sbLIZ.append("/");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        AVLog.w("RecorderManager", C2188811AlT.LIZIZ(sbLIZ));
        cVar.LIZ = null;
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJI(int i, Exception exc) {
        if (i == -201) {
            return;
        }
        this.LLJJIII.set(3);
        SafeHandlerThread safeHandlerThread = this.LLJILLL;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new ARunnableS26S0201000_20(exc, i, this, 12));
        }
    }

    public C1270500jAO(C1269160j8E c1269160j8E, MediaEngineFactory mediaEngineFactory, C1267870j69 c1267870j69) {
        this.LLILLJJLI = mediaEngineFactory;
        this.LLL = c1269160j8E;
        if (c1269160j8E != null) {
            C1270520jAQ c1270520jAQ = new C1270520jAQ();
            this.LLJIJIL = c1270520jAQ;
            c1270520jAQ.LIZLLL = c1269160j8E.LJJIFFI();
            this.LLJIJIL.LJ = c1269160j8E.LJJIJIIJI();
            this.LLJIJIL.LIZJ = c1269160j8E.LJJIJIIJIL(0);
            this.LLJIJIL.LIZIZ = c1269160j8E.LJJIL(0);
            C1270520jAQ c1270520jAQ2 = this.LLJIJIL;
            PushBase pushBase = c1269160j8E.LIZ.mPushBase;
            if (pushBase.LIZJ == -1) {
                pushBase.LIZJ = 1;
            }
            c1270520jAQ2.LJFF = pushBase.LIZJ == 3;
            c1270520jAQ2.LJIIIZ = pushBase.LIZ();
            C1270520jAQ c1270520jAQ3 = this.LLJIJIL;
            c1270520jAQ3.LJIIIIZZ = 2;
            c1270520jAQ3.LJII = c1269160j8E.LJIIJ();
            this.LLJJIJI = c1269160j8E.LJJ;
            this.LLJJIJIIJIL = c1269160j8E.LJLJI.LJIIZILJ;
            this.LLJJJJ = c1269160j8E.LIZ.mPushBase.LJJIL();
        } else {
            this.LLJIJIL = new C1270520jAQ();
        }
        this.LL = c1267870j69;
    }

    @Override // X.InterfaceC1270540jAS
    public final void LIZ(String str, InterfaceC1270560jAU interfaceC1270560jAU, C1270520jAQ c1270520jAQ, int i) {
        if (this.LLJJIII.get() != 4 && this.LLJJIII.get() != 1) {
            SafeHandlerThread safeHandlerThreadLIZIZ = this.LLJILLL;
            if (safeHandlerThreadLIZIZ == null) {
                safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "RecorderThread");
                this.LLJILLL = safeHandlerThreadLIZIZ;
                safeHandlerThreadLIZIZ.start();
            }
            AudioDeviceModule audioDeviceModule = this.LLJZIJLIL;
            if (audioDeviceModule != null) {
                audioDeviceModule.forceEnableAudioPushStream(true, true);
            }
            safeHandlerThreadLIZIZ.post(new ARunnableS1S1301000_20(this, interfaceC1270560jAU, i, c1270520jAQ, str, 3));
        }
    }

    @Override // X.InterfaceC1267880j6A
    public final void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
        SafeHandlerThread safeHandlerThread = this.LLJILLL;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new ARunnableS31S0101000_20(i, this, 27));
        }
    }
}
