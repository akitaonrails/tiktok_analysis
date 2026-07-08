package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919210a1n {
    public static final C919220a1o Companion;
    public static final /* synthetic */ EnumC919210a1n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC919210a1n NONE;
    public static final EnumC919210a1n SUPPORT_MULTI;
    public int LL;

    public static InterfaceC2044707zh<EnumC919210a1n> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0a1o] */
    static {
        EnumC919210a1n enumC919210a1n = new EnumC919210a1n("NONE", 0, 0);
        NONE = enumC919210a1n;
        EnumC919210a1n enumC919210a1n2 = new EnumC919210a1n("SUPPORT_MULTI", 1, 2);
        SUPPORT_MULTI = enumC919210a1n2;
        EnumC919210a1n[] enumC919210a1nArr = {enumC919210a1n, enumC919210a1n2};
        LLILLJJLI = enumC919210a1nArr;
        LLILLL = new C2254308sP(enumC919210a1nArr);
        Companion = new Object() { // from class: X.0a1o
        };
    }

    public static EnumC919210a1n[] values() {
        return (EnumC919210a1n[]) LLILLJJLI.clone();
    }

    public final boolean isMultiCoHost() {
        return this == SUPPORT_MULTI;
    }

    public final int getPermissionType() {
        return this.LL;
    }

    public static EnumC919210a1n valueOf(String str) {
        return (EnumC919210a1n) C08FF.LIZ(EnumC919210a1n.class, str);
    }

    public final void setPermissionType(int i) {
        this.LL = i;
    }

    public EnumC919210a1n(String str, int i, int i2) {
        this.LL = i2;
    }
}
