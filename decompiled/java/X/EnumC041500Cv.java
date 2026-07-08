package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC041500Cv {
    public static final /* synthetic */ EnumC041500Cv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC041500Cv SCROLL;

    public static InterfaceC2044707zh<EnumC041500Cv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC041500Cv enumC041500Cv = new EnumC041500Cv();
        SCROLL = enumC041500Cv;
        EnumC041500Cv[] enumC041500CvArr = {enumC041500Cv};
        LL = enumC041500CvArr;
        LLILLJJLI = new C2254308sP(enumC041500CvArr);
    }

    public static EnumC041500Cv[] values() {
        return (EnumC041500Cv[]) LL.clone();
    }

    public static EnumC041500Cv valueOf(String str) {
        return (EnumC041500Cv) C08FF.LIZ(EnumC041500Cv.class, str);
    }
}
