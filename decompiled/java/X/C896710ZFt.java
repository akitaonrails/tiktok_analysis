package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896710ZFt extends C09AY implements Function0<C0ZGJ> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ EnumC896890ZGl LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C896710ZFt(C0Y8T c0y8t, Activity activity, String str, Aweme aweme, boolean z, EnumC896890ZGl enumC896890ZGl, String str2, String str3) {
        super(0);
        this.LL = c0y8t;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = enumC896890ZGl;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0ZGJ invoke() {
        String conversationId = this.LL.getConversationId();
        String strLJIIJ = C0ZFW.LIZ.LJIIJ(this.LL);
        final Aweme aweme = this.LLILZ;
        C0ZGE c0zge = new C0ZGE() { // from class: X.0ZFo
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                long jLongValue;
                Aweme aweme2 = aweme;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme2));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                return C896600ZFi.LIZ(aweme2, jLongValue, null);
            }
        };
        final boolean z = this.LLILZIL;
        final EnumC896890ZGl enumC896890ZGl = this.LLILZLL;
        C0ZGG c0zgg = new C0ZGG() { // from class: X.0ZFy
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                boolean z2 = z;
                EnumC896890ZGl enumC896890ZGl2 = enumC896890ZGl;
                if (z2) {
                    IMChatService.LIZIZ.getClass();
                    return IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs);
                }
                IMChatService iMChatService = IMChatService.LIZIZ;
                return "quick_reply_pannel";
            }
        };
        final String str = this.LLILLL;
        final String str2 = this.LLIZ;
        final String str3 = this.LLIZLLLIL;
        return new C0ZGJ(this.LLILLJJLI, conversationId, "", strLJIIJ, 3, str, c0zgg, c0zge, new C0ZG6() { // from class: X.0ZFz
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                String strLJJIJIIJI;
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                Aweme aweme2 = aweme;
                String str4 = str;
                boolean z2 = z;
                EnumC896890ZGl enumC896890ZGl2 = enumC896890ZGl;
                if (z2) {
                    IMChatService.LIZIZ.getClass();
                    strLJJIJIIJI = IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs);
                } else {
                    IMChatService iMChatService = IMChatService.LIZIZ;
                    strLJJIJIIJI = "quick_reply_pannel";
                }
                return shareService.LJIILLIIL(aweme2, str4, strLJJIJIIJI, str2, str3, null, null, null);
            }
        }, null, false, 1536);
    }
}
