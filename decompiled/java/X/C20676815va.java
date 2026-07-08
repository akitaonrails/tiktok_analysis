package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.frequency.report.FrequencyReporter$reportOutreach$3", f = "FrequencyReporter.kt", l = {102}, m = "invokeSuspend")
public final class C20676815va extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<OutreachFlowReportItem> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20676815va(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = function0;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20676815va(this.LLILZ, interfaceC1364105Vn, this.LLILZIL, this.LLILZLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: Exception -> 0x00d9, TRY_ENTER, TryCatch #1 {Exception -> 0x00d9, blocks: (B:27:0x008e, B:29:0x0094, B:31:0x009a, B:32:0x00ac, B:34:0x00cb, B:24:0x0067, B:35:0x00ce), top: B:50:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:27:0x008e, B:29:0x0094, B:31:0x009a, B:32:0x00ac, B:34:0x00cb, B:24:0x0067, B:35:0x00ce), top: B:50:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d9, blocks: (B:27:0x008e, B:29:0x0094, B:31:0x009a, B:32:0x00ac, B:34:0x00cb, B:24:0x0067, B:35:0x00ce), top: B:50:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cb -> B:23:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d9 -> B:20:0x0040). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20676815va.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
