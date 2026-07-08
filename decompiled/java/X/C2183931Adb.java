package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Adb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.utils.mapper.ProgressMapper$start$1", f = "ProgressMapper.kt", l = {39}, m = "invokeSuspend")
public final class C2183931Adb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2183941Adc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183931Adb(C2183941Adc c2183941Adc, InterfaceC1364105Vn<? super C2183931Adb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2183941Adc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2183931Adb c2183931Adb = new C2183931Adb(this.LLILLL, interfaceC1364105Vn);
        c2183931Adb.LLILLJJLI = obj;
        return c2183931Adb;
    }

    /* JADX WARN: Path cross not found for [B:30:0x00c8, B:8:0x002e], limit reached: 36 */
    /* JADX WARN: Path cross not found for [B:8:0x002e, B:30:0x00c8], limit reached: 36 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bf -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183931Adb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
