package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684650QtL {
    public static final C684650QtL LIZ = new C684650QtL();

    public static void LIZ(WeakReference weakReference, String str, final InterfaceC684660QtM interfaceC684660QtM) {
        Object objM1boximpl;
        Object c098200Yq;
        String string;
        if (str != null && str.length() != 0) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                if (C1375500ltk.LJI(context)) {
                    try {
                        LIZ.getClass();
                        if (str == null || (string = UriProtector.parse(str).buildUpon().appendQueryParameter("x-tt-pns-dt-pass-id", "268959750").toString()) == null) {
                            string = "";
                        }
                        C1331660kl2.LJIIIZ(string).LJIILLIIL(new AbstractC2350809Ja() { // from class: X.0QtP
                            @Override // X.InterfaceC605070NoH
                            public final void LIZ(File file) {
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C684670QtN(file, interfaceC684660QtM, null), 3);
                            }

                            @Override // X.InterfaceC605070NoH
                            public final void onFailed(Throwable th) {
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C684680QtO(interfaceC684660QtM, th, null), 3);
                            }
                        });
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    objM1boximpl = C189200o6.m1boximpl(c098200Yq);
                } else {
                    interfaceC684660QtM.onFailure();
                    objM1boximpl = Unit.LIZ;
                }
                if (objM1boximpl != null) {
                    return;
                }
            }
            interfaceC684660QtM.onFailure();
            return;
        }
        interfaceC684660QtM.onFailure();
    }
}
