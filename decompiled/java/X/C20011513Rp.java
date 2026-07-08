package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.effect.EffectType;

/* JADX INFO: renamed from: X.13Rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20011513Rp {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EffectType.values().length];
        try {
            iArr[EffectType.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EffectType.FONT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
