package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2218611BsR implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean LL;
    public boolean LLILLL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public String LLILLJJLI = "";
    public String LLILZ = "";
    public final List<String> LLILZIL = new ArrayList();
    public String LLIZ = "";
    public boolean LLJ = false;
    public String LLJIJIL = "";

    public C2218611BsR clearNationalPrefixFormattingRule() {
        this.LLILZLL = false;
        this.LLIZ = "";
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BsT] */
    public static C2218631BsT newBuilder() {
        return new C2218611BsR() { // from class: X.1BsT
            public C2218611BsR build() {
                return this;
            }

            public C2218631BsT mergeFrom(C2218611BsR c2218611BsR) {
                if (c2218611BsR.hasPattern()) {
                    setPattern(c2218611BsR.getPattern());
                }
                if (c2218611BsR.hasFormat()) {
                    setFormat(c2218611BsR.getFormat());
                }
                for (int i = 0; i < c2218611BsR.leadingDigitsPatternSize(); i++) {
                    addLeadingDigitsPattern(c2218611BsR.getLeadingDigitsPattern(i));
                }
                if (c2218611BsR.hasNationalPrefixFormattingRule()) {
                    setNationalPrefixFormattingRule(c2218611BsR.getNationalPrefixFormattingRule());
                }
                if (c2218611BsR.hasDomesticCarrierCodeFormattingRule()) {
                    setDomesticCarrierCodeFormattingRule(c2218611BsR.getDomesticCarrierCodeFormattingRule());
                }
                if (c2218611BsR.hasNationalPrefixOptionalWhenFormatting()) {
                    setNationalPrefixOptionalWhenFormatting(c2218611BsR.getNationalPrefixOptionalWhenFormatting());
                }
                return this;
            }
        };
    }

    public int leadingDigitsPatternSize() {
        return ((ArrayList) this.LLILZIL).size();
    }

    public String getDomesticCarrierCodeFormattingRule() {
        return this.LLJIJIL;
    }

    public String getFormat() {
        return this.LLILZ;
    }

    public String getNationalPrefixFormattingRule() {
        return this.LLIZ;
    }

    public boolean getNationalPrefixOptionalWhenFormatting() {
        return this.LLJ;
    }

    public String getPattern() {
        return this.LLILLJJLI;
    }

    public boolean hasDomesticCarrierCodeFormattingRule() {
        return this.LLJI;
    }

    public boolean hasFormat() {
        return this.LLILLL;
    }

    public boolean hasNationalPrefixFormattingRule() {
        return this.LLILZLL;
    }

    public boolean hasNationalPrefixOptionalWhenFormatting() {
        return this.LLIZLLLIL;
    }

    public boolean hasPattern() {
        return this.LL;
    }

    public List<String> leadingDigitPatterns() {
        return this.LLILZIL;
    }

    public C2218611BsR addLeadingDigitsPattern(String str) {
        if (str != null) {
            ((ArrayList) this.LLILZIL).add(str);
            return this;
        }
        throw null;
    }

    public String getLeadingDigitsPattern(int i) {
        return (String) ListProtector.get(this.LLILZIL, i);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        setPattern(objectInput.readUTF());
        setFormat(objectInput.readUTF());
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.LLILZIL).add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefixFormattingRule(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setDomesticCarrierCodeFormattingRule(objectInput.readUTF());
        }
        setNationalPrefixOptionalWhenFormatting(objectInput.readBoolean());
    }

    public C2218611BsR setDomesticCarrierCodeFormattingRule(String str) {
        this.LLJI = true;
        this.LLJIJIL = str;
        return this;
    }

    public C2218611BsR setFormat(String str) {
        this.LLILLL = true;
        this.LLILZ = str;
        return this;
    }

    public C2218611BsR setNationalPrefixFormattingRule(String str) {
        this.LLILZLL = true;
        this.LLIZ = str;
        return this;
    }

    public C2218611BsR setNationalPrefixOptionalWhenFormatting(boolean z) {
        this.LLIZLLLIL = true;
        this.LLJ = z;
        return this;
    }

    public C2218611BsR setPattern(String str) {
        this.LL = true;
        this.LLILLJJLI = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.LLILLJJLI);
        objectOutput.writeUTF(this.LLILZ);
        int iLeadingDigitsPatternSize = leadingDigitsPatternSize();
        objectOutput.writeInt(iLeadingDigitsPatternSize);
        for (int i = 0; i < iLeadingDigitsPatternSize; i++) {
            objectOutput.writeUTF((String) ListProtector.get(this.LLILZIL, i));
        }
        objectOutput.writeBoolean(this.LLILZLL);
        if (this.LLILZLL) {
            objectOutput.writeUTF(this.LLIZ);
        }
        objectOutput.writeBoolean(this.LLJI);
        if (this.LLJI) {
            objectOutput.writeUTF(this.LLJIJIL);
        }
        objectOutput.writeBoolean(this.LLJ);
    }
}
