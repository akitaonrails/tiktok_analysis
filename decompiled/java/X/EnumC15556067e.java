package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.067e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15556067e {
    public static final /* synthetic */ EnumC15556067e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC15556067e PUSH_STATUS_OFF;
    public static final EnumC15556067e PUSH_STATUS_ON;
    public static final EnumC15556067e PUSH_STATUS_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC15556067e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC15556067e enumC15556067e = new EnumC15556067e("PUSH_STATUS_UNKNOWN", 0, 0);
        PUSH_STATUS_UNKNOWN = enumC15556067e;
        EnumC15556067e enumC15556067e2 = new EnumC15556067e("PUSH_STATUS_ON", 1, 1);
        PUSH_STATUS_ON = enumC15556067e2;
        EnumC15556067e enumC15556067e3 = new EnumC15556067e("PUSH_STATUS_OFF", 2, 2);
        PUSH_STATUS_OFF = enumC15556067e3;
        EnumC15556067e[] enumC15556067eArr = {enumC15556067e, enumC15556067e2, enumC15556067e3};
        LLILLJJLI = enumC15556067eArr;
        LLILLL = new C2254308sP(enumC15556067eArr);
    }

    public static EnumC15556067e[] values() {
        return (EnumC15556067e[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC15556067e valueOf(String str) {
        return (EnumC15556067e) C08FF.LIZ(EnumC15556067e.class, str);
    }

    public EnumC15556067e(String str, int i, int i2) {
        this.LL = i2;
    }
}
