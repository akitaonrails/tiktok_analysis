package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0izy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1264040izy {
    public static final EnumC1264040izy DETAIL;
    public static final /* synthetic */ EnumC1264040izy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1264040izy NORMAL;
    public static final EnumC1264040izy NOW_POST;

    public static InterfaceC2044707zh<EnumC1264040izy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1264040izy enumC1264040izy = new EnumC1264040izy("NORMAL", 0);
        NORMAL = enumC1264040izy;
        EnumC1264040izy enumC1264040izy2 = new EnumC1264040izy("DETAIL", 1);
        DETAIL = enumC1264040izy2;
        EnumC1264040izy enumC1264040izy3 = new EnumC1264040izy("NOW_POST", 2);
        NOW_POST = enumC1264040izy3;
        EnumC1264040izy[] enumC1264040izyArr = {enumC1264040izy, enumC1264040izy2, enumC1264040izy3};
        LL = enumC1264040izyArr;
        LLILLJJLI = new C2254308sP(enumC1264040izyArr);
    }

    public static EnumC1264040izy[] values() {
        return (EnumC1264040izy[]) LL.clone();
    }

    public static EnumC1264040izy valueOf(String str) {
        return (EnumC1264040izy) C08FF.LIZ(EnumC1264040izy.class, str);
    }

    public EnumC1264040izy(String str, int i) {
    }
}
