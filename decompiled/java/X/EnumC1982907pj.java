package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1982907pj {
    public static final EnumC1982907pj LL;
    public static final EnumC1982907pj LLILLJJLI;
    public static final /* synthetic */ EnumC1982907pj[] LLILLL;

    static {
        EnumC1982907pj enumC1982907pj = new EnumC1982907pj("ABOVE", 0);
        LL = enumC1982907pj;
        EnumC1982907pj enumC1982907pj2 = new EnumC1982907pj("BELOW", 1);
        LLILLJJLI = enumC1982907pj2;
        EnumC1982907pj[] enumC1982907pjArr = {enumC1982907pj, enumC1982907pj2};
        LLILLL = enumC1982907pjArr;
        new C2254308sP(enumC1982907pjArr);
    }

    public static EnumC1982907pj[] values() {
        return (EnumC1982907pj[]) LLILLL.clone();
    }

    public static EnumC1982907pj valueOf(String str) {
        return (EnumC1982907pj) C08FF.LIZ(EnumC1982907pj.class, str);
    }

    public EnumC1982907pj(String str, int i) {
    }
}
