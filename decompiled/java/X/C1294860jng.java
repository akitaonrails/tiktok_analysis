package X;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294860jng implements InterfaceC1294510jn7 {
    public final String LIZ;
    public final List<InterfaceC1294510jn7> LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShapeGroup{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("' Shapes: ");
        sbLIZ.append(Arrays.toString(this.LIZIZ.toArray()));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1294860jng(String str, boolean z, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
    }

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, AbstractC1295030jnx abstractC1295030jnx) {
        return new C1295040jny(c1295950jpR, abstractC1295030jnx, this, c1294720jnS);
    }
}
