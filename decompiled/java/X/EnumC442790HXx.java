package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC442790HXx {
    public static final EnumC442790HXx AIMOJI;
    public static final EnumC442790HXx AI_SELF;
    public static final /* synthetic */ EnumC442790HXx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC442790HXx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC442790HXx enumC442790HXx = new EnumC442790HXx("AIMOJI", 0, "aimoji");
        AIMOJI = enumC442790HXx;
        EnumC442790HXx enumC442790HXx2 = new EnumC442790HXx("AI_SELF", 1, "ai_self_sticker");
        AI_SELF = enumC442790HXx2;
        EnumC442790HXx[] enumC442790HXxArr = {enumC442790HXx, enumC442790HXx2};
        LLILLJJLI = enumC442790HXxArr;
        LLILLL = new C2254308sP(enumC442790HXxArr);
    }

    public static EnumC442790HXx[] values() {
        return (EnumC442790HXx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC442790HXx valueOf(String str) {
        return (EnumC442790HXx) C08FF.LIZ(EnumC442790HXx.class, str);
    }

    public EnumC442790HXx(String str, int i, String str2) {
        this.LL = str2;
    }
}
