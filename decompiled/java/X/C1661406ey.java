package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: renamed from: X.06ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1661406ey {
    public static final boolean LIZ(Fragment fragment, EnumC1660606eq enumC1660606eq) {
        if (fragment == null) {
            return enumC1660606eq.getDefaultEnable();
        }
        C1661306ex c1661306ex = (C1661306ex) new C1559260qg8(new AwS127S1200000_11(fragment, (Fragment) C1661306ex.class, (Class<Object>) null, (String) 14), true).getValue();
        if (c1661306ex != null) {
            return c1661306ex.LIZ(enumC1660606eq);
        }
        return enumC1660606eq.getDefaultEnable();
    }
}
