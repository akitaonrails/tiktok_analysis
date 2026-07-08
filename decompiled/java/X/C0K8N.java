package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0K8N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K8N {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0K8N() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
    }

    public static C0K8N LIZ(C0K8N c0k8n, Function0 function0, Function0 function02) {
        boolean z = c0k8n.LIZ;
        String str = c0k8n.LIZIZ;
        String str2 = c0k8n.LIZJ;
        String str3 = c0k8n.LIZLLL;
        String str4 = c0k8n.LJ;
        String str5 = c0k8n.LJFF;
        String str6 = c0k8n.LJI;
        String str7 = c0k8n.LJII;
        c0k8n.getClass();
        return new C0K8N(z, str, str2, str3, str4, str5, str6, str7, function0, function02);
    }

    public C0K8N(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = function0;
        this.LJIIIZ = function02;
    }

    public /* synthetic */ C0K8N(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, C511770K5f c511770K5f, C511790K5h c511790K5h, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? AFwS193S0000000_7.get$arr$(226) : c511770K5f, (i & 512) != 0 ? AFwS193S0000000_7.get$arr$(227) : c511790K5h);
    }
}
