package X;

import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HFF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$enterDownloadSharePage$1$1", f = "SocialAvatarServiceImpl.kt", l = {707, 714, 716, 758}, m = "invokeSuspend")
public final class C0HFF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0HHY LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SocialAvatarDownloadArg LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;
    public final /* synthetic */ DialogC1389620mGW LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HFF(SocialAvatarDownloadArg socialAvatarDownloadArg, C19EG c19eg, DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C0HFF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = socialAvatarDownloadArg;
        this.LLILZLL = c19eg;
        this.LLIZ = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HFF c0hff = new C0HFF(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0hff.LLILZ = obj;
        return c0hff;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HFF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
