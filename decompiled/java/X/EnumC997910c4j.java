package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC997910c4j {
    public static final /* synthetic */ EnumC997910c4j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC997910c4j NORMAL;
    public static final EnumC997910c4j PURE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC997910c4j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC997910c4j enumC997910c4j = new EnumC997910c4j("NORMAL", 0, CardStruct.IStatusCode.DEFAULT);
        NORMAL = enumC997910c4j;
        EnumC997910c4j enumC997910c4j2 = new EnumC997910c4j("PURE", 1, "1");
        PURE = enumC997910c4j2;
        EnumC997910c4j[] enumC997910c4jArr = {enumC997910c4j, enumC997910c4j2};
        LLILLJJLI = enumC997910c4jArr;
        LLILLL = new C2254308sP(enumC997910c4jArr);
    }

    public static EnumC997910c4j[] values() {
        return (EnumC997910c4j[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC997910c4j valueOf(String str) {
        return (EnumC997910c4j) C08FF.LIZ(EnumC997910c4j.class, str);
    }

    public EnumC997910c4j(String str, int i, String str2) {
        this.LL = str2;
    }
}
