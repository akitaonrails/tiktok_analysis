package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SAR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAR {
    public static final C0SAS LLILZ;
    public static final C0SAR LLILZIL;
    public static final /* synthetic */ C0SAR[] LLILZLL;
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0SAS] */
    static {
        C0SAR c0sar = new C0SAR(0, 444, Integer.MIN_VALUE, "P_360", "360p");
        C0SAR c0sar2 = new C0SAR(1, 520, 444, "P_480", "480p");
        C0SAR c0sar3 = new C0SAR(2, OppoPermissionPopupMaskDelayExp.DEFAULT, 520, "P_540", "540p");
        C0SAR c0sar4 = new C0SAR(3, 1048, OppoPermissionPopupMaskDelayExp.DEFAULT, "P_720", "720p");
        C0SAR c0sar5 = new C0SAR(4, Integer.MAX_VALUE, 1048, "P_1080", "1080p+");
        C0SAR c0sar6 = new C0SAR(5, -1, -1, "UNKNOWN", "unknown");
        LLILZIL = c0sar6;
        C0SAR[] c0sarArr = {c0sar, c0sar2, c0sar3, c0sar4, c0sar5, c0sar6};
        LLILZLL = c0sarArr;
        new C2254308sP(c0sarArr);
        LLILZ = new Object() { // from class: X.0SAS
        };
    }

    public static C0SAR[] values() {
        return (C0SAR[]) LLILZLL.clone();
    }

    public static C0SAR valueOf(String str) {
        return (C0SAR) C08FF.LIZ(C0SAR.class, str);
    }

    public C0SAR(int i, int i2, int i3, String str, String str2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
