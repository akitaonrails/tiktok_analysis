package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19844612ke extends AbstractC19844412kc {
    public final long LL;

    public C19844612ke(long j) {
        this.LL = j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.LL)});
    }

    @Override // X.AbstractC19844412kc
    public final int zza() {
        return this.LL >= 0 ? 0 : 1;
    }

    public final String toString() {
        return Long.toString(this.LL);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC19844412kc abstractC19844412kc = (AbstractC19844412kc) obj;
        if (zza() != abstractC19844412kc.zza()) {
            return zza() - abstractC19844412kc.zza();
        }
        long jAbs = Math.abs(this.LL);
        long jAbs2 = Math.abs(((C19844612ke) abstractC19844412kc).LL);
        if (jAbs < jAbs2) {
            return -1;
        }
        if (jAbs > jAbs2) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19844612ke.class == obj.getClass() && this.LL == ((C19844612ke) obj).LL) {
            return true;
        }
        return false;
    }
}
