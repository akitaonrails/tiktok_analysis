package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12Nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19746112Nn {
    public static final EnumC19746112Nn BEZIER;
    public static final /* synthetic */ EnumC19746112Nn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19746112Nn POP;
    public static final EnumC19746112Nn SPRING;

    public static InterfaceC2044707zh<EnumC19746112Nn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19746112Nn enumC19746112Nn = new EnumC19746112Nn("SPRING", 0);
        SPRING = enumC19746112Nn;
        EnumC19746112Nn enumC19746112Nn2 = new EnumC19746112Nn("POP", 1);
        POP = enumC19746112Nn2;
        EnumC19746112Nn enumC19746112Nn3 = new EnumC19746112Nn("BEZIER", 2);
        BEZIER = enumC19746112Nn3;
        EnumC19746112Nn[] enumC19746112NnArr = {enumC19746112Nn, enumC19746112Nn2, enumC19746112Nn3};
        LL = enumC19746112NnArr;
        LLILLJJLI = new C2254308sP(enumC19746112NnArr);
    }

    public static EnumC19746112Nn[] values() {
        return (EnumC19746112Nn[]) LL.clone();
    }

    public static EnumC19746112Nn valueOf(String str) {
        return (EnumC19746112Nn) C08FF.LIZ(EnumC19746112Nn.class, str);
    }

    public EnumC19746112Nn(String str, int i) {
    }
}
