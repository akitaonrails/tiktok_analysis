package X;

import android.graphics.Rect;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JNE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JNE {
    public final Video LIZ;
    public final C0JIX LIZIZ;
    public final InterfaceC332260D0u<Float> LIZJ;
    public final InterfaceC332260D0u<Integer> LIZLLL;
    public final InterfaceC332260D0u<C0JNF> LJ;
    public final InterfaceC332260D0u<Boolean> LJFF;
    public final InterfaceC332260D0u<Boolean> LJI;
    public final InterfaceC332260D0u<Boolean> LJII;
    public final InterfaceC332260D0u<Boolean> LJIIIIZZ;
    public final InterfaceC332260D0u<Boolean> LJIIIZ;
    public final InterfaceC332260D0u<Integer> LJIIJ;
    public final C05YC<Float> LJIIJJI;
    public final C05YC<C0JSE> LJIIL;
    public final C05YC<Rect> LJIILIIL;
    public final C05YC<Unit> LJIILJJIL;
    public final C05YC<Unit> LJIILL;
    public final C05YC<Boolean> LJIILLIIL;

    public final String LIZ() {
        return this.LIZ.getPlayAddr().getSourceId();
    }

    public final int LIZIZ() {
        return this.LIZ.getDuration();
    }

    public C0JNE(Video video, C0JIX c0jix, C2252321DDq c2252321DDq, int i) {
        C2252321DDq c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3;
        C2252321DDq c2252321DDqLIZ4;
        C2252321DDq c2252321DDqLIZ5;
        C2252321DDq c2252321DDqLIZ6;
        C2252321DDq c2252321DDqLIZ7;
        C2252321DDq c2252321DDqLIZ8;
        C2252331DDr c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2;
        C2252331DDr c2252331DDrLIZIZ3;
        C2252331DDr c2252331DDrLIZIZ4;
        C2252331DDr c2252331DDrLIZIZ5;
        C2252321DDq c2252321DDqLIZ9 = c2252321DDq;
        C0JIX c0jix2 = c0jix;
        Video video2 = (i & 1) != 0 ? new Video() : video;
        c0jix2 = (i & 2) != 0 ? new C0JIX(null, null, 7) : c0jix2;
        if ((i & 4) != 0) {
            c2252321DDqLIZ = C1BNE.LIZ(Float.valueOf(0.0f));
        } else {
            c2252321DDqLIZ = null;
        }
        if ((i & 8) != 0) {
            c2252321DDqLIZ2 = C1BNE.LIZ(0);
        } else {
            c2252321DDqLIZ2 = null;
        }
        if ((i & 16) != 0) {
            c2252321DDqLIZ3 = C1BNE.LIZ(new C0JNF(false, false));
        } else {
            c2252321DDqLIZ3 = null;
        }
        if ((i & 32) != 0) {
            c2252321DDqLIZ4 = C1BNE.LIZ(Boolean.FALSE);
        } else {
            c2252321DDqLIZ4 = null;
        }
        if ((i & 64) != 0) {
            c2252321DDqLIZ5 = C1BNE.LIZ(Boolean.FALSE);
        } else {
            c2252321DDqLIZ5 = null;
        }
        if ((i & 128) != 0) {
            c2252321DDqLIZ6 = C1BNE.LIZ(Boolean.FALSE);
        } else {
            c2252321DDqLIZ6 = null;
        }
        if ((i & 256) != 0) {
            c2252321DDqLIZ7 = C1BNE.LIZ(Boolean.FALSE);
        } else {
            c2252321DDqLIZ7 = null;
        }
        if ((i & 512) != 0) {
            c2252321DDqLIZ8 = C1BNE.LIZ(Boolean.FALSE);
        } else {
            c2252321DDqLIZ8 = null;
        }
        c2252321DDqLIZ9 = (i & 1024) != 0 ? C1BNE.LIZ(1) : c2252321DDqLIZ9;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 6);
        } else {
            c2252331DDrLIZIZ = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 0, null, 6);
        } else {
            c2252331DDrLIZIZ2 = null;
        }
        if ((i & 8192) != 0) {
            c2252331DDrLIZIZ3 = C09IR.LIZIZ(1, 0, null, 6);
        } else {
            c2252331DDrLIZIZ3 = null;
        }
        if ((i & 16384) != 0) {
            c2252331DDrLIZIZ4 = C09IR.LIZIZ(0, 0, null, 6);
        } else {
            c2252331DDrLIZIZ4 = null;
        }
        if ((32768 & i) != 0) {
            c2252331DDrLIZIZ5 = C09IR.LIZIZ(0, 0, null, 6);
        } else {
            c2252331DDrLIZIZ5 = null;
        }
        C2252331DDr c2252331DDrLIZIZ6 = (i & 65536) != 0 ? C09IR.LIZIZ(0, 0, null, 6) : null;
        this.LIZ = video2;
        this.LIZIZ = c0jix2;
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = c2252321DDqLIZ2;
        this.LJ = c2252321DDqLIZ3;
        this.LJFF = c2252321DDqLIZ4;
        this.LJI = c2252321DDqLIZ5;
        this.LJII = c2252321DDqLIZ6;
        this.LJIIIIZZ = c2252321DDqLIZ7;
        this.LJIIIZ = c2252321DDqLIZ8;
        this.LJIIJ = c2252321DDqLIZ9;
        this.LJIIJJI = c2252331DDrLIZIZ;
        this.LJIIL = c2252331DDrLIZIZ2;
        this.LJIILIIL = c2252331DDrLIZIZ3;
        this.LJIILJJIL = c2252331DDrLIZIZ4;
        this.LJIILL = c2252331DDrLIZIZ5;
        this.LJIILLIIL = c2252331DDrLIZIZ6;
    }
}
