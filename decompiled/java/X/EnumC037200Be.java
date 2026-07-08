package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037200Be {
    public static final EnumC037200Be ERROR;
    public static final /* synthetic */ EnumC037200Be[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC037200Be MODEL_LOADED;
    public static final EnumC037200Be MODEL_UNLOADED;
    public static final EnumC037200Be NOT_INIT;
    public int LL;

    public static InterfaceC2044707zh<EnumC037200Be> getEntries() {
        return LLILLL;
    }

    static {
        EnumC037200Be enumC037200Be = new EnumC037200Be("ERROR", 0, -1);
        ERROR = enumC037200Be;
        EnumC037200Be enumC037200Be2 = new EnumC037200Be("NOT_INIT", 1, 1);
        NOT_INIT = enumC037200Be2;
        EnumC037200Be enumC037200Be3 = new EnumC037200Be("MODEL_LOADED", 2, 3);
        MODEL_LOADED = enumC037200Be3;
        EnumC037200Be enumC037200Be4 = new EnumC037200Be("MODEL_UNLOADED", 3, 4);
        MODEL_UNLOADED = enumC037200Be4;
        EnumC037200Be[] enumC037200BeArr = {enumC037200Be, enumC037200Be2, enumC037200Be3, enumC037200Be4};
        LLILLJJLI = enumC037200BeArr;
        LLILLL = new C2254308sP(enumC037200BeArr);
    }

    public static EnumC037200Be[] values() {
        return (EnumC037200Be[]) LLILLJJLI.clone();
    }

    public final int getInt() {
        return this.LL;
    }

    public static EnumC037200Be valueOf(String str) {
        return (EnumC037200Be) C08FF.LIZ(EnumC037200Be.class, str);
    }

    public final void setInt(int i) {
        this.LL = i;
    }

    public EnumC037200Be(String str, int i, int i2) {
        this.LL = i2;
    }
}
