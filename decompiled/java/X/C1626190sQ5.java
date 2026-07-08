package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626190sQ5 implements InterfaceC1627120sRa {
    public final Effect LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626190sQ5)) {
            return false;
        }
        C1626190sQ5 c1626190sQ5 = (C1626190sQ5) obj;
        return Intrinsics.LJFF(this.LIZ, c1626190sQ5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1626190sQ5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1626190sQ5.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlipHotEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1627120sRa
    public final Effect LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1627120sRa
    public final String getTabKey() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1627120sRa
    public final String getTabName() {
        return this.LIZIZ;
    }

    public C1626190sQ5(Effect effect, String str, String str2) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
