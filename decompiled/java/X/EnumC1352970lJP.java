package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1352970lJP {
    public static final EnumC1352970lJP CAPTION;
    public static final EnumC1352970lJP COMMENT;
    public static final /* synthetic */ EnumC1352970lJP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1352970lJP REACTION;

    public static InterfaceC2044707zh<EnumC1352970lJP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1352970lJP enumC1352970lJP = new EnumC1352970lJP("COMMENT", 0);
        COMMENT = enumC1352970lJP;
        EnumC1352970lJP enumC1352970lJP2 = new EnumC1352970lJP("REACTION", 1);
        REACTION = enumC1352970lJP2;
        EnumC1352970lJP enumC1352970lJP3 = new EnumC1352970lJP("CAPTION", 2);
        CAPTION = enumC1352970lJP3;
        EnumC1352970lJP[] enumC1352970lJPArr = {enumC1352970lJP, enumC1352970lJP2, enumC1352970lJP3};
        LL = enumC1352970lJPArr;
        LLILLJJLI = new C2254308sP(enumC1352970lJPArr);
    }

    public static EnumC1352970lJP[] values() {
        return (EnumC1352970lJP[]) LL.clone();
    }

    public static EnumC1352970lJP valueOf(String str) {
        return (EnumC1352970lJP) C08FF.LIZ(EnumC1352970lJP.class, str);
    }

    public EnumC1352970lJP(String str, int i) {
    }
}
