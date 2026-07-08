package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.report.ShowReportInfo;

/* JADX INFO: renamed from: X.0W8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818420W8q {
    public static final long LIZ(ShowReportInfo showReportInfo) {
        String str;
        if (showReportInfo != null && (str = showReportInfo.time) != null) {
            return CastLongProtector.parseLong(str);
        }
        return -1L;
    }
}
