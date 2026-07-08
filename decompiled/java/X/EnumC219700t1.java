package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC219700t1 {
    public static final EnumC219700t1 ANSWER_MSG_BOTTOM;
    public static final /* synthetic */ EnumC219700t1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC219700t1 SEND_MSG_TOP;

    public static InterfaceC2044707zh<EnumC219700t1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC219700t1 enumC219700t1 = new EnumC219700t1("SEND_MSG_TOP", 0);
        SEND_MSG_TOP = enumC219700t1;
        EnumC219700t1 enumC219700t12 = new EnumC219700t1("ANSWER_MSG_BOTTOM", 1);
        ANSWER_MSG_BOTTOM = enumC219700t12;
        EnumC219700t1[] enumC219700t1Arr = {enumC219700t1, enumC219700t12};
        LL = enumC219700t1Arr;
        LLILLJJLI = new C2254308sP(enumC219700t1Arr);
    }

    public static EnumC219700t1[] values() {
        return (EnumC219700t1[]) LL.clone();
    }

    public static EnumC219700t1 valueOf(String str) {
        return (EnumC219700t1) C08FF.LIZ(EnumC219700t1.class, str);
    }

    public EnumC219700t1(String str, int i) {
    }
}
