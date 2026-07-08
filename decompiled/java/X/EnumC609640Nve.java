package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC609640Nve {
    public static final EnumC609640Nve LLILLJJLI;
    public static final EnumC609640Nve LLILLL;
    public static final EnumC609640Nve LLILZ;
    public static final EnumC609640Nve LLILZIL;
    public static final EnumC609640Nve LLILZLL;
    public static final /* synthetic */ EnumC609640Nve[] LLIZ;
    public final String LL;

    static {
        EnumC609640Nve enumC609640Nve = new EnumC609640Nve("UNKNOWN", 0, CardStruct.IStatusCode.DEFAULT);
        LLILLJJLI = enumC609640Nve;
        EnumC609640Nve enumC609640Nve2 = new EnumC609640Nve("NORMAL", 1, "1");
        LLILLL = enumC609640Nve2;
        EnumC609640Nve enumC609640Nve3 = new EnumC609640Nve("MAX_TIMES", 2, "2");
        LLILZ = enumC609640Nve3;
        EnumC609640Nve enumC609640Nve4 = new EnumC609640Nve("INTELLIGENCE_ERROR", 3, "3");
        LLILZIL = enumC609640Nve4;
        EnumC609640Nve enumC609640Nve5 = new EnumC609640Nve("TIME_OUT", 4, "4");
        LLILZLL = enumC609640Nve5;
        EnumC609640Nve[] enumC609640NveArr = {enumC609640Nve, enumC609640Nve2, enumC609640Nve3, enumC609640Nve4, enumC609640Nve5};
        LLIZ = enumC609640NveArr;
        new C2254308sP(enumC609640NveArr);
    }

    public static EnumC609640Nve[] values() {
        return (EnumC609640Nve[]) LLIZ.clone();
    }

    public static EnumC609640Nve valueOf(String str) {
        return (EnumC609640Nve) C08FF.LIZ(EnumC609640Nve.class, str);
    }

    public EnumC609640Nve(String str, int i, String str2) {
        this.LL = str2;
    }
}
