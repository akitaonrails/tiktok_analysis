package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ffr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1136250ffr {
    public static final EnumC1136250ffr DEQUEUE;
    public static final EnumC1136250ffr DOWNLOAD_EFFECT_BEFORE_ENQUEUE;
    public static final EnumC1136250ffr ENQUEUE;
    public static final /* synthetic */ EnumC1136250ffr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1136250ffr SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1136250ffr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1136250ffr enumC1136250ffr = new EnumC1136250ffr("DOWNLOAD_EFFECT_BEFORE_ENQUEUE", 0, "download_effect_before_enqueue");
        DOWNLOAD_EFFECT_BEFORE_ENQUEUE = enumC1136250ffr;
        EnumC1136250ffr enumC1136250ffr2 = new EnumC1136250ffr("ENQUEUE", 1, "enqueue");
        ENQUEUE = enumC1136250ffr2;
        EnumC1136250ffr enumC1136250ffr3 = new EnumC1136250ffr("DEQUEUE", 2, "dequeue");
        DEQUEUE = enumC1136250ffr3;
        EnumC1136250ffr enumC1136250ffr4 = new EnumC1136250ffr("SHOW", 3, "show");
        SHOW = enumC1136250ffr4;
        EnumC1136250ffr[] enumC1136250ffrArr = {enumC1136250ffr, enumC1136250ffr2, enumC1136250ffr3, enumC1136250ffr4};
        LLILLJJLI = enumC1136250ffrArr;
        LLILLL = new C2254308sP(enumC1136250ffrArr);
    }

    public static EnumC1136250ffr[] values() {
        return (EnumC1136250ffr[]) LLILLJJLI.clone();
    }

    public final String getPhase() {
        return this.LL;
    }

    public static EnumC1136250ffr valueOf(String str) {
        return (EnumC1136250ffr) C08FF.LIZ(EnumC1136250ffr.class, str);
    }

    public EnumC1136250ffr(String str, int i, String str2) {
        this.LL = str2;
    }
}
