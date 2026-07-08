package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0EQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364360EQg {
    public static int LIZ;
    public static int LIZIZ = 100;
    public static final MutableLiveData<Integer> LIZJ = new MutableLiveData<>();

    public static int LIZ() {
        int i = LIZ + 1;
        LIZ = i;
        int i2 = LIZIZ;
        if (i > i2) {
            int i3 = i2 + 50;
            LIZIZ = i3;
            LIZJ.setValue(Integer.valueOf(i3));
        }
        return LIZ;
    }
}
