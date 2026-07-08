package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1086010eMp {
    public static final /* synthetic */ EnumC1086010eMp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1086010eMp NEW_USER;
    public static final EnumC1086010eMp NOT_LOGIN;
    public static final EnumC1086010eMp NOT_NEW_USER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1086010eMp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1086010eMp enumC1086010eMp = new EnumC1086010eMp("NOT_LOGIN", 0, CardStruct.IStatusCode.DEFAULT);
        NOT_LOGIN = enumC1086010eMp;
        EnumC1086010eMp enumC1086010eMp2 = new EnumC1086010eMp("NEW_USER", 1, "1");
        NEW_USER = enumC1086010eMp2;
        EnumC1086010eMp enumC1086010eMp3 = new EnumC1086010eMp("NOT_NEW_USER", 2, "2");
        NOT_NEW_USER = enumC1086010eMp3;
        EnumC1086010eMp[] enumC1086010eMpArr = {enumC1086010eMp, enumC1086010eMp2, enumC1086010eMp3};
        LLILLJJLI = enumC1086010eMpArr;
        LLILLL = new C2254308sP(enumC1086010eMpArr);
    }

    public static EnumC1086010eMp[] values() {
        return (EnumC1086010eMp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1086010eMp valueOf(String str) {
        return (EnumC1086010eMp) C08FF.LIZ(EnumC1086010eMp.class, str);
    }

    public EnumC1086010eMp(String str, int i, String str2) {
        this.LL = str2;
    }
}
