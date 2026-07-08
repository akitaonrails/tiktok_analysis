package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;

/* JADX INFO: renamed from: X.0IAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C0IAZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FallbackStatusComponent.values().length];
        try {
            iArr[FallbackStatusComponent.UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[FallbackStatusComponent.FRIENDS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[FallbackStatusComponent.STORY_EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[FallbackStatusComponent.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
