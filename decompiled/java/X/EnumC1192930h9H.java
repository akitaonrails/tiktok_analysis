package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1192930h9H {
    public static final EnumC1192930h9H GUIDELINE;
    public static final /* synthetic */ EnumC1192930h9H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1192930h9H NONE;
    public static final EnumC1192930h9H ORDER_SUMMARY;

    public static InterfaceC2044707zh<EnumC1192930h9H> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1192930h9H enumC1192930h9H = new EnumC1192930h9H("NONE", 0);
        NONE = enumC1192930h9H;
        EnumC1192930h9H enumC1192930h9H2 = new EnumC1192930h9H("ORDER_SUMMARY", 1);
        ORDER_SUMMARY = enumC1192930h9H2;
        EnumC1192930h9H enumC1192930h9H3 = new EnumC1192930h9H("GUIDELINE", 2);
        GUIDELINE = enumC1192930h9H3;
        EnumC1192930h9H[] enumC1192930h9HArr = {enumC1192930h9H, enumC1192930h9H2, enumC1192930h9H3};
        LL = enumC1192930h9HArr;
        LLILLJJLI = new C2254308sP(enumC1192930h9HArr);
    }

    public static EnumC1192930h9H[] values() {
        return (EnumC1192930h9H[]) LL.clone();
    }

    public static EnumC1192930h9H valueOf(String str) {
        return (EnumC1192930h9H) C08FF.LIZ(EnumC1192930h9H.class, str);
    }

    public EnumC1192930h9H(String str, int i) {
    }
}
