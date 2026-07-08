package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC112300bh {
    public static final /* synthetic */ EnumC112300bh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC112300bh NONE;
    public static final EnumC112300bh SLIDE_TO_BOTTOM;

    public static InterfaceC2044707zh<EnumC112300bh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC112300bh enumC112300bh = new EnumC112300bh("NONE", 0);
        NONE = enumC112300bh;
        EnumC112300bh enumC112300bh2 = new EnumC112300bh("SLIDE_TO_BOTTOM", 1);
        SLIDE_TO_BOTTOM = enumC112300bh2;
        EnumC112300bh[] enumC112300bhArr = {enumC112300bh, enumC112300bh2};
        LL = enumC112300bhArr;
        LLILLJJLI = new C2254308sP(enumC112300bhArr);
    }

    public static EnumC112300bh[] values() {
        return (EnumC112300bh[]) LL.clone();
    }

    public static EnumC112300bh valueOf(String str) {
        return (EnumC112300bh) C08FF.LIZ(EnumC112300bh.class, str);
    }

    public EnumC112300bh(String str, int i) {
    }
}
