package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YRB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.MessageRequestConversationModelImpl$refreshConvsSimInfoWithKvTableQueryInfo$1", f = "MessageRequestConversationModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C0YRB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YRC LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C873950YQf LLILLL;
    public final /* synthetic */ Set<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YRB(C0YRC c0yrc, String str, C873950YQf c873950YQf, Set<String> set, InterfaceC1364105Vn<? super C0YRB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yrc;
        this.LLILLJJLI = str;
        this.LLILLL = c873950YQf;
        this.LLILZ = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YRB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestConversationModelImpl@c73d.refreshConvsSimInfoWithKvTableQueryInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIJ().LJLJLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestConversationModelImpl@c73d.refreshConvsSimInfoWithKvTableQueryInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
