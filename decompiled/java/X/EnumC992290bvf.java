package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992290bvf {
    public static final EnumC992290bvf END;
    public static final /* synthetic */ EnumC992290bvf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992290bvf START;

    public static InterfaceC2044707zh<EnumC992290bvf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992290bvf enumC992290bvf = new EnumC992290bvf("START", 0);
        START = enumC992290bvf;
        EnumC992290bvf enumC992290bvf2 = new EnumC992290bvf("END", 1);
        END = enumC992290bvf2;
        EnumC992290bvf[] enumC992290bvfArr = {enumC992290bvf, enumC992290bvf2};
        LL = enumC992290bvfArr;
        LLILLJJLI = new C2254308sP(enumC992290bvfArr);
    }

    public static EnumC992290bvf[] values() {
        return (EnumC992290bvf[]) LL.clone();
    }

    public static EnumC992290bvf valueOf(String str) {
        return (EnumC992290bvf) C08FF.LIZ(EnumC992290bvf.class, str);
    }

    public EnumC992290bvf(String str, int i) {
    }
}
