package X;

import android.graphics.RenderEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671740tbY extends C09AY implements Function1<InterfaceC1679550to9, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1680710tq1 LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671740tbY(float f, float f2, int i, InterfaceC1680710tq1 interfaceC1680710tq1, boolean z) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = i;
        this.LLILZ = interfaceC1680710tq1;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679550to9 interfaceC1679550to9) {
        AbstractC1683790tuz abstractC1683790tuz;
        InterfaceC1679550to9 interfaceC1679550to92 = interfaceC1679550to9;
        final float fLJJJJLL = interfaceC1679550to92.LJJJJLL(this.LL);
        final float fLJJJJLL2 = interfaceC1679550to92.LJJJJLL(this.LLILLJJLI);
        if (fLJJJJLL > 0.0f && fLJJJJLL2 > 0.0f) {
            final int i = this.LLILLL;
            abstractC1683790tuz = new AbstractC1683790tuz(fLJJJJLL, fLJJJJLL2, i) { // from class: X.0tux
                public final AbstractC1683790tuz LIZIZ = null;
                public final float LIZJ;
                public final float LIZLLL;
                public final int LJ;

                @Override // X.AbstractC1683790tuz
                public final RenderEffect LIZIZ() {
                    AbstractC1683790tuz abstractC1683790tuz2 = this.LIZIZ;
                    float f = this.LIZJ;
                    float f2 = this.LIZLLL;
                    int i2 = this.LJ;
                    return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : abstractC1683790tuz2 == null ? RenderEffect.createBlurEffect(f, f2, C1683780tuy.LIZ(i2)) : RenderEffect.createBlurEffect(f, f2, abstractC1683790tuz2.LIZ(), C1683780tuy.LIZ(i2));
                }

                public final int hashCode() {
                    AbstractC1683790tuz abstractC1683790tuz2 = this.LIZIZ;
                    return ((((((abstractC1683790tuz2 != null ? abstractC1683790tuz2.hashCode() : 0) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BlurEffect(renderEffect=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", radiusX=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", radiusY=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", edgeTreatment=");
                    sbLIZ.append((Object) C1683800tv0.LIZ(this.LJ));
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1683770tux)) {
                        return false;
                    }
                    C1683770tux c1683770tux = (C1683770tux) obj;
                    if (this.LIZJ == c1683770tux.LIZJ && this.LIZLLL == c1683770tux.LIZLLL && this.LJ == c1683770tux.LJ && Intrinsics.LJFF(this.LIZIZ, c1683770tux.LIZIZ)) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZJ = fLJJJJLL;
                    this.LIZLLL = fLJJJJLL2;
                    this.LJ = i;
                }
            };
        } else {
            abstractC1683790tuz = null;
        }
        interfaceC1679550to92.LJIIIIZZ(abstractC1683790tuz);
        InterfaceC1680710tq1 interfaceC1680710tq1 = this.LLILZ;
        if (interfaceC1680710tq1 == null) {
            interfaceC1680710tq1 = C1669430tXp.LIZ;
        }
        interfaceC1679550to92.LJLJL(interfaceC1680710tq1);
        interfaceC1679550to92.LJIILIIL(this.LLILZIL);
        return Unit.LIZ;
    }
}
