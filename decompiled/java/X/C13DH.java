package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.13DH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DH implements Externalizable {
    public static final C13DK LLILLJJLI;
    public static final long serialVersionUID = 0;
    public Map<?, ?> LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13DK] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLJJLI = new Object(defaultConstructorMarker) { // from class: X.13DK
        };
    }

    public C13DH() {
        this(C2097608Jq.LJ());
    }

    private final Object readResolve() {
        return this.LL;
    }

    public C13DH(Map<?, ?> map) {
        this.LL = map;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        byte b = objectInput.readByte();
        if (b == 0) {
            int i = objectInput.readInt();
            if (i >= 0) {
                C13DA c13da = new C13DA(i);
                for (int i2 = 0; i2 < i; i2++) {
                    c13da.put(objectInput.readObject(), objectInput.readObject());
                }
                this.LL = c13da.build();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal size value: ");
            sbLIZ.append(i);
            sbLIZ.append('.');
            throw new InvalidObjectException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unsupported flags value: ");
        sbLIZ2.append((int) b);
        throw new InvalidObjectException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.LL.size());
        for (Map.Entry<?, ?> entry : this.LL.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
