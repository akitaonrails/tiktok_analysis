package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0E9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C359980E9k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC359990E9l.values().length];
        try {
            iArr[EnumC359990E9l.OPEN_FILTER_PANEL_FROM_FILTER_ICON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC359990E9l.OPEN_FILTER_PANEL_FROM_SLIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC359990E9l.OPEN_MUSIC_FROM_EDITOR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
