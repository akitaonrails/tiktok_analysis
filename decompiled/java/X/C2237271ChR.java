package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS0S1100010_34;
import kotlin.jvm.internal.AwS148S1200000_34;
import kotlin.jvm.internal.AwS16S1100100_34;
import kotlin.jvm.internal.AwS26S1110000_34;
import kotlin.jvm.internal.AwS39S1101000_34;
import kotlin.jvm.internal.AwS68S2100000_34;

/* JADX INFO: renamed from: X.1ChR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237271ChR extends AbstractC2192251Ar1 {
    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final Map<String, ?> getAll() {
        throw null;
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZ(String str) {
        throw null;
    }

    public C2237271ChR(InterfaceC625970Ogt interfaceC625970Ogt, InterfaceC2237281ChS interfaceC2237281ChS) {
        super(interfaceC625970Ogt);
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZIZ(String str, String str2) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "String", str2, str2.length(), new AwS68S2100000_34(this, str, str2, 1));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZJ(String str, int i) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "Int", Integer.valueOf(i), -1, new AwS39S1101000_34(this, str, i, 1));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LIZLLL(String str, boolean z) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "Boolean", Boolean.valueOf(z), -1, new AwS26S1110000_34(this, str, z, 1));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJFF(String str, double d) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "Double", Double.valueOf(d), -1, new AwS0S1100010_34(this, str, d, 1));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final String[] LJI(String str, String[] strArr) {
        return (String[]) C2237251ChP.LIZ(null, this.LIZ, str, "Array", new AwS148S1200000_34(this, str, strArr, 0));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJII(String str, String[] strArr) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "Array", strArr, strArr.length, new AwS148S1200000_34(this, str, strArr, 2));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJIIIIZZ(String str, long j) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "Long", Long.valueOf(j), -1, new AwS16S1100100_34(this, str, j, 1));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final void LJIIIZ(String str, Set<String> set) {
        C2237251ChP.LIZIZ(null, this.LIZ, str, "StringSet", set, set.size(), new AwS148S1200000_34(this, (C2237271ChR) str, (String) set, (Set<String>) 3));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final boolean getBoolean(String str, boolean z) {
        Boolean bool = (Boolean) C2237251ChP.LIZ(null, this.LIZ, str, "Boolean", new AwS26S1110000_34(this, str, z, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final double getDouble(String str, double d) {
        Double d2 = (Double) C2237251ChP.LIZ(null, this.LIZ, str, "Double", new AwS0S1100010_34(this, str, d, 0));
        if (d2 == null) {
            return d;
        }
        return d2.doubleValue();
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final int getInt(String str, int i) {
        Integer num = (Integer) C2237251ChP.LIZ(null, this.LIZ, str, "Int", new AwS39S1101000_34(this, str, i, 0));
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final long getLong(String str, long j) {
        Long l = (Long) C2237251ChP.LIZ(null, this.LIZ, str, "Long", new AwS16S1100100_34(this, str, j, 0));
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final String getString(String str, String str2) {
        return (String) C2237251ChP.LIZ(null, this.LIZ, str, "String", new AwS68S2100000_34(this, str, str2, 0));
    }

    @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
    public final Set<String> getStringSet(String str, Set<String> set) {
        return (Set) C2237251ChP.LIZ(null, this.LIZ, str, "StringSet", new AwS148S1200000_34(this, (C2237271ChR) str, (String) set, (Set<String>) 1));
    }
}
