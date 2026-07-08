package X;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.14zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20448014zm implements InterfaceC625970Ogt {
    public final C20344714j7 LIZ;

    @Override // X.InterfaceC20344814j8
    public final EnumC20429814wq LJ() {
        this.LIZ.getClass();
        return EnumC20429814wq.SP;
    }

    @Override // X.InterfaceC625970Ogt
    public final Map<String, ?> getAll() {
        return this.LIZ.LJ.getAll();
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZ(String str) {
        C20344714j7 c20344714j7 = this.LIZ;
        c20344714j7.LJFF.remove(str);
        c20344714j7.LJIIJ();
    }

    @Override // X.InterfaceC625970Ogt
    public final boolean contains(String str) {
        return this.LIZ.LJ.contains(str);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZIZ(String str, String str2) {
        C20344714j7 c20344714j7 = this.LIZ;
        c20344714j7.LJFF.putString(str, str2);
        c20344714j7.LJIIJ();
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZJ(String str, int i) {
        C20344714j7 c20344714j7 = this.LIZ;
        c20344714j7.LJFF.putInt(str, i);
        c20344714j7.LJIIJ();
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZLLL(String str, boolean z) {
        C20344714j7 c20344714j7 = this.LIZ;
        c20344714j7.LJFF.putBoolean(str, z);
        c20344714j7.LJIIJ();
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJFF(String str, double d) {
        throw new IllegalAccessError("sp no implement storeDouble method");
    }

    @Override // X.InterfaceC625970Ogt
    public final String[] LJI(String str, String[] strArr) {
        throw new IllegalAccessError("sp no implement getStringArray method");
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJII(String str, String[] strArr) {
        throw new IllegalAccessError("sp no implement storeStringArray method");
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJIIIIZZ(String str, long j) {
        C20344714j7 c20344714j7 = this.LIZ;
        c20344714j7.LJFF.putLong(str, j);
        c20344714j7.LJIIJ();
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJIIIZ(String str, Set<String> set) {
        C20344714j7 c20344714j7 = this.LIZ;
        c20344714j7.LJFF.putStringSet(str, set);
        c20344714j7.LJIIJ();
    }

    @Override // X.InterfaceC625970Ogt
    public final boolean getBoolean(String str, boolean z) {
        return this.LIZ.LJ.getBoolean(str, z);
    }

    @Override // X.InterfaceC625970Ogt
    public final double getDouble(String str, double d) {
        throw new IllegalAccessError("sp no implement getDouble  method");
    }

    @Override // X.InterfaceC625970Ogt
    public final int getInt(String str, int i) {
        return this.LIZ.LJ.getInt(str, i);
    }

    @Override // X.InterfaceC625970Ogt
    public final long getLong(String str, long j) {
        return this.LIZ.LJ.getLong(str, j);
    }

    @Override // X.InterfaceC625970Ogt
    public final String getString(String str, String str2) {
        return this.LIZ.LJ.getString(str, str2);
    }

    @Override // X.InterfaceC625970Ogt
    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.LIZ.LJ.getStringSet(str, set);
    }

    public C20448014zm(int i, C589160N8w c589160N8w, String str, String str2) {
        this.LIZ = new C20344714j7(i, c589160N8w, str, str2);
    }
}
