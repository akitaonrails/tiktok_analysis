package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportCommonTagShow$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1499205tu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499205tu(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC1364105Vn<? super C1499205tu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499205tu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportCommonTagShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<String> set = C1508705vR.LLIZLLLIL;
        String str = this.LLIZLLLIL;
        synchronized (set) {
            try {
                if (!set.add(str)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportCommonTagShow$1");
                    return unit;
                }
                C1508705vR c1508705vR = C1508705vR.LL;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", this.LL), new Pair("chat_type", this.LLILLJJLI), new Pair("is_self", this.LLILLL), new Pair("reply_message_id", this.LLILZ), new Pair("to_user_id", this.LLILZIL), new Pair("conversation_id", this.LLILZLL), new Pair("tag_type", this.LLIZ));
                c1508705vR.getClass();
                mapLJIIJ.putAll(C1508705vR.LIZJ());
                C1508705vR.LIZLLL("ttsocial_aiasst_common_tag_show", mapLJIIJ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportCommonTagShow$1");
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
