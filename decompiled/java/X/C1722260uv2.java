package X;

import java.io.File;

/* JADX INFO: renamed from: X.0uv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722260uv2 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(final int i, final String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("image download start, img url");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C1729270v6L.LIZ("download_effect_resource", C2188811AlT.LIZIZ(sbLIZ), null, null, null, null, "", i, 0, 0, 828);
        C1331660kl2.LJIIIZ(str).LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0uv4
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("image download fail: cancel, img url");
                sbLIZ2.append(str);
                sbLIZ2.append(' ');
                C1729270v6L.LIZ("download_effect_resource_fail", C2188811AlT.LIZIZ(sbLIZ2), null, null, null, null, "", i, 0, 0, 828);
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                if (file != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("image download onCompleted, img url");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", duration:");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C1729270v6L.LIZ("download_effect_resource_success", C2188811AlT.LIZIZ(sbLIZ2), null, null, null, null, "", i, 0, 0, 828);
                    InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                    String absolutePath = file.getAbsolutePath();
                    C189200o6.m2constructorimpl(absolutePath);
                    interfaceC1364105Vn2.resumeWith(absolutePath);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("image download fail: file is null, img url");
                sbLIZ3.append(str);
                sbLIZ3.append(' ');
                C1729270v6L.LIZ("download_effect_resource_fail", C2188811AlT.LIZIZ(sbLIZ3), null, null, null, null, "", i, 0, 0, 828);
                InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                C189200o6.m2constructorimpl("");
                interfaceC1364105Vn3.resumeWith("");
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("image download fail: throwable");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ2.append(message);
                sbLIZ2.append(", img url");
                sbLIZ2.append(str);
                sbLIZ2.append(' ');
                C1729270v6L.LIZ("download_effect_resource_fail", C2188811AlT.LIZIZ(sbLIZ2), null, null, null, null, "", i, 0, 0, 828);
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl("");
                interfaceC1364105Vn2.resumeWith("");
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
