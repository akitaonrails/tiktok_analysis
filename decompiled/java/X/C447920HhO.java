package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem$subscribeToDefaultReplyAndPhotoCommentData$1$1", f = "TypingRecommendationPanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C447920HhO extends C09AX implements InterfaceC1631630sYr<List<? extends StickerItem>, C447990HhV, C448000HhW, InterfaceC1364105Vn<? super C447950HhR>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ C447990HhV LLILLJJLI;
    public /* synthetic */ C448000HhW LLILLL;
    public final /* synthetic */ TypingRecommendationPanelAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447920HhO(TypingRecommendationPanelAssem typingRecommendationPanelAssem, InterfaceC1364105Vn<? super C447920HhO> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = typingRecommendationPanelAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationPanelAssem@d8fd.subscribeToDefaultReplyAndPhotoCommentData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C447950HhR c447950HhR = new C447950HhR((List) this.LL, this.LLILLJJLI, this.LLILZ.vo(), this.LLILLL);
        C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.subscribeToDefaultReplyAndPhotoCommentData$1$1");
        return c447950HhR;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(List<? extends StickerItem> list, C447990HhV c447990HhV, C448000HhW c448000HhW, InterfaceC1364105Vn<? super C447950HhR> interfaceC1364105Vn) {
        C447920HhO c447920HhO = new C447920HhO(this.LLILZ, interfaceC1364105Vn);
        c447920HhO.LL = list;
        c447920HhO.LLILLJJLI = c447990HhV;
        c447920HhO.LLILLL = c448000HhW;
        return c447920HhO.invokeSuspend(Unit.LIZ);
    }
}
