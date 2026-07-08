package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1AVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180521AVm {
    public static final Map<String, C1AV2> LIZIZ(View view, EnumC20441014ye enumC20441014ye) {
        C1AV2 c1av2;
        C1AV2 c1av22;
        C1AV2 c1av23;
        C1AV2 c1av24 = null;
        if (!C1AW1.LIZIZ()) {
            return null;
        }
        int i = C2180531AVn.LIZIZ[enumC20441014ye.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new C1954807lC();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object tag = view.getTag(R.id.emd);
        if (tag instanceof C1AV2) {
            c1av2 = (C1AV2) tag;
        } else {
            c1av2 = null;
        }
        Object tag2 = view.getTag(R.id.emg);
        if (tag2 instanceof C1AV2) {
            c1av22 = (C1AV2) tag2;
        } else {
            c1av22 = null;
        }
        Object tag3 = view.getTag(R.id.eme);
        if (tag3 instanceof C1AV2) {
            c1av23 = (C1AV2) tag3;
        } else {
            c1av23 = null;
        }
        Object tag4 = view.getTag(R.id.emf);
        if (tag4 instanceof C1AV2) {
            c1av24 = (C1AV2) tag4;
        }
        if (c1av2 != null) {
            linkedHashMap.put(c1av2.LIZ.getId(), c1av2);
        }
        if (c1av22 != null) {
            linkedHashMap.put(c1av22.LIZ.getId(), c1av22);
        }
        if (c1av23 != null) {
            linkedHashMap.put(c1av23.LIZ.getId(), c1av23);
        }
        if (c1av24 != null) {
            linkedHashMap.put(c1av24.LIZ.getId(), c1av24);
        }
        return linkedHashMap;
    }

    public static final void LIZ(View view, EnumC2180541AVo enumC2180541AVo, C1AV2 c1av2) {
        if (view == null || c1av2 == null || !C1AW1.LIZIZ() || C1E7D.LIZIZ()) {
            return;
        }
        try {
            if (!(view instanceof InterfaceC20343214is) && !(view instanceof TuxIconView)) {
                return;
            }
            if (enumC2180541AVo != null) {
                int i = C2180531AVn.LIZ[c1av2.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        throw new C1954807lC();
                    }
                } else {
                    c1av2 = C1AV2.LIZIZ(c1av2, enumC2180541AVo, c1av2.LJ, c1av2.LJI, 46);
                }
            }
            EnumC2180541AVo enumC2180541AVo2 = c1av2.LIZ;
            int i2 = C2180531AVn.LIZ[enumC2180541AVo2.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 == 5) {
                    ((AbstractC1604130rqV) C708120Rq6.LIZ.getValue()).LJII(AFwS224S0000000_33.get$arr$(673));
                    return;
                }
                throw new C1954807lC();
            }
            if (!c1av2.LIZLLL) {
                int tagKey = enumC2180541AVo2.getTagKey();
                c1av2.LIZJ = "?";
                view.setTag(tagKey, c1av2);
                return;
            }
            Object tag = view.getTag(enumC2180541AVo2.getTagKey());
            if (!(tag instanceof C1AV2) || ((C1AV2) tag) == null) {
                int tagKey2 = enumC2180541AVo2.getTagKey();
                c1av2.LIZJ = "?";
                view.setTag(tagKey2, c1av2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2180601AVu.LIZ.logException(th);
        }
    }

    public static final void LIZJ(View view, float f, C1AV2 c1av2) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (!C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            LIZ(view, enumC2180541AVo, c1av2);
        }
        C786410Ut5.T4(view, f);
    }

    public static final void LIZLLL(View view, int i, C1AV2 c1av2) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        if (!C2180571AVr.LIZIZ(enumC2180541AVo, Integer.valueOf(i))) {
            LIZ(view, enumC2180541AVo, c1av2);
        }
        C786410Ut5.LJLLLLLL(i, view);
    }
}
