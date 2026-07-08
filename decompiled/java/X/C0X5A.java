package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0X5A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5A {
    public static final C0X5A LIZ = new C0X5A();

    public static boolean LIZ(String str) {
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            return false;
        }
        C0X6I.LIZ.getClass();
        if (!C0X6I.LIZJ(str)) {
            return false;
        }
        C0X58.LIZ.getClass();
        if (!((Boolean) C0X58.LJ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str) {
        String strLIZ;
        if (!LIZ(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        C0X58.LIZ.getClass();
        if (((Boolean) C0X58.LJIILJJIL.getValue()).booleanValue() ? (strLIZ = C1942007j8.LIZ(uri)) == null : (strLIZ = uri.getHost()) == null) {
            strLIZ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(uri.getPath());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Iterator it2 = ((List) C0X58.LIZLLL.getValue()).iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(strLIZIZ, (String) it2.next(), false)) {
                return false;
            }
        }
        C0X58.LIZ.getClass();
        Iterator it3 = ((List) C0X58.LIZJ.getValue()).iterator();
        while (it3.hasNext()) {
            if (u.LJIIZILJ(strLIZ, (String) it3.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
