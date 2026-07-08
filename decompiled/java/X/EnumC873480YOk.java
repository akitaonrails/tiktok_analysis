package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC873480YOk {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC873480YOk[] $VALUES;
    public static final EnumC873480YOk PARALLEL = new EnumC873480YOk("PARALLEL", 0);
    public static final EnumC873480YOk IN_ORDER = new EnumC873480YOk("IN_ORDER", 1);

    public static final /* synthetic */ EnumC873480YOk[] $values() {
        return new EnumC873480YOk[]{PARALLEL, IN_ORDER};
    }

    public static InterfaceC2044707zh<EnumC873480YOk> getEntries() {
        return $ENTRIES;
    }

    static {
        EnumC873480YOk[] enumC873480YOkArr$values = $values();
        $VALUES = enumC873480YOkArr$values;
        $ENTRIES = new C2254308sP(enumC873480YOkArr$values);
    }

    public static EnumC873480YOk[] values() {
        return (EnumC873480YOk[]) $VALUES.clone();
    }

    public static EnumC873480YOk valueOf(String str) {
        return (EnumC873480YOk) C08FF.LIZ(EnumC873480YOk.class, str);
    }

    public EnumC873480YOk(String str, int i) {
    }
}
