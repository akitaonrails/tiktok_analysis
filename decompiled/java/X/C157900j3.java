package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.00j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C157900j3 {
    public static final void LIZ(MutableLiveData<Integer> mutableLiveData) {
        int iIntValue;
        Integer value = mutableLiveData.getValue();
        if (value != null) {
            iIntValue = value.intValue() - 1;
        } else {
            iIntValue = 0;
        }
        mutableLiveData.postValue(Integer.valueOf(iIntValue));
    }
}
