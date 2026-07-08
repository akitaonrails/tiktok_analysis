package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.060I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C060I extends C09AY implements Function1<IMAIBotInfo, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060I(Context context, String str, String str2, boolean z) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IMAIBotInfo iMAIBotInfo) {
        int value;
        IMAIBotInfo iMAIBotInfo2 = iMAIBotInfo;
        C888370Yt9 c888370Yt9 = C888370Yt9.LIZ;
        Context context = this.LL;
        boolean z = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        c888370Yt9.getClass();
        if (iMAIBotInfo2 != null) {
            value = iMAIBotInfo2.status;
        } else {
            value = C062E.BOT_STATUS_UNKNOWN.getValue();
        }
        if (value != C062E.BOT_STATUS_UNKNOWN.getValue() && value != C062E.BOT_STATUS_CREATING.getValue() && value != C062E.BOT_STATUS_DELETED.getValue() && value != C062E.BOT_STATUS_FAILED.getValue()) {
            if (value == C062E.BOT_STATUS_WORKING.getValue()) {
                if (z) {
                    if (iMAIBotInfo2 != null) {
                        C888370Yt9.LIZ(context, iMAIBotInfo2, false, "chat_enter", str2);
                    }
                } else {
                    C1503105uX.LIZ(new AwS368S0200000_2(context, EnumC1684406ig.INBOX, 89));
                }
            }
        } else {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/smart_reply_create_page");
            smartRouteBuildRoute.withParam("enter_method", str);
            smartRouteBuildRoute.withParam("enter_from", str2);
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }
}
