package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveDecorationCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1828090xfj extends C09AY implements Function0<LiveIconView> {
    public final /* synthetic */ LiveDecorationCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828090xfj(LiveDecorationCell liveDecorationCell) {
        super(0);
        this.LL = liveDecorationCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.android.live.design.view.icon.LiveIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveIconView invoke() {
        return this.LL.itemView.findViewById(R.id.c7n);
    }
}
