package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1403290mcZ {
    public static final EnumC1403290mcZ DEFAULT;
    public static final EnumC1403290mcZ DISABLED;
    public static final EnumC1403290mcZ ENABLED;
    public static final /* synthetic */ EnumC1403290mcZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1403290mcZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1403290mcZ enumC1403290mcZ = new EnumC1403290mcZ("ENABLED", 0, 1);
        ENABLED = enumC1403290mcZ;
        EnumC1403290mcZ enumC1403290mcZ2 = new EnumC1403290mcZ(LivePreviewCTASmartDisplayManager.DEFAULT, 1, 0);
        DEFAULT = enumC1403290mcZ2;
        EnumC1403290mcZ enumC1403290mcZ3 = new EnumC1403290mcZ("DISABLED", 2, -1);
        DISABLED = enumC1403290mcZ3;
        EnumC1403290mcZ[] enumC1403290mcZArr = {enumC1403290mcZ, enumC1403290mcZ2, enumC1403290mcZ3};
        LLILLJJLI = enumC1403290mcZArr;
        LLILLL = new C2254308sP(enumC1403290mcZArr);
    }

    public static EnumC1403290mcZ[] values() {
        return (EnumC1403290mcZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1403290mcZ valueOf(String str) {
        return (EnumC1403290mcZ) C08FF.LIZ(EnumC1403290mcZ.class, str);
    }

    public EnumC1403290mcZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
