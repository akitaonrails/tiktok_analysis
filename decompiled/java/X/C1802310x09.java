package X;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel$SystemShareDestinationHandler$handleNextStepPostDurationValidation$1$1", f = "SystemShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1802310x09 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1802320x0A LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ WeakReference<C19EG> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802310x09(C1802320x0A c1802320x0A, C19EG c19eg, boolean z, WeakReference<C19EG> weakReference, InterfaceC1364105Vn<? super C1802310x09> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1802320x0A;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = weakReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1802310x09(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1802310x09.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
