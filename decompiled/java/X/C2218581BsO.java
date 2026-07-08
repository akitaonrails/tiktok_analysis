package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2218581BsO implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean LL;
    public C2218591BsP LLILLJJLI;
    public boolean LLILLL;
    public C2218591BsP LLILZ;
    public boolean LLILZIL;
    public C2218591BsP LLILZLL;
    public boolean LLIZ;
    public C2218591BsP LLIZLLLIL;
    public boolean LLJ;
    public C2218591BsP LLJI;
    public boolean LLJIJIL;
    public C2218591BsP LLJILJIL;
    public boolean LLJILJILJ;
    public C2218591BsP LLJILLL;
    public boolean LLJJ;
    public C2218591BsP LLJJI;
    public boolean LLJJIII;
    public C2218591BsP LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C2218591BsP LLJJIJIL;
    public boolean LLJJJ;
    public C2218591BsP LLJJJIL;
    public boolean LLJJJJ;
    public C2218591BsP LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C2218591BsP LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C2218591BsP LLJL;
    public boolean LLJLIL;
    public C2218591BsP LLJLILLLLZIIL;
    public boolean LLJLL;
    public C2218591BsP LLJLLIL;
    public boolean LLJLLL;
    public C2218591BsP LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public boolean LLLI;
    public boolean LLLIIII;
    public boolean LLLIIIL;
    public boolean LLLIILIL;
    public boolean LLLILZ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJL;
    public boolean LLLLII;
    public boolean LLLLIIL;
    public boolean LLLLIILLL;
    public String LLL = "";
    public String LLLFZ = "";
    public String LLLII = "";
    public String LLLIIIIL = "";
    public String LLLIIL = "";
    public String LLLIL = "";
    public String LLLILZJ = "";
    public final List<C2218611BsR> LLLJ = new ArrayList();
    public final List<C2218611BsR> LLLJIL = new ArrayList();
    public boolean LLLL = false;
    public String LLLLIIIILLL = "";
    public boolean LLLLIILL = false;
    public boolean LLLLIL = false;

    public C2218581BsO clearLeadingZeroPossible() {
        this.LLLLIIL = false;
        this.LLLLIILL = false;
        return this;
    }

    public C2218581BsO clearMainCountryForCode() {
        this.LLLJL = false;
        this.LLLL = false;
        return this;
    }

    public C2218581BsO clearMobileNumberPortableRegion() {
        this.LLLLIILLL = false;
        this.LLLLIL = false;
        return this;
    }

    public C2218581BsO clearNationalPrefix() {
        this.LLLIIII = false;
        this.LLLIIIIL = "";
        return this;
    }

    public C2218581BsO clearNationalPrefixTransformRule() {
        this.LLLILZ = false;
        this.LLLILZJ = "";
        return this;
    }

    public C2218581BsO clearPreferredExtnPrefix() {
        this.LLLIIIL = false;
        this.LLLIIL = "";
        return this;
    }

    public C2218581BsO clearPreferredInternationalPrefix() {
        this.LLLI = false;
        this.LLLII = "";
        return this;
    }

    public C2218581BsO clearSameMobileAndFixedLinePattern() {
        this.LLLILZLLLI = false;
        this.LLLIZZ = false;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Bsa] */
    public static C2218701Bsa newBuilder() {
        return new C2218581BsO() { // from class: X.1Bsa
            public C2218581BsO build() {
                return this;
            }
        };
    }

    public C2218581BsO clearIntlNumberFormat() {
        ((ArrayList) this.LLLJIL).clear();
        return this;
    }

    public int intlNumberFormatSize() {
        return ((ArrayList) this.LLLJIL).size();
    }

    public int numberFormatSize() {
        return ((ArrayList) this.LLLJ).size();
    }

    public C2218591BsP getCarrierSpecific() {
        return this.LLJLILLLLZIIL;
    }

    public int getCountryCode() {
        return this.LLLFF;
    }

    public C2218591BsP getEmergency() {
        return this.LLJJJIL;
    }

    public C2218591BsP getFixedLine() {
        return this.LLILZ;
    }

    public C2218591BsP getGeneralDesc() {
        return this.LLILLJJLI;
    }

    public String getId() {
        return this.LLL;
    }

    public String getInternationalPrefix() {
        return this.LLLFZ;
    }

    public String getLeadingDigits() {
        return this.LLLLIIIILLL;
    }

    public boolean getMainCountryForCode() {
        return this.LLLL;
    }

    public C2218591BsP getMobile() {
        return this.LLILZLL;
    }

    public String getNationalPrefix() {
        return this.LLLIIIIL;
    }

    public String getNationalPrefixForParsing() {
        return this.LLLIL;
    }

    public String getNationalPrefixTransformRule() {
        return this.LLLILZJ;
    }

    public C2218591BsP getNoInternationalDialling() {
        return this.LLJZ;
    }

    public C2218591BsP getPager() {
        return this.LLJJIJI;
    }

    public C2218591BsP getPersonalNumber() {
        return this.LLJILLL;
    }

    public String getPreferredExtnPrefix() {
        return this.LLLIIL;
    }

    public String getPreferredInternationalPrefix() {
        return this.LLLII;
    }

    public C2218591BsP getPremiumRate() {
        return this.LLJI;
    }

    public boolean getSameMobileAndFixedLinePattern() {
        return this.LLLIZZ;
    }

    public C2218591BsP getSharedCost() {
        return this.LLJILJIL;
    }

    public C2218591BsP getShortCode() {
        return this.LLJJL;
    }

    public C2218591BsP getSmsServices() {
        return this.LLJLLIL;
    }

    public C2218591BsP getStandardRate() {
        return this.LLJL;
    }

    public C2218591BsP getTollFree() {
        return this.LLIZLLLIL;
    }

    public C2218591BsP getUan() {
        return this.LLJJIJIL;
    }

    public C2218591BsP getVoicemail() {
        return this.LLJJJJJIL;
    }

    public C2218591BsP getVoip() {
        return this.LLJJI;
    }

    public boolean hasCarrierSpecific() {
        return this.LLJLIL;
    }

    public boolean hasCountryCode() {
        return this.LLLF;
    }

    public boolean hasEmergency() {
        return this.LLJJJ;
    }

    public boolean hasFixedLine() {
        return this.LLILLL;
    }

    public boolean hasGeneralDesc() {
        return this.LL;
    }

    public boolean hasId() {
        return this.LLJZIJLIL;
    }

    public boolean hasInternationalPrefix() {
        return this.LLLFFI;
    }

    public boolean hasLeadingDigits() {
        return this.LLLLII;
    }

    public boolean hasLeadingZeroPossible() {
        return this.LLLLIIL;
    }

    public boolean hasMainCountryForCode() {
        return this.LLLJL;
    }

    public boolean hasMobile() {
        return this.LLILZIL;
    }

    public boolean hasMobileNumberPortableRegion() {
        return this.LLLLIILLL;
    }

    public boolean hasNationalPrefix() {
        return this.LLLIIII;
    }

    public boolean hasNationalPrefixForParsing() {
        return this.LLLIILIL;
    }

    public boolean hasNationalPrefixTransformRule() {
        return this.LLLILZ;
    }

    public boolean hasNoInternationalDialling() {
        return this.LLJLLL;
    }

    public boolean hasPager() {
        return this.LLJJIII;
    }

    public boolean hasPersonalNumber() {
        return this.LLJILJILJ;
    }

    public boolean hasPreferredExtnPrefix() {
        return this.LLLIIIL;
    }

    public boolean hasPreferredInternationalPrefix() {
        return this.LLLI;
    }

    public boolean hasPremiumRate() {
        return this.LLJ;
    }

    public boolean hasSameMobileAndFixedLinePattern() {
        return this.LLLILZLLLI;
    }

    public boolean hasSharedCost() {
        return this.LLJIJIL;
    }

    public boolean hasShortCode() {
        return this.LLJJJJLIIL;
    }

    public boolean hasSmsServices() {
        return this.LLJLL;
    }

    public boolean hasStandardRate() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public boolean hasTollFree() {
        return this.LLIZ;
    }

    public boolean hasUan() {
        return this.LLJJIJIIJIL;
    }

    public boolean hasVoicemail() {
        return this.LLJJJJ;
    }

    public boolean hasVoip() {
        return this.LLJJ;
    }

    public List<C2218611BsR> intlNumberFormats() {
        return this.LLLJIL;
    }

    public boolean isLeadingZeroPossible() {
        return this.LLLLIILL;
    }

    public boolean isMainCountryForCode() {
        return this.LLLL;
    }

    public boolean isMobileNumberPortableRegion() {
        return this.LLLLIL;
    }

    public List<C2218611BsR> numberFormats() {
        return this.LLLJ;
    }

    public C2218581BsO addIntlNumberFormat(C2218611BsR c2218611BsR) {
        if (c2218611BsR != null) {
            ((ArrayList) this.LLLJIL).add(c2218611BsR);
            return this;
        }
        throw null;
    }

    public C2218581BsO addNumberFormat(C2218611BsR c2218611BsR) {
        if (c2218611BsR != null) {
            ((ArrayList) this.LLLJ).add(c2218611BsR);
            return this;
        }
        throw null;
    }

    public C2218611BsR getIntlNumberFormat(int i) {
        return (C2218611BsR) ListProtector.get(this.LLLJIL, i);
    }

    public C2218611BsR getNumberFormat(int i) {
        return (C2218611BsR) ListProtector.get(this.LLLJ, i);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP = new C2218591BsP();
            c2218591BsP.readExternal(objectInput);
            setGeneralDesc(c2218591BsP);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP2 = new C2218591BsP();
            c2218591BsP2.readExternal(objectInput);
            setFixedLine(c2218591BsP2);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP3 = new C2218591BsP();
            c2218591BsP3.readExternal(objectInput);
            setMobile(c2218591BsP3);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP4 = new C2218591BsP();
            c2218591BsP4.readExternal(objectInput);
            setTollFree(c2218591BsP4);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP5 = new C2218591BsP();
            c2218591BsP5.readExternal(objectInput);
            setPremiumRate(c2218591BsP5);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP6 = new C2218591BsP();
            c2218591BsP6.readExternal(objectInput);
            setSharedCost(c2218591BsP6);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP7 = new C2218591BsP();
            c2218591BsP7.readExternal(objectInput);
            setPersonalNumber(c2218591BsP7);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP8 = new C2218591BsP();
            c2218591BsP8.readExternal(objectInput);
            setVoip(c2218591BsP8);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP9 = new C2218591BsP();
            c2218591BsP9.readExternal(objectInput);
            setPager(c2218591BsP9);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP10 = new C2218591BsP();
            c2218591BsP10.readExternal(objectInput);
            setUan(c2218591BsP10);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP11 = new C2218591BsP();
            c2218591BsP11.readExternal(objectInput);
            setEmergency(c2218591BsP11);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP12 = new C2218591BsP();
            c2218591BsP12.readExternal(objectInput);
            setVoicemail(c2218591BsP12);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP13 = new C2218591BsP();
            c2218591BsP13.readExternal(objectInput);
            setShortCode(c2218591BsP13);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP14 = new C2218591BsP();
            c2218591BsP14.readExternal(objectInput);
            setStandardRate(c2218591BsP14);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP15 = new C2218591BsP();
            c2218591BsP15.readExternal(objectInput);
            setCarrierSpecific(c2218591BsP15);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP16 = new C2218591BsP();
            c2218591BsP16.readExternal(objectInput);
            setSmsServices(c2218591BsP16);
        }
        if (objectInput.readBoolean()) {
            C2218591BsP c2218591BsP17 = new C2218591BsP();
            c2218591BsP17.readExternal(objectInput);
            setNoInternationalDialling(c2218591BsP17);
        }
        setId(objectInput.readUTF());
        setCountryCode(objectInput.readInt());
        setInternationalPrefix(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            setPreferredInternationalPrefix(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefix(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setPreferredExtnPrefix(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefixForParsing(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefixTransformRule(objectInput.readUTF());
        }
        setSameMobileAndFixedLinePattern(objectInput.readBoolean());
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            C2218611BsR c2218611BsR = new C2218611BsR();
            c2218611BsR.readExternal(objectInput);
            ((ArrayList) this.LLLJ).add(c2218611BsR);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            C2218611BsR c2218611BsR2 = new C2218611BsR();
            c2218611BsR2.readExternal(objectInput);
            ((ArrayList) this.LLLJIL).add(c2218611BsR2);
        }
        setMainCountryForCode(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            setLeadingDigits(objectInput.readUTF());
        }
        setLeadingZeroPossible(objectInput.readBoolean());
        setMobileNumberPortableRegion(objectInput.readBoolean());
    }

    public C2218581BsO setCarrierSpecific(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJLIL = true;
            this.LLJLILLLLZIIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setCountryCode(int i) {
        this.LLLF = true;
        this.LLLFF = i;
        return this;
    }

    public C2218581BsO setEmergency(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJJ = true;
            this.LLJJJIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setFixedLine(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLILLL = true;
            this.LLILZ = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setGeneralDesc(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LL = true;
            this.LLILLJJLI = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setId(String str) {
        this.LLJZIJLIL = true;
        this.LLL = str;
        return this;
    }

    public C2218581BsO setInternationalPrefix(String str) {
        this.LLLFFI = true;
        this.LLLFZ = str;
        return this;
    }

    public C2218581BsO setLeadingDigits(String str) {
        this.LLLLII = true;
        this.LLLLIIIILLL = str;
        return this;
    }

    public C2218581BsO setLeadingZeroPossible(boolean z) {
        this.LLLLIIL = true;
        this.LLLLIILL = z;
        return this;
    }

    public C2218581BsO setMainCountryForCode(boolean z) {
        this.LLLJL = true;
        this.LLLL = z;
        return this;
    }

    public C2218581BsO setMobile(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLILZIL = true;
            this.LLILZLL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setMobileNumberPortableRegion(boolean z) {
        this.LLLLIILLL = true;
        this.LLLLIL = z;
        return this;
    }

    public C2218581BsO setNationalPrefix(String str) {
        this.LLLIIII = true;
        this.LLLIIIIL = str;
        return this;
    }

    public C2218581BsO setNationalPrefixForParsing(String str) {
        this.LLLIILIL = true;
        this.LLLIL = str;
        return this;
    }

    public C2218581BsO setNationalPrefixTransformRule(String str) {
        this.LLLILZ = true;
        this.LLLILZJ = str;
        return this;
    }

    public C2218581BsO setNoInternationalDialling(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJLLL = true;
            this.LLJZ = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setPager(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJIII = true;
            this.LLJJIJI = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setPersonalNumber(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJILJILJ = true;
            this.LLJILLL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setPreferredExtnPrefix(String str) {
        this.LLLIIIL = true;
        this.LLLIIL = str;
        return this;
    }

    public C2218581BsO setPreferredInternationalPrefix(String str) {
        this.LLLI = true;
        this.LLLII = str;
        return this;
    }

    public C2218581BsO setPremiumRate(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJ = true;
            this.LLJI = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setSameMobileAndFixedLinePattern(boolean z) {
        this.LLLILZLLLI = true;
        this.LLLIZZ = z;
        return this;
    }

    public C2218581BsO setSharedCost(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJIJIL = true;
            this.LLJILJIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setShortCode(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJJJLIIL = true;
            this.LLJJL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setSmsServices(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJLL = true;
            this.LLJLLIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setStandardRate(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJLIIIJLLLLLLLZ = true;
            this.LLJL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setTollFree(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLIZ = true;
            this.LLIZLLLIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setUan(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJIJIIJIL = true;
            this.LLJJIJIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setVoicemail(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJJJ = true;
            this.LLJJJJJIL = c2218591BsP;
            return this;
        }
        throw null;
    }

    public C2218581BsO setVoip(C2218591BsP c2218591BsP) {
        if (c2218591BsP != null) {
            this.LLJJ = true;
            this.LLJJI = c2218591BsP;
            return this;
        }
        throw null;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.LL);
        if (this.LL) {
            this.LLILLJJLI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLILLL);
        if (this.LLILLL) {
            this.LLILZ.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLILZIL);
        if (this.LLILZIL) {
            this.LLILZLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLIZ);
        if (this.LLIZ) {
            this.LLIZLLLIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJ);
        if (this.LLJ) {
            this.LLJI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJIJIL);
        if (this.LLJIJIL) {
            this.LLJILJIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJILJILJ);
        if (this.LLJILJILJ) {
            this.LLJILLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJ);
        if (this.LLJJ) {
            this.LLJJI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJIII);
        if (this.LLJJIII) {
            this.LLJJIJI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJIJIIJIL);
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJJ);
        if (this.LLJJJ) {
            this.LLJJJIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJJJ);
        if (this.LLJJJJ) {
            this.LLJJJJJIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJJJLIIL);
        if (this.LLJJJJLIIL) {
            this.LLJJL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJJLIIIJLLLLLLLZ);
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LLJL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJLIL);
        if (this.LLJLIL) {
            this.LLJLILLLLZIIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJLL);
        if (this.LLJLL) {
            this.LLJLLIL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJLLL);
        if (this.LLJLLL) {
            this.LLJZ.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.LLL);
        objectOutput.writeInt(this.LLLFF);
        objectOutput.writeUTF(this.LLLFZ);
        objectOutput.writeBoolean(this.LLLI);
        if (this.LLLI) {
            objectOutput.writeUTF(this.LLLII);
        }
        objectOutput.writeBoolean(this.LLLIIII);
        if (this.LLLIIII) {
            objectOutput.writeUTF(this.LLLIIIIL);
        }
        objectOutput.writeBoolean(this.LLLIIIL);
        if (this.LLLIIIL) {
            objectOutput.writeUTF(this.LLLIIL);
        }
        objectOutput.writeBoolean(this.LLLIILIL);
        if (this.LLLIILIL) {
            objectOutput.writeUTF(this.LLLIL);
        }
        objectOutput.writeBoolean(this.LLLILZ);
        if (this.LLLILZ) {
            objectOutput.writeUTF(this.LLLILZJ);
        }
        objectOutput.writeBoolean(this.LLLIZZ);
        int iNumberFormatSize = numberFormatSize();
        objectOutput.writeInt(iNumberFormatSize);
        for (int i = 0; i < iNumberFormatSize; i++) {
            ((C2218611BsR) ListProtector.get(this.LLLJ, i)).writeExternal(objectOutput);
        }
        int iIntlNumberFormatSize = intlNumberFormatSize();
        objectOutput.writeInt(iIntlNumberFormatSize);
        for (int i2 = 0; i2 < iIntlNumberFormatSize; i2++) {
            ((C2218611BsR) ListProtector.get(this.LLLJIL, i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLLL);
        objectOutput.writeBoolean(this.LLLLII);
        if (this.LLLLII) {
            objectOutput.writeUTF(this.LLLLIIIILLL);
        }
        objectOutput.writeBoolean(this.LLLLIILL);
        objectOutput.writeBoolean(this.LLLLIL);
    }
}
