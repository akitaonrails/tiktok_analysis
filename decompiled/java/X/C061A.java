package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.TrackInfoData;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIAsstDmMessageClick$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C061A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C061A(C869590Y9l c869590Y9l, Map<String, String> map, InterfaceC1364105Vn<? super C061A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C061A(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        TrackInfoData trackInfoData;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstDmMessageClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LL.getConversationId());
        if (c0y8tLIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstDmMessageClick$1");
            return unit;
        }
        IMAIServiceAPI.LIZ.getClass();
        if (!AnonymousClass0629.LIZ().LIZ().LJIL(this.LL.getConversationId()) && !AnonymousClass0629.LIZ().LIZ().LJIIIZ(c0y8tLIZ)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstDmMessageClick$1");
            return unit2;
        }
        C1508705vR.LL.getClass();
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("chat_type", C1508705vR.LIZIZ(c0y8tLIZ));
        pairArr[1] = new Pair("conversation_id", this.LL.getConversationId());
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(this.LL);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (zLJJJJIZL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_sender", str);
        String uuid = this.LL.getUuid();
        uuid.toString();
        pairArr[3] = new Pair("message_id", uuid);
        pairArr[4] = new Pair("message_type", this.LLILLJJLI.get("message_type"));
        pairArr[5] = new Pair("content_type", this.LLILLJJLI.get("content_type"));
        pairArr[6] = new Pair("message_type_v2", this.LLILLJJLI.get("message_type_v2"));
        String str4 = this.LLILLJJLI.get("is_ai_auto_reply");
        if (str4 != null) {
            str3 = str4;
        }
        pairArr[7] = new Pair("is_ai_auto_reply", str3);
        PersistentExtraData persistentExtraDataLIZ = C905400ZfW.LIZ(this.LL);
        if (persistentExtraDataLIZ != null && (trackInfoData = persistentExtraDataLIZ.trackInfo) != null) {
            str2 = trackInfoData.aggregationMessageType;
        } else {
            str2 = null;
        }
        pairArr[8] = new Pair("aggregation_message_type", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(C1508705vR.LIZJ());
        C1508705vR.LIZLLL("ttsocial_aiasst_dm_message_click", mapLJIIJ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstDmMessageClick$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
