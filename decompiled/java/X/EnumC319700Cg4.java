package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC319700Cg4 {
    public static final EnumC319700Cg4 IDLE;
    public static final /* synthetic */ EnumC319700Cg4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC319700Cg4 SAVING;

    public static InterfaceC2044707zh<EnumC319700Cg4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC319700Cg4 enumC319700Cg4 = new EnumC319700Cg4("IDLE", 0);
        IDLE = enumC319700Cg4;
        EnumC319700Cg4 enumC319700Cg42 = new EnumC319700Cg4("SAVING", 1);
        SAVING = enumC319700Cg42;
        EnumC319700Cg4[] enumC319700Cg4Arr = {enumC319700Cg4, enumC319700Cg42};
        LL = enumC319700Cg4Arr;
        LLILLJJLI = new C2254308sP(enumC319700Cg4Arr);
    }

    public static EnumC319700Cg4[] values() {
        return (EnumC319700Cg4[]) LL.clone();
    }

    public static EnumC319700Cg4 valueOf(String str) {
        return (EnumC319700Cg4) C08FF.LIZ(EnumC319700Cg4.class, str);
    }

    public EnumC319700Cg4(String str, int i) {
    }
}
