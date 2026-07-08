package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Iij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.list.viewbinder.RankListItemViewBinder$RankListItemViewHolder$loadUserDescriptionImageAsync$1$heartIconDownloadTask$1", f = "RankCommonItemsVB.kt", l = {}, m = "invokeSuspend")
public final class C474230Iij extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Drawable>, Object> {
    public C474230Iij(InterfaceC1364105Vn<? super C474230Iij> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474230Iij(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RankListItemViewBinder$RankListItemViewHolder@d411.loadUserDescriptionImageAsync$1$heartIconDownloadTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_revenue_demand_1", "ttlive_icon_ranking_list_popularity_ranking_heart.png");
        C1C7U.LIZIZ("RankListItemViewBinder$RankListItemViewHolder@d411.loadUserDescriptionImageAsync$1$heartIconDownloadTask$1");
        return drawableLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Drawable> interfaceC1364105Vn) {
        return new C474230Iij(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
