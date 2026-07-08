package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007390cK1 {
    public static final EnumC1007390cK1 ACTIVE;
    public static final C1007400cK2 Companion;
    public static final EnumC1007390cK1 ENDED;
    public static final EnumC1007390cK1 IDLE;
    public static final EnumC1007390cK1 INCOMING;
    public static final /* synthetic */ EnumC1007390cK1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1007390cK1 OUTGOING;

    public static InterfaceC2044707zh<EnumC1007390cK1> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0cK2] */
    static {
        EnumC1007390cK1 enumC1007390cK1 = new EnumC1007390cK1("IDLE", 0);
        IDLE = enumC1007390cK1;
        EnumC1007390cK1 enumC1007390cK12 = new EnumC1007390cK1("OUTGOING", 1);
        OUTGOING = enumC1007390cK12;
        EnumC1007390cK1 enumC1007390cK13 = new EnumC1007390cK1("INCOMING", 2);
        INCOMING = enumC1007390cK13;
        EnumC1007390cK1 enumC1007390cK14 = new EnumC1007390cK1("ACTIVE", 3);
        ACTIVE = enumC1007390cK14;
        EnumC1007390cK1 enumC1007390cK15 = new EnumC1007390cK1("ENDED", 4);
        ENDED = enumC1007390cK15;
        EnumC1007390cK1[] enumC1007390cK1Arr = {enumC1007390cK1, enumC1007390cK12, enumC1007390cK13, enumC1007390cK14, enumC1007390cK15};
        LL = enumC1007390cK1Arr;
        LLILLJJLI = new C2254308sP(enumC1007390cK1Arr);
        Companion = new Object() { // from class: X.0cK2
        };
    }

    public static EnumC1007390cK1[] values() {
        return (EnumC1007390cK1[]) LL.clone();
    }

    public static EnumC1007390cK1 valueOf(String str) {
        return (EnumC1007390cK1) C08FF.LIZ(EnumC1007390cK1.class, str);
    }

    public EnumC1007390cK1(String str, int i) {
    }
}
