package X;

import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182710gsn {
    public final PoiQuizPageVM LIZ;
    public EnumC1182690gsl LIZIZ;
    public EnumC1182750gsr LIZJ;

    public C1182710gsn(PoiQuizPageVM poiQuizPageVM) {
        this.LIZ = poiQuizPageVM;
    }

    public final synchronized void LIZIZ(EnumC1182690gsl enumC1182690gsl) {
        this.LIZIZ = enumC1182690gsl;
        PoiQuizPageVM poiQuizPageVM = this.LIZ;
        poiQuizPageVM.getClass();
        poiQuizPageVM.setStateImmediate(new AwS597S0100000_18(poiQuizPageVM, 992));
    }

    public final synchronized void LIZ(EnumC1182750gsr enumC1182750gsr, String str) {
        String str2;
        this.LIZJ = enumC1182750gsr;
        PoiQuizPageVM poiQuizPageVM = this.LIZ;
        C1175020ggO c1175020ggO = poiQuizPageVM.LLILLJJLI;
        if (c1175020ggO != null) {
            str2 = c1175020ggO.LIZ;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            poiQuizPageVM.LLILLJJLI = new C1175020ggO(str, true);
        }
        PoiQuizPageVM poiQuizPageVM2 = this.LIZ;
        poiQuizPageVM2.getClass();
        poiQuizPageVM2.setStateImmediate(new AwS597S0100000_18(poiQuizPageVM2, 992));
    }
}
