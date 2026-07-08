package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0udf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillManager$tryAutofill$1", f = "AutofillManager.kt", l = {102, 117, 134, 143, 159, 170}, m = "invokeSuspend")
public final class C1711490udf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1711360udS LL;
    public C19EG LLILLJJLI;
    public Object LLILLL;
    public AutofillHostContent LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1711360udS LLIZLLLIL;
    public final /* synthetic */ C19EG LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711490udf(String str, InterfaceC1711360udS interfaceC1711360udS, C19EG c19eg, String str2, InterfaceC1364105Vn<? super C1711490udf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = interfaceC1711360udS;
        this.LLJ = c19eg;
        this.LLJI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1711490udf(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x01fd, TryCatch #1 {all -> 0x01fd, blocks: (B:6:0x001a, B:8:0x002a, B:14:0x004a, B:16:0x004e, B:18:0x005c, B:21:0x00d2, B:23:0x00db, B:13:0x0047, B:29:0x013c, B:60:0x01e9, B:63:0x01f2), top: B:87:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x01fd, TryCatch #1 {all -> 0x01fd, blocks: (B:6:0x001a, B:8:0x002a, B:14:0x004a, B:16:0x004e, B:18:0x005c, B:21:0x00d2, B:23:0x00db, B:13:0x0047, B:29:0x013c, B:60:0x01e9, B:63:0x01f2), top: B:87:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145 A[Catch: all -> 0x01fb, TryCatch #0 {all -> 0x01fb, blocks: (B:55:0x01c5, B:62:0x01ee, B:30:0x013f, B:33:0x0145, B:35:0x014b, B:37:0x015c, B:41:0x0164, B:43:0x0168, B:45:0x016e, B:64:0x01f5, B:49:0x019f, B:51:0x01a4, B:56:0x01c8, B:61:0x01ec), top: B:86:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1711490udf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
