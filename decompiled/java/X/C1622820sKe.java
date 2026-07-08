package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0sKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622820sKe {
    public static C1625460sOu LIZ(EnumC1448980noG enumC1448980noG, Bundle bundle, int i) {
        boolean z;
        Bundle bundle2 = bundle;
        EnumC1448980noG enumC1448980noG2 = enumC1448980noG;
        if ((i & 1) != 0) {
            enumC1448980noG2 = EnumC1448980noG.MANUAL_SET;
        }
        if ((i & 2) != 0) {
            bundle2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        return new C1625460sOu(-1, bundle2, enumC1448980noG2, null, z);
    }

    public static C1625440sOs LIZIZ(Effect effect, int i, EnumC1448980noG enumC1448980noG, List list, Bundle bundle, InterfaceC1625550sP3 interfaceC1625550sP3, InterfaceC1625560sP4 interfaceC1625560sP4, int i2, boolean z, C1625920sPe c1625920sPe, String str, int i3) {
        boolean z2 = z;
        InterfaceC1625560sP4 interfaceC1625560sP42 = interfaceC1625560sP4;
        EnumC1448980noG enumC1448980noG2 = enumC1448980noG;
        Bundle bundle2 = bundle;
        int i4 = i2;
        List list2 = list;
        InterfaceC1625550sP3 interfaceC1625550sP32 = interfaceC1625550sP3;
        String str2 = str;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = -1;
        }
        if ((i3 & 2) != 0) {
            enumC1448980noG2 = EnumC1448980noG.UI_CLICK;
        }
        if ((i3 & 4) != 0) {
            list2 = C13BV.INSTANCE;
        }
        C1625920sPe c1625920sPe2 = null;
        if ((i3 & 8) != 0) {
            bundle2 = null;
        }
        if ((i3 & 16) != 0) {
            interfaceC1625550sP32 = null;
        }
        if ((i3 & 32) != 0) {
            interfaceC1625560sP42 = null;
        }
        if ((i3 & 64) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        if ((i3 & 128) != 0) {
            z2 = true;
        }
        if ((i3 & 256) == 0) {
            c1625920sPe2 = c1625920sPe;
        }
        if ((i3 & 512) != 0) {
            str2 = "";
        }
        return new C1625440sOs(effect, i5, enumC1448980noG2, list2, bundle2, interfaceC1625550sP32, interfaceC1625560sP42, i4, z2, c1625920sPe2, str2);
    }
}
