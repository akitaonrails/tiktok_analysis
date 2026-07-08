package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660380PvI {
    public static final C660380PvI LIZ = new C660380PvI();

    public static Map LIZ(Aweme aweme) {
        String str;
        String str2;
        C660800Pvy.LIZ.getClass();
        PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_outreach_type", "1");
        if (poiDataStructLIZ == null || (str = poiDataStructLIZ.poiId) == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        if (poiDataStructLIZ != null) {
            str2 = poiDataStructLIZ.collectInfo;
        } else {
            str2 = null;
        }
        C186700nh.LIZ(str2, linkedHashMap);
        return linkedHashMap;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme != null && C660190Puz.LIZ(aweme)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r5, android.view.View r6, com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8, java.lang.String r9) {
        /*
            X.0Pvy r4 = X.C660800Pvy.LIZ
            androidx.fragment.app.Fragment r3 = X.C946803n0.LIZ(r6)
            r2 = 0
            if (r3 == 0) goto L1d
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L46
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L13:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L2b
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L3a
        L1d:
            r3 = r2
        L1e:
            if (r5 == 0) goto L24
            X.19EG r2 = X.C1388190mED.LIZIZ(r5)
        L24:
            r4.getClass()
            X.C660800Pvy.LIZIZ(r3, r2, r7, r8, r9)
            return
        L2b:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1d
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L3a
            goto L1d
        L38:
            if (r3 == 0) goto L1d
        L3a:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L41
            X.198i r3 = (X.InterfaceC214902198i) r3
            goto L1e
        L41:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L38
        L46:
            r1 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C660380PvI.LIZIZ(android.content.Context, android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }
}
