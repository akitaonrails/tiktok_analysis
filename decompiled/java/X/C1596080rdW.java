package X;

import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FeedSkylightRepoV2$fetchSkylightDataInternally$liveDataItems$1", f = "FeedSkylightRepoV2.kt", l = {}, m = "invokeSuspend")
public final class C1596080rdW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ<? extends FollowingInterestUsersResponse>>, Object> {
    public final /* synthetic */ C1596060rdU LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596080rdW(C1596060rdU c1596060rdU, boolean z, int i, int i2, InterfaceC1364105Vn<? super C1596080rdW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1596060rdU;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1596080rdW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1596020rdQ c1596020rdQ;
        C1C7U.LIZ("FeedSkylightRepoV2@78c2.fetchSkylightDataInternally$liveDataItems$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LJJIFFI(this.LLILLJJLI)) {
            C1596010rdP c1596010rdP = C1596010rdP.LIZ;
            int i = this.LLILLL;
            int i2 = this.LLILZ;
            C1596060rdU c1596060rdU = this.LL;
            InterfaceC1596220rdk interfaceC1596220rdk = c1596060rdU.LIZ;
            InterfaceC1596210rdj interfaceC1596210rdj = c1596060rdU.LIZJ;
            c1596010rdP.getClass();
            c1596020rdQ = C1596010rdP.LIZIZ(i, i2, interfaceC1596220rdk, interfaceC1596210rdj, "FeedSkyLightRepoV2");
        } else {
            c1596020rdQ = new C1596020rdQ(null, EnumC1595320rcI.COMPLETE, null, 48);
        }
        C1C7U.LIZIZ("FeedSkylightRepoV2@78c2.fetchSkylightDataInternally$liveDataItems$1");
        return c1596020rdQ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ<? extends FollowingInterestUsersResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
