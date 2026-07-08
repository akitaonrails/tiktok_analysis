package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0OFL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0OFL {
    public final MutableLiveData<Integer> LL = new MutableLiveData<>(0);

    public abstract FavoriteTabItemV2 LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(MutableLiveData mutableLiveData) {
        if (((Integer) mutableLiveData.getValue()) != null) {
            mutableLiveData.setValue(Integer.valueOf(r0.intValue() - 1));
        }
    }

    public void LIZJ(Lifecycle.Event event) {
        int i = C2024207wO.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            EventBus.LIZLLL().LJJI(this);
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(MutableLiveData mutableLiveData, int i) {
        Integer num = (Integer) mutableLiveData.getValue();
        if (num != null) {
            mutableLiveData.setValue(Integer.valueOf(num.intValue() + i));
        }
    }
}
