package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontSelectAreaAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.056J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056J extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ CustomizedBoardTextFontSelectAreaAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C056J(CustomizedBoardTextFontSelectAreaAssem customizedBoardTextFontSelectAreaAssem) {
        super(0);
        this.LL = customizedBoardTextFontSelectAreaAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        return this.LL.LJJIJL().findViewById(R.id.ih8);
    }
}
