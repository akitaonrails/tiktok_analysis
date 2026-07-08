package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;

/* JADX INFO: renamed from: X.11l9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19592911l9 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC19593011lA.values().length];
        try {
            iArr[EnumC19593011lA.ATTRIBUTION_LINK_MEDIA_SIZE_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19593011lA.ATTRIBUTION_LINK_MEDIA_SIZE_LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[AttributionLinkShareFormat.values().length];
        try {
            iArr2[AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_GREEN_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_PHOTO_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
    }
}
