package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779290wP1 {
    public static final EnumC1779290wP1 CHECK_MD5;
    public static final EnumC1779290wP1 FULL_SYNC;
    public static final EnumC1779290wP1 INCREMENTAL_SYNC;
    public static final /* synthetic */ EnumC1779290wP1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779290wP1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779290wP1 enumC1779290wP1 = new EnumC1779290wP1("CHECK_MD5", 0, 3);
        CHECK_MD5 = enumC1779290wP1;
        EnumC1779290wP1 enumC1779290wP12 = new EnumC1779290wP1("INCREMENTAL_SYNC", 1, 2);
        INCREMENTAL_SYNC = enumC1779290wP12;
        EnumC1779290wP1 enumC1779290wP13 = new EnumC1779290wP1("FULL_SYNC", 2, 1);
        FULL_SYNC = enumC1779290wP13;
        EnumC1779290wP1[] enumC1779290wP1Arr = {enumC1779290wP1, enumC1779290wP12, enumC1779290wP13};
        LLILLJJLI = enumC1779290wP1Arr;
        LLILLL = new C2254308sP(enumC1779290wP1Arr);
    }

    public static EnumC1779290wP1[] values() {
        return (EnumC1779290wP1[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1779290wP1 valueOf(String str) {
        return (EnumC1779290wP1) C08FF.LIZ(EnumC1779290wP1.class, str);
    }

    public EnumC1779290wP1(String str, int i, int i2) {
        this.LL = i2;
    }
}
