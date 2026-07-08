package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675940QfI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(531));

    public static void LIZ(Function1 function1) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_photo_search_history", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r5, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r6, kotlin.jvm.functions.Function1 r7) {
        /*
            X.0pL7 r4 = X.C1507790pL7.LIZ
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r2 = 0
            if (r6 == 0) goto Lbc
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L12
            java.lang.String r1 = r0.enterFromSecond
            if (r1 != 0) goto L18
        L12:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto Lbc
            java.lang.String r1 = r0.enterFrom
        L18:
            java.lang.String r0 = "enter_from"
            r3.put(r0, r1)
            if (r6 == 0) goto Lb9
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto Lb9
            java.lang.String r1 = r0.searchEntrance
        L25:
            java.lang.String r0 = "search_entrance"
            r3.put(r0, r1)
            if (r6 == 0) goto Lb6
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto Lb6
            java.lang.String r1 = r0.enterFromSecond
        L32:
            java.lang.String r0 = "enter_from_second"
            r3.put(r0, r1)
            if (r6 == 0) goto Lb4
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto Lb4
            java.lang.String r1 = r0.photoSearchModule
        L3f:
            java.lang.String r0 = "photo_search_module"
            r3.put(r0, r1)
            if (r6 == 0) goto Lb2
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto Lb2
            java.lang.String r1 = r0.sourcePageName
        L4c:
            java.lang.String r0 = "source_page_name"
            r3.put(r0, r1)
            if (r6 == 0) goto Lb0
            com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams r0 = r6.pdpParams
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.enterProductId
            if (r1 != 0) goto L61
        L5b:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto Lb0
            java.lang.String r1 = r0.enterProductId
        L61:
            java.lang.String r0 = "enter_product_id"
            r3.put(r0, r1)
            if (r6 == 0) goto Lae
            com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams r0 = r6.pdpParams
            if (r0 == 0) goto Lae
            java.lang.String r1 = r0.trackId
        L6e:
            java.lang.String r0 = "track_id"
            r3.put(r0, r1)
            if (r6 == 0) goto Lac
            com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams r0 = r6.pdpParams
            if (r0 == 0) goto Lac
            java.lang.String r1 = r0.rawPhotoSource
        L7b:
            java.lang.String r0 = "raw_photo_source"
            r3.put(r0, r1)
            if (r6 == 0) goto Laa
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto Laa
            int r0 = r0.rootEnterFromType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L8c:
            java.lang.String r0 = "root_enter_from_type"
            r3.put(r0, r1)
            if (r6 == 0) goto L99
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto L99
            java.lang.String r2 = r0.photoSearchPreviousPage
        L99:
            java.lang.String r0 = "photo_search_previous_page"
            r3.put(r0, r2)
            if (r7 == 0) goto La3
            r7.invoke(r3)
        La3:
            r4.getClass()
            X.C1507790pL7.LIZLLL(r5, r3)
            return
        Laa:
            r1 = r2
            goto L8c
        Lac:
            r1 = r2
            goto L7b
        Lae:
            r1 = r2
            goto L6e
        Lb0:
            r1 = r2
            goto L61
        Lb2:
            r1 = r2
            goto L4c
        Lb4:
            r1 = r2
            goto L3f
        Lb6:
            r1 = r2
            goto L32
        Lb9:
            r1 = r2
            goto L25
        Lbc:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675940QfI.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r5, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r6, kotlin.jvm.functions.Function1 r7) {
        /*
            X.0pL7 r4 = X.C1507790pL7.LIZ
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r2 = 0
            if (r6 == 0) goto L9e
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L9e
            java.lang.String r1 = r0.searchEntrance
        L10:
            java.lang.String r0 = "search_entrance"
            r3.put(r0, r1)
            if (r6 == 0) goto L1f
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.sourcePageName
            if (r1 != 0) goto L21
        L1f:
            java.lang.String r1 = ""
        L21:
            java.lang.String r0 = "source_page_name"
            r3.put(r0, r1)
            if (r6 == 0) goto L9c
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.enterFromSecond
            if (r1 != 0) goto L36
        L30:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto L9c
            java.lang.String r1 = r0.enterFrom
        L36:
            java.lang.String r0 = "enter_from"
            r3.put(r0, r1)
            if (r6 == 0) goto L46
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.enterFromSecond
            if (r0 == 0) goto L95
            r2 = r0
        L46:
            java.lang.String r0 = "enter_from_second"
            r3.put(r0, r2)
            if (r6 == 0) goto L55
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L55
            java.lang.String r1 = r0.photoSearchModule
            if (r1 != 0) goto L57
        L55:
            java.lang.String r1 = "visual_search"
        L57:
            java.lang.String r0 = "photo_search_module"
            r3.put(r0, r1)
            if (r6 == 0) goto Lac
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.middlePageId
            if (r1 == 0) goto L6b
            java.lang.String r0 = "impr_id"
            r3.put(r0, r1)
        L6b:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams r0 = r6.logParams
            if (r0 == 0) goto La1
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.middlePageBannerParams
            if (r0 == 0) goto La1
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L7b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L7b
        L95:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto L46
            java.lang.String r2 = r0.enterFrom
            goto L46
        L9c:
            r1 = r2
            goto L36
        L9e:
            r1 = r2
            goto L10
        La1:
            com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams r0 = r6.businessParams
            if (r0 == 0) goto Lac
            int r1 = r0.rootEnterFromType
            java.lang.String r0 = "root_enter_from_type"
            r3.put(r0, r1)
        Lac:
            if (r7 == 0) goto Lb1
            r7.invoke(r3)
        Lb1:
            r4.getClass()
            X.C1507790pL7.LIZLLL(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675940QfI.LIZJ(java.lang.String, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams, kotlin.jvm.functions.Function1):void");
    }
}
