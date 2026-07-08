package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0v0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725830v0n {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, final String str) {
        if (context == null) {
            return;
        }
        try {
            C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(context, str);
            c1292030jj7LJIIJJI.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0v0o
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loaded ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJ(strLIZIZ);
                }
            });
            c1292030jj7LJIIJJI.LIZ(new InterfaceC1292040jj8() { // from class: X.0v0m
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loaded failed ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZJ(strLIZIZ);
                }
            });
            C189200o6.m2constructorimpl(c1292030jj7LJIIJJI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
