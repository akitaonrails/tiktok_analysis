package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19282510cB {
    public static final C19282810cE Companion;
    public static final /* synthetic */ EnumC19282510cB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19282510cB LOW_ACTIVE_30_2;
    public static final EnumC19282510cB LOW_ACTIVE_30_9;
    public static final EnumC19282510cB NORMAL;
    public static final EnumC19282510cB RECORD_LESS_30;
    public static final EnumC19282510cB RETURN_USER;

    public static InterfaceC2044707zh<EnumC19282510cB> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.10cE] */
    static {
        EnumC19282510cB enumC19282510cB = new EnumC19282510cB("RECORD_LESS_30", 0);
        RECORD_LESS_30 = enumC19282510cB;
        EnumC19282510cB enumC19282510cB2 = new EnumC19282510cB("NORMAL", 1);
        NORMAL = enumC19282510cB2;
        EnumC19282510cB enumC19282510cB3 = new EnumC19282510cB("RETURN_USER", 2);
        RETURN_USER = enumC19282510cB3;
        EnumC19282510cB enumC19282510cB4 = new EnumC19282510cB("LOW_ACTIVE_30_9", 3);
        LOW_ACTIVE_30_9 = enumC19282510cB4;
        EnumC19282510cB enumC19282510cB5 = new EnumC19282510cB("LOW_ACTIVE_30_2", 4);
        LOW_ACTIVE_30_2 = enumC19282510cB5;
        EnumC19282510cB[] enumC19282510cBArr = {enumC19282510cB, enumC19282510cB2, enumC19282510cB3, enumC19282510cB4, enumC19282510cB5};
        LL = enumC19282510cBArr;
        LLILLJJLI = new C2254308sP(enumC19282510cBArr);
        Companion = new Object() { // from class: X.10cE
        };
    }

    public static EnumC19282510cB[] values() {
        return (EnumC19282510cB[]) LL.clone();
    }

    public static EnumC19282510cB valueOf(String str) {
        return (EnumC19282510cB) C08FF.LIZ(EnumC19282510cB.class, str);
    }

    public EnumC19282510cB(String str, int i) {
    }
}
