package X;

import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.TextSelectFontStyleAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839440xy2 extends C09AY implements Function0<LinearLayout> {
    public final /* synthetic */ TextSelectFontStyleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839440xy2(TextSelectFontStyleAssem textSelectFontStyleAssem) {
        super(0);
        this.LL = textSelectFontStyleAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.LinearLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        return this.LL.getContentView().findViewById(R.id.ih3);
    }
}
