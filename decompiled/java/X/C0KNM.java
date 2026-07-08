package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KNM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNM {
    public static final List<C0KOW> LIZ = C1697810uHb.LJIIJJI(new C0KOW() { // from class: X.0KOR
        @Override // X.C0KOW
        public final void LIZJ(C0KOS c0kos) {
            Exception exc = c0kos.LJFF;
            if (exc == null) {
                C766270U4b.LIZLLL(2131851936);
                return;
            }
            if (exc instanceof C501470JlZ) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C501470JlZ c501470JlZ = (C501470JlZ) exc;
                int errorCode = c501470JlZ.getErrorCode();
                if (errorCode == 4025077) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_org_account_subscription_block");
                    c474500IjALIZ.LJIIIIZZ();
                    c474500IjALIZ.LIZ();
                } else {
                    switch (errorCode) {
                        case 41155:
                            C500260Jjc.LJJLIIIJJIZ(new C0KOY(c501470JlZ, 2131844529));
                            break;
                        case 4005189:
                        case 4005272:
                            String prompt = c501470JlZ.getPrompt();
                            if (prompt == null || prompt.length() != 0) {
                                prompt = C497740JfY.LJIJI(2131841279);
                            }
                            LIZ(c0kos, "", prompt, "", new C516670KOb());
                            break;
                        case 4005192:
                        case 4005208:
                        case 4005209:
                        case 4025002:
                            LIZ(c0kos, C497740JfY.LJIJI(2131844424), c501470JlZ.getPrompt(), "", new C516670KOb());
                            break;
                        case 4005256:
                        case 4005257:
                            C500260Jjc.LJJLIIIJJIZ(new C0KOY(c501470JlZ, 2131843092));
                            break;
                        case 4025001:
                            LIZ(c0kos, C497740JfY.LJIJI(2131844426), c501470JlZ.getPrompt(), "", new C516670KOb());
                            break;
                        case 4025009:
                            InterfaceC516660KOa interfaceC516660KOa = c0kos.LJII;
                            if (interfaceC516660KOa != null) {
                                interfaceC516660KOa.LIZ();
                            }
                            break;
                    }
                    return;
                }
                C501540Jlg.LIZLLL(c0kos.LIZ, c0kos.LJFF, 2131851936);
                return;
            }
            C766270U4b.LIZLLL(2131843092);
        }

        @Override // X.C0KOW
        public final boolean LIZLLL(C0KOS c0kos) {
            if (c0kos.LIZIZ == 0) {
                return true;
            }
            return false;
        }
    }, new C0KOT());

    public static boolean LIZLLL() {
        PackageManager packageManager;
        Context applicationContext = GlobalContext.getApplicationContext();
        if (applicationContext == null || (packageManager = applicationContext.getPackageManager()) == null) {
            return true;
        }
        try {
            C786410Ut5.Y3(packageManager, "com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZIZ(C0KOS c0kos) {
        for (C0KOW c0kow : LIZ) {
            if (c0kow.LIZLLL(c0kos)) {
                c0kow.LIZJ(c0kos);
                return;
            }
        }
        new C0KOW() { // from class: X.0KOQ
            @Override // X.C0KOW
            public final boolean LIZLLL(C0KOS c0kos2) {
                return true;
            }

            @Override // X.C0KOW
            public final void LIZJ(C0KOS c0kos2) {
                Exception exc = c0kos2.LJFF;
                if (exc != null) {
                    C501540Jlg.LIZJ(c0kos2.LIZ, exc);
                } else {
                    C766270U4b.LIZLLL(2131851936);
                }
            }
        }.LIZJ(c0kos);
    }

    public static void LJ(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse("market://details"));
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        if (context != null) {
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGlBxb1YgOQfEiPBk7rPjNhcFbdNvdcfQ==", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static boolean LIZJ(Integer num, Integer num2) {
        if (num != null && num.intValue() == 301 && num2 != null && num2.intValue() == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.Integer r2, java.lang.Integer r3, java.lang.String r4) {
        /*
            boolean r0 = X.C500260Jjc.LJJIIZ(r4)
            if (r0 != 0) goto L17
            if (r2 == 0) goto L1c
            int r1 = r2.intValue()
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            if (r1 != r0) goto L1c
            r0 = 2131836591(0x7f113eaf, float:1.9306353E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
        L17:
            if (r4 != 0) goto L1b
            java.lang.String r4 = ""
        L1b:
            return r4
        L1c:
            boolean r0 = LIZJ(r2, r3)
            if (r0 == 0) goto L38
            boolean r0 = LIZLLL()
            if (r0 == 0) goto L30
            r0 = 2131836589(0x7f113ead, float:1.930635E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
            goto L17
        L30:
            r0 = 2131836590(0x7f113eae, float:1.9306351E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
            goto L17
        L38:
            if (r2 == 0) goto L60
            int r0 = r2.intValue()
            if (r0 != 0) goto L48
            r0 = 2131855022(0x7f1186ae, float:1.9343736E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
            goto L17
        L48:
            int r1 = r2.intValue()
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L58
            int r1 = r2.intValue()
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 != r0) goto L60
        L58:
            r0 = 2131844613(0x7f115e05, float:1.9322624E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
            goto L17
        L60:
            r0 = 2131854910(0x7f11863e, float:1.9343508E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KNM.LIZ(java.lang.Integer, java.lang.Integer, java.lang.String):java.lang.String");
    }
}
