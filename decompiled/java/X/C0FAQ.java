package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAQ extends C09AY implements Function1<TextStickerModel, TextStickerModel> {
    public final /* synthetic */ TextFontModel LL;
    public final /* synthetic */ C0FII LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FAQ(TextFontModel textFontModel, C0FII c0fii, String str, int i, boolean z) {
        super(1);
        this.LL = textFontModel;
        this.LLILLJJLI = c0fii;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextStickerModel invoke(TextStickerModel textStickerModel) {
        int iLIZ;
        TextStickerModel textStickerModel2 = textStickerModel;
        TextFontModel fontModel = textStickerModel2.getFontModel();
        TextFontModel textFontModel = this.LL;
        String str = textFontModel.fileName;
        String str2 = textFontModel.fontTitle;
        String str3 = textFontModel.fontId;
        String str4 = textFontModel.fontResId;
        String str5 = textFontModel.fontPanel;
        String str6 = textFontModel.fontName;
        String str7 = textFontModel.localPath;
        boolean z = textFontModel.enableBgColor;
        boolean z2 = textFontModel.enableMaskBlurLightColor;
        if (C0F8Y.LJIIIZ(this.LLILLJJLI.LJFF.LIZ)) {
            iLIZ = C0FAS.LIZ(this.LLILLJJLI.LJFF.LIZ);
        } else {
            iLIZ = -1;
        }
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel2, null, null, null, null, null, 0, 0, 0, 0.0f, TextFontModel.LIZ(fontModel, str3, str4, str5, this.LLILLL, str6, str2, this.LLILZ, 0, str, str7, z, z2, iLIZ, 4224), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -513, 65535, null);
        C385050F7v.LJJIIJZLJL(textStickerModelCopy$default, this.LLILZIL);
        return textStickerModelCopy$default;
    }
}
