package X;

import android.graphics.Typeface;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FK5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FK5 extends C2217421BqW implements Function1<TextFontModel, Typeface> {
    public C0FK5(C0FKI c0fki) {
        super(1, c0fki, C0FKI.class, "getTypefaceByFontModel", "getTypefaceByFontModel(Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/TextFontModel;)Landroid/graphics/Typeface;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Typeface invoke(TextFontModel textFontModel) {
        return ((C0FKI) this.receiver).LIZLLL(textFontModel);
    }
}
