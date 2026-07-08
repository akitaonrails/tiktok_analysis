package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleBackAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485610J2p extends C09AY implements Function0<LiveIconView> {
    public final /* synthetic */ CustomizedBoardTitleBackAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C485610J2p(CustomizedBoardTitleBackAssem customizedBoardTitleBackAssem) {
        super(0);
        this.LL = customizedBoardTitleBackAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.android.live.design.view.icon.LiveIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveIconView invoke() {
        return this.LL.LJJIJL().findViewById(R.id.bnb);
    }
}
