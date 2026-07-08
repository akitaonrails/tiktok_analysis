package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19731112Ht {
    public static final EnumC19731112Ht ALL;
    public static final EnumC19731112Ht CUR;
    public static final EnumC19731112Ht FEMALE;
    public static final /* synthetic */ EnumC19731112Ht[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19731112Ht MALE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19731112Ht> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19731112Ht enumC19731112Ht = new EnumC19731112Ht("MALE", 0, CardStruct.IStatusCode.DEFAULT);
        MALE = enumC19731112Ht;
        EnumC19731112Ht enumC19731112Ht2 = new EnumC19731112Ht("FEMALE", 1, "1");
        FEMALE = enumC19731112Ht2;
        EnumC19731112Ht enumC19731112Ht3 = new EnumC19731112Ht("ALL", 2, "2");
        ALL = enumC19731112Ht3;
        EnumC19731112Ht enumC19731112Ht4 = new EnumC19731112Ht("CUR", 3, "-1");
        CUR = enumC19731112Ht4;
        EnumC19731112Ht[] enumC19731112HtArr = {enumC19731112Ht, enumC19731112Ht2, enumC19731112Ht3, enumC19731112Ht4};
        LLILLJJLI = enumC19731112HtArr;
        LLILLL = new C2254308sP(enumC19731112HtArr);
    }

    public static EnumC19731112Ht[] values() {
        return (EnumC19731112Ht[]) LLILLJJLI.clone();
    }

    public final String getFlag() {
        return this.LL;
    }

    public static EnumC19731112Ht valueOf(String str) {
        return (EnumC19731112Ht) C08FF.LIZ(EnumC19731112Ht.class, str);
    }

    public EnumC19731112Ht(String str, int i, String str2) {
        this.LL = str2;
    }
}
