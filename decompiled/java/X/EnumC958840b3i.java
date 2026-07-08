package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC958840b3i {
    public static final /* synthetic */ EnumC958840b3i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC958840b3i QUICK_BATTLE;
    public static final EnumC958840b3i QUICK_PAIR;
    public static final EnumC958840b3i QUICK_RECOMMEND;
    public static final EnumC958840b3i QUICK_RECOMMEND_DURING_COHOST;
    public static final EnumC958840b3i TEAM_PAIR;
    public static final EnumC958840b3i UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC958840b3i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC958840b3i enumC958840b3i = new EnumC958840b3i("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC958840b3i;
        EnumC958840b3i enumC958840b3i2 = new EnumC958840b3i("QUICK_PAIR", 1, "quick_pair");
        QUICK_PAIR = enumC958840b3i2;
        EnumC958840b3i enumC958840b3i3 = new EnumC958840b3i("QUICK_RECOMMEND", 2, "quick_recommend");
        QUICK_RECOMMEND = enumC958840b3i3;
        EnumC958840b3i enumC958840b3i4 = new EnumC958840b3i("QUICK_RECOMMEND_DURING_COHOST", 3, "quick_recommend_during_cohost");
        QUICK_RECOMMEND_DURING_COHOST = enumC958840b3i4;
        EnumC958840b3i enumC958840b3i5 = new EnumC958840b3i("TEAM_PAIR", 4, "team_pair");
        TEAM_PAIR = enumC958840b3i5;
        EnumC958840b3i enumC958840b3i6 = new EnumC958840b3i("QUICK_BATTLE", 5, "quick_battle");
        QUICK_BATTLE = enumC958840b3i6;
        EnumC958840b3i[] enumC958840b3iArr = {enumC958840b3i, enumC958840b3i2, enumC958840b3i3, enumC958840b3i4, enumC958840b3i5, enumC958840b3i6};
        LLILLJJLI = enumC958840b3iArr;
        LLILLL = new C2254308sP(enumC958840b3iArr);
    }

    public static EnumC958840b3i[] values() {
        return (EnumC958840b3i[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC958840b3i valueOf(String str) {
        return (EnumC958840b3i) C08FF.LIZ(EnumC958840b3i.class, str);
    }

    public EnumC958840b3i(String str, int i, String str2) {
        this.LL = str2;
    }
}
