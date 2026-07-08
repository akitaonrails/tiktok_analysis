package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC380250EvX {
    public static final EnumC380250EvX ALBUM;
    public static final /* synthetic */ EnumC380250EvX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC380250EvX MATERIAL;

    public static InterfaceC2044707zh<EnumC380250EvX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC380250EvX enumC380250EvX = new EnumC380250EvX("ALBUM", 0);
        ALBUM = enumC380250EvX;
        EnumC380250EvX enumC380250EvX2 = new EnumC380250EvX("MATERIAL", 1);
        MATERIAL = enumC380250EvX2;
        EnumC380250EvX[] enumC380250EvXArr = {enumC380250EvX, enumC380250EvX2};
        LL = enumC380250EvXArr;
        LLILLJJLI = new C2254308sP(enumC380250EvXArr);
    }

    public static EnumC380250EvX[] values() {
        return (EnumC380250EvX[]) LL.clone();
    }

    public static EnumC380250EvX valueOf(String str) {
        return (EnumC380250EvX) C08FF.LIZ(EnumC380250EvX.class, str);
    }

    public EnumC380250EvX(String str, int i) {
    }
}
