package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1668010tVX {
    public static final C1668020tVY Companion;
    public static final EnumC1668010tVX DATING;
    public static final /* synthetic */ EnumC1668010tVX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1668010tVX RANDOM_CHAT;
    public static final EnumC1668010tVX UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1668010tVX> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0tVY] */
    static {
        EnumC1668010tVX enumC1668010tVX = new EnumC1668010tVX("UNKNOWN", 0, 0);
        UNKNOWN = enumC1668010tVX;
        EnumC1668010tVX enumC1668010tVX2 = new EnumC1668010tVX("RANDOM_CHAT", 1, 1);
        RANDOM_CHAT = enumC1668010tVX2;
        EnumC1668010tVX enumC1668010tVX3 = new EnumC1668010tVX("DATING", 2, 2);
        DATING = enumC1668010tVX3;
        EnumC1668010tVX[] enumC1668010tVXArr = {enumC1668010tVX, enumC1668010tVX2, enumC1668010tVX3};
        LLILLJJLI = enumC1668010tVXArr;
        LLILLL = new C2254308sP(enumC1668010tVXArr);
        Companion = new Object() { // from class: X.0tVY
        };
    }

    public static EnumC1668010tVX[] values() {
        return (EnumC1668010tVX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1668010tVX valueOf(String str) {
        return (EnumC1668010tVX) C08FF.LIZ(EnumC1668010tVX.class, str);
    }

    public EnumC1668010tVX(String str, int i, int i2) {
        this.LL = i2;
    }
}
