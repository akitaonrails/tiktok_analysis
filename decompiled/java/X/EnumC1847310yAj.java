package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1847310yAj {
    public static final EnumC1847310yAj HOST_LINK;
    public static final /* synthetic */ EnumC1847310yAj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1847310yAj PAID_EVENT;
    public static final EnumC1847310yAj PAUSE_EVENT;
    public static final EnumC1847310yAj PAUSE_LIVE;
    public static final EnumC1847310yAj SUB_ONLY_AUDIENCE;

    public static InterfaceC2044707zh<EnumC1847310yAj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1847310yAj enumC1847310yAj = new EnumC1847310yAj("PAUSE_LIVE", 0);
        PAUSE_LIVE = enumC1847310yAj;
        EnumC1847310yAj enumC1847310yAj2 = new EnumC1847310yAj("PAUSE_EVENT", 1);
        PAUSE_EVENT = enumC1847310yAj2;
        EnumC1847310yAj enumC1847310yAj3 = new EnumC1847310yAj("PAID_EVENT", 2);
        PAID_EVENT = enumC1847310yAj3;
        EnumC1847310yAj enumC1847310yAj4 = new EnumC1847310yAj("HOST_LINK", 3);
        HOST_LINK = enumC1847310yAj4;
        EnumC1847310yAj enumC1847310yAj5 = new EnumC1847310yAj("SUB_ONLY_AUDIENCE", 4);
        SUB_ONLY_AUDIENCE = enumC1847310yAj5;
        EnumC1847310yAj[] enumC1847310yAjArr = {enumC1847310yAj, enumC1847310yAj2, enumC1847310yAj3, enumC1847310yAj4, enumC1847310yAj5};
        LL = enumC1847310yAjArr;
        LLILLJJLI = new C2254308sP(enumC1847310yAjArr);
    }

    public static EnumC1847310yAj[] values() {
        return (EnumC1847310yAj[]) LL.clone();
    }

    public static EnumC1847310yAj valueOf(String str) {
        return (EnumC1847310yAj) C08FF.LIZ(EnumC1847310yAj.class, str);
    }

    public EnumC1847310yAj(String str, int i) {
    }
}
