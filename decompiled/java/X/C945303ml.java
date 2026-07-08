package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.03ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C945303ml {
    public final String LIZ;
    public final String LIZIZ;
    public final C946403mw LIZJ;
    public final C946403mw LIZLLL;
    public final C946403mw LJ;
    public final C946403mw LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final InterfaceC944203ma LJIIJ;
    public final C945703mp LJIIJJI;
    public final int LJIIL;
    public final Object LJIILIIL;

    public C945303ml() {
        this(0);
    }

    public /* synthetic */ C945303ml(int i) {
        this("", "", new C946403mw(0, 0, 0, 127), new C946403mw(0, 0, 0, 127), new C946403mw(0, 0, 0, 127), new C946403mw(0, 0, 0, 127), true, true, 1, 1073741823, null, new C945703mp(0), 6, new Object());
    }

    public static C945303ml LIZ(C945303ml c945303ml, C946403mw c946403mw, C946403mw c946403mw2, C946403mw c946403mw3, InterfaceC944203ma interfaceC944203ma, C945703mp c945703mp, Object obj, int i) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        Object obj2 = obj;
        C945703mp c945703mp2 = c945703mp;
        InterfaceC944203ma interfaceC944203ma2 = interfaceC944203ma;
        C946403mw c946403mw4 = c946403mw3;
        C946403mw c946403mw5 = c946403mw2;
        C946403mw c946403mw6 = c946403mw;
        C946403mw c946403mw7 = null;
        if ((i & 1) != 0) {
            str = c945303ml.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c945303ml.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            c946403mw6 = c945303ml.LIZJ;
        }
        if ((i & 8) != 0) {
            c946403mw5 = c945303ml.LIZLLL;
        }
        if ((i & 16) != 0) {
            c946403mw7 = c945303ml.LJ;
        }
        if ((i & 32) != 0) {
            c946403mw4 = c945303ml.LJFF;
        }
        if ((i & 64) != 0) {
            z = c945303ml.LJI;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = c945303ml.LJII;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            i2 = c945303ml.LJIIIIZZ;
        } else {
            i2 = 0;
        }
        if ((i & 512) != 0) {
            i3 = c945303ml.LJIIIZ;
        } else {
            i3 = 0;
        }
        if ((i & 1024) != 0) {
            interfaceC944203ma2 = c945303ml.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c945703mp2 = c945303ml.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i4 = c945303ml.LJIIL;
        } else {
            i4 = 0;
        }
        if ((i & 8192) != 0) {
            obj2 = c945303ml.LJIILIIL;
        }
        c945303ml.getClass();
        return new C945303ml(str, str2, c946403mw6, c946403mw5, c946403mw7, c946403mw4, z, z2, i2, i3, interfaceC944203ma2, c945703mp2, i4, obj2);
    }

    public C945303ml(String str, String str2, C946403mw c946403mw, C946403mw c946403mw2, C946403mw c946403mw3, C946403mw c946403mw4, boolean z, boolean z2, int i, int i2, InterfaceC944203ma interfaceC944203ma, C945703mp c945703mp, int i3, Object obj) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c946403mw;
        this.LIZLLL = c946403mw2;
        this.LJ = c946403mw3;
        this.LJFF = c946403mw4;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = interfaceC944203ma;
        this.LJIIJJI = c945703mp;
        this.LJIIL = i3;
        this.LJIILIIL = obj;
    }
}
