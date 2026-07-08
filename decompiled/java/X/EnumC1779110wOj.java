package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779110wOj {
    public static final EnumC1779110wOj IDLE;
    public static final /* synthetic */ EnumC1779110wOj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779110wOj PUBLISHING;
    public static final EnumC1779110wOj PUBLISH_FAILED;
    public static final EnumC1779110wOj PUBLISH_RETRY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779110wOj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779110wOj enumC1779110wOj = new EnumC1779110wOj("IDLE", 0, 0);
        IDLE = enumC1779110wOj;
        EnumC1779110wOj enumC1779110wOj2 = new EnumC1779110wOj("PUBLISHING", 1, 1);
        PUBLISHING = enumC1779110wOj2;
        EnumC1779110wOj enumC1779110wOj3 = new EnumC1779110wOj("PUBLISH_RETRY", 2, 2);
        PUBLISH_RETRY = enumC1779110wOj3;
        EnumC1779110wOj enumC1779110wOj4 = new EnumC1779110wOj("PUBLISH_FAILED", 3, 3);
        PUBLISH_FAILED = enumC1779110wOj4;
        EnumC1779110wOj[] enumC1779110wOjArr = {enumC1779110wOj, enumC1779110wOj2, enumC1779110wOj3, enumC1779110wOj4};
        LLILLJJLI = enumC1779110wOjArr;
        LLILLL = new C2254308sP(enumC1779110wOjArr);
    }

    public static EnumC1779110wOj[] values() {
        return (EnumC1779110wOj[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1779110wOj valueOf(String str) {
        return (EnumC1779110wOj) C08FF.LIZ(EnumC1779110wOj.class, str);
    }

    public EnumC1779110wOj(String str, int i, int i2) {
        this.LL = i2;
    }
}
