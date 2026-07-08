package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429090Gs7 {
    public static final /* synthetic */ EnumC429090Gs7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429090Gs7 PROGRESS;
    public static final EnumC429090Gs7 ROTATE;

    public static InterfaceC2044707zh<EnumC429090Gs7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429090Gs7 enumC429090Gs7 = new EnumC429090Gs7("ROTATE", 0);
        ROTATE = enumC429090Gs7;
        EnumC429090Gs7 enumC429090Gs72 = new EnumC429090Gs7("PROGRESS", 1);
        PROGRESS = enumC429090Gs72;
        EnumC429090Gs7[] enumC429090Gs7Arr = {enumC429090Gs7, enumC429090Gs72};
        LL = enumC429090Gs7Arr;
        LLILLJJLI = new C2254308sP(enumC429090Gs7Arr);
    }

    public static EnumC429090Gs7[] values() {
        return (EnumC429090Gs7[]) LL.clone();
    }

    public static EnumC429090Gs7 valueOf(String str) {
        return (EnumC429090Gs7) C08FF.LIZ(EnumC429090Gs7.class, str);
    }

    public EnumC429090Gs7(String str, int i) {
    }
}
