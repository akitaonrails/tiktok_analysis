package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.051g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12854051g {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1067));

    public final Keva LIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final List<Long> LIZIZ() {
        String[] stringArray = LIZ().getStringArray("drama_mid_insert_show_times", null);
        if (stringArray == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        return arrayList;
    }

    public final void LIZJ(List<Long> list) {
        int size = ((ArrayList) list).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = String.valueOf(((Number) ListProtector.get(list, i)).longValue());
        }
        LIZ().storeStringArray("drama_mid_insert_show_times", strArr);
    }
}
