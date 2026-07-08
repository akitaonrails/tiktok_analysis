package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.115h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC194439115h {
    public static final EnumC194439115h DELETED;
    public static final EnumC194439115h INITIAL;
    public static final /* synthetic */ EnumC194439115h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC194439115h PAUSED;
    public static final EnumC194439115h PREVIEW;
    public static final EnumC194439115h RECORDING;
    public static final EnumC194439115h SENDING;

    public static InterfaceC2044707zh<EnumC194439115h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC194439115h enumC194439115h = new EnumC194439115h("INITIAL", 0);
        INITIAL = enumC194439115h;
        EnumC194439115h enumC194439115h2 = new EnumC194439115h(C1649000t0s.LLLJIL, 1);
        RECORDING = enumC194439115h2;
        EnumC194439115h enumC194439115h3 = new EnumC194439115h("PAUSED", 2);
        PAUSED = enumC194439115h3;
        EnumC194439115h enumC194439115h4 = new EnumC194439115h("PREVIEW", 3);
        PREVIEW = enumC194439115h4;
        EnumC194439115h enumC194439115h5 = new EnumC194439115h("SENDING", 4);
        SENDING = enumC194439115h5;
        EnumC194439115h enumC194439115h6 = new EnumC194439115h("DELETED", 5);
        DELETED = enumC194439115h6;
        EnumC194439115h[] enumC194439115hArr = {enumC194439115h, enumC194439115h2, enumC194439115h3, enumC194439115h4, enumC194439115h5, enumC194439115h6};
        LL = enumC194439115hArr;
        LLILLJJLI = new C2254308sP(enumC194439115hArr);
    }

    public static EnumC194439115h[] values() {
        return (EnumC194439115h[]) LL.clone();
    }

    public static EnumC194439115h valueOf(String str) {
        return (EnumC194439115h) C08FF.LIZ(EnumC194439115h.class, str);
    }

    public EnumC194439115h(String str, int i) {
    }
}
