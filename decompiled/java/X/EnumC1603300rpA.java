package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1603300rpA {
    public static final /* synthetic */ EnumC1603300rpA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1603300rpA LOAD_MORE;
    public static final EnumC1603300rpA OPEN;
    public static final EnumC1603300rpA REFRESH;
    public static final EnumC1603300rpA UNKNOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1603300rpA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1603300rpA enumC1603300rpA = new EnumC1603300rpA("UNKNOW", 0, "-1");
        UNKNOW = enumC1603300rpA;
        EnumC1603300rpA enumC1603300rpA2 = new EnumC1603300rpA("OPEN", 1, CardStruct.IStatusCode.DEFAULT);
        OPEN = enumC1603300rpA2;
        EnumC1603300rpA enumC1603300rpA3 = new EnumC1603300rpA("REFRESH", 2, "1");
        REFRESH = enumC1603300rpA3;
        EnumC1603300rpA enumC1603300rpA4 = new EnumC1603300rpA("LOAD_MORE", 3, "2");
        LOAD_MORE = enumC1603300rpA4;
        EnumC1603300rpA[] enumC1603300rpAArr = {enumC1603300rpA, enumC1603300rpA2, enumC1603300rpA3, enumC1603300rpA4};
        LLILLJJLI = enumC1603300rpAArr;
        LLILLL = new C2254308sP(enumC1603300rpAArr);
    }

    public static EnumC1603300rpA[] values() {
        return (EnumC1603300rpA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1603300rpA valueOf(String str) {
        return (EnumC1603300rpA) C08FF.LIZ(EnumC1603300rpA.class, str);
    }

    public EnumC1603300rpA(String str, int i, String str2) {
        this.LL = str2;
    }
}
