package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1B0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2198071B0z {
    public static final EnumC2198071B0z CANCEL;
    public static final EnumC2198071B0z CHANGE_PLAN;
    public static final /* synthetic */ EnumC2198071B0z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2198071B0z REACTIVATE;
    public static final EnumC2198071B0z SUBSCRIBE;

    public static InterfaceC2044707zh<EnumC2198071B0z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2198071B0z enumC2198071B0z = new EnumC2198071B0z("SUBSCRIBE", 0);
        SUBSCRIBE = enumC2198071B0z;
        EnumC2198071B0z enumC2198071B0z2 = new EnumC2198071B0z("CHANGE_PLAN", 1);
        CHANGE_PLAN = enumC2198071B0z2;
        EnumC2198071B0z enumC2198071B0z3 = new EnumC2198071B0z("REACTIVATE", 2);
        REACTIVATE = enumC2198071B0z3;
        EnumC2198071B0z enumC2198071B0z4 = new EnumC2198071B0z("CANCEL", 3);
        CANCEL = enumC2198071B0z4;
        EnumC2198071B0z[] enumC2198071B0zArr = {enumC2198071B0z, enumC2198071B0z2, enumC2198071B0z3, enumC2198071B0z4};
        LL = enumC2198071B0zArr;
        LLILLJJLI = new C2254308sP(enumC2198071B0zArr);
    }

    public static EnumC2198071B0z[] values() {
        return (EnumC2198071B0z[]) LL.clone();
    }

    public static EnumC2198071B0z valueOf(String str) {
        return (EnumC2198071B0z) C08FF.LIZ(EnumC2198071B0z.class, str);
    }

    public EnumC2198071B0z(String str, int i) {
    }
}
