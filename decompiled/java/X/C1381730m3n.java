package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.extensions.LogExtra;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0m3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381730m3n {
    public static final String LIZ(Aweme aweme) {
        String str;
        AnchorCommonStruct next;
        String logExtra;
        LogExtra logExtra2 = null;
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme) || aweme.isAd()) {
            return null;
        }
        if (AwemeBizExtKt.getPhotoContentType(aweme) != null) {
            return AwemeBizExtKt.getPhotoContentType(aweme);
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorCommonStruct anchorCommonStruct = next;
                    boolean z = false;
                    if (anchorCommonStruct != null && anchorCommonStruct.getType() == EnumC1430380nKG.ARTICLE_PHOTO_MODE.getTYPE()) {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null && (logExtra = anchorCommonStruct2.getLogExtra()) != null) {
                try {
                    logExtra2 = (LogExtra) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), logExtra, LogExtra.class);
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (logExtra2 == null || (str = logExtra2.photoContentType) == null) {
            str = "";
        }
        AwemeBizExtKt.setPhotoContentType(aweme, str);
        return AwemeBizExtKt.getPhotoContentType(aweme);
    }
}
