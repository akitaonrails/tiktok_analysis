package X;

import Y.ARunnableS0S1020000_19;
import Y.ARunnableS0S3010000_19;
import Y.ARunnableS0S3110000_19;
import Y.ARunnableS2S0010000_19;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245340iVo {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static String LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static Boolean LJIIZILJ;
    public static Boolean LJIJI;
    public static Boolean LJIJJLI;
    public static final ConcurrentHashMap<String, Set<String>> LJJI;
    public static final ConcurrentHashMap<String, Set<String>> LJJIFFI;
    public static final C1245340iVo LIZ = new C1245340iVo();
    public static String LJ = "";
    public static final ConcurrentHashMap<String, ConcurrentHashMap<EnumC1248370iah, Set<String>>> LJIIIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, List<String>>> LJIIJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, List<String>>> LJIIJJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<EnumC1248370iah, Set<String>> LJIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<String>> LJIILIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<String>> LJIILJJIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, SparseArray<String>> LJIILL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, SparseArray<String>>> LJIILLIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIJJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<EnumC1248370iah, Set<String>> LJJ = new ConcurrentHashMap<>();

    static {
        LJFF = "";
        LJFF = C0XQ7.LJFF().getCurUserId();
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0iVp
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                String nickname;
                String uid2 = null;
                if (!z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" failed, nickname:");
                    if (user != null) {
                        nickname = user.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ.append(nickname);
                    sbLIZ.append(" , uid:");
                    if (user != null) {
                        uid2 = user.getUid();
                    }
                    sbLIZ.append(uid2);
                    C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C1245340iVo.LIZ.getClass();
                C1245340iVo.LIZJ = true;
                C1245340iVo.LJFF(null, C1245340iVo.LJFF, "", "", true);
                if (user == null || (uid = user.getUid()) == null) {
                    uid = "";
                }
                C1245340iVo.LJFF = uid;
                C1245340iVo.LIZIZ = false;
                C1245340iVo.LJII("", true);
                if (C299980BpM.LIZ()) {
                    C1245340iVo.LIZLLL = true;
                    C1245340iVo.LJIILIIL.clear();
                    C1245340iVo.LJIILJJIL.clear();
                    C1245340iVo.LJIILL.clear();
                    C1245340iVo.LJIIZILJ = null;
                    C1245340iVo.LJIJI = null;
                    C1245340iVo.LJIJJLI = null;
                }
            }
        });
        LJJI = new ConcurrentHashMap<>();
        LJJIFFI = new ConcurrentHashMap<>();
    }

    public static void LIZLLL() {
        LJIIJ.clear();
        LJIIJJI.clear();
        LJIILLIIL.clear();
        LJIJ.clear();
        LJIJJ.clear();
        LJIL.clear();
    }

    public static int LJ(boolean z) {
        ConcurrentHashMap<EnumC1248370iah, Set<String>> concurrentHashMap;
        if (z) {
            concurrentHashMap = LJIIL;
        } else {
            concurrentHashMap = LJJ;
        }
        Set<String> set = concurrentHashMap.get(EnumC1248370iah.INTERACTION);
        if (set != null) {
            return set.size();
        }
        return 0;
    }

    public static void LJIIIIZZ(boolean z) {
        if (z) {
            LJIIL.clear();
            LJIIZILJ = null;
            LJIJI = null;
            LJIJJLI = null;
            return;
        }
        LJIIIZ.clear();
        LJIJ.clear();
        LJIJJ.clear();
        LJIL.clear();
    }

    public static void LJII(String str, boolean z) {
        if (str == null) {
            return;
        }
        if (!Intrinsics.LJFF(C786410Ut5.u3().getName(), "report_collect_thread")) {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new ARunnableS2S0010000_19(z, 1));
        } else {
            LJIIIIZZ(z);
        }
    }

    public static void LJIILJJIL(String str, boolean z, boolean z2) {
        if (LIZLLL) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileInfoCollectHelper", "updateNicknameEllipsized is switch account period");
        } else {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new ARunnableS0S1020000_19(z, z2, str, 0));
        }
    }

    public static void LJIILL(String str, boolean z, boolean z2) {
        if (LIZLLL) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileInfoCollectHelper", "updateNicknameLineBreak is switch account period");
        } else {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new ARunnableS0S1020000_19(z, z2, str, 1));
        }
    }

    public static void LJIILLIIL(String str, boolean z, boolean z2) {
        if (LIZLLL) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileInfoCollectHelper", "updateNicknameWordBreak is switch account period");
        } else {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new ARunnableS0S1020000_19(z, z2, str, 2));
        }
    }

    public static void LJIIIZ(String str, String str2, String str3, ConcurrentHashMap concurrentHashMap) {
        if (str3 != null && str3.length() != 0) {
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(str3);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap();
            }
            List arrayList = (List) concurrentHashMap2.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                concurrentHashMap2.put(str, arrayList);
            }
            concurrentHashMap.put(str3, concurrentHashMap2);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateComponentFullShowList addAll: ");
            sbLIZ.append(str);
            sbLIZ.append(", value: ");
            sbLIZ.append(str2);
            sbLIZ.append(", uid: ");
            sbLIZ.append(str3);
            C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
            arrayList.add(str2);
        }
    }

    public static void LJIIJ(String str, String str2, String str3, boolean z) {
        if (LIZLLL) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileInfoCollectHelper", "updateComponentShowList is switch account period");
        } else {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new ARunnableS0S3010000_19(z, str, str2, str3, 1));
        }
    }

    public static void LIZ(boolean z, String str, String str2, String str3, User user) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileInfoCollectHelper", "actionAfterLeavePlatformProfile");
        C1248840ibS.LIZ.getClass();
        C1248840ibS.LIZIZ.submit(new ARunnableS0S3110000_19(user, str, str2, str3, z, 0));
    }

    public static void LJFF(User user, String str, String str2, String str3, boolean z) {
        ConcurrentHashMap<EnumC1248370iah, Set<String>> concurrentHashMap;
        String str4;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object obj;
        Object obj2;
        String string;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobForEveryFeatureForProfilePlatform enterFrom: uid: ");
        sbLIZ.append(str);
        C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (LIZIZ || LJIIL.isEmpty()) {
                return;
            }
        } else if (LJIIIZ.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mobForEveryFeatureForProfilePlatform, uid: ");
        sbLIZ2.append(str);
        C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z) {
            ConcurrentHashMap<String, ConcurrentHashMap<EnumC1248370iah, Set<String>>> concurrentHashMap2 = LJIIIZ;
            concurrentHashMap = concurrentHashMap2.get(str);
            if (concurrentHashMap == null) {
                return;
            }
            if (concurrentHashMap.isEmpty()) {
                concurrentHashMap2.remove(str);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mobForEveryFeatureForProfilePlatform, collectionInfoByUid， uid: ");
            sbLIZ3.append(str);
            C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            concurrentHashMap = LJIIL;
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<EnumC1248370iah, Set<String>> entry : concurrentHashMap.entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("component_cnt", entry.getValue().size());
                    String strName = entry.getKey().name();
                    Locale locale = Locale.ROOT;
                    jSONObject.put("component_field", strName.toLowerCase(locale));
                    List listLLIIII = C13LP.LLIIII(entry.getValue());
                    String lowerCase = entry.getKey().name().toLowerCase(locale);
                    if (listLLIIII.isEmpty() && !z) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("eara: ");
                        sbLIZ4.append(lowerCase);
                        C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ4));
                        linkedHashMap.put("component_field", lowerCase);
                        try {
                            linkedHashMap.put("enter_from", str3);
                            String string2 = null;
                            if (user != null) {
                                string = Boolean.valueOf(user.isBlock).toString();
                            } else {
                                string = null;
                            }
                            linkedHashMap.put("is_block", string);
                            if (user != null) {
                                string2 = Integer.valueOf(user.getAccountType()).toString();
                            }
                            linkedHashMap.put("account_type", string2);
                            C20684815ws.LJIILLIIL("profile_info_collect_null_event", linkedHashMap);
                        } catch (JSONException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            int i3 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("mobForEveryFeatureForProfilePlatform: ");
                            sbLIZ5.append(e.getMessage());
                            C1720106oR.LIZ("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                    jSONObject.put("component_list", listLLIIII);
                    Iterator<T> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        jSONObject.put((String) it2.next(), 1);
                    }
                    jSONObject.put("to_user_id", str);
                    if (z) {
                        str4 = "personal_homepage";
                    } else {
                        str4 = "others_homepage";
                    }
                    jSONObject.put("enter_from", str4);
                    jSONObject.put("group_id", str2);
                    jSONObject.put("profile_entrance_id", C1256070in7.LIZ);
                    if (C299980BpM.LIZ()) {
                        LIZJ(LIZ, z, lowerCase, str, null, jSONObject, 8);
                    }
                    if (Intrinsics.LJFF(lowerCase, "INFO".toLowerCase(Locale.ROOT))) {
                        if (z) {
                            bool = LJIIZILJ;
                        } else {
                            bool = LJIJ.get(str);
                        }
                        String str5 = "1";
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                obj2 = "1";
                            } else {
                                obj2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            jSONObject.put("nickname_thumbnail", obj2);
                        }
                        if (z) {
                            bool2 = LJIJI;
                        } else {
                            bool2 = LJIJJ.get(str);
                        }
                        if (bool2 != null) {
                            if (bool2.booleanValue()) {
                                obj = "1";
                            } else {
                                obj = CardStruct.IStatusCode.DEFAULT;
                            }
                            jSONObject.put("nickname_linebreak", obj);
                        }
                        if (z) {
                            bool3 = LJIJJLI;
                        } else {
                            bool3 = LJIL.get(str);
                        }
                        if (bool3 != null) {
                            if (!bool3.booleanValue()) {
                                str5 = CardStruct.IStatusCode.DEFAULT;
                            }
                            jSONObject.put("nickname_wordbreak", str5);
                        }
                    }
                    int i4 = C2187451AjH.LIZ;
                    jSONObject.toString();
                    C20684815ws.LJIJ("profile_info_collect", jSONObject);
                } catch (JSONException e2) {
                    e = e2;
                }
            }
        }
    }

    public static void LJIIJJI(final boolean z, final EnumC1248370iah enumC1248370iah, final String str, final boolean z2, String str2) {
        if (!Intrinsics.LJFF(C786410Ut5.u3().getName(), "report_collect_thread")) {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new Runnable() { // from class: X.0iVq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateInfoForEveryFeature$1");
                    try {
                        C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                        boolean z3 = z;
                        EnumC1248370iah enumC1248370iah2 = enumC1248370iah;
                        String str3 = str;
                        boolean z4 = z2;
                        String str4 = C1245340iVo.LJ;
                        c1245340iVo.getClass();
                        C1245340iVo.LJIILIIL(z3, enumC1248370iah2, str3, z4, str4);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateInfoForEveryFeature$1");
                }
            });
        } else {
            LJIILIIL(z, enumC1248370iah, str, z2, str2);
        }
    }

    public static void LJIILIIL(boolean z, EnumC1248370iah enumC1248370iah, String str, boolean z2, String str2) {
        if (!z) {
            if (str2 != null && str2.length() != 0) {
                ConcurrentHashMap<String, ConcurrentHashMap<EnumC1248370iah, Set<String>>> concurrentHashMap = LJIIIZ;
                ConcurrentHashMap<EnumC1248370iah, Set<String>> concurrentHashMap2 = concurrentHashMap.get(str2);
                if (concurrentHashMap2 == null) {
                    if (!z2) {
                        return;
                    } else {
                        concurrentHashMap2 = new ConcurrentHashMap<>();
                    }
                }
                Set<String> copyOnWriteArraySet = concurrentHashMap2.get(enumC1248370iah);
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                    concurrentHashMap2.put(enumC1248370iah, copyOnWriteArraySet);
                }
                concurrentHashMap.put(str2, concurrentHashMap2);
                if (z2) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateInfoForEveryFeature addAll: ");
                    sbLIZ.append(enumC1248370iah);
                    sbLIZ.append(", value: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", uid: ");
                    sbLIZ.append(str2);
                    C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
                    copyOnWriteArraySet.add(str);
                    return;
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateInfoForEveryFeature remove: ");
                sbLIZ2.append(enumC1248370iah);
                sbLIZ2.append(", value: ");
                sbLIZ2.append(str);
                sbLIZ2.append(", uid: ");
                sbLIZ2.append(str2);
                C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ2));
                copyOnWriteArraySet.remove(str);
                if (!copyOnWriteArraySet.isEmpty()) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateInfoForEveryFeature infoCollectSet remove: ");
                sbLIZ3.append(enumC1248370iah);
                sbLIZ3.append(", value: ");
                sbLIZ3.append(str);
                sbLIZ3.append(", uid: ");
                sbLIZ3.append(str2);
                C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ3));
                concurrentHashMap2.remove(enumC1248370iah);
                if (!concurrentHashMap2.isEmpty()) {
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("updateInfoForEveryFeature collectionInfoForUserNew remove: ");
                sbLIZ4.append(enumC1248370iah);
                sbLIZ4.append(", value: ");
                sbLIZ4.append(str);
                sbLIZ4.append(", uid: ");
                sbLIZ4.append(str2);
                C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ4));
                concurrentHashMap.remove(str2);
                return;
            }
            return;
        }
        ConcurrentHashMap<EnumC1248370iah, Set<String>> concurrentHashMap3 = LJIIL;
        Set<String> copyOnWriteArraySet2 = concurrentHashMap3.get(enumC1248370iah);
        if (copyOnWriteArraySet2 == null) {
            if (!z2) {
                return;
            }
            copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
            concurrentHashMap3.put(enumC1248370iah, copyOnWriteArraySet2);
        }
        if (z2) {
            copyOnWriteArraySet2.add(str);
        } else {
            copyOnWriteArraySet2.remove(str);
        }
    }

    public static void LJI(View view, boolean z, final String str, final String str2, final int i, final String str3) {
        Rect rect = new Rect();
        if (view != null && view.getGlobalVisibleRect(rect)) {
            if (z) {
                if (!LIZLLL && str3 != null) {
                    C1248840ibS.LIZ.getClass();
                    C1248840ibS.LIZIZ.submit(new Runnable() { // from class: X.0iMh
                        public final void LIZ() {
                            C1245340iVo.LIZ.getClass();
                            ConcurrentHashMap<String, Set<String>> concurrentHashMap = C1245340iVo.LJJI;
                            Set<String> linkedHashSet = concurrentHashMap.get(str3);
                            if (linkedHashSet == null) {
                                linkedHashSet = new LinkedHashSet<>();
                                concurrentHashMap.put(str3, linkedHashSet);
                            }
                            String str4 = str2;
                            if (str4 == null || linkedHashSet.contains(str4)) {
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("reportProfileInteractionEntranceForMine userId: ");
                                sbLIZ.append(str);
                                sbLIZ.append(", scene: ");
                                sbLIZ.append(str2);
                                C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
                                return;
                            }
                            linkedHashSet.add(str2);
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
                            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
                            c2344009Gk.LIZJ(i + 1, "rank");
                            c2344009Gk.LIZLLL(C1256070in7.LIZ, "profile_entrance_id");
                            c2344009Gk.LJIIIIZZ("to_user_id", str);
                            C20684815ws.LJIILLIIL("profile_interaction_entrance_show", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ProfileInfoCollectHelper@dae2.reportProfileInteractionEntranceForMine$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.reportProfileInteractionEntranceForMine$1");
                        }
                    });
                    return;
                }
                return;
            }
            if (str == null) {
                return;
            }
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new Runnable() { // from class: X.0iMi
                public final void LIZ() {
                    C1245340iVo.LIZ.getClass();
                    ConcurrentHashMap<String, Set<String>> concurrentHashMap = C1245340iVo.LJJIFFI;
                    Set<String> linkedHashSet = concurrentHashMap.get(str);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        concurrentHashMap.put(str, linkedHashSet);
                    }
                    String str4 = str2;
                    if (str4 == null || linkedHashSet.contains(str4)) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportProfileInteractionEntranceForOther userId: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", scene: ");
                        sbLIZ.append(str2);
                        C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    linkedHashSet.add(str2);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
                    c2344009Gk.LIZJ(i + 1, "rank");
                    c2344009Gk.LIZLLL(C1256070in7.LIZ, "profile_entrance_id");
                    c2344009Gk.LJIIIIZZ("to_user_id", str);
                    C20684815ws.LJIILLIIL("profile_interaction_entrance_show", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ProfileInfoCollectHelper@dae2.reportProfileInteractionEntranceForOther$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.reportProfileInteractionEntranceForOther$1");
                }
            });
        }
    }

    public static void LIZJ(C1245340iVo c1245340iVo, boolean z, String str, String str2, C2344009Gk c2344009Gk, JSONObject jSONObject, int i) throws JSONException {
        List<String> list;
        List<String> list2;
        SparseArray<String> sparseArray;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4 = null;
        if ((i & 8) != 0) {
            c2344009Gk = null;
        }
        if ((i & 16) != 0) {
            jSONObject = null;
        }
        c1245340iVo.getClass();
        if (z) {
            list = LJIILIIL.get(str);
            list2 = LJIILJJIL.get(str);
        } else {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = LJIIJ.get(str2);
            if (concurrentHashMap != null) {
                list = concurrentHashMap.get(str);
            } else {
                list = null;
            }
            ConcurrentHashMap<String, List<String>> concurrentHashMap2 = LJIIJJI.get(str2);
            if (concurrentHashMap2 != null) {
                list2 = concurrentHashMap2.get(str);
            } else {
                list2 = null;
            }
        }
        if (c2344009Gk != null) {
            c2344009Gk.LJ(list, "component_full_show_list");
            if (list != null) {
                numValueOf2 = Integer.valueOf(list.size());
            } else {
                numValueOf2 = null;
            }
            c2344009Gk.LJ(numValueOf2, "component_full_show_cnt");
            c2344009Gk.LJ(list2, "component_show_list");
            if (list2 != null) {
                numValueOf3 = Integer.valueOf(list2.size());
            } else {
                numValueOf3 = null;
            }
            c2344009Gk.LJ(numValueOf3, "component_show_cnt");
        }
        if (jSONObject != null) {
            jSONObject.put("component_full_show_list", list);
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            jSONObject.put("component_full_show_cnt", numValueOf);
            jSONObject.put("component_show_list", list2);
            if (list2 != null) {
                numValueOf4 = Integer.valueOf(list2.size());
            }
            jSONObject.put("component_show_cnt", numValueOf4);
        }
        if (z) {
            sparseArray = LJIILL.get(str);
        } else {
            ConcurrentHashMap<String, SparseArray<String>> concurrentHashMap3 = LJIILLIIL.get(str2);
            if (concurrentHashMap3 != null) {
                sparseArray = concurrentHashMap3.get(str);
            } else {
                return;
            }
        }
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                String strValueAt = sparseArray.valueAt(i2);
                if (iKeyAt <= 6) {
                    String strJ4 = C786410Ut5.j4("top_%d_name", Arrays.copyOf(new Object[]{Integer.valueOf(iKeyAt + 1)}, 1));
                    if (c2344009Gk != null) {
                        c2344009Gk.LJFF(strJ4, strValueAt);
                    }
                    if (jSONObject != null) {
                        jSONObject.put(strJ4, strValueAt);
                    }
                }
            }
        }
    }
}
