package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1461520o8U {
    public static final EnumC1461520o8U ENABLE_KEYFRAME;
    public static final /* synthetic */ EnumC1461520o8U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1461520o8U SHOW_CUT_PRO;

    public static InterfaceC2044707zh<EnumC1461520o8U> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1461520o8U enumC1461520o8U = new EnumC1461520o8U("ENABLE_KEYFRAME", 0);
        ENABLE_KEYFRAME = enumC1461520o8U;
        EnumC1461520o8U enumC1461520o8U2 = new EnumC1461520o8U("SHOW_CUT_PRO", 1);
        SHOW_CUT_PRO = enumC1461520o8U2;
        EnumC1461520o8U[] enumC1461520o8UArr = {enumC1461520o8U, enumC1461520o8U2};
        LL = enumC1461520o8UArr;
        LLILLJJLI = new C2254308sP(enumC1461520o8UArr);
    }

    public static EnumC1461520o8U[] values() {
        return (EnumC1461520o8U[]) LL.clone();
    }

    public static EnumC1461520o8U valueOf(String str) {
        return (EnumC1461520o8U) C08FF.LIZ(EnumC1461520o8U.class, str);
    }

    public EnumC1461520o8U(String str, int i) {
    }
}
