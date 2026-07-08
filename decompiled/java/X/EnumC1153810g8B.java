package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153810g8B {
    public static final EnumC1153810g8B BUFFER;
    public static final C1153820g8C Companion;
    public static final /* synthetic */ EnumC1153810g8B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153810g8B RENDER_FIRST_FRAME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153810g8B> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0g8C] */
    static {
        EnumC1153810g8B enumC1153810g8B = new EnumC1153810g8B("RENDER_FIRST_FRAME", 0, 0);
        RENDER_FIRST_FRAME = enumC1153810g8B;
        EnumC1153810g8B enumC1153810g8B2 = new EnumC1153810g8B("BUFFER", 1, 1);
        BUFFER = enumC1153810g8B2;
        EnumC1153810g8B[] enumC1153810g8BArr = {enumC1153810g8B, enumC1153810g8B2};
        LLILLJJLI = enumC1153810g8BArr;
        LLILLL = new C2254308sP(enumC1153810g8BArr);
        Companion = new Object() { // from class: X.0g8C
        };
    }

    public static EnumC1153810g8B[] values() {
        return (EnumC1153810g8B[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153810g8B valueOf(String str) {
        return (EnumC1153810g8B) C08FF.LIZ(EnumC1153810g8B.class, str);
    }

    public EnumC1153810g8B(String str, int i, int i2) {
        this.LL = i2;
    }
}
