package X;

import kotlin.jvm.internal.Intrinsics;
import mr0.r0;

/* JADX INFO: renamed from: X.0eyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109610eyt<MODEL extends r0<? extends AbstractC1136060ffY>> extends C1109600eys<MODEL> {
    public final C1109020exw LJIIIZ;
    public MODEL LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public C1109610eyt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1109610eyt)) {
            return false;
        }
        C1109610eyt c1109610eyt = (C1109610eyt) obj;
        return Intrinsics.LJFF(this.LJIIIZ, c1109610eyt.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1109610eyt.LJIIJ) && this.LJIIJJI == c1109610eyt.LJIIJJI && this.LJIIL == c1109610eyt.LJIIL;
    }

    public final int hashCode() {
        return (((((this.LJIIIZ.hashCode() * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL);
    }

    @Override // X.C1109600eys
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinnedPublicScreenMessageModel(pinBizModel=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", messageModel=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", isPinFailed=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", shown=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1109600eys
    public final /* bridge */ /* synthetic */ InterfaceC1111870f2X LIZ() {
        return this.LJIIJ;
    }

    @Override // X.C1109600eys
    public final void LIZIZ(InterfaceC1111870f2X interfaceC1111870f2X) {
        this.LJIIJ = (AbstractC1110800f0o) interfaceC1111870f2X;
    }

    public C1109610eyt(C1109020exw c1109020exw, AbstractC1110800f0o abstractC1110800f0o) {
        super(abstractC1110800f0o);
        this.LJIIIZ = c1109020exw;
        this.LJIIJ = abstractC1110800f0o;
        this.LJIIJJI = false;
        this.LJIIL = false;
    }
}
