package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC146000h8 {
    public static final EnumC146000h8 IDLE;
    public static final /* synthetic */ EnumC146000h8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC146000h8 SETTLED;
    public static final EnumC146000h8 STARTED;

    public static InterfaceC2044707zh<EnumC146000h8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC146000h8 enumC146000h8 = new EnumC146000h8("IDLE", 0);
        IDLE = enumC146000h8;
        EnumC146000h8 enumC146000h82 = new EnumC146000h8("STARTED", 1);
        STARTED = enumC146000h82;
        EnumC146000h8 enumC146000h83 = new EnumC146000h8("SETTLED", 2);
        SETTLED = enumC146000h83;
        EnumC146000h8[] enumC146000h8Arr = {enumC146000h8, enumC146000h82, enumC146000h83};
        LL = enumC146000h8Arr;
        LLILLJJLI = new C2254308sP(enumC146000h8Arr);
    }

    public static EnumC146000h8[] values() {
        return (EnumC146000h8[]) LL.clone();
    }

    public final boolean isStart() {
        return this == STARTED;
    }

    public static EnumC146000h8 valueOf(String str) {
        return (EnumC146000h8) C08FF.LIZ(EnumC146000h8.class, str);
    }

    public EnumC146000h8(String str, int i) {
    }
}
