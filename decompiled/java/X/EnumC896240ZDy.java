package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC896240ZDy {
    public static final EnumC896240ZDy CLICK;
    public static final /* synthetic */ EnumC896240ZDy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC896240ZDy SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC896240ZDy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC896240ZDy enumC896240ZDy = new EnumC896240ZDy("CLICK", 0, "click");
        CLICK = enumC896240ZDy;
        EnumC896240ZDy enumC896240ZDy2 = new EnumC896240ZDy("SHOW", 1, "show");
        SHOW = enumC896240ZDy2;
        EnumC896240ZDy[] enumC896240ZDyArr = {enumC896240ZDy, enumC896240ZDy2};
        LLILLJJLI = enumC896240ZDyArr;
        LLILLL = new C2254308sP(enumC896240ZDyArr);
    }

    public static EnumC896240ZDy[] values() {
        return (EnumC896240ZDy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC896240ZDy valueOf(String str) {
        return (EnumC896240ZDy) C08FF.LIZ(EnumC896240ZDy.class, str);
    }

    public EnumC896240ZDy(String str, int i, String str2) {
        this.LL = str2;
    }
}
