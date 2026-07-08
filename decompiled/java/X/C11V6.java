package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutObserver;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupServiceImpl;
import com.ss.android.ugc.aweme.capcutpromotion.PopupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11V6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11V6 extends C09AY implements Function1<C1397510mTF, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PopupInfo LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ CapcutPromotionPopupServiceImpl LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11V6(String str, PopupInfo popupInfo, C013C c013c, Activity activity, Function0<Unit> function0, CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl, Function0<Unit> function02) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = popupInfo;
        this.LLILLL = c013c;
        this.LLILZ = activity;
        this.LLILZIL = function0;
        this.LLILZLL = capcutPromotionPopupServiceImpl;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397510mTF c1397510mTF) {
        Lifecycle lifecycle;
        if (c1397510mTF.LLIZ == null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LL);
            c2344009Gk.LJIIIIZZ("enter_method", this.LLILLJJLI.logPb.enterMethod);
            c2344009Gk.LJIIIIZZ("enter_type", "click_blank");
            C20684815ws.LJIILLIIL("cctott_posting_campaign_popup_click", c2344009Gk.LIZ);
        }
        if (this.LLILLL.element) {
            LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.LLILZ);
            if (lifecycleOwnerLIZIZ != null && (lifecycle = lifecycleOwnerLIZIZ.getLifecycle()) != null) {
                CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl = this.LLILZLL;
                ((CapcutObserver) capcutPromotionPopupServiceImpl.LIZ.getValue()).LL = new AwS430S0200000_29((Function0) this.LLILZIL, (Function0<Unit>) capcutPromotionPopupServiceImpl, (CapcutPromotionPopupServiceImpl) 130);
                ((CapcutObserver) capcutPromotionPopupServiceImpl.LIZ.getValue()).LLILLJJLI = lifecycle;
                lifecycle.addObserver((CapcutObserver) capcutPromotionPopupServiceImpl.LIZ.getValue());
            }
        } else {
            this.LLILZIL.invoke();
            CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl2 = this.LLILZLL;
            if (capcutPromotionPopupServiceImpl2.LIZIZ) {
                C1483410ohn.LJLJJI().LJIILLIIL();
            }
            capcutPromotionPopupServiceImpl2.LIZIZ = false;
        }
        this.LLILZLL.LIZIZ = false;
        Function0<Unit> function0 = this.LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
