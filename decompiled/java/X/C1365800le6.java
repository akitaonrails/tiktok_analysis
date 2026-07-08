package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ShareMessageToastHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0le6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365800le6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ShareMessageToastHelper LL;
    public final /* synthetic */ C1365810le7 LLILLJJLI;
    public final /* synthetic */ IMContact LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ EnumC896490ZEx LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365800le6(ShareMessageToastHelper shareMessageToastHelper, C1365810le7 c1365810le7, IMContact iMContact, String str, String str2, Aweme aweme, boolean z, EnumC896490ZEx enumC896490ZEx) {
        super(0);
        this.LL = shareMessageToastHelper;
        this.LLILLJJLI = c1365810le7;
        this.LLILLL = iMContact;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = aweme;
        this.LLIZ = z;
        this.LLIZLLLIL = enumC896490ZEx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLIZ;
        String aid;
        this.LL.getClass();
        Context contextLIZIZ = ShareMessageToastHelper.LIZIZ();
        if (contextLIZIZ != null) {
            C1365810le7 c1365810le7 = this.LLILLJJLI;
            IMContact iMContact = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            Aweme aweme = this.LLILZLL;
            boolean z = this.LLIZ;
            EnumC896490ZEx enumC896490ZEx = this.LLIZLLLIL;
            String str3 = "";
            if (Intrinsics.LJFF(c1365810le7.LIZIZ, "streak_invite")) {
                IStreakService.LJJIIZ.getClass();
                IStreakService iStreakServiceLIZ = C06LY.LIZ();
                String str4 = c1365810le7.LJIIIZ;
                if (str4 == null) {
                    str4 = "";
                }
                iStreakServiceLIZ.L(str4);
            }
            EnterChatParams enterChatParams = new EnterChatParams(contextLIZIZ, iMContact);
            enterChatParams.setEnterFromForMob(str);
            enterChatParams.setEnterMethodForMob(str2);
            enterChatParams.setEnterFrom(6);
            IMAwemeService.LIZ.getClass();
            IMAwemeService iMAwemeServiceLIZ = C327350CsP.LIZ();
            if (iMAwemeServiceLIZ == null || (strLIZ = iMAwemeServiceLIZ.LIZ(aweme)) == null) {
                strLIZ = "";
            }
            enterChatParams.setAuthorId(strLIZ);
            if (aweme != null && (aid = aweme.getAid()) != null) {
                str3 = aid;
            }
            enterChatParams.setGroupId(str3);
            enterChatParams.setQuickChat(!z);
            enterChatParams.setActivityStatus(enumC896490ZEx);
            Map<String, String> extraMobParams = enterChatParams.getExtraMobParams();
            String str5 = c1365810le7.LJIIJJI;
            if (str5 == null) {
                str5 = c1365810le7.LIZLLL.length() > 0 ? c1365810le7.LIZLLL : "share_panel";
            }
            extraMobParams.put("panel_source", str5);
            C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
        }
        C1365810le7 c1365810le72 = this.LLILLJJLI;
        C1440005kM.LIZ(new C0N5F(c1365810le72, c1365810le72.LJIIIIZZ));
        return Unit.LIZ;
    }
}
