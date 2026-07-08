package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0C6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308320C6s implements InterfaceC308180C6e {
    public static final C308320C6s LIZ = new C308320C6s();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C308330C6t());
    public static final Set<String> LIZJ = new HashSet();
    public static Set<String> LIZLLL = new HashSet();
    public static boolean LJ;

    @Override // X.InterfaceC308180C6e
    public final List<Integer> LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(it2.next())));
        }
        return arrayList;
    }

    public static void LIZIZ(String str) {
        int iLIZIZ = C307820C4u.LIZJ.LIZIZ(str);
        Set<String> set = LIZJ;
        ((HashSet) set).add(String.valueOf(iLIZIZ));
        C01GW c01gw = LIZIZ;
        ((Keva) c01gw.getValue()).storeInt(str, iLIZIZ);
        if (!LJ) {
            LJ = true;
            LIZLLL = ((Keva) c01gw.getValue()).getStringSet("ColdBootABVid_vidSet", LIZLLL);
        }
        ((Keva) c01gw.getValue()).storeStringSet("ColdBootABVid_vidSet", set);
    }
}
