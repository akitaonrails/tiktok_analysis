package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918850a1D {
    public static final EnumC918850a1D INVITE_GUEST_V2;
    public static final /* synthetic */ EnumC918850a1D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918850a1D PUSH_V1;

    public static InterfaceC2044707zh<EnumC918850a1D> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918850a1D enumC918850a1D = new EnumC918850a1D("PUSH_V1", 0);
        PUSH_V1 = enumC918850a1D;
        EnumC918850a1D enumC918850a1D2 = new EnumC918850a1D("INVITE_GUEST_V2", 1);
        INVITE_GUEST_V2 = enumC918850a1D2;
        EnumC918850a1D[] enumC918850a1DArr = {enumC918850a1D, enumC918850a1D2};
        LL = enumC918850a1DArr;
        LLILLJJLI = new C2254308sP(enumC918850a1DArr);
    }

    public static EnumC918850a1D[] values() {
        return (EnumC918850a1D[]) LL.clone();
    }

    public static EnumC918850a1D valueOf(String str) {
        return (EnumC918850a1D) C08FF.LIZ(EnumC918850a1D.class, str);
    }

    public EnumC918850a1D(String str, int i) {
    }
}
