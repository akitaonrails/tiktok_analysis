package X;

/* JADX INFO: renamed from: X.0Pd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649110Pd7 {
    public final String LIZ;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ;
    public EnumC647870Pb7 LIZJ;
    public final boolean LIZLLL = false;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkCache(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sparkView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", preloadStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prerender=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C649110Pd7(String str, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, EnumC647870Pb7 enumC647870Pb7) {
        this.LIZ = str;
        this.LIZIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LIZJ = enumC647870Pb7;
    }
}
