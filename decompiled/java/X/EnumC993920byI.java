package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993920byI {
    public static final EnumC993920byI CUSTOM;
    public static final EnumC993920byI DEFAULT;
    public static final /* synthetic */ EnumC993920byI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993920byI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993920byI enumC993920byI = new EnumC993920byI(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC993920byI;
        EnumC993920byI enumC993920byI2 = new EnumC993920byI("CUSTOM", 1);
        CUSTOM = enumC993920byI2;
        EnumC993920byI[] enumC993920byIArr = {enumC993920byI, enumC993920byI2};
        LL = enumC993920byIArr;
        LLILLJJLI = new C2254308sP(enumC993920byIArr);
    }

    public static EnumC993920byI[] values() {
        return (EnumC993920byI[]) LL.clone();
    }

    public static EnumC993920byI valueOf(String str) {
        return (EnumC993920byI) C08FF.LIZ(EnumC993920byI.class, str);
    }

    public EnumC993920byI(String str, int i) {
    }
}
