package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGJ {
    public final Activity LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final C0ZGG LJI;
    public final C0ZGE LJII;
    public final C0ZG6 LJIIIIZZ;
    public final C0ZFV LJIIIZ;
    public final boolean LJIIJ;

    public C0ZGJ(Activity activity, String str, String str2, String str3, int i, String str4, C0ZGG c0zgg, C0ZGE c0zge, C0ZG6 c0zg6, C0ZFV c0zfv, boolean z, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        str3 = (i2 & 8) != 0 ? null : str3;
        i = (i2 & 16) != 0 ? -1 : i;
        c0zge = (i2 & 128) != 0 ? new C0ZGE() { // from class: X.0ZGK
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                return QuoteMode.None.INSTANCE;
            }
        } : c0zge;
        c0zg6 = (i2 & 256) != 0 ? new C0ZG6() { // from class: X.0ZG7
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                return C2097608Jq.LJ();
            }
        } : c0zg6;
        c0zfv = (i2 & 512) != 0 ? null : c0zfv;
        z = (i2 & 1024) != 0 ? false : z;
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = str4;
        this.LJI = c0zgg;
        this.LJII = c0zge;
        this.LJIIIIZZ = c0zg6;
        this.LJIIIZ = c0zfv;
        this.LJIIJ = z;
    }
}
