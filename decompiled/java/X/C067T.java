package X;

import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067T, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$refreshBannerByTemplateId$1", f = "GroupChatNoticeViewModel.kt", l = {200, 202}, m = "invokeSuspend")
public final class C067T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EnumC1596306Mv LLILLL;
    public final /* synthetic */ GroupChatNoticeViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067T(boolean z, EnumC1596306Mv enumC1596306Mv, GroupChatNoticeViewModel groupChatNoticeViewModel, InterfaceC1364105Vn<? super C067T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = enumC1596306Mv;
        this.LLILZ = groupChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C067T(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                if (this.LLILLL == EnumC1596306Mv.GROUP_SHARE_POST_BANNER && !this.LLILZ.LLILZLL) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1");
                    return unit;
                }
                IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILZ.LL;
                C06OO task = this.LLILLL.toTask();
                this.LL = 1;
                if (iChatNoticeFlowEngine.LJIILJJIL(task, this) == objLJFF) {
                    C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1");
                    return objLJFF;
                }
            } else {
                IChatNoticeFlowEngine iChatNoticeFlowEngine2 = this.LLILZ.LL;
                C067Q c067q = new C067Q(this.LLILLL, null);
                this.LL = 2;
                if (iChatNoticeFlowEngine2.LIZ(true, "Refresh", c067q, this) == objLJFF) {
                    C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
