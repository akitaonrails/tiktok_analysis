package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.utils.FetchHandler$activate$3", f = "FetchHandler.kt", l = {68, 164}, m = "invokeSuspend")
public final class C592030NJx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public C592050NJz LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C592050NJz LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592030NJx(C592050NJz c592050NJz, InterfaceC1364105Vn<? super C592030NJx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c592050NJz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592030NJx c592030NJx = new C592030NJx(this.LLIZ, interfaceC1364105Vn);
        c592030NJx.LLILZLL = obj;
        return c592030NJx;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:21:0x0088, B:23:0x0099, B:24:0x00c5), top: B:34:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5 A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #0 {all -> 0x00e5, blocks: (B:21:0x0088, B:23:0x0099, B:24:0x00c5), top: B:34:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0082 -> B:34:0x0088). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C592030NJx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
