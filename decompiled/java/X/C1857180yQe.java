package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857180yQe extends C1857170yQd implements InterfaceC1891350zJl {
    public final C326880Cre LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857180yQe) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1857180yQe) obj).LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoDefaultSendItem(message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1857170yQd, X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJ;
    }

    public C1857180yQe(C326880Cre c326880Cre) {
        super(c326880Cre);
        this.LLIZLLLIL = c326880Cre;
        this.LLJ = C1857750yRZ.LJII(2131835748);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857180yQe) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJ, ((C1857180yQe) interfaceC1891350zJl).LLJ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857180yQe) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1857170yQd) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
