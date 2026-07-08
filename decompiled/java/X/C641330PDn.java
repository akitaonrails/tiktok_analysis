package X;

import Y.ARunnableS0S0202000_10;
import Y.ARunnableS79S0200000_10;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641330PDn extends C09AY implements Function1<InboxSkylightListState, Unit> {
    public final /* synthetic */ SkylightListViewModel LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;
    public final /* synthetic */ List<C1598860ri0> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C641330PDn(SkylightListViewModel skylightListViewModel, List<? extends InterfaceC1891350zJl> list, List<C1598860ri0> list2) {
        super(1);
        this.LL = skylightListViewModel;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InboxSkylightListState inboxSkylightListState) {
        C20600815jK<InterfaceC1891350zJl> state;
        int iNextIndex;
        C20600815jK<InterfaceC1891350zJl> state2;
        C20600815jK<InterfaceC1891350zJl> state3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            ArrayList arrayList = (ArrayList) state.LJII();
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next() instanceof C1598860ri0) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous() instanceof C1598860ri0) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!(obj instanceof C1598860ri0)) {
                    arrayList2.add(obj);
                }
            }
            List<InterfaceC1891350zJl> list = this.LLILLJJLI;
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (!(interfaceC1891350zJl instanceof C1598860ri0)) {
                    arrayList3.add(interfaceC1891350zJl);
                }
            }
            if (i != -1 && iNextIndex != -1 && Intrinsics.LJFF(arrayList2, arrayList3)) {
                if (!this.LLILLL.isEmpty()) {
                    int i2 = (iNextIndex - i) + 1;
                    SkylightListViewModel skylightListViewModel = this.LL;
                    List<C1598860ri0> list2 = this.LLILLL;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = skylightListViewModel.LLJJIJI;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null && viewOnAttachStateChangeListenerC20604515jv2.isComputingLayout()) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("safeMutateListAlways: defer during layout, reason=");
                        sbLIZ.append("activeStatus-inplace");
                        sbLIZ.append(", vh=");
                        sbLIZ.append(skylightListViewModel.LLJILLL);
                        C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS0S0202000_10(i, i2, skylightListViewModel, list2, 4));
                    } else {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = skylightListViewModel.LLJJIJI;
                        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state3 = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                            C20600815jK.LJIILLIIL(state3, i, i2, list2);
                        }
                    }
                }
            } else {
                SkylightListViewModel skylightListViewModel2 = this.LL;
                List<InterfaceC1891350zJl> list3 = this.LLILLJJLI;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = skylightListViewModel2.LLJJIJI;
                if (viewOnAttachStateChangeListenerC20604515jv4 != null && viewOnAttachStateChangeListenerC20604515jv4.isComputingLayout()) {
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("safeMutateListAlways: defer during layout, reason=");
                    sbLIZ2.append("activeStatus-inplace-fallbackWhole");
                    sbLIZ2.append(", vh=");
                    sbLIZ2.append(skylightListViewModel2.LLJILLL);
                    C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv4, new ARunnableS79S0200000_10(skylightListViewModel2, list3, 90));
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = skylightListViewModel2.LLJJIJI;
                    if (viewOnAttachStateChangeListenerC20604515jv5 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv5.getState()) != null) {
                        state2.LJIILL(list3, null);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
