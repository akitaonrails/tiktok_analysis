package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC485780J3g {
    public static final EnumC485780J3g ACTIVITY_CREATED;
    public static final EnumC485780J3g FIRST_FRAME;
    public static final EnumC485780J3g FRAGMENT_CREATED;
    public static final /* synthetic */ EnumC485780J3g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC485780J3g UN_SET;

    public static InterfaceC2044707zh<EnumC485780J3g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC485780J3g enumC485780J3g = new EnumC485780J3g("UN_SET", 0);
        UN_SET = enumC485780J3g;
        EnumC485780J3g enumC485780J3g2 = new EnumC485780J3g("ACTIVITY_CREATED", 1);
        ACTIVITY_CREATED = enumC485780J3g2;
        EnumC485780J3g enumC485780J3g3 = new EnumC485780J3g("FRAGMENT_CREATED", 2);
        FRAGMENT_CREATED = enumC485780J3g3;
        EnumC485780J3g enumC485780J3g4 = new EnumC485780J3g("FIRST_FRAME", 3);
        FIRST_FRAME = enumC485780J3g4;
        EnumC485780J3g[] enumC485780J3gArr = {enumC485780J3g, enumC485780J3g2, enumC485780J3g3, enumC485780J3g4};
        LL = enumC485780J3gArr;
        LLILLJJLI = new C2254308sP(enumC485780J3gArr);
    }

    public static EnumC485780J3g[] values() {
        return (EnumC485780J3g[]) LL.clone();
    }

    public static EnumC485780J3g valueOf(String str) {
        return (EnumC485780J3g) C08FF.LIZ(EnumC485780J3g.class, str);
    }

    public final boolean isAtLeast(EnumC485780J3g enumC485780J3g) {
        if (compareTo(enumC485780J3g) >= 0) {
            return true;
        }
        return false;
    }

    public EnumC485780J3g(String str, int i) {
    }
}
