package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11UM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBean$parseEffectTextRes$2", f = "EffectTextBean.kt", l = {44}, m = "invokeSuspend")
public final class C11UM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11UK LLILLJJLI;
    public final /* synthetic */ List<C2280608we> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11UM(C11UK c11uk, List<C2280608we> list, Context context, InterfaceC1364105Vn<? super C11UM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11uk;
        this.LLILLL = list;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11UM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EffectTextBean@5b1.parseEffectTextRes$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (!this.LLILLJJLI.LLILLL.ifStandard) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LLILLJJLI.effect.getUnzipPath());
                    sbLIZ.append(File.separator);
                    sbLIZ.append("effect_text.json");
                    OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) C123O.LIZ().LJFF(new C0VSF(C2188811AlT.LIZIZ(sbLIZ)), OuterEffectTextLayoutConfig.class);
                    C2238608ps c2238608ps = C2108108Nr.LIZ;
                    C12K7 c12k7 = new C12K7(this.LLILLL, this.LLILLJJLI, outerEffectTextLayoutConfig, this.LLILZ, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, c2238608ps, c12k7) == objLJFF) {
                        C1C7U.LIZIZ("EffectTextBean@5b1.parseEffectTextRes$2");
                        return objLJFF;
                    }
                }
            }
            unit = Unit.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C122D c122dLIZIZ = C123O.LIZIZ();
            if (c122dLIZIZ != null) {
                c122dLIZIZ.LIZIZ(e);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        }
        C1C7U.LIZIZ("EffectTextBean@5b1.parseEffectTextRes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
