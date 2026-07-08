package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1593030rYb {
    public static final /* synthetic */ EnumC1593030rYb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1593030rYb SELECT;
    public static final EnumC1593030rYb UNSELECT;

    public static InterfaceC2044707zh<EnumC1593030rYb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1593030rYb enumC1593030rYb = new EnumC1593030rYb("SELECT", 0);
        SELECT = enumC1593030rYb;
        EnumC1593030rYb enumC1593030rYb2 = new EnumC1593030rYb("UNSELECT", 1);
        UNSELECT = enumC1593030rYb2;
        EnumC1593030rYb[] enumC1593030rYbArr = {enumC1593030rYb, enumC1593030rYb2};
        LL = enumC1593030rYbArr;
        LLILLJJLI = new C2254308sP(enumC1593030rYbArr);
    }

    public static EnumC1593030rYb[] values() {
        return (EnumC1593030rYb[]) LL.clone();
    }

    public static EnumC1593030rYb valueOf(String str) {
        return (EnumC1593030rYb) C08FF.LIZ(EnumC1593030rYb.class, str);
    }

    public EnumC1593030rYb(String str, int i) {
    }
}
