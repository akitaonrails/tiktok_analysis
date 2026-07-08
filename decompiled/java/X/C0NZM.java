package X;

/* JADX INFO: renamed from: X.0NZM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.cache.PublicGroupInviteListTabsCacheManager", f = "PublicGroupInviteListTabsCacheManager.kt", l = {41}, m = "fetchAndCacheTabs$im_group_chat_release")
public final class C0NZM extends AbstractC23140094w {
    public C0Y8T LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NZN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZM(C0NZN c0nzn, InterfaceC1364105Vn<? super C0NZM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0nzn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupInviteListTabsCacheManager@5d00.fetchAndCacheTabs$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("PublicGroupInviteListTabsCacheManager@5d00.fetchAndCacheTabs$1");
        return objLIZ;
    }
}
