package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.EcLiveImageOptimizeSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19411510wz {
    public static final C19411510wz LIZ = new C19411510wz();

    public final C03IT LIZ(List<String> list, EnumC1769850w9n enumC1769850w9n) {
        if (list != null && list.isEmpty()) {
            return null;
        }
        return new C03IT(LIZJ(this, list, enumC1769850w9n));
    }

    public static void LIZIZ(C19411510wz c19411510wz, String str, EnumC1769850w9n enumC1769850w9n) {
        c19411510wz.getClass();
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
    }

    public static List LIZJ(C19411510wz c19411510wz, List list, EnumC1769850w9n enumC1769850w9n) {
        c19411510wz.getClass();
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
                arrayList.add(str);
            }
            return arrayList;
        }
        return null;
    }

    public final void LJ(EnumC1769850w9n enumC1769850w9n, SmartImageView smartImageView, String str) {
        if (smartImageView != null && str != null && str.length() != 0) {
            LIZIZ(this, str, enumC1769850w9n);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
    }

    public static String LIZLLL(String str, int i, int i2, EnumC1769850w9n enumC1769850w9n) {
        if (((EcLiveImageOptimizeSettings.EcLiveImageOptimizeSettingsConfig) EcLiveImageOptimizeSettings.LIZIZ.getValue()).sceneList.contains(enumC1769850w9n.getValue())) {
            C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
            return str;
        }
        return C1743690vTb.LJI(str, i, i2, enumC1769850w9n);
    }
}
