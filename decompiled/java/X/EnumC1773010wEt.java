package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1773010wEt {
    public static final EnumC1773010wEt LL;
    public static final EnumC1773010wEt LLILLJJLI;
    public static final EnumC1773010wEt LLILLL;
    public static final /* synthetic */ EnumC1773010wEt[] LLILZ;

    static {
        EnumC1773010wEt enumC1773010wEt = new EnumC1773010wEt("ITEM_BIND_START", 0);
        LL = enumC1773010wEt;
        EnumC1773010wEt enumC1773010wEt2 = new EnumC1773010wEt("ITEM_RENDER_END", 1);
        LLILLJJLI = enumC1773010wEt2;
        EnumC1773010wEt enumC1773010wEt3 = new EnumC1773010wEt("ITEM_RENDER_ERROR", 2);
        LLILLL = enumC1773010wEt3;
        EnumC1773010wEt[] enumC1773010wEtArr = {enumC1773010wEt, enumC1773010wEt2, enumC1773010wEt3};
        LLILZ = enumC1773010wEtArr;
        new C2254308sP(enumC1773010wEtArr);
    }

    public static EnumC1773010wEt[] values() {
        return (EnumC1773010wEt[]) LLILZ.clone();
    }

    public static EnumC1773010wEt valueOf(String str) {
        return (EnumC1773010wEt) C08FF.LIZ(EnumC1773010wEt.class, str);
    }

    public EnumC1773010wEt(String str, int i) {
    }
}
