package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.12ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19864612ns {
    public static final int[] LIZ = {1, 10, 100, LSPassThroughRecordSizeConfig.DEFAULT, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    public static final void LIZ(Appendable appendable, StringBuilder sb, int i) {
        if (i < 10) {
            ((StringBuilder) appendable).append('0');
        }
        sb.append(i);
    }
}
