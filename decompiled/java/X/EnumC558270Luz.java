package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Luz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC558270Luz {
    public static final EnumC558270Luz AI_SUMMARY;
    public static final EnumC558270Luz DESC_SUMMARY;
    public static final /* synthetic */ EnumC558270Luz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC558270Luz TITLE_SUMMARY;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC558270Luz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC558270Luz enumC558270Luz = new EnumC558270Luz("AI_SUMMARY", 0, 1);
        AI_SUMMARY = enumC558270Luz;
        EnumC558270Luz enumC558270Luz2 = new EnumC558270Luz("TITLE_SUMMARY", 1, 2);
        TITLE_SUMMARY = enumC558270Luz2;
        EnumC558270Luz enumC558270Luz3 = new EnumC558270Luz("DESC_SUMMARY", 2, 3);
        DESC_SUMMARY = enumC558270Luz3;
        EnumC558270Luz[] enumC558270LuzArr = {enumC558270Luz, enumC558270Luz2, enumC558270Luz3};
        LLILLJJLI = enumC558270LuzArr;
        LLILLL = new C2254308sP(enumC558270LuzArr);
    }

    public static EnumC558270Luz[] values() {
        return (EnumC558270Luz[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC558270Luz valueOf(String str) {
        return (EnumC558270Luz) C08FF.LIZ(EnumC558270Luz.class, str);
    }

    public EnumC558270Luz(String str, int i, int i2) {
        this.LL = i2;
    }
}
