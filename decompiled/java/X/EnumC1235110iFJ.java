package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235110iFJ {
    public static final EnumC1235110iFJ DIGITAL_0;
    public static final EnumC1235110iFJ DIGITAL_1;
    public static final /* synthetic */ EnumC1235110iFJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235110iFJ NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235110iFJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235110iFJ enumC1235110iFJ = new EnumC1235110iFJ("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = enumC1235110iFJ;
        EnumC1235110iFJ enumC1235110iFJ2 = new EnumC1235110iFJ("DIGITAL_1", 1, "1");
        DIGITAL_1 = enumC1235110iFJ2;
        EnumC1235110iFJ enumC1235110iFJ3 = new EnumC1235110iFJ("NULL", 2, "null");
        NULL = enumC1235110iFJ3;
        EnumC1235110iFJ[] enumC1235110iFJArr = {enumC1235110iFJ, enumC1235110iFJ2, enumC1235110iFJ3};
        LLILLJJLI = enumC1235110iFJArr;
        LLILLL = new C2254308sP(enumC1235110iFJArr);
    }

    public static EnumC1235110iFJ[] values() {
        return (EnumC1235110iFJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235110iFJ valueOf(String str) {
        return (EnumC1235110iFJ) C08FF.LIZ(EnumC1235110iFJ.class, str);
    }

    public EnumC1235110iFJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
