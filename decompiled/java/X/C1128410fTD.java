package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fTD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$cancelComboAnim$1$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
public final class C1128410fTD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1128710fTh LL;
    public final /* synthetic */ GiftPanelLeafViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128410fTD(C1128710fTh c1128710fTh, GiftPanelLeafViewModel giftPanelLeafViewModel, InterfaceC1364105Vn<? super C1128410fTD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1128710fTh;
        this.LLILLJJLI = giftPanelLeafViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1128410fTD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Object obj2;
        Object next;
        Integer numValueOf;
        Long lValueOf;
        AbstractC1126600fQI abstractC1126600fQI;
        C1C7U.LIZ("GiftPanelLeafV2@f893.cancelComboAnim$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = this.LL.LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            GiftPanelLeafViewModel giftPanelLeafViewModel = this.LLILLJJLI;
            C1128710fTh c1128710fTh = this.LL;
            giftPanelLeafViewModel.getClass();
            Iterator it2 = C13LP.LLIIL(value).iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                obj2 = null;
                if (c717610SCx.hasNext()) {
                    next = c717610SCx.next();
                    IndexedValue indexedValue = (IndexedValue) next;
                    AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) indexedValue.LIZIZ;
                    if (abstractC1126600fQI2 != null) {
                        lValueOf = Long.valueOf(abstractC1126600fQI2.LJI());
                    } else {
                        lValueOf = null;
                    }
                    if (Intrinsics.LJFF(lValueOf, giftPanelLeafViewModel.LLILZIL.getValue()) && (abstractC1126600fQI = (AbstractC1126600fQI) indexedValue.LIZIZ) != null && abstractC1126600fQI.LIZLLL) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IndexedValue indexedValue2 = (IndexedValue) next;
            if (indexedValue2 != null) {
                numValueOf = Integer.valueOf(indexedValue2.LIZ);
                obj2 = indexedValue2.LIZIZ;
            } else {
                numValueOf = null;
            }
            Pair pair = new Pair(numValueOf, obj2);
            Integer num = (Integer) pair.getFirst();
            Object second = pair.getSecond();
            if (num != null && second != null) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = value.get(num.intValue());
                if (abstractC1126600fQI3 != null) {
                    abstractC1126600fQI3.LIZJ = true;
                }
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = value.get(num.intValue());
                if (abstractC1126600fQI4 != null) {
                    abstractC1126600fQI4.LIZLLL = false;
                }
                C1127050fR1 c1127050fR1 = c1128710fTh.LLJJIJI;
                if (c1127050fR1 != null) {
                    c1127050fR1.LLLJ(num.intValue(), second, c1128710fTh.LLJJIII);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.cancelComboAnim$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
