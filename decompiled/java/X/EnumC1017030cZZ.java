package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1017030cZZ {
    public static final EnumC1017030cZZ DIRECT;
    public static final /* synthetic */ EnumC1017030cZZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1017030cZZ MAIN_IDLE;
    public static final EnumC1017030cZZ NET_IDLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1017030cZZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1017030cZZ enumC1017030cZZ = new EnumC1017030cZZ("DIRECT", 0, 1);
        DIRECT = enumC1017030cZZ;
        EnumC1017030cZZ enumC1017030cZZ2 = new EnumC1017030cZZ("MAIN_IDLE", 1, 16);
        MAIN_IDLE = enumC1017030cZZ2;
        EnumC1017030cZZ enumC1017030cZZ3 = new EnumC1017030cZZ("NET_IDLE", 2, 256);
        NET_IDLE = enumC1017030cZZ3;
        EnumC1017030cZZ[] enumC1017030cZZArr = {enumC1017030cZZ, enumC1017030cZZ2, enumC1017030cZZ3};
        LLILLJJLI = enumC1017030cZZArr;
        LLILLL = new C2254308sP(enumC1017030cZZArr);
    }

    public static EnumC1017030cZZ[] values() {
        return (EnumC1017030cZZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1017030cZZ valueOf(String str) {
        return (EnumC1017030cZZ) C08FF.LIZ(EnumC1017030cZZ.class, str);
    }

    public EnumC1017030cZZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
