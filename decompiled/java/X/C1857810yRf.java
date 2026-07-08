package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857810yRf extends C1858660yT2 implements InterfaceC1891350zJl {
    public final C326880Cre LLJJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857810yRf) && Intrinsics.LJFF(this.LLJJIJI, ((C1857810yRf) obj).LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLJJIJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerLoadingItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1857810yRf(C326880Cre c326880Cre) {
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof InterfaceC1857950yRt) {
            if (areItemTheSame(interfaceC1891350zJl) && this.LLIZ == ((InterfaceC1857950yRt) interfaceC1891350zJl).LIZ()) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858660yT2) {
            if (!Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI) && this.LL.LLILLL.msgType != -6000) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
