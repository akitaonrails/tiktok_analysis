package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511970K5z {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final LinkedHashMap<String, Object> LIZIZ = new LinkedHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r9 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r9.LIZIZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
            java.util.Map r3 = X.C2097608Jq.LJ()
        Lc:
            java.lang.String r0 = r9.LIZ
            X.C20684815ws.LJIILLIIL(r0, r3)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2f
            java.util.Set r1 = r3.entrySet()
            r2 = 0
            java.lang.String r3 = "{"
            java.lang.String r4 = "}"
            r5 = 0
            r0 = 196(0xc4, float:2.75E-43)
            kotlin.jvm.internal.AFwS231S0000000_3 r7 = kotlin.jvm.internal.AFwS231S0000000_3.get$arr$(r0)
            r8 = 25
            r6 = r2
            X.C13LP.LJJLIIIJ(r1, r2, r3, r4, r5, r6, r7, r8)
        L2f:
            return
        L30:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r9.LIZIZ
            int r0 = r0.size()
            r3.<init>(r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r9.LIZIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L45:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L45
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L70
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L45
        L6a:
            if (r1 == 0) goto L45
            r3.put(r2, r1)
            goto L45
        L70:
            boolean r0 = r1 instanceof java.lang.CharSequence
            if (r0 == 0) goto L81
            java.lang.String r1 = r1.toString()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L45
            goto L6a
        L81:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L9a
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L9a
            boolean r0 = r1 instanceof java.lang.Character
            if (r0 != 0) goto L9a
            java.lang.String r1 = r1.toString()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L45
            goto L6a
        L9a:
            java.lang.String r1 = r1.toString()
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C511970K5z.LIZLLL():void");
    }

    public C511970K5z(String str) {
        this.LIZ = str;
    }

    public static void LIZ(C511970K5z c511970K5z) {
        SubscriptionSceneContext subscriptionSceneContextLIZ = C0K4B.LIZ();
        if (subscriptionSceneContextLIZ != null) {
            String str = subscriptionSceneContextLIZ.enterFromMerge;
            if (str != null && (!a0.LJJJIL(str))) {
                c511970K5z.LIZIZ(str, "enter_from_merge");
            }
            String str2 = subscriptionSceneContextLIZ.enterMethod;
            if (str2 != null && (!a0.LJJJIL(str2))) {
                c511970K5z.LIZIZ(str2, "enter_method");
            }
            String str3 = subscriptionSceneContextLIZ.requestId;
            if (str3 != null && (!a0.LJJJIL(str3))) {
                c511970K5z.LIZIZ(str3, "request_id");
            }
            String str4 = subscriptionSceneContextLIZ.videoId;
            if (str4 != null && (!a0.LJJJIL(str4))) {
                c511970K5z.LIZIZ(str4, "video_id");
            }
            if (subscriptionSceneContextLIZ != null) {
                if (subscriptionSceneContextLIZ.roomId > 0) {
                    c511970K5z.LIZIZ(Long.valueOf(subscriptionSceneContextLIZ.roomId), "room_id");
                }
                if (subscriptionSceneContextLIZ.anchorUid > 0) {
                    c511970K5z.LIZIZ(Long.valueOf(subscriptionSceneContextLIZ.anchorUid), "anchor_id");
                }
                String str5 = subscriptionSceneContextLIZ.anchorSecUid;
                if (str5 != null && (true ^ a0.LJJJIL(str5))) {
                    c511970K5z.LIZIZ(str5, "sec_anchor_id");
                }
            }
        }
    }

    public final void LIZJ(Map map) {
        String string;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key == null || (string = key.toString()) == null) {
                    string = "";
                }
                if ((!a0.LJJJIL(string)) && value != null) {
                    this.LIZIZ.put(string, value);
                }
            }
        }
    }

    public final void LIZIZ(Object obj, String str) {
        if (!a0.LJJJIL(str) && obj != null) {
            this.LIZIZ.put(str, obj);
        }
    }
}
