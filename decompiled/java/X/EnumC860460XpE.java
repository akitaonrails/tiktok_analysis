package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC860460XpE {
    public static final EnumC860460XpE ANIM;
    public static final EnumC860460XpE COMMON;
    public static final /* synthetic */ EnumC860460XpE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC860460XpE PAGE;
    public static final EnumC860460XpE SCROLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC860460XpE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC860460XpE enumC860460XpE = new EnumC860460XpE("ANIM", 0, 0);
        ANIM = enumC860460XpE;
        EnumC860460XpE enumC860460XpE2 = new EnumC860460XpE("COMMON", 1, 1);
        COMMON = enumC860460XpE2;
        EnumC860460XpE enumC860460XpE3 = new EnumC860460XpE("SCROLL", 2, 2);
        SCROLL = enumC860460XpE3;
        EnumC860460XpE enumC860460XpE4 = new EnumC860460XpE("PAGE", 3, 3);
        PAGE = enumC860460XpE4;
        EnumC860460XpE[] enumC860460XpEArr = {enumC860460XpE, enumC860460XpE2, enumC860460XpE3, enumC860460XpE4};
        LLILLJJLI = enumC860460XpEArr;
        LLILLL = new C2254308sP(enumC860460XpEArr);
    }

    public static EnumC860460XpE[] values() {
        return (EnumC860460XpE[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC860460XpE valueOf(String str) {
        return (EnumC860460XpE) C08FF.LIZ(EnumC860460XpE.class, str);
    }

    public EnumC860460XpE(String str, int i, int i2) {
        this.LL = i2;
    }
}
