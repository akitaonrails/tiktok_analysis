package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$recordMsgPerUserSnapshotInSP$1", f = "SingleInboxMessageReceiveBuffer.kt", l = {}, m = "invokeSuspend")
public final class C872160YJi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C0YFV LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C872150YJh LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872160YJi(long j, C0YFV c0yfv, int i, int i2, boolean z, String str, String str2, C872150YJh c872150YJh, int i3, InterfaceC1364105Vn<? super C872160YJi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = c0yfv;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = c872150YJh;
        this.LLJ = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872160YJi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.recordMsgPerUserSnapshotInSP$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLIZLLLIL.LIZ.LJIIZILJ().LIZIZ().LIZJ().LJJLIIIIJ(this.LLJ, this.LLILLJJLI, C2097608Jq.LJIIIIZZ(new Pair("timestamp", C2286608xc.LJFF(System.currentTimeMillis())), new Pair("next_cursor", String.valueOf(this.LL)), new Pair("cursor_type", String.valueOf(this.LLILLJJLI.getValue())), new Pair("conv_count", String.valueOf(this.LLILLL)), new Pair("msg_count", String.valueOf(this.LLILZ)), new Pair("is_success", String.valueOf(this.LLILZIL)), new Pair("error_msg", this.LLILZLL), new Pair("log_id", this.LLIZ)).toString());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.recordMsgPerUserSnapshotInSP$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
