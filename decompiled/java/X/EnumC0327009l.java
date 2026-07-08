package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0327009l {
    public static final EnumC0327009l HASHTAG;
    public static final /* synthetic */ EnumC0327009l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final char LL = '#';

    public static InterfaceC2044707zh<EnumC0327009l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0327009l enumC0327009l = new EnumC0327009l();
        HASHTAG = enumC0327009l;
        EnumC0327009l[] enumC0327009lArr = {enumC0327009l};
        LLILLJJLI = enumC0327009lArr;
        LLILLL = new C2254308sP(enumC0327009lArr);
    }

    public static EnumC0327009l[] values() {
        return (EnumC0327009l[]) LLILLJJLI.clone();
    }

    public final char getValue() {
        return this.LL;
    }

    public static EnumC0327009l valueOf(String str) {
        return (EnumC0327009l) C08FF.LIZ(EnumC0327009l.class, str);
    }
}
