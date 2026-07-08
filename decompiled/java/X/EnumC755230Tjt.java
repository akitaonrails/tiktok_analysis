package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC755230Tjt {
    public static final /* synthetic */ EnumC755230Tjt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC755230Tjt SECTION0;
    public static final EnumC755230Tjt SECTION1;
    public static final EnumC755230Tjt SECTION2;
    public static final EnumC755230Tjt SECTION3;

    public static InterfaceC2044707zh<EnumC755230Tjt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC755230Tjt enumC755230Tjt = new EnumC755230Tjt("SECTION0", 0);
        SECTION0 = enumC755230Tjt;
        EnumC755230Tjt enumC755230Tjt2 = new EnumC755230Tjt("SECTION1", 1);
        SECTION1 = enumC755230Tjt2;
        EnumC755230Tjt enumC755230Tjt3 = new EnumC755230Tjt("SECTION2", 2);
        SECTION2 = enumC755230Tjt3;
        EnumC755230Tjt enumC755230Tjt4 = new EnumC755230Tjt("SECTION3", 3);
        SECTION3 = enumC755230Tjt4;
        EnumC755230Tjt[] enumC755230TjtArr = {enumC755230Tjt, enumC755230Tjt2, enumC755230Tjt3, enumC755230Tjt4};
        LL = enumC755230TjtArr;
        LLILLJJLI = new C2254308sP(enumC755230TjtArr);
    }

    public static EnumC755230Tjt[] values() {
        return (EnumC755230Tjt[]) LL.clone();
    }

    public static EnumC755230Tjt valueOf(String str) {
        return (EnumC755230Tjt) C08FF.LIZ(EnumC755230Tjt.class, str);
    }

    public EnumC755230Tjt(String str, int i) {
    }
}
