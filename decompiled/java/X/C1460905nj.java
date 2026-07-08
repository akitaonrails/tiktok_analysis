package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment$ensureConversationInMemory$1", f = "BaseChatRootFragment.kt", l = {}, m = "invokeSuspend")
public final class C1460905nj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460905nj(String str, InterfaceC1364105Vn<? super C1460905nj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1460905nj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseChatRootFragment@beaf.ensureConversationInMemory$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseChatRootFragment@beaf.ensureConversationInMemory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
