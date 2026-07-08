package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896740ZFw extends C09AY implements Function0<C0ZGJ> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ QuickDMEventParam LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ EnumC896890ZGl LLILZLL;
    public final /* synthetic */ Aweme LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ BaseContent.ReferenceSceneType LLJI;
    public final /* synthetic */ InterfaceC714750S1x LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C896740ZFw(User user, Activity activity, String str, QuickDMEventParam quickDMEventParam, boolean z, EnumC896890ZGl enumC896890ZGl, Aweme aweme, String str2, String str3, BaseContent.ReferenceSceneType referenceSceneType, InterfaceC714750S1x interfaceC714750S1x) {
        super(0);
        this.LL = user;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = quickDMEventParam;
        this.LLILZIL = z;
        this.LLILZLL = enumC896890ZGl;
        this.LLIZ = aweme;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = referenceSceneType;
        this.LLJIJIL = interfaceC714750S1x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0ZGJ invoke() {
        String strLJ = C0YNP.LJ(this.LL.getUid());
        String uid = this.LL.getUid();
        String nickname = this.LL.getNickname();
        final QuickDMEventParam quickDMEventParam = this.LLILZ;
        final boolean z = this.LLILZIL;
        final EnumC896890ZGl enumC896890ZGl = this.LLILZLL;
        C0ZGG c0zgg = new C0ZGG() { // from class: X.0ZFx
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                return IMChatService.LJJIJL(quickDMEventParam, z, enumC896890ZGl, c0zgs);
            }
        };
        final Aweme aweme = this.LLIZ;
        final User user = this.LL;
        C0ZGE c0zge = new C0ZGE() { // from class: X.0ZFl
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
                return C896600ZFi.LIZ(aweme2, jLongValue, null);
            }
        };
        final String str = this.LLILLL;
        final String str2 = this.LLIZLLLIL;
        final String str3 = this.LLJ;
        final BaseContent.ReferenceSceneType referenceSceneType = this.LLJI;
        final InterfaceC714750S1x interfaceC714750S1x = this.LLJIJIL;
        return new C0ZGJ(this.LLILLJJLI, strLJ, uid, nickname, 0, str, c0zgg, c0zge, new C0ZG6() { // from class: X.0ZG0
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                IMSharePanelApi.LIZ.getClass();
                return C1599690rjL.LIZ().getShareService().LJIILLIIL(aweme, str, IMChatService.LJJIJL(quickDMEventParam, z, enumC896890ZGl, c0zgs), str2, str3, referenceSceneType, interfaceC714750S1x, IMChatService.LJJIJLIJ(user, aweme, quickDMEventParam, c0zgs));
            }
        }, null, false, 1536);
    }
}
