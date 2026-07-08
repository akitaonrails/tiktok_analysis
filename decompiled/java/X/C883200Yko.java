package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883200Yko extends AbstractC883300Yky {
    public final String LIZIZ;
    public final EnumC883260Yku LIZJ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Idle-UID-");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("-initResult-");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC883300Yky
    public final AbstractC883300Yky LIZ(AbstractC883060Yka abstractC883060Yka) {
        if (abstractC883060Yka instanceof C876260YZc) {
            this.LIZ = ((C876260YZc) abstractC883060Yka).LIZ;
            return new C883180Ykm(this.LIZIZ, this.LIZJ);
        }
        if (abstractC883060Yka instanceof C883310Ykz) {
            return new C883180Ykm(this.LIZIZ, this.LIZJ);
        }
        C0I0B.LJFF.LIZJ();
        if (!C894660Z7w.LIZJ()) {
            return this;
        }
        throw new IllegalStateException("Unexpected action on this state");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C883200Yko) {
            C883200Yko c883200Yko = (C883200Yko) obj;
            if (Intrinsics.LJFF(this.LIZIZ, c883200Yko.LIZIZ) && this.LIZJ == c883200Yko.LIZJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C883200Yko(String str, EnumC883260Yku enumC883260Yku) {
        this.LIZIZ = str;
        this.LIZJ = enumC883260Yku;
    }
}
