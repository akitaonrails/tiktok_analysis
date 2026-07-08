package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1504205ui {
    public static final C1504105uh Companion;
    public static final EnumC1504205ui GROUP;
    public static final /* synthetic */ EnumC1504205ui[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1504205ui SINGLE;
    public static final EnumC1504205ui UNKNOWN;

    public static InterfaceC2044707zh<EnumC1504205ui> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.05uh] */
    static {
        EnumC1504205ui enumC1504205ui = new EnumC1504205ui("UNKNOWN", 0);
        UNKNOWN = enumC1504205ui;
        EnumC1504205ui enumC1504205ui2 = new EnumC1504205ui("SINGLE", 1);
        SINGLE = enumC1504205ui2;
        EnumC1504205ui enumC1504205ui3 = new EnumC1504205ui("GROUP", 2);
        GROUP = enumC1504205ui3;
        EnumC1504205ui[] enumC1504205uiArr = {enumC1504205ui, enumC1504205ui2, enumC1504205ui3};
        LL = enumC1504205uiArr;
        LLILLJJLI = new C2254308sP(enumC1504205uiArr);
        Companion = new Object() { // from class: X.05uh
        };
    }

    public static EnumC1504205ui[] values() {
        return (EnumC1504205ui[]) LL.clone();
    }

    public final InterfaceC1502705uT getTypingBuffer$im_common_core_release() {
        int i = C1504305uj.LIZ[ordinal()];
        if (i == 1) {
            return new C1808570xAF();
        }
        if (i == 2) {
            return new C1808570xAF();
        }
        if (i == 3) {
            return new C1808570xAF();
        }
        throw new C1954807lC();
    }

    public static EnumC1504205ui valueOf(String str) {
        return (EnumC1504205ui) C08FF.LIZ(EnumC1504205ui.class, str);
    }

    public EnumC1504205ui(String str, int i) {
    }
}
