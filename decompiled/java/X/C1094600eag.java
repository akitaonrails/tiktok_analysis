package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1094600eag {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1095860eci.values().length];
        try {
            iArr[EnumC1095860eci.FANS_CLUB_ANIM_ABOUT_TO_UPGRADE_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_GUIDE_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
