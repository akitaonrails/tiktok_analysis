package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.10eU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19296810eU implements InterfaceC1910030znt {
    public final String LIZ;
    public final String LIZIZ;
    public Locale LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // X.InterfaceC1910030znt
    public final Locale getLocale() {
        if (this.LIZJ == null) {
            this.LIZJ = new Locale(this.LIZ, this.LIZLLL);
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1910030znt
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1910030znt
    public final String LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1910030znt
    public final String LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1910030znt
    public final String getCountry() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1910030znt
    public final String getLanguage() {
        return this.LIZ;
    }

    public C19296810eU(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public C19296810eU(String str, String str2, String str3, String str4, String str5) {
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
