package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963330bAx extends AbstractC960400b6E<C963150bAf> {
    public final FrameLayout LLILZ;
    public final LifecycleOwner LLILZIL;
    public C963150bAf LLILZLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZ;
    public SparkContext LLIZLLLIL;
    public final C987270bnZ LLJ;

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "CoHostInviteListLynxViewHolder";
    }

    public C963330bAx(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        super(frameLayout);
        this.LLILZ = frameLayout;
        this.LLILZIL = lifecycleOwner;
        this.LLJ = new C987270bnZ(this, 0);
    }

    @Override // X.AbstractC960400b6E
    public final void I5(List list, int i, Object obj) {
        String str;
        int iIntValue;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int iLIZ;
        Integer numLJIIJJI;
        C963150bAf c963150bAf = (C963150bAf) obj;
        C963150bAf c963150bAf2 = this.LLILZLL;
        if (c963150bAf2 != null) {
            str = c963150bAf2.LJFF;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, c963150bAf.LJFF)) {
            this.LLILZLL = c963150bAf;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c963150bAf.LJFF), "container_height");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 121;
            }
            int iLIZ2 = C439101nJ.LIZ(iIntValue);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(this.itemView.getContext(), c963150bAf.LJFF, this.LLILZIL, true, new AwS381S0200000_15(this, c963150bAf, 97));
                this.LLIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                this.LLILZ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, new FrameLayout.LayoutParams(-1, iLIZ2));
            } else {
                SparkContext sparkContext = this.LLIZLLLIL;
                if (sparkContext != null) {
                    sparkContext.initData = c963150bAf.LJI;
                }
                try {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(null, c963150bAf.LJFF, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                if (c963150bAf.LJII) {
                    iLIZ = 0;
                } else {
                    iLIZ = C439101nJ.LIZ(16);
                }
                C500260Jjc.LJLJL(iLIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (layoutParams2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getLayoutParams()) != null && layoutParams2.height == iLIZ2) {
                return;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getLayoutParams()) != null) {
                layoutParams.height = iLIZ2;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 == null) {
                return;
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.requestLayout();
        }
    }
}
