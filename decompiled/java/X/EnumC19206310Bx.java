package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19206310Bx {
    public static final /* synthetic */ EnumC19206310Bx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19206310Bx OTHER;
    public static final EnumC19206310Bx PHOTO;
    public static final EnumC19206310Bx VIDEO;

    public static InterfaceC2044707zh<EnumC19206310Bx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19206310Bx enumC19206310Bx = new EnumC19206310Bx("VIDEO", 0);
        VIDEO = enumC19206310Bx;
        EnumC19206310Bx enumC19206310Bx2 = new EnumC19206310Bx("PHOTO", 1);
        PHOTO = enumC19206310Bx2;
        EnumC19206310Bx enumC19206310Bx3 = new EnumC19206310Bx("OTHER", 2);
        OTHER = enumC19206310Bx3;
        EnumC19206310Bx[] enumC19206310BxArr = {enumC19206310Bx, enumC19206310Bx2, enumC19206310Bx3};
        LL = enumC19206310BxArr;
        LLILLJJLI = new C2254308sP(enumC19206310BxArr);
    }

    public static EnumC19206310Bx[] values() {
        return (EnumC19206310Bx[]) LL.clone();
    }

    public static EnumC19206310Bx valueOf(String str) {
        return (EnumC19206310Bx) C08FF.LIZ(EnumC19206310Bx.class, str);
    }

    public EnumC19206310Bx(String str, int i) {
    }
}
