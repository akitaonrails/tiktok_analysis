package X;

import com.ss.android.ugc.aweme.feed.ab.LongHandExtendConfig;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.15h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20587015h6 {
    public static final LongHandExtendConfig LIZ = new LongHandExtendConfig(false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(435));

    public static LongHandExtendConfig LIZIZ() {
        return (LongHandExtendConfig) LIZIZ.getValue();
    }

    public static IntRange LIZ(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = i3;
        }
        if (i2 <= 0 || i2 < i) {
            i2 = i4;
        }
        return new IntRange(i, i2);
    }
}
