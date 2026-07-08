package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Swx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC737850Swx {
    public static final EnumC737850Swx HOLDER1;
    public static final EnumC737850Swx HOLDER2;
    public static final /* synthetic */ EnumC737850Swx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC737850Swx REUSED_SCOPE_ACTIVITY;
    public static final EnumC737850Swx REUSED_SCOPE_CELL;
    public static final EnumC737850Swx REUSED_SCOPE_FRAGMENT;
    public static final EnumC737850Swx REUSED_SCOPE_HOLDER;
    public static final EnumC737850Swx SIMPLE;

    public static InterfaceC2044707zh<EnumC737850Swx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC737850Swx enumC737850Swx = new EnumC737850Swx("SIMPLE", 0);
        SIMPLE = enumC737850Swx;
        EnumC737850Swx enumC737850Swx2 = new EnumC737850Swx("REUSED_SCOPE_ACTIVITY", 1);
        REUSED_SCOPE_ACTIVITY = enumC737850Swx2;
        EnumC737850Swx enumC737850Swx3 = new EnumC737850Swx("REUSED_SCOPE_FRAGMENT", 2);
        REUSED_SCOPE_FRAGMENT = enumC737850Swx3;
        EnumC737850Swx enumC737850Swx4 = new EnumC737850Swx("REUSED_SCOPE_HOLDER", 3);
        REUSED_SCOPE_HOLDER = enumC737850Swx4;
        EnumC737850Swx enumC737850Swx5 = new EnumC737850Swx("REUSED_SCOPE_CELL", 4);
        REUSED_SCOPE_CELL = enumC737850Swx5;
        EnumC737850Swx enumC737850Swx6 = new EnumC737850Swx("HOLDER1", 5);
        HOLDER1 = enumC737850Swx6;
        EnumC737850Swx enumC737850Swx7 = new EnumC737850Swx("HOLDER2", 6);
        HOLDER2 = enumC737850Swx7;
        EnumC737850Swx[] enumC737850SwxArr = {enumC737850Swx, enumC737850Swx2, enumC737850Swx3, enumC737850Swx4, enumC737850Swx5, enumC737850Swx6, enumC737850Swx7};
        LL = enumC737850SwxArr;
        LLILLJJLI = new C2254308sP(enumC737850SwxArr);
    }

    public static EnumC737850Swx[] values() {
        return (EnumC737850Swx[]) LL.clone();
    }

    public static EnumC737850Swx valueOf(String str) {
        return (EnumC737850Swx) C08FF.LIZ(EnumC737850Swx.class, str);
    }

    public EnumC737850Swx(String str, int i) {
    }
}
