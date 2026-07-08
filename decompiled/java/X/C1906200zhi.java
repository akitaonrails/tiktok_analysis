package X;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906200zhi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C1878330yyl LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1906200zhi.class, "calendarAbility", "getCalendarAbility()Lknit/Option;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static boolean LIZ(C1906200zhi c1906200zhi, C1906210zhj c1906210zhj, Activity activity) {
        PackageManager packageManager;
        String str;
        String strLIZIZ = "";
        if (!TextUtils.isEmpty(c1906210zhj.LJ) && c1906210zhj.LJFF > -1 && c1906210zhj.LJI > -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FREQ=");
            sbLIZ.append(c1906210zhj.LJ);
            sbLIZ.append(";INTERVAL=");
            sbLIZ.append(c1906210zhj.LJFF);
            sbLIZ.append(";COUNT=");
            sbLIZ.append(c1906210zhj.LJI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        List<Number> list = c1906210zhj.LJIIIIZZ;
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FREQ=WEEKLY;BYDAY=");
            List<Number> list2 = c1906210zhj.LJIIIIZZ;
            StringBuilder sb = new StringBuilder();
            Iterator<Number> it2 = list2.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                if (iIntValue >= 0 && iIntValue < 8) {
                    switch (iIntValue) {
                        case 0:
                        case 7:
                            str = "SU";
                            break;
                        case 1:
                            str = "MO";
                            break;
                        case 2:
                            str = "TU";
                            break;
                        case 3:
                            str = "WE";
                            break;
                        case 4:
                            str = "TH";
                            break;
                        case 5:
                            str = "FR";
                            break;
                        case 6:
                            str = "SA";
                            break;
                        default:
                            "not supported day".toString();
                            throw new IllegalStateException("not supported day");
                    }
                    sb.append(str);
                }
                sb.append(",");
            }
            a0.LJJJLIIL(sb, ",");
            sbLIZ2.append(sb.toString());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", c1906210zhj.LIZ);
        intent.putExtra("description", c1906210zhj.LIZIZ);
        intent.putExtra("beginTime", c1906210zhj.LIZJ);
        intent.putExtra("endTime", c1906210zhj.LIZLLL);
        intent.putExtra("allDay", c1906210zhj.LJII);
        C1878330yyl c1878330yyl = c1906200zhi.LIZ;
        if (c1878330yyl == null) {
            synchronized (c1906200zhi) {
                c1878330yyl = c1906200zhi.LIZ;
                if (c1878330yyl == null) {
                    c1878330yyl = new C1878330yyl((InterfaceC1906230zhl) C1906220zhk.LIZ.getValue());
                    c1906200zhi.LIZ = c1878330yyl;
                }
            }
        }
        Object obj = c1878330yyl.LL;
        if (Intrinsics.LJFF(obj, C1610310s0T.LIZ)) {
            obj = null;
        }
        InterfaceC1906230zhl interfaceC1906230zhl = (InterfaceC1906230zhl) obj;
        if (interfaceC1906230zhl != null) {
            interfaceC1906230zhl.LIZ(intent);
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            intent.putExtra("rrule", strLIZIZ);
        }
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZrLyjcIh7atLQJGKH5Iu08j9YhW7Fw=", null));
            return true;
        }
        return false;
    }
}
