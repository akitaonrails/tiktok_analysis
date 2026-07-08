package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mn3.e0;

/* JADX INFO: renamed from: X.0t1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1649440t1a extends C1650200t2o implements e0 {
    public final InterfaceC1346105Op LLLIIII;
    public final h0<EnumC1448590nnd> LLLIIIIL;
    public final C385670FAf<EnumC1448590nnd> LLLIIIL;
    public final LiveEvent<Unit> LLLIIL;
    public final LiveEvent<Unit> LLLIILIL;
    public final LiveEvent<Unit> LLLIL;
    public final LiveData<Boolean> LLLILZ;

    @Override // mn3.e0
    public void CT(int i, int i2, boolean z) {
    }

    @Override // mn3.e0
    public void Hi2(int i, int i2, long j) {
    }

    @Override // mn3.e0
    public boolean J61() {
        return false;
    }

    @Override // mn3.e0
    public void Mu0(Boolean bool, Boolean bool2) {
    }

    @Override // mn3.e0
    public void OG2(int i, EnumC1448590nnd enumC1448590nnd) {
    }

    @Override // mn3.e0
    public void QN2(boolean z) {
    }

    @Override // mn3.e0
    public void VE(int i, int i2) {
    }

    @Override // mn3.e0
    public void XB() {
    }

    @Override // mn3.e0
    public void eZ1(FilterBean filterBean) {
    }

    @Override // mn3.e0
    public boolean fU1() {
        return false;
    }

    @Override // mn3.e0
    public void lo1(int i, int i2) {
    }

    @Override // mn3.e0
    public void rM(FilterBean filterBean, Float f) {
    }

    @Override // mn3.e0
    public void vg(boolean z) {
    }

    @Override // mn3.e0
    public void wb2(float f, float f2) {
    }

    @Override // mn3.e0
    public int wn1(int i, VETrackParams vETrackParams) {
        return -1;
    }

    @Override // mn3.e0
    public void zr1(int i, int i2, Function1<? super VECameraSettings.Builder, Unit> function1, VEVideoEncodeSettings vEVideoEncodeSettings, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function12) {
    }

    @Override // mn3.e0
    public InterfaceC2177841ALe Gz0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("not stubbed");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final EnumC1448590nnd LIZIZ() {
        int i = ((C2260671De5) this.LLLIIII.LJI().getValue()).LIZIZ;
        if (i <= 0) {
            return EnumC1448590nnd.RATIO_9_16;
        }
        float f = r0.LIZ / i;
        EnumC1448590nnd[] enumC1448590nndArrValues = EnumC1448590nnd.values();
        int i2 = 1;
        if (enumC1448590nndArrValues.length != 0) {
            EnumC1448590nnd enumC1448590nnd = enumC1448590nndArrValues[0];
            int length = enumC1448590nndArrValues.length - 1;
            if (length != 0) {
                float fAbs = Math.abs(enumC1448590nnd.getRatio() - f);
                if (1 <= length) {
                    while (true) {
                        EnumC1448590nnd enumC1448590nnd2 = enumC1448590nndArrValues[i2];
                        float fAbs2 = Math.abs(enumC1448590nnd2.getRatio() - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            enumC1448590nnd = enumC1448590nnd2;
                            fAbs = fAbs2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (enumC1448590nnd != null) {
                return enumC1448590nnd;
            }
        }
        return EnumC1448590nnd.RATIO_9_16;
    }

    @Override // mn3.e0
    public C1660560tJW dq2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("not stubbed");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // mn3.e0
    public EnumC1448590nnd kR1() {
        EnumC1448590nnd enumC1448590nndLIZJ = this.LLLIIIIL.LIZJ();
        return enumC1448590nndLIZJ == null ? EnumC1448590nnd.RATIO_9_16 : enumC1448590nndLIZJ;
    }

    @Override // mn3.e0
    public C1655760tBm qd1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("not stubbed");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // mn3.e0
    public int zA2() {
        return kR1().ordinal();
    }

    @Override // mn3.e0
    public LiveEvent<Unit> XJ2() {
        return this.LLLIIL;
    }

    @Override // mn3.e0
    public LiveEvent<Unit> cI() {
        return this.LLLIILIL;
    }

    @Override // mn3.e0
    public LiveData<Boolean> ci0() {
        return this.LLLILZ;
    }

    @Override // mn3.e0
    public C385670FAf<EnumC1448590nnd> dk() {
        return this.LLLIIIL;
    }

    @Override // mn3.e0
    public LiveEvent<Unit> j42() {
        return this.LLLIL;
    }

    public C1649440t1a(LifecycleOwner lifecycleOwner, InterfaceC1346105Op interfaceC1346105Op) {
        this.LLLIIII = interfaceC1346105Op;
        h0<EnumC1448590nnd> h0Var = new h0<>(LIZIZ());
        this.LLLIIIIL = h0Var;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1346205Oq(this, null), 3);
        this.LLLIIIL = h0Var;
        this.LLLIIL = new C560530Lyd();
        this.LLLIILIL = new C560530Lyd();
        this.LLLIL = new C560530Lyd();
        this.LLLILZ = new MutableLiveData(Boolean.FALSE);
    }
}
