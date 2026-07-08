package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1229300i5w {
    public static final C1229290i5v Companion;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_CAMPUS_VERIFIED;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_EVERYONE;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_FOLLOW;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_LIVE_TEAM_LEVEL;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_SUBSCRIBE;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_SUPER_FAN;
    public static final EnumC1229300i5w GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC1229300i5w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1229300i5w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1229300i5w enumC1229300i5w = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN", 0, 0);
        GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN = enumC1229300i5w;
        EnumC1229300i5w enumC1229300i5w2 = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_LIVE_TEAM_LEVEL", 1, 1);
        GROUP_ACCESS_CRITERIA_TYPE_LIVE_TEAM_LEVEL = enumC1229300i5w2;
        EnumC1229300i5w enumC1229300i5w3 = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_FOLLOW", 2, 2);
        GROUP_ACCESS_CRITERIA_TYPE_FOLLOW = enumC1229300i5w3;
        EnumC1229300i5w enumC1229300i5w4 = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_SUBSCRIBE", 3, 3);
        GROUP_ACCESS_CRITERIA_TYPE_SUBSCRIBE = enumC1229300i5w4;
        EnumC1229300i5w enumC1229300i5w5 = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_CAMPUS_VERIFIED", 4, 4);
        GROUP_ACCESS_CRITERIA_TYPE_CAMPUS_VERIFIED = enumC1229300i5w5;
        EnumC1229300i5w enumC1229300i5w6 = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_SUPER_FAN", 5, 5);
        GROUP_ACCESS_CRITERIA_TYPE_SUPER_FAN = enumC1229300i5w6;
        EnumC1229300i5w enumC1229300i5w7 = new EnumC1229300i5w("GROUP_ACCESS_CRITERIA_TYPE_EVERYONE", 6, 6);
        GROUP_ACCESS_CRITERIA_TYPE_EVERYONE = enumC1229300i5w7;
        EnumC1229300i5w[] enumC1229300i5wArr = {enumC1229300i5w, enumC1229300i5w2, enumC1229300i5w3, enumC1229300i5w4, enumC1229300i5w5, enumC1229300i5w6, enumC1229300i5w7};
        LLILLJJLI = enumC1229300i5wArr;
        LLILLL = new C2254308sP(enumC1229300i5wArr);
        Companion = new C1229290i5v();
    }

    public static EnumC1229300i5w[] values() {
        return (EnumC1229300i5w[]) LLILLJJLI.clone();
    }

    public final int toAccessCriteriaStringRes() {
        switch (C1229310i5x.LIZ[ordinal()]) {
            case 1:
                return 2131831416;
            case 2:
            case 5:
                return 2131831420;
            case 3:
                return 2131831417;
            case 4:
                return 2131831421;
            case 6:
                return R.string.dlw;
            case 7:
                return 0;
            default:
                throw new C1954807lC();
        }
    }

    public final EnumC913760Zt0 toGroupType() {
        switch (C1229310i5x.LIZ[ordinal()]) {
            case 1:
                return EnumC913760Zt0.CAMPUS_GROUP;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return EnumC913760Zt0.FAN_GROUP;
            case 7:
                return EnumC913760Zt0.FAN_GROUP;
            default:
                throw new C1954807lC();
        }
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1229300i5w valueOf(String str) {
        return (EnumC1229300i5w) C08FF.LIZ(EnumC1229300i5w.class, str);
    }

    public EnumC1229300i5w(String str, int i, int i2) {
        this.LL = i2;
    }
}
