package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.assem.PcsFormContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734450vEh extends C09AY implements Function2<UIAssem, AbstractC1734470vEj, Unit> {
    public final /* synthetic */ PcsFormContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734450vEh(PcsFormContentAssem pcsFormContentAssem) {
        super(2);
        this.LL = pcsFormContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, AbstractC1734470vEj abstractC1734470vEj) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        AbstractC1734470vEj abstractC1734470vEj2 = abstractC1734470vEj;
        if (!Intrinsics.LJFF(abstractC1734470vEj2, C1734480vEk.LIZ) && !Intrinsics.LJFF(abstractC1734470vEj2, C1734490vEl.LIZ) && !Intrinsics.LJFF(abstractC1734470vEj2, C1734500vEm.LIZ)) {
            if (abstractC1734470vEj2 instanceof C1246050iWx) {
                ConstraintLayout constraintLayout = this.LL.LLJJIJI;
                if (constraintLayout != null) {
                    C500260Jjc.LJIILIIL(constraintLayout);
                }
                if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
                    if (!((C1246050iWx) abstractC1734470vEj2).LIZ) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                            AssemVMLazy assemVMLazy = this.LL.LLJJI;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsFormContentAssem.LLJJIJIL;
                            state2.LJIILL(((C1734460vEi) assemVMLazy.getValue().getState()).LL, null);
                        }
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                            C500260Jjc.LJIILLIIL(viewOnAttachStateChangeListenerC20604515jv2);
                        }
                    } else {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LL.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                            C500260Jjc.LLFFF(viewOnAttachStateChangeListenerC20604515jv3);
                        }
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LL.LLJJIII;
                    if (viewOnAttachStateChangeListenerC20604515jv4 != null && (state = viewOnAttachStateChangeListenerC20604515jv4.getState()) != null) {
                        AssemVMLazy assemVMLazy2 = this.LL.LLJJI;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = PcsFormContentAssem.LLJJIJIL;
                        state.LJIILL(((C1734460vEi) assemVMLazy2.getValue().getState()).LL, null);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LL.LLJJIII;
                    if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                        C500260Jjc.LLFFF(viewOnAttachStateChangeListenerC20604515jv5);
                    }
                }
            } else if (Intrinsics.LJFF(abstractC1734470vEj2, C1246060iWy.LIZ)) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LL.LLJJIII;
                if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                    C500260Jjc.LJIILIIL(viewOnAttachStateChangeListenerC20604515jv6);
                }
                ConstraintLayout constraintLayout2 = this.LL.LLJJIJI;
                if (constraintLayout2 != null) {
                    C500260Jjc.LLFFF(constraintLayout2);
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LL.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
                C500260Jjc.LJIILIIL(viewOnAttachStateChangeListenerC20604515jv7);
            }
            ConstraintLayout constraintLayout3 = this.LL.LLJJIJI;
            if (constraintLayout3 != null) {
                C500260Jjc.LJIILIIL(constraintLayout3);
            }
        }
        return Unit.LIZ;
    }
}
