package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809560VpK {
    public static List<String> LIZ;
    public static List<ServiceInfo> LIZIZ;
    public static List<ActivityInfo> LIZJ;
    public static List<ProviderInfo> LIZLLL;

    public static boolean LIZ(Context context, String str, List list) {
        ActivityInfo[] activityInfoArr;
        if (list != null && !list.isEmpty()) {
            if (LIZJ == null) {
                synchronized (C809560VpK.class) {
                    try {
                        if (LIZJ == null && (activityInfoArr = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 514).receivers) != null) {
                            LIZJ = Arrays.asList(activityInfoArr);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            List<ActivityInfo> list2 = LIZJ;
            if (list2 != null && list2.size() != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    C809600VpO c809600VpO = (C809600VpO) it2.next();
                    Iterator<ActivityInfo> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ActivityInfo next = it3.next();
                            if (TextUtils.equals(next.name, c809600VpO.LIZIZ)) {
                                if (!TextUtils.equals(c809600VpO.LIZJ, next.processName)) {
                                    C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append(" receiver configure error: ");
                                    sbLIZ.append(c809600VpO.LIZIZ);
                                    sbLIZ.append(" should be in");
                                    sbLIZ.append(c809600VpO.LIZJ);
                                    sbLIZ.append(",but now in ");
                                    sbLIZ.append(next.processName);
                                    sbLIZ.append(" process");
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c809150Vof.getClass();
                                    z = false;
                                }
                                if (!TextUtils.isEmpty(c809600VpO.LIZLLL) && !TextUtils.equals(next.permission, c809600VpO.LIZLLL)) {
                                    C809150Vof c809150Vof2 = C809030VoT.LJIIJ.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(str);
                                    sbLIZ2.append(" receiver configure error: ");
                                    sbLIZ2.append(c809600VpO.LIZIZ);
                                    sbLIZ2.append(" need permission ");
                                    sbLIZ2.append(c809600VpO.LIZLLL);
                                    sbLIZ2.append(", but now the permission is:");
                                    sbLIZ2.append(next.permission);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    c809150Vof2.getClass();
                                    z = false;
                                }
                                List<C809610VpP> list3 = c809600VpO.LIZ;
                                if (list3 != null) {
                                    boolean z2 = true;
                                    for (C809610VpP c809610VpP : (ArrayList) list3) {
                                        List<String> list4 = c809610VpP.LIZ;
                                        if (list4 != null) {
                                            for (String str2 : list4) {
                                                String str3 = c809600VpO.LIZIZ;
                                                Intent intent = new Intent();
                                                intent.setPackage(context.getPackageName());
                                                List<String> list5 = c809610VpP.LIZIZ;
                                                if (list5 != null) {
                                                    Iterator<String> it4 = list5.iterator();
                                                    while (it4.hasNext()) {
                                                        intent.addCategory(it4.next());
                                                    }
                                                }
                                                intent.setAction(str2);
                                                if (!TextUtils.isEmpty(null)) {
                                                    intent.setType(null);
                                                }
                                                List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
                                                if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                                                    Iterator<ResolveInfo> it5 = listQueryBroadcastReceivers.iterator();
                                                    while (it5.hasNext()) {
                                                        ActivityInfo activityInfo = it5.next().activityInfo;
                                                        if (activityInfo == null || !TextUtils.equals(activityInfo.name, str3)) {
                                                        }
                                                    }
                                                }
                                                C809150Vof c809150Vof3 = C809030VoT.LJIIJ.LIZ;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(str);
                                                sbLIZ3.append(" ");
                                                sbLIZ3.append(c809600VpO.LIZIZ);
                                                sbLIZ3.append(" configure error，need action : ");
                                                sbLIZ3.append(str2);
                                                C2188811AlT.LIZIZ(sbLIZ3);
                                                c809150Vof3.getClass();
                                                z2 = false;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        z = false;
                                    }
                                }
                            }
                        } else {
                            arrayList.add(c809600VpO);
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C809150Vof c809150Vof4 = C809030VoT.LJIIJ.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(" receiver configure error: ");
                    sbLIZ4.append(arrayList);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c809150Vof4.getClass();
                }
                if (z && arrayList.isEmpty()) {
                    return true;
                }
                return false;
            }
            C809150Vof c809150Vof5 = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(" error configuration:");
            sbLIZ5.append(list);
            C2188811AlT.LIZIZ(sbLIZ5);
            c809150Vof5.getClass();
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Context context, String str, List list) {
        boolean zEquals;
        ServiceInfo[] serviceInfoArr;
        if (list != null && !list.isEmpty()) {
            if (LIZIZ == null) {
                synchronized (C809560VpK.class) {
                    try {
                        if (LIZIZ == null && (serviceInfoArr = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 516).services) != null) {
                            LIZIZ = Arrays.asList(serviceInfoArr);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            List<ServiceInfo> list2 = LIZIZ;
            if (list2 != null && list2.size() != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    C809600VpO c809600VpO = (C809600VpO) it2.next();
                    Iterator<ServiceInfo> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ServiceInfo next = it3.next();
                            if (TextUtils.equals(next.name, c809600VpO.LIZIZ)) {
                                boolean zEquals2 = TextUtils.equals(c809600VpO.LIZJ, next.processName);
                                if (!TextUtils.isEmpty(c809600VpO.LIZLLL)) {
                                    zEquals = TextUtils.equals(next.permission, c809600VpO.LIZLLL);
                                } else {
                                    zEquals = true;
                                }
                                if (!zEquals2) {
                                    C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append(" service configure error: ");
                                    sbLIZ.append(c809600VpO.LIZIZ);
                                    sbLIZ.append(" should be declared in process ");
                                    sbLIZ.append(c809600VpO.LIZJ);
                                    sbLIZ.append(", but now in ");
                                    sbLIZ.append(next.processName);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c809150Vof.getClass();
                                    z = false;
                                }
                                if (!zEquals) {
                                    C809150Vof c809150Vof2 = C809030VoT.LJIIJ.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(str);
                                    sbLIZ2.append(" service configure error: ");
                                    sbLIZ2.append(c809600VpO.LIZIZ);
                                    sbLIZ2.append(" need permission(s) {");
                                    sbLIZ2.append(c809600VpO.LIZLLL);
                                    sbLIZ2.append("}, but now ");
                                    sbLIZ2.append(next.permission);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    c809150Vof2.getClass();
                                    z = false;
                                }
                                List<C809610VpP> list3 = c809600VpO.LIZ;
                                if (list3 != null) {
                                    boolean z2 = true;
                                    for (C809610VpP c809610VpP : (ArrayList) list3) {
                                        List<String> list4 = c809610VpP.LIZ;
                                        if (list4 != null) {
                                            for (String str2 : list4) {
                                                String str3 = c809600VpO.LIZIZ;
                                                Intent intent = new Intent();
                                                intent.setPackage(context.getPackageName());
                                                List<String> list5 = c809610VpP.LIZIZ;
                                                if (list5 != null) {
                                                    Iterator<String> it4 = list5.iterator();
                                                    while (it4.hasNext()) {
                                                        intent.addCategory(it4.next());
                                                    }
                                                }
                                                intent.setAction(str2);
                                                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
                                                if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                                                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                                                        if (resolveInfo.serviceInfo == null || (!TextUtils.isEmpty(str3) && !TextUtils.equals(resolveInfo.serviceInfo.name, str3))) {
                                                        }
                                                    }
                                                }
                                                C809150Vof c809150Vof3 = C809030VoT.LJIIJ.LIZ;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(str);
                                                sbLIZ3.append(c809600VpO.LIZIZ);
                                                sbLIZ3.append(" need to declare {");
                                                sbLIZ3.append(str2);
                                                sbLIZ3.append("} action(s) in AndroidManifest.xml");
                                                C2188811AlT.LIZIZ(sbLIZ3);
                                                c809150Vof3.getClass();
                                                z2 = false;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        z = false;
                                    }
                                }
                            }
                        } else {
                            arrayList.add(c809600VpO);
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C809150Vof c809150Vof4 = C809030VoT.LJIIJ.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(" need to declare service(s) {");
                    sbLIZ4.append(arrayList);
                    sbLIZ4.append("} in AndroidManifest.xml");
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c809150Vof4.getClass();
                }
                if (z && arrayList.isEmpty()) {
                    return true;
                }
                return false;
            }
            C809150Vof c809150Vof5 = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(". You need to declare service(s) {");
            sbLIZ5.append(list);
            sbLIZ5.append("} in AndroidManifest.xml");
            C2188811AlT.LIZIZ(sbLIZ5);
            c809150Vof5.getClass();
            return false;
        }
        return true;
    }
}
