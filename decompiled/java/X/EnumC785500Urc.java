package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Urc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC785500Urc {
    public static final EnumC785500Urc CONTAINER_VIEW;
    public static final /* synthetic */ EnumC785500Urc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC785500Urc PADDING_ONLY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC785500Urc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC785500Urc enumC785500Urc = new EnumC785500Urc("CONTAINER_VIEW", 0, 0);
        CONTAINER_VIEW = enumC785500Urc;
        EnumC785500Urc enumC785500Urc2 = new EnumC785500Urc("PADDING_ONLY", 1, 1);
        PADDING_ONLY = enumC785500Urc2;
        EnumC785500Urc[] enumC785500UrcArr = {enumC785500Urc, enumC785500Urc2};
        LLILLJJLI = enumC785500UrcArr;
        LLILLL = new C2254308sP(enumC785500UrcArr);
    }

    public static EnumC785500Urc[] values() {
        return (EnumC785500Urc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC785500Urc valueOf(String str) {
        return (EnumC785500Urc) C08FF.LIZ(EnumC785500Urc.class, str);
    }

    public EnumC785500Urc(String str, int i, int i2) {
        this.LL = i2;
    }
}
