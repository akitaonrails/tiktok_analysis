package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0JDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488450JDn {
    public static final String LIZ(InterfaceC489200JGk interfaceC489200JGk) {
        long jLJIIZILJ = interfaceC489200JGk.LJIIZILJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j = 60;
        return C786410Ut5.k4(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLJIIZILJ / j), Long.valueOf(jLJIIZILJ % j)}, 2));
    }
}
