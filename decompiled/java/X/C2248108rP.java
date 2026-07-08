package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextFontBean$isFontFileExit$2", f = "EffectTextBean.kt", l = {}, m = "invokeSuspend")
public final class C2248108rP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C2280608we LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248108rP(C2280608we c2280608we, InterfaceC1364105Vn<? super C2248108rP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2280608we;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2248108rP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectTextFontBean@15d9.isFontFileExit$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (!C2223808nU.LIZ(this.LL.effect)) {
                C1C7U.LIZIZ("EffectTextFontBean@15d9.isFontFileExit$2");
                return false;
            }
            Boolean boolValueOf = Boolean.valueOf(new C0VSJ(this.LL.LL.LIZ).exists());
            C1C7U.LIZIZ("EffectTextFontBean@15d9.isFontFileExit$2");
            return boolValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("EffectTextFontBean@15d9.isFontFileExit$2");
            return false;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
