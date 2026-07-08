package Y;

import X.C05ZL;
import X.C0NWG;
import X.C0NWH;
import X.C0NWI;
import X.C0NWJ;
import X.C0NWK;
import X.C1259304wJ;
import X.C1396405dK;
import X.C15438062q;
import X.C1673090tdj;
import X.C1677950tlZ;
import X.C1682380tsi;
import X.C1682900ttY;
import X.C1954807lC;
import X.C594920NVa;
import X.C594950NVd;
import X.EnumC1668070tVd;
import X.InterfaceC1690500u5o;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS99S0400000_25 implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0274 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(Y.AObjectS99S0400000_25 r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS99S0400000_25.invoke$0(Y.AObjectS99S0400000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AObjectS99S0400000_25 aObjectS99S0400000_25, Object obj, Object obj2) {
        C594950NVd c594950NVdLIZ;
        C0NWJ c0nwj = (C0NWJ) aObjectS99S0400000_25.l0;
        C594920NVa c594920NVa = (C594920NVa) aObjectS99S0400000_25.l1;
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS99S0400000_25.l2;
        C1682380tsi c1682380tsi = (C1682380tsi) obj2;
        float f = (int) (((C1682900ttY) obj).LIZ & 4294967295L);
        if (c0nwj instanceof C0NWK) {
            c594950NVdLIZ = C1677950tlZ.LIZ(new AObjectS1S0300001_25(f, c1682380tsi, interfaceC1690500u5o, c0nwj, 0));
        } else if (c0nwj instanceof C0NWG) {
            c594950NVdLIZ = C1677950tlZ.LIZ(new AObjectS5S0200001_25(c0nwj, interfaceC1690500u5o, f, 0));
        } else if (c0nwj instanceof C0NWH) {
            c594950NVdLIZ = C1677950tlZ.LIZ(new AObjectS1S0300001_25(f, c1682380tsi, interfaceC1690500u5o, c0nwj, 1));
        } else if (c0nwj instanceof C0NWI) {
            c594950NVdLIZ = C1677950tlZ.LIZ(new AObjectS5S0200001_25(c0nwj, interfaceC1690500u5o, f, 1));
        } else if (c0nwj instanceof C1396405dK) {
            c594950NVdLIZ = C1677950tlZ.LIZ(new AObjectS5S0200001_25(c1682380tsi, c0nwj, f, 2));
        } else {
            if (c0nwj instanceof C1259304wJ) {
                new C1673090tdj();
                c0nwj.getClass();
                new ArrayList(C15438062q.LJIJJ(null, 10));
                throw null;
            }
            throw new C1954807lC();
        }
        return new Pair(c594950NVdLIZ, c594920NVa.LJ());
    }

    public AObjectS99S0400000_25(Function2 function2, Function2 function22, Function2 function23, EnumC1668070tVd enumC1668070tVd, int i) {
        this.$t = i;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = function23;
        this.l3 = enumC1668070tVd;
    }

    public AObjectS99S0400000_25(C0NWJ c0nwj, C594920NVa c594920NVa, InterfaceC1690500u5o interfaceC1690500u5o, float f, C05ZL c05zl, int i) {
        this.$t = i;
        this.l0 = c0nwj;
        this.l1 = c594920NVa;
        this.l2 = interfaceC1690500u5o;
        this.l3 = c05zl;
    }
}
