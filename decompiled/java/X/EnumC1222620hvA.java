package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222620hvA {
    public static final EnumC1222620hvA DARK;
    public static final EnumC1222620hvA LIGHT;
    public static final /* synthetic */ EnumC1222620hvA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1222620hvA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222620hvA enumC1222620hvA = new EnumC1222620hvA("DARK", 0, CardStruct.IStatusCode.DEFAULT);
        DARK = enumC1222620hvA;
        EnumC1222620hvA enumC1222620hvA2 = new EnumC1222620hvA("LIGHT", 1, "1");
        LIGHT = enumC1222620hvA2;
        EnumC1222620hvA[] enumC1222620hvAArr = {enumC1222620hvA, enumC1222620hvA2};
        LLILLJJLI = enumC1222620hvAArr;
        LLILLL = new C2254308sP(enumC1222620hvAArr);
    }

    public static EnumC1222620hvA[] values() {
        return (EnumC1222620hvA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1222620hvA valueOf(String str) {
        return (EnumC1222620hvA) C08FF.LIZ(EnumC1222620hvA.class, str);
    }

    public EnumC1222620hvA(String str, int i, String str2) {
        this.LL = str2;
    }
}
