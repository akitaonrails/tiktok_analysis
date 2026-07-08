package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.14j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20344314j3 implements InterfaceC625970Ogt {
    public final String LIZ;
    public final String LIZIZ;
    public final C589160N8w LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C20344414j4(this));
    public final Keva LJ;

    @Override // X.InterfaceC625970Ogt
    public final Map<String, ?> getAll() {
        return this.LJ.getAll();
    }

    @Override // X.InterfaceC20344814j8
    public final EnumC20429814wq LJ() {
        return EnumC20429814wq.KEVA;
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZ(String str) {
        this.LJ.erase(str);
    }

    @Override // X.InterfaceC625970Ogt
    public final boolean contains(String str) {
        return this.LJ.contains(str);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZIZ(String str, String str2) {
        this.LJ.storeString(str, str2);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZJ(String str, int i) {
        this.LJ.storeInt(str, i);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LIZLLL(String str, boolean z) {
        this.LJ.storeBoolean(str, z);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJFF(String str, double d) {
        this.LJ.storeDouble(str, d);
    }

    @Override // X.InterfaceC625970Ogt
    public final String[] LJI(String str, String[] strArr) {
        return this.LJ.getStringArray(str, strArr);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJII(String str, String[] strArr) {
        this.LJ.storeStringArray(str, strArr);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJIIIIZZ(String str, long j) {
        this.LJ.storeLong(str, j);
    }

    @Override // X.InterfaceC625970Ogt
    public final void LJIIIZ(String str, Set<String> set) {
        this.LJ.storeStringSet(str, set);
    }

    @Override // X.InterfaceC625970Ogt
    public final boolean getBoolean(String str, boolean z) {
        return this.LJ.getBoolean(str, z);
    }

    @Override // X.InterfaceC625970Ogt
    public final double getDouble(String str, double d) {
        return this.LJ.getDouble(str, d);
    }

    @Override // X.InterfaceC625970Ogt
    public final int getInt(String str, int i) {
        return this.LJ.getInt(str, i);
    }

    @Override // X.InterfaceC625970Ogt
    public final long getLong(String str, long j) {
        return this.LJ.getLong(str, j);
    }

    @Override // X.InterfaceC625970Ogt
    public final String getString(String str, String str2) {
        return this.LJ.getString(str, str2);
    }

    @Override // X.InterfaceC625970Ogt
    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.LJ.getStringSet(str, set);
    }

    public C20344314j3(int i, C589160N8w c589160N8w, String str, String str2) {
        Keva repo;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c589160N8w;
        String strLIZIZ = C2192411ArH.LIZIZ(str2, c589160N8w, EnumC20429814wq.KEVA, str);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            repo = Keva.getRepoWithPath(str, strLIZIZ, i, false);
        } else {
            repo = Keva.getRepo(str, i);
        }
        this.LJ = repo;
    }
}
