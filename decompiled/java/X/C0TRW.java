package X;

import android.content.Context;
import android.text.SpannableString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TRW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRW {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static final CharSequence LIZIZ(Context context, String str, String str2, Function0<Unit> function0) {
        String strJ4 = C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{str}, 1));
        int iLJJJ = a0.LJJJ(strJ4, str, 0, false, 6);
        SpannableString spannableString = new SpannableString(strJ4);
        if (iLJJJ != -1) {
            C786410Ut5.p2(spannableString, new C785800Us6(C960203pA.LIZ(R.attr.a1h, context), function0, 0), iLJJJ, str.length() + iLJJJ, 33);
        }
        return spannableString;
    }

    public static C1692220u8a LIZ(final Context context, String str, List list, final List list2, C1693450uAZ c1693450uAZ, C1693450uAZ c1693450uAZ2, final Function0 function0) {
        int iLJIIJJI;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        C1692230u8b c1692230u8b = new C1692230u8b();
        if (str != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"{%s}"}, 0, 6);
            if (listLJJLIIIJILLIZJL != null) {
                if (listLJJLIIIJILLIZJL.size() > 1 && (!list.isEmpty()) && (!list2.isEmpty())) {
                    int iLJIIJJI2 = c1692230u8b.LJIIJJI(c1693450uAZ);
                    try {
                        c1692230u8b.LIZLLL((String) listLJJLIIIJILLIZJL.get(0));
                        c1692230u8b.LJII(iLJIIJJI2);
                        int size = list.size();
                        for (final int i = 0; i < size; i++) {
                            if (i < list2.size()) {
                                c1692230u8b.LJIIIIZZ(new C1693020u9s("url", null, new InterfaceC1693170uA7() { // from class: X.0TRV
                                    @Override // X.InterfaceC1693170uA7
                                    public final void LIZIZ() {
                                        Function0<Unit> function02 = function0;
                                        if (function02 != null) {
                                            function02.invoke();
                                        }
                                        String str2 = (String) ListProtector.get(list2, i);
                                        if (u.LJJIIJZLJL(str2, "aweme://", false) || u.LJJIIJZLJL(str2, "sslocal://", false)) {
                                            SmartRouter.buildRoute(context, str2).open();
                                            return;
                                        }
                                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
                                        smartRouteBuildRoute.withParam("url", str2);
                                        smartRouteBuildRoute.open();
                                    }
                                }));
                                iLJIIJJI = c1692230u8b.LJIIJJI(c1693450uAZ2);
                                try {
                                    c1692230u8b.LIZLLL((String) list.get(i));
                                    c1692230u8b.LJII(iLJIIJJI);
                                    c1692230u8b.LJI();
                                    int i2 = i + 1;
                                    if (i2 < listLJJLIIIJILLIZJL.size()) {
                                        iLJIIJJI2 = c1692230u8b.LJIIJJI(c1693450uAZ);
                                        try {
                                            c1692230u8b.LIZLLL((String) listLJJLIIIJILLIZJL.get(i2));
                                            c1692230u8b.LJII(iLJIIJJI2);
                                        } finally {
                                        }
                                    } else {
                                        continue;
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                        c1692230u8b.LJII(iLJIIJJI2);
                    }
                } else {
                    iLJIIJJI = c1692230u8b.LJIIJJI(c1693450uAZ);
                    try {
                        c1692230u8b.LIZLLL(str);
                        c1692230u8b.LJII(iLJIIJJI);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                        c1692230u8b.LJII(iLJIIJJI);
                    }
                }
            }
        }
        return c1692230u8b.LJIIL();
    }
}
