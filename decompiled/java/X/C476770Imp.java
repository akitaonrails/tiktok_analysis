package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Imp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476770Imp {
    public static final boolean LIZLLL(String str) {
        if (str == null || str.length() == 0 || Intrinsics.LJFF(str, "{}") || Intrinsics.LJFF(str, "null")) {
            return false;
        }
        return true;
    }

    public static final String LJ(Object obj) {
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj);
    }

    public static final Map<String, String> LJFF(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    public static final void LIZJ(final View view, final Runnable runnable) {
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0IlE
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExtraUtilsKt@787e.safePost$1");
                    try {
                        if (view.getParent() != null) {
                            runnable.run();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExtraUtilsKt@787e.safePost$1");
                }
            });
        }
    }

    public static final void LIZIZ(final View view, final Runnable runnable, long j) {
        HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.01iL
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExtraUtilsKt@787e.safeDelayPost$1");
                try {
                    if (view.getParent() != null) {
                        runnable.run();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExtraUtilsKt@787e.safeDelayPost$1");
            }
        }, j);
    }

    public static final void LIZ(Context context, String str, String str2, String str3, final Function2 function2) {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser.isLogin()) {
            function2.invoke(Boolean.TRUE, null);
            return;
        }
        C476760Imo c476760Imo = new C476760Imo();
        c476760Imo.LIZ = C497740JfY.LJIJI(2131851927);
        c476760Imo.LIZJ = -1;
        c476760Imo.LJ = str2;
        c476760Imo.LIZLLL = str3;
        c476760Imo.LJFF = str;
        C11NZ<InterfaceC2262081DgM> c11nzLJIILL = interfaceC500940JkiUser.LJIILL(context, new C501600Jlm(c476760Imo));
        if (c11nzLJIILL != null) {
            c11nzLJIILL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00Qa
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ExtraUtilsKt@787e.checkLogin$1");
                    function2.invoke(Boolean.TRUE, null);
                    C1C7U.LIZIZ("ExtraUtilsKt@787e.checkLogin$1");
                }
            }, new C09JN() { // from class: X.00Qb
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ExtraUtilsKt@787e.checkLogin$2");
                    function2.invoke(Boolean.FALSE, obj);
                    C1C7U.LIZIZ("ExtraUtilsKt@787e.checkLogin$2");
                }
            });
        }
    }
}
