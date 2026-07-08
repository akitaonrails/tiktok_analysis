package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0emO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1101860emO {
    public static final EnumC1101860emO ID;
    public static final /* synthetic */ EnumC1101860emO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1101860emO NAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1101860emO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1101860emO enumC1101860emO = new EnumC1101860emO("ID", 0, FollowStatusChangeMethod.PARAM_UID);
        ID = enumC1101860emO;
        EnumC1101860emO enumC1101860emO2 = new EnumC1101860emO("NAME", 1, "name");
        NAME = enumC1101860emO2;
        EnumC1101860emO[] enumC1101860emOArr = {enumC1101860emO, enumC1101860emO2};
        LLILLJJLI = enumC1101860emOArr;
        LLILLL = new C2254308sP(enumC1101860emOArr);
    }

    public static EnumC1101860emO[] values() {
        return (EnumC1101860emO[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1101860emO valueOf(String str) {
        return (EnumC1101860emO) C08FF.LIZ(EnumC1101860emO.class, str);
    }

    public EnumC1101860emO(String str, int i, String str2) {
        this.LL = str2;
    }
}
