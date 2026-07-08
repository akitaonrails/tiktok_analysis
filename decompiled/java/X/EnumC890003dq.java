package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC890003dq {
    public static final EnumC890003dq BOTTOM;
    public static final EnumC890003dq CENTER;
    public static final /* synthetic */ EnumC890003dq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC890003dq TOP;

    public static InterfaceC2044707zh<EnumC890003dq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC890003dq enumC890003dq = new EnumC890003dq("TOP", 0);
        TOP = enumC890003dq;
        EnumC890003dq enumC890003dq2 = new EnumC890003dq("CENTER", 1);
        CENTER = enumC890003dq2;
        EnumC890003dq enumC890003dq3 = new EnumC890003dq("BOTTOM", 2);
        BOTTOM = enumC890003dq3;
        EnumC890003dq[] enumC890003dqArr = {enumC890003dq, enumC890003dq2, enumC890003dq3};
        LL = enumC890003dqArr;
        LLILLJJLI = new C2254308sP(enumC890003dqArr);
    }

    public static EnumC890003dq[] values() {
        return (EnumC890003dq[]) LL.clone();
    }

    public static EnumC890003dq valueOf(String str) {
        return (EnumC890003dq) C08FF.LIZ(EnumC890003dq.class, str);
    }

    public EnumC890003dq(String str, int i) {
    }
}
