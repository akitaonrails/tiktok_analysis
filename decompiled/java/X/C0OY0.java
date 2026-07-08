package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0OY0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OY0 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
        }
        return C786410Ut5.k4(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
    }

    public static String LIZIZ(Number number) {
        String string;
        CharSequence charSequenceLIZ = C19374310qz.LIZ(number, new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28);
        if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
            return "";
        }
        return string;
    }
}
