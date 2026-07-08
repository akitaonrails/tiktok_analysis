package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0alK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC947440alK {
    public static final C947480alO Companion;
    public static final EnumC947440alK FINISH;
    public static final /* synthetic */ EnumC947440alK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC947440alK NONE;
    public static final EnumC947440alK PLAYING;
    public static final EnumC947440alK PREPARING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC947440alK> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0alO] */
    static {
        EnumC947440alK enumC947440alK = new EnumC947440alK("NONE", 0, 0);
        NONE = enumC947440alK;
        EnumC947440alK enumC947440alK2 = new EnumC947440alK("PREPARING", 1, 1);
        PREPARING = enumC947440alK2;
        EnumC947440alK enumC947440alK3 = new EnumC947440alK("PLAYING", 2, 2);
        PLAYING = enumC947440alK3;
        EnumC947440alK enumC947440alK4 = new EnumC947440alK("FINISH", 3, 3);
        FINISH = enumC947440alK4;
        EnumC947440alK[] enumC947440alKArr = {enumC947440alK, enumC947440alK2, enumC947440alK3, enumC947440alK4};
        LLILLJJLI = enumC947440alKArr;
        LLILLL = new C2254308sP(enumC947440alKArr);
        Companion = new Object() { // from class: X.0alO
        };
    }

    public static EnumC947440alK[] values() {
        return (EnumC947440alK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC947440alK valueOf(String str) {
        return (EnumC947440alK) C08FF.LIZ(EnumC947440alK.class, str);
    }

    public EnumC947440alK(String str, int i, int i2) {
        this.LL = i2;
    }
}
