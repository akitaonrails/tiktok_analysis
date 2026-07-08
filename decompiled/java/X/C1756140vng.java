package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService;

/* JADX INFO: renamed from: X.0vng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756140vng {
    public static final void LIZ(C21212117zj c21212117zj) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, Integer>> mutableLiveData;
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "shop_bag_list_clear_screen_mode_fix", true, true) || c21212117zj.LJJIJIL() > 0) && (slotViewModel = c21212117zj.LLJ) != null && (mutableLiveData = slotViewModel.LLJJL) != null) {
            mutableLiveData.postValue(Pair.create(Boolean.FALSE, Integer.valueOf(c21212117zj.LJJIJIL())));
        }
        LIZJ(c21212117zj, false);
    }

    public static final void LIZIZ(C21212117zj c21212117zj) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, Integer>> mutableLiveData;
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "shop_bag_list_clear_screen_mode_fix", true, true) || c21212117zj.LJJIJIL() > 0) && (slotViewModel = c21212117zj.LLJ) != null && (mutableLiveData = slotViewModel.LLJJL) != null) {
            mutableLiveData.postValue(Pair.create(Boolean.TRUE, Integer.valueOf(c21212117zj.LJJIJIL())));
        }
        LIZJ(c21212117zj, true);
    }

    public static final void LIZJ(C21212117zj c21212117zj, boolean z) {
        ILiveStreamAdaptService.LIZ.getClass();
        C04UA.LIZ().LIZ((int) (c21212117zj.LLIZLLLIL.getResources().getDisplayMetrics().heightPixels * 0.7f), "ttec_shopping_bag_list", z);
    }
}
