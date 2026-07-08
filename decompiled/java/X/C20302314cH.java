package X;

import android.os.Handler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.14cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20302314cH {
    public static final C20302314cH LIZ = new C20302314cH();
    public static final boolean LIZIZ;
    public static final Set<String> LIZJ;
    public static final boolean LIZLLL;
    public static final HashMap<String, String> LJ;
    public static final C830490Whz<String, String> LJFF;
    public static final Keva LJI;
    public static final C01GW LJII;
    public static final boolean LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static volatile String LJIIJJI;
    public static volatile boolean LJIIL;
    public static final RunnableC20302214cG LJIILIIL;
    public static volatile boolean LJIILJJIL;
    public static final C20302514cJ LJIILL;
    public static final C20302114cF LJIILLIIL;
    public static final C20302614cK LJIIZILJ;

    /* JADX WARN: Type inference failed for: r0v21, types: [X.14cJ] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.14cF] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.14cK] */
    static {
        C0CPS.LIZ.getClass();
        LIZIZ = C0CPS.LIZ().enabled;
        LIZJ = C0CPS.LIZ().isolationType;
        SettingsManager.LIZLLL().getClass();
        LIZLLL = SettingsManager.LIZ("empty_uid_upload_directly", false);
        LJ = new HashMap<>();
        LJFF = new C830490Whz<>();
        LJI = KevaImpl.getRepo("pns_user_region_map", 0);
        LJII = C452501pT.LIZIZ(new C304400BwU());
        C844470XAv.LIZ.getClass();
        LJIIIIZZ = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
        LJIIJ = "";
        LJIIJJI = CardStruct.IStatusCode.DEFAULT;
        LJIIL = true;
        LJIILIIL = new RunnableC20302214cG();
        LJIILJJIL = true;
        LJIILL = new InterfaceC2210801Bfq() { // from class: X.14cJ
            @Override // X.InterfaceC2210801Bfq
            public final void LIZ() {
            }

            @Override // X.InterfaceC2210801Bfq
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2210801Bfq
            public final /* bridge */ /* synthetic */ Map LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC2210801Bfq
            public final boolean LIZJ(String str) {
                boolean z;
                C20302314cH.LIZ.getClass();
                if (!Intrinsics.LJFF(str, C20302314cH.LJIIJJI) || !C20302314cH.LJIIL) {
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                        String str2 = C20302314cH.LJFF.get(str);
                        String strLIZIZ = C20302314cH.LIZIZ(str2);
                        if (strLIZIZ != null && C20302314cH.LJIIIZ != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append("_to_");
                            sbLIZ.append(C20302314cH.LJIIIZ);
                            C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "isolation_result");
                            return Intrinsics.LJFF(strLIZIZ, C20302314cH.LJIIIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append("_to_");
                        sbLIZ2.append(C20302314cH.LJIIJ);
                        C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), "exception");
                        return false;
                    }
                    boolean zLJFF = Intrinsics.LJFF(C20302314cH.LJIIJJI, CardStruct.IStatusCode.DEFAULT);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("empty_user_id-");
                    sbLIZ3.append(zLJFF);
                    C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ3), "isolation_result");
                    if (!C20302314cH.LIZLLL && !zLJFF) {
                        return Intrinsics.LJFF(C20302314cH.LIZIZ(C20302314cH.LJFF.get(CardStruct.IStatusCode.DEFAULT)), C20302314cH.LJIIIZ);
                    }
                }
                return true;
            }
        };
        LJIILLIIL = new InterfaceC20301414c8() { // from class: X.14cF
            @Override // X.InterfaceC20301414c8
            public final void LIZ(C20301214c6 c20301214c6, C20301214c6 c20301214c62) throws Throwable {
                if (!Intrinsics.LJFF(c20301214c6.LIZLLL.LIZIZ, c20301214c62.LIZLLL.LIZIZ) || Intrinsics.LJFF(C20302314cH.LJIIJ, "")) {
                    C20302314cH c20302314cH = C20302314cH.LIZ;
                    String str = c20301214c62.LIZIZ;
                    Locale locale = Locale.ROOT;
                    C20302314cH.LJIIJ = str.toLowerCase(locale);
                    C20302314cH c20302314cH2 = C20302314cH.LIZ;
                    String str2 = C20302314cH.LJIIJ;
                    c20302314cH2.getClass();
                    C20302314cH.LJIIIZ = C20302314cH.LIZIZ(str2);
                    String str3 = c20301214c62.LIZLLL.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c20301214c6.LIZIZ.toLowerCase(locale));
                    sbLIZ.append("_to_");
                    sbLIZ.append(C20302314cH.LJIIJ);
                    C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "region_update");
                    C20302314cH.LJIIL = false;
                    String str4 = C20302314cH.LJIIJ;
                    Handler handler = PumbaaWorkerThread.getHandler();
                    RunnableC20302214cG runnableC20302214cG = C20302314cH.LJIILIIL;
                    handler.removeCallbacks(runnableC20302214cG);
                    runnableC20302214cG.LL = str3;
                    runnableC20302214cG.LLILLJJLI = str4;
                    runnableC20302214cG.LLILLL = 0L;
                    C786410Ut5.LJLIIL(100L, PumbaaWorkerThread.getHandler(), runnableC20302214cG);
                }
                C20302314cH.LIZ.getClass();
                String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), "https://mon.tiktokv.com", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c5PB23zPfc4dv5By2LeT7MHVuGzs81HXBmTe", null));
                if (strLLIZ != null) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLLIZ, new String[]{";"}, 0, 6);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        String string = a0.LJLIIIL((String) it2.next()).toString();
                        if (u.LJJIIJZLJL(string, "store-country", false) || u.LJJIIJZLJL(string, fe.e, false) || u.LJJIIJZLJL(string, "store-idc", false)) {
                            sb.append(string);
                            sb.append("; ");
                        }
                    }
                    String string2 = sb.toString();
                    if (string2.length() > 0) {
                        C20302314cH.LIZ.getClass();
                        ((Keva) C20302314cH.LJII.getValue()).storeString("pns_npth_cookie", string2);
                    }
                }
            }
        };
        LJIIZILJ = new InterfaceC586170Myt() { // from class: X.14cK
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                C20302314cH.LIZ.getClass();
                                if (C20302314cH.LJIIIIZZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onAccountResult: ");
                                    sbLIZ.append(z);
                                    sbLIZ.append(" login end ");
                                    if (user != null) {
                                        uid = user.getUid();
                                    }
                                    sbLIZ.append(uid);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("loginEnd_");
                                sbLIZ2.append(z);
                                C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), "account_op");
                                return;
                            }
                            return;
                        }
                        C20302314cH.LIZ.getClass();
                        if (C20302314cH.LJIIIIZZ) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onAccountResult: ");
                            sbLIZ3.append(z);
                            sbLIZ3.append(" logout ");
                            if (user != null) {
                                uid = user.getUid();
                            }
                            sbLIZ3.append(uid);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("logout_");
                        sbLIZ4.append(z);
                        C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ4), "account_op");
                        return;
                    }
                    C20302314cH.LIZ.getClass();
                    if (C20302314cH.LJIIIIZZ) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("onAccountResult: ");
                        sbLIZ5.append(z);
                        sbLIZ5.append(" switch ");
                        if (user != null) {
                            uid = user.getUid();
                        }
                        sbLIZ5.append(uid);
                        C2188811AlT.LIZIZ(sbLIZ5);
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("switch_");
                    sbLIZ6.append(z);
                    C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ6), "account_op");
                    return;
                }
                C20302314cH.LIZ.getClass();
                if (C20302314cH.LJIIIIZZ) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("onAccountResult: ");
                    sbLIZ7.append(z);
                    sbLIZ7.append(" login ");
                    if (user != null) {
                        uid = user.getUid();
                    }
                    sbLIZ7.append(uid);
                    C2188811AlT.LIZIZ(sbLIZ7);
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("login_");
                sbLIZ8.append(z);
                C20302314cH.LIZJ(C2188811AlT.LIZIZ(sbLIZ8), "account_op");
            }
        };
    }

    public static User LIZ() {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (accountUserServiceLJIIJ.isLogin()) {
            return accountUserServiceLJIIJ.getCurUser();
        }
        return null;
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        String str2 = LJ.get(str);
        if (str2 == null) {
            return "row";
        }
        return str2;
    }

    public static void LIZJ(String str, String str2) {
        C793770VBv.LJII("app_log_isolation", new JSONObject().put(str2, str), null, null);
    }
}
