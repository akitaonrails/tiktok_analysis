package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0HHA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHA {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Intent LJ;
    public final Intent LJFF;
    public final int LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final C0HZ2 LJIIIZ;
    public final boolean LJIIJ;
    public final C0HHF LJIIJJI;

    public C0HHA(Context context, String str, String str2, String str3, Intent intent, int i, boolean z, boolean z2, C0HZ2 c0hz2, boolean z3, C0HHG c0hhg, int i2) {
        str2 = (i2 & 4) != 0 ? "" : str2;
        str3 = (i2 & 8) != 0 ? null : str3;
        intent = (i2 & 32) != 0 ? null : intent;
        i = (i2 & 64) != 0 ? 3 : i;
        z = (i2 & 128) != 0 ? true : z;
        z2 = (i2 & 256) != 0 ? false : z2;
        c0hz2 = (i2 & 512) != 0 ? C0HZ2.UNKNOWN : c0hz2;
        z3 = (i2 & 1024) != 0 ? false : z3;
        C0HHF c0hhf = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new C0HHF() { // from class: X.0HHH
        } : c0hhg;
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = null;
        this.LJFF = intent;
        this.LJI = i;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = c0hz2;
        this.LJIIJ = z3;
        this.LJIIJJI = c0hhf;
    }
}
