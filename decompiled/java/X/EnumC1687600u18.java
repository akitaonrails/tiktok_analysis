package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1687600u18 {
    public static final EnumC1687600u18 CONNECTING;
    public static final /* synthetic */ EnumC1687600u18[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1687600u18 WAITING;

    public static InterfaceC2044707zh<EnumC1687600u18> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1687600u18 enumC1687600u18 = new EnumC1687600u18("WAITING", 0);
        WAITING = enumC1687600u18;
        EnumC1687600u18 enumC1687600u182 = new EnumC1687600u18("CONNECTING", 1);
        CONNECTING = enumC1687600u182;
        EnumC1687600u18[] enumC1687600u18Arr = {enumC1687600u18, enumC1687600u182};
        LL = enumC1687600u18Arr;
        LLILLJJLI = new C2254308sP(enumC1687600u18Arr);
    }

    public static EnumC1687600u18[] values() {
        return (EnumC1687600u18[]) LL.clone();
    }

    public static EnumC1687600u18 valueOf(String str) {
        return (EnumC1687600u18) C08FF.LIZ(EnumC1687600u18.class, str);
    }

    public EnumC1687600u18(String str, int i) {
    }
}
