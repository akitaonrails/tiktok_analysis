package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2;
import com.ss.android.ugc.aweme.hangout.component.tab.MultiTopLivePlayTabVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.LiveTabMG;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2$refreshTopModuleDataBySkylightAPI$1$onSuccess$1$1", f = "MultiTopLivePlayFeedAssemV2.kt", l = {}, m = "invokeSuspend")
public final class C478380IpQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<MGModuleInteraction> LL;
    public final /* synthetic */ MultiTopLivePlayFeedAssemV2 LLILLJJLI;
    public final /* synthetic */ LiveTabMG LLILLL;
    public final /* synthetic */ List<MGModuleTab> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478380IpQ(List<MGModuleInteraction> list, MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV2, LiveTabMG liveTabMG, List<MGModuleTab> list2, InterfaceC1364105Vn<? super C478380IpQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = multiTopLivePlayFeedAssemV2;
        this.LLILLL = liveTabMG;
        this.LLILZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478380IpQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<MGModuleInteraction> list = this.LL;
        if (list != null && !list.isEmpty()) {
            MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV2 = this.LLILLJJLI;
            List<MGModuleInteraction> list2 = this.LL;
            if (list2 == null) {
                multiTopLivePlayFeedAssemV2.getClass();
            } else {
                AssemVMLazy assemVMLazy = multiTopLivePlayFeedAssemV2.LLJILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MultiTopLivePlayFeedAssemV2.LLLIIII;
                MultiTopLiveInteractModuleVM.wQ2((MultiTopLiveInteractModuleVM) assemVMLazy.getValue(), list2, null, EnumC479370Ir1.USER_REFRESH, "LiveCardAssem#notifyRefreshInteractionModule", 18);
            }
            C478920IqI c478920IqI = C478920IqI.LIZ;
            TabMGTopLive tabMGTopLive = this.LLILLL.topLive;
            c478920IqI.getClass();
            C478920IqI.LIZIZ(tabMGTopLive, "manualRefreshPage");
        }
        List<MGModuleTab> list3 = this.LLILZ;
        if (list3 != null && !list3.isEmpty()) {
            MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV22 = this.LLILLJJLI;
            List<MGModuleTab> list4 = this.LLILZ;
            if (list4 == null) {
                multiTopLivePlayFeedAssemV22.getClass();
            } else {
                AssemVMLazy assemVMLazy2 = multiTopLivePlayFeedAssemV22.LLJJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = MultiTopLivePlayFeedAssemV2.LLLIIII;
                ((MultiTopLivePlayTabVM) assemVMLazy2.getValue()).vQ2(list4, EnumC479370Ir1.USER_REFRESH);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
