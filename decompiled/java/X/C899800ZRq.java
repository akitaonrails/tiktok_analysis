package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899800ZRq implements C0ZXC {
    public final C0ZXS LL;
    public final C0IB0 LLILLJJLI;
    public final C899820ZRs LLILLL;
    public final InterfaceC899750ZRl LLILZ;
    public final EnumC899760ZRm LLILZIL;
    public final boolean LLILZLL;
    public final C899840ZRu LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899800ZRq)) {
            return false;
        }
        C899800ZRq c899800ZRq = (C899800ZRq) obj;
        return Intrinsics.LJFF(this.LL, c899800ZRq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899800ZRq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c899800ZRq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c899800ZRq.LLILZ) && this.LLILZIL == c899800ZRq.LLILZIL && this.LLILZLL == c899800ZRq.LLILZLL && Intrinsics.LJFF(this.LLIZ, c899800ZRq.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceReceiveData(bubbleConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", soundWaveState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", transcriptState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cardStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", transcriptAllowSideButtonState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", transcribeUiConfig=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZXC
    public final C0ZXS LJII() {
        return this.LL;
    }

    @Override // X.C0ZXC
    public final C899840ZRu LJJIJ() {
        return this.LLIZ;
    }

    @Override // X.C0ZXC
    public final EnumC899760ZRm LJJJJJ() {
        return this.LLILZIL;
    }

    @Override // X.C0ZXC
    public final boolean LJLLILLLL() {
        return this.LLILZLL;
    }

    @Override // X.C0ZXC
    public final InterfaceC899750ZRl LJLLJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLJJLI;
    }

    @Override // X.C0ZXC
    public final C899820ZRs LLJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C0ZXB.LIZ(this, interfaceC1891350zJl);
    }

    public C899800ZRq(C0ZXS c0zxs, C0IB0 c0ib0, C899820ZRs c899820ZRs, InterfaceC899750ZRl interfaceC899750ZRl, EnumC899760ZRm enumC899760ZRm, boolean z, C899840ZRu c899840ZRu) {
        this.LL = c0zxs;
        this.LLILLJJLI = c0ib0;
        this.LLILLL = c899820ZRs;
        this.LLILZ = interfaceC899750ZRl;
        this.LLILZIL = enumC899760ZRm;
        this.LLILZLL = z;
        this.LLIZ = c899840ZRu;
    }
}
