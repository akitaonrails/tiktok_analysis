package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.14dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20309114dN extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
    public C20309114dN(C20068313fd c20068313fd, InterfaceC20070113fv interfaceC20070113fv, int i) {
        super(4);
        this.$t = i;
        this.l0 = c20068313fd;
        this.l1 = interfaceC20070113fv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20309114dN(List list, C05P0 c05p0, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = c05p0;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C20309114dN c20309114dN, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            C443120HZe c443120HZe = (C443120HZe) ListProtector.get((List) c20309114dN.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-332173845);
            InterfaceC19211810Ea interfaceC19211810Ea = (InterfaceC19211810Ea) c443120HZe.getFirst();
            boolean zBooleanValue = ((Boolean) c443120HZe.getSecond()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) c443120HZe.getThird()).booleanValue();
            if (interfaceC19211810Ea instanceof EnumC19320810iM) {
                interfaceC1680500tpg.LJJIIJZLJL(1513306555);
                C14Y4.LIZIZ((EnumC19320810iM) interfaceC19211810Ea, interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJ();
            } else if (interfaceC19211810Ea instanceof EnumC2174461A8e) {
                interfaceC1680500tpg.LJJIIJZLJL(1513308459);
                C14Y4.LJIIIZ((EnumC2174461A8e) interfaceC19211810Ea, zBooleanValue, zBooleanValue2, interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJ();
            } else if (interfaceC19211810Ea instanceof EnumC2174511A8j) {
                interfaceC1680500tpg.LJJIIJZLJL(1513310991);
                C14Y4.LIZ((EnumC2174511A8j) interfaceC19211810Ea, zBooleanValue, zBooleanValue2, interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJ();
            } else if (interfaceC19211810Ea instanceof InterfaceC1688870u3B) {
                interfaceC1680500tpg.LJJIIJZLJL(1513313647);
                C14Y4.LJII((InterfaceC1688870u3B) interfaceC19211810Ea, zBooleanValue, zBooleanValue2, interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJ();
            } else if (interfaceC19211810Ea instanceof EnumC2174521A8k) {
                interfaceC1680500tpg.LJJIIJZLJL(1513316237);
                C14Y4.LIZJ((EnumC2174521A8k) interfaceC19211810Ea, zBooleanValue, zBooleanValue2, interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJ();
            } else if (interfaceC19211810Ea instanceof EnumC2174471A8f) {
                interfaceC1680500tpg.LJJIIJZLJL(1513318849);
                C14Y4.LIZLLL((EnumC2174471A8f) interfaceC19211810Ea, zBooleanValue, zBooleanValue2, (String) ((C05P0) c20309114dN.l1).getValue(), interfaceC1680500tpg, 0, 0);
                interfaceC1680500tpg.LJ();
            } else if (interfaceC19211810Ea instanceof EnumC2174421A8a) {
                interfaceC1680500tpg.LJJIIJZLJL(1513322063);
                C14Y4.LJIIIIZZ((EnumC2174421A8a) interfaceC19211810Ea, zBooleanValue, zBooleanValue2, interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJ();
            } else {
                interfaceC1680500tpg.LJJIIJZLJL(-331601090);
                interfaceC1680500tpg.LJ();
            }
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C20309114dN c20309114dN, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C20068313fd) c20309114dN.l0).LJFF.set(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        C20068313fd c20068313fd = (C20068313fd) c20309114dN.l0;
        c20068313fd.LIZ.LIZLLL(c20068313fd.LIZJ, ((InterfaceC20070113fv) c20309114dN.l1).LJIJJLI(), ((C20068313fd) c20309114dN.l0).LJFF);
        return Unit.LIZ;
    }
}
