package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC897860ZKe {
    public static final EnumC897860ZKe CHAT_PAGE;
    public static final EnumC897860ZKe INBOX_PRELOAD;
    public static final EnumC897860ZKe LEAVE_GROUP;
    public static final /* synthetic */ EnumC897860ZKe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC897860ZKe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC897860ZKe enumC897860ZKe = new EnumC897860ZKe("INBOX_PRELOAD", 0, 1);
        INBOX_PRELOAD = enumC897860ZKe;
        EnumC897860ZKe enumC897860ZKe2 = new EnumC897860ZKe("CHAT_PAGE", 1, 2);
        CHAT_PAGE = enumC897860ZKe2;
        EnumC897860ZKe enumC897860ZKe3 = new EnumC897860ZKe("LEAVE_GROUP", 2, 3);
        LEAVE_GROUP = enumC897860ZKe3;
        EnumC897860ZKe[] enumC897860ZKeArr = {enumC897860ZKe, enumC897860ZKe2, enumC897860ZKe3};
        LLILLJJLI = enumC897860ZKeArr;
        LLILLL = new C2254308sP(enumC897860ZKeArr);
    }

    public static EnumC897860ZKe[] values() {
        return (EnumC897860ZKe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC897860ZKe valueOf(String str) {
        return (EnumC897860ZKe) C08FF.LIZ(EnumC897860ZKe.class, str);
    }

    public final boolean overwrite(EnumC897860ZKe enumC897860ZKe) {
        if (this.LL <= enumC897860ZKe.LL) {
            return true;
        }
        return false;
    }

    public EnumC897860ZKe(String str, int i, int i2) {
        this.LL = i2;
    }
}
