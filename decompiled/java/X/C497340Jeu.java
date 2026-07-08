package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0Jeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497340Jeu {
    public static void LIZ(Context context, String str, Integer num, boolean z, int i) {
        Object objLJIIIIZZ;
        Fragment fragment;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            Activity activityLJIJ = C520010KaN.LJIJ(context, z);
            if (activityLJIJ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLJIJ);
                c1389890mGx.LJIIJ(str);
                if (num != null) {
                    num.intValue();
                    c1389890mGx.LJFF(num.intValue());
                }
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
        if (context != null && (objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context)) != null && (fragment = (Fragment) objLJIIIIZZ) != null) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(fragment);
            c1389890mGx2.LJIIJ(str);
            if (num != null) {
                num.intValue();
                c1389890mGx2.LJFF(num.intValue());
            }
            c1389890mGx2.LJIIJJI();
            return;
        }
        Activity activityLJIJ2 = C520010KaN.LJIJ(context, z);
        if (activityLJIJ2 == null) {
            return;
        }
        C1389890mGx c1389890mGx3 = new C1389890mGx(activityLJIJ2);
        c1389890mGx3.LJIIJ(str);
        if (num != null) {
            num.intValue();
            c1389890mGx3.LJFF(num.intValue());
        }
        c1389890mGx3.LJIIJJI();
    }
}
