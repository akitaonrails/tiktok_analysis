package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1342350l2H {
    public static final EnumC1342350l2H CLICK;
    public static final /* synthetic */ EnumC1342350l2H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1342350l2H SHOW;

    public static InterfaceC2044707zh<EnumC1342350l2H> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1342350l2H enumC1342350l2H = new EnumC1342350l2H("CLICK", 0);
        CLICK = enumC1342350l2H;
        EnumC1342350l2H enumC1342350l2H2 = new EnumC1342350l2H("SHOW", 1);
        SHOW = enumC1342350l2H2;
        EnumC1342350l2H[] enumC1342350l2HArr = {enumC1342350l2H, enumC1342350l2H2};
        LL = enumC1342350l2HArr;
        LLILLJJLI = new C2254308sP(enumC1342350l2HArr);
    }

    public static EnumC1342350l2H[] values() {
        return (EnumC1342350l2H[]) LL.clone();
    }

    public static EnumC1342350l2H valueOf(String str) {
        return (EnumC1342350l2H) C08FF.LIZ(EnumC1342350l2H.class, str);
    }

    public EnumC1342350l2H(String str, int i) {
    }
}
