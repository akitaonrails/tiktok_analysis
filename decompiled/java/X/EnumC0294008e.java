package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0294008e {
    public static final EnumC0294008e Canvas;
    public static final /* synthetic */ EnumC0294008e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0294008e Preview;
    public static final EnumC0294008e TemplatePreview;

    public static InterfaceC2044707zh<EnumC0294008e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0294008e enumC0294008e = new EnumC0294008e("Canvas", 0);
        Canvas = enumC0294008e;
        EnumC0294008e enumC0294008e2 = new EnumC0294008e("Preview", 1);
        Preview = enumC0294008e2;
        EnumC0294008e enumC0294008e3 = new EnumC0294008e("TemplatePreview", 2);
        TemplatePreview = enumC0294008e3;
        EnumC0294008e[] enumC0294008eArr = {enumC0294008e, enumC0294008e2, enumC0294008e3};
        LL = enumC0294008eArr;
        LLILLJJLI = new C2254308sP(enumC0294008eArr);
    }

    public static EnumC0294008e[] values() {
        return (EnumC0294008e[]) LL.clone();
    }

    public static EnumC0294008e valueOf(String str) {
        return (EnumC0294008e) C08FF.LIZ(EnumC0294008e.class, str);
    }

    public EnumC0294008e(String str, int i) {
    }
}
