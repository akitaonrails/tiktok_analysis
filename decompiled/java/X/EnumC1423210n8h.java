package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1423210n8h {
    public static final EnumC1423210n8h BACK;
    public static final EnumC1423210n8h EXIT;
    public static final /* synthetic */ EnumC1423210n8h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1423210n8h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1423210n8h enumC1423210n8h = new EnumC1423210n8h("BACK", 0);
        BACK = enumC1423210n8h;
        EnumC1423210n8h enumC1423210n8h2 = new EnumC1423210n8h("EXIT", 1);
        EXIT = enumC1423210n8h2;
        EnumC1423210n8h[] enumC1423210n8hArr = {enumC1423210n8h, enumC1423210n8h2};
        LL = enumC1423210n8hArr;
        LLILLJJLI = new C2254308sP(enumC1423210n8hArr);
    }

    public static EnumC1423210n8h[] values() {
        return (EnumC1423210n8h[]) LL.clone();
    }

    public static EnumC1423210n8h valueOf(String str) {
        return (EnumC1423210n8h) C08FF.LIZ(EnumC1423210n8h.class, str);
    }

    public EnumC1423210n8h(String str, int i) {
    }
}
