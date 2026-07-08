package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857330yQt extends C1858660yT2 implements InterfaceC1891350zJl {
    public final String LLJJIJI;
    public final C326880Cre LLJJIJIIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857330yQt)) {
            return false;
        }
        C1857330yQt c1857330yQt = (C1857330yQt) obj;
        return Intrinsics.LJFF(this.LLJJIJI, c1857330yQt.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1857330yQt.LLJJIJIIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LLJJIJI;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoCarryActionHintItem(hint=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857330yQt) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJJIJI, ((C1857330yQt) interfaceC1891350zJl).LLJJIJI)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857330yQt) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1857330yQt(String str, C326880Cre c326880Cre) {
        super(c326880Cre);
        this.LLJJIJI = str;
        this.LLJJIJIIJIL = c326880Cre;
    }
}
