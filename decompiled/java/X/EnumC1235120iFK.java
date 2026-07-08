package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235120iFK {
    public static final EnumC1235120iFK DIGITAL_0;
    public static final EnumC1235120iFK DIGITAL_1;
    public static final /* synthetic */ EnumC1235120iFK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235120iFK NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235120iFK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235120iFK enumC1235120iFK = new EnumC1235120iFK("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = enumC1235120iFK;
        EnumC1235120iFK enumC1235120iFK2 = new EnumC1235120iFK("DIGITAL_1", 1, "1");
        DIGITAL_1 = enumC1235120iFK2;
        EnumC1235120iFK enumC1235120iFK3 = new EnumC1235120iFK("NULL", 2, "null");
        NULL = enumC1235120iFK3;
        EnumC1235120iFK[] enumC1235120iFKArr = {enumC1235120iFK, enumC1235120iFK2, enumC1235120iFK3};
        LLILLJJLI = enumC1235120iFKArr;
        LLILLL = new C2254308sP(enumC1235120iFKArr);
    }

    public static EnumC1235120iFK[] values() {
        return (EnumC1235120iFK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235120iFK valueOf(String str) {
        return (EnumC1235120iFK) C08FF.LIZ(EnumC1235120iFK.class, str);
    }

    public EnumC1235120iFK(String str, int i, String str2) {
        this.LL = str2;
    }
}
