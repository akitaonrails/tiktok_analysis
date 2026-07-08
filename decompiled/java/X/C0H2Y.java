package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H2Y implements InterfaceC1891350zJl, InterfaceC1015900cXk {
    public final boolean LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final List<C427720Gpu> LLILZIL;
    public final C434640H2o LLILZLL;
    public final Boolean LLIZ;
    public Float LLIZLLLIL;
    public Float LLJ;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H2Y)) {
            return false;
        }
        C0H2Y c0h2y = (C0H2Y) obj;
        return this.LL == c0h2y.LL && Intrinsics.LJFF(this.LLILLJJLI, c0h2y.LLILLJJLI) && this.LLILLL == c0h2y.LLILLL && this.LLILZ == c0h2y.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0h2y.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0h2y.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0h2y.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31;
        C434640H2o c434640H2o = this.LLILZLL;
        int iHashCode = (iZ2 + (c434640H2o == null ? 0 : c434640H2o.hashCode())) * 31;
        Boolean bool = this.LLIZ;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSourceFromEntitiesPowerItem(isPage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prefixContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", totalAvatarNum=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayAvatarNum=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", avatarList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", referenceRenderData=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", interceptClick=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLJ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLIZLLLIL = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0H2Y) {
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0H2Y(boolean z, String str, int i, int i2, List<C427720Gpu> list, C434640H2o c434640H2o, Boolean bool) {
        float f;
        float f2;
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = list;
        this.LLILZLL = c434640H2o;
        this.LLIZ = bool;
        if (z) {
            f = 4.0f;
        } else {
            f = 2.0f;
        }
        this.LLIZLLLIL = Float.valueOf(f);
        if (z) {
            f2 = 12.0f;
        } else {
            f2 = 8.0f;
        }
        this.LLJ = Float.valueOf(f2);
    }
}
