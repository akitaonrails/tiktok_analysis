package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1653890t8l {
    public static final /* synthetic */ EnumC1653890t8l[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1653890t8l STORY;
    public final int LL = 2131828282;
    public final String LLILLJJLI = "Story";

    public static InterfaceC2044707zh<EnumC1653890t8l> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1653890t8l enumC1653890t8l = new EnumC1653890t8l();
        STORY = enumC1653890t8l;
        EnumC1653890t8l[] enumC1653890t8lArr = {enumC1653890t8l};
        LLILLL = enumC1653890t8lArr;
        LLILZ = new C2254308sP(enumC1653890t8lArr);
    }

    public static EnumC1653890t8l[] values() {
        return (EnumC1653890t8l[]) LLILLL.clone();
    }

    public final int getNameResId() {
        return this.LL;
    }

    public final String getTag() {
        return this.LLILLJJLI;
    }

    public static EnumC1653890t8l valueOf(String str) {
        return (EnumC1653890t8l) C08FF.LIZ(EnumC1653890t8l.class, str);
    }
}
