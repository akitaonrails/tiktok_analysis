package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC507490JvH {
    public static final EnumC507490JvH FULL_PAGE;
    public static final /* synthetic */ EnumC507490JvH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC507490JvH POPUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC507490JvH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC507490JvH enumC507490JvH = new EnumC507490JvH("POPUP", 0, "popup");
        POPUP = enumC507490JvH;
        EnumC507490JvH enumC507490JvH2 = new EnumC507490JvH("FULL_PAGE", 1, "full_page");
        FULL_PAGE = enumC507490JvH2;
        EnumC507490JvH[] enumC507490JvHArr = {enumC507490JvH, enumC507490JvH2};
        LLILLJJLI = enumC507490JvHArr;
        LLILLL = new C2254308sP(enumC507490JvHArr);
    }

    public static EnumC507490JvH[] values() {
        return (EnumC507490JvH[]) LLILLJJLI.clone();
    }

    public final boolean isFullScreen() {
        return Intrinsics.LJFF(this.LL, "full_page");
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC507490JvH valueOf(String str) {
        return (EnumC507490JvH) C08FF.LIZ(EnumC507490JvH.class, str);
    }

    public EnumC507490JvH(String str, int i, String str2) {
        this.LL = str2;
    }
}
