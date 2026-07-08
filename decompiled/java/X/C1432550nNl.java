package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$handle$1", f = "EcEditVideoCoverMethod.kt", l = {100, 101, 116}, m = "invokeSuspend")
public final class C1432550nNl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C060Q LLILZIL;
    public final /* synthetic */ C1432140nN6 LLILZLL;
    public final /* synthetic */ CompletionBlock<InterfaceC1463805oC> LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;
    public final /* synthetic */ InterfaceC497601wk LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1432550nNl(C060Q c060q, C1432140nN6 c1432140nN6, CompletionBlock<InterfaceC1463805oC> completionBlock, Activity activity, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1432550nNl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c060q;
        this.LLILZLL = c1432140nN6;
        this.LLIZ = completionBlock;
        this.LLIZLLLIL = activity;
        this.LLJ = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1432550nNl c1432550nNl = new C1432550nNl(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1432550nNl.LLILZ = obj;
        return c1432550nNl;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432550nNl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
