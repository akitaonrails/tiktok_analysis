package X;

import com.ss.android.ugc.aweme.im.streak.impl.exp.FakeWritingConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06GE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06GE {
    public static final FakeWritingConfig LIZ = new FakeWritingConfig(3, 7);
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1385));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((FakeWritingConfig) c01gwLIZIZ.getValue()).maxInteractionRecordSize;
        LIZLLL = ((FakeWritingConfig) c01gwLIZIZ.getValue()).maxFakeWriteDays;
    }
}
