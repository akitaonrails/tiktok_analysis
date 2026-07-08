package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051980dTw {
    public static final Map<String, WeakReference<Activity>> LIZ = new LinkedHashMap();
    public static final Map<String, List<String>> LIZIZ = new LinkedHashMap();

    public static void LIZIZ(String str) {
        Activity activity;
        InterfaceC1059280dfi interfaceC1059280dfi;
        List<String> list = (List) ((LinkedHashMap) LIZIZ).get(str);
        if (list != null) {
            for (String str2 : list) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                if (linkedHashMap.get(str2) != null) {
                    Reference reference = (Reference) linkedHashMap.get(str2);
                    if (reference != null && (activity = (Activity) reference.get()) != null) {
                        activity.finish();
                    }
                } else {
                    SparkContext.Companion.getClass();
                    InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str2);
                    if (interfaceC1059280dfiLIZ instanceof SparkPopup) {
                        ((SparkPopup) interfaceC1059280dfiLIZ).gS(false);
                    } else {
                        InterfaceC1059280dfi interfaceC1059280dfiLIZ2 = C1529880puk.LIZ(str2);
                        if (interfaceC1059280dfiLIZ2 != null) {
                            interfaceC1059280dfiLIZ2.close();
                        }
                    }
                    if (interfaceC1059280dfiLIZ == null) {
                        SparkThirdContext.Companion.getClass();
                        SparkThirdContext sparkThirdContextLIZ = C1052290dUR.LIZ(str2);
                        if (sparkThirdContextLIZ != null && (interfaceC1059280dfi = sparkThirdContextLIZ.container) != null) {
                            interfaceC1059280dfi.close();
                        }
                    }
                }
            }
        }
    }

    public static String LIZLLL(String str) {
        Activity activity;
        CrossPlatformActivity crossPlatformActivity;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        if (linkedHashMap.get(str) != null) {
            Reference reference = (Reference) linkedHashMap.get(str);
            if (reference != null) {
                activity = (Activity) reference.get();
            } else {
                activity = null;
            }
            if (!(activity instanceof CrossPlatformActivity) || (crossPlatformActivity = (CrossPlatformActivity) activity) == null) {
                return null;
            }
            C1041570dD9 c1041570dD9 = C1041570dD9.LIZ;
            Uri data = crossPlatformActivity.getIntent().getData();
            Intent intent = crossPlatformActivity.getIntent();
            C1041660dDI c1041660dDI = crossPlatformActivity.LL;
            c1041570dD9.getClass();
            return C1041570dD9.LIZ(data, intent, c1041660dDI);
        }
        SparkContext.Companion.getClass();
        InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
        if (interfaceC1059280dfiLIZ instanceof SparkPopup) {
            SparkContext sparkContext = ((SparkPopup) interfaceC1059280dfiLIZ).LLJIJIL;
            if (sparkContext == null) {
                return null;
            }
            return sparkContext.LJIJI();
        }
        if (interfaceC1059280dfiLIZ instanceof SparkActivity) {
            SparkContext sparkContext2 = ((SparkActivity) interfaceC1059280dfiLIZ).LL;
            if (sparkContext2 == null) {
                return null;
            }
            return sparkContext2.LJIJI();
        }
        if (!(interfaceC1059280dfiLIZ instanceof SparkFragment)) {
            return null;
        }
        return ((SparkFragment) interfaceC1059280dfiLIZ).UR();
    }

    public static void LIZ(String str, String str2) {
        Map<String, List<String>> map = LIZIZ;
        if (!map.containsKey(str)) {
            map.put(str, C1697810uHb.LJIILJJIL(str));
        }
        List list = (List) ((LinkedHashMap) map).get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        Activity activity;
        InterfaceC1059280dfi interfaceC1059280dfi;
        List<String> list = (List) ((LinkedHashMap) LIZIZ).get(str);
        if (list != null) {
            for (String str3 : list) {
                if (!Intrinsics.LJFF(str3, str2)) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                    if (linkedHashMap.get(str3) != null) {
                        Reference reference = (Reference) linkedHashMap.get(str3);
                        if (reference != null && (activity = (Activity) reference.get()) != null) {
                            activity.finish();
                        }
                    } else {
                        SparkContext.Companion.getClass();
                        InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str3);
                        if (interfaceC1059280dfiLIZ instanceof SparkPopup) {
                            ((SparkPopup) interfaceC1059280dfiLIZ).gS(false);
                        } else {
                            InterfaceC1059280dfi interfaceC1059280dfiLIZ2 = C1529880puk.LIZ(str3);
                            if (interfaceC1059280dfiLIZ2 != null) {
                                interfaceC1059280dfiLIZ2.close();
                            }
                        }
                        if (interfaceC1059280dfiLIZ == null) {
                            SparkThirdContext.Companion.getClass();
                            SparkThirdContext sparkThirdContextLIZ = C1052290dUR.LIZ(str3);
                            if (sparkThirdContextLIZ != null && (interfaceC1059280dfi = sparkThirdContextLIZ.container) != null) {
                                interfaceC1059280dfi.close();
                            }
                        }
                    }
                }
            }
        }
    }
}
