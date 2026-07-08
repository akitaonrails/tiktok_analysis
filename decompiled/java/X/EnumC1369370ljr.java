package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ljr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1369370ljr {
    public static final EnumC1369370ljr FOLLOWED;
    public static final EnumC1369370ljr FOLLOWING;
    public static final EnumC1369370ljr FRIENDS;
    public static final EnumC1369370ljr GROUP_CHAT;
    public static final /* synthetic */ EnumC1369370ljr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1369370ljr MATCHED_FRIENDS;
    public static final EnumC1369370ljr NONE;
    public static final EnumC1369370ljr REQUESTED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1369370ljr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1369370ljr enumC1369370ljr = new EnumC1369370ljr("NONE", 0, 0);
        NONE = enumC1369370ljr;
        EnumC1369370ljr enumC1369370ljr2 = new EnumC1369370ljr("FOLLOWING", 1, 1);
        FOLLOWING = enumC1369370ljr2;
        EnumC1369370ljr enumC1369370ljr3 = new EnumC1369370ljr("FOLLOWED", 2, 2);
        FOLLOWED = enumC1369370ljr3;
        EnumC1369370ljr enumC1369370ljr4 = new EnumC1369370ljr("REQUESTED", 3, 3);
        REQUESTED = enumC1369370ljr4;
        EnumC1369370ljr enumC1369370ljr5 = new EnumC1369370ljr("FRIENDS", 4, 4);
        FRIENDS = enumC1369370ljr5;
        EnumC1369370ljr enumC1369370ljr6 = new EnumC1369370ljr("MATCHED_FRIENDS", 5, 5);
        MATCHED_FRIENDS = enumC1369370ljr6;
        EnumC1369370ljr enumC1369370ljr7 = new EnumC1369370ljr("GROUP_CHAT", 6, 6);
        GROUP_CHAT = enumC1369370ljr7;
        EnumC1369370ljr[] enumC1369370ljrArr = {enumC1369370ljr, enumC1369370ljr2, enumC1369370ljr3, enumC1369370ljr4, enumC1369370ljr5, enumC1369370ljr6, enumC1369370ljr7};
        LLILLJJLI = enumC1369370ljrArr;
        LLILLL = new C2254308sP(enumC1369370ljrArr);
    }

    public static EnumC1369370ljr[] values() {
        return (EnumC1369370ljr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1369370ljr valueOf(String str) {
        return (EnumC1369370ljr) C08FF.LIZ(EnumC1369370ljr.class, str);
    }

    public EnumC1369370ljr(String str, int i, int i2) {
        this.LL = i2;
    }
}
