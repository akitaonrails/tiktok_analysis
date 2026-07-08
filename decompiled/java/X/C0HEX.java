package X;

/* JADX INFO: renamed from: X.0HEX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.network.SafeSocialAvatarNetworkAPIImpl$Companion", f = "SafeSocialAvatarNetworkAPIImpl.kt", l = {56}, m = "runNetworkSafelyWithContext")
public final class C0HEX<R> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0HEW LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEX(C0HEW c0hew, InterfaceC1364105Vn<? super C0HEX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0hew;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeSocialAvatarNetworkAPIImpl$Companion@979a.runNetworkSafelyWithContext$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this, null);
        C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl$Companion@979a.runNetworkSafelyWithContext$1");
        return objLIZIZ;
    }
}
