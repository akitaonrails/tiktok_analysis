package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SAV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAV {
    public static final C0SAW Companion;
    public static final /* synthetic */ C0SAV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SAV P_1080;
    public static final C0SAV P_360;
    public static final C0SAV P_480;
    public static final C0SAV P_540;
    public static final C0SAV P_720;
    public static final C0SAV UNKNOWN;
    public final String LL;
    public final int maxSize;
    public final int minSize;

    public static InterfaceC2044707zh<C0SAV> getEntries() {
        return LLILLL;
    }

    public static final C0SAV matchedResolution(int i, int i2) {
        Companion.getClass();
        return C0SAW.LIZ(i, i2);
    }

    static {
        C0SAV c0sav = new C0SAV(0, 444, 0, "P_360", "360p");
        P_360 = c0sav;
        C0SAV c0sav2 = new C0SAV(1, 520, 444, "P_480", "480p");
        P_480 = c0sav2;
        C0SAV c0sav3 = new C0SAV(2, OppoPermissionPopupMaskDelayExp.DEFAULT, 520, "P_540", "540p");
        P_540 = c0sav3;
        C0SAV c0sav4 = new C0SAV(3, 1048, OppoPermissionPopupMaskDelayExp.DEFAULT, "P_720", "720p");
        P_720 = c0sav4;
        C0SAV c0sav5 = new C0SAV(4, Integer.MAX_VALUE, 1048, "P_1080", "1080p+");
        P_1080 = c0sav5;
        C0SAV c0sav6 = new C0SAV(5, -1, -1, "UNKNOWN", "unknown");
        UNKNOWN = c0sav6;
        C0SAV[] c0savArr = {c0sav, c0sav2, c0sav3, c0sav4, c0sav5, c0sav6};
        LLILLJJLI = c0savArr;
        LLILLL = new C2254308sP(c0savArr);
        Companion = new C0SAW();
    }

    public static C0SAV[] values() {
        return (C0SAV[]) LLILLJJLI.clone();
    }

    public final String getFormat() {
        return this.LL;
    }

    public static C0SAV valueOf(String str) {
        return (C0SAV) C08FF.LIZ(C0SAV.class, str);
    }

    public C0SAV(int i, int i2, int i3, String str, String str2) {
        this.LL = str2;
        this.maxSize = i2;
        this.minSize = i3;
    }
}
