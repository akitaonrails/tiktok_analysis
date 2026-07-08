package X;

import java.util.List;

/* JADX INFO: renamed from: X.0jn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294470jn3 implements InterfaceC1294480jn4, InterfaceC1294590jnF {
    public final C1295950jpR LIZ;
    public final AbstractC1295190joD<Float, Float> LIZIZ;
    public C1293780jlw LIZJ;

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
    }

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LIZ.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020a  */
    @Override // X.InterfaceC1294480jn4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1293780jlw LJFF(X.C1293780jlw r21) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1294470jn3.LJFF(X.0jlw):X.0jlw");
    }

    public static int LIZIZ(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i2 * i3 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    public C1294470jn3(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1294500jn6 c1294500jn6) {
        this.LIZ = c1295950jpR;
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ = c1294500jn6.LIZIZ.LIZ();
        this.LIZIZ = abstractC1295190joDLIZ;
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        abstractC1295190joDLIZ.LIZ(this);
    }
}
