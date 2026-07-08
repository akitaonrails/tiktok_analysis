package X;

import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766200w3u {
    public final AnonymousClass1857 LIZ;
    public final C1743900vTw LIZIZ;

    public C1766200w3u(AnonymousClass1857 anonymousClass1857, C1743900vTw c1743900vTw) {
        this.LIZ = anonymousClass1857;
        this.LIZIZ = c1743900vTw;
    }

    public final void LIZIZ(View view, String str, C1744020vU8 c1744020vU8) {
        Map<String, Object> mapLJ;
        Map<String, Object> mapLJ2;
        if (c1744020vU8 == null) {
            return;
        }
        if (Intrinsics.LJFF(str, "button")) {
            LIZ(view, "button", c1744020vU8, this.LIZIZ);
            C1743890vTv.LIZ.getClass();
            List<String> list = C1743890vTv.LJ;
            C1743900vTw c1743900vTw = this.LIZIZ;
            if (c1743900vTw != null) {
                mapLJ2 = c1743900vTw.LJ();
            } else {
                mapLJ2 = C2097608Jq.LJ();
            }
            Map mapLIZ = C1743890vTv.LIZ(list, mapLJ2);
            mapLIZ.put("click_area", "button");
            C1743890vTv.LIZJ(view, "tiktokec_product_click", "c56078.d64390", mapLIZ);
            return;
        }
        LIZ(view, "other", c1744020vU8, this.LIZIZ);
        C1743890vTv.LIZ.getClass();
        List<String> list2 = C1743890vTv.LJ;
        C1743900vTw c1743900vTw2 = this.LIZIZ;
        if (c1743900vTw2 != null) {
            mapLJ = c1743900vTw2.LJ();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        Map mapLIZ2 = C1743890vTv.LIZ(list2, mapLJ);
        mapLIZ2.put("click_area", "other");
        C1743890vTv.LIZJ(view, "tiktokec_product_click", "c56078.d54430", mapLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r21, java.lang.String r22, X.C1744020vU8 r23, X.C1743900vTw r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1766200w3u.LIZ(android.view.View, java.lang.String, X.0vU8, X.0vTw):void");
    }
}
