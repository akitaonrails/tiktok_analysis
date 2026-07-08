package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZH5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZH5 {
    public static final C0ZH5 LIZ = new C0ZH5();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.Map r20, com.ss.android.ugc.aweme.sharer.model.SharePackage r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZH5.LIZ(java.util.Map, com.ss.android.ugc.aweme.sharer.model.SharePackage, java.util.List):void");
    }

    public static void LIZIZ(SharePackage sharePackage, String str, List list) {
        String str2;
        if (!Intrinsics.LJFF(sharePackage.itemType, "paid_series")) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ.getClass();
        LIZ(linkedHashMap, sharePackage, list);
        if (str.length() > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("if_with_comment", str2);
        C20684815ws.LJIILLIIL("share_series_to_chat", linkedHashMap);
    }
}
