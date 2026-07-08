package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC648820Pce implements C1D61 {
    public static final EnumC648820Pce INIT;
    public static final /* synthetic */ EnumC648820Pce[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC648820Pce> getEntries() {
        return LLILLL;
    }

    static {
        EnumC648820Pce enumC648820Pce = new EnumC648820Pce();
        INIT = enumC648820Pce;
        EnumC648820Pce[] enumC648820PceArr = {enumC648820Pce};
        LLILLJJLI = enumC648820PceArr;
        LLILLL = new C2254308sP(enumC648820PceArr);
    }

    public static EnumC648820Pce[] values() {
        return (EnumC648820Pce[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC648820Pce valueOf(String str) {
        return (EnumC648820Pce) C08FF.LIZ(EnumC648820Pce.class, str);
    }
}
