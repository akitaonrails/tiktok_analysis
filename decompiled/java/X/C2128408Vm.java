package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ECMixMallPreloadTask$run$1", f = "ECMixMallPreloadTask.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C2128408Vm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2128408Vm(InterfaceC1364105Vn<? super C2128408Vm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2128408Vm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMixMallPreloadTask@a95a.run$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECMixMallPreloadTask start, fromColdStart=");
            sbLIZ.append(System.currentTimeMillis() - C1150504el.LIZ().LJJII);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ec_mmk_cold_start", strLIZIZ);
            C1770990wBd c1770990wBd = C1770990wBd.LIZ;
            if (((Boolean) C1770990wBd.LIZIZ.getValue()).booleanValue()) {
                this.LL = 1;
                if (c1770990wBd.LIZLLL(true, this) == objLJFF) {
                    C1C7U.LIZIZ("ECMixMallPreloadTask@a95a.run$1");
                    return objLJFF;
                }
            }
        }
        C1770900wBU.LIZ.getClass();
        C1770900wBU.LJIIIIZZ(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMixMallPreloadTask@a95a.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2128408Vm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
