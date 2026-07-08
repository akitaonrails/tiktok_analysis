package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS139S0101000_34;
import kotlin.jvm.internal.AwS148S1100000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS495S0200000_34;
import kotlin.jvm.internal.AwS60S0100100_34;

/* JADX INFO: renamed from: X.1Aqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192231Aqz extends AbstractC2192251Ar1 {
    public final InterfaceC625970Ogt LIZIZ;
    public HashMap<String, String> LIZJ;

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZ(String str) {
        super.LIZ(str);
    }

    public final String LJJI(String str) {
        String str2 = this.LIZJ.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final boolean contains(String str) {
        return super.contains(str);
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZIZ(String str, String str2) {
        LJJIII(str, new AwS148S1100000_34(this, str2, 16));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZJ(String str, int i) {
        LJJIII(str, new AwS139S0101000_34(i, this, 0));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZLLL(String str, boolean z) {
        LJJIII(str, new C2190381Ao0(this, z));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJFF(String str, double d) {
        LJJIII(str, new C2192321Ar8(d, this));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final String[] LJI(String str, String[] strArr) {
        return (String[]) LJJIFFI(str, new AwS495S0200000_34(this, strArr, 0));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJII(String str, String[] strArr) {
        LJJIII(str, new AwS400S0200000_34(this, strArr, 40));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJIIIIZZ(String str, long j) {
        LJJIII(str, new AwS60S0100100_34(j, this, 1));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJIIIZ(String str, Set<String> set) {
        LJJIII(str, new AwS400S0200000_34(this, (C2192231Aqz) set, (Set<String>) 41));
    }

    public final Object LJJIFFI(String str, InterfaceC1631620sYq interfaceC1631620sYq) {
        Object objInvoke;
        if (super.contains(str)) {
            String strLJJI = LJJI(str);
            if (this.LIZIZ.contains(strLJJI)) {
                this.LIZIZ.LIZ(strLJJI);
            }
            Boolean bool = Boolean.FALSE;
            return interfaceC1631620sYq.invoke(str, bool, bool);
        }
        if (this.LIZJ.containsKey(str)) {
            if (super.contains(str)) {
                Boolean bool2 = Boolean.FALSE;
                return interfaceC1631620sYq.invoke(str, bool2, bool2);
            }
            synchronized (Boolean.TYPE) {
                try {
                    if (!super.contains(str)) {
                        objInvoke = interfaceC1631620sYq.invoke(str, Boolean.FALSE, Boolean.TRUE);
                    } else {
                        Boolean bool3 = Boolean.FALSE;
                        objInvoke = interfaceC1631620sYq.invoke(str, bool3, bool3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            String strLJJI2 = LJJI(str);
            if (!this.LIZIZ.contains(strLJJI2)) {
                return objInvoke;
            }
            this.LIZIZ.LIZ(strLJJI2);
            return objInvoke;
        }
        Boolean bool4 = Boolean.FALSE;
        return interfaceC1631620sYq.invoke(str, bool4, bool4);
    }

    public final void LJJIII(String str, Function1<? super String, Unit> function1) {
        if (!super.contains(str) && this.LIZJ.containsKey(str)) {
            synchronized (Boolean.TYPE) {
                try {
                    function1.invoke(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        function1.invoke(str);
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) LJJIFFI(str, new C2192291Ar5(this, z))).booleanValue();
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final double getDouble(String str, double d) {
        return ((Number) LJJIFFI(str, new C2192301Ar6(d, this))).doubleValue();
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final int getInt(String str, int i) {
        return ((Number) LJJIFFI(str, new C2192241Ar0(i, this))).intValue();
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final long getLong(String str, long j) {
        return ((Number) LJJIFFI(str, new C2192271Ar3(j, this))).longValue();
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final String getString(String str, String str2) {
        return (String) LJJIFFI(str, new C2192281Ar4(this, str2));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final Set<String> getStringSet(String str, Set<String> set) {
        return (Set) LJJIFFI(str, new AwS495S0200000_34(this, set, 1));
    }

    public C2192231Aqz(InterfaceC625970Ogt interfaceC625970Ogt, InterfaceC625970Ogt interfaceC625970Ogt2, HashMap<String, String> map) {
        super(interfaceC625970Ogt2);
        this.LIZIZ = interfaceC625970Ogt;
        this.LIZJ = map;
    }

    public final void LJJII(String str, Function2 function2, Object obj) {
        if (!super.contains(str)) {
            function2.invoke(str, obj);
        }
    }
}
