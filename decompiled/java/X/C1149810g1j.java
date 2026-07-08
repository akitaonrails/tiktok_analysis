package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0g1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149810g1j {
    public final String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public View LJII;
    public final boolean LJIIIIZZ;
    public final C1144330fst LJIIIZ;
    public final Integer LJIIJ;

    public C1149810g1j(String str, String str2, int i, int i2, int i3, boolean z, boolean z2, C1144330fst c1144330fst, Integer num, int i4) {
        boolean z3;
        str = (i4 & 1) != 0 ? "" : str;
        str2 = (i4 & 2) != 0 ? "" : str2;
        i = (i4 & 4) != 0 ? 0 : i;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        z = (i4 & 32) != 0 ? false : z;
        if ((i4 & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z2 = (i4 & 512) != 0 ? false : z2;
        c1144330fst = (i4 & 1024) != 0 ? null : c1144330fst;
        num = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = z3;
        this.LJII = null;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = c1144330fst;
        this.LJIIJ = num;
    }
}
