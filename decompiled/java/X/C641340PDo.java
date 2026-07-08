package X;

import Y.ARunnableS0S0202000_10;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641340PDo extends C09AY implements Function1<InboxSkylightListState, Unit> {
    public final /* synthetic */ SkylightListViewModel LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C641340PDo(SkylightListViewModel skylightListViewModel, List<? extends InterfaceC1891350zJl> list) {
        super(1);
        this.LL = skylightListViewModel;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InboxSkylightListState inboxSkylightListState) {
        C20600815jK<InterfaceC1891350zJl> state;
        int iNextIndex;
        C20600815jK<InterfaceC1891350zJl> state2;
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
            if (i != -1 && iNextIndex != -1) {
                int i2 = (iNextIndex - i) + 1;
                if (i2 >= 1) {
                    SkylightListViewModel skylightListViewModel = this.LL;
                    List<InterfaceC1891350zJl> list = this.LLILLJJLI;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = skylightListViewModel.LLJJIJI;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null && viewOnAttachStateChangeListenerC20604515jv2.isComputingLayout()) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("safeMutateListAlways: defer during layout, reason=");
                        sbLIZ.append("onActiveDataUpdate-partial");
                        sbLIZ.append(", vh=");
                        sbLIZ.append(skylightListViewModel.LLJILLL);
                        C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS0S0202000_10(i, i2, skylightListViewModel, list, 3));
                    } else {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = skylightListViewModel.LLJJIJI;
                        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                            C20600815jK.LJIILLIIL(state2, i, i2, list);
                        }
                    }
                }
            } else {
                C23250099c.LIZLLL(this.LL.getAssemVMScope(), null, null, new C641360PDq(this.LL, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
