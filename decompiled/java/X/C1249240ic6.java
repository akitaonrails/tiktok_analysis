package X;

import Y.ARunnableS0S2140000_19;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ic6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249240ic6 {
    public static final C1249240ic6 LIZ = new C1249240ic6();
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static String LIZJ;
    public static final Set<String> LIZLLL;
    public static long LJ;

    static {
        new CopyOnWriteArraySet();
        LIZLLL = new LinkedHashSet();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -597932817: goto L8;
                case -462086848: goto L13;
                case -435541338: goto L1e;
                case 903594015: goto L29;
                case 1357365266: goto L34;
                case 1540872212: goto L3f;
                default: goto L7;
            }
        L7:
            return r1
        L8:
            java.lang.String r0 = "content_section_cell_my_music"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "my_music"
            return r1
        L13:
            java.lang.String r0 = "content_section_cell_purchased_content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "purchased_content"
            return r1
        L1e:
            java.lang.String r0 = "content_section_cell_creator_studio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "creator_studio"
            return r1
        L29:
            java.lang.String r0 = "content_section_cell_balance"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "wallet_balance"
            return r1
        L34:
            java.lang.String r0 = "content_section_cell_seller_hub"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "seller_hub"
            return r1
        L3f:
            java.lang.String r0 = "content_section_cell_tiktok_minis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "tiktok_minis"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1249240ic6.LIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(java.util.List r6) {
        /*
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = (com.ss.android.ugc.profile.platform.base.data.ProfileComponents) r0
            if (r0 == 0) goto L9
            java.util.List<com.ss.android.ugc.profile.platform.base.data.EventParams> r0 = r0.eventParams
            if (r0 == 0) goto L9
            java.util.Iterator r5 = r0.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.profile.platform.base.data.EventParams r4 = (com.ss.android.ugc.profile.platform.base.data.EventParams) r4
            if (r4 == 0) goto L82
            java.lang.Integer r2 = r4.type
            X.09YG r0 = X.C09YG.TYPE_INFO_COLLECT
            int r1 = r0.getType()
            if (r2 == 0) goto L82
            int r0 = r2.intValue()
            if (r0 != r1) goto L82
            r0 = 1
        L3e:
            if (r0 == 0) goto L1f
            r2 = 0
            if (r4 == 0) goto L80
            com.google.gson.n r0 = r4.bizParams
        L45:
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = X.C08JS.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L70
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "scene"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6c
            boolean r0 = r3.add(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L70
        L6c:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L70
            goto L7c
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L7c:
            X.C189200o6.m1boximpl(r2)
            goto L1f
        L80:
            r0 = r2
            goto L45
        L82:
            r0 = 0
            goto L3e
        L84:
            java.util.List r0 = X.C13LP.LLIIII(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1249240ic6.LIZIZ(java.util.List):java.util.List");
    }

    public static void LIZLLL(final String str) {
        if (LJ != 0) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - LJ;
            LJ = 0L;
            if (!Intrinsics.LJFF("exit_background", str)) {
                LIZLLL.clear();
            }
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.08Dq
                public final void LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJFF("enter_from", "personal_homepage");
                    c2344009Gk.LJFF("action_type", str);
                    c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                    C20684815ws.LJIILLIIL("profile_center_stay_time", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MenuReport@a9c2.reportMenuExit$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MenuReport@a9c2.reportMenuExit$1");
                }
            });
        }
    }

    public static void LIZJ(final String str, final String str2, final String str3) {
        LJ = System.currentTimeMillis();
        LIZJ = str;
        LIZLLL.clear();
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0hb8
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("enter_from", "personal_homepage");
                c2344009Gk.LJFF("enter_method", str);
                String str4 = str2;
                if (str4 != null) {
                    c2344009Gk.LJFF("notification_business", str4);
                }
                String str5 = str3;
                if (str5 != null) {
                    c2344009Gk.LJFF("notification_type", str5);
                }
                C20684815ws.LJIILLIIL("enter_profile_center", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MenuReport@a9c2.reportMenuEnter$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MenuReport@a9c2.reportMenuEnter$1");
            }
        });
    }

    public static void LJ(String str, ProfileComponents profileComponents, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4) {
        if (str == null) {
            return;
        }
        LIZLLL.add(str);
        C20684815ws.LJFF().execute(new ARunnableS0S2140000_19(profileComponents, z, z2, str2, str3, z3, z4, 0));
    }

    public static void LJFF(List list, boolean z, boolean z2, int i, String str, String str2, boolean z3, boolean z4, boolean z5, String str3, String str4, String str5) {
        Object c098200Yq;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer num;
        if (list != null) {
            ArrayList<EventParams> arrayList = new ArrayList();
            for (Object obj5 : list) {
                EventParams eventParams = (EventParams) obj5;
                if (eventParams != null && (num = eventParams.type) != null && num.intValue() == i) {
                    arrayList.add(obj5);
                }
            }
            for (EventParams eventParams2 : arrayList) {
                if (eventParams2 != null) {
                    String str10 = eventParams2.event;
                    n nVar = eventParams2.bizParams;
                    if (str10 != null && nVar != null) {
                        try {
                            Map map = (Map) C08JS.LIZ(nVar.toString(), new LinkedHashMap().getClass());
                            map.put("enter_from", "personal_homepage");
                            String str11 = LIZJ;
                            String str12 = "";
                            if (str11 == null) {
                                str11 = "";
                            }
                            map.put("enter_method", str11);
                            String str13 = "1";
                            if (z) {
                                obj = "1";
                            } else {
                                obj = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("has_reddot", obj);
                            if (z2) {
                                obj2 = "1";
                            } else {
                                obj2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("has_subtitle", obj2);
                            if (C736460Sui.LIZIZ(str)) {
                                if (str == null) {
                                    str9 = "";
                                } else {
                                    str9 = str;
                                }
                                map.put("notification_business", str9);
                            }
                            if (C736460Sui.LIZIZ(str2)) {
                                if (str2 == null) {
                                    str8 = "";
                                } else {
                                    str8 = str2;
                                }
                                map.put("notification_type", str8);
                            }
                            if (i == C09YG.TYPE_CLICK.getType()) {
                                map.put("entrance_duration", String.valueOf(System.currentTimeMillis() - LJ));
                            }
                            if (z3) {
                                obj3 = "1";
                            } else {
                                obj3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("has_seen_menu_bubble", obj3);
                            map.put("has_seen_menu_reddot", CardStruct.IStatusCode.DEFAULT);
                            if (z4) {
                                obj4 = "1";
                            } else {
                                obj4 = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("has_seen_menu_number", obj4);
                            if (!z5) {
                                str13 = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("is_search", str13);
                            if (str3 == null) {
                                str6 = "";
                            } else {
                                str6 = str3;
                            }
                            map.put("search_keyword", str6);
                            if (str4 == null) {
                                str7 = "";
                            } else {
                                str7 = str4;
                            }
                            map.put("search_id", str7);
                            if (str5 != null) {
                                str12 = str5;
                            }
                            map.put("pre_search_id", str12);
                            C20684815ws.LJIILLIIL(str10, map);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    }
                }
            }
        }
    }
}
