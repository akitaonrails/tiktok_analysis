package X;

import com.bytedance.android.live.banner.BannerRetrofitApi;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497610JfL extends C09AY implements Function0<C11NZ<C470590Icr<BannerInRoomCollection>>> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C497610JfL(long j, boolean z) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<C470590Icr<BannerInRoomCollection>> invoke() {
        C480460Ism.LIZ().getClass();
        return ((BannerRetrofitApi) C480460Ism.LIZLLL(BannerRetrofitApi.class)).queryLiveRoomBanner(this.LL, this.LLILLJJLI ? 2 : 1);
    }
}
