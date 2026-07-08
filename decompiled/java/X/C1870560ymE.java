package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import java.util.Map;

/* JADX INFO: renamed from: X.0ymE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1870560ymE extends AbstractC1871500ynk {
    public final IHostPermissionDepend LJI() {
        IHostPermissionDepend iHostPermissionDepend;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (iHostPermissionDepend = c1871520ynm.LJIIIZ) != null) {
            return iHostPermissionDepend;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        if (c1871520ynm2 != null) {
            return c1871520ynm2.LJIIIZ;
        }
        return null;
    }

    public static void LJII(Context context, String str, EnumC744320THq enumC744320THq, final int i, final int i2, final Map map, final InterfaceC1870510ym9 interfaceC1870510ym9) {
        boolean z;
        if (enumC744320THq == EnumC744320THq.image) {
            z = true;
        } else {
            z = false;
        }
        final Uri uriLIZIZ = C09NB.LIZIZ(context, str, "image/jpeg", Boolean.valueOf(z));
        C786410Ut5.LJJZZIII(C1870470ym5.LIZ(), new Runnable() { // from class: X.0ym8
            public final void LIZ() {
                InterfaceC1870510ym9 interfaceC1870510ym92 = interfaceC1870510ym9;
                C1870520ymA c1870520ymA = new C1870520ymA();
                int i3 = i;
                int i4 = i2;
                Map<String, String> map2 = map;
                Uri uri = uriLIZIZ;
                c1870520ymA.LIZ = Integer.valueOf(i3);
                c1870520ymA.LIZIZ = Integer.valueOf(i4);
                c1870520ymA.LIZJ = map2;
                c1870520ymA.LIZLLL = uri.toString();
                interfaceC1870510ym92.LIZ(c1870520ymA, "");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("XDownloadFileMethod@53bf.handleAndCallbackSuccess$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("XDownloadFileMethod@53bf.handleAndCallbackSuccess$1");
            }
        });
    }
}
