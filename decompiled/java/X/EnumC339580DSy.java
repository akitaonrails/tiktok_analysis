package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC339580DSy {
    public static final /* synthetic */ EnumC339580DSy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC339580DSy PDP;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC339580DSy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC339580DSy enumC339580DSy = new EnumC339580DSy();
        PDP = enumC339580DSy;
        EnumC339580DSy[] enumC339580DSyArr = {enumC339580DSy};
        LLILLJJLI = enumC339580DSyArr;
        LLILLL = new C2254308sP(enumC339580DSyArr);
    }

    public static EnumC339580DSy[] values() {
        return (EnumC339580DSy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC339580DSy valueOf(String str) {
        return (EnumC339580DSy) C08FF.LIZ(EnumC339580DSy.class, str);
    }
}
