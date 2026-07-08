package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453820Hqu {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(Context context, final String str, C453810Hqt c453810Hqt) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c453810Hqt));
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJIJL(context);
        c1331670kl3LJIIIZ.LIZLLL("StoryMixStudioButtonComponent");
        c1331670kl3LJIIIZ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0Hqv
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                InterfaceC1364105Vn<Pair<String, String>> interfaceC1364105Vn = c23260099m;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Download image is cancelled: ");
                sbLIZ.append(str);
                C098200Yq c098200Yq = new C098200Yq(new C453870Hqz(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                if (file == null) {
                    InterfaceC1364105Vn<Pair<String, String>> interfaceC1364105Vn = c23260099m;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Download image is null: ");
                    sbLIZ.append(str);
                    C098200Yq c098200Yq = new C098200Yq(new C453870Hqz(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                    return;
                }
                InterfaceC1364105Vn<Pair<String, String>> interfaceC1364105Vn2 = c23260099m;
                Pair pair = new Pair(Uri.fromFile(file).toString(), file.getAbsolutePath());
                C189200o6.m2constructorimpl(pair);
                interfaceC1364105Vn2.resumeWith(pair);
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String message;
                InterfaceC1364105Vn<Pair<String, String>> interfaceC1364105Vn = c23260099m;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Download image failed: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C098200Yq c098200Yq = new C098200Yq(new C453870Hqz(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c453810Hqt);
        }
        return objLIZ;
    }
}
