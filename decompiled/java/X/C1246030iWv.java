package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.assem.PcsFormFooterAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246030iWv extends C09AY implements Function2<UIAssem, AbstractC1734470vEj, Unit> {
    public final /* synthetic */ PcsFormFooterAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246030iWv(PcsFormFooterAssem pcsFormFooterAssem) {
        super(2);
        this.LL = pcsFormFooterAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, AbstractC1734470vEj abstractC1734470vEj) {
        UIAssem uIAssem2 = uIAssem;
        AbstractC1734470vEj abstractC1734470vEj2 = abstractC1734470vEj;
        if (abstractC1734470vEj2 instanceof C1246050iWx) {
            if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled() && !((C1246050iWx) abstractC1734470vEj2).LIZ) {
                C500260Jjc.LJIILLIIL(uIAssem2.LJJIJL());
            } else {
                C500260Jjc.LLFFF(uIAssem2.LJJIJL());
                C16FS c16fs = this.LL.LLJJIII;
                if (c16fs != null) {
                    c16fs.setText("Submit");
                }
                final PcsFormFooterAssem pcsFormFooterAssem = this.LL;
                C16FS c16fs2 = pcsFormFooterAssem.LLJJIII;
                if (c16fs2 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0hnV
                        {
                            super(300L);
                        }

                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view) {
                            if (view != null) {
                                AssemVMLazy assemVMLazy = pcsFormFooterAssem.LLJJI;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsFormFooterAssem.LLJJIJI;
                                PcsFormVm pcsFormVm = (PcsFormVm) assemVMLazy.getValue();
                                pcsFormVm.withState(new C1734690vF5(pcsFormVm));
                            }
                        }
                    }, c16fs2);
                }
            }
        } else if (Intrinsics.LJFF(abstractC1734470vEj2, C1246060iWy.LIZ)) {
            C500260Jjc.LLFFF(uIAssem2.LJJIJL());
            C16FS c16fs3 = this.LL.LLJJIII;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJI(2131856190));
            }
            final PcsFormFooterAssem pcsFormFooterAssem2 = this.LL;
            C16FS c16fs4 = pcsFormFooterAssem2.LLJJIII;
            if (c16fs4 != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0hnW
                    {
                        super(300L);
                    }

                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view) {
                        if (view != null) {
                            AssemVMLazy assemVMLazy = pcsFormFooterAssem2.LLJJI;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsFormFooterAssem.LLJJIJI;
                            PcsFormVm pcsFormVm = (PcsFormVm) assemVMLazy.getValue();
                            pcsFormVm.withState(new C1734610vEx(pcsFormVm));
                        }
                    }
                }, c16fs4);
            }
        } else {
            C500260Jjc.LJIILIIL(uIAssem2.LJJIJL());
        }
        return Unit.LIZ;
    }
}
