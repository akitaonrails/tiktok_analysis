package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1390870mIX {
    public static final EnumC1390870mIX DIALOG;
    public static final /* synthetic */ EnumC1390870mIX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1390870mIX NOTICE;
    public static final EnumC1390870mIX PANEL;
    public static final EnumC1390870mIX SHEET;

    public static InterfaceC2044707zh<EnumC1390870mIX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1390870mIX enumC1390870mIX = new EnumC1390870mIX("DIALOG", 0);
        DIALOG = enumC1390870mIX;
        EnumC1390870mIX enumC1390870mIX2 = new EnumC1390870mIX("PANEL", 1);
        PANEL = enumC1390870mIX2;
        EnumC1390870mIX enumC1390870mIX3 = new EnumC1390870mIX("SHEET", 2);
        SHEET = enumC1390870mIX3;
        EnumC1390870mIX enumC1390870mIX4 = new EnumC1390870mIX("NOTICE", 3);
        NOTICE = enumC1390870mIX4;
        EnumC1390870mIX[] enumC1390870mIXArr = {enumC1390870mIX, enumC1390870mIX2, enumC1390870mIX3, enumC1390870mIX4};
        LL = enumC1390870mIXArr;
        LLILLJJLI = new C2254308sP(enumC1390870mIXArr);
    }

    public static EnumC1390870mIX[] values() {
        return (EnumC1390870mIX[]) LL.clone();
    }

    public static EnumC1390870mIX valueOf(String str) {
        return (EnumC1390870mIX) C08FF.LIZ(EnumC1390870mIX.class, str);
    }

    public EnumC1390870mIX(String str, int i) {
    }
}
