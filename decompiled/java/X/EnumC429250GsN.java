package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429250GsN {
    public static final EnumC429250GsN DEFAULT;
    public static final EnumC429250GsN IS_ACTIVE;
    public static final EnumC429250GsN IS_INACTIVE;
    public static final /* synthetic */ EnumC429250GsN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC429250GsN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429250GsN enumC429250GsN = new EnumC429250GsN(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1);
        DEFAULT = enumC429250GsN;
        EnumC429250GsN enumC429250GsN2 = new EnumC429250GsN("IS_INACTIVE", 1, 0);
        IS_INACTIVE = enumC429250GsN2;
        EnumC429250GsN enumC429250GsN3 = new EnumC429250GsN("IS_ACTIVE", 2, 1);
        IS_ACTIVE = enumC429250GsN3;
        EnumC429250GsN[] enumC429250GsNArr = {enumC429250GsN, enumC429250GsN2, enumC429250GsN3};
        LLILLJJLI = enumC429250GsNArr;
        LLILLL = new C2254308sP(enumC429250GsNArr);
    }

    public static EnumC429250GsN[] values() {
        return (EnumC429250GsN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC429250GsN valueOf(String str) {
        return (EnumC429250GsN) C08FF.LIZ(EnumC429250GsN.class, str);
    }

    public EnumC429250GsN(String str, int i, int i2) {
        this.LL = i2;
    }
}
