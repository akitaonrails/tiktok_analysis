package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429210GsJ {
    public static final EnumC429210GsJ LL;
    public static final EnumC429210GsJ LLILLJJLI;
    public static final /* synthetic */ EnumC429210GsJ[] LLILLL;

    static {
        EnumC429210GsJ enumC429210GsJ = new EnumC429210GsJ("SPEECH_BUBBLE", 0);
        LL = enumC429210GsJ;
        EnumC429210GsJ enumC429210GsJ2 = new EnumC429210GsJ("NOTE_GUIDE", 1);
        LLILLJJLI = enumC429210GsJ2;
        EnumC429210GsJ[] enumC429210GsJArr = {enumC429210GsJ, enumC429210GsJ2};
        LLILLL = enumC429210GsJArr;
        new C2254308sP(enumC429210GsJArr);
    }

    public static EnumC429210GsJ[] values() {
        return (EnumC429210GsJ[]) LLILLL.clone();
    }

    public static EnumC429210GsJ valueOf(String str) {
        return (EnumC429210GsJ) C08FF.LIZ(EnumC429210GsJ.class, str);
    }

    public EnumC429210GsJ(String str, int i) {
    }
}
