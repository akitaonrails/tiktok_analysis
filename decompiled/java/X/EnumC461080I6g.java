package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC461080I6g {
    public static final C461090I6h Companion;
    public static final /* synthetic */ EnumC461080I6g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC461080I6g RECENT_ACTIVITY_POST;
    public static final EnumC461080I6g RECENT_ACTIVITY_REPOST;

    public static InterfaceC2044707zh<EnumC461080I6g> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0I6h] */
    static {
        EnumC461080I6g enumC461080I6g = new EnumC461080I6g("RECENT_ACTIVITY_POST", 0);
        RECENT_ACTIVITY_POST = enumC461080I6g;
        EnumC461080I6g enumC461080I6g2 = new EnumC461080I6g("RECENT_ACTIVITY_REPOST", 1);
        RECENT_ACTIVITY_REPOST = enumC461080I6g2;
        EnumC461080I6g[] enumC461080I6gArr = {enumC461080I6g, enumC461080I6g2};
        LL = enumC461080I6gArr;
        LLILLJJLI = new C2254308sP(enumC461080I6gArr);
        Companion = new Object() { // from class: X.0I6h
        };
    }

    public static EnumC461080I6g[] values() {
        return (EnumC461080I6g[]) LL.clone();
    }

    public static EnumC461080I6g valueOf(String str) {
        return (EnumC461080I6g) C08FF.LIZ(EnumC461080I6g.class, str);
    }

    public EnumC461080I6g(String str, int i) {
    }
}
