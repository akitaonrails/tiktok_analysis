package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC039800Ce {
    public static final /* synthetic */ EnumC039800Ce[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC039800Ce NORMAL;
    public static final EnumC039800Ce STICKY;
    public static final EnumC039800Ce VIEW_PAGER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC039800Ce> getEntries() {
        return LLILLL;
    }

    static {
        EnumC039800Ce enumC039800Ce = new EnumC039800Ce("NORMAL", 0, 0);
        NORMAL = enumC039800Ce;
        EnumC039800Ce enumC039800Ce2 = new EnumC039800Ce("STICKY", 1, 1);
        STICKY = enumC039800Ce2;
        EnumC039800Ce enumC039800Ce3 = new EnumC039800Ce("VIEW_PAGER", 2, 2);
        VIEW_PAGER = enumC039800Ce3;
        EnumC039800Ce[] enumC039800CeArr = {enumC039800Ce, enumC039800Ce2, enumC039800Ce3};
        LLILLJJLI = enumC039800CeArr;
        LLILLL = new C2254308sP(enumC039800CeArr);
    }

    public static EnumC039800Ce[] values() {
        return (EnumC039800Ce[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC039800Ce valueOf(String str) {
        return (EnumC039800Ce) C08FF.LIZ(EnumC039800Ce.class, str);
    }

    public EnumC039800Ce(String str, int i, int i2) {
        this.LL = i2;
    }
}
