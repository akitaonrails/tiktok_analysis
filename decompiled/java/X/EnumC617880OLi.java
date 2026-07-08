package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC617880OLi {
    public static final EnumC617880OLi COMPLETE;
    public static final /* synthetic */ EnumC617880OLi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC617880OLi PERFORM;
    public static final EnumC617880OLi PREPARE;

    public static InterfaceC2044707zh<EnumC617880OLi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC617880OLi enumC617880OLi = new EnumC617880OLi("PREPARE", 0);
        PREPARE = enumC617880OLi;
        EnumC617880OLi enumC617880OLi2 = new EnumC617880OLi("PERFORM", 1);
        PERFORM = enumC617880OLi2;
        EnumC617880OLi enumC617880OLi3 = new EnumC617880OLi("COMPLETE", 2);
        COMPLETE = enumC617880OLi3;
        EnumC617880OLi[] enumC617880OLiArr = {enumC617880OLi, enumC617880OLi2, enumC617880OLi3};
        LL = enumC617880OLiArr;
        LLILLJJLI = new C2254308sP(enumC617880OLiArr);
    }

    public static EnumC617880OLi[] values() {
        return (EnumC617880OLi[]) LL.clone();
    }

    public static EnumC617880OLi valueOf(String str) {
        return (EnumC617880OLi) C08FF.LIZ(EnumC617880OLi.class, str);
    }

    public EnumC617880OLi(String str, int i) {
    }
}
