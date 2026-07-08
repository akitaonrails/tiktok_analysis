package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665170Q7f implements InterfaceC1891350zJl {
    public final int LL = 0;
    public final C03IT LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C665170Q7f)) {
            return false;
        }
        C665170Q7f c665170Q7f = (C665170Q7f) obj;
        return this.LL == c665170Q7f.LL && Intrinsics.LJFF(this.LLILLJJLI, c665170Q7f.LLILLJJLI) && this.LLILLL == c665170Q7f.LLILLL && this.LLILZ == c665170Q7f.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTakoNewBotCardImageItem(imageIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imageModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C665170Q7f) {
            C665170Q7f c665170Q7f = (C665170Q7f) interfaceC1891350zJl;
            if (this.LL == c665170Q7f.LL && Intrinsics.LJFF(this.LLILLJJLI, c665170Q7f.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C665170Q7f) {
            if (this.LL == ((C665170Q7f) interfaceC1891350zJl).LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C665170Q7f(C03IT c03it, int i, int i2) {
        this.LLILLJJLI = c03it;
        this.LLILLL = i;
        this.LLILZ = i2;
    }
}
