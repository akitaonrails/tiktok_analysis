package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989707qp {
    public static final EnumC1989707qp EDIT_ROOT;
    public static final /* synthetic */ EnumC1989707qp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1989707qp STICKER;

    public static InterfaceC2044707zh<EnumC1989707qp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1989707qp enumC1989707qp = new EnumC1989707qp("EDIT_ROOT", 0);
        EDIT_ROOT = enumC1989707qp;
        EnumC1989707qp enumC1989707qp2 = new EnumC1989707qp("STICKER", 1);
        STICKER = enumC1989707qp2;
        EnumC1989707qp[] enumC1989707qpArr = {enumC1989707qp, enumC1989707qp2};
        LL = enumC1989707qpArr;
        LLILLJJLI = new C2254308sP(enumC1989707qpArr);
    }

    public static EnumC1989707qp[] values() {
        return (EnumC1989707qp[]) LL.clone();
    }

    public static EnumC1989707qp valueOf(String str) {
        return (EnumC1989707qp) C08FF.LIZ(EnumC1989707qp.class, str);
    }

    public EnumC1989707qp(String str, int i) {
    }
}
