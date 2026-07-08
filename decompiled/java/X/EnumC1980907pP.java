package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1980907pP {
    public static final EnumC1980907pP LL;
    public static final EnumC1980907pP LLILLJJLI;
    public static final /* synthetic */ EnumC1980907pP[] LLILLL;

    static {
        EnumC1980907pP enumC1980907pP = new EnumC1980907pP("URL", 0);
        LL = enumC1980907pP;
        EnumC1980907pP enumC1980907pP2 = new EnumC1980907pP("SCHEMA", 1);
        LLILLJJLI = enumC1980907pP2;
        EnumC1980907pP[] enumC1980907pPArr = {enumC1980907pP, enumC1980907pP2};
        LLILLL = enumC1980907pPArr;
        new C2254308sP(enumC1980907pPArr);
    }

    public static EnumC1980907pP[] values() {
        return (EnumC1980907pP[]) LLILLL.clone();
    }

    public static EnumC1980907pP valueOf(String str) {
        return (EnumC1980907pP) C08FF.LIZ(EnumC1980907pP.class, str);
    }

    public EnumC1980907pP(String str, int i) {
    }
}
