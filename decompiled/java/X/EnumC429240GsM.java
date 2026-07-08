package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429240GsM {
    public static final EnumC429240GsM COMPLETE;
    public static final EnumC429240GsM FAILED;
    public static final /* synthetic */ EnumC429240GsM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429240GsM NONE;
    public static final EnumC429240GsM PUBLISHING;

    public static InterfaceC2044707zh<EnumC429240GsM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429240GsM enumC429240GsM = new EnumC429240GsM("NONE", 0);
        NONE = enumC429240GsM;
        EnumC429240GsM enumC429240GsM2 = new EnumC429240GsM("PUBLISHING", 1);
        PUBLISHING = enumC429240GsM2;
        EnumC429240GsM enumC429240GsM3 = new EnumC429240GsM("COMPLETE", 2);
        COMPLETE = enumC429240GsM3;
        EnumC429240GsM enumC429240GsM4 = new EnumC429240GsM("FAILED", 3);
        FAILED = enumC429240GsM4;
        EnumC429240GsM[] enumC429240GsMArr = {enumC429240GsM, enumC429240GsM2, enumC429240GsM3, enumC429240GsM4};
        LL = enumC429240GsMArr;
        LLILLJJLI = new C2254308sP(enumC429240GsMArr);
    }

    public static EnumC429240GsM[] values() {
        return (EnumC429240GsM[]) LL.clone();
    }

    public static EnumC429240GsM valueOf(String str) {
        return (EnumC429240GsM) C08FF.LIZ(EnumC429240GsM.class, str);
    }

    public EnumC429240GsM(String str, int i) {
    }
}
