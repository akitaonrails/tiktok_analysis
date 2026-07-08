package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ykm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883180Ykm extends AbstractC883300Yky {
    public final String LIZIZ;
    public EnumC883260Yku LIZJ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshingSDK-prevUID-");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("-prevResult-");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC883300Yky
    public final AbstractC883300Yky LIZ(AbstractC883060Yka abstractC883060Yka) {
        if (abstractC883060Yka instanceof C876260YZc) {
            this.LIZ = ((C876260YZc) abstractC883060Yka).LIZ;
        } else {
            if (abstractC883060Yka instanceof C883050YkZ) {
                C883050YkZ c883050YkZ = (C883050YkZ) abstractC883060Yka;
                return new C883200Yko(c883050YkZ.LIZ, c883050YkZ.LIZIZ);
            }
            if (abstractC883060Yka instanceof C883310Ykz) {
                this.LIZJ = ((C883310Ykz) abstractC883060Yka).LIZIZ;
                return this;
            }
            C0I0B.LJFF.LIZJ();
            if (C894660Z7w.LIZJ()) {
                throw new IllegalStateException("Unexpected action on this state");
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C883180Ykm) {
            C883180Ykm c883180Ykm = (C883180Ykm) obj;
            if (Intrinsics.LJFF(this.LIZIZ, c883180Ykm.LIZIZ) && this.LIZJ == c883180Ykm.LIZJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C883180Ykm(String str, EnumC883260Yku enumC883260Yku) {
        this.LIZIZ = str;
        this.LIZJ = enumC883260Yku;
    }
}
