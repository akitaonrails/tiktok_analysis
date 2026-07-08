package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VUF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUF extends C0VUG {
    public static final C0VUF LJFF = new C0VUF();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(313));

    public C0VUF() {
        super("android.database.sqlite.SQLiteDebug", "android.database.sqlite.SQLiteDebug$PagerStats", "system");
    }

    @Override // X.C0VUG
    public final C0VUA LIZIZ() {
        C0VUA c0vua;
        Object objA0;
        List list;
        Number number;
        Number number2;
        Number number3;
        Number number4;
        Number number5;
        Number number6;
        C0VUI c0vui = (C0VUI) LJI.getValue();
        if (c0vui != null) {
            try {
                objA0 = C2204961BRm.a0(c0vui.LIZIZ, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJwAYI2Hj1zQ3LJrE2VcvmvbRtdQ0O7gT0=", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vua = C0VUA.LJFF;
            }
            if (objA0 != null) {
                C0VUJ c0vujLIZ = c0vui.LIZ.LIZ(objA0);
                Object obj = c0vui.LIZJ.get(objA0);
                if (!(obj instanceof List) || (list = (List) obj) == null) {
                    list = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        Field field = c0vui.LIZLLL;
                        Object obj3 = field != null ? field.get(obj2) : null;
                        String str = obj3 instanceof String ? (String) obj3 : null;
                        Field field2 = c0vui.LJ;
                        Object obj4 = field2 != null ? field2.get(obj2) : null;
                        long jLongValue = (!(obj4 instanceof Number) || (number6 = (Number) obj4) == null) ? 0L : number6.longValue();
                        Field field3 = c0vui.LJFF;
                        Object obj5 = field3 != null ? field3.get(obj2) : null;
                        long jLongValue2 = (!(obj5 instanceof Number) || (number5 = (Number) obj5) == null) ? 0L : number5.longValue();
                        Field field4 = c0vui.LJI;
                        Object obj6 = field4 != null ? field4.get(obj2) : null;
                        int iIntValue = (!(obj6 instanceof Number) || (number4 = (Number) obj6) == null) ? 0 : number4.intValue();
                        Field field5 = c0vui.LJII;
                        Object obj7 = field5 != null ? field5.get(obj2) : null;
                        int iIntValue2 = (!(obj7 instanceof Number) || (number3 = (Number) obj7) == null) ? 0 : number3.intValue();
                        Field field6 = c0vui.LJIIIIZZ;
                        Object obj8 = field6 != null ? field6.get(obj2) : null;
                        int iIntValue3 = (!(obj8 instanceof Number) || (number2 = (Number) obj8) == null) ? 0 : number2.intValue();
                        Field field7 = c0vui.LJIIIZ;
                        Object obj9 = field7 != null ? field7.get(obj2) : null;
                        arrayList.add(new C0VUH(str, jLongValue, jLongValue2, iIntValue, iIntValue2, iIntValue3, (!(obj9 instanceof Number) || (number = (Number) obj9) == null) ? 0 : number.intValue()));
                    }
                }
                return new C0VUA(c0vujLIZ.LIZ, c0vujLIZ.LIZIZ, c0vujLIZ.LIZJ, arrayList);
            }
            c0vua = C0VUA.LJFF;
            if (c0vua != null) {
                return c0vua;
            }
        }
        return C0VUA.LJFF;
    }
}
