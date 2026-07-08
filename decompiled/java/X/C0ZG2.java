package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZG2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZG2 extends C09AY implements Function0<C0ZGJ> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EnumC896890ZGl LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ AttachmentTypeComponent LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ BaseContent.ReferenceSceneType LLJ;
    public final /* synthetic */ InterfaceC714750S1x LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZG2(User user, Activity activity, String str, EnumC896890ZGl enumC896890ZGl, Aweme aweme, AttachmentTypeComponent attachmentTypeComponent, String str2, String str3, BaseContent.ReferenceSceneType referenceSceneType, InterfaceC714750S1x interfaceC714750S1x) {
        super(0);
        this.LL = user;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = enumC896890ZGl;
        this.LLILZIL = aweme;
        this.LLILZLL = attachmentTypeComponent;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = referenceSceneType;
        this.LLJI = interfaceC714750S1x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0ZGJ invoke() {
        String strLJJIIZ = IMChatService.LIZIZ.LJJIIZ(this.LL.getUid());
        String uid = this.LL.getUid();
        String nickname = this.LL.getNickname();
        final EnumC896890ZGl enumC896890ZGl = this.LLILZ;
        C0ZGG c0zgg = new C0ZGG() { // from class: X.0ZG3
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                IMChatService iMChatService = IMChatService.LIZIZ;
                EnumC896890ZGl enumC896890ZGl2 = enumC896890ZGl;
                iMChatService.getClass();
                return IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs);
            }
        };
        final Aweme aweme = this.LLILZIL;
        final User user = this.LL;
        final AttachmentTypeComponent attachmentTypeComponent = this.LLILZLL;
        C0ZGE c0zge = new C0ZGE() { // from class: X.0ZFm
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                long jLongValue;
                Aweme aweme2 = aweme;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(user.getUid());
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                return C896600ZFi.LIZ(aweme2, jLongValue, attachmentTypeComponent);
            }
        };
        final String str = this.LLILLL;
        final String str2 = this.LLIZ;
        final String str3 = this.LLIZLLLIL;
        final BaseContent.ReferenceSceneType referenceSceneType = this.LLJ;
        final InterfaceC714750S1x interfaceC714750S1x = this.LLJI;
        return new C0ZGJ(this.LLILLJJLI, strLJJIIZ, uid, nickname, 0, str, c0zgg, c0zge, new C0ZG6() { // from class: X.0ZG1
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                Aweme aweme2 = aweme;
                String str4 = str;
                IMChatService iMChatService = IMChatService.LIZIZ;
                EnumC896890ZGl enumC896890ZGl2 = enumC896890ZGl;
                iMChatService.getClass();
                return shareService.LJIILLIIL(aweme2, str4, IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs), str2, str3, referenceSceneType, interfaceC714750S1x, null);
            }
        }, null, false, 1536);
    }
}
