package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992200bvW {
    public static final /* synthetic */ EnumC992200bvW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992200bvW ONLY_NEXT_ENABLED;
    public static final EnumC992200bvW ONLY_SKIP_ENABLED;

    public static InterfaceC2044707zh<EnumC992200bvW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992200bvW enumC992200bvW = new EnumC992200bvW("ONLY_SKIP_ENABLED", 0);
        ONLY_SKIP_ENABLED = enumC992200bvW;
        EnumC992200bvW enumC992200bvW2 = new EnumC992200bvW("ONLY_NEXT_ENABLED", 1);
        ONLY_NEXT_ENABLED = enumC992200bvW2;
        EnumC992200bvW[] enumC992200bvWArr = {enumC992200bvW, enumC992200bvW2};
        LL = enumC992200bvWArr;
        LLILLJJLI = new C2254308sP(enumC992200bvWArr);
    }

    public static EnumC992200bvW[] values() {
        return (EnumC992200bvW[]) LL.clone();
    }

    public static EnumC992200bvW valueOf(String str) {
        return (EnumC992200bvW) C08FF.LIZ(EnumC992200bvW.class, str);
    }

    public EnumC992200bvW(String str, int i) {
    }
}
