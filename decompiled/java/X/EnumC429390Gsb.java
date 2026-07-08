package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429390Gsb {
    public static final EnumC429390Gsb LIKE_HAND;
    public static final EnumC429390Gsb LIKE_ICON;
    public static final EnumC429390Gsb LIKE_STATUS;
    public static final /* synthetic */ EnumC429390Gsb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC429390Gsb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429390Gsb enumC429390Gsb = new EnumC429390Gsb("LIKE_ICON", 0, "thought_like_bubbletap_icon_tux_lottie.json");
        LIKE_ICON = enumC429390Gsb;
        EnumC429390Gsb enumC429390Gsb2 = new EnumC429390Gsb("LIKE_HAND", 1, "thought_like_bubbletap_hand_tux_lottie.json");
        LIKE_HAND = enumC429390Gsb2;
        EnumC429390Gsb enumC429390Gsb3 = new EnumC429390Gsb("LIKE_STATUS", 2, "thought_like_status_tux_lottie.json");
        LIKE_STATUS = enumC429390Gsb3;
        EnumC429390Gsb[] enumC429390GsbArr = {enumC429390Gsb, enumC429390Gsb2, enumC429390Gsb3};
        LLILLJJLI = enumC429390GsbArr;
        LLILLL = new C2254308sP(enumC429390GsbArr);
    }

    public static EnumC429390Gsb[] values() {
        return (EnumC429390Gsb[]) LLILLJJLI.clone();
    }

    public final String getFileName() {
        return this.LL;
    }

    public static EnumC429390Gsb valueOf(String str) {
        return (EnumC429390Gsb) C08FF.LIZ(EnumC429390Gsb.class, str);
    }

    public EnumC429390Gsb(String str, int i, String str2) {
        this.LL = str2;
    }
}
