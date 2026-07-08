package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.UserNetworkBackedSocialAvatarFastFlowService$queryState$1", f = "NetworkBackedSocialAvatarFastFlowService.kt", l = {138, 141, 166}, m = "invokeSuspend")
public final class C439040HJm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C439030HJl LLILZ;
    public final /* synthetic */ InterfaceC439080HJq LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439040HJm(boolean z, C439030HJl c439030HJl, InterfaceC439080HJq interfaceC439080HJq, InterfaceC1364105Vn<? super C439040HJm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c439030HJl;
        this.LLILZIL = interfaceC439080HJq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C439040HJm c439040HJm = new C439040HJm(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c439040HJm.LLILLJJLI = obj;
        return c439040HJm;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439040HJm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
