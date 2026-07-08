package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007007tc {
    public static final EnumC2007007tc DEFAULT;
    public static final /* synthetic */ EnumC2007007tc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2007007tc MATCH_PARENT;
    public static final EnumC2007007tc NORMAL_FOOTER;
    public static final EnumC2007007tc WARP_CONTENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2007007tc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2007007tc enumC2007007tc = new EnumC2007007tc(LivePreviewCTASmartDisplayManager.DEFAULT, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        DEFAULT = enumC2007007tc;
        EnumC2007007tc enumC2007007tc2 = new EnumC2007007tc("MATCH_PARENT", 1, -1);
        MATCH_PARENT = enumC2007007tc2;
        EnumC2007007tc enumC2007007tc3 = new EnumC2007007tc("WARP_CONTENT", 2, -2);
        WARP_CONTENT = enumC2007007tc3;
        EnumC2007007tc enumC2007007tc4 = new EnumC2007007tc("NORMAL_FOOTER", 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        NORMAL_FOOTER = enumC2007007tc4;
        EnumC2007007tc[] enumC2007007tcArr = {enumC2007007tc, enumC2007007tc2, enumC2007007tc3, enumC2007007tc4};
        LLILLJJLI = enumC2007007tcArr;
        LLILLL = new C2254308sP(enumC2007007tcArr);
    }

    public static EnumC2007007tc[] values() {
        return (EnumC2007007tc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2007007tc valueOf(String str) {
        return (EnumC2007007tc) C08FF.LIZ(EnumC2007007tc.class, str);
    }

    public EnumC2007007tc(String str, int i, int i2) {
        this.LL = i2;
    }
}
