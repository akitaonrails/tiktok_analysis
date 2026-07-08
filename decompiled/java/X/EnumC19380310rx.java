package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19380310rx {
    public static final EnumC19380310rx CHURN;
    public static final C19380410ry Companion;
    public static final EnumC19380310rx HIGH;
    public static final /* synthetic */ EnumC19380310rx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19380310rx MEDIUM_LOW;
    public static final EnumC19380310rx NO_CHAT;
    public static final EnumC19380310rx UNUSED;
    public final int LL;

    public static final EnumC19380310rx fromTtm(int i, int i2) {
        Companion.getClass();
        return C19380410ry.LIZ(i, i2);
    }

    public static InterfaceC2044707zh<EnumC19380310rx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19380310rx enumC19380310rx = new EnumC19380310rx("UNUSED", 0, 0);
        UNUSED = enumC19380310rx;
        EnumC19380310rx enumC19380310rx2 = new EnumC19380310rx("NO_CHAT", 1, 1);
        NO_CHAT = enumC19380310rx2;
        EnumC19380310rx enumC19380310rx3 = new EnumC19380310rx("CHURN", 2, 2);
        CHURN = enumC19380310rx3;
        EnumC19380310rx enumC19380310rx4 = new EnumC19380310rx("MEDIUM_LOW", 3, 3);
        MEDIUM_LOW = enumC19380310rx4;
        EnumC19380310rx enumC19380310rx5 = new EnumC19380310rx("HIGH", 4, 4);
        HIGH = enumC19380310rx5;
        EnumC19380310rx[] enumC19380310rxArr = {enumC19380310rx, enumC19380310rx2, enumC19380310rx3, enumC19380310rx4, enumC19380310rx5};
        LLILLJJLI = enumC19380310rxArr;
        LLILLL = new C2254308sP(enumC19380310rxArr);
        Companion = new C19380410ry();
    }

    public static EnumC19380310rx[] values() {
        return (EnumC19380310rx[]) LLILLJJLI.clone();
    }

    public final int getLevel() {
        return this.LL;
    }

    public static final EnumC19380310rx fromLevel(int i) {
        Companion.getClass();
        for (EnumC19380310rx enumC19380310rx : values()) {
            if (enumC19380310rx.getLevel() == i) {
                return enumC19380310rx;
            }
        }
        return null;
    }

    public static EnumC19380310rx valueOf(String str) {
        return (EnumC19380310rx) C08FF.LIZ(EnumC19380310rx.class, str);
    }

    public EnumC19380310rx(String str, int i, int i2) {
        this.LL = i2;
    }
}
