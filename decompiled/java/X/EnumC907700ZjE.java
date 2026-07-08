package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC907700ZjE {
    public static final EnumC907700ZjE DELETE;
    public static final EnumC907700ZjE INSERT;
    public static final /* synthetic */ EnumC907700ZjE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC907700ZjE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC907700ZjE enumC907700ZjE = new EnumC907700ZjE("INSERT", 0);
        INSERT = enumC907700ZjE;
        EnumC907700ZjE enumC907700ZjE2 = new EnumC907700ZjE("DELETE", 1);
        DELETE = enumC907700ZjE2;
        EnumC907700ZjE[] enumC907700ZjEArr = {enumC907700ZjE, enumC907700ZjE2};
        LL = enumC907700ZjEArr;
        LLILLJJLI = new C2254308sP(enumC907700ZjEArr);
    }

    public static EnumC907700ZjE[] values() {
        return (EnumC907700ZjE[]) LL.clone();
    }

    public static EnumC907700ZjE valueOf(String str) {
        return (EnumC907700ZjE) C08FF.LIZ(EnumC907700ZjE.class, str);
    }

    public EnumC907700ZjE(String str, int i) {
    }
}
