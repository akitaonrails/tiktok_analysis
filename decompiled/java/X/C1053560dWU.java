package X;

import com.ss.android.ugc.aweme.web.performance.WebHistorySaveLimitOptSwitchModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryManager$uploadAdWebHistory$1", f = "AdWebHistoryManager.kt", l = {195, 197}, m = "invokeSuspend")
public final class C1053560dWU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1053550dWT LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053560dWU(C1053550dWT c1053550dWT, int i, InterfaceC1364105Vn<? super C1053560dWU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1053550dWT;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1053560dWU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("AdWebHistoryManager@40b0.uploadAdWebHistory$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList arrayList = (ArrayList) this.LLILLJJLI.LIZIZ().LIZJ();
            if (arrayList.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AdWebHistoryManager@40b0.uploadAdWebHistory$1");
                return unit;
            }
            C1053710dWj.LIZ.getClass();
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            WebHistorySaveLimitOptSwitchModel webHistorySaveLimitOptSwitchModel = C1053710dWj.LIZIZ;
            WebHistorySaveLimitOptSwitchModel webHistorySaveLimitOptSwitchModel2 = (WebHistorySaveLimitOptSwitchModel) c0c64LJIILLIIL.LJJII(WebHistorySaveLimitOptSwitchModel.class, webHistorySaveLimitOptSwitchModel, "ad_history_save_limit_opt_switch", true);
            if (webHistorySaveLimitOptSwitchModel2 != null) {
                webHistorySaveLimitOptSwitchModel = webHistorySaveLimitOptSwitchModel2;
            }
            if (webHistorySaveLimitOptSwitchModel.enableHistorySaveLimitOpt) {
                int size = arrayList.size();
                int i2 = webHistorySaveLimitOptSwitchModel.historySaveLimit;
                if (size > i2) {
                    C1053550dWT c1053550dWT = this.LLILLJJLI;
                    int i3 = this.LLILLL;
                    int i4 = webHistorySaveLimitOptSwitchModel.historySaveLimitMaxBatches;
                    this.LL = 1;
                    obj = c1053550dWT.LJIIJ(arrayList, i3, i2, i4, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("AdWebHistoryManager@40b0.uploadAdWebHistory$1");
                        return objLJFF;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
            }
            C1053550dWT c1053550dWT2 = this.LLILLJJLI;
            int i5 = this.LLILLL;
            this.LL = 2;
            obj = c1053550dWT2.LJIIJJI(i5, arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AdWebHistoryManager@40b0.uploadAdWebHistory$1");
                return objLJFF;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        if (zBooleanValue) {
            this.LLILLJJLI.LIZIZ().LIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryManager@40b0.uploadAdWebHistory$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
