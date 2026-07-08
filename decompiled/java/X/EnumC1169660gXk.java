package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1169660gXk {
    public static final EnumC1169660gXk ADD_PROFILE;
    public static final /* synthetic */ EnumC1169660gXk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1169660gXk NO_SHEET;
    public static final EnumC1169660gXk PROFILE_ADDED;
    public static final EnumC1169660gXk PROFILE_ADDED_SET_UP_NICKNAME;
    public static final EnumC1169660gXk SET_UP_NICKNAME;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC1169660gXk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1169660gXk enumC1169660gXk = new EnumC1169660gXk("NO_SHEET", 0, true);
        NO_SHEET = enumC1169660gXk;
        EnumC1169660gXk enumC1169660gXk2 = new EnumC1169660gXk("ADD_PROFILE", 1, true);
        ADD_PROFILE = enumC1169660gXk2;
        EnumC1169660gXk enumC1169660gXk3 = new EnumC1169660gXk("SET_UP_NICKNAME", 2, false);
        SET_UP_NICKNAME = enumC1169660gXk3;
        EnumC1169660gXk enumC1169660gXk4 = new EnumC1169660gXk("PROFILE_ADDED_SET_UP_NICKNAME", 3, true);
        PROFILE_ADDED_SET_UP_NICKNAME = enumC1169660gXk4;
        EnumC1169660gXk enumC1169660gXk5 = new EnumC1169660gXk("PROFILE_ADDED", 4, true);
        PROFILE_ADDED = enumC1169660gXk5;
        EnumC1169660gXk[] enumC1169660gXkArr = {enumC1169660gXk, enumC1169660gXk2, enumC1169660gXk3, enumC1169660gXk4, enumC1169660gXk5};
        LLILLJJLI = enumC1169660gXkArr;
        LLILLL = new C2254308sP(enumC1169660gXkArr);
    }

    public static EnumC1169660gXk[] values() {
        return (EnumC1169660gXk[]) LLILLJJLI.clone();
    }

    public final boolean getShowCloseXMark() {
        return this.LL;
    }

    public static EnumC1169660gXk valueOf(String str) {
        return (EnumC1169660gXk) C08FF.LIZ(EnumC1169660gXk.class, str);
    }

    public EnumC1169660gXk(String str, int i, boolean z) {
        this.LL = z;
    }
}
