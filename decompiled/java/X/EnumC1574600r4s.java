package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1574600r4s {
    public static final C1574680r50 Companion;
    public static final EnumC1574600r4s EPISODE;
    public static final EnumC1574600r4s FROM_BEGIN;
    public static final EnumC1574600r4s LAST_WATCH;
    public static final /* synthetic */ EnumC1574600r4s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1574600r4s> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0r50] */
    static {
        EnumC1574600r4s enumC1574600r4s = new EnumC1574600r4s("LAST_WATCH", 0, "last_watch");
        LAST_WATCH = enumC1574600r4s;
        EnumC1574600r4s enumC1574600r4s2 = new EnumC1574600r4s("FROM_BEGIN", 1, "from_begin");
        FROM_BEGIN = enumC1574600r4s2;
        EnumC1574600r4s enumC1574600r4s3 = new EnumC1574600r4s("EPISODE", 2, "episode");
        EPISODE = enumC1574600r4s3;
        EnumC1574600r4s[] enumC1574600r4sArr = {enumC1574600r4s, enumC1574600r4s2, enumC1574600r4s3};
        LLILLJJLI = enumC1574600r4sArr;
        LLILLL = new C2254308sP(enumC1574600r4sArr);
        Companion = new Object() { // from class: X.0r50
        };
    }

    public static EnumC1574600r4s[] values() {
        return (EnumC1574600r4s[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1574600r4s valueOf(String str) {
        return (EnumC1574600r4s) C08FF.LIZ(EnumC1574600r4s.class, str);
    }

    public EnumC1574600r4s(String str, int i, String str2) {
        this.LL = str2;
    }
}
