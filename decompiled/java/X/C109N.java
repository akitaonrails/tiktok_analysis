package X;

import Y.AObserverS230S0100000_28;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.video.base.VideoPrivacySettingPageViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.109N, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C109N extends AbstractC191843103l {
    public final C191848103q LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 652));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 654));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 653));
    public boolean LLJ = true;

    public List<AbstractC191840103i> LJIILIIL(List<AbstractC191840103i> list) {
        return list;
    }

    public C11NZ<? extends BaseResponse> LJIILJJIL(int i) {
        return null;
    }

    public boolean LJIILL(boolean z) {
        return z;
    }

    public CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public boolean LJIJ(boolean z) {
        return z;
    }

    public int LJIJI() {
        return 0;
    }

    public abstract Integer LJIJJ();

    public abstract String LJIJJLI();

    public int LJJ() {
        return 0;
    }

    public final VideoPrivacySettingPageViewModel LJIL() {
        return (VideoPrivacySettingPageViewModel) this.LLILZLL.getValue();
    }

    public BaseSettingDataViewModel LJJI() {
        return (BaseSettingDataViewModel) this.LLIZLLLIL.getValue();
    }

    public final C191983108v LJJIFFI() {
        return (C191983108v) this.LLIZ.getValue();
    }

    @Override // X.AbstractC191843103l
    public void LJII() {
        LJJI().LLILLL.observe(this.LLILLJJLI.LIZJ, new AObserverS230S0100000_28(this, 56));
        LJJI().LLILZ.observe(this.LLILLJJLI.LIZJ, new AObserverS230S0100000_28(this, 57));
    }

    public final void LJJIIZI(int i) {
        C191960107y.LIZLLL(this.LLILLJJLI, i);
    }

    public final void LJJIJIIJI(Throwable th) {
        C632200Oqw c632200Oqw;
        String errorMsg;
        if ((th instanceof C632200Oqw) && (c632200Oqw = (C632200Oqw) th) != null && (errorMsg = c632200Oqw.getErrorMsg()) != null && errorMsg.length() != 0) {
            C191960107y.LJ(this.LLILLJJLI, errorMsg);
            return;
        }
        C191848103q c191848103q = this.LLILLJJLI;
        C191960107y.LIZ();
        C191960107y.LIZLLL(c191848103q, 2131835079);
    }

    public final void bu(String str) {
        C191960107y.LJ(this.LLILLJJLI, str);
    }

    public boolean LJJII(int i, View view) {
        if (!this.LLJ) {
            return true;
        }
        this.LLJ = false;
        HandlerHook.viewPostDelay(view, new ARunnableS119S0100000_19(this, 162), 500L);
        if (this.LLJ || Intrinsics.LJFF(LJJI().LLILZ.getValue(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public boolean LJJIII(int i, View view) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = LJIL().LLILLL.get(this.LLILZ);
        String str = null;
        if (privacySettingsRestrictionItem != null) {
            str = privacySettingsRestrictionItem.disabledToast;
        }
        if (C1207604ny.LIZ() && !TextUtils.isEmpty(str)) {
            if (str != null) {
                bu(str);
            }
            return true;
        }
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem2 = LJIL().LLILLL.get(this.LLILZ);
        if (privacySettingsRestrictionItem2 != null) {
            int i2 = privacySettingsRestrictionItem2.resType;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 1000) {
                            Integer numValueOf = Integer.valueOf(LJIJI());
                            if (numValueOf.intValue() > 0) {
                                C191960107y.LIZLLL(this.LLILLJJLI, numValueOf.intValue());
                            }
                            return true;
                        }
                    } else {
                        Integer numValueOf2 = Integer.valueOf(LJJ());
                        if (numValueOf2.intValue() > 0) {
                            C191960107y.LIZLLL(this.LLILLJJLI, numValueOf2.intValue());
                        }
                        return true;
                    }
                } else {
                    C191960107y.LIZ();
                    LJJIIZI(2131834393);
                    return true;
                }
            } else {
                C191960107y.LIZ();
                LJJIIZI(2131847649);
                return true;
            }
        }
        return false;
    }

    public void LJJIIJ(int i, View view) {
        LJJI().wQ2(i, LJIILJJIL(i), new C109Q(this), new C1215120hj4(this));
    }

    public final void LJJIJ(int i, String str) {
        if (C1207604ny.LIZ() && !TextUtils.isEmpty(str)) {
            if (str != null) {
                bu(str);
                return;
            }
            return;
        }
        LJJIIZI(i);
    }

    public void LJJIIJZLJL(int i, int i2, Throwable th) {
        LJJIJIIJI(th);
        LJJIFFI().LJFF(i2, this.LLILLJJLI.LIZLLL, th);
    }

    public void LJJIIZ(int i, int i2, BaseResponse baseResponse) {
        LJJIFFI().LJI(i2, this.LLILLJJLI.LIZLLL, baseResponse);
    }

    public C109N(C191848103q c191848103q, String str, String str2, String str3) {
        this.LLILLJJLI = c191848103q;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }
}
