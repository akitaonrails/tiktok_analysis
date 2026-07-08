package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontDescriptionColorAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C296801Da extends C09AY implements Function0<C433480GzC> {
    public final /* synthetic */ CustomizedBoardTextFontDescriptionColorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C296801Da(CustomizedBoardTextFontDescriptionColorAssem customizedBoardTextFontDescriptionColorAssem) {
        super(0);
        this.LL = customizedBoardTextFontDescriptionColorAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0GzC, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C433480GzC invoke() {
        return this.LL.LJJIJL().findViewById(R.id.fos);
    }
}
