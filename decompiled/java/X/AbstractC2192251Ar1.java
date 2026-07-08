package X;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1Ar1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2192251Ar1 implements InterfaceC625970Ogt {
    public InterfaceC625970Ogt LIZ;

    @Override // X.InterfaceC20344814j8
    public EnumC20429814wq LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.InterfaceC625970Ogt
    public Map<String, ?> getAll() {
        return this.LIZ.getAll();
    }

    public AbstractC2192251Ar1(InterfaceC625970Ogt interfaceC625970Ogt) {
        this.LIZ = interfaceC625970Ogt;
    }

    @Override // X.InterfaceC625970Ogt
    public void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // X.InterfaceC625970Ogt
    public boolean contains(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.InterfaceC625970Ogt
    public void LIZIZ(String str, String str2) {
        this.LIZ.LIZIZ(str, str2);
    }

    @Override // X.InterfaceC625970Ogt
    public void LIZJ(String str, int i) {
        this.LIZ.LIZJ(str, i);
    }

    @Override // X.InterfaceC625970Ogt
    public void LIZLLL(String str, boolean z) {
        this.LIZ.LIZLLL(str, z);
    }

    @Override // X.InterfaceC625970Ogt
    public void LJFF(String str, double d) {
        this.LIZ.LJFF(str, d);
    }

    @Override // X.InterfaceC625970Ogt
    public String[] LJI(String str, String[] strArr) {
        return this.LIZ.LJI(str, strArr);
    }

    @Override // X.InterfaceC625970Ogt
    public void LJII(String str, String[] strArr) {
        this.LIZ.LJII(str, strArr);
    }

    @Override // X.InterfaceC625970Ogt
    public void LJIIIIZZ(String str, long j) {
        this.LIZ.LJIIIIZZ(str, j);
    }

    @Override // X.InterfaceC625970Ogt
    public void LJIIIZ(String str, Set<String> set) {
        this.LIZ.LJIIIZ(str, set);
    }

    @Override // X.InterfaceC625970Ogt
    public boolean getBoolean(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    @Override // X.InterfaceC625970Ogt
    public double getDouble(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // X.InterfaceC625970Ogt
    public int getInt(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // X.InterfaceC625970Ogt
    public long getLong(String str, long j) {
        return this.LIZ.getLong(str, j);
    }

    @Override // X.InterfaceC625970Ogt
    public String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    @Override // X.InterfaceC625970Ogt
    public Set<String> getStringSet(String str, Set<String> set) {
        return this.LIZ.getStringSet(str, set);
    }
}
