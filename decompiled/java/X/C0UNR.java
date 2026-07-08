package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;

/* JADX INFO: renamed from: X.0UNR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMorePanelDataSource", f = "BroadcastMorePanelDataSource.kt", l = {HorizontalCarouselRecentEffectsLimitAB.LIMIT_12}, m = "getMorePanelSettingData$livebroadcast_impl_release")
public final class C0UNR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0UNQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UNR(C0UNQ c0unq, InterfaceC1364105Vn<? super C0UNR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0unq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BroadcastMorePanelDataSource@e180.getMorePanelSettingData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("BroadcastMorePanelDataSource@e180.getMorePanelSettingData$1");
        return objLIZ;
    }
}
