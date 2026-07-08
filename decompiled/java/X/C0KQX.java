package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KQX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.GetStoryGradientBackgroundImageMethod$handle$1", f = "GetStoryGradientBackgroundImageMethod.kt", l = {51}, m = "invokeSuspend")
public final class C0KQX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public C118300cf LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ InterfaceC517180KQa LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC517190KQb> LLILZIL;
    public final /* synthetic */ C0KQY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KQX(InterfaceC517180KQa interfaceC517180KQa, CompletionBlock<InterfaceC517190KQb> completionBlock, C0KQY c0kqy, InterfaceC1364105Vn<? super C0KQX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC517180KQa;
        this.LLILZIL = completionBlock;
        this.LLILZLL = c0kqy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KQX(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KQX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
