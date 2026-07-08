package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem$onM2SignalReceive$2", f = "M2BannerAssem.kt", l = {101, 106}, m = "invokeSuspend")
public final class C636930OyZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InboxBannerInfo LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20554115bn LLILLL;
    public final /* synthetic */ M2BannerAssem LLILZ;
    public final /* synthetic */ n LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636930OyZ(C20554115bn c20554115bn, M2BannerAssem m2BannerAssem, n nVar, String str, InterfaceC1364105Vn<? super C636930OyZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20554115bn;
        this.LLILZ = m2BannerAssem;
        this.LLILZIL = nVar;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636930OyZ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C636930OyZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
