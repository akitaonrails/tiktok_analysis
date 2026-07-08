package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIAsstChatSettingClick$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1500105u3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1684406ig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500105u3(EnumC1684406ig enumC1684406ig, InterfaceC1364105Vn<? super C1500105u3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1684406ig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1500105u3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String toEnterFromMobValue;
        String toEnterMethodMobValue;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstChatSettingClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1684406ig enumC1684406ig = this.LL;
        String str = "";
        if (enumC1684406ig == null || (toEnterFromMobValue = enumC1684406ig.getToEnterFromMobValue()) == null) {
            toEnterFromMobValue = "";
        }
        EnumC1684406ig enumC1684406ig2 = this.LL;
        if (enumC1684406ig2 != null && (toEnterMethodMobValue = enumC1684406ig2.getToEnterMethodMobValue()) != null) {
            str = toEnterMethodMobValue;
        }
        C1508705vR c1508705vR = C1508705vR.LL;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", toEnterFromMobValue), new Pair("enter_method", str));
        c1508705vR.getClass();
        mapLJIIJ.putAll(C1508705vR.LIZJ());
        C1508705vR.LIZLLL("ttsocial_aiasst_chat_setting_click", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstChatSettingClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
