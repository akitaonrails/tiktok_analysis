package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20103413lI implements InterfaceC2209561Bdq {
    public static final Map<String, InterfaceC2209561Bdq> LIZJ = new ConcurrentHashMap();
    public String LIZ;
    public final List<String> LIZIZ;

    public AbstractC20103413lI() {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logger@");
        sbLIZ.append(hashCode());
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJIJ(String str, Object... objArr) {
        char cCharAt;
        String string;
        try {
            StringBuilder sb = new StringBuilder();
            if (objArr.length != 0 && str.contains("{}")) {
                int length = str.length();
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (i < length - 1) {
                        cCharAt = str.charAt(i + 1);
                    } else {
                        cCharAt = ' ';
                    }
                    if (cCharAt2 == '{' && cCharAt == '}') {
                        if (i2 < objArr.length) {
                            int i3 = i2 + 1;
                            Object obj = objArr[i2];
                            if (obj != null) {
                                string = obj.toString();
                            } else {
                                string = "";
                            }
                            sb.append(string);
                            i2 = i3;
                        }
                        i++;
                    } else {
                        sb.append(cCharAt2);
                    }
                    i++;
                }
            } else {
                sb.append(str);
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    public void LJIJI(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
        List<String> list2;
        InterfaceC20103813lM interfaceC20103813lM;
        if (C20103613lK.LIZ.isEmpty() && ((ConcurrentHashMap) C20103613lK.LIZIZ).isEmpty()) {
            return;
        }
        C20103313lH c20103313lH = new C20103313lH();
        String str2 = this.LIZ;
        C20103113lF c20103113lF = c20103313lH.LIZ;
        c20103113lF.LIZ = str2;
        c20103113lF.LIZLLL = i;
        c20103113lF.LIZJ = i2;
        String name = C786410Ut5.u3().getName();
        C20103113lF c20103113lF2 = c20103313lH.LIZ;
        c20103113lF2.LIZIZ = name;
        c20103113lF2.LJII = th;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LIZIZ);
            arrayList.addAll(list);
            list2 = arrayList;
        } else {
            list2 = this.LIZIZ;
        }
        c20103313lH.LIZ.LJ = list2;
        String strLJIJ = LJIJ(str, objArr);
        C20103113lF c20103113lF3 = c20103313lH.LIZ;
        c20103113lF3.LJFF = strLJIJ;
        C20103613lK.LIZ(c20103113lF3);
        String str3 = this.LIZ;
        if (str3 != null && !str3.isEmpty() && (interfaceC20103813lM = (InterfaceC20103813lM) ((ConcurrentHashMap) C20103613lK.LIZIZ).get(str3)) != null) {
            interfaceC20103813lM.LIZ(c20103113lF3);
        }
    }
}
