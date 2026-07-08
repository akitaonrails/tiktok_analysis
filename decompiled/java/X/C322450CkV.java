package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322450CkV {
    public final List<Object> LIZ;

    public C322450CkV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C322450CkV) && Intrinsics.LJFF(this.LIZ, ((C322450CkV) obj).LIZ);
    }

    public C322450CkV(int i) {
        this(C13BV.INSTANCE);
    }

    public final void LIZ(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.LIZ) {
            if (obj instanceof C322460CkW) {
                C322460CkW c322460CkW = (C322460CkW) obj;
                if (c322460CkW.LIZJ instanceof C322280CkE) {
                    arrayList.add(c322460CkW.LJ);
                }
            }
        }
        map.put("prop_list", C335840DEo.LIZIZ(arrayList));
    }

    public final void LIZIZ(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.LIZ) {
            if (obj instanceof C322460CkW) {
                C322460CkW c322460CkW = (C322460CkW) obj;
                if (c322460CkW.LIZJ instanceof C322280CkE) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append(c322460CkW.LJIIL);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        map.put("prop_status_list", C335840DEo.LIZIZ(arrayList));
    }

    public C322450CkV(List<? extends Object> list) {
        this.LIZ = list;
    }
}
