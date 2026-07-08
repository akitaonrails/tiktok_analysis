package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0t89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653510t89 {
    public static final Bundle LIZ(ShortVideoContext shortVideoContext) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle = new Bundle();
        String str5 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("shoot_way", str, bundle);
        if (shortVideoContext != null) {
            str2 = shortVideoContext.enterFrom;
        } else {
            str2 = null;
        }
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("video_id", C1443560nfW.LJIIIIZZ(), bundle);
        if (C539900LFk.LJII(shortVideoContext) && (shortVideoContext == null || (str4 = shortVideoContext.liveSourceParams) == null || a0.LJJJIL(str4))) {
            C786410Ut5.LJJJI("sourceParams", "{\"request_from\":\"lightRecordContainerMode\",\"enter_from\":\"lightRecordContainerMode\"}", bundle);
        } else {
            if (shortVideoContext != null) {
                str3 = shortVideoContext.liveSourceParams;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("sourceParams", str3, bundle);
        }
        C786410Ut5.LJJJI("enter_from_type", String.valueOf(C1653500t88.LIZ), bundle);
        if (shortVideoContext != null) {
            str5 = shortVideoContext.enterMethod;
        }
        C786410Ut5.LJJJI("enter_method", str5, bundle);
        C786410Ut5.LJJJI("from_independent_live_page", String.valueOf(C539900LFk.LJII(shortVideoContext)), bundle);
        bundle.putBoolean("is_light_record_container_mode", C539900LFk.LJII(shortVideoContext));
        String str6 = C1653340t7s.LIZLLL;
        if (str6 != null) {
            C786410Ut5.LJJJI("live_tab_show_type", str6, bundle);
        }
        if (!C1443030nef.LJII().LIZ.isEmpty()) {
            C786410Ut5.LJJJI("challenge", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), ListProtector.get(C1443030nef.LJII().LIZ, 0)), bundle);
        }
        return bundle;
    }
}
