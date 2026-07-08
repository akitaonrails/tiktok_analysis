package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1563340qmi extends LifecycleRegistry implements InterfaceC1563360qmk {
    public final LifecycleOwner LL;
    public final int[] LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public boolean LIZIZ() {
        return false;
    }

    public String LJ() {
        return "mainSAF";
    }

    public boolean LJII() {
        return false;
    }

    public AbstractC1563340qmi(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LL = lifecycleOwner;
        int length = EnumC682280QpW.values().length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = 1;
        }
        this.LLILLJJLI = iArr;
        this.LLILLL = C452501pT.LIZIZ(new C1563350qmj(this));
        this.LLILZ = C452501pT.LIZIZ(new C1555080qZO(this));
    }

    public final void LIZJ(EnumC682280QpW enumC682280QpW) {
        synchronized (this.LLILLJJLI) {
            try {
                int[] iArr = this.LLILLJJLI;
                int iOrdinal = enumC682280QpW.ordinal();
                iArr[iOrdinal] = iArr[iOrdinal] + 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(int i) {
        synchronized (this.LLILLJJLI) {
            try {
                for (EnumC682280QpW enumC682280QpW : EnumC682280QpW.values()) {
                    if ((enumC682280QpW.getValue() & i) != 0) {
                        int[] iArr = this.LLILLJJLI;
                        int iOrdinal = enumC682280QpW.ordinal();
                        int i2 = this.LLILLJJLI[enumC682280QpW.ordinal()] - 1;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        iArr[iOrdinal] = i2;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJI(EnumC682280QpW enumC682280QpW) {
        if (this.LLILLJJLI[enumC682280QpW.ordinal()] == 0) {
            if (this.LLILLJJLI[EnumC682280QpW.MAIN.ordinal()] == 0 && LIZIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1563360qmk
    public final <T> T LIZ(EnumC682280QpW enumC682280QpW, Function0<? extends T> function0) {
        LIZJ(enumC682280QpW);
        T tInvoke = function0.invoke();
        synchronized (this.LLILLJJLI) {
            try {
                int[] iArr = this.LLILLJJLI;
                int iOrdinal = enumC682280QpW.ordinal();
                int i = this.LLILLJJLI[enumC682280QpW.ordinal()] - 1;
                if (i < 0) {
                    i = 0;
                }
                iArr[iOrdinal] = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }
}
