package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Vby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801280Vby {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j) {
        Locale locale = Locale.getDefault();
        return new SimpleDateFormat("MMM dd, yyyy", locale).format(new Date(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
    }
}
