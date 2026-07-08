package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.GroupChatInlineMessageModel$getMessageList$1$1", f = "GroupChatInlineMessageModel.kt", l = {}, m = "invokeSuspend")
public final class C1679306hr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1754606u0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679306hr(C1754606u0 c1754606u0, InterfaceC1364105Vn<? super C1679306hr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1754606u0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1679306hr(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatInlineMessageModel@6cd5.getMessageList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.refresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatInlineMessageModel@6cd5.getMessageList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
