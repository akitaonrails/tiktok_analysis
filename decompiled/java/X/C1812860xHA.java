package X;

import android.widget.ImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812860xHA extends C09AY implements Function1<ImageView, Unit> {
    public C1812860xHA() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageView imageView) {
        List<String> listLJIIJJI;
        ImageView imageView2 = imageView;
        if (C1834150xpV.LJFF(imageView2.getContext())) {
            listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_13", "live_ai_summary_board_intro_dark.png");
        } else {
            listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_13", "live_ai_summary_board_intro.png");
        }
        C1143680frq.LJIIJ(imageView2, listLJIIJJI, ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
        return Unit.LIZ;
    }
}
