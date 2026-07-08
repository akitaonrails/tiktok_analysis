package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0Ho9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452110Ho9 extends C09AY implements Function0<ReplyToStickerRecommendationViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ TypingRecommendationPanelAssem LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(TypingRecommendationPanelAssem.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452110Ho9(TypingRecommendationPanelAssem typingRecommendationPanelAssem) {
        super(0);
        this.LL = typingRecommendationPanelAssem;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final ReplyToStickerRecommendationViewModel invoke() {
        TypingRecommendationPanelAssem typingRecommendationPanelAssem = this.LL;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReplyToStickerRecommendationViewModel.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(typingRecommendationPanelAssem, C724750Sbp.LJIIJ(typingRecommendationPanelAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 652), AFwS236S0000000_6.get$arr$(580), null, true);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return assemVMLazyLIZ.getValue();
    }
}
