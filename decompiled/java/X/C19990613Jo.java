package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: renamed from: X.13Jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990613Jo implements Externalizable {
    public static final long serialVersionUID = 0;
    public long LL;
    public int LLILLJJLI;

    public C19990613Jo() {
        this(0L, 0);
    }

    private final Object readResolve() {
        C19991013Js c19991013Js = C19990513Jn.Companion;
        long j = this.LL;
        int i = this.LLILLJJLI;
        c19991013Js.getClass();
        return C19991013Js.LIZ(i, j);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.LL = objectInput.readLong();
        this.LLILLJJLI = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.LL);
        objectOutput.writeInt(this.LLILLJJLI);
    }

    public C19990613Jo(long j, int i) {
        this.LL = j;
        this.LLILLJJLI = i;
    }
}
