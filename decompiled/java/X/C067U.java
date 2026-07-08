package X;

import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$addLocalTaskSyncedWithRemote$1", f = "GroupChatNoticeViewModel.kt", l = {131}, m = "invokeSuspend")
public final class C067U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> LLILLJJLI;
    public final /* synthetic */ GroupChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C067U(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, GroupChatNoticeViewModel groupChatNoticeViewModel, InterfaceC1364105Vn<? super C067U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = groupChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C067U(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeViewModel@b908.addLocalTaskSyncedWithRemote$1");
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
            Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> function2 = this.LLILLJJLI;
            C06OO task = EnumC1596306Mv.GROUP_SHARE_POST_BANNER.toTask();
            this.LL = 1;
            if (function2.invoke(task, this) == objLJFF) {
                C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.addLocalTaskSyncedWithRemote$1");
                return objLJFF;
            }
        }
        this.LLILLL.LLILZLL = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.addLocalTaskSyncedWithRemote$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
