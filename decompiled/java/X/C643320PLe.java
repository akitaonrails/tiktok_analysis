package X;

import Y.AComparatorS29S0000000_10;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultAnswerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultSendCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM$setup$1", f = "TakoProtoclManager.kt", l = {}, m = "invokeSuspend")
public final class C643320PLe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ TakoCardContainerSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C643320PLe(InterfaceC665370Q7z interfaceC665370Q7z, TakoCardContainerSharedVM takoCardContainerSharedVM, InterfaceC1364105Vn<? super C643320PLe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = takoCardContainerSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C643320PLe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLJLLLL;
        C1C7U.LIZ("TakoCardContainerSharedVM@2a11.setup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, ITakoCardProtocol.class, false);
        if (listLIZIZ != null) {
            TakoCardContainerSharedVM takoCardContainerSharedVM = this.LLILLJJLI;
            takoCardContainerSharedVM.LL.clear();
            ArrayList<ITakoCardProtocol<InterfaceC1858000yRy>> arrayList = takoCardContainerSharedVM.LL;
            if ((C0B1N.LIZ() & 1) == 1) {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS29S0000000_10(2), listLIZIZ);
            } else {
                listLJLLLL = listLIZIZ;
            }
            arrayList.addAll(listLJLLLL);
            C643340PLg.LIZ.getClass();
            C01GW c01gw = C643340PLg.LIZIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                System.currentTimeMillis();
                ((ArrayList) takoCardContainerSharedVM.LLILLL).clear();
                ((ArrayList) takoCardContainerSharedVM.LLILZ).clear();
                for (ITakoCardProtocol iTakoCardProtocol : (ArrayList) listLIZIZ) {
                    Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> clsT2 = iTakoCardProtocol.T2();
                    int iQO2 = iTakoCardProtocol.qO2();
                    if (iQO2 != 1) {
                        if (iQO2 != 2) {
                            ((ArrayList) takoCardContainerSharedVM.LLILLL).add(clsT2);
                        } else {
                            Iterator it2 = ((ArrayList) C0R3K.LIZ()).iterator();
                            while (it2.hasNext()) {
                                int iIntValue = ((Number) it2.next()).intValue();
                                ((ArrayList) takoCardContainerSharedVM.LLILZ).add(new C1723500ux2(iIntValue, clsT2));
                            }
                        }
                    } else {
                        C20039913b3.LIZ.getClass();
                        Iterator it3 = ((ArrayList) C20039913b3.LIZJ()).iterator();
                        while (it3.hasNext()) {
                            int iIntValue2 = ((Number) it3.next()).intValue();
                            ((ArrayList) takoCardContainerSharedVM.LLILZ).add(new C1723500ux2(iIntValue2, clsT2));
                        }
                    }
                }
                ((ArrayList) takoCardContainerSharedVM.LLILLL).add(TakoDefaultAnswerCell.class);
                ((ArrayList) takoCardContainerSharedVM.LLILLL).add(TakoDefaultSendCell.class);
            } else {
                ((Number) c01gw.getValue()).intValue();
            }
        }
        this.LLILLJJLI.LLILLJJLI.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoCardContainerSharedVM@2a11.setup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
