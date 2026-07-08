package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348240Dl0 {
    public final EnumC356010DxX LIZ;
    public String LIZIZ;
    public EnumC356020DxY LIZJ;
    public final HashMap<String, C348250Dl1> LIZLLL;
    public final HashMap<String, C348250Dl1> LJ;

    public C348240Dl0() {
        this(EnumC356010DxX.UNKNOWN);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("node size ");
        sbLIZ.append(this.LIZLLL.keySet().size());
        sbLIZ.append(" \n ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (String str : this.LIZLLL.keySet()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('[');
            sbLIZ2.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C348250Dl1 c348250Dl1 = this.LIZLLL.get(str);
            if (c348250Dl1 != null) {
                for (String str2 : c348250Dl1.LIZJ.keySet()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ2);
                    sbLIZ3.append('(');
                    sbLIZ3.append(str2);
                    sbLIZ3.append(" : ");
                    sbLIZ3.append(c348250Dl1.LIZJ.get(str2));
                    sbLIZ3.append(')');
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ2);
            sbLIZ4.append("] \n");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        return strLIZIZ;
    }

    public C348240Dl0(EnumC356010DxX enumC356010DxX) {
        this.LIZ = enumC356010DxX;
        this.LIZJ = EnumC356020DxY.ENABLE;
        this.LIZLLL = new HashMap<>();
        this.LJ = new HashMap<>();
    }

    public final void LIZ(String str) {
        if (this.LJ.get(str) == null) {
            this.LJ.put(str, new C348250Dl1());
        }
        this.LIZLLL.remove(str);
    }

    public final void LIZJ(String str, String str2) {
        if (this.LIZLLL.get(str) == null) {
            this.LIZLLL.put(str, new C348250Dl1());
        }
        this.LIZLLL.get(str).LIZ = str2;
    }

    public final void LIZLLL(String str, String str2) {
        if (this.LIZLLL.get(str) == null) {
            this.LIZLLL.put(str, new C348250Dl1());
        }
        C348250Dl1 c348250Dl1 = this.LIZLLL.get(str);
        if (c348250Dl1 != null) {
            c348250Dl1.LIZIZ = str2;
        }
    }

    public final void LJFF(String str, String str2) {
        if (this.LIZLLL.get(str) == null) {
            this.LIZLLL.put(str, new C348250Dl1());
        }
        this.LIZLLL.get(str).LIZLLL = str2;
    }

    public final void LIZIZ(List<String> list, List<String> list2, List<String> list3) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{":"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() >= 2) {
                if (this.LJ.get(ListProtector.get(listLJJLIIIJILLIZJL, 0)) == null) {
                    this.LJ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), new C348250Dl1());
                }
                this.LJ.get(ListProtector.get(listLJJLIIIJILLIZJL, 0)).LIZJ.put((String) ListProtector.get(listLJJLIIIJILLIZJL, 1), Float.valueOf(0.0f));
                LIZ((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            }
        }
        int i = 0;
        for (String str : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
                if (listLJJLIIIJILLIZJL2.size() >= 2) {
                    LJ(Float.valueOf(CastFloatProtector.parseFloat((String) ListProtector.get(listLJJLIIIJILLIZJL2, 2))), (String) ListProtector.get(listLJJLIIIJILLIZJL2, 0), (String) ListProtector.get(listLJJLIIIJILLIZJL2, 1));
                    LIZJ((String) ListProtector.get(listLJJLIIIJILLIZJL2, 0), (String) ListProtector.get(list3, i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJ(Float f, String str, String str2) {
        if (this.LIZLLL.get(str) == null) {
            this.LIZLLL.put(str, new C348250Dl1());
        }
        C348250Dl1 c348250Dl1 = this.LIZLLL.get(str);
        if (f == null) {
            c348250Dl1.LIZJ.remove(str2);
        } else {
            c348250Dl1.LIZJ.put(str2, f);
        }
    }
}
