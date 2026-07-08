package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMBotSharePostAnalysis$reportAttachmentBtnClick$1", f = "IMBotSharePostAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1497405tc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1497405tc(String str, InterfaceC1364105Vn<? super C1497405tc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1497405tc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("IMBotSharePostAnalysis@7954.reportAttachmentBtnClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C054G c054g = C05O6.LIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("conversation_id", this.LL);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LL);
        if (c0y8tLIZ != null) {
            C1508705vR.LL.getClass();
            strLIZIZ = C1508705vR.LIZIZ(c0y8tLIZ);
        } else {
            strLIZIZ = "aiasst";
        }
        pairArr[2] = new Pair("chat_type", strLIZIZ);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_aiasst_attachment_btn_click", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMBotSharePostAnalysis@7954.reportAttachmentBtnClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
