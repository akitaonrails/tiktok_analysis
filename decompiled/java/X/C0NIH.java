package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineCommonCacheDelegate$syncPoll$1", f = "OfflineCommonCacheDelegate.kt", l = {97, 101}, m = "invokeSuspend")
public final class C0NIH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C591480NHu>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0NII LLILZ;
    public final /* synthetic */ C0NEN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NIH(C0NII c0nii, C0NEN c0nen, InterfaceC1364105Vn<? super C0NIH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0nii;
        this.LLILZIL = c0nen;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NIH c0nih = new C0NIH(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0nih.LLILLL = obj;
        return c0nih;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NIH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C591480NHu> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
