package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779090wOh {
    public static final EnumC1779090wOh DISMISS;
    public static final /* synthetic */ EnumC1779090wOh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779090wOh SHOW_IN_CHAT;

    public static InterfaceC2044707zh<EnumC1779090wOh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779090wOh enumC1779090wOh = new EnumC1779090wOh("SHOW_IN_CHAT", 0);
        SHOW_IN_CHAT = enumC1779090wOh;
        EnumC1779090wOh enumC1779090wOh2 = new EnumC1779090wOh("DISMISS", 1);
        DISMISS = enumC1779090wOh2;
        EnumC1779090wOh[] enumC1779090wOhArr = {enumC1779090wOh, enumC1779090wOh2};
        LL = enumC1779090wOhArr;
        LLILLJJLI = new C2254308sP(enumC1779090wOhArr);
    }

    public static EnumC1779090wOh[] values() {
        return (EnumC1779090wOh[]) LL.clone();
    }

    /* JADX INFO: renamed from: getDismiss, reason: merged with bridge method [inline-methods] */
    public EnumC1779090wOh m69getDismiss() {
        return DISMISS;
    }

    public static EnumC1779090wOh valueOf(String str) {
        return (EnumC1779090wOh) C08FF.LIZ(EnumC1779090wOh.class, str);
    }

    public EnumC1779090wOh(String str, int i) {
    }
}
