package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ioP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1256870ioP {
    public static final EnumC1256870ioP DEFAULT;
    public static final /* synthetic */ EnumC1256870ioP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1256870ioP MEDIUM;
    public static final EnumC1256870ioP MEDIUM_WEAK;
    public static final EnumC1256870ioP STRONG;
    public static final EnumC1256870ioP WEAK;

    public static InterfaceC2044707zh<EnumC1256870ioP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1256870ioP enumC1256870ioP = new EnumC1256870ioP(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1256870ioP;
        EnumC1256870ioP enumC1256870ioP2 = new EnumC1256870ioP("STRONG", 1);
        STRONG = enumC1256870ioP2;
        EnumC1256870ioP enumC1256870ioP3 = new EnumC1256870ioP("MEDIUM", 2);
        MEDIUM = enumC1256870ioP3;
        EnumC1256870ioP enumC1256870ioP4 = new EnumC1256870ioP("MEDIUM_WEAK", 3);
        MEDIUM_WEAK = enumC1256870ioP4;
        EnumC1256870ioP enumC1256870ioP5 = new EnumC1256870ioP("WEAK", 4);
        WEAK = enumC1256870ioP5;
        EnumC1256870ioP[] enumC1256870ioPArr = {enumC1256870ioP, enumC1256870ioP2, enumC1256870ioP3, enumC1256870ioP4, enumC1256870ioP5};
        LL = enumC1256870ioPArr;
        LLILLJJLI = new C2254308sP(enumC1256870ioPArr);
    }

    public static EnumC1256870ioP[] values() {
        return (EnumC1256870ioP[]) LL.clone();
    }

    public static EnumC1256870ioP valueOf(String str) {
        return (EnumC1256870ioP) C08FF.LIZ(EnumC1256870ioP.class, str);
    }

    public EnumC1256870ioP(String str, int i) {
    }
}
