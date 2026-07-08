package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.ExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19666711x3 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ C0Z6T LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ = "chat";
    public final /* synthetic */ String LLIZLLLIL = "group_onboarding_card";
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19666711x3(C0Y8T c0y8t, C0ZFW c0zfw, String str, String str2, String str3, Context context, String str4) {
        super(1);
        this.LL = c0y8t;
        this.LLILLJJLI = c0zfw;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = context;
        this.LLJ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        final DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = new DMGroupChatStickerGroupInfo(Long.valueOf(this.LL.getConversationShortId()), this.LLILLJJLI.LJIIJ(this.LL), str, this.LLILLJJLI.LJIILLIIL(this.LL), 2, this.LLILLL, this.LLILZ, Integer.valueOf(this.LL.getMemberCount()), this.LLILLJJLI.LJIIIIZZ(this.LL));
        final String string = UUID.randomUUID().toString();
        C19666811x4 c19666811x4 = C19666811x4.LIZ;
        String str2 = this.LLILZIL;
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(c19666811x4);
        C19666811x4.LIZIZ = str2;
        Keva.getRepo("onboarding_card_action_keva").storeString("key_pending_publish_creation_id", string);
        C15580068c.LIZ(c19666811x4);
        ExternalService externalService = ExternalService.INSTANCE;
        final Context context = this.LLILZLL;
        final String str3 = this.LLIZ;
        final String str4 = this.LLIZLLLIL;
        final String str5 = this.LLJ;
        externalService.asyncServiceForMainRecordService(context, str3, new SimpleServiceLoadCallback() { // from class: X.11x2
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
                Context context2 = context;
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.creationId(string);
                builder.shootWay(str4);
                builder.enterFrom(str3);
                builder.enterMethod(str5);
                builder.shootEnterFrom(str3);
                builder.dmGroupChatStickerGroupInfo(dMGroupChatStickerGroupInfo);
                builder.landingBack(true);
                builder.needMobShoot(true);
                iRecordServiceRecordService.startRecord(context2, builder.build());
            }
        });
        return Unit.LIZ;
    }
}
