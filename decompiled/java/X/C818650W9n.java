package X;

/* JADX INFO: renamed from: X.0W9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818650W9n<T> extends AbstractC818660W9o<T> {
    public final Integer LIZ;
    public final T LIZIZ;
    public final EnumC816340W0q LIZJ;

    public final int hashCode() {
        Integer num = this.LIZ;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Event{code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC818660W9o
    public final Integer LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC818660W9o
    public final T LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC818660W9o
    public final EnumC816340W0q LIZJ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC818660W9o)) {
            return false;
        }
        AbstractC818660W9o abstractC818660W9o = (AbstractC818660W9o) obj;
        Integer num = this.LIZ;
        if (num == null) {
            if (abstractC818660W9o.LIZ() != null) {
                return false;
            }
        } else if (!num.equals(abstractC818660W9o.LIZ())) {
            return false;
        }
        if (this.LIZIZ.equals(abstractC818660W9o.LIZIZ()) && this.LIZJ.equals(abstractC818660W9o.LIZJ())) {
            return true;
        }
        return false;
    }

    public C818650W9n(Integer num, T t, EnumC816340W0q enumC816340W0q) {
        this.LIZ = num;
        if (t != null) {
            this.LIZIZ = t;
            if (enumC816340W0q != null) {
                this.LIZJ = enumC816340W0q;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }
}
