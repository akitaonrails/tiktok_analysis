package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2218591BsP implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean LL;
    public boolean LLILZIL;
    public String LLILLJJLI = "";
    public final List<Integer> LLILLL = new ArrayList();
    public final List<Integer> LLILZ = new ArrayList();
    public String LLILZLL = "";

    public C2218591BsP clearExampleNumber() {
        this.LLILZIL = false;
        this.LLILZLL = "";
        return this;
    }

    public C2218591BsP clearNationalNumberPattern() {
        this.LL = false;
        this.LLILLJJLI = "";
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BsV] */
    public static C2218651BsV newBuilder() {
        return new C2218591BsP() { // from class: X.1BsV
            public C2218591BsP build() {
                return this;
            }

            public C2218651BsV mergeFrom(C2218591BsP c2218591BsP) {
                if (c2218591BsP.hasNationalNumberPattern()) {
                    setNationalNumberPattern(c2218591BsP.getNationalNumberPattern());
                }
                for (int i = 0; i < c2218591BsP.getPossibleLengthCount(); i++) {
                    addPossibleLength(c2218591BsP.getPossibleLength(i));
                }
                for (int i2 = 0; i2 < c2218591BsP.getPossibleLengthLocalOnlyCount(); i2++) {
                    addPossibleLengthLocalOnly(c2218591BsP.getPossibleLengthLocalOnly(i2));
                }
                if (c2218591BsP.hasExampleNumber()) {
                    setExampleNumber(c2218591BsP.getExampleNumber());
                }
                return this;
            }
        };
    }

    public C2218591BsP clearPossibleLength() {
        ((ArrayList) this.LLILLL).clear();
        return this;
    }

    public C2218591BsP clearPossibleLengthLocalOnly() {
        ((ArrayList) this.LLILZ).clear();
        return this;
    }

    public int getPossibleLengthCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public int getPossibleLengthLocalOnlyCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    public String getExampleNumber() {
        return this.LLILZLL;
    }

    public String getNationalNumberPattern() {
        return this.LLILLJJLI;
    }

    public List<Integer> getPossibleLengthList() {
        return this.LLILLL;
    }

    public List<Integer> getPossibleLengthLocalOnlyList() {
        return this.LLILZ;
    }

    public boolean hasExampleNumber() {
        return this.LLILZIL;
    }

    public boolean hasNationalNumberPattern() {
        return this.LL;
    }

    public C2218591BsP addPossibleLength(int i) {
        ((ArrayList) this.LLILLL).add(Integer.valueOf(i));
        return this;
    }

    public C2218591BsP addPossibleLengthLocalOnly(int i) {
        ((ArrayList) this.LLILZ).add(Integer.valueOf(i));
        return this;
    }

    public boolean exactlySameAs(C2218591BsP c2218591BsP) {
        if (this.LLILLJJLI.equals(c2218591BsP.LLILLJJLI)) {
            if (((ArrayList) this.LLILLL).equals(c2218591BsP.LLILLL)) {
                if (((ArrayList) this.LLILZ).equals(c2218591BsP.LLILZ) && this.LLILZLL.equals(c2218591BsP.LLILZLL)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int getPossibleLength(int i) {
        return ((Integer) ListProtector.get(this.LLILLL, i)).intValue();
    }

    public int getPossibleLengthLocalOnly(int i) {
        return ((Integer) ListProtector.get(this.LLILZ, i)).intValue();
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            setNationalNumberPattern(objectInput.readUTF());
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.LLILLL).add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            ((ArrayList) this.LLILZ).add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            setExampleNumber(objectInput.readUTF());
        }
    }

    public C2218591BsP setExampleNumber(String str) {
        this.LLILZIL = true;
        this.LLILZLL = str;
        return this;
    }

    public C2218591BsP setNationalNumberPattern(String str) {
        this.LL = true;
        this.LLILLJJLI = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.LL);
        if (this.LL) {
            objectOutput.writeUTF(this.LLILLJJLI);
        }
        int possibleLengthCount = getPossibleLengthCount();
        objectOutput.writeInt(possibleLengthCount);
        for (int i = 0; i < possibleLengthCount; i++) {
            objectOutput.writeInt(((Integer) ListProtector.get(this.LLILLL, i)).intValue());
        }
        int possibleLengthLocalOnlyCount = getPossibleLengthLocalOnlyCount();
        objectOutput.writeInt(possibleLengthLocalOnlyCount);
        for (int i2 = 0; i2 < possibleLengthLocalOnlyCount; i2++) {
            objectOutput.writeInt(((Integer) ListProtector.get(this.LLILZ, i2)).intValue());
        }
        objectOutput.writeBoolean(this.LLILZIL);
        if (this.LLILZIL) {
            objectOutput.writeUTF(this.LLILZLL);
        }
    }
}
