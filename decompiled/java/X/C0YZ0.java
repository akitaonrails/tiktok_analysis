package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0YZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YZ0 implements C0YEV {
    public final SharedPreferences LIZ;

    @Override // X.C0YEV
    public final void clearAll() {
        this.LIZ.edit().clear().commit();
    }

    @Override // X.C0YEV
    public final boolean getBoolean(String str) {
        return this.LIZ.getBoolean(str, false);
    }

    @Override // X.C0YEV
    public final int getInt(String str) {
        return this.LIZ.getInt(str, 0);
    }

    public C0YZ0(C0YEM c0yem, String str) {
        this.LIZ = C810670Vr7.LIZJ(c0yem.LJ().LJ().getApplicationContext(), 0, str);
        C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultSP constructor, spName:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0YEV
    public final void LIZ(Long l, String str) {
        this.LIZ.edit().putLong(str, l.longValue()).commit();
    }

    @Override // X.C0YEV
    public final long LIZIZ(Long l, String str) {
        return this.LIZ.getLong(str, l.longValue());
    }

    @Override // X.C0YEV
    public final String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    @Override // X.C0YEV
    public final void putBoolean(String str, boolean z) {
        this.LIZ.edit().putBoolean(str, z).commit();
    }

    @Override // X.C0YEV
    public final void putInt(String str, int i) {
        this.LIZ.edit().putInt(str, i).commit();
    }

    @Override // X.C0YEV
    public final void putString(String str, String str2) {
        this.LIZ.edit().putString(str, str2).commit();
    }
}
