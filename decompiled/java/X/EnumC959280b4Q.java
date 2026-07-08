package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC959280b4Q {
    public static final EnumC959280b4Q FRIENDS_RANKING;
    public static final EnumC959280b4Q LEAGUE_RECOMMEND;
    public static final /* synthetic */ EnumC959280b4Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC959280b4Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC959280b4Q enumC959280b4Q = new EnumC959280b4Q("FRIENDS_RANKING", 0);
        FRIENDS_RANKING = enumC959280b4Q;
        EnumC959280b4Q enumC959280b4Q2 = new EnumC959280b4Q("LEAGUE_RECOMMEND", 1);
        LEAGUE_RECOMMEND = enumC959280b4Q2;
        EnumC959280b4Q[] enumC959280b4QArr = {enumC959280b4Q, enumC959280b4Q2};
        LL = enumC959280b4QArr;
        LLILLJJLI = new C2254308sP(enumC959280b4QArr);
    }

    public static EnumC959280b4Q[] values() {
        return (EnumC959280b4Q[]) LL.clone();
    }

    public static EnumC959280b4Q valueOf(String str) {
        return (EnumC959280b4Q) C08FF.LIZ(EnumC959280b4Q.class, str);
    }

    public EnumC959280b4Q(String str, int i) {
    }
}
