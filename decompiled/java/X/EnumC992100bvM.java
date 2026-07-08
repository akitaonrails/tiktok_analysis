package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992100bvM {
    public static final EnumC992100bvM DASH;
    public static final EnumC992100bvM GAP;
    public static final /* synthetic */ EnumC992100bvM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992100bvM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992100bvM enumC992100bvM = new EnumC992100bvM("DASH", 0);
        DASH = enumC992100bvM;
        EnumC992100bvM enumC992100bvM2 = new EnumC992100bvM("GAP", 1);
        GAP = enumC992100bvM2;
        EnumC992100bvM[] enumC992100bvMArr = {enumC992100bvM, enumC992100bvM2};
        LL = enumC992100bvMArr;
        LLILLJJLI = new C2254308sP(enumC992100bvMArr);
    }

    public static EnumC992100bvM[] values() {
        return (EnumC992100bvM[]) LL.clone();
    }

    public static EnumC992100bvM valueOf(String str) {
        return (EnumC992100bvM) C08FF.LIZ(EnumC992100bvM.class, str);
    }

    public EnumC992100bvM(String str, int i) {
    }
}
