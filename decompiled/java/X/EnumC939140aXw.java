package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC939140aXw {
    public static final EnumC939140aXw LEGACY;
    public static final /* synthetic */ EnumC939140aXw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC939140aXw NEW_LAYOUT;

    public static InterfaceC2044707zh<EnumC939140aXw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC939140aXw enumC939140aXw = new EnumC939140aXw("LEGACY", 0);
        LEGACY = enumC939140aXw;
        EnumC939140aXw enumC939140aXw2 = new EnumC939140aXw("NEW_LAYOUT", 1);
        NEW_LAYOUT = enumC939140aXw2;
        EnumC939140aXw[] enumC939140aXwArr = {enumC939140aXw, enumC939140aXw2};
        LL = enumC939140aXwArr;
        LLILLJJLI = new C2254308sP(enumC939140aXwArr);
    }

    public static EnumC939140aXw[] values() {
        return (EnumC939140aXw[]) LL.clone();
    }

    public static EnumC939140aXw valueOf(String str) {
        return (EnumC939140aXw) C08FF.LIZ(EnumC939140aXw.class, str);
    }

    public EnumC939140aXw(String str, int i) {
    }
}
