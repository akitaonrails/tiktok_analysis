package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.1BsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218561BsM implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJILJ;
    public boolean LLJJ;
    public String LLILZLL = "";
    public int LLJI = 1;
    public String LLJILJIL = "";
    public String LLJJI = "";
    public EnumC2218551BsL LLJILLL = EnumC2218551BsL.UNSPECIFIED;

    public C2218561BsM clearCountryCode() {
        this.LL = false;
        this.LLILLJJLI = 0;
        return this;
    }

    public C2218561BsM clearCountryCodeSource() {
        this.LLJILJILJ = false;
        this.LLJILLL = EnumC2218551BsL.UNSPECIFIED;
        return this;
    }

    public C2218561BsM clearExtension() {
        this.LLILZIL = false;
        this.LLILZLL = "";
        return this;
    }

    public C2218561BsM clearItalianLeadingZero() {
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        return this;
    }

    public C2218561BsM clearNationalNumber() {
        this.LLILLL = false;
        this.LLILZ = 0L;
        return this;
    }

    public C2218561BsM clearNumberOfLeadingZeros() {
        this.LLJ = false;
        this.LLJI = 1;
        return this;
    }

    public C2218561BsM clearPreferredDomesticCarrierCode() {
        this.LLJJ = false;
        this.LLJJI = "";
        return this;
    }

    public C2218561BsM clearRawInput() {
        this.LLJIJIL = false;
        this.LLJILJIL = "";
        return this;
    }

    public int hashCode() {
        return ((((((((((((((((2173 + getCountryCode()) * 53) + Long.valueOf(getNationalNumber()).hashCode()) * 53) + getExtension().hashCode()) * 53) + (isItalianLeadingZero() ? 1231 : 1237)) * 53) + getNumberOfLeadingZeros()) * 53) + getRawInput().hashCode()) * 53) + getCountryCodeSource().hashCode()) * 53) + getPreferredDomesticCarrierCode().hashCode()) * 53) + (hasPreferredDomesticCarrierCode() ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.LLILLJJLI);
        sb.append(" National Number: ");
        sb.append(this.LLILZ);
        if (hasItalianLeadingZero() && isItalianLeadingZero()) {
            sb.append(" Leading Zero(s): true");
        }
        if (hasNumberOfLeadingZeros()) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.LLJI);
        }
        if (hasExtension()) {
            sb.append(" Extension: ");
            sb.append(this.LLILZLL);
        }
        if (hasCountryCodeSource()) {
            sb.append(" Country Code Source: ");
            sb.append(this.LLJILLL);
        }
        if (hasPreferredDomesticCarrierCode()) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.LLJJI);
        }
        return sb.toString();
    }

    public final C2218561BsM clear() {
        clearCountryCode();
        clearNationalNumber();
        clearExtension();
        clearItalianLeadingZero();
        clearNumberOfLeadingZeros();
        clearRawInput();
        clearCountryCodeSource();
        clearPreferredDomesticCarrierCode();
        return this;
    }

    public int getCountryCode() {
        return this.LLILLJJLI;
    }

    public EnumC2218551BsL getCountryCodeSource() {
        return this.LLJILLL;
    }

    public String getExtension() {
        return this.LLILZLL;
    }

    public long getNationalNumber() {
        return this.LLILZ;
    }

    public int getNumberOfLeadingZeros() {
        return this.LLJI;
    }

    public String getPreferredDomesticCarrierCode() {
        return this.LLJJI;
    }

    public String getRawInput() {
        return this.LLJILJIL;
    }

    public boolean hasCountryCode() {
        return this.LL;
    }

    public boolean hasCountryCodeSource() {
        return this.LLJILJILJ;
    }

    public boolean hasExtension() {
        return this.LLILZIL;
    }

    public boolean hasItalianLeadingZero() {
        return this.LLIZ;
    }

    public boolean hasNationalNumber() {
        return this.LLILLL;
    }

    public boolean hasNumberOfLeadingZeros() {
        return this.LLJ;
    }

    public boolean hasPreferredDomesticCarrierCode() {
        return this.LLJJ;
    }

    public boolean hasRawInput() {
        return this.LLJIJIL;
    }

    public boolean isItalianLeadingZero() {
        return this.LLIZLLLIL;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C2218561BsM) && exactlySameAs((C2218561BsM) obj)) {
            return true;
        }
        return false;
    }

    public boolean exactlySameAs(C2218561BsM c2218561BsM) {
        if (c2218561BsM == null) {
            return false;
        }
        if (this == c2218561BsM) {
            return true;
        }
        if (this.LLILLJJLI != c2218561BsM.LLILLJJLI || this.LLILZ != c2218561BsM.LLILZ || !this.LLILZLL.equals(c2218561BsM.LLILZLL) || this.LLIZLLLIL != c2218561BsM.LLIZLLLIL || this.LLJI != c2218561BsM.LLJI || !this.LLJILJIL.equals(c2218561BsM.LLJILJIL) || this.LLJILLL != c2218561BsM.LLJILLL || !this.LLJJI.equals(c2218561BsM.LLJJI) || hasPreferredDomesticCarrierCode() != c2218561BsM.hasPreferredDomesticCarrierCode()) {
            return false;
        }
        return true;
    }

    public C2218561BsM mergeFrom(C2218561BsM c2218561BsM) {
        if (c2218561BsM.hasCountryCode()) {
            setCountryCode(c2218561BsM.getCountryCode());
        }
        if (c2218561BsM.hasNationalNumber()) {
            setNationalNumber(c2218561BsM.getNationalNumber());
        }
        if (c2218561BsM.hasExtension()) {
            setExtension(c2218561BsM.getExtension());
        }
        if (c2218561BsM.hasItalianLeadingZero()) {
            setItalianLeadingZero(c2218561BsM.isItalianLeadingZero());
        }
        if (c2218561BsM.hasNumberOfLeadingZeros()) {
            setNumberOfLeadingZeros(c2218561BsM.getNumberOfLeadingZeros());
        }
        if (c2218561BsM.hasRawInput()) {
            setRawInput(c2218561BsM.getRawInput());
        }
        if (c2218561BsM.hasCountryCodeSource()) {
            setCountryCodeSource(c2218561BsM.getCountryCodeSource());
        }
        if (c2218561BsM.hasPreferredDomesticCarrierCode()) {
            setPreferredDomesticCarrierCode(c2218561BsM.getPreferredDomesticCarrierCode());
        }
        return this;
    }

    public C2218561BsM setCountryCode(int i) {
        this.LL = true;
        this.LLILLJJLI = i;
        return this;
    }

    public C2218561BsM setCountryCodeSource(EnumC2218551BsL enumC2218551BsL) {
        if (enumC2218551BsL != null) {
            this.LLJILJILJ = true;
            this.LLJILLL = enumC2218551BsL;
            return this;
        }
        throw null;
    }

    public C2218561BsM setExtension(String str) {
        if (str != null) {
            this.LLILZIL = true;
            this.LLILZLL = str;
            return this;
        }
        throw null;
    }

    public C2218561BsM setItalianLeadingZero(boolean z) {
        this.LLIZ = true;
        this.LLIZLLLIL = z;
        return this;
    }

    public C2218561BsM setNationalNumber(long j) {
        this.LLILLL = true;
        this.LLILZ = j;
        return this;
    }

    public C2218561BsM setNumberOfLeadingZeros(int i) {
        this.LLJ = true;
        this.LLJI = i;
        return this;
    }

    public C2218561BsM setPreferredDomesticCarrierCode(String str) {
        if (str != null) {
            this.LLJJ = true;
            this.LLJJI = str;
            return this;
        }
        throw null;
    }

    public C2218561BsM setRawInput(String str) {
        if (str != null) {
            this.LLJIJIL = true;
            this.LLJILJIL = str;
            return this;
        }
        throw null;
    }
}
