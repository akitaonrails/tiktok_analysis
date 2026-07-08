package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC442280HVy {
    public static final EnumC442280HVy DENIED_PERMANENT;
    public static final EnumC442280HVy GRANTED;
    public static final /* synthetic */ EnumC442280HVy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC442280HVy THIS_OPERATION_NOT_PERMITTED;

    public static InterfaceC2044707zh<EnumC442280HVy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC442280HVy enumC442280HVy = new EnumC442280HVy("GRANTED", 0);
        GRANTED = enumC442280HVy;
        EnumC442280HVy enumC442280HVy2 = new EnumC442280HVy("THIS_OPERATION_NOT_PERMITTED", 1);
        THIS_OPERATION_NOT_PERMITTED = enumC442280HVy2;
        EnumC442280HVy enumC442280HVy3 = new EnumC442280HVy("DENIED_PERMANENT", 2);
        DENIED_PERMANENT = enumC442280HVy3;
        EnumC442280HVy[] enumC442280HVyArr = {enumC442280HVy, enumC442280HVy2, enumC442280HVy3};
        LL = enumC442280HVyArr;
        LLILLJJLI = new C2254308sP(enumC442280HVyArr);
    }

    public static EnumC442280HVy[] values() {
        return (EnumC442280HVy[]) LL.clone();
    }

    public static EnumC442280HVy valueOf(String str) {
        return (EnumC442280HVy) C08FF.LIZ(EnumC442280HVy.class, str);
    }

    public EnumC442280HVy(String str, int i) {
    }
}
