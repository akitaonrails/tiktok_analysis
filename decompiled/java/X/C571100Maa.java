package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Maa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571100Maa<C> {
    public final InterfaceC571170Mah<C> LIZ;
    public final List<C571160Mag<C>> LIZIZ;

    public final List<Pair<String, String>> LIZ() {
        String str;
        List<C571160Mag<C>> list = this.LIZIZ;
        ArrayList<C571160Mag> arrayList = new ArrayList();
        for (C571160Mag<C> c571160Mag : list) {
            EnumC571130Mad enumC571130Mad = c571160Mag.LIZIZ;
            if (enumC571130Mad != EnumC571130Mad.MATCHED && enumC571130Mad != EnumC571130Mad.NOT_EVALUATED) {
                arrayList.add(c571160Mag);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C571160Mag c571160Mag2 : arrayList) {
            int i = C571150Maf.LIZ[c571160Mag2.LIZIZ.ordinal()];
            if (i == 1) {
                str = "experiment disabled";
            } else if (i != 2) {
                str = "unknown";
            } else {
                str = c571160Mag2.LIZJ;
                if (str == null) {
                    str = "conditions not met";
                }
            }
            arrayList2.add(new Pair(c571160Mag2.LIZ.getName(), str));
        }
        return arrayList2;
    }

    public C571100Maa(InterfaceC571170Mah<C> interfaceC571170Mah, List<C571160Mag<C>> list) {
        this.LIZ = interfaceC571170Mah;
        this.LIZIZ = list;
    }
}
