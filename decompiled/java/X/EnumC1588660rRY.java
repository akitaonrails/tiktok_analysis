package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1588660rRY {
    public static final C1588670rRZ Companion;
    public static final EnumC1588660rRY FOLLOWING;
    public static final EnumC1588660rRY FOR_YOU;
    public static final EnumC1588660rRY FRIEND;
    public static final EnumC1588660rRY LIVE;
    public static final /* synthetic */ EnumC1588660rRY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1588660rRY STEM;
    public static final EnumC1588660rRY UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1588660rRY> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0rRZ] */
    static {
        EnumC1588660rRY enumC1588660rRY = new EnumC1588660rRY("FOR_YOU", 0, 0);
        FOR_YOU = enumC1588660rRY;
        EnumC1588660rRY enumC1588660rRY2 = new EnumC1588660rRY("FOLLOWING", 1, 1);
        FOLLOWING = enumC1588660rRY2;
        EnumC1588660rRY enumC1588660rRY3 = new EnumC1588660rRY("STEM", 2, 2);
        STEM = enumC1588660rRY3;
        EnumC1588660rRY enumC1588660rRY4 = new EnumC1588660rRY("LIVE", 3, 3);
        LIVE = enumC1588660rRY4;
        EnumC1588660rRY enumC1588660rRY5 = new EnumC1588660rRY("FRIEND", 4, 4);
        FRIEND = enumC1588660rRY5;
        EnumC1588660rRY enumC1588660rRY6 = new EnumC1588660rRY("UNKNOWN", 5, 5);
        UNKNOWN = enumC1588660rRY6;
        EnumC1588660rRY[] enumC1588660rRYArr = {enumC1588660rRY, enumC1588660rRY2, enumC1588660rRY3, enumC1588660rRY4, enumC1588660rRY5, enumC1588660rRY6};
        LLILLJJLI = enumC1588660rRYArr;
        LLILLL = new C2254308sP(enumC1588660rRYArr);
        Companion = new Object() { // from class: X.0rRZ
        };
    }

    public static EnumC1588660rRY[] values() {
        return (EnumC1588660rRY[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1588660rRY valueOf(String str) {
        return (EnumC1588660rRY) C08FF.LIZ(EnumC1588660rRY.class, str);
    }

    public EnumC1588660rRY(String str, int i, int i2) {
        this.LL = i2;
    }
}
