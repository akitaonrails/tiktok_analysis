package X;

import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$dismissNoticeWithId$1", f = "GroupChatNoticeViewModel.kt", l = {224}, m = "invokeSuspend")
public final class C067S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupChatNoticeViewModel LLILLJJLI;
    public final /* synthetic */ EnumC1596306Mv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067S(GroupChatNoticeViewModel groupChatNoticeViewModel, EnumC1596306Mv enumC1596306Mv, InterfaceC1364105Vn<? super C067S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatNoticeViewModel;
        this.LLILLL = enumC1596306Mv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C067S(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeViewModel@b908.dismissNoticeWithId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILLJJLI.LL;
            C067R c067r = new C067R(this.LLILLL, null);
            this.LL = 1;
            if (iChatNoticeFlowEngine.LIZ(true, "By id", c067r, this) == objLJFF) {
                C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.dismissNoticeWithId$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.dismissNoticeWithId$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
