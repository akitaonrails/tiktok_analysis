package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopMainContentListAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820840xU2 extends C09AY implements Function2<UIAssem, AbstractC1623806Xk<? extends C1820630xTh>, Unit> {
    public final /* synthetic */ OneStopMainContentListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820840xU2(OneStopMainContentListAssem oneStopMainContentListAssem) {
        super(2);
        this.LL = oneStopMainContentListAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, AbstractC1623806Xk<? extends C1820630xTh> abstractC1623806Xk) {
        int iIntValue;
        boolean z;
        int i;
        C20600815jK<InterfaceC1891350zJl> state;
        UIAssem uIAssem2 = uIAssem;
        AbstractC1623806Xk<? extends C1820630xTh> abstractC1623806Xk2 = abstractC1623806Xk;
        if (abstractC1623806Xk2 instanceof C1623606Xi) {
            C500260Jjc.LLFFF(uIAssem2.LJJIJL());
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLJJIII;
            Integer numValueOf = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(((C1820630xTh) ((C1623606Xi) abstractC1623806Xk2).LIZ).LIZLLL, null);
            }
            OneStopMainContentListAssem oneStopMainContentListAssem = this.LL;
            List<InterfaceC1891350zJl> list = ((C1820630xTh) ((C1623606Xi) abstractC1623806Xk2).LIZ).LIZLLL;
            oneStopMainContentListAssem.getClass();
            int size = list.size();
            int iIntValue2 = 0;
            Integer numValueOf2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(list, i2);
                if (numValueOf == null && (interfaceC1891350zJl instanceof C1820390xTJ)) {
                    numValueOf = Integer.valueOf(i2);
                    C1820390xTJ c1820390xTJ = (C1820390xTJ) interfaceC1891350zJl;
                    if (c1820390xTJ.LL.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size2 = c1820390xTJ.LLILZIL.size();
                    if (z) {
                        i = 76;
                    } else {
                        i = 20;
                    }
                    for (int i3 = 0; i3 < size2; i3++) {
                        i += 30;
                    }
                    OneStopTitleAssem.LLJJIJI.getClass();
                    oneStopMainContentListAssem.LLJJIJIL = C1338790kwX.LIZ((i + 44) - OneStopTitleAssem.LLJJIJIL);
                }
                if (numValueOf2 == null && (interfaceC1891350zJl instanceof C1820920xUA)) {
                    numValueOf2 = Integer.valueOf(i2);
                }
            }
            if (numValueOf != null) {
                iIntValue2 = numValueOf.intValue();
            }
            oneStopMainContentListAssem.LLJJIJIIJIL = iIntValue2;
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = 99;
            }
            oneStopMainContentListAssem.LLJJJ = iIntValue;
        } else {
            C500260Jjc.LJIILIIL(uIAssem2.LJJIJL());
        }
        return Unit.LIZ;
    }
}
