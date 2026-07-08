package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC810690Vr9 {
    public static final EnumC810690Vr9 AVAILABLE;
    public static final /* synthetic */ EnumC810690Vr9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC810690Vr9 UNAVAILABLE;
    public static final EnumC810690Vr9 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC810690Vr9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC810690Vr9 enumC810690Vr9 = new EnumC810690Vr9("UNKNOWN", 0, -1);
        UNKNOWN = enumC810690Vr9;
        EnumC810690Vr9 enumC810690Vr92 = new EnumC810690Vr9("UNAVAILABLE", 1, 0);
        UNAVAILABLE = enumC810690Vr92;
        EnumC810690Vr9 enumC810690Vr93 = new EnumC810690Vr9("AVAILABLE", 2, 1);
        AVAILABLE = enumC810690Vr93;
        EnumC810690Vr9[] enumC810690Vr9Arr = {enumC810690Vr9, enumC810690Vr92, enumC810690Vr93};
        LLILLJJLI = enumC810690Vr9Arr;
        LLILLL = new C2254308sP(enumC810690Vr9Arr);
    }

    public static EnumC810690Vr9[] values() {
        return (EnumC810690Vr9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC810690Vr9 valueOf(String str) {
        return (EnumC810690Vr9) C08FF.LIZ(EnumC810690Vr9.class, str);
    }

    public EnumC810690Vr9(String str, int i, int i2) {
        this.LL = i2;
    }
}
