package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993080bww {
    public static final EnumC993080bww CLICK;
    public static final /* synthetic */ EnumC993080bww[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 0;

    public static InterfaceC2044707zh<EnumC993080bww> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993080bww enumC993080bww = new EnumC993080bww();
        CLICK = enumC993080bww;
        EnumC993080bww[] enumC993080bwwArr = {enumC993080bww};
        LLILLJJLI = enumC993080bwwArr;
        LLILLL = new C2254308sP(enumC993080bwwArr);
    }

    public static EnumC993080bww[] values() {
        return (EnumC993080bww[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993080bww valueOf(String str) {
        return (EnumC993080bww) C08FF.LIZ(EnumC993080bww.class, str);
    }
}
