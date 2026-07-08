package X;

import Y.AgS101S1100000_9;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.InboxBannerWidget$observerBannerItem$1", f = "InboxBannerWidget.kt", l = {182}, m = "invokeSuspend")
public final class C624470OeT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InboxBannerAssem LLILLL;
    public final /* synthetic */ InboxBannerWidget LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624470OeT(String str, InboxBannerAssem inboxBannerAssem, InboxBannerWidget inboxBannerWidget, InterfaceC1364105Vn<? super C624470OeT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = inboxBannerAssem;
        this.LLILZ = inboxBannerWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624470OeT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxBannerWidget@8875.observerBannerItem$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observerBannerItem, bannerName: ");
            sbLIZ.append(this.LLILLJJLI);
            C624370OeJ.LIZ("InboxBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
            C2252321DDq c2252321DDq = this.LLILLL.LL;
            AgS101S1100000_9 agS101S1100000_9 = new AgS101S1100000_9(this.LLILZ, this.LLILLJJLI, 5);
            this.LL = 1;
            if (c2252321DDq.collect(agS101S1100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("InboxBannerWidget@8875.observerBannerItem$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
