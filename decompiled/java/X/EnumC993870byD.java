package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993870byD {
    public static final EnumC993870byD DEFAULT;
    public static final EnumC993870byD FAST_FIXED;
    public static final EnumC993870byD FAST_PREDICT;
    public static final /* synthetic */ EnumC993870byD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993870byD SLOW_COMPENSATE;

    public static InterfaceC2044707zh<EnumC993870byD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993870byD enumC993870byD = new EnumC993870byD(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC993870byD;
        EnumC993870byD enumC993870byD2 = new EnumC993870byD("FAST_FIXED", 1);
        FAST_FIXED = enumC993870byD2;
        EnumC993870byD enumC993870byD3 = new EnumC993870byD("FAST_PREDICT", 2);
        FAST_PREDICT = enumC993870byD3;
        EnumC993870byD enumC993870byD4 = new EnumC993870byD("SLOW_COMPENSATE", 3);
        SLOW_COMPENSATE = enumC993870byD4;
        EnumC993870byD[] enumC993870byDArr = {enumC993870byD, enumC993870byD2, enumC993870byD3, enumC993870byD4};
        LL = enumC993870byDArr;
        LLILLJJLI = new C2254308sP(enumC993870byDArr);
    }

    public static EnumC993870byD[] values() {
        return (EnumC993870byD[]) LL.clone();
    }

    public static EnumC993870byD valueOf(String str) {
        return (EnumC993870byD) C08FF.LIZ(EnumC993870byD.class, str);
    }

    public EnumC993870byD(String str, int i) {
    }
}
