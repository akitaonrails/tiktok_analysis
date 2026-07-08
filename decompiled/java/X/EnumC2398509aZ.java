package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2398509aZ {
    public static final EnumC2398509aZ ABANDON;
    public static final EnumC2398509aZ CANCEL;
    public static final EnumC2398509aZ DISPOSE;
    public static final /* synthetic */ EnumC2398509aZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2398509aZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2398509aZ enumC2398509aZ = new EnumC2398509aZ("CANCEL", 0);
        CANCEL = enumC2398509aZ;
        EnumC2398509aZ enumC2398509aZ2 = new EnumC2398509aZ("ABANDON", 1);
        ABANDON = enumC2398509aZ2;
        EnumC2398509aZ enumC2398509aZ3 = new EnumC2398509aZ("DISPOSE", 2);
        DISPOSE = enumC2398509aZ3;
        EnumC2398509aZ[] enumC2398509aZArr = {enumC2398509aZ, enumC2398509aZ2, enumC2398509aZ3};
        LL = enumC2398509aZArr;
        LLILLJJLI = new C2254308sP(enumC2398509aZArr);
    }

    public static EnumC2398509aZ[] values() {
        return (EnumC2398509aZ[]) LL.clone();
    }

    public static EnumC2398509aZ valueOf(String str) {
        return (EnumC2398509aZ) C08FF.LIZ(EnumC2398509aZ.class, str);
    }

    public EnumC2398509aZ(String str, int i) {
    }
}
