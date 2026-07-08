package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIAsstChatEnter$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1498405tm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498405tm(String str, String str2, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1498405tm(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String mobValue;
        String str;
        C05RV c05rvLIZJ;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstChatEnter$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1508705vR c1508705vR = C1508705vR.LL;
        Pair[] pairArr = new Pair[4];
        INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
        if (iNoticeService == null || (c05rvLIZJ = iNoticeService.LIZJ()) == null || (mobValue = c05rvLIZJ.getMobValue()) == null) {
            mobValue = "";
        }
        pairArr[0] = new Pair("inbox_mode", mobValue);
        pairArr[1] = new Pair("enter_from", this.LL);
        if (this.LLILLJJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_top", str);
        pairArr[3] = new Pair("enter_method", this.LLILLL);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1508705vR.getClass();
        C1508705vR.LIZLLL("ttsocial_aiasst_chat_enter", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstChatEnter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
