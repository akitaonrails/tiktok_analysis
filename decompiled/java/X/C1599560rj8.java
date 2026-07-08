package X;

import androidx.lifecycle.MutableLiveData;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0rj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599560rj8 {
    public final MutableLiveData<HashSet<Integer>> LIZ;

    public C1599560rj8() {
        MutableLiveData<HashSet<Integer>> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        HashSet hashSet = new HashSet();
        hashSet.add(-1);
        C0DTR.LIZ(mutableLiveData, hashSet);
    }

    public final boolean LIZ(int i) {
        HashSet<Integer> value = this.LIZ.getValue();
        if (value == null || !value.contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(int i) {
        HashSet<Integer> hashSet;
        HashSet<Integer> value = this.LIZ.getValue();
        if (value != null && value.contains(Integer.valueOf(i))) {
            MutableLiveData<HashSet<Integer>> mutableLiveData = this.LIZ;
            HashSet<Integer> value2 = mutableLiveData.getValue();
            if (value2 != null) {
                hashSet = new HashSet<>(value2);
                hashSet.remove(Integer.valueOf(i));
            } else {
                hashSet = null;
            }
            mutableLiveData.postValue(hashSet);
        }
    }

    public final void LIZJ(int i) {
        HashSet<Integer> value = this.LIZ.getValue();
        if (value != null) {
            HashSet hashSet = new HashSet(value);
            if (i != -1) {
                if (i != 0) {
                    if (i != 2) {
                        if (i != 6) {
                            if (i == 7) {
                                if (hashSet.contains(6)) {
                                    hashSet.remove(6);
                                }
                                if (hashSet.contains(5)) {
                                    hashSet.remove(5);
                                }
                            }
                        } else if (hashSet.contains(7)) {
                            hashSet.remove(7);
                        }
                    } else if (hashSet.contains(0)) {
                        hashSet.remove(0);
                    }
                } else if (hashSet.contains(-1)) {
                    hashSet.remove(-1);
                }
            } else {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set state: ");
            sbLIZ.append(i);
            sbLIZ.append("- ");
            sbLIZ.append(hashSet);
            sbLIZ.append(' ');
            sbLIZ.append(C786410Ut5.u3());
            C1720106oR.LJI("Skylight_Lifecycle", C2188811AlT.LIZIZ(sbLIZ));
            C0DTR.LIZ(this.LIZ, hashSet);
        }
    }
}
