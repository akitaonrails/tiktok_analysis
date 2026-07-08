package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0F9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C385440F9i extends C2217421BqW implements InterfaceC1631630sYr<TextFontModel, Integer, String, CaptionTemplateModel, Unit> {
    public C385440F9i(C385410F9f c385410F9f) {
        super(4, c385410F9f, C385410F9f.class, "applyFont", "applyFont(Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/TextFontModel;ILjava/lang/String;Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/CaptionTemplateModel;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(TextFontModel textFontModel, Integer num, String str, CaptionTemplateModel captionTemplateModel) {
        ((C385410F9f) this.receiver).O4(textFontModel, num.intValue(), str, captionTemplateModel);
        return Unit.LIZ;
    }
}
