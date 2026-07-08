package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0SMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720110SMn {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String[] LJ;
    public final String LJFF;
    public final boolean LJI;
    public final Float LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C720110SMn(String str, String str2, String str3, boolean z, Float f, boolean z2, boolean z3, int i) {
        String str4;
        boolean z4 = z2;
        Float f2 = (i & 128) != 0 ? null : f;
        z4 = (i & 1024) != 0 ? false : z4;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        this(str, false, str2, str3, null, null, z, f2, false, false, z4, str4);
    }

    public C720110SMn(String str, boolean z, String str2, String str3, String[] strArr, String str4, boolean z2, Float f, boolean z3, boolean z4, boolean z5, String str5) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = strArr;
        this.LJFF = str4;
        this.LJI = z2;
        this.LJII = f;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        this.LJIIJ = z5;
        this.LJIIJJI = str5;
    }
}
