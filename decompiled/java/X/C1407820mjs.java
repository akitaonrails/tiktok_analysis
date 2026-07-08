package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.titlebar.component.AiChatTitleBarFeatureComponent$initData$1$1", f = "AiChatTitleBarFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407820mjs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1408150mkP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407820mjs(C1408150mkP c1408150mkP, InterfaceC1364105Vn<? super C1407820mjs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1408150mkP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407820mjs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatTitleBarFeatureComponent@2681.initData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1408150mkP c1408150mkP = this.LL;
        C1727006pY.LIZ.getClass();
        C1727006pY.LIZJ();
        Keva keva = C1727106pZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_quota_max");
        sbLIZ.append(C1727106pZ.LIZIZ());
        c1408150mkP.LLJJI = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 5);
        this.LL.LLJJIII = C1727006pY.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatTitleBarFeatureComponent@2681.initData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
