package X;

import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: X.020d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5181020d extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5181020d(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<String> c259800zU, C259800zU<String> c259800zU2) {
        super(3);
        this.$t = c259800zU2;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(C5181020d c5181020d, Object obj, Object obj2, Object obj3) {
        ((C118300cf) c5181020d.l0).element = ((Number) obj).intValue();
        ((C259800zU) c5181020d.l1).element = obj2;
        ((C259800zU) c5181020d.l2).element = obj3;
        return Unit.LIZ;
    }

    public static final Object invoke$1(C5181020d c5181020d, Object obj, Object obj2, Object obj3) {
        C364901bL c364901bL = (C364901bL) obj2;
        if (((Boolean) obj).booleanValue() && c364901bL != null) {
            File file = c364901bL.LIZ;
            if (file != null) {
                C23250099c.LIZLLL((InterfaceC497601wk) c5181020d.l0, null, null, new C365001bM(file, (File) c5181020d.l1, (InterfaceC1364105Vn) c5181020d.l2, null), 3);
            } else {
                C23250099c.LIZLLL((InterfaceC497601wk) c5181020d.l0, null, null, new C364701bJ((InterfaceC1364105Vn) c5181020d.l2, c364901bL, (File) c5181020d.l1, null), 3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5181020d(InterfaceC497601wk interfaceC497601wk, C0VSJ c0vsj, C23260099m c23260099m, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = c0vsj;
        this.l2 = c23260099m;
    }
}
