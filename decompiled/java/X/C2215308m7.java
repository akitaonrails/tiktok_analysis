package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.08m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2215308m7 {
    public static boolean LIZ;

    public static void LIZ(final Context context) {
        if (LIZ) {
            return;
        }
        C2215108m5 c2215108m5 = C2215408m8.LIZ;
        InterfaceC2214908m3 interfaceC2214908m3 = new InterfaceC2214908m3(context) { // from class: X.08lw
            public final Context LIZ;

            {
                this.LIZ = context;
            }

            @Override // X.InterfaceC2214908m3
            public final C2214808m2 LIZ(C2215008m4 c2215008m4) {
                String str;
                Context context2 = this.LIZ;
                String str2 = C2214008lu.LIZ;
                synchronized (C2214008lu.class) {
                    try {
                        if (!C2214008lu.LJIILJJIL) {
                            C2214008lu.LJI();
                            try {
                                C786410Ut5.x2(context2);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            C2214008lu.LIZ(context2);
                            C2214008lu.LIZJ(context2);
                            C2214008lu.LIZIZ(context2);
                            C2214008lu.LJII(context2);
                            C2214008lu.LJIIIZ = context2.getPackageName();
                            C2214008lu.LJIILJJIL = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C2214808m2 c2214808m2 = c2215008m4.LIZJ;
                String str3 = c2214808m2.LIZIZ;
                if (!TextUtils.isEmpty(str3)) {
                    str = new C2214308lx(str3, c2214808m2.LIZJ).LIZ;
                } else {
                    str = new C2214308lx(c2214808m2.LIZ).LIZ;
                }
                c2214808m2.LIZ = str;
                return c2215008m4.LIZ(c2214808m2);
            }
        };
        if (!((LinkedList) c2215108m5.LIZ).contains(interfaceC2214908m3)) {
            ListProtector.add(c2215108m5.LIZ, 0, interfaceC2214908m3);
        }
        LIZ = true;
    }
}
