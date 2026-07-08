package X;

/* JADX INFO: renamed from: X.0Vj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource", f = "FriendsV3DBSource.kt", l = {207, 217}, m = "safelyOpt")
public final class C805720Vj8<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C806500VkO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805720Vj8(C806500VkO c806500VkO, InterfaceC1364105Vn<? super C805720Vj8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c806500VkO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3DBSource@5913.safelyOpt$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, this);
        C1C7U.LIZIZ("FriendsV3DBSource@5913.safelyOpt$1");
        return objLIZIZ;
    }
}
