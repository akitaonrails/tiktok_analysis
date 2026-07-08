package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC856540Xiu {
    public static final EnumC856540Xiu COVER_TYPE_CUSTOM_IMAGE;
    public static final EnumC856540Xiu COVER_TYPE_FIRST_FRAME;
    public static final EnumC856540Xiu COVER_TYPE_SELTECTED_FRAME;
    public static final EnumC856540Xiu COVER_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC856540Xiu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC856540Xiu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC856540Xiu enumC856540Xiu = new EnumC856540Xiu("COVER_TYPE_UNKNOWN", 0);
        COVER_TYPE_UNKNOWN = enumC856540Xiu;
        EnumC856540Xiu enumC856540Xiu2 = new EnumC856540Xiu("COVER_TYPE_FIRST_FRAME", 1);
        COVER_TYPE_FIRST_FRAME = enumC856540Xiu2;
        EnumC856540Xiu enumC856540Xiu3 = new EnumC856540Xiu("COVER_TYPE_SELTECTED_FRAME", 2);
        COVER_TYPE_SELTECTED_FRAME = enumC856540Xiu3;
        EnumC856540Xiu enumC856540Xiu4 = new EnumC856540Xiu("COVER_TYPE_CUSTOM_IMAGE", 3);
        COVER_TYPE_CUSTOM_IMAGE = enumC856540Xiu4;
        EnumC856540Xiu[] enumC856540XiuArr = {enumC856540Xiu, enumC856540Xiu2, enumC856540Xiu3, enumC856540Xiu4};
        LL = enumC856540XiuArr;
        LLILLJJLI = new C2254308sP(enumC856540XiuArr);
    }

    public static EnumC856540Xiu[] values() {
        return (EnumC856540Xiu[]) LL.clone();
    }

    public static EnumC856540Xiu valueOf(String str) {
        return (EnumC856540Xiu) C08FF.LIZ(EnumC856540Xiu.class, str);
    }

    public EnumC856540Xiu(String str, int i) {
    }
}
