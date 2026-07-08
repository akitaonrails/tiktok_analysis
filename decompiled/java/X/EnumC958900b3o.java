package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC958900b3o {
    public static final EnumC958900b3o INVITED;
    public static final /* synthetic */ EnumC958900b3o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC958900b3o NONE;
    public static final EnumC958900b3o PREPARED;
    public static final EnumC958900b3o RECEIVED;
    public static final EnumC958900b3o WAITED;

    public static InterfaceC2044707zh<EnumC958900b3o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC958900b3o enumC958900b3o = new EnumC958900b3o("NONE", 0);
        NONE = enumC958900b3o;
        EnumC958900b3o enumC958900b3o2 = new EnumC958900b3o("WAITED", 1);
        WAITED = enumC958900b3o2;
        EnumC958900b3o enumC958900b3o3 = new EnumC958900b3o("INVITED", 2);
        INVITED = enumC958900b3o3;
        EnumC958900b3o enumC958900b3o4 = new EnumC958900b3o("RECEIVED", 3);
        RECEIVED = enumC958900b3o4;
        EnumC958900b3o enumC958900b3o5 = new EnumC958900b3o("PREPARED", 4);
        PREPARED = enumC958900b3o5;
        EnumC958900b3o[] enumC958900b3oArr = {enumC958900b3o, enumC958900b3o2, enumC958900b3o3, enumC958900b3o4, enumC958900b3o5};
        LL = enumC958900b3oArr;
        LLILLJJLI = new C2254308sP(enumC958900b3oArr);
    }

    public static EnumC958900b3o[] values() {
        return (EnumC958900b3o[]) LL.clone();
    }

    public final boolean isIdle() {
        return this == NONE;
    }

    public static EnumC958900b3o valueOf(String str) {
        return (EnumC958900b3o) C08FF.LIZ(EnumC958900b3o.class, str);
    }

    public EnumC958900b3o(String str, int i) {
    }
}
