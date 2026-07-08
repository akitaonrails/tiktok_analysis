package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBBoardAuditResponse;

/* JADX INFO: renamed from: X.0xMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.chain.DecorationSmbReviewDisclaimerCheckHandler$handleData$2", f = "DecorationSmbReviewDisclaimerCheckHandler.kt", l = {42, 76}, m = "invokeSuspend")
public final class C1816470xMz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<SMBBoardAuditResponse.Data>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1816270xMf LLILLL;
    public final /* synthetic */ C1816400xMs LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816470xMz(C1816400xMs c1816400xMs, C1816270xMf c1816270xMf, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1816270xMf;
        this.LLILZ = c1816400xMs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1816470xMz c1816470xMz = new C1816470xMz(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c1816470xMz.LLILLJJLI = obj;
        return c1816470xMz;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1816470xMz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C470590Icr<SMBBoardAuditResponse.Data>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
