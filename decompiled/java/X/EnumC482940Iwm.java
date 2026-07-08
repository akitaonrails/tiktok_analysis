package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC482940Iwm {
    public static final EnumC482940Iwm CLOSED;
    public static final /* synthetic */ EnumC482940Iwm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC482940Iwm MOVING;
    public static final EnumC482940Iwm OPENED;
    public static final EnumC482940Iwm SCROLLING;

    public static InterfaceC2044707zh<EnumC482940Iwm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC482940Iwm enumC482940Iwm = new EnumC482940Iwm("OPENED", 0);
        OPENED = enumC482940Iwm;
        EnumC482940Iwm enumC482940Iwm2 = new EnumC482940Iwm("CLOSED", 1);
        CLOSED = enumC482940Iwm2;
        EnumC482940Iwm enumC482940Iwm3 = new EnumC482940Iwm("MOVING", 2);
        MOVING = enumC482940Iwm3;
        EnumC482940Iwm enumC482940Iwm4 = new EnumC482940Iwm("SCROLLING", 3);
        SCROLLING = enumC482940Iwm4;
        EnumC482940Iwm[] enumC482940IwmArr = {enumC482940Iwm, enumC482940Iwm2, enumC482940Iwm3, enumC482940Iwm4};
        LL = enumC482940IwmArr;
        LLILLJJLI = new C2254308sP(enumC482940IwmArr);
    }

    public static EnumC482940Iwm[] values() {
        return (EnumC482940Iwm[]) LL.clone();
    }

    public static EnumC482940Iwm valueOf(String str) {
        return (EnumC482940Iwm) C08FF.LIZ(EnumC482940Iwm.class, str);
    }

    public EnumC482940Iwm(String str, int i) {
    }
}
