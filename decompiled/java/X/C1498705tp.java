package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportSourceReferenceShow$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1498705tp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498705tp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InterfaceC1364105Vn<? super C1498705tp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1498705tp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportSourceReferenceShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        String str2 = this.LLILLJJLI;
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set<String> set = C1508705vR.LLIZ;
        synchronized (set) {
            try {
                if (!set.add(strLIZIZ)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportSourceReferenceShow$1");
                    return unit;
                }
                C1508705vR c1508705vR = C1508705vR.LL;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("conversation_id", this.LL), new Pair("enter_from", this.LLILLL), new Pair("chat_type", this.LLILZ), new Pair("is_self", this.LLILZIL), new Pair("reference_type", this.LLILZLL), new Pair("reference_content_type", this.LLIZ), new Pair("reply_message_id", this.LLIZLLLIL), new Pair("to_user_id", this.LLJ));
                c1508705vR.getClass();
                C1508705vR.LIZLLL("ttsocial_aiasst_source_reference_show", mapLJIIIIZZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportSourceReferenceShow$1");
                return unit2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
