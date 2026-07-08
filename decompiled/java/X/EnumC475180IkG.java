package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC475180IkG {
    public static final EnumC475180IkG HANGOUT_LOADED_END;
    public static final /* synthetic */ EnumC475180IkG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC475180IkG STREAM_END;
    public static final EnumC475180IkG TAB_HIDE;
    public static final EnumC475180IkG TAB_VISIBLE;
    public static final EnumC475180IkG WIDGET_LOADED_END;

    public static InterfaceC2044707zh<EnumC475180IkG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC475180IkG enumC475180IkG = new EnumC475180IkG("STREAM_END", 0);
        STREAM_END = enumC475180IkG;
        EnumC475180IkG enumC475180IkG2 = new EnumC475180IkG("WIDGET_LOADED_END", 1);
        WIDGET_LOADED_END = enumC475180IkG2;
        EnumC475180IkG enumC475180IkG3 = new EnumC475180IkG("HANGOUT_LOADED_END", 2);
        HANGOUT_LOADED_END = enumC475180IkG3;
        EnumC475180IkG enumC475180IkG4 = new EnumC475180IkG("TAB_VISIBLE", 3);
        TAB_VISIBLE = enumC475180IkG4;
        EnumC475180IkG enumC475180IkG5 = new EnumC475180IkG("TAB_HIDE", 4);
        TAB_HIDE = enumC475180IkG5;
        EnumC475180IkG[] enumC475180IkGArr = {enumC475180IkG, enumC475180IkG2, enumC475180IkG3, enumC475180IkG4, enumC475180IkG5};
        LL = enumC475180IkGArr;
        LLILLJJLI = new C2254308sP(enumC475180IkGArr);
    }

    public static EnumC475180IkG[] values() {
        return (EnumC475180IkG[]) LL.clone();
    }

    public static EnumC475180IkG valueOf(String str) {
        return (EnumC475180IkG) C08FF.LIZ(EnumC475180IkG.class, str);
    }

    public EnumC475180IkG(String str, int i) {
    }
}
