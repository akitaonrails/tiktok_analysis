package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$recordNewMsgNotifyInSP$1", f = "SingleInboxMessageReceiveBuffer.kt", l = {}, m = "invokeSuspend")
public final class C872180YJk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0YFV LLILLL;
    public final /* synthetic */ C872150YJh LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872180YJk(long j, long j2, C0YFV c0yfv, C872150YJh c872150YJh, int i, InterfaceC1364105Vn<? super C872180YJk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = c0yfv;
        this.LLILZ = c872150YJh;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872180YJk(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.recordNewMsgNotifyInSP$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILZ.LIZJ.LJIIL().LJJIFFI(this.LLILZIL, C2097608Jq.LJIIIIZZ(new Pair("timestamp", C2286608xc.LJFF(System.currentTimeMillis())), new Pair("next_cursor", String.valueOf(this.LL)), new Pair("msg_id", String.valueOf(this.LLILLJJLI)), new Pair("cursor_type", C2286608xc.LJ(this.LLILLL.getValue()))).toString());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.recordNewMsgNotifyInSP$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
