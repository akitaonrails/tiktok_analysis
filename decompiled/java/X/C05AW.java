package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.RecordTimerKt$RecordTimer$1$1$1", f = "RecordTimer.kt", l = {}, m = "invokeSuspend")
public final class C05AW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C05P0<Long> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AW(C05P0<Boolean> c05p0, C05P0<Long> c05p02, InterfaceC1364105Vn<? super C05AW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05AW c05aw = new C05AW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05aw.LL = obj;
        return c05aw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordTimerKt@721f.RecordTimer$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C05AV(this.LLILLJJLI, this.LLILLL, null), 3);
        C1C7U.LIZIZ("RecordTimerKt@721f.RecordTimer$1$1$1");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
