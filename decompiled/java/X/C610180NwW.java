package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$requestFeedReachCfg$1", f = "EcVideoGuideVM.kt", l = {247, 257}, m = "invokeSuspend")
public final class C610180NwW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcVideoGuideVM LLILLJJLI;
    public final /* synthetic */ C1770080wAA LLILLL;
    public final /* synthetic */ C1770090wAB LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610180NwW(EcVideoGuideVM ecVideoGuideVM, C1770080wAA c1770080wAA, C1770090wAB c1770090wAB, Function0<Unit> function0, InterfaceC1364105Vn<? super C610180NwW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecVideoGuideVM;
        this.LLILLL = c1770080wAA;
        this.LLILZ = c1770090wAB;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610180NwW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:33:0x00e5, B:34:0x00e8, B:36:0x00ec, B:18:0x00b7, B:19:0x00ba, B:21:0x00be, B:23:0x00c4, B:27:0x00cd, B:29:0x00d1, B:37:0x00f0, B:10:0x0026, B:14:0x0087), top: B:43:0x0013 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610180NwW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
