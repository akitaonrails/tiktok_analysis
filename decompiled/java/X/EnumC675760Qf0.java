package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC675760Qf0 {
    public static final EnumC675760Qf0 EC_V_SEARCH;
    public static final /* synthetic */ EnumC675760Qf0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC675760Qf0 PHOTO_SEARCH;

    public static InterfaceC2044707zh<EnumC675760Qf0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC675760Qf0 enumC675760Qf0 = new EnumC675760Qf0("EC_V_SEARCH", 0);
        EC_V_SEARCH = enumC675760Qf0;
        EnumC675760Qf0 enumC675760Qf02 = new EnumC675760Qf0("PHOTO_SEARCH", 1);
        PHOTO_SEARCH = enumC675760Qf02;
        EnumC675760Qf0[] enumC675760Qf0Arr = {enumC675760Qf0, enumC675760Qf02};
        LL = enumC675760Qf0Arr;
        LLILLJJLI = new C2254308sP(enumC675760Qf0Arr);
    }

    public static EnumC675760Qf0[] values() {
        return (EnumC675760Qf0[]) LL.clone();
    }

    public static EnumC675760Qf0 valueOf(String str) {
        return (EnumC675760Qf0) C08FF.LIZ(EnumC675760Qf0.class, str);
    }

    public EnumC675760Qf0(String str, int i) {
    }
}
