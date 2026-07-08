package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19384110sZ {
    public static final EnumC19384110sZ DISABLED;
    public static final EnumC19384110sZ GONE;
    public static final /* synthetic */ EnumC19384110sZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19384110sZ VISIBLE;

    public static InterfaceC2044707zh<EnumC19384110sZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19384110sZ enumC19384110sZ = new EnumC19384110sZ("VISIBLE", 0);
        VISIBLE = enumC19384110sZ;
        EnumC19384110sZ enumC19384110sZ2 = new EnumC19384110sZ("DISABLED", 1);
        DISABLED = enumC19384110sZ2;
        EnumC19384110sZ enumC19384110sZ3 = new EnumC19384110sZ("GONE", 2);
        GONE = enumC19384110sZ3;
        EnumC19384110sZ[] enumC19384110sZArr = {enumC19384110sZ, enumC19384110sZ2, enumC19384110sZ3};
        LL = enumC19384110sZArr;
        LLILLJJLI = new C2254308sP(enumC19384110sZArr);
    }

    public static EnumC19384110sZ[] values() {
        return (EnumC19384110sZ[]) LL.clone();
    }

    public static EnumC19384110sZ valueOf(String str) {
        return (EnumC19384110sZ) C08FF.LIZ(EnumC19384110sZ.class, str);
    }

    public EnumC19384110sZ(String str, int i) {
    }
}
