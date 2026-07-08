package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC729410SjL {
    public static final /* synthetic */ EnumC729410SjL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC729410SjL PUBLISH_START;
    public static final EnumC729410SjL RESTORE_SCHEDULE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC729410SjL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC729410SjL enumC729410SjL = new EnumC729410SjL("PUBLISH_START", 0, 1);
        PUBLISH_START = enumC729410SjL;
        EnumC729410SjL enumC729410SjL2 = new EnumC729410SjL("RESTORE_SCHEDULE", 1, 2);
        RESTORE_SCHEDULE = enumC729410SjL2;
        EnumC729410SjL[] enumC729410SjLArr = {enumC729410SjL, enumC729410SjL2};
        LLILLJJLI = enumC729410SjLArr;
        LLILLL = new C2254308sP(enumC729410SjLArr);
    }

    public static EnumC729410SjL[] values() {
        return (EnumC729410SjL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC729410SjL valueOf(String str) {
        return (EnumC729410SjL) C08FF.LIZ(EnumC729410SjL.class, str);
    }

    public EnumC729410SjL(String str, int i, int i2) {
        this.LL = i2;
    }
}
