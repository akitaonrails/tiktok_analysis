package X;

import Y.AObserverS230S0100000_28;
import Y.ARunnableS114S0100000_14;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.108b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC191963108b extends AbstractC191843103l implements InterfaceC191831102z {
    public final String LLILLJJLI;
    public final Function2<Context, String, CharSequence> LLILLL;
    public final ViewModelStoreOwner LLILZ;
    public final LifecycleOwner LLILZIL;
    public final C878930Ydv LLILZLL;
    public final PrivacyUserSettingDataViewModel LLIZ;
    public boolean LLIZLLLIL;

    public List<AbstractC191840103i> LJIILIIL(List<AbstractC191840103i> list) {
        return list;
    }

    public C11NZ<? extends BaseResponse> LJIILJJIL(int i) {
        return null;
    }

    public boolean LJIILL(boolean z) {
        return z;
    }

    public Integer LJIILLIIL() {
        return null;
    }

    public CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public CharSequence LJIJ(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public boolean LJIJI(boolean z) {
        return z;
    }

    public final Integer LJIJJ() {
        return this.LLIZ.LLILLL.getValue();
    }

    public final PrivacySettingsRestrictionItem LJIJJLI() {
        if (this.LLILLJJLI.length() == 0) {
            return new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null);
        }
        C191880104w c191880104w = C191880104w.LIZ;
        String str = this.LLILLJJLI;
        c191880104w.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, str);
        return privacySettingsRestrictionItemLJIIJJI == null ? new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null) : privacySettingsRestrictionItemLJIIJJI;
    }

    @Override // X.AbstractC191843103l
    public void LJII() {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        C878930Ydv c878930Ydv = this.LLILZLL;
        c191879104vLIZIZ.getClass();
        ((CopyOnWriteArrayList) C191879104v.LIZIZ).add(c878930Ydv);
        this.LLIZ.LLILLL.observe(this.LLILZIL, new AObserverS230S0100000_28(this, 104));
        this.LLIZ.LLILZ.observe(this.LLILZIL, new AObserverS230S0100000_28(this, 105));
    }

    @Override // X.AbstractC191843103l
    public void LJIIIIZZ() {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        C878930Ydv c878930Ydv = this.LLILZLL;
        c191879104vLIZIZ.getClass();
        ((CopyOnWriteArrayList) C191879104v.LIZIZ).remove(c878930Ydv);
    }

    public CharSequence LIZJ(Context context, CharSequence charSequence) {
        String string;
        CharSequence charSequenceInvoke;
        if (LJIJJLI().tipsType == 1) {
            C191960107y.LIZ();
            string = context.getString(2131847649);
        } else {
            string = null;
        }
        Function2<Context, String, CharSequence> function2 = this.LLILLL;
        if (function2 != null && (charSequenceInvoke = function2.invoke(context, string)) != null) {
            return charSequenceInvoke;
        }
        return string;
    }

    public boolean LJIL(int i, View view) {
        if (!this.LLIZLLLIL) {
            return true;
        }
        this.LLIZLLLIL = false;
        HandlerHook.viewPostDelay(view, new ARunnableS114S0100000_14(this, 55), 500L);
        if (this.LLIZLLLIL || Intrinsics.LJFF(this.LLIZ.LLILZ.getValue(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public void LJJ(int i, View view) {
        if (!C191985108x.LIZIZ(LJIJJLI(), view)) {
            return;
        }
        C191985108x.LIZ(C856230XiP.LIZ(LJIJJLI(), Integer.valueOf(i)), view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Ydv] */
    public AbstractC191963108b(C191848103q c191848103q, String str, String str2, Function2<? super Context, ? super String, ? extends CharSequence> function2) {
        this.LLILLJJLI = str;
        this.LLILLL = function2;
        ViewModelStoreOwner viewModelStoreOwner = c191848103q.LIZIZ;
        this.LLILZ = viewModelStoreOwner;
        this.LLILZIL = c191848103q.LIZJ;
        this.LLILZLL = new InterfaceC989510brB<PrivacySettingsRestriction>() { // from class: X.0Ydv
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacySettingsRestriction privacySettingsRestriction) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C862040Xrm(this.LL, null), 2);
            }
        };
        this.LLIZ = AnonymousClass1093.LIZ(viewModelStoreOwner, str2);
        this.LLIZLLLIL = true;
    }
}
