package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0u2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1688390u2P {
    public static int LIZ(InterfaceC20053113dB interfaceC20053113dB, InterfaceC1676350tiz interfaceC1676350tiz, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1688410u2R((InterfaceC1676340tiy) ListProtector.get(list, i2), EnumC995460c0m.Max, EnumC1154470g9F.Height));
        }
        return interfaceC20053113dB.LJFF(new C1691200u6w(interfaceC1676350tiz, interfaceC1676350tiz.getLayoutDirection()), arrayList, C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE)).getHeight();
    }

    public static int LIZIZ(InterfaceC20053113dB interfaceC20053113dB, InterfaceC1676350tiz interfaceC1676350tiz, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1688410u2R((InterfaceC1676340tiy) ListProtector.get(list, i2), EnumC995460c0m.Max, EnumC1154470g9F.Width));
        }
        return interfaceC20053113dB.LJFF(new C1691200u6w(interfaceC1676350tiz, interfaceC1676350tiz.getLayoutDirection()), arrayList, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }

    public static int LIZJ(InterfaceC20053113dB interfaceC20053113dB, InterfaceC1676350tiz interfaceC1676350tiz, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1688410u2R((InterfaceC1676340tiy) ListProtector.get(list, i2), EnumC995460c0m.Min, EnumC1154470g9F.Height));
        }
        return interfaceC20053113dB.LJFF(new C1691200u6w(interfaceC1676350tiz, interfaceC1676350tiz.getLayoutDirection()), arrayList, C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE)).getHeight();
    }

    public static int LIZLLL(InterfaceC20053113dB interfaceC20053113dB, InterfaceC1676350tiz interfaceC1676350tiz, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1688410u2R((InterfaceC1676340tiy) ListProtector.get(list, i2), EnumC995460c0m.Min, EnumC1154470g9F.Width));
        }
        return interfaceC20053113dB.LJFF(new C1691200u6w(interfaceC1676350tiz, interfaceC1676350tiz.getLayoutDirection()), arrayList, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }
}
