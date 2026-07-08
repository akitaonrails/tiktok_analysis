package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$refreshBannerByTemplateId$1$1", f = "GroupChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C067Q extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EnumC1596306Mv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067Q(EnumC1596306Mv enumC1596306Mv, InterfaceC1364105Vn<? super C067Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1596306Mv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C067Q c067q = new C067Q(this.LLILLJJLI, interfaceC1364105Vn);
        c067q.LL = obj;
        return c067q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((C06OO) this.LL).LIZ == this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.refreshBannerByTemplateId$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
