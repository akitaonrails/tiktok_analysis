package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC389820FQe {
    public static final EnumC389820FQe LEFT_BOTTOM;
    public static final EnumC389820FQe LEFT_TOP;
    public static final /* synthetic */ EnumC389820FQe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC389820FQe RIGHT_BOTTOM;
    public static final EnumC389820FQe RIGHT_TOP;

    public static InterfaceC2044707zh<EnumC389820FQe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC389820FQe enumC389820FQe = new EnumC389820FQe("LEFT_TOP", 0);
        LEFT_TOP = enumC389820FQe;
        EnumC389820FQe enumC389820FQe2 = new EnumC389820FQe("LEFT_BOTTOM", 1);
        LEFT_BOTTOM = enumC389820FQe2;
        EnumC389820FQe enumC389820FQe3 = new EnumC389820FQe("RIGHT_TOP", 2);
        RIGHT_TOP = enumC389820FQe3;
        EnumC389820FQe enumC389820FQe4 = new EnumC389820FQe("RIGHT_BOTTOM", 3);
        RIGHT_BOTTOM = enumC389820FQe4;
        EnumC389820FQe[] enumC389820FQeArr = {enumC389820FQe, enumC389820FQe2, enumC389820FQe3, enumC389820FQe4};
        LL = enumC389820FQeArr;
        LLILLJJLI = new C2254308sP(enumC389820FQeArr);
    }

    public static EnumC389820FQe[] values() {
        return (EnumC389820FQe[]) LL.clone();
    }

    public static EnumC389820FQe valueOf(String str) {
        return (EnumC389820FQe) C08FF.LIZ(EnumC389820FQe.class, str);
    }

    public EnumC389820FQe(String str, int i) {
    }
}
