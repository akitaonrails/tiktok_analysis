package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153530g7j {
    public static final EnumC1153530g7j FLOAT_WINDOW;
    public static final EnumC1153530g7j FULL_SCREEN;
    public static final /* synthetic */ EnumC1153530g7j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153530g7j MULTI_WINDOW;
    public static final EnumC1153530g7j NO_SUPPORT;

    public static InterfaceC2044707zh<EnumC1153530g7j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153530g7j enumC1153530g7j = new EnumC1153530g7j("NO_SUPPORT", 0);
        NO_SUPPORT = enumC1153530g7j;
        EnumC1153530g7j enumC1153530g7j2 = new EnumC1153530g7j("FULL_SCREEN", 1);
        FULL_SCREEN = enumC1153530g7j2;
        EnumC1153530g7j enumC1153530g7j3 = new EnumC1153530g7j("MULTI_WINDOW", 2);
        MULTI_WINDOW = enumC1153530g7j3;
        EnumC1153530g7j enumC1153530g7j4 = new EnumC1153530g7j("FLOAT_WINDOW", 3);
        FLOAT_WINDOW = enumC1153530g7j4;
        EnumC1153530g7j[] enumC1153530g7jArr = {enumC1153530g7j, enumC1153530g7j2, enumC1153530g7j3, enumC1153530g7j4};
        LL = enumC1153530g7jArr;
        LLILLJJLI = new C2254308sP(enumC1153530g7jArr);
    }

    public static EnumC1153530g7j[] values() {
        return (EnumC1153530g7j[]) LL.clone();
    }

    public static EnumC1153530g7j valueOf(String str) {
        return (EnumC1153530g7j) C08FF.LIZ(EnumC1153530g7j.class, str);
    }

    public EnumC1153530g7j(String str, int i) {
    }
}
