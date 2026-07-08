package X;

import Y.AComparatorS44S0000000_25;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634780sdw {
    public static final C1465340oEe LJI = new C1465340oEe();
    public static volatile C1634780sdw LJII;
    public final String LIZ;
    public InterfaceC1640930snr LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS214S0000000_25.get$arr$(375));
    public final MutableLiveData<List<C1635170seZ>> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<List<C1635170seZ>> LJ = new MutableLiveData<>();
    public final ConcurrentHashMap<ProviderEffect, Effect> LJFF = new ConcurrentHashMap<>();

    public final InterfaceC1634800sdy LIZJ() {
        return (InterfaceC1634800sdy) this.LIZJ.getValue();
    }

    public final List<C1635170seZ> LIZIZ() {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS44S0000000_25(3), LIZJ().LJFF(this.LIZ));
        return listLJLLLL.isEmpty() ? C13BV.INSTANCE : C13LP.LJLIL(listLJLLLL, LIZJ().LJI(this.LIZ));
    }

    public C1634780sdw(String str) {
        this.LIZ = str;
    }

    public final MutableLiveData LJ(EnumC1465290oEZ enumC1465290oEZ) {
        int i = C1465300oEa.LIZ[enumC1465290oEZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new MutableLiveData();
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL())), null, null, new C1420305hB(this, null), 3);
            return this.LJ;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL())), null, null, new C1420205hA(this, null), 3);
        return this.LIZLLL;
    }

    public final void LJFF(C1635170seZ c1635170seZ) {
        if (C703302op.LIZ(c1635170seZ.LJ)) {
            this.LIZLLL.postValue(LIZIZ());
        } else {
            if (!C703302op.LIZ(c1635170seZ.LIZLLL)) {
                return;
            }
            this.LJ.postValue(LIZJ().LIZJ(this.LIZ));
        }
    }

    public final AbstractC1634810sdz LIZ(String str, String str2) {
        InterfaceC1640930snr interfaceC1640930snr;
        if (str2 != null && (interfaceC1640930snr = this.LIZIZ) != null) {
            interfaceC1640930snr.LJ();
        }
        C1635170seZ c1635170seZ = (C1635170seZ) C13LP.LJJJLL(LIZJ().LIZLLL(this.LIZ, str, str2));
        if (c1635170seZ == null) {
            return new C1634820se0();
        }
        try {
            LIZJ().LIZ(this.LIZ, str, str2);
            LJFF(c1635170seZ);
            return C1634830se1.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return new C1634820se0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1635170seZ r16, X.InterfaceC1364105Vn<? super X.AbstractC1634810sdz> r17) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1634780sdw.LIZLLL(X.0seZ, X.05Vn):java.lang.Object");
    }
}
