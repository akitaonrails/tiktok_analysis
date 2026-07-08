package X;

import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.ECommerceLiveConfig;

/* JADX INFO: renamed from: X.17z2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21207817z2 {
    public static final boolean LIZ() {
        ECommerceLiveConfig eCommerceLiveConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            eCommerceLiveConfig = (ECommerceLiveConfig) SettingsManager.LJII("live_ecommerce_config", ECommerceLiveConfig.class);
            if (eCommerceLiveConfig == null) {
                eCommerceLiveConfig = new ECommerceLiveConfig();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2370109Ql.LIZ(e, "LiveECommerceConfig");
            eCommerceLiveConfig = new ECommerceLiveConfig();
        }
        return eCommerceLiveConfig.enabled;
    }

    public static final void LIZIZ(IFrameSlot.SlotViewModel slotViewModel, boolean z) {
        boolean z2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData = slotViewModel.LL;
        boolean z3 = true;
        if (z && LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
            z3 = false;
        }
        if (z3) {
            mutableLiveData.setValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        } else {
            mutableLiveData.postValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        }
    }

    public static final void LIZJ(IIconSlot.SlotViewModel slotViewModel, boolean z) {
        boolean z2;
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLILZ;
        if (z && LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            mutableLiveData.setValue(Boolean.valueOf(z2));
        } else {
            mutableLiveData.postValue(Boolean.valueOf(z2));
        }
    }
}
