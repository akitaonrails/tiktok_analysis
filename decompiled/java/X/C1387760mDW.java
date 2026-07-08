package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS318S0300000_21;

/* JADX INFO: renamed from: X.0mDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387760mDW {
    public static InterfaceC1387770mDX LIZIZ(C1381180m2u c1381180m2u) {
        List listLIZ;
        Object next;
        Function1<InterfaceC1381130m2p, InterfaceC1387770mDX> function1;
        InterfaceC1387810mDb interfaceC1387810mDb = C1387800mDa.LIZJ;
        if (interfaceC1387810mDb == null || (listLIZ = interfaceC1387810mDb.LIZ()) == null) {
            return null;
        }
        Iterator it2 = listLIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1381320m38) next).LIZ.invoke(c1381180m2u).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1381320m38 c1381320m38 = (C1381320m38) next;
        if (c1381320m38 == null || (function1 = c1381320m38.LIZIZ) == null) {
            return null;
        }
        return function1.invoke(c1381180m2u);
    }

    public static SparkContext LIZ(final C1381180m2u c1381180m2u, Activity activity, final String str, InterfaceC1387770mDX interfaceC1387770mDX) {
        final C238400w2 c238400w2 = new C238400w2();
        final C013C c013c = new C013C();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.sendEventListener = new AwS318S0300000_21(c1381180m2u, interfaceC1387770mDX, activity, 0);
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0mDV
            @Override // X.AbstractC1537870q7d
            public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                String str2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str3 = "";
                if (!c013c.element) {
                    InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                    Pair[] pairArr = new Pair[5];
                    String str4 = c1381180m2u.LIZ;
                    if (str4 == null) {
                        str4 = "";
                    }
                    pairArr[0] = new Pair("report_type", str4);
                    String str5 = c1381180m2u.LIZIZ;
                    if (str5 == null) {
                        str5 = "";
                    }
                    pairArr[1] = new Pair("object_id", str5);
                    String str6 = c1381180m2u.LIZJ;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pairArr[2] = new Pair("owner_id", str6);
                    pairArr[3] = new Pair("duration", String.valueOf(jCurrentTimeMillis - c238400w2.element));
                    pairArr[4] = new Pair("url_path", str);
                    interfaceC1519030pdFLIZJ.LIZ("tns_report_container_drop", C2097608Jq.LJIIIIZZ(pairArr));
                }
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ2 = C100C.LIZ.LIZJ();
                Pair[] pairArr2 = new Pair[5];
                pairArr2[0] = new Pair("enter_time", String.valueOf(c238400w2.element));
                pairArr2[1] = new Pair("exit_time", String.valueOf(jCurrentTimeMillis));
                pairArr2[2] = new Pair("duration", String.valueOf(jCurrentTimeMillis - c238400w2.element));
                Map<String, String> map = c1381180m2u.LIZLLL;
                if (map == null || (str2 = map.get("enter_from")) == null) {
                    str2 = "";
                }
                pairArr2[3] = new Pair("enter_from", str2);
                String str7 = c1381180m2u.LIZIZ;
                if (str7 != null) {
                    str3 = str7;
                }
                pairArr2[4] = new Pair("object_id", str3);
                interfaceC1519030pdFLIZJ2.LIZ("tns_report_webview", C2097608Jq.LJIIIIZZ(pairArr2));
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                c013c.element = true;
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                Pair[] pairArr = new Pair[5];
                String str2 = c1381180m2u.LIZ;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[0] = new Pair("report_type", str2);
                String str4 = c1381180m2u.LIZIZ;
                if (str4 == null) {
                    str4 = "";
                }
                pairArr[1] = new Pair("object_id", str4);
                String str5 = c1381180m2u.LIZJ;
                if (str5 != null) {
                    str3 = str5;
                }
                pairArr[2] = new Pair("owner_id", str3);
                pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - c238400w2.element));
                pairArr[4] = new Pair("url_path", str);
                interfaceC1519030pdFLIZJ.LIZ("tns_report_container_load_success", C2097608Jq.LJIIIIZZ(pairArr));
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                c238400w2.element = System.currentTimeMillis();
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                Pair[] pairArr = new Pair[5];
                String str4 = c1381180m2u.LIZ;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                pairArr[0] = new Pair("report_type", str4);
                String str6 = c1381180m2u.LIZIZ;
                if (str6 == null) {
                    str6 = "";
                }
                pairArr[1] = new Pair("object_id", str6);
                String str7 = c1381180m2u.LIZJ;
                if (str7 != null) {
                    str5 = str7;
                }
                pairArr[2] = new Pair("owner_id", str5);
                pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - c238400w2.element));
                pairArr[4] = new Pair("url_path", str);
                interfaceC1519030pdFLIZJ.LIZ("tns_report_container_load_failed", C2097608Jq.LJIIIIZZ(pairArr));
            }
        });
        return sparkContext;
    }
}
