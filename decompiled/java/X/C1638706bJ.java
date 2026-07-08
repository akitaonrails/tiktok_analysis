package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.06bJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1638706bJ extends C09AY implements Function0<ReplyToStickerRecommendationViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ CommonChatNoticeAssem LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(CommonChatNoticeAssem.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638706bJ(CommonChatNoticeAssem commonChatNoticeAssem) {
        super(0);
        this.LL = commonChatNoticeAssem;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final ReplyToStickerRecommendationViewModel invoke() {
        if (!C1661406ey.LIZ(C724240Sb0.LJI(this.LL), EnumC1660606eq.REPLY_TO_STICKER)) {
            return null;
        }
        CommonChatNoticeAssem commonChatNoticeAssem = this.LL;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReplyToStickerRecommendationViewModel.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(commonChatNoticeAssem, C724750Sbp.LJIIJ(commonChatNoticeAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 282), AFwS229S0000000_2.get$arr$(650), null, true);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return assemVMLazyLIZ.getValue();
    }
}
