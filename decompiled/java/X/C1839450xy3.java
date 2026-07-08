package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.TextSelectFontStyleAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839450xy3 extends C09AY implements Function0<C433500GzE> {
    public final /* synthetic */ TextSelectFontStyleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839450xy3(TextSelectFontStyleAssem textSelectFontStyleAssem) {
        super(0);
        this.LL = textSelectFontStyleAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0GzE, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C433500GzE invoke() {
        return this.LL.getContentView().findViewById(R.id.ih6);
    }
}
