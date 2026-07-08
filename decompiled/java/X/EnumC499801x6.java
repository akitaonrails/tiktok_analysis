package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01x6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC499801x6 {
    public static final EnumC499801x6 ALL;
    public static final EnumC499801x6 COUNTDOWN_ALL;
    public static final EnumC499801x6 GUEST_SHOWDOWN;
    public static final EnumC499801x6 LIVE_SHOW;
    public static final /* synthetic */ EnumC499801x6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC499801x6 PLAYBOOK;

    public static InterfaceC2044707zh<EnumC499801x6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC499801x6 enumC499801x6 = new EnumC499801x6("ALL", 0);
        ALL = enumC499801x6;
        EnumC499801x6 enumC499801x62 = new EnumC499801x6("PLAYBOOK", 1);
        PLAYBOOK = enumC499801x62;
        EnumC499801x6 enumC499801x63 = new EnumC499801x6("GUEST_SHOWDOWN", 2);
        GUEST_SHOWDOWN = enumC499801x63;
        EnumC499801x6 enumC499801x64 = new EnumC499801x6("LIVE_SHOW", 3);
        LIVE_SHOW = enumC499801x64;
        EnumC499801x6 enumC499801x65 = new EnumC499801x6("COUNTDOWN_ALL", 4);
        COUNTDOWN_ALL = enumC499801x65;
        EnumC499801x6[] enumC499801x6Arr = {enumC499801x6, enumC499801x62, enumC499801x63, enumC499801x64, enumC499801x65};
        LL = enumC499801x6Arr;
        LLILLJJLI = new C2254308sP(enumC499801x6Arr);
    }

    public static EnumC499801x6[] values() {
        return (EnumC499801x6[]) LL.clone();
    }

    public static EnumC499801x6 valueOf(String str) {
        return (EnumC499801x6) C08FF.LIZ(EnumC499801x6.class, str);
    }

    public EnumC499801x6(String str, int i) {
    }
}
