package X;

import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;

/* JADX INFO: renamed from: X.0qye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570740qye {
    public static boolean LIZ(C19EG c19eg) {
        C0CXF.LIZ.getClass();
        if (C0CXF.LIZLLL()) {
            return false;
        }
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        Hox hoxLIZ = c446900Hfk.LIZ(c19eg);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
        hoxLIZ.TQ2(bundle, "HOME", false);
        Hox hoxLIZ2 = c446900Hfk.LIZ(c19eg);
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle2);
        hoxLIZ2.TQ2(bundle2, "For You", false);
        IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), IMFToolBarAbility.class, null);
        if (iMFToolBarAbility != null) {
            iMFToolBarAbility.j6();
            return true;
        }
        return true;
    }
}
