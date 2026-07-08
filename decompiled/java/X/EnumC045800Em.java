package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC045800Em {
    public static final EnumC045800Em ADMIN;
    public static final /* synthetic */ EnumC045800Em[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC045800Em MEMBER;
    public static final EnumC045800Em OWNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC045800Em> getEntries() {
        return LLILLL;
    }

    static {
        EnumC045800Em enumC045800Em = new EnumC045800Em("OWNER", 0, "1");
        OWNER = enumC045800Em;
        EnumC045800Em enumC045800Em2 = new EnumC045800Em("ADMIN", 1, "2");
        ADMIN = enumC045800Em2;
        EnumC045800Em enumC045800Em3 = new EnumC045800Em("MEMBER", 2, CardStruct.IStatusCode.DEFAULT);
        MEMBER = enumC045800Em3;
        EnumC045800Em[] enumC045800EmArr = {enumC045800Em, enumC045800Em2, enumC045800Em3};
        LLILLJJLI = enumC045800EmArr;
        LLILLL = new C2254308sP(enumC045800EmArr);
    }

    public static EnumC045800Em[] values() {
        return (EnumC045800Em[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC045800Em valueOf(String str) {
        return (EnumC045800Em) C08FF.LIZ(EnumC045800Em.class, str);
    }

    public EnumC045800Em(String str, int i, String str2) {
        this.LL = str2;
    }
}
