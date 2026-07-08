package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIAsstChatTopClick$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1500005u2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1684406ig LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500005u2(EnumC1684406ig enumC1684406ig, boolean z, InterfaceC1364105Vn<? super C1500005u2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1684406ig;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1500005u2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String toEnterFromMobValue;
        String str;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstChatTopClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1684406ig enumC1684406ig = this.LL;
        if (enumC1684406ig == null || (toEnterFromMobValue = enumC1684406ig.getToEnterFromMobValue()) == null) {
            toEnterFromMobValue = "";
        }
        if (this.LLILLJJLI) {
            str = "on";
        } else {
            str = "off";
        }
        C1508705vR c1508705vR = C1508705vR.LL;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", toEnterFromMobValue), new Pair("to_status", str));
        c1508705vR.getClass();
        C1508705vR.LIZLLL("ttsocial_aiasst_chat_top_click", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstChatTopClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
