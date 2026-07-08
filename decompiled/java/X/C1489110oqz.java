package X;

import X.C0VZ0;
import X.C1489110oqz;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0oqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489110oqz {
    public static String LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1489120or0());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1489190or7());

    public static boolean LIZJ() {
        SharedPreferences sharedPreferences;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 7, "ad_web_ua_update_frequency", true);
        if (iLJIJ != 0 && (sharedPreferences = (SharedPreferences) LJ.getValue()) != null) {
            long j = sharedPreferences.getLong("ad_user_agent_update_time", 0L);
            return j == 0 || TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) > ((long) iLJIJ);
        }
        return true;
    }

    public static final void LIZLLL() {
        if (LIZJ()) {
            C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0oqy
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AdUserAgentManager@6ad1.updateUserAgent$1");
                    if (((Boolean) obj).booleanValue() && C1489110oqz.LIZJ()) {
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.commercialize.util.AdUserAgentManager$updateUserAgent$1$1
                            @Override // X.InterfaceC800080Va2
                            public final /* synthetic */ List finalizedBy() {
                                return null;
                            }

                            @Override // X.InterfaceC800080Va2
                            public final String key() {
                                return "AdUserAgentManager$updateUserAgent$1$1";
                            }

                            @Override // X.InterfaceC800080Va2
                            public final /* synthetic */ boolean meetTrigger() {
                                return true;
                            }

                            @Override // X.C0CCZ
                            public final /* synthetic */ boolean serialExecute() {
                                return false;
                            }

                            @Override // X.InterfaceC800080Va2
                            public final /* synthetic */ int targetProcess() {
                                return C0VZ0.LIZ();
                            }

                            @Override // X.InterfaceC800080Va2
                            public final /* synthetic */ EnumC799980VZs triggerType() {
                                return C0VZ0.LIZIZ(this);
                            }

                            @Override // X.C0CCZ
                            public final EnumC799870VZh type() {
                                return EnumC799870VZh.IDLE;
                            }

                            @Override // X.InterfaceC308150C6b
                            public final void run(Context context) {
                                SharedPreferences.Editor editorEdit;
                                SharedPreferences.Editor editorPutString;
                                SharedPreferences sharedPreferences = (SharedPreferences) C1489110oqz.LJ.getValue();
                                if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("ad_user_agent_sp", (String) C1489110oqz.LIZLLL.getValue())) != null) {
                                    editorPutString.apply();
                                }
                            }
                        });
                        c799890VZj.LIZIZ();
                    }
                    C1C7U.LIZIZ("AdUserAgentManager@6ad1.updateUserAgent$1");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(java.lang.String r8) {
        /*
            java.lang.String r1 = X.C1489110oqz.LIZ
            X.01GW r0 = X.C1489110oqz.LJ
            java.lang.Object r4 = r0.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r7 = ""
            if (r4 != 0) goto L14
            java.lang.String r0 = X.C1489110oqz.LIZ
            if (r0 == 0) goto L13
            return r0
        L13:
            return r7
        L14:
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L22
            int r0 = r1.length()
            if (r0 == 0) goto L22
            LIZLLL()
            return r1
        L22:
            java.lang.String r3 = "ad_user_agent_sp"
            r0 = 0
            java.lang.String r1 = r4.getString(r3, r0)
            if (r1 == 0) goto L35
            int r0 = r1.length()
            if (r0 == 0) goto L35
            LIZLLL()
            return r1
        L35:
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L86
            java.lang.String r0 = "feed"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L64
            java.lang.String r2 = "ad_user_agent_has_read_sp"
            boolean r1 = r4.getBoolean(r2, r6)
            android.content.SharedPreferences$Editor r0 = r4.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r5)
            r0.apply()
            r0 = r1 ^ 1
            if (r0 != 0) goto L86
        L64:
            X.0XJ8 r0 = X.C0XJ8.LIZIZ
            boolean r0 = r0.LJ()
            if (r0 != 0) goto L86
            X.01GW r0 = X.C1489110oqz.LIZLLL
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            android.content.SharedPreferences$Editor r1 = r4.edit()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)
            r0.apply()
            return r2
        L86:
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L8f
            r7 = r0
        L8f:
            LIZLLL()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1489110oqz.LIZ(java.lang.String):java.lang.String");
    }
}
