package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ri9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC703190Ri9 {
    public static final EnumC703190Ri9 ADD;
    public static final /* synthetic */ EnumC703190Ri9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC703190Ri9 REMOVE;

    public static InterfaceC2044707zh<EnumC703190Ri9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC703190Ri9 enumC703190Ri9 = new EnumC703190Ri9("ADD", 0);
        ADD = enumC703190Ri9;
        EnumC703190Ri9 enumC703190Ri92 = new EnumC703190Ri9("REMOVE", 1);
        REMOVE = enumC703190Ri92;
        EnumC703190Ri9[] enumC703190Ri9Arr = {enumC703190Ri9, enumC703190Ri92};
        LL = enumC703190Ri9Arr;
        LLILLJJLI = new C2254308sP(enumC703190Ri9Arr);
    }

    public static EnumC703190Ri9[] values() {
        return (EnumC703190Ri9[]) LL.clone();
    }

    public static EnumC703190Ri9 valueOf(String str) {
        return (EnumC703190Ri9) C08FF.LIZ(EnumC703190Ri9.class, str);
    }

    public EnumC703190Ri9(String str, int i) {
    }
}
