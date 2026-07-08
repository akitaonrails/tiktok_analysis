package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0F9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C385610F9z extends C2217421BqW implements InterfaceC1685430txd<TextStyleModel, Integer, Integer, Effect, Boolean, InterfaceC385920FBe, Unit> {
    public C385610F9z(C385410F9f c385410F9f) {
        super(6, c385410F9f, C385410F9f.class, "applyStyle", "applyStyle(Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/TextStyleModel;IILcom/ss/android/ugc/effectmanager/effect/model/Effect;ZLcom/ss/android/ugc/gamora/editor/sticker/text/pro/TextFontCategoryPagerApi;)V", 0);
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(TextStyleModel textStyleModel, Integer num, Integer num2, Effect effect, Boolean bool, InterfaceC385920FBe interfaceC385920FBe) {
        ((C385410F9f) this.receiver).T4(textStyleModel, num.intValue(), num2.intValue(), effect, bool.booleanValue(), interfaceC385920FBe);
        return Unit.LIZ;
    }
}
