package X;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: renamed from: X.08sP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2254308sP<T extends Enum<T>> extends AbstractC19974313Dh<T> implements InterfaceC2044707zh<T>, Serializable {
    public final T[] LLILLJJLI;

    private final Object writeReplace() {
        final T[] tArr = this.LLILLJJLI;
        return new Serializable(tArr) { // from class: X.08N9
            public static final long serialVersionUID = 0;
            public final Class<E> LL;

            private final Object readResolve() {
                return new C2254308sP(this.LL.getEnumConstants());
            }

            {
                this.LL = (Class<E>) tArr.getClass().getComponentType();
            }
        };
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.length;
    }

    public C2254308sP(T[] tArr) {
        this.LLILLJJLI = tArr;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        if (C13LQ.LJJIIZ(r4.ordinal(), this.LLILLJJLI) != r4) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final Object get(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int length = this.LLILLJJLI.length;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, length);
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (C13LQ.LJJIIZ(iOrdinal, this.LLILLJJLI) != r4) {
            return -1;
        }
        return iOrdinal;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf(obj);
    }
}
