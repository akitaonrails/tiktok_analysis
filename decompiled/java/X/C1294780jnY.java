package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294780jnY {
    public static final C1296750jqj LIZ = C1296750jqj.LIZ("k", "x", "y");

    public static C1294890jnj LIZ(C1296380jq8 c1296380jq8, C1294720jnS c1294720jnS) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (c1296380jq8.LJIJJLI() == EnumC1295540jom.BEGIN_ARRAY) {
            c1296380jq8.LIZ();
            while (c1296380jq8.LJII()) {
                if (c1296380jq8.LJIJJLI() == EnumC1295540jom.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C1294830jnd(c1294720jnS, C1294790jnZ.LIZIZ(c1296380jq8, c1294720jnS, C1294350jmr.LIZJ(), new InterfaceC1295730jp5<PointF>() { // from class: X.0joz
                    @Override // X.InterfaceC1295730jp5
                    public final PointF LIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
                        return C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                    }
                }, z, false)));
            }
            c1296380jq8.LIZLLL();
            C1294800jna.LIZIZ(arrayList);
        } else {
            arrayList.add(new C1294810jnb(C1294770jnX.LIZIZ(c1296380jq8, C1294350jmr.LIZJ())));
        }
        return new C1294890jnj(arrayList);
    }

    public static InterfaceC1294490jn5 LIZIZ(C1296380jq8 c1296380jq8, C1294720jnS c1294720jnS) {
        c1296380jq8.LIZIZ();
        C1294890jnj c1294890jnjLIZ = null;
        final C1295020jnw c1295020jnwLIZIZ = null;
        boolean z = false;
        final C1295020jnw c1295020jnwLIZIZ2 = null;
        while (c1296380jq8.LJIJJLI() != EnumC1295540jom.END_OBJECT) {
            int iLJJIL = c1296380jq8.LJJIL(LIZ);
            if (iLJJIL != 0) {
                if (iLJJIL != 1) {
                    if (iLJJIL != 2) {
                        c1296380jq8.LJJIZ();
                        c1296380jq8.LJJJ();
                    } else if (c1296380jq8.LJIJJLI() == EnumC1295540jom.STRING) {
                        c1296380jq8.LJJJ();
                        z = true;
                    } else {
                        c1295020jnwLIZIZ = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true);
                    }
                } else if (c1296380jq8.LJIJJLI() == EnumC1295540jom.STRING) {
                    c1296380jq8.LJJJ();
                    z = true;
                } else {
                    c1295020jnwLIZIZ2 = C1294870jnh.LIZIZ(c1296380jq8, c1294720jnS, true);
                }
            } else {
                c1294890jnjLIZ = LIZ(c1296380jq8, c1294720jnS);
            }
        }
        c1296380jq8.LJFF();
        if (z) {
            c1294720jnS.LIZ("Lottie doesn't support expressions.");
        }
        if (c1294890jnjLIZ != null) {
            return c1294890jnjLIZ;
        }
        return new InterfaceC1294490jn5<PointF, PointF>(c1295020jnwLIZIZ2, c1295020jnwLIZIZ) { // from class: X.0jnp
            public final C1295020jnw LIZ;
            public final C1295020jnw LIZIZ;

            @Override // X.InterfaceC1294490jn5
            public final AbstractC1295190joD<PointF, PointF> LIZ() {
                return new C1295140jo8((C1295230joH) this.LIZ.LIZ(), (C1295230joH) this.LIZIZ.LIZ());
            }

            @Override // X.InterfaceC1294490jn5
            public final List<C1294810jnb<PointF>> LIZIZ() {
                throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
            }

            @Override // X.InterfaceC1294490jn5
            public final boolean LIZJ() {
                return this.LIZ.LIZJ() && this.LIZIZ.LIZJ();
            }

            {
                this.LIZ = c1295020jnwLIZIZ2;
                this.LIZIZ = c1295020jnwLIZIZ;
            }
        };
    }
}
