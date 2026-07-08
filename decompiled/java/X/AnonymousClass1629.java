package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1629, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1629 {
    public static final AnonymousClass1629 CLICK_EXPAND;
    public static final AnonymousClass1629 LAND_ON_ITEM;
    public static final /* synthetic */ AnonymousClass1629[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass1629 SMART_LAZY_LOAD;
    public static final AnonymousClass1629 SWITCH_LANGUAGE;
    public static final AnonymousClass1629 TOGGLE_ENABLE;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass1629> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass1629 anonymousClass1629 = new AnonymousClass1629("CLICK_EXPAND", 0, "click_expand");
        CLICK_EXPAND = anonymousClass1629;
        AnonymousClass1629 anonymousClass16292 = new AnonymousClass1629("LAND_ON_ITEM", 1, "land_on_item");
        LAND_ON_ITEM = anonymousClass16292;
        AnonymousClass1629 anonymousClass16293 = new AnonymousClass1629("SMART_LAZY_LOAD", 2, "smart_lazy_load");
        SMART_LAZY_LOAD = anonymousClass16293;
        AnonymousClass1629 anonymousClass16294 = new AnonymousClass1629("SWITCH_LANGUAGE", 3, "switch_language");
        SWITCH_LANGUAGE = anonymousClass16294;
        AnonymousClass1629 anonymousClass16295 = new AnonymousClass1629("TOGGLE_ENABLE", 4, "toggle_enable");
        TOGGLE_ENABLE = anonymousClass16295;
        AnonymousClass1629[] anonymousClass1629Arr = {anonymousClass1629, anonymousClass16292, anonymousClass16293, anonymousClass16294, anonymousClass16295};
        LLILLJJLI = anonymousClass1629Arr;
        LLILLL = new C2254308sP(anonymousClass1629Arr);
    }

    public static AnonymousClass1629[] values() {
        return (AnonymousClass1629[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass1629 valueOf(String str) {
        return (AnonymousClass1629) C08FF.LIZ(AnonymousClass1629.class, str);
    }

    public AnonymousClass1629(String str, int i, String str2) {
        this.LL = str2;
    }
}
