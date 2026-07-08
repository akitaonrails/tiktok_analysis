package X;

import androidx.compose.foundation.layout.c;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import o0.k;

/* JADX INFO: renamed from: X.0uIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698390uIX extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static C1698390uIX get$arr$(int i) {
        C1698390uIX c1698390uIX = (C1698390uIX) arr$.get(i);
        if (c1698390uIX != null) {
            return c1698390uIX;
        }
        arr$.compareAndSet(i, null, new C1698390uIX(i));
        return (C1698390uIX) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
    public C1698390uIX(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C1698390uIX c1698390uIX, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC1665350tRF interfaceC1665350tRF = (InterfaceC1665350tRF) obj2;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        ((Number) obj4).intValue();
        if (interfaceC1665350tRF != null) {
            C1665680tRm.LJFF(interfaceC1665350tRF, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1698390uIX c1698390uIX, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        if ((((Number) obj4).intValue() & 129) == 128 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            float f = 78;
            float f2 = 8;
            k.LIZ(C1667200tUE.LIZ(C1675980tiO.LIZIZ(c.LJIILJJIL(InterfaceC1685750ty9.LIZ, f, f), C1670400tZO.LIZIZ(interfaceC1680500tpg).U2(), C1669050tXD.LIZIZ(f2)), C1669050tXD.LIZIZ(f2)), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1698390uIX c1698390uIX, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        if ((((Number) obj4).intValue() & 129) == 128 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            k.LIZ(C1667200tUE.LIZ(C1675980tiO.LIZIZ(c.LJIILJJIL(InterfaceC1685750ty9.LIZ, 140, 32), C1670400tZO.LIZIZ(interfaceC1680500tpg).U2(), C1669430tXp.LIZ), C1669050tXD.LIZIZ(5)), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }
}
