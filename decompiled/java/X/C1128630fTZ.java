package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128630fTZ {
    public User LIZ;
    public long LJII;
    public final MutableLiveData<Integer> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<C1128680fTe> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<C2284981EcC> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJ = new MutableLiveData<>();
    public final MutableLiveData<C1097050eed> LJFF = new MutableLiveData<>();
    public final MutableLiveData<Long> LJI = new MutableLiveData<>();
    public final MutableLiveData<EnumC1130940fXI> LJIIIIZZ = new MutableLiveData<>(EnumC1130940fXI.DEFAULT);

    public static int LIZ(int i, EnumC1130940fXI enumC1130940fXI) {
        if (i == 1) {
            int i2 = C1130950fXJ.LIZ[enumC1130940fXI.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return R.drawable.ev5;
                    }
                    throw new C1954807lC();
                }
                return R.drawable.ev4;
            }
            return R.drawable.ev3;
        }
        return 0;
    }
}
