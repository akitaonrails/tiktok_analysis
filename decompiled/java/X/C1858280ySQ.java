package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ySQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858280ySQ implements InterfaceC1891350zJl {
    public final int LL;
    public final C19723912Ez LLILLJJLI;

    public C1858280ySQ() {
        this(-1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858280ySQ)) {
            return false;
        }
        C1858280ySQ c1858280ySQ = (C1858280ySQ) obj;
        return this.LL == c1858280ySQ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1858280ySQ.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        C19723912Ez c19723912Ez = this.LLILLJJLI;
        return i + (c19723912Ez == null ? 0 : c19723912Ez.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoInteractionItemData(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemActionConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858280ySQ) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858280ySQ) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        EnumC1857430yR3 enumC1857430yR3;
        if (interfaceC1891350zJl instanceof C1858280ySQ) {
            C1858280ySQ c1858280ySQ = (C1858280ySQ) interfaceC1891350zJl;
            if (this.LL == c1858280ySQ.LL) {
                C19723912Ez c19723912Ez = this.LLILLJJLI;
                EnumC1857430yR3 enumC1857430yR32 = null;
                if (c19723912Ez != null) {
                    enumC1857430yR3 = c19723912Ez.LIZ;
                } else {
                    enumC1857430yR3 = null;
                }
                C19723912Ez c19723912Ez2 = c1858280ySQ.LLILLJJLI;
                if (c19723912Ez2 != null) {
                    enumC1857430yR32 = c19723912Ez2.LIZ;
                }
                if (enumC1857430yR3 == enumC1857430yR32) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1858280ySQ(int i, C19723912Ez c19723912Ez) {
        this.LL = i;
        this.LLILLJJLI = c19723912Ez;
    }
}
