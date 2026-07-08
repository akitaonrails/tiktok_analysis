package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.contact.ContactSyncAuthProcessor$invokeSyncApi$1", f = "ContactSyncAuthProcessor.kt", l = {66, 80, 92}, m = "invokeSuspend")
public final class C1071440dzK extends C09AX implements Function2<InterfaceC346701Wf<? super C1071240dz0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1071220dyy LLILZIL;
    public final /* synthetic */ C1071430dzJ LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071440dzK(boolean z, C1071220dyy c1071220dyy, C1071430dzJ c1071430dzJ, boolean z2, boolean z3, InterfaceC1364105Vn<? super C1071440dzK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = c1071220dyy;
        this.LLILZLL = c1071430dzJ;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1071440dzK c1071440dzK = new C1071440dzK(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1071440dzK.LLILLL = obj;
        return c1071440dzK;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1071440dzK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1071240dz0> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
