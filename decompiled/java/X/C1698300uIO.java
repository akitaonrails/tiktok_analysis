package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698300uIO implements InterfaceC19483011Ki {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        switch (this.$t) {
            case 0:
                return test$0(this, obj);
            case 1:
                return test$1(this, obj);
            case 2:
                return test$2(this, obj);
            case 3:
                return test$3(this, obj);
            case 4:
                return test$4(this, obj);
            case 5:
                return test$5(this, obj);
            case 6:
                return test$6(this, obj);
            default:
                return false;
        }
    }

    public C1698300uIO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean test$0(C1698300uIO c1698300uIO, Object obj) {
        String effectId;
        Effect effectLIZ;
        AbstractC1626710sQv abstractC1626710sQv = (AbstractC1626710sQv) obj;
        InterfaceC1626470sQX interfaceC1626470sQX = ((C1627150sRd) c1698300uIO.l0).LLJJJJ;
        if (interfaceC1626470sQX != null && (effectLIZ = C1629110sUn.LIZ(interfaceC1626470sQX)) != null) {
            effectId = effectLIZ.getEffectId();
        } else {
            effectId = null;
        }
        if (abstractC1626710sQv instanceof C1626810sR5) {
            C1626810sR5 c1626810sR5 = (C1626810sR5) abstractC1626710sQv;
            if (Intrinsics.LJFF(C1629110sUn.LIZ(c1626810sR5.LIZLLL).getEffectId(), effectId) && c1626810sR5.LJ > 0) {
                return true;
            }
            return false;
        }
        if (!(abstractC1626710sQv instanceof AbstractC1626750sQz)) {
            return true;
        }
        return Intrinsics.LJFF(effectId, C1629110sUn.LIZ(((AbstractC1626750sQz) abstractC1626710sQv).LIZ()).getEffectId());
    }

    public static final boolean test$1(C1698300uIO c1698300uIO, Object obj) {
        AbstractC1626710sQv abstractC1626710sQv = (AbstractC1626710sQv) obj;
        if ((abstractC1626710sQv instanceof C1626810sR5) && ((C1626810sR5) abstractC1626710sQv).LJ <= ((C1627150sRd) c1698300uIO.l0).LLJJJIL) {
            return false;
        }
        return true;
    }

    public static final boolean test$2(C1698300uIO c1698300uIO, Object obj) {
        C1626480sQY c1626480sQY = (C1626480sQY) c1698300uIO.l0;
        if (!c1626480sQY.LLJI && c1626480sQY.LLJILLL == 0) {
            return true;
        }
        return false;
    }

    public static final boolean test$3(C1698300uIO c1698300uIO, Object obj) {
        return !((C1689650u4R) c1698300uIO.l0).LJIIIZ.contains(((C1689710u4X) obj).LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0tKJ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0tKJ] */
    public static final boolean test$4(C1698300uIO c1698300uIO, Object obj) {
        Integer num;
        C1661050tKJ c1661050tKJ;
        Integer num2;
        ?? r4 = (C1661050tKJ) obj;
        C259800zU c259800zU = (C259800zU) c1698300uIO.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = r4;
        }
        T t = c259800zU.element;
        if (t != 0) {
            c259800zU.element = C1661040tKI.LIZIZ(r4, (C1661050tKJ) t);
            C1661050tKJ c1661050tKJ2 = (C1661050tKJ) ((C259800zU) c1698300uIO.l0).element;
            if (c1661050tKJ2 != null && (num2 = c1661050tKJ2.LJFF) != null && num2.intValue() == -103) {
                return true;
            }
            C1661050tKJ c1661050tKJ3 = (C1661050tKJ) ((C259800zU) c1698300uIO.l0).element;
            if (c1661050tKJ3 != null && (num = c1661050tKJ3.LJFF) != null && num.intValue() == 100 && (c1661050tKJ = (C1661050tKJ) ((C259800zU) c1698300uIO.l0).element) != null && c1661050tKJ.LIZJ != null) {
                return true;
            }
            return false;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final boolean test$5(C1698300uIO c1698300uIO, Object obj) {
        C1632580saO c1632580saO = (C1632580saO) obj;
        if (((Boolean) ((AbstractC1632560saM) c1698300uIO.l0).LJIIIIZZ.getValue()).booleanValue()) {
            return ((AbstractC1632560saM) c1698300uIO.l0).LJIIIZ.contains(c1632580saO.LIZ);
        }
        return true;
    }

    public static final boolean test$6(C1698300uIO c1698300uIO, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        Effect effectLLILIL;
        String effectId;
        C991780buq c991780buq = (C991780buq) ((Pair) obj).getSecond();
        int i = c991780buq.LIZ;
        int i2 = c991780buq.LIZIZ;
        int i3 = c991780buq.LIZJ;
        String str = c991780buq.LIZLLL;
        if (i2 == 9 && i3 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i == 17 && i2 == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC1625000sOA interfaceC1625000sOAG2 = ((AbstractC1637220shs) c1698300uIO.l0).G2();
        if (interfaceC1625000sOAG2 != null && (effectLLILIL = interfaceC1625000sOAG2.C0().LLILIL()) != null && (effectId = effectLLILIL.getEffectId()) != null && str != null && Intrinsics.LJFF(str, effectId)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((z || z2) && z3) {
            return true;
        }
        return false;
    }
}
