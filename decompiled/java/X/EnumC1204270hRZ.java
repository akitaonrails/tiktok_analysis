package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hRZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204270hRZ {
    public static final EnumC1204270hRZ FULL_LOAD;
    public static final /* synthetic */ EnumC1204270hRZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1204270hRZ PULL_DOWN_LOAD;

    public static InterfaceC2044707zh<EnumC1204270hRZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1204270hRZ enumC1204270hRZ = new EnumC1204270hRZ("FULL_LOAD", 0);
        FULL_LOAD = enumC1204270hRZ;
        EnumC1204270hRZ enumC1204270hRZ2 = new EnumC1204270hRZ("PULL_DOWN_LOAD", 1);
        PULL_DOWN_LOAD = enumC1204270hRZ2;
        EnumC1204270hRZ[] enumC1204270hRZArr = {enumC1204270hRZ, enumC1204270hRZ2};
        LL = enumC1204270hRZArr;
        LLILLJJLI = new C2254308sP(enumC1204270hRZArr);
    }

    public static EnumC1204270hRZ[] values() {
        return (EnumC1204270hRZ[]) LL.clone();
    }

    public static EnumC1204270hRZ valueOf(String str) {
        return (EnumC1204270hRZ) C08FF.LIZ(EnumC1204270hRZ.class, str);
    }

    public EnumC1204270hRZ(String str, int i) {
    }
}
