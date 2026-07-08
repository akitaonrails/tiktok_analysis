package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.14cI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20302414cI implements InterfaceC427710Gpt {
    public static final C20302414cI LL = new C20302414cI();
    public static final boolean LLILLJJLI;
    public static final Set<String> LLILLL;
    public static final HashMap<String, String> LLILZ;
    public static final C830490Whz<String, String> LLILZIL;
    public static final Keva LLILZLL;
    public static final C01GW LLIZ;
    public static final boolean LLIZLLLIL;
    public static final C145Z LLJ;
    public static final C20302014cE LLJI;
    public static final C20302714cL LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v18, types: [X.145Z] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.14cE] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.14cL] */
    static {
        C0CPS.LIZ.getClass();
        LLILLJJLI = C0CPS.LIZ().enabled;
        LLILLL = C0CPS.LIZ().isolationType;
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("empty_uid_upload_directly", false);
        LLILZ = new HashMap<>();
        LLILZIL = new C830490Whz<>();
        LLILZLL = KevaImpl.getRepo("pns_user_region_map", 0);
        LLIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5190));
        C844470XAv.LIZ.getClass();
        LLIZLLLIL = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
        LLJ = new InterfaceC2210801Bfq() { // from class: X.145Z
            public final List<String> LIZ = new ArrayList();

            @Override // X.InterfaceC2210801Bfq
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2210801Bfq
            public final void LIZ() {
                ((ArrayList) this.LIZ).clear();
            }

            @Override // X.InterfaceC2210801Bfq
            public final Map<String, String> LIZLLL() {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = ((ArrayList) this.LIZ).iterator();
                while (it2.hasNext()) {
                    String str = C2273401Dyc.LJFF.get((String) it2.next());
                    if (str != null) {
                        String strLIZ = C2273401Dyc.LIZ(str);
                        if (strLIZ == null) {
                            strLIZ = "row";
                        }
                        Locale locale = Locale.ROOT;
                        linkedHashSet2.add(strLIZ.toLowerCase(locale));
                        linkedHashSet.add(str.toLowerCase(locale));
                    }
                }
                return Collections.unmodifiableMap(C2097608Jq.LJIIIIZZ(new Pair("x-applog-region", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62)), new Pair("x-applog-region-vgeo", C13LP.LJJLIIIJ(linkedHashSet2, ",", null, null, 0, null, null, 62))));
            }

            @Override // X.InterfaceC2210801Bfq
            public final boolean LIZJ(String str) {
                String str2;
                String strLIZIZ;
                String str3;
                C20302414cI.LL.getClass();
                String str4 = C20302414cI.LLILZIL.get(str);
                String str5 = "row";
                if (str4 == null) {
                    str2 = null;
                } else {
                    str2 = C20302414cI.LLILZ.get(str4);
                    if (str2 == null) {
                        str2 = "row";
                    }
                }
                if (str2 != null && (strLIZIZ = C20301014c4.LIZIZ()) != null) {
                    C20302414cI.LLILZ.get(strLIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("_to_");
                    String strLIZIZ2 = C20301014c4.LIZIZ();
                    if (strLIZIZ2 == null) {
                        str3 = null;
                    } else {
                        str3 = C20302414cI.LLILZ.get(strLIZIZ2);
                        if (str3 == null) {
                            str3 = "row";
                        }
                    }
                    sbLIZ.append(str3);
                    C20302414cI.LIZ(C2188811AlT.LIZIZ(sbLIZ), "isolation_result");
                    String strLIZIZ3 = C20301014c4.LIZIZ();
                    if (strLIZIZ3 == null) {
                        str5 = null;
                    } else {
                        String str6 = C20302414cI.LLILZ.get(strLIZIZ3);
                        if (str6 != null) {
                            str5 = str6;
                        }
                    }
                    boolean zLJFF = Intrinsics.LJFF(str2, str5);
                    if (zLJFF) {
                        List<String> list = this.LIZ;
                        if (str == null) {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        ((ArrayList) list).add(str);
                    }
                    return zLJFF;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str4);
                sbLIZ2.append("_to_");
                sbLIZ2.append(C20301014c4.LIZIZ());
                C20302414cI.LIZ(C2188811AlT.LIZIZ(sbLIZ2), "exception");
                return false;
            }
        };
        LLJI = new InterfaceC20301414c8() { // from class: X.14cE
            @Override // X.InterfaceC20301414c8
            public final void LIZ(C20301214c6 c20301214c6, C20301214c6 c20301214c62) throws Throwable {
                if (!Intrinsics.LJFF(c20301214c6.LIZLLL.LIZIZ, c20301214c62.LIZLLL.LIZIZ)) {
                    String str = c20301214c62.LIZIZ;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    C20302414cI c20302414cI = C20302414cI.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c20301214c6.LIZIZ.toLowerCase(locale));
                    sbLIZ.append("_to_");
                    sbLIZ.append(lowerCase);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c20302414cI.getClass();
                    C20302414cI.LIZ(strLIZIZ, "region_update");
                }
                if (c20301214c62.LIZJ == EnumC19357510oH.DID) {
                    String lowerCase2 = c20301214c62.LIZIZ.toLowerCase(Locale.ROOT);
                    C20302414cI.LL.getClass();
                    C20302414cI.LLILZIL.put(CardStruct.IStatusCode.DEFAULT, lowerCase2);
                    C20302414cI.LLILZLL.storeString(CardStruct.IStatusCode.DEFAULT, lowerCase2);
                    C2273401Dyc.LJFF.put(CardStruct.IStatusCode.DEFAULT, lowerCase2);
                }
                C20302414cI.LL.getClass();
                String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), "https://mon.tiktokv.com", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c5PB23zPfc4dv5By2LeT7MHVuGzs81HXBmTe/Sg=", null));
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
                        C20302414cI.LL.getClass();
                        ((Keva) C20302414cI.LLIZ.getValue()).storeString("pns_npth_cookie", string2);
                    }
                }
            }
        };
        LLJIJIL = new InterfaceC586170Myt() { // from class: X.14cL
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                C20302414cI.LL.getClass();
                                if (C20302414cI.LLIZLLLIL) {
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
                                C20302414cI.LIZ(C2188811AlT.LIZIZ(sbLIZ2), "account_op");
                                return;
                            }
                            return;
                        }
                        C20302414cI.LL.getClass();
                        if (C20302414cI.LLIZLLLIL) {
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
                        C20302414cI.LIZ(C2188811AlT.LIZIZ(sbLIZ4), "account_op");
                        return;
                    }
                    C20302414cI.LL.getClass();
                    if (C20302414cI.LLIZLLLIL) {
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
                    C20302414cI.LIZ(C2188811AlT.LIZIZ(sbLIZ6), "account_op");
                    return;
                }
                C20302414cI.LL.getClass();
                if (C20302414cI.LLIZLLLIL) {
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
                C20302414cI.LIZ(C2188811AlT.LIZIZ(sbLIZ8), "account_op");
            }
        };
    }

    public static void LIZ(String str, String str2) {
        C793770VBv.LJII("app_log_isolation", new JSONObject().put(str2, str), null, null);
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        String uid;
        if (user2 == null || (uid = user2.getUid()) == null) {
            uid = CardStruct.IStatusCode.DEFAULT;
        }
        String strLIZIZ = C20301014c4.LIZIZ();
        LLILZIL.put(uid, strLIZIZ);
        LLILZLL.storeString(uid, strLIZIZ);
        C2273401Dyc.LJFF.put(uid, strLIZIZ);
    }
}
