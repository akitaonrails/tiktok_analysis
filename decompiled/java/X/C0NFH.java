package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.interaction.IntelligencePushHelper$processMessageByIntelligence$3", f = "IntelligencePushHelper.kt", l = {149, 159, 164}, m = "invokeSuspend")
public final class C0NFH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C814730Vxf LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NFH(C814730Vxf c814730Vxf, int i, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NFH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c814730Vxf;
        this.LLILZLL = i;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NFH c0nfh = new C0NFH(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0nfh.LLILZ = obj;
        return c0nfh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x013b, code lost:
    
        if (r11 < 2) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0165  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x010c -> B:19:0x011d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NFH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
