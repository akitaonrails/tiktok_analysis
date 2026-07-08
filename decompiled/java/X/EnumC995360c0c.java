package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995360c0c {
    public static final EnumC995360c0c FAIL;
    public static final EnumC995360c0c IN_PROGRESS;
    public static final /* synthetic */ EnumC995360c0c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995360c0c NOT_FOUND;
    public static final EnumC995360c0c SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995360c0c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995360c0c enumC995360c0c = new EnumC995360c0c("NOT_FOUND", 0, -1);
        NOT_FOUND = enumC995360c0c;
        EnumC995360c0c enumC995360c0c2 = new EnumC995360c0c("IN_PROGRESS", 1, 0);
        IN_PROGRESS = enumC995360c0c2;
        EnumC995360c0c enumC995360c0c3 = new EnumC995360c0c("SUCCESS", 2, 1);
        SUCCESS = enumC995360c0c3;
        EnumC995360c0c enumC995360c0c4 = new EnumC995360c0c("FAIL", 3, 2);
        FAIL = enumC995360c0c4;
        EnumC995360c0c[] enumC995360c0cArr = {enumC995360c0c, enumC995360c0c2, enumC995360c0c3, enumC995360c0c4};
        LLILLJJLI = enumC995360c0cArr;
        LLILLL = new C2254308sP(enumC995360c0cArr);
    }

    public static EnumC995360c0c[] values() {
        return (EnumC995360c0c[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC995360c0c valueOf(String str) {
        return (EnumC995360c0c) C08FF.LIZ(EnumC995360c0c.class, str);
    }

    public EnumC995360c0c(String str, int i, int i2) {
        this.LL = i2;
    }
}
