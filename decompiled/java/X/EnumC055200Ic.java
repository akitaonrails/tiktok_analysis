package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC055200Ic {
    public static final EnumC055200Ic BEFORE_PUBLISH;
    public static final EnumC055200Ic DURING_PUBLISH;
    public static final /* synthetic */ EnumC055200Ic[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC055200Ic NOT_DESTROYED;

    public static InterfaceC2044707zh<EnumC055200Ic> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC055200Ic enumC055200Ic = new EnumC055200Ic("NOT_DESTROYED", 0);
        NOT_DESTROYED = enumC055200Ic;
        EnumC055200Ic enumC055200Ic2 = new EnumC055200Ic("BEFORE_PUBLISH", 1);
        BEFORE_PUBLISH = enumC055200Ic2;
        EnumC055200Ic enumC055200Ic3 = new EnumC055200Ic("DURING_PUBLISH", 2);
        DURING_PUBLISH = enumC055200Ic3;
        EnumC055200Ic[] enumC055200IcArr = {enumC055200Ic, enumC055200Ic2, enumC055200Ic3};
        LL = enumC055200IcArr;
        LLILLJJLI = new C2254308sP(enumC055200IcArr);
    }

    public static EnumC055200Ic[] values() {
        return (EnumC055200Ic[]) LL.clone();
    }

    public static EnumC055200Ic valueOf(String str) {
        return (EnumC055200Ic) C08FF.LIZ(EnumC055200Ic.class, str);
    }

    public EnumC055200Ic(String str, int i) {
    }
}
