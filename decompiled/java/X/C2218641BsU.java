package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2218641BsU implements Externalizable {
    public static final long serialVersionUID = 1;
    public final List<C2218581BsO> LL = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Bsb] */
    public static C2218711Bsb newBuilder() {
        return new C2218641BsU() { // from class: X.1Bsb
            public C2218641BsU build() {
                return this;
            }
        };
    }

    public C2218641BsU clear() {
        ((ArrayList) this.LL).clear();
        return this;
    }

    public int getMetadataCount() {
        return ((ArrayList) this.LL).size();
    }

    public List<C2218581BsO> getMetadataList() {
        return this.LL;
    }

    public C2218641BsU addMetadata(C2218581BsO c2218581BsO) {
        if (c2218581BsO != null) {
            ((ArrayList) this.LL).add(c2218581BsO);
            return this;
        }
        throw null;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            C2218581BsO c2218581BsO = new C2218581BsO();
            c2218581BsO.readExternal(objectInput);
            ((ArrayList) this.LL).add(c2218581BsO);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int metadataCount = getMetadataCount();
        objectOutput.writeInt(metadataCount);
        for (int i = 0; i < metadataCount; i++) {
            ((C2218581BsO) ListProtector.get(this.LL, i)).writeExternal(objectOutput);
        }
    }
}
