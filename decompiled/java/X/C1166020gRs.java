package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0gRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl", f = "RssRepo.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "fetchRssFeed")
public final class C1166020gRs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1166060gRw LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166020gRs(C1166060gRw c1166060gRw, InterfaceC1364105Vn<? super C1166020gRs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1166060gRw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RssRepoImpl@e91c.fetchRssFeed$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("RssRepoImpl@e91c.fetchRssFeed$1");
        return objLIZIZ;
    }
}
