package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ry0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608780ry0 {
    public static final <STATE extends InterfaceC1606880ruw, VARIANT extends InterfaceC426680GoE> Map<EnumC1608710rxt, InterfaceC1609010ryN> LIZ(AbstractC1608790ry1<STATE, VARIANT> abstractC1608790ry1, InterfaceC1606880ruw interfaceC1606880ruw) {
        LinkedHashMap linkedHashMap = null;
        if (interfaceC1606880ruw != null) {
            if (!Intrinsics.LJFF(abstractC1608790ry1.LIZJ, abstractC1608790ry1.LJ())) {
                abstractC1608790ry1.LIZJ = (VARIANT) abstractC1608790ry1.LJ();
                ((Map) abstractC1608790ry1.LIZ.getValue()).clear();
            }
            String string = interfaceC1606880ruw.getString();
            if (((Map) abstractC1608790ry1.LIZ.getValue()).get(string) == null) {
                linkedHashMap = new LinkedHashMap();
                C1606960rv4 c1606960rv4LIZ = abstractC1608790ry1.LIZ(interfaceC1606880ruw);
                if (c1606960rv4LIZ != null) {
                    linkedHashMap.put(EnumC1608710rxt.BADGE, c1606960rv4LIZ);
                }
                C1608720rxu c1608720rxuLIZIZ = abstractC1608790ry1.LIZIZ(interfaceC1606880ruw);
                if (c1608720rxuLIZIZ != null) {
                    linkedHashMap.put(EnumC1608710rxt.FRAME, c1608720rxuLIZIZ);
                }
                C1606950rv3 c1606950rv3LIZLLL = abstractC1608790ry1.LIZLLL(interfaceC1606880ruw);
                if (c1606950rv3LIZLLL != null) {
                    linkedHashMap.put(EnumC1608710rxt.RING, c1606950rv3LIZLLL);
                }
                C1606990rv7 c1606990rv7LIZJ = abstractC1608790ry1.LIZJ(interfaceC1606880ruw);
                if (c1606990rv7LIZJ != null) {
                    linkedHashMap.put(EnumC1608710rxt.OVERLAY, c1606990rv7LIZJ);
                }
            } else {
                return (Map) ((Map) abstractC1608790ry1.LIZ.getValue()).get(string);
            }
        }
        return linkedHashMap;
    }
}
