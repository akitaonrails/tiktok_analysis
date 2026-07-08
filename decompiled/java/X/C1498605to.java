package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05to, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$tryReportImSuggestReplyShow$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1498605to extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0Y8T LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498605to(String str, String str2, String str3, String str4, C0Y8T c0y8t, String str5, InterfaceC1364105Vn<? super C1498605to> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = c0y8t;
        this.LLILZLL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1498605to(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.tryReportImSuggestReplyShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1508705vR c1508705vR = C1508705vR.LL;
        C0Y8T c0y8t = this.LLILZIL;
        c1508705vR.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", this.LL), new Pair("inbox_mode", this.LLILLJJLI), new Pair("reply_message_id", this.LLILLL), new Pair("to_user_id", this.LLILZ), new Pair("chat_type", C1508705vR.LIZIZ(c0y8t)), new Pair("conversation_id", this.LLILZIL.getConversationId()), new Pair("suggest_reply_source", this.LLILZLL));
        mapLJIIJ.putAll(C1508705vR.LIZJ());
        C1508705vR.LIZLLL("ttsocial_aiasst_suggestreply_show", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.tryReportImSuggestReplyShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
