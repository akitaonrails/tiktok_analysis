package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC771760UPe {
    public static final EnumC771760UPe AGE_GATE_BLOCK;
    public static final EnumC771760UPe COLD_DOWN_BLOCK;
    public static final /* synthetic */ EnumC771760UPe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC771760UPe NORMAL_BLOCK;

    public static InterfaceC2044707zh<EnumC771760UPe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC771760UPe enumC771760UPe = new EnumC771760UPe("NORMAL_BLOCK", 0);
        NORMAL_BLOCK = enumC771760UPe;
        EnumC771760UPe enumC771760UPe2 = new EnumC771760UPe("COLD_DOWN_BLOCK", 1);
        COLD_DOWN_BLOCK = enumC771760UPe2;
        EnumC771760UPe enumC771760UPe3 = new EnumC771760UPe("AGE_GATE_BLOCK", 2);
        AGE_GATE_BLOCK = enumC771760UPe3;
        EnumC771760UPe[] enumC771760UPeArr = {enumC771760UPe, enumC771760UPe2, enumC771760UPe3};
        LL = enumC771760UPeArr;
        LLILLJJLI = new C2254308sP(enumC771760UPeArr);
    }

    public static EnumC771760UPe[] values() {
        return (EnumC771760UPe[]) LL.clone();
    }

    public static EnumC771760UPe valueOf(String str) {
        return (EnumC771760UPe) C08FF.LIZ(EnumC771760UPe.class, str);
    }

    public EnumC771760UPe(String str, int i) {
    }
}
