package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20038113al {
    public static final EnumC20038113al InLayoutBlock;
    public static final EnumC20038113al InMeasureBlock;
    public static final /* synthetic */ EnumC20038113al[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20038113al NotUsed;

    public static InterfaceC2044707zh<EnumC20038113al> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC20038113al valueOf(String str) {
        return (EnumC20038113al) C08FF.LIZ(EnumC20038113al.class, str);
    }

    public static EnumC20038113al[] values() {
        return (EnumC20038113al[]) LL.clone();
    }

    static {
        EnumC20038113al enumC20038113al = new EnumC20038113al("InMeasureBlock", 0);
        InMeasureBlock = enumC20038113al;
        EnumC20038113al enumC20038113al2 = new EnumC20038113al("InLayoutBlock", 1);
        InLayoutBlock = enumC20038113al2;
        EnumC20038113al enumC20038113al3 = new EnumC20038113al("NotUsed", 2);
        NotUsed = enumC20038113al3;
        EnumC20038113al[] enumC20038113alArr = {enumC20038113al, enumC20038113al2, enumC20038113al3};
        LL = enumC20038113alArr;
        LLILLJJLI = new C2254308sP(enumC20038113alArr);
    }

    public EnumC20038113al(String str, int i) {
    }
}
