package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Z3I, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListViewHolder$bind$6", f = "MafChatListViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C0Z3I extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0Z7M LL;
    public final /* synthetic */ C1261860iwS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z3I(C0Z7M c0z7m, C1261860iwS c1261860iwS, InterfaceC1364105Vn<? super C0Z3I> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0z7m;
        this.LLILLJJLI = c1261860iwS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z3I(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafChatListViewHolder@8b60.bind$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Z3J c0z3j = this.LL.LLJJIII;
        if (c0z3j != null) {
            c0z3j.Gk(this.LLILLJJLI);
        }
        C1C7U.LIZIZ("MafChatListViewHolder@8b60.bind$6");
        return false;
    }
}
