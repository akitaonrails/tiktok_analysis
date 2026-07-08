package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1113160f4c {
    public static final EnumC1113160f4c ALPHA_EXCEPTION;
    public static final EnumC1113160f4c CLEAR_SCREEN;
    public static final EnumC1113160f4c COMMENT_CLOSED;
    public static final EnumC1113160f4c DIALOG_SHOWING;
    public static final /* synthetic */ EnumC1113160f4c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1113160f4c NORMAL;
    public static final EnumC1113160f4c POSITION_EXCEPTION;
    public static final EnumC1113160f4c VISIBILITY_EXCEPTION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1113160f4c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1113160f4c enumC1113160f4c = new EnumC1113160f4c("ALPHA_EXCEPTION", 0, -3);
        ALPHA_EXCEPTION = enumC1113160f4c;
        EnumC1113160f4c enumC1113160f4c2 = new EnumC1113160f4c("VISIBILITY_EXCEPTION", 1, -2);
        VISIBILITY_EXCEPTION = enumC1113160f4c2;
        EnumC1113160f4c enumC1113160f4c3 = new EnumC1113160f4c("POSITION_EXCEPTION", 2, -1);
        POSITION_EXCEPTION = enumC1113160f4c3;
        EnumC1113160f4c enumC1113160f4c4 = new EnumC1113160f4c("NORMAL", 3, 0);
        NORMAL = enumC1113160f4c4;
        EnumC1113160f4c enumC1113160f4c5 = new EnumC1113160f4c("CLEAR_SCREEN", 4, 1);
        CLEAR_SCREEN = enumC1113160f4c5;
        EnumC1113160f4c enumC1113160f4c6 = new EnumC1113160f4c("COMMENT_CLOSED", 5, 2);
        COMMENT_CLOSED = enumC1113160f4c6;
        EnumC1113160f4c enumC1113160f4c7 = new EnumC1113160f4c("DIALOG_SHOWING", 6, 3);
        DIALOG_SHOWING = enumC1113160f4c7;
        EnumC1113160f4c[] enumC1113160f4cArr = {enumC1113160f4c, enumC1113160f4c2, enumC1113160f4c3, enumC1113160f4c4, enumC1113160f4c5, enumC1113160f4c6, enumC1113160f4c7};
        LLILLJJLI = enumC1113160f4cArr;
        LLILLL = new C2254308sP(enumC1113160f4cArr);
    }

    public static EnumC1113160f4c[] values() {
        return (EnumC1113160f4c[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1113160f4c valueOf(String str) {
        return (EnumC1113160f4c) C08FF.LIZ(EnumC1113160f4c.class, str);
    }

    public EnumC1113160f4c(String str, int i, int i2) {
        this.LL = i2;
    }
}
