package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899810zXP {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final Keva LIZ = Keva.getRepo("fission_sp");
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public final Map<String, Integer> LJFF = new LinkedHashMap();
    public final C1899820zXQ LJI = new C1899820zXQ();
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String LIZIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }

    public final int LIZLLL(String str) {
        String strLIZIZ = LIZIZ();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_day");
        sbLIZ.append(str);
        if (Intrinsics.LJFF(strLIZIZ, keva.getString(C2188811AlT.LIZIZ(sbLIZ), ""))) {
            if (Intrinsics.LJFF(str, "_type_inactive_timer")) {
                if (this.LIZIZ == -1) {
                    Keva keva2 = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("today_showed_time");
                    sbLIZ2.append(str);
                    this.LIZIZ = keva2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
                }
                return this.LIZIZ;
            }
            if (Intrinsics.LJFF(str, "_type_bottom_tab_bubble")) {
                if (this.LIZLLL == -1) {
                    Keva keva3 = this.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("today_showed_time");
                    sbLIZ3.append(str);
                    this.LIZLLL = keva3.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
                }
                return this.LIZLLL;
            }
            if (u.LJJIIJZLJL(str, "_type_bottom_button", false)) {
                if (this.LJ == -1) {
                    Keva keva4 = this.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("today_showed_time");
                    sbLIZ4.append(str);
                    this.LJ = keva4.getInt(C2188811AlT.LIZIZ(sbLIZ4), 0);
                }
                return this.LJ;
            }
            if (u.LJJIIJZLJL(str, "_type_bubble", false)) {
                if (!this.LJFF.containsKey(str)) {
                    Map<String, Integer> map = this.LJFF;
                    Keva keva5 = this.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("today_showed_time");
                    sbLIZ5.append(str);
                    map.put(str, Integer.valueOf(keva5.getInt(C2188811AlT.LIZIZ(sbLIZ5), 0)));
                }
                Integer num = (Integer) ((LinkedHashMap) this.LJFF).get(str);
                if (num != null) {
                    return num.intValue();
                }
                return -1;
            }
            if (this.LIZJ == -1) {
                Keva keva6 = this.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("today_showed_time");
                sbLIZ6.append(str);
                this.LIZJ = keva6.getInt(C2188811AlT.LIZIZ(sbLIZ6), 0);
            }
            return this.LIZJ;
        }
        Keva keva7 = this.LIZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("current_day");
        sbLIZ7.append(str);
        keva7.storeString(C2188811AlT.LIZIZ(sbLIZ7), LIZIZ());
        Keva keva8 = this.LIZ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("today_showed_time");
        sbLIZ8.append(str);
        keva8.storeInt(C2188811AlT.LIZIZ(sbLIZ8), 0);
        return 0;
    }

    public final void LJ(String str) {
        int iLIZLLL = LIZLLL(str) + 1;
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("today_showed_time");
        sbLIZ.append(str);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), iLIZLLL);
        if (u.LJJIIJZLJL(str, "_type_bottom_button", false)) {
            this.LJ = iLIZLLL;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJFF(String str) {
        C1899820zXQ c1899820zXQ = this.LJI;
        if (c1899820zXQ != null) {
            long jLIZ = C1899820zXQ.LIZ();
            int i = 0;
            ArrayList arrayList = (ArrayList) C13LQ.LJLI(c1899820zXQ.LIZ.getStringArray("pendant_close_day_list", new String[0]));
            arrayList.add(String.valueOf(jLIZ));
            Keva keva = c1899820zXQ.LIZ;
            String[] strArr = new String[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                strArr[i] = it2.next();
                i++;
            }
            keva.storeStringArray("pendant_close_day_list", strArr);
            if (this.LJIIJ <= 0) {
                int i2 = this.LJII;
                if (i2 > 0 && this.LJIIIZ > 0 && this.LJIIIIZZ > 0 && this.LJI.LIZIZ(i2) >= this.LJIIIIZZ) {
                    this.LIZ.storeLong(str, LIZ() + ((long) (this.LJIIIZ * 86400000)));
                    return;
                }
                return;
            }
            int i3 = this.LJII;
            if (i3 <= 0 || this.LJIIIIZZ <= 0 || this.LJI.LIZIZ(i3) < this.LJIIIIZZ) {
                return;
            }
            this.LIZ.storeLong(str, System.currentTimeMillis() + ((long) (this.LJIIJ * 3600000)));
        }
    }

    public final boolean LIZJ(int i, int i2, int i3, int i4, String str) {
        long jCurrentTimeMillis;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
        if (i != 0 && i2 != 0) {
            long j = this.LIZ.getLong(str, -1L);
            if (j > 0) {
                if (i4 <= 0) {
                    jCurrentTimeMillis = LIZ();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                if (jCurrentTimeMillis >= j) {
                    this.LIZ.storeLong(str, -1L);
                } else {
                    return false;
                }
            }
            return true;
        }
        this.LIZ.storeLong(str, -1L);
        return true;
    }
}
