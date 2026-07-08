package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C460801qo implements InterfaceC460901qp {
    public final Effect LIZ;
    public final EnumC119200co LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460801qo)) {
            return false;
        }
        C460801qo c460801qo = (C460801qo) obj;
        return Intrinsics.LJFF(this.LIZ, c460801qo.LIZ) && this.LIZIZ == c460801qo.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C460801qo(Effect effect, EnumC119200co enumC119200co) {
        this.LIZ = effect;
        this.LIZIZ = enumC119200co;
    }
}
