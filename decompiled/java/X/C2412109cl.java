package X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2412109cl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Intent intent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC2412609cq() { // from class: X.09cp
            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                return true;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                if (Build.VERSION.SDK_INT >= 29 && intent2.getIdentifier() != null && "third_party_app_identifier".equals(intent2.getIdentifier())) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new InterfaceC2412609cq() { // from class: X.09co
            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                return true;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                if (Build.VERSION.SDK_INT >= 29 && intent2.getIdentifier() != null && Intrinsics.LJFF("one_tap_login_identifier", intent2.getIdentifier())) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new InterfaceC2412609cq() { // from class: X.08Ik
            public final String[] LIZ = {"https://www.tiktok.com/age-verification/", "market://details?id=com.zhiliaoapp.musically", "https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically", "https://play.google.com/store/apps/details?id=com.ss.android.ugc.trill"};

            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                return true;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                Uri data;
                Object c098200Yq;
                if (!TextUtils.equals(intent2.getAction(), "android.intent.action.VIEW") || (data = intent2.getData()) == null) {
                    return false;
                }
                String lowerCase = data.toString().toLowerCase(Locale.ROOT);
                String[] strArr = this.LIZ;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (u.LJJIIJZLJL(lowerCase, strArr[i], false)) {
                            break;
                        }
                        i++;
                    } else {
                        try {
                            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "previous_page");
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        if (Intrinsics.LJFF(c098200Yq, "universal_popup")) {
                            break;
                        }
                        return false;
                    }
                }
                return true;
            }
        });
        arrayList.add(new InterfaceC2412609cq() { // from class: X.08If
            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                List<String> list;
                String strLJJIJIIJIL;
                C2093808Ie.LIZ.getClass();
                MajorComponentsAllowList majorComponentsAllowList = C2093808Ie.LIZIZ;
                if (majorComponentsAllowList == null || (list = majorComponentsAllowList.activities) == null) {
                    list = C13BV.INSTANCE;
                }
                if (!list.isEmpty()) {
                    for (String str : list) {
                        ComponentName component = intent2.getComponent();
                        if (component == null || (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgapPK1D0eL/hDAyU4y3uI55VFQkgbYiv5x4o4EtJsS6/C7uTxYm/Z2z51BABD7nWsKNuloUsjqNb3", null))) == null) {
                            strLJJIJIIJIL = "";
                        }
                        if (C2093608Ic.LIZJ(str, strLJJIJIIJIL)) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                if (intent2.getComponent() != null) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new InterfaceC2412609cq() { // from class: X.09cm
            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                if (!TextUtils.equals(intent2.getPackage(), "com.google.android.gms") || intent2.getData() == null) {
                    return false;
                }
                if (!a0.LJJIIZI(String.valueOf(intent2.getData()), "com.zhiliaoapp.musically", false) && !a0.LJJIIZI(String.valueOf(intent2.getData()), "com.ss.android.ugc.trill", false)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                return TextUtils.equals(intent2.getAction(), "android.intent.action.VIEW");
            }
        });
        arrayList.add(new InterfaceC2412609cq() { // from class: X.09cn
            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                if (intent2.getData() == null) {
                    return false;
                }
                if (!a0.LJJIIZI(String.valueOf(intent2.getData()), "com.zhiliaoapp.musically", false) && !a0.LJJIIZI(String.valueOf(intent2.getData()), "com.ss.android.ugc.trill", false)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                return TextUtils.equals(intent2.getAction(), "android.settings.APPLICATION_DETAILS_SETTINGS");
            }
        });
        arrayList.add(new InterfaceC2412609cq() { // from class: X.09cr
            @Override // X.InterfaceC2412609cq
            public final boolean LIZ(Intent intent2) {
                return false;
            }

            @Override // X.InterfaceC2412609cq
            public final boolean LIZIZ(Intent intent2) {
                return true;
            }
        });
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((InterfaceC2412609cq) ListProtector.get(arrayList, i)).LIZIZ(intent)) {
                    return ((InterfaceC2412609cq) ListProtector.get(arrayList, i)).LIZ(intent);
                }
            }
            return true;
        }
        return true;
    }
}
