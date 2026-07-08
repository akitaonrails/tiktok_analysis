package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.13DI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DI implements Externalizable {
    public static final C13DJ Companion;
    public static final long serialVersionUID = 0;
    public Collection<?> LL;
    public final int LLILLJJLI;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13DJ] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Object(defaultConstructorMarker) { // from class: X.13DJ
        };
    }

    public C13DI() {
        this(C13BV.INSTANCE, 0);
    }

    private final Object readResolve() {
        return this.LL;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection<?> collectionLIZ;
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) == 0) {
            int i2 = objectInput.readInt();
            if (i2 >= 0) {
                int i3 = 0;
                if (i != 0) {
                    if (i == 1) {
                        C13DB c13db = new C13DB(i2);
                        while (i3 < i2) {
                            c13db.add(objectInput.readObject());
                            i3++;
                        }
                        collectionLIZ = c13db.build();
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported collection type tag: ");
                        sbLIZ.append(i);
                        sbLIZ.append('.');
                        throw new InvalidObjectException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    C13DV c13dv = new C13DV(i2);
                    while (i3 < i2) {
                        c13dv.add(objectInput.readObject());
                        i3++;
                    }
                    collectionLIZ = C1697820uHc.LIZ(c13dv);
                }
                this.LL = collectionLIZ;
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Illegal size value: ");
            sbLIZ2.append(i2);
            sbLIZ2.append('.');
            throw new InvalidObjectException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Unsupported flags value: ");
        sbLIZ3.append((int) b);
        sbLIZ3.append('.');
        throw new InvalidObjectException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.LLILLJJLI);
        objectOutput.writeInt(this.LL.size());
        Iterator<?> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            objectOutput.writeObject(it2.next());
        }
    }

    public C13DI(Collection<?> collection, int i) {
        this.LL = collection;
        this.LLILLJJLI = i;
    }
}
