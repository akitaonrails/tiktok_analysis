package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC871980YIq {
    public static final EnumC871980YIq COMPLETED;
    public static final EnumC871980YIq CURSOR_TOO_NEW;
    public static final EnumC871980YIq CURSOR_TOO_OLD;
    public static final EnumC871980YIq FOUND_MISSING_ENTITY;
    public static final /* synthetic */ EnumC871980YIq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC871980YIq PREV_CURSOR_IS_ZERO;
    public static final EnumC871980YIq SKIP_CURSOR_CHECK;

    public static InterfaceC2044707zh<EnumC871980YIq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC871980YIq enumC871980YIq = new EnumC871980YIq("PREV_CURSOR_IS_ZERO", 0);
        PREV_CURSOR_IS_ZERO = enumC871980YIq;
        EnumC871980YIq enumC871980YIq2 = new EnumC871980YIq("CURSOR_TOO_OLD", 1);
        CURSOR_TOO_OLD = enumC871980YIq2;
        EnumC871980YIq enumC871980YIq3 = new EnumC871980YIq("CURSOR_TOO_NEW", 2);
        CURSOR_TOO_NEW = enumC871980YIq3;
        EnumC871980YIq enumC871980YIq4 = new EnumC871980YIq("FOUND_MISSING_ENTITY", 3);
        FOUND_MISSING_ENTITY = enumC871980YIq4;
        EnumC871980YIq enumC871980YIq5 = new EnumC871980YIq("COMPLETED", 4);
        COMPLETED = enumC871980YIq5;
        EnumC871980YIq enumC871980YIq6 = new EnumC871980YIq("SKIP_CURSOR_CHECK", 5);
        SKIP_CURSOR_CHECK = enumC871980YIq6;
        EnumC871980YIq[] enumC871980YIqArr = {enumC871980YIq, enumC871980YIq2, enumC871980YIq3, enumC871980YIq4, enumC871980YIq5, enumC871980YIq6};
        LL = enumC871980YIqArr;
        LLILLJJLI = new C2254308sP(enumC871980YIqArr);
    }

    public static EnumC871980YIq[] values() {
        return (EnumC871980YIq[]) LL.clone();
    }

    public static EnumC871980YIq valueOf(String str) {
        return (EnumC871980YIq) C08FF.LIZ(EnumC871980YIq.class, str);
    }

    public EnumC871980YIq(String str, int i) {
    }
}
