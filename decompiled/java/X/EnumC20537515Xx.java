package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20537515Xx {
    public static final EnumC20537515Xx CHILD;
    public static final /* synthetic */ EnumC20537515Xx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20537515Xx NONE;
    public static final EnumC20537515Xx PARENT;
    public static final EnumC20537515Xx UNLINK_LOCKED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20537515Xx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20537515Xx enumC20537515Xx = new EnumC20537515Xx("UNLINK_LOCKED", 0, 4);
        UNLINK_LOCKED = enumC20537515Xx;
        EnumC20537515Xx enumC20537515Xx2 = new EnumC20537515Xx("PARENT", 1, 3);
        PARENT = enumC20537515Xx2;
        EnumC20537515Xx enumC20537515Xx3 = new EnumC20537515Xx("CHILD", 2, 2);
        CHILD = enumC20537515Xx3;
        EnumC20537515Xx enumC20537515Xx4 = new EnumC20537515Xx("NONE", 3, 1);
        NONE = enumC20537515Xx4;
        EnumC20537515Xx[] enumC20537515XxArr = {enumC20537515Xx, enumC20537515Xx2, enumC20537515Xx3, enumC20537515Xx4};
        LLILLJJLI = enumC20537515XxArr;
        LLILLL = new C2254308sP(enumC20537515XxArr);
    }

    public static EnumC20537515Xx[] values() {
        return (EnumC20537515Xx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20537515Xx valueOf(String str) {
        return (EnumC20537515Xx) C08FF.LIZ(EnumC20537515Xx.class, str);
    }

    public EnumC20537515Xx(String str, int i, int i2) {
        this.LL = i2;
    }
}
