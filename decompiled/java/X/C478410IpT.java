package X;

import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478410IpT extends C09AY implements Function1<TabMGTopLive, Unit> {
    public final /* synthetic */ EnumC479370Ir1 LL;
    public final /* synthetic */ MultiTopLiveInteractModuleVM LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function1<TabMGTopLive, Unit> LLILZ;
    public final /* synthetic */ InterfaceC20236714Gf<List<MGModuleInteraction>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478410IpT(EnumC479370Ir1 enumC479370Ir1, MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVM, long j, Function1 function1, C2252611DEt c2252611DEt) {
        super(1);
        this.LL = enumC479370Ir1;
        this.LLILLJJLI = multiTopLiveInteractModuleVM;
        this.LLILLL = j;
        this.LLILZ = function1;
        this.LLILZIL = c2252611DEt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TabMGTopLive tabMGTopLive) {
        List<MGModuleInteraction> list;
        boolean z;
        TabMGTopLive tabMGTopLive2 = tabMGTopLive;
        if (tabMGTopLive2 != null && (list = tabMGTopLive2.interactionModule) != null) {
            List<MGModuleTab> list2 = tabMGTopLive2.tabModule;
            EnumC479370Ir1 enumC479370Ir1 = this.LL;
            if (enumC479370Ir1 == EnumC479370Ir1.TIMEOUT_AUTO_REFRESH) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLJJLI.vQ2(enumC479370Ir1, "TopModuleVM#requestTopModuleData", list, list2, z);
            if (EnumC479370Ir1.INIT == this.LL && this.LLILLL > 0) {
                C479670IrV c479670IrV = C479670IrV.LIZ;
                System.currentTimeMillis();
                c479670IrV.getClass();
            }
            Function1<TabMGTopLive, Unit> function1 = this.LLILZ;
            if (function1 != null) {
                function1.invoke(tabMGTopLive2);
            }
            InterfaceC20236714Gf<List<MGModuleInteraction>> interfaceC20236714Gf = this.LLILZIL;
            List<MGModuleInteraction> list3 = tabMGTopLive2.interactionModule;
            C189200o6.m2constructorimpl(list3);
            interfaceC20236714Gf.resumeWith(list3);
        }
        return Unit.LIZ;
    }
}
