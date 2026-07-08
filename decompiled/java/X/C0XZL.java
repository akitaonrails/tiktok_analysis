package X;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0XZL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZL {
    public static final List<Integer> LIZ;
    public static final List<Integer> LIZIZ;

    static {
        EnumC1237820iJg[] enumC1237820iJgArrValues = EnumC1237820iJg.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC1237820iJg enumC1237820iJg : enumC1237820iJgArrValues) {
            if (enumC1237820iJg.getValue() != 0) {
                arrayList.add(enumC1237820iJg);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((EnumC1237820iJg) it2.next()).getValue()));
        }
        LIZ = arrayList2;
        EnumC1237810iJf[] enumC1237810iJfArrValues = EnumC1237810iJf.values();
        ArrayList arrayList3 = new ArrayList();
        for (EnumC1237810iJf enumC1237810iJf : enumC1237810iJfArrValues) {
            if (enumC1237810iJf.getValue() != 0) {
                arrayList3.add(enumC1237810iJf);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((EnumC1237810iJf) it3.next()).getValue()));
        }
        LIZIZ = arrayList4;
    }

    public static final int LIZ(C0XYD c0xyd) {
        int i;
        int value = EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_UNKNOWN.getValue();
        Bundle extras = c0xyd.getExtras();
        if (extras != null) {
            i = extras.getInt("email_source", value);
        } else {
            i = value;
        }
        if (i == value) {
            LIZJ("email", c0xyd);
        } else {
            if (!((ArrayList) LIZIZ).contains(Integer.valueOf(i))) {
                LIZJ("email", c0xyd);
                return i;
            }
        }
        return i;
    }

    public static final int LIZIZ(C0XYD c0xyd) {
        int i;
        int value = EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_UNKNOWN.getValue();
        Bundle extras = c0xyd.getExtras();
        if (extras != null) {
            i = extras.getInt("phone_number_source", value);
        } else {
            i = value;
        }
        if (i == value) {
            LIZJ("phone_number", c0xyd);
        } else {
            if (!((ArrayList) LIZ).contains(Integer.valueOf(i))) {
                LIZJ("phone_number", c0xyd);
                return i;
            }
        }
        return i;
    }

    public static final void LIZJ(String str, C0XYD c0xyd) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", str);
        c2241008qG.LIZ.put("stack_trace", Log.getStackTraceString(new Exception()));
        c2241008qG.LIZ.put("enter_from", c0xyd.getMobParams().LJJLIIIJJI());
        c2241008qG.LIZ.put("enter_method", c0xyd.getMobParams().LLIIJI());
        c2241008qG.LJ();
    }
}
