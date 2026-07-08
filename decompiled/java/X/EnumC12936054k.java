package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12936054k {
    public static final /* synthetic */ EnumC12936054k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12936054k STORY_TOOLBAR_ASSEM;
    public final String LL = "story_toolbar_assem";

    public static InterfaceC2044707zh<EnumC12936054k> getEntries() {
        return LLILLL;
    }

    static {
        EnumC12936054k enumC12936054k = new EnumC12936054k();
        STORY_TOOLBAR_ASSEM = enumC12936054k;
        EnumC12936054k[] enumC12936054kArr = {enumC12936054k};
        LLILLJJLI = enumC12936054kArr;
        LLILLL = new C2254308sP(enumC12936054kArr);
    }

    public static EnumC12936054k[] values() {
        return (EnumC12936054k[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC12936054k valueOf(String str) {
        return (EnumC12936054k) C08FF.LIZ(EnumC12936054k.class, str);
    }
}
