package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeResponseCacheManager$preload$1", f = "TakoSubModeResponseCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1860430yVt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860430yVt(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860430yVt(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        TakoNewActionBarListResponse takoNewActionBarListResponseLIZLLL;
        C1C7U.LIZ("TakoSubModeResponseCacheManager@fab.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        String str = this.LL;
        c1860520yW2.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_sub_mode_response_");
        sbLIZ.append(str);
        String string = kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        TakoAdditonalPanelListResponse takoAdditonalPanelListResponseLIZ = null;
        if (z) {
            takoNewActionBarListResponseLIZLLL = C1860390yVp.LIZLLL(string);
        } else {
            takoNewActionBarListResponseLIZLLL = null;
        }
        String str2 = this.LL;
        Keva kevaLJIIL2 = C1860520yW2.LJIIL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tako_additonal_panel_list_response_");
        sbLIZ2.append(str2);
        String string2 = kevaLJIIL2.getString(C2188811AlT.LIZIZ(sbLIZ2), "");
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ() && string2.length() > 0) {
            takoAdditonalPanelListResponseLIZ = C1860390yVp.LIZ(string2);
        }
        Object obj2 = C1860470yVx.LIZJ;
        long j = this.LLILLJJLI;
        String str3 = this.LL;
        synchronized (obj2) {
            try {
                if (j != C1860470yVx.LIZLLL) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoSubModeResponseCacheManager@fab.preload$1");
                    return unit;
                }
                C1860470yVx.LIZ.getClass();
                C1860470yVx.LIZ().put(str3, new C1860460yVw(takoNewActionBarListResponseLIZLLL, takoAdditonalPanelListResponseLIZ));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoSubModeResponseCacheManager@fab.preload$1");
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
