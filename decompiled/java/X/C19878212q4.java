package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.12q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19878212q4<E> extends AbstractC19876412pm<E> {
    public C19878412q6<E> LIZ;
    public boolean LIZIZ;

    public AbstractC19878112q3<E> LJFF() {
        Objects.requireNonNull(this.LIZ);
        if (this.LIZ.LIZJ == 0) {
            return AbstractC19878112q3.of();
        }
        this.LIZIZ = true;
        return new C19878312q5(this.LIZ);
    }

    public C19878212q4(int i) {
        this.LIZ = new C19878412q6<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19876412pm
    public /* bridge */ /* synthetic */ AbstractC19876412pm LIZ(Object obj) {
        LIZJ(obj);
        return this;
    }

    public C19878212q4<E> LIZJ(E e) {
        LJ(1, e);
        return this;
    }

    public C19878212q4<E> LIZLLL(E... eArr) {
        for (E e : eArr) {
            LIZ(e);
        }
        return this;
    }

    public C19878212q4 LJ(int i, Object obj) {
        Objects.requireNonNull(this.LIZ);
        if (i == 0) {
            return this;
        }
        if (this.LIZIZ) {
            this.LIZ = new C19878412q6<>(this.LIZ);
        }
        int i2 = 0;
        this.LIZIZ = false;
        obj.getClass();
        C19878412q6<E> c19878412q6 = this.LIZ;
        int iLIZJ = c19878412q6.LIZJ(obj);
        if (iLIZJ != -1) {
            i2 = c19878412q6.LIZIZ[iLIZJ];
        }
        c19878412q6.LJ(i + i2, obj);
        return this;
    }
}
