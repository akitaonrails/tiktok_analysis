package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0SEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718060SEq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme, Integer num) {
        int iIntValue;
        if ((C729510SjV.LJIJ(aweme) && !C729510SjV.LJIIZILJ(aweme)) || AwemeBizExtKt.isLocalUnpublishedAweme(aweme)) {
            return true;
        }
        if (num != null) {
            iIntValue = num.intValue() * 24;
        } else {
            iIntValue = 48;
        }
        if (System.currentTimeMillis() - (aweme.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) >= iIntValue * 3600000) {
            return false;
        }
        return true;
    }
}
