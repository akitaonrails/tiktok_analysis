package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995440c0k {
    public static final /* synthetic */ EnumC995440c0k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995440c0k PORTAL_LEAF;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995440c0k> getEntries() {
        return LLILLL;
    }

    static {
        int i = C995450c0l.LIZ;
        C995450c0l.LIZ = i + 1;
        EnumC995440c0k enumC995440c0k = new EnumC995440c0k(i);
        PORTAL_LEAF = enumC995440c0k;
        EnumC995440c0k[] enumC995440c0kArr = {enumC995440c0k};
        LLILLJJLI = enumC995440c0kArr;
        LLILLL = new C2254308sP(enumC995440c0kArr);
    }

    public static EnumC995440c0k[] values() {
        return (EnumC995440c0k[]) LLILLJJLI.clone();
    }

    public final int getZIndex() {
        return this.LL;
    }

    public EnumC995440c0k(int i) {
        this.LL = i;
    }

    public static EnumC995440c0k valueOf(String str) {
        return (EnumC995440c0k) C08FF.LIZ(EnumC995440c0k.class, str);
    }
}
