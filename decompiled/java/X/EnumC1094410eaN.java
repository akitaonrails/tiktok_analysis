package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094410eaN {
    public static final C1094420eaO Companion;
    public static final /* synthetic */ EnumC1094410eaN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1094410eaN USER_LEVEL_SWITCH_STATUS_HIDE;
    public static final EnumC1094410eaN USER_LEVEL_SWITCH_STATUS_OFF;
    public static final EnumC1094410eaN USER_LEVEL_SWITCH_STATUS_ON;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1094410eaN> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0eaO] */
    static {
        EnumC1094410eaN enumC1094410eaN = new EnumC1094410eaN("USER_LEVEL_SWITCH_STATUS_HIDE", 0, 0L);
        USER_LEVEL_SWITCH_STATUS_HIDE = enumC1094410eaN;
        EnumC1094410eaN enumC1094410eaN2 = new EnumC1094410eaN("USER_LEVEL_SWITCH_STATUS_ON", 1, 1L);
        USER_LEVEL_SWITCH_STATUS_ON = enumC1094410eaN2;
        EnumC1094410eaN enumC1094410eaN3 = new EnumC1094410eaN("USER_LEVEL_SWITCH_STATUS_OFF", 2, 2L);
        USER_LEVEL_SWITCH_STATUS_OFF = enumC1094410eaN3;
        EnumC1094410eaN[] enumC1094410eaNArr = {enumC1094410eaN, enumC1094410eaN2, enumC1094410eaN3};
        LLILLJJLI = enumC1094410eaNArr;
        LLILLL = new C2254308sP(enumC1094410eaNArr);
        Companion = new Object() { // from class: X.0eaO
        };
    }

    public static EnumC1094410eaN[] values() {
        return (EnumC1094410eaN[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1094410eaN valueOf(String str) {
        return (EnumC1094410eaN) C08FF.LIZ(EnumC1094410eaN.class, str);
    }

    public EnumC1094410eaN(String str, int i, long j) {
        this.LL = j;
    }
}
