package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC714820S2e {
    public static final /* synthetic */ EnumC714820S2e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC714820S2e MULTI;
    public static final EnumC714820S2e SINGLE;

    public static InterfaceC2044707zh<EnumC714820S2e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC714820S2e enumC714820S2e = new EnumC714820S2e("SINGLE", 0);
        SINGLE = enumC714820S2e;
        EnumC714820S2e enumC714820S2e2 = new EnumC714820S2e("MULTI", 1);
        MULTI = enumC714820S2e2;
        EnumC714820S2e[] enumC714820S2eArr = {enumC714820S2e, enumC714820S2e2};
        LL = enumC714820S2eArr;
        LLILLJJLI = new C2254308sP(enumC714820S2eArr);
    }

    public static EnumC714820S2e[] values() {
        return (EnumC714820S2e[]) LL.clone();
    }

    public static EnumC714820S2e valueOf(String str) {
        return (EnumC714820S2e) C08FF.LIZ(EnumC714820S2e.class, str);
    }

    public EnumC714820S2e(String str, int i) {
    }
}
