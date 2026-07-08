package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01gC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC395001gC {
    public static final EnumC395001gC FADE;
    public static final /* synthetic */ EnumC395001gC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC395001gC SLIDE;
    public final float LL = 0.3f;

    public static InterfaceC2044707zh<EnumC395001gC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC395001gC enumC395001gC = new EnumC395001gC("FADE", 0);
        FADE = enumC395001gC;
        EnumC395001gC enumC395001gC2 = new EnumC395001gC("SLIDE", 1);
        SLIDE = enumC395001gC2;
        EnumC395001gC[] enumC395001gCArr = {enumC395001gC, enumC395001gC2};
        LLILLJJLI = enumC395001gCArr;
        LLILLL = new C2254308sP(enumC395001gCArr);
    }

    public static EnumC395001gC[] values() {
        return (EnumC395001gC[]) LLILLJJLI.clone();
    }

    public final float getDuration() {
        return this.LL;
    }

    public static EnumC395001gC valueOf(String str) {
        return (EnumC395001gC) C08FF.LIZ(EnumC395001gC.class, str);
    }

    public EnumC395001gC(String str, int i) {
    }
}
