package X;

import kotlin.Unit;
import v7.o;

/* JADX INFO: renamed from: X.09rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502709rN extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

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
    /* JADX WARN: Multi-variable type inference failed */
    public C2502709rN(C259800zU c259800zU, C259800zU<String> c259800zU2) {
        super(4);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2502709rN(o oVar, o<Unit> oVar2) {
        super(4);
        this.$t = oVar2;
        this.l0 = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(C2502709rN c2502709rN, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C259800zU) c2502709rN.l0).element = obj4;
        return Unit.LIZ;
    }

    public static final Object invoke$1(C2502709rN c2502709rN, Object obj, Object obj2, Object obj3, Object obj4) {
        ((o) c2502709rN.l0).LJ(null);
        return Unit.LIZ;
    }
}
