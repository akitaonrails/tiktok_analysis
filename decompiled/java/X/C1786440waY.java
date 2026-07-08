package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0waY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786440waY implements InterfaceC560980LzM<C1786460waa, List<? extends InterfaceC1780600wR8>> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1786480wac LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "query_product_details";
    }

    public C1786440waY(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1786480wac interfaceC1786480wac) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1786480wac;
    }

    public static List LIZIZ(List list, List list2) {
        if (list2.isEmpty()) {
            return list;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : list2) {
            linkedHashMap.put(((C1786470wab) obj).LIZIZ, obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1780600wR8 interfaceC1780600wR8 = (InterfaceC1780600wR8) it2.next();
            C1786470wab c1786470wab = (C1786470wab) linkedHashMap.get(interfaceC1780600wR8.getProductId());
            if (c1786470wab != null) {
                if (interfaceC1780600wR8 instanceof C1780590wR7) {
                    C1780590wR7 c1780590wR7 = (C1780590wR7) interfaceC1780600wR8;
                    List<C1780620wRA> list3 = c1780590wR7.LIZLLL;
                    ArrayList arrayList2 = new ArrayList();
                    for (C1780620wRA c1780620wRA : list3) {
                        C1780620wRA c1780620wRA2 = c1780620wRA;
                        if (Intrinsics.LJFF(c1780620wRA2.LIZJ, c1786470wab.LIZLLL) && Intrinsics.LJFF(c1780620wRA2.LIZIZ, c1786470wab.LIZJ)) {
                            arrayList2.add(c1780620wRA);
                        }
                    }
                    C1780590wR7 c1780590wR72 = new C1780590wR7(c1780590wR7.LIZ, c1780590wR7.LIZIZ, c1780590wR7.LIZJ, arrayList2);
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(c1780590wR72);
                    }
                } else {
                    arrayList.add(interfaceC1780600wR8);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:24:0x007b, B:26:0x008c, B:27:0x0090, B:28:0x0095), top: B:43:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:24:0x007b, B:26:0x008c, B:27:0x0090, B:28:0x0095), top: B:43:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    @Override // X.InterfaceC560980LzM
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1786460waa r20, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1780600wR8>> r21) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1786440waY.LIZ(X.0waa, X.05Vn):java.lang.Object");
    }
}
