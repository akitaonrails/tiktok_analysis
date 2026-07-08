package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.pns.privacy.setting.dm.DMNotificationViewModel;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.108A, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C108A implements C107J {
    public final ViewModelStoreOwner LIZ;
    public final String LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 858));
    public final String LIZLLL = "direct_message_permission_inbox";
    public final C01GW LJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 857));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 856));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 859));

    @Override // X.C107J
    public MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LJI.getValue();
    }

    @Override // X.C107J
    public MutableLiveData<Integer> LIZJ() {
        return (MutableLiveData) this.LJFF.getValue();
    }

    @Override // X.C107J
    public MutableLiveData<Integer> LIZLLL() {
        return (MutableLiveData) this.LJ.getValue();
    }

    @Override // X.C107J
    public final void onShow() {
        ((LiveData) ((DMNotificationViewModel) this.LIZJ.getValue()).LL.getValue()).postValue(Boolean.TRUE);
    }

    public String LJFF() {
        return this.LIZLLL;
    }

    @Override // X.C107J
    public final void LIZIZ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/direct_message_notification");
        smartRouteBuildRoute.withParam("page_tag", LJFF());
        smartRouteBuildRoute.open();
    }

    @Override // X.C107J
    public final boolean LJ(int i) {
        Integer value;
        MutableLiveData<Integer> mutableLiveDataLIZJ;
        Integer value2;
        MutableLiveData<Integer> mutableLiveDataLIZLLL;
        Integer value3;
        MutableLiveData<Integer> mutableLiveDataLIZ;
        Integer value4;
        MutableLiveData<Integer> mutableLiveDataLIZLLL2;
        Integer value5;
        MutableLiveData<Integer> mutableLiveDataLIZ2;
        Integer value6;
        MutableLiveData<Integer> mutableLiveDataLIZJ2;
        String str = this.LIZIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -2099038552) {
            if (iHashCode != -1124815836) {
                if (iHashCode == -99623184 && str.equals("dm_setting_friends")) {
                    MutableLiveData<Integer> mutableLiveDataLIZLLL3 = LIZLLL();
                    if (mutableLiveDataLIZLLL3 != null) {
                        mutableLiveDataLIZLLL3.postValue(Integer.valueOf(i));
                    }
                    MutableLiveData<Integer> mutableLiveDataLIZJ3 = LIZJ();
                    if (mutableLiveDataLIZJ3 != null && (value6 = mutableLiveDataLIZJ3.getValue()) != null && value6.intValue() < i && (mutableLiveDataLIZJ2 = LIZJ()) != null) {
                        mutableLiveDataLIZJ2.postValue(Integer.valueOf(i));
                    }
                    MutableLiveData<Integer> mutableLiveDataLIZ3 = LIZ();
                    if (mutableLiveDataLIZ3 != null && (value5 = mutableLiveDataLIZ3.getValue()) != null && value5.intValue() < i && (mutableLiveDataLIZ2 = LIZ()) != null) {
                        mutableLiveDataLIZ2.postValue(Integer.valueOf(i));
                    }
                }
            } else if (str.equals("dm_setting_potential_connection")) {
                MutableLiveData<Integer> mutableLiveDataLIZJ4 = LIZJ();
                if (mutableLiveDataLIZJ4 != null) {
                    mutableLiveDataLIZJ4.postValue(Integer.valueOf(i));
                }
                MutableLiveData<Integer> mutableLiveDataLIZLLL4 = LIZLLL();
                if (mutableLiveDataLIZLLL4 != null && (value4 = mutableLiveDataLIZLLL4.getValue()) != null && value4.intValue() > i && (mutableLiveDataLIZLLL2 = LIZLLL()) != null) {
                    mutableLiveDataLIZLLL2.postValue(1);
                }
                MutableLiveData<Integer> mutableLiveDataLIZ4 = LIZ();
                if (mutableLiveDataLIZ4 != null && (value3 = mutableLiveDataLIZ4.getValue()) != null && value3.intValue() < i && (mutableLiveDataLIZ = LIZ()) != null) {
                    mutableLiveDataLIZ.postValue(Integer.valueOf(i));
                    return false;
                }
            }
        } else if (str.equals("dm_setting_others")) {
            MutableLiveData<Integer> mutableLiveDataLIZ5 = LIZ();
            if (mutableLiveDataLIZ5 != null) {
                mutableLiveDataLIZ5.postValue(Integer.valueOf(i));
            }
            MutableLiveData<Integer> mutableLiveDataLIZLLL5 = LIZLLL();
            if (mutableLiveDataLIZLLL5 != null && (value2 = mutableLiveDataLIZLLL5.getValue()) != null && value2.intValue() > i && (mutableLiveDataLIZLLL = LIZLLL()) != null) {
                mutableLiveDataLIZLLL.postValue(1);
            }
            MutableLiveData<Integer> mutableLiveDataLIZJ5 = LIZJ();
            if (mutableLiveDataLIZJ5 != null && (value = mutableLiveDataLIZJ5.getValue()) != null && value.intValue() > i && (mutableLiveDataLIZJ = LIZJ()) != null) {
                mutableLiveDataLIZJ.postValue(Integer.valueOf(i));
                return false;
            }
        }
        return false;
    }

    public C108A(ViewModelStoreOwner viewModelStoreOwner, String str) {
        this.LIZ = viewModelStoreOwner;
        this.LIZIZ = str;
    }
}
