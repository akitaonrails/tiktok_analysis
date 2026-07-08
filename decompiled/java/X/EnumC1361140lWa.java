package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1361140lWa {
    public static final EnumC1361140lWa ADD;
    public static final EnumC1361140lWa DANMAKU_SETTING;
    public static final EnumC1361140lWa HIDE;
    public static final /* synthetic */ EnumC1361140lWa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1361140lWa SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1361140lWa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1361140lWa enumC1361140lWa = new EnumC1361140lWa("ADD", 0, "add");
        ADD = enumC1361140lWa;
        EnumC1361140lWa enumC1361140lWa2 = new EnumC1361140lWa("SHOW", 1, "show");
        SHOW = enumC1361140lWa2;
        EnumC1361140lWa enumC1361140lWa3 = new EnumC1361140lWa("HIDE", 2, "hide");
        HIDE = enumC1361140lWa3;
        EnumC1361140lWa enumC1361140lWa4 = new EnumC1361140lWa("DANMAKU_SETTING", 3, "danmaku_setting");
        DANMAKU_SETTING = enumC1361140lWa4;
        EnumC1361140lWa[] enumC1361140lWaArr = {enumC1361140lWa, enumC1361140lWa2, enumC1361140lWa3, enumC1361140lWa4};
        LLILLJJLI = enumC1361140lWaArr;
        LLILLL = new C2254308sP(enumC1361140lWaArr);
    }

    public static EnumC1361140lWa[] values() {
        return (EnumC1361140lWa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1361140lWa valueOf(String str) {
        return (EnumC1361140lWa) C08FF.LIZ(EnumC1361140lWa.class, str);
    }

    public EnumC1361140lWa(String str, int i, String str2) {
        this.LL = str2;
    }
}
