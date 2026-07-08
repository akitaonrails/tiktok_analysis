package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontButtonLayoutAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C296201Cu extends C09AY implements Function0<LiveIconView> {
    public final /* synthetic */ CustomizedBoardTextFontButtonLayoutAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C296201Cu(CustomizedBoardTextFontButtonLayoutAssem customizedBoardTextFontButtonLayoutAssem) {
        super(0);
        this.LL = customizedBoardTextFontButtonLayoutAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.android.live.design.view.icon.LiveIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveIconView invoke() {
        return this.LL.LJJIJL().findViewById(R.id.xp2);
    }
}
