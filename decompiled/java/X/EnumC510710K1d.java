package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC510710K1d {
    public static final EnumC510710K1d FULL_PAGE;
    public static final /* synthetic */ EnumC510710K1d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC510710K1d POPUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC510710K1d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC510710K1d enumC510710K1d = new EnumC510710K1d("POPUP", 0, "popup");
        POPUP = enumC510710K1d;
        EnumC510710K1d enumC510710K1d2 = new EnumC510710K1d("FULL_PAGE", 1, "full_page");
        FULL_PAGE = enumC510710K1d2;
        EnumC510710K1d[] enumC510710K1dArr = {enumC510710K1d, enumC510710K1d2};
        LLILLJJLI = enumC510710K1dArr;
        LLILLL = new C2254308sP(enumC510710K1dArr);
    }

    public static EnumC510710K1d[] values() {
        return (EnumC510710K1d[]) LLILLJJLI.clone();
    }

    public final boolean isFullScreen() {
        return Intrinsics.LJFF(this.LL, "full_page");
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC510710K1d valueOf(String str) {
        return (EnumC510710K1d) C08FF.LIZ(EnumC510710K1d.class, str);
    }

    public EnumC510710K1d(String str, int i, String str2) {
        this.LL = str2;
    }
}
