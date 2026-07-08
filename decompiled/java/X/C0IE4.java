package X;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IE4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE4 extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static C0IE4 get$arr$(int i) {
        C0IE4 c0ie4 = (C0IE4) arr$.get(i);
        if (c0ie4 != null) {
            return c0ie4;
        }
        arr$.compareAndSet(i, null, new C0IE4(i));
        return (C0IE4) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE4(int i) {
        super(4);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(C0IE4 c0ie4, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        ((Number) obj3).floatValue();
        ((Number) obj4).floatValue();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C0IE4 c0ie4, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJII(interfaceC1631620sYq)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj2)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) == 146 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            interfaceC1631620sYq.invoke(obj2, interfaceC1680500tpg, Integer.valueOf(((i >> 3) & 14) | ((i << 3) & 112)));
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(C0IE4 c0ie4, Object obj, Object obj2, Object obj3, Object obj4) {
        return Unit.LIZ;
    }
}
