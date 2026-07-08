package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20623015mu {
    public static final /* synthetic */ EnumC20623015mu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20623015mu SLOT_CENTER;
    public static final EnumC20623015mu SLOT_LEFT;
    public static final EnumC20623015mu SLOT_RIGHT;

    public static InterfaceC2044707zh<EnumC20623015mu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20623015mu enumC20623015mu = new EnumC20623015mu("SLOT_LEFT", 0);
        SLOT_LEFT = enumC20623015mu;
        EnumC20623015mu enumC20623015mu2 = new EnumC20623015mu("SLOT_CENTER", 1);
        SLOT_CENTER = enumC20623015mu2;
        EnumC20623015mu enumC20623015mu3 = new EnumC20623015mu("SLOT_RIGHT", 2);
        SLOT_RIGHT = enumC20623015mu3;
        EnumC20623015mu[] enumC20623015muArr = {enumC20623015mu, enumC20623015mu2, enumC20623015mu3};
        LL = enumC20623015muArr;
        LLILLJJLI = new C2254308sP(enumC20623015muArr);
    }

    public static EnumC20623015mu[] values() {
        return (EnumC20623015mu[]) LL.clone();
    }

    public static EnumC20623015mu valueOf(String str) {
        return (EnumC20623015mu) C08FF.LIZ(EnumC20623015mu.class, str);
    }

    public EnumC20623015mu(String str, int i) {
    }
}
