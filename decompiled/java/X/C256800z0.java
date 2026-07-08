package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.text.a0;
import webcast.data.multi_guest_play.UserCountdownRecord;

/* JADX INFO: renamed from: X.00z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256800z0 {
    public static final String LIZIZ(UserCountdownRecord userCountdownRecord) {
        String str = new SimpleDateFormat("hh:mm", Locale.getDefault()).format(Long.valueOf(userCountdownRecord.startTime));
        String str2 = new SimpleDateFormat("hh:mm", Locale.getDefault()).format(Long.valueOf(userCountdownRecord.startTime + (userCountdownRecord.duration * ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        if (C497740JfY.LJJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" - ");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" - ");
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final SpannableStringBuilder LIZ(UserCountdownRecord userCountdownRecord, Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1850730yGF.LJFF(userCountdownRecord.score));
        sbLIZ.append('/');
        sbLIZ.append(C1850730yGF.LJFF(userCountdownRecord.targetScore));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ewy, context)), 0, a0.LJJJ(spannableStringBuilder, "/", 0, false, 6), 17);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex5, context)), a0.LJJJ(spannableStringBuilder, "/", 0, false, 6), spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
