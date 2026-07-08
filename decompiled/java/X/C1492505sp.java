package X;

import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.duration.DurationPerfMonImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05sp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.perfmonitor.impl.duration.DurationPerfMonImpl$endTracing$2", f = "DurationPerfMonImpl.kt", l = {}, m = "invokeSuspend")
public final class C1492505sp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1492605sq LL;
    public final /* synthetic */ DurationPerfMonImpl LLILLJJLI;
    public final /* synthetic */ AbstractC1493005su LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492505sp(AbstractC1492605sq abstractC1492605sq, DurationPerfMonImpl durationPerfMonImpl, AbstractC1493005su abstractC1493005su, long j, String str, InterfaceC1364105Vn<? super C1492505sp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1492605sq;
        this.LLILLJJLI = durationPerfMonImpl;
        this.LLILLL = abstractC1493005su;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1492505sp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1492505sp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
