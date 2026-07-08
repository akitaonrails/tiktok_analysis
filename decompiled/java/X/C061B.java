package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.TrackInfoData;
import com.ss.android.ugc.aweme.im.message.template.card.MarkdownMessageTemplate;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$tryReportReceiveAIReplyMessage$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C061B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C061B(C869590Y9l c869590Y9l, Map<String, String> map, InterfaceC1364105Vn<? super C061B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C061B(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        TrackInfoData trackInfoData;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.tryReportReceiveAIReplyMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C15395060z.LIZIZ(this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.tryReportReceiveAIReplyMessage$1");
            return unit;
        }
        Pair[] pairArr = new Pair[12];
        ?? ContainsMatchIn = 0;
        pairArr[0] = new Pair("enter_from", this.LLILLJJLI.get("enter_from"));
        pairArr[1] = new Pair("chat_type", this.LLILLJJLI.get("chat_type"));
        pairArr[2] = new Pair("relation_tag", this.LLILLJJLI.get("relation_tag"));
        pairArr[3] = new Pair("conversation_id", this.LLILLJJLI.get("conversation_id"));
        pairArr[4] = new Pair("from_user_id", this.LLILLJJLI.get("from_user_id"));
        pairArr[5] = new Pair("message_id", this.LL.getUuid());
        pairArr[6] = new Pair("message_create_time", String.valueOf(this.LL.getCreatedAt()));
        C054G c054g = C1499405tw.LIZ;
        C869590Y9l c869590Y9l = this.LL;
        C0ZXP.LIZ.getClass();
        String str = null;
        try {
            MarkdownMessageTemplate markdownMessageTemplate = (MarkdownMessageTemplate) C0Z2Z.LIZ(c869590Y9l, MarkdownMessageTemplate.class);
            if (markdownMessageTemplate != null) {
                c098200Yq = markdownMessageTemplate.raw;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null) {
            ContainsMatchIn = C0ZXP.LIZIZ.containsMatchIn(str2);
        }
        pairArr[7] = new Pair("is_source", String.valueOf((int) ContainsMatchIn));
        String str3 = this.LLILLJJLI.get("group_id");
        if (str3 == null) {
            str3 = this.LLILLJJLI.get("from_group_id");
        }
        pairArr[8] = new Pair("group_id", str3);
        pairArr[9] = new Pair("content_type", this.LLILLJJLI.get("content_type"));
        pairArr[10] = new Pair("message_type_v2", this.LLILLJJLI.get("message_type_v2"));
        PersistentExtraData persistentExtraDataLIZ = C905400ZfW.LIZ(this.LL);
        if (persistentExtraDataLIZ != null && (trackInfoData = persistentExtraDataLIZ.trackInfo) != null) {
            str = trackInfoData.aggregationMessageType;
        }
        pairArr[11] = new Pair("aggregation_message_type", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C1508705vR.LL.getClass();
        mapLJIIJ.putAll(C1508705vR.LIZJ());
        C1508705vR.LIZLLL("ttsocial_aiasst_receive_message", mapLJIIJ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.tryReportReceiveAIReplyMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
