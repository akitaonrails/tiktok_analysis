package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: renamed from: X.13Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981413Ga implements Externalizable {
    public static final long serialVersionUID = 0;
    public long LL;
    public long LLILLJJLI;

    public C19981413Ga() {
        this(0L, 0L);
    }

    private final Object readResolve() {
        C19981513Gb c19981513Gb = C13GZ.Companion;
        long j = this.LL;
        long j2 = this.LLILLJJLI;
        c19981513Gb.getClass();
        return C19981513Gb.LIZ(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.LL = objectInput.readLong();
        this.LLILLJJLI = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.LL);
        objectOutput.writeLong(this.LLILLJJLI);
    }

    public C19981413Ga(long j, long j2) {
        this.LL = j;
        this.LLILLJJLI = j2;
    }
}
