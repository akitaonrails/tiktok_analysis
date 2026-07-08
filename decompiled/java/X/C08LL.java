package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08LL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LL extends AbstractC331870Czh {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("tail_loading", getSlotKey(), String.valueOf(getIndex())), "|", null, null, 0, null, null, 62).hashCode();

    public final C08LL copy(String str, int i) {
        return new C08LL(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LL)) {
            return false;
        }
        C08LL c08ll = (C08LL) obj;
        return Intrinsics.LJFF(this.LL, c08ll.LL) && this.LLILLJJLI == c08ll.LLILLJJLI;
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TailLoading(slotKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC331870Czh
    public int getContentHash() {
        return this.LLILLL;
    }

    @Override // X.AbstractC331870Czh
    public int getIndex() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC331870Czh
    public String getSlotKey() {
        return this.LL;
    }

    public C08LL(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
