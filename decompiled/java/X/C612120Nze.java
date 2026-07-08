package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS60S1000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM$handleFavoriteOptimsticUI$8$1$1$2", f = "VideoFavoriteVM.kt", l = {}, m = "invokeSuspend")
public final class C612120Nze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoFavoriteVM LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612120Nze(VideoFavoriteVM videoFavoriteVM, VideoItemParams videoItemParams, String str, InterfaceC1364105Vn<? super C612120Nze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoFavoriteVM;
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612120Nze(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        Context context;
        Aweme aweme;
        C1C7U.LIZ("VideoFavoriteVM@5c35.handleFavoriteOptimsticUI$8$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoFavoriteVM videoFavoriteVM = this.LL;
        VideoItemParams videoItemParams = this.LLILLJJLI;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        videoFavoriteVM.DQ2(aid, true, true);
        if (this.LL.AQ2() && (context = this.LL.getContext()) != null && !C0SXF.LJIL(context)) {
            this.LL.setState(new AwS60S1000000_9(this.LLILLL, 1));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoFavoriteVM@5c35.handleFavoriteOptimsticUI$8$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
