package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994770bzf {
    public static final /* synthetic */ EnumC994770bzf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994770bzf NORMAL;
    public static final EnumC994770bzf PREREAD;

    public static InterfaceC2044707zh<EnumC994770bzf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994770bzf enumC994770bzf = new EnumC994770bzf("PREREAD", 0);
        PREREAD = enumC994770bzf;
        EnumC994770bzf enumC994770bzf2 = new EnumC994770bzf("NORMAL", 1);
        NORMAL = enumC994770bzf2;
        EnumC994770bzf[] enumC994770bzfArr = {enumC994770bzf, enumC994770bzf2};
        LL = enumC994770bzfArr;
        LLILLJJLI = new C2254308sP(enumC994770bzfArr);
    }

    public static EnumC994770bzf[] values() {
        return (EnumC994770bzf[]) LL.clone();
    }

    public static EnumC994770bzf valueOf(String str) {
        return (EnumC994770bzf) C08FF.LIZ(EnumC994770bzf.class, str);
    }

    public EnumC994770bzf(String str, int i) {
    }
}
