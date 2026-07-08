package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562200M3e {
    public static final EnumC562200M3e FIRST_SAVE_TIME;
    public static final EnumC562200M3e FREE_UP_SPACE;
    public static final EnumC562200M3e LAST_SAVE_TIME;
    public static final /* synthetic */ EnumC562200M3e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC562200M3e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562200M3e enumC562200M3e = new EnumC562200M3e("FIRST_SAVE_TIME", 0);
        FIRST_SAVE_TIME = enumC562200M3e;
        EnumC562200M3e enumC562200M3e2 = new EnumC562200M3e("LAST_SAVE_TIME", 1);
        LAST_SAVE_TIME = enumC562200M3e2;
        EnumC562200M3e enumC562200M3e3 = new EnumC562200M3e("FREE_UP_SPACE", 2);
        FREE_UP_SPACE = enumC562200M3e3;
        EnumC562200M3e[] enumC562200M3eArr = {enumC562200M3e, enumC562200M3e2, enumC562200M3e3};
        LL = enumC562200M3eArr;
        LLILLJJLI = new C2254308sP(enumC562200M3eArr);
    }

    public static EnumC562200M3e[] values() {
        return (EnumC562200M3e[]) LL.clone();
    }

    public static EnumC562200M3e valueOf(String str) {
        return (EnumC562200M3e) C08FF.LIZ(EnumC562200M3e.class, str);
    }

    public EnumC562200M3e(String str, int i) {
    }
}
