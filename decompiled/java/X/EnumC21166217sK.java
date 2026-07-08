package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21166217sK {
    public static final /* synthetic */ EnumC21166217sK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21166217sK NA;
    public static final EnumC21166217sK SEND_A_WAVE;

    public static InterfaceC2044707zh<EnumC21166217sK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21166217sK enumC21166217sK = new EnumC21166217sK("SEND_A_WAVE", 0);
        SEND_A_WAVE = enumC21166217sK;
        EnumC21166217sK enumC21166217sK2 = new EnumC21166217sK("NA", 1);
        NA = enumC21166217sK2;
        EnumC21166217sK[] enumC21166217sKArr = {enumC21166217sK, enumC21166217sK2};
        LL = enumC21166217sKArr;
        LLILLJJLI = new C2254308sP(enumC21166217sKArr);
    }

    public static EnumC21166217sK[] values() {
        return (EnumC21166217sK[]) LL.clone();
    }

    public static EnumC21166217sK valueOf(String str) {
        return (EnumC21166217sK) C08FF.LIZ(EnumC21166217sK.class, str);
    }

    public EnumC21166217sK(String str, int i) {
    }
}
