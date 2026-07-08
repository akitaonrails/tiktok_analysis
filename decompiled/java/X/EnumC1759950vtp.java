package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759950vtp {
    public static final /* synthetic */ EnumC1759950vtp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1759950vtp LYNX;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC1759950vtp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759950vtp enumC1759950vtp = new EnumC1759950vtp();
        LYNX = enumC1759950vtp;
        EnumC1759950vtp[] enumC1759950vtpArr = {enumC1759950vtp};
        LLILLJJLI = enumC1759950vtpArr;
        LLILLL = new C2254308sP(enumC1759950vtpArr);
    }

    public static EnumC1759950vtp[] values() {
        return (EnumC1759950vtp[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759950vtp valueOf(String str) {
        return (EnumC1759950vtp) C08FF.LIZ(EnumC1759950vtp.class, str);
    }
}
