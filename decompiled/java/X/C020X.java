package X;

import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.020X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020X extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020X(C953600avG c953600avG, C953610avH c953610avH, int i) {
        super(4);
        this.$t = i;
        this.l0 = c953610avH;
        this.l1 = c953600avG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020X(C1449980nps c1449980nps, C0VSJ c0vsj, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1449980nps;
        this.l1 = c0vsj;
    }

    public static final Object invoke$0(C020X c020x, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C475901tF(iIntValue, iIntValue2, (ByteBuffer) obj, (Function0) c020x.l0, (File) c020x.l1, null), 3);
        return Boolean.FALSE;
    }

    public static final Object invoke$1(C020X c020x, Object obj, Object obj2, Object obj3, Object obj4) {
        C953660avM c953660avM;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        int iIntValue = ((Number) obj3).intValue();
        ((Number) obj4).longValue();
        if (!zBooleanValue && (c953660avM = ((C953610avH) c020x.l0).LJ.get(((C953600avG) c020x.l1).LIZ)) != null) {
            C953600avG c953600avG = (C953600avG) c020x.l1;
            C953620avI.LJFF(c953660avM, c953600avG.LJIIIIZZ, c953600avG.LIZ, EnumC953170auZ.API_CALL_FAIL, Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }
}
