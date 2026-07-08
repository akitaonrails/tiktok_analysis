package X;

import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14lU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20359414lU {
    public final long LIZ;
    public String LIZIZ;
    public final List<C20361214lm> LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public EnumC1779020wOa LJII;
    public final List<String> LJIIIIZZ = Collections.singletonList("countdown_check");
    public final List<String> LJIIIZ = C1697810uHb.LJIIJJI("all_decoration_succeeded", "partial_decoration_succeeded", "never");

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20359414lU)) {
            return false;
        }
        C20359414lU c20359414lU = (C20359414lU) obj;
        return this.LIZ == c20359414lU.LIZ && Intrinsics.LJFF(this.LIZIZ, c20359414lU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20359414lU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20359414lU.LIZLLL) && Intrinsics.LJFF(this.LJ, c20359414lU.LJ) && Intrinsics.LJFF(this.LJFF, c20359414lU.LJFF) && this.LJI == c20359414lU.LJI && this.LJII == c20359414lU.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookStep(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", comment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tips=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", conditions=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", autoRunMode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isDecorationStep=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", decorationState=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C20368314mv> LIZ() {
        Condition condition;
        boolean z;
        List<Condition> list;
        Condition next;
        ArrayList arrayList = new ArrayList();
        String str = this.LJ;
        ConditionData conditionDataLIZ = str != null ? C20356614l2.LIZ(str) : null;
        for (String str2 : this.LJI ? this.LJIIIZ : this.LJIIIIZZ) {
            if (conditionDataLIZ == null || (list = conditionDataLIZ.conditions) == null) {
                condition = null;
            } else {
                Iterator<Condition> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.LJFF(next.name, str2)) {
                        break;
                    }
                }
                condition = next;
            }
            String strLIZJ = C20359314lT.LIZJ(str2);
            Condition condition2 = new Condition(str2, null, null, 0);
            if (condition == null) {
                z = false;
            } else {
                condition2 = condition;
                z = true;
            }
            arrayList.add(new C20368314mv(condition2, z, C20359314lT.LIZIZ(str2), strLIZJ, C13BV.INSTANCE));
        }
        return arrayList;
    }

    public C20359414lU(long j, String str, List<C20361214lm> list, String str2, String str3, String str4, boolean z, EnumC1779020wOa enumC1779020wOa) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z;
        this.LJII = enumC1779020wOa;
    }
}
