package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08LM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LM extends AbstractC331870Czh {
    public final String LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;

    public final C08LM copy(String str, int i, boolean z) {
        return new C08LM(str, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LM)) {
            return false;
        }
        C08LM c08lm = (C08LM) obj;
        return Intrinsics.LJFF(this.LL, c08lm.LL) && this.LLILLJJLI == c08lm.LLILLJJLI && this.LLILLL == c08lm.LLILLL;
    }

    public int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skeleton(slotKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAnimating=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC331870Czh
    public int getContentHash() {
        return this.LLILZ;
    }

    @Override // X.AbstractC331870Czh
    public int getIndex() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC331870Czh
    public String getSlotKey() {
        return this.LL;
    }

    public final boolean isAnimating() {
        return this.LLILLL;
    }

    public C08LM(String str, int i, boolean z) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("skeleton", getSlotKey(), String.valueOf(getIndex()), String.valueOf(z)), "|", null, null, 0, null, null, 62).hashCode();
    }
}
