package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20537615Xy {
    public static final EnumC20537615Xy CHILD;
    public static final /* synthetic */ EnumC20537615Xy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20537615Xy NONE;
    public static final EnumC20537615Xy PARENT;
    public static final EnumC20537615Xy UNLINK_LOCKED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20537615Xy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20537615Xy enumC20537615Xy = new EnumC20537615Xy("UNLINK_LOCKED", 0, 4);
        UNLINK_LOCKED = enumC20537615Xy;
        EnumC20537615Xy enumC20537615Xy2 = new EnumC20537615Xy("PARENT", 1, 3);
        PARENT = enumC20537615Xy2;
        EnumC20537615Xy enumC20537615Xy3 = new EnumC20537615Xy("CHILD", 2, 2);
        CHILD = enumC20537615Xy3;
        EnumC20537615Xy enumC20537615Xy4 = new EnumC20537615Xy("NONE", 3, 1);
        NONE = enumC20537615Xy4;
        EnumC20537615Xy[] enumC20537615XyArr = {enumC20537615Xy, enumC20537615Xy2, enumC20537615Xy3, enumC20537615Xy4};
        LLILLJJLI = enumC20537615XyArr;
        LLILLL = new C2254308sP(enumC20537615XyArr);
    }

    public static EnumC20537615Xy[] values() {
        return (EnumC20537615Xy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20537615Xy valueOf(String str) {
        return (EnumC20537615Xy) C08FF.LIZ(EnumC20537615Xy.class, str);
    }

    public EnumC20537615Xy(String str, int i, int i2) {
        this.LL = i2;
    }
}
