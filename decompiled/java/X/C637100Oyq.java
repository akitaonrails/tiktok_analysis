package X;

import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.popup.outreach.ProfileOutreachBannerHelper$handleTriggerCallback$1", f = "ProfileOutreachBannerHelper.kt", l = {134, 139, 146}, m = "invokeSuspend")
public final class C637100Oyq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2238171Cit LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20554115bn LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C2238171Cit LLILZIL;
    public final /* synthetic */ n LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637100Oyq(C20554115bn c20554115bn, String str, C2238171Cit c2238171Cit, n nVar, InterfaceC1364105Vn<? super C637100Oyq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20554115bn;
        this.LLILZ = str;
        this.LLILZIL = c2238171Cit;
        this.LLILZLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637100Oyq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C637100Oyq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
