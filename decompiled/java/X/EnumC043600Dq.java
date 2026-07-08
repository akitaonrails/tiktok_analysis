package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043600Dq {
    public static final /* synthetic */ EnumC043600Dq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC043600Dq NET_NEW;
    public static final EnumC043600Dq REINSTALL;
    public static final EnumC043600Dq UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC043600Dq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC043600Dq enumC043600Dq = new EnumC043600Dq("UNKNOWN", 0, CardStruct.IStatusCode.DEFAULT);
        UNKNOWN = enumC043600Dq;
        EnumC043600Dq enumC043600Dq2 = new EnumC043600Dq("REINSTALL", 1, "1");
        REINSTALL = enumC043600Dq2;
        EnumC043600Dq enumC043600Dq3 = new EnumC043600Dq("NET_NEW", 2, "2");
        NET_NEW = enumC043600Dq3;
        EnumC043600Dq[] enumC043600DqArr = {enumC043600Dq, enumC043600Dq2, enumC043600Dq3};
        LLILLJJLI = enumC043600DqArr;
        LLILLL = new C2254308sP(enumC043600DqArr);
    }

    public static EnumC043600Dq[] values() {
        return (EnumC043600Dq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC043600Dq valueOf(String str) {
        return (EnumC043600Dq) C08FF.LIZ(EnumC043600Dq.class, str);
    }

    public EnumC043600Dq(String str, int i, String str2) {
        this.LL = str2;
    }
}
