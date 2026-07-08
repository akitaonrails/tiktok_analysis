package X;

import Y.ARunnableS16S1000000_26;
import Y.ARunnableS3S2000000_12;
import Y.ARunnableS7S1000000_12;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.trill.feedback.api.FaqBottomButtonData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TU5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TU5 {
    public static final C0TU5 LIZ = new C0TU5();
    public static Map<String, String> LIZIZ = new LinkedHashMap();

    public static void LIZ(C2344009Gk c2344009Gk) {
        String str;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str = "logged";
        } else {
            str = "unlogged";
        }
        c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJFF("page_type", "native");
        C844470XAv.LIZ.getClass();
        c2344009Gk.LJFF("build_version", C844470XAv.LJFF());
        c2344009Gk.LJFF("enter_from", LIZIZ.get("enter_from"));
        c2344009Gk.LJFF("entrance", LIZIZ.get("entrance"));
        c2344009Gk.LJFF("page_id", LIZIZ.get("page_id"));
        c2344009Gk.LJFF("origin_refer", LIZIZ.get("origin_refer"));
    }

    public static void LIZIZ(int i) {
        String str;
        FaqBottomButtonData.Companion.getClass();
        if (i != FaqBottomButtonData.TYPE_IM && i != FaqBottomButtonData.TYPE_BOT) {
            str = "feedback";
        } else {
            str = "im";
        }
        C20684815ws.LJFF().submit(new ARunnableS7S1000000_12(str, 8));
    }

    public static void LJ(String str) {
        C20684815ws.LJFF().submit(new ARunnableS16S1000000_26(str, 0));
    }

    public static void LIZJ(String str, String str2) {
        C20684815ws.LJFF().submit(new ARunnableS3S2000000_12(str, str2, 2));
    }

    public static void LIZLLL(C0TU5 c0tu5, final String str, String str2, String str3, String str4, String str5, String str6, int i) {
        final String str7 = str5;
        final String str8 = str4;
        final String str9 = str3;
        final String str10 = str2;
        if ((i & 2) != 0) {
            str10 = "rap_main";
        }
        final String str11 = "";
        if ((i & 4) != 0) {
            str9 = "";
        }
        if ((i & 8) != 0) {
            str8 = "";
        }
        if ((i & 16) != 0) {
            str7 = "";
        }
        if ((i & 32) == 0) {
            str11 = str6;
        }
        c0tu5.getClass();
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.0TU4
            /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() throws org.json.JSONException {
                /*
                    r8 = this;
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                    java.lang.String r7 = r1
                    java.lang.String r6 = r2
                    java.lang.String r5 = r3
                    java.lang.String r3 = r4
                    java.lang.String r2 = r5
                    java.lang.String r1 = r6
                    java.lang.String r0 = "faq_id"
                    r4.put(r0, r7)
                    java.lang.String r0 = "page_name"
                    r4.put(r0, r6)
                    java.lang.String r0 = "faq_type"
                    r4.put(r0, r5)
                    java.lang.String r0 = "faq_list_type"
                    r4.put(r0, r3)
                    java.lang.String r0 = "faq_topic"
                    r4.put(r0, r2)
                    java.lang.String r0 = "action_type"
                    r4.put(r0, r1)
                    java.util.Map<java.lang.String, java.lang.String> r1 = X.C0TU5.LIZIZ     // Catch: java.lang.Exception -> L44
                    java.lang.String r0 = "enter_time"
                    java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L44
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L44
                    if (r0 == 0) goto Lc2
                    long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L44
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L44
                    goto L50
                L44:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    long r0 = java.lang.System.currentTimeMillis()
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                L50:
                    if (r0 == 0) goto Lc2
                    long r2 = java.lang.System.currentTimeMillis()
                    long r0 = r0.longValue()
                    long r2 = r2 - r0
                L5b:
                    java.lang.String r0 = "duration"
                    r4.put(r0, r2)
                    X.0TU5 r0 = X.C0TU5.LIZ
                    r0.getClass()
                    com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
                    X.0XPy r0 = (X.AbstractC848400XPy) r0
                    boolean r0 = r0.isLogin()
                    if (r0 == 0) goto Lbf
                    java.lang.String r1 = "logged"
                L73:
                    java.lang.String r0 = "status"
                    r4.put(r0, r1)
                    java.lang.String r1 = "page_type"
                    java.lang.String r0 = "native"
                    r4.put(r1, r0)
                    X.0XAv r0 = X.C844470XAv.LIZ
                    r0.getClass()
                    java.lang.String r1 = X.C844470XAv.LJFF()
                    java.lang.String r0 = "build_version"
                    r4.put(r0, r1)
                    java.util.Map<java.lang.String, java.lang.String> r0 = X.C0TU5.LIZIZ
                    java.lang.String r1 = "enter_from"
                    java.lang.Object r0 = r0.get(r1)
                    r4.put(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r0 = X.C0TU5.LIZIZ
                    java.lang.String r1 = "entrance"
                    java.lang.Object r0 = r0.get(r1)
                    r4.put(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r0 = X.C0TU5.LIZIZ
                    java.lang.String r1 = "page_id"
                    java.lang.Object r0 = r0.get(r1)
                    r4.put(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r0 = X.C0TU5.LIZIZ
                    java.lang.String r1 = "origin_refer"
                    java.lang.Object r0 = r0.get(r1)
                    r4.put(r1, r0)
                    java.lang.String r0 = "click_topics_question_na"
                    X.C20684815ws.LJIJ(r0, r4)
                    return
                Lbf:
                    java.lang.String r1 = "unlogged"
                    goto L73
                Lc2:
                    r2 = 0
                    goto L5b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0TU4.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FaqEventTrack@30b9.trackClickTopic$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FaqEventTrack@30b9.trackClickTopic$1");
            }
        });
    }
}
