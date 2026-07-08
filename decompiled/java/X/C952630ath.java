package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ath, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952630ath {
    public static List LIZ(boolean z) {
        EnumC952640ati[] enumC952640atiArrValues = EnumC952640ati.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC952640ati enumC952640ati : enumC952640atiArrValues) {
            if (!EnumC952640ati.EXCLUDED_FROM_PANEL.contains(enumC952640ati) && (z || enumC952640ati != EnumC952640ati.DEFAULT)) {
                arrayList.add(enumC952640ati);
            }
        }
        return arrayList;
    }
}
