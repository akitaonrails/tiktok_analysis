package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0c0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995590c0z extends C09AY implements Function2<FeedCommerceAssem, C291001Au<? extends Boolean>, Unit> {
    public C995590c0z() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FeedCommerceAssem feedCommerceAssem, C291001Au<? extends Boolean> c291001Au) {
        FeedCommerceAssem feedCommerceAssem2 = feedCommerceAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            if (((Boolean) c291001Au2.LIZ).booleanValue()) {
                DataCenter dataCenter = ((VideoItemParams) C631370Opb.LIZ(feedCommerceAssem2)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.zQ2(null, "on_ad_light_web_page_show");
                }
            } else {
                DataCenter dataCenter2 = ((VideoItemParams) C631370Opb.LIZ(feedCommerceAssem2)).dataCenter;
                if (dataCenter2 != null) {
                    dataCenter2.zQ2(null, "on_ad_light_web_page_hide");
                }
            }
        }
        return Unit.LIZ;
    }
}
