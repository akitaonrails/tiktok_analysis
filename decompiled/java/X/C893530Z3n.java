package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.analytics.IMMessageAdapterAnalytics$logExternalVideoMessage$1", f = "IMMessageAdapterAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C893530Z3n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C893530Z3n(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C893530Z3n(this.LLILLJJLI, this.LLILLL, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJ;
        String strLIZIZ;
        String str;
        String str2;
        String str3;
        C1C7U.LIZ("IMMessageAdapterAnalytics@d7a0.logExternalVideoMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("action_type", this.LL);
        String conversationId = this.LLILLJJLI.getConversationId();
        conversationId.toString();
        c830490Whz.put("conversation_id", conversationId);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        String str4 = "";
        if (iMessageAnalyticsUtilsLIZ == null || (strLJ = iMessageAnalyticsUtilsLIZ.LJ(this.LLILLJJLI)) == null) {
            strLJ = "";
        }
        c830490Whz.put("message_type", strLJ);
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(this.LLILLJJLI);
        c830490Whz.put("from_user_id", String.valueOf(this.LLILLJJLI.getSender()));
        if (zLJJJJIZL) {
            strLIZIZ = String.valueOf(C0YNP.LJII(this.LLILLJJLI.getConversationId()));
        } else {
            strLIZIZ = C461720I8s.LIZIZ();
            strLIZIZ.toString();
        }
        c830490Whz.put("to_user_id", strLIZIZ);
        if (zLJJJJIZL) {
            str = "sender";
        } else {
            str = "receiver";
        }
        c830490Whz.put("user_status", str);
        if (zLJJJJIZL) {
            str2 = "";
        } else if (C453750Hqn.LIZ(this.LLILLJJLI) == 2) {
            str2 = "muf";
        } else {
            str2 = "maf";
        }
        c830490Whz.put("follow_type", str2);
        String strLIZ = C0ZDX.LIZ(this.LLILLJJLI);
        if (strLIZ != null) {
            str4 = strLIZ;
        }
        c830490Whz.put("group_id", str4);
        c830490Whz.put("server_message_id", String.valueOf(this.LLILLJJLI.getMsgId()));
        c830490Whz.put("message_create_time", String.valueOf(this.LLILLJJLI.getCreatedAt()));
        if (C0ZDX.LJJ(this.LLILLJJLI)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("has_inline_message", str3);
        this.LLILLL.sendEvent("external_video_message", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMessageAdapterAnalytics@d7a0.logExternalVideoMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
