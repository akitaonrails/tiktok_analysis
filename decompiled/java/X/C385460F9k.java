package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0F9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C385460F9k extends C2217421BqW implements Function2<TextMotionModel, CaptionTemplateModel, Unit> {
    public C385460F9k(C385410F9f c385410F9f) {
        super(2, c385410F9f, C385410F9f.class, "applyMotion", "applyMotion(Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/TextMotionModel;Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/CaptionTemplateModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TextMotionModel textMotionModel, CaptionTemplateModel captionTemplateModel) {
        ((C385410F9f) this.receiver).P4(textMotionModel, captionTemplateModel);
        return Unit.LIZ;
    }
}
