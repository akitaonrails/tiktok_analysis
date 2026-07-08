package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01kZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC422101kZ {
    public static final EnumC422101kZ END;
    public static final /* synthetic */ EnumC422101kZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC422101kZ START;

    public static InterfaceC2044707zh<EnumC422101kZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC422101kZ enumC422101kZ = new EnumC422101kZ("START", 0);
        START = enumC422101kZ;
        EnumC422101kZ enumC422101kZ2 = new EnumC422101kZ("END", 1);
        END = enumC422101kZ2;
        EnumC422101kZ[] enumC422101kZArr = {enumC422101kZ, enumC422101kZ2};
        LL = enumC422101kZArr;
        LLILLJJLI = new C2254308sP(enumC422101kZArr);
    }

    public static EnumC422101kZ[] values() {
        return (EnumC422101kZ[]) LL.clone();
    }

    public static EnumC422101kZ valueOf(String str) {
        return (EnumC422101kZ) C08FF.LIZ(EnumC422101kZ.class, str);
    }

    public EnumC422101kZ(String str, int i) {
    }
}
