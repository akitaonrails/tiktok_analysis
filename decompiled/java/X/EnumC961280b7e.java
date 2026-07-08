package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961280b7e {
    public static final /* synthetic */ EnumC961280b7e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC961280b7e MANAGE_PANEL_COMPRESS;
    public static final EnumC961280b7e MANAGE_PANEL_EXTEND;
    public static final EnumC961280b7e NORMAL;
    public int LL;

    public static InterfaceC2044707zh<EnumC961280b7e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC961280b7e enumC961280b7e = new EnumC961280b7e("NORMAL", 0, 0);
        NORMAL = enumC961280b7e;
        EnumC961280b7e enumC961280b7e2 = new EnumC961280b7e("MANAGE_PANEL_EXTEND", 1, 1);
        MANAGE_PANEL_EXTEND = enumC961280b7e2;
        EnumC961280b7e enumC961280b7e3 = new EnumC961280b7e("MANAGE_PANEL_COMPRESS", 2, 2);
        MANAGE_PANEL_COMPRESS = enumC961280b7e3;
        EnumC961280b7e[] enumC961280b7eArr = {enumC961280b7e, enumC961280b7e2, enumC961280b7e3};
        LLILLJJLI = enumC961280b7eArr;
        LLILLL = new C2254308sP(enumC961280b7eArr);
    }

    public static EnumC961280b7e[] values() {
        return (EnumC961280b7e[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC961280b7e valueOf(String str) {
        return (EnumC961280b7e) C08FF.LIZ(EnumC961280b7e.class, str);
    }

    public final void setState(int i) {
        this.LL = i;
    }

    public EnumC961280b7e(String str, int i, int i2) {
        this.LL = i2;
    }
}
