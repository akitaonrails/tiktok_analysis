package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0N6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588630N6v {
    public static boolean LIZ(InterfaceC588620N6u interfaceC588620N6u) {
        Integer value;
        if (interfaceC588620N6u.LIZ() == null) {
            return true;
        }
        MutableLiveData<Integer> mutableLiveDataLIZ = interfaceC588620N6u.LIZ();
        if (mutableLiveDataLIZ != null && (value = mutableLiveDataLIZ.getValue()) != null && 1 == value.intValue()) {
            return true;
        }
        return false;
    }
}
