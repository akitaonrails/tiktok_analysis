package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1461810o8x {
    public static final EnumC1461810o8x ADD;
    public static final EnumC1461810o8x DELETE;
    public static final /* synthetic */ EnumC1461810o8x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1461810o8x REORDER;
    public static final EnumC1461810o8x REPLACE;
    public static final EnumC1461810o8x UPDATE;

    public static InterfaceC2044707zh<EnumC1461810o8x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1461810o8x enumC1461810o8x = new EnumC1461810o8x("ADD", 0);
        ADD = enumC1461810o8x;
        EnumC1461810o8x enumC1461810o8x2 = new EnumC1461810o8x("DELETE", 1);
        DELETE = enumC1461810o8x2;
        EnumC1461810o8x enumC1461810o8x3 = new EnumC1461810o8x("REPLACE", 2);
        REPLACE = enumC1461810o8x3;
        EnumC1461810o8x enumC1461810o8x4 = new EnumC1461810o8x("REORDER", 3);
        REORDER = enumC1461810o8x4;
        EnumC1461810o8x enumC1461810o8x5 = new EnumC1461810o8x("UPDATE", 4);
        UPDATE = enumC1461810o8x5;
        EnumC1461810o8x[] enumC1461810o8xArr = {enumC1461810o8x, enumC1461810o8x2, enumC1461810o8x3, enumC1461810o8x4, enumC1461810o8x5};
        LL = enumC1461810o8xArr;
        LLILLJJLI = new C2254308sP(enumC1461810o8xArr);
    }

    public static EnumC1461810o8x[] values() {
        return (EnumC1461810o8x[]) LL.clone();
    }

    public static EnumC1461810o8x valueOf(String str) {
        return (EnumC1461810o8x) C08FF.LIZ(EnumC1461810o8x.class, str);
    }

    public EnumC1461810o8x(String str, int i) {
    }
}
