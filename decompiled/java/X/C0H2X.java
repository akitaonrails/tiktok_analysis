package X;

import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H2X implements InterfaceC1891350zJl, InterfaceC1015900cXk {
    public final SourceFromEntities LL;
    public final C434640H2o LLILLJJLI;
    public Float LLILLL = Float.valueOf(0.0f);
    public Float LLILZ = Float.valueOf(4.0f);

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H2X)) {
            return false;
        }
        C0H2X c0h2x = (C0H2X) obj;
        return Intrinsics.LJFF(this.LL, c0h2x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h2x.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C434640H2o c434640H2o = this.LLILLJJLI;
        return iHashCode + (c434640H2o == null ? 0 : c434640H2o.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrandAndSourceItem(sourceFromEntities=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", referenceRenderData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLILZ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILLL = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0H2X) {
            C0H2X c0h2x = (C0H2X) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c0h2x.LL, this.LL) && Intrinsics.LJFF(c0h2x.LLILLJJLI, this.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C0H2X;
    }

    public C0H2X(SourceFromEntities sourceFromEntities, C434640H2o c434640H2o) {
        this.LL = sourceFromEntities;
        this.LLILLJJLI = c434640H2o;
    }
}
