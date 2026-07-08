package X;

import android.app.Activity;
import android.app.Dialog;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupServiceImpl;
import com.ss.android.ugc.aweme.capcutpromotion.PopupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS31S1400000_29;

/* JADX INFO: renamed from: X.11V8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11V8 extends C09AY implements InterfaceC1631620sYq<C20656615sK, PopupInfo, Function0<? extends Unit>, Dialog> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ CapcutPromotionPopupServiceImpl LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11V8(Activity activity, String str, Activity activity2, CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl) {
        super(3);
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = activity2;
        this.LLILZ = capcutPromotionPopupServiceImpl;
    }

    @Override // X.InterfaceC1631620sYq
    public final Dialog invoke(C20656615sK c20656615sK, PopupInfo popupInfo, Function0<? extends Unit> function0) {
        Lifecycle.State currentState;
        Lifecycle lifecycle;
        C20656615sK c20656615sK2 = c20656615sK;
        PopupInfo popupInfo2 = popupInfo;
        Function0<? extends Unit> function02 = function0;
        String str = popupInfo2.logPb.enterMethod;
        C013C c013c = new C013C();
        String str2 = popupInfo2.title;
        String str3 = popupInfo2.subTitle;
        AwS31S1400000_29 awS31S1400000_29 = new AwS31S1400000_29(popupInfo2, (PopupInfo) this.LLILLJJLI, (String) this.LL, (Activity) c013c, (C013C) function02, (Function0<Unit>) 1);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJI(str2);
        c1397580mTM.LIZIZ(str3);
        C1238130iKB.LIZ(c1397580mTM, awS31S1400000_29);
        c1397580mTM.LIZLLL(new C11V6(this.LLILLJJLI, popupInfo2, c013c, this.LLILLL, function02, this.LLILZ, this.LLILZIL));
        final CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl = this.LLILZ;
        c1397580mTM.LJI = new InterfaceC1196790hFV() { // from class: X.0MxW
            @Override // X.InterfaceC1196790hFV
            public final void onWindowFocusChanged(boolean z) {
                if (z) {
                    CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl2 = capcutPromotionPopupServiceImpl;
                    capcutPromotionPopupServiceImpl2.getClass();
                    if (C1483410ohn.LJLJJI().isPlaying()) {
                        C1483410ohn.LJLJJI().LIZ();
                        capcutPromotionPopupServiceImpl2.LIZIZ = true;
                    } else {
                        C2487409ou.LIZLLL(1000L, (Runnable) capcutPromotionPopupServiceImpl2.LIZJ.getValue());
                    }
                }
            }
        };
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.LL);
        if (lifecycleOwnerLIZIZ != null && (lifecycle = lifecycleOwnerLIZIZ.getLifecycle()) != null) {
            currentState = lifecycle.getCurrentState();
        } else {
            currentState = null;
        }
        if (currentState == Lifecycle.State.RESUMED) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str4 = this.LLILLJJLI;
            if (str4 == null) {
                str4 = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str4);
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_method", str);
            C20684815ws.LJIILLIIL("cctott_posting_campaign_popup_show", c2344009Gk.LIZ);
            return c1397510mTF.LJ();
        }
        C11V5.LIZ("activity not resumed");
        c20656615sK2.LIZ();
        return null;
    }
}
