package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ERx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC364790ERx {
    public static final /* synthetic */ EnumC364790ERx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC364790ERx SHOW_LIST;
    public static final EnumC364790ERx SHOW_LOADING;
    public static final EnumC364790ERx SHOW_LOADING_WITHOUT_PROCESS;
    public static final EnumC364790ERx SHOW_NET_ERROR;

    public static InterfaceC2044707zh<EnumC364790ERx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC364790ERx enumC364790ERx = new EnumC364790ERx("SHOW_LOADING", 0);
        SHOW_LOADING = enumC364790ERx;
        EnumC364790ERx enumC364790ERx2 = new EnumC364790ERx("SHOW_NET_ERROR", 1);
        SHOW_NET_ERROR = enumC364790ERx2;
        EnumC364790ERx enumC364790ERx3 = new EnumC364790ERx("SHOW_LIST", 2);
        SHOW_LIST = enumC364790ERx3;
        EnumC364790ERx enumC364790ERx4 = new EnumC364790ERx("SHOW_LOADING_WITHOUT_PROCESS", 3);
        SHOW_LOADING_WITHOUT_PROCESS = enumC364790ERx4;
        EnumC364790ERx[] enumC364790ERxArr = {enumC364790ERx, enumC364790ERx2, enumC364790ERx3, enumC364790ERx4};
        LL = enumC364790ERxArr;
        LLILLJJLI = new C2254308sP(enumC364790ERxArr);
    }

    public static EnumC364790ERx[] values() {
        return (EnumC364790ERx[]) LL.clone();
    }

    public static EnumC364790ERx valueOf(String str) {
        return (EnumC364790ERx) C08FF.LIZ(EnumC364790ERx.class, str);
    }

    public EnumC364790ERx(String str, int i) {
    }
}
