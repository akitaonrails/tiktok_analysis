package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.systemnotice.GroupChatSystemNoticeObserver$onResolveMsgGap$1", f = "GroupChatSystemNoticeObserver.kt", l = {}, m = "invokeSuspend")
public final class C1690106jb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C869590Y9l> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1690106jb(List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C1690106jb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1690106jb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatSystemNoticeObserver@4e4a.onResolveMsgGap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C869590Y9l> list = this.LL;
        C1689906jZ c1689906jZ = C1689906jZ.LL;
        for (C869590Y9l c869590Y9l : list) {
            c1689906jZ.getClass();
            C1689906jZ.LIZ(c869590Y9l);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatSystemNoticeObserver@4e4a.onResolveMsgGap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
