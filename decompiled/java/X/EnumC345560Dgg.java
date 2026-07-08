package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC345560Dgg {
    public static final /* synthetic */ EnumC345560Dgg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC345560Dgg TYPE_NONE_SLIDE;
    public static final EnumC345560Dgg TYPE_SLIDE_FOLLOW;
    public static final EnumC345560Dgg TYPE_SLIDE_GO;

    public static InterfaceC2044707zh<EnumC345560Dgg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC345560Dgg enumC345560Dgg = new EnumC345560Dgg("TYPE_SLIDE_FOLLOW", 0);
        TYPE_SLIDE_FOLLOW = enumC345560Dgg;
        EnumC345560Dgg enumC345560Dgg2 = new EnumC345560Dgg("TYPE_SLIDE_GO", 1);
        TYPE_SLIDE_GO = enumC345560Dgg2;
        EnumC345560Dgg enumC345560Dgg3 = new EnumC345560Dgg("TYPE_NONE_SLIDE", 2);
        TYPE_NONE_SLIDE = enumC345560Dgg3;
        EnumC345560Dgg[] enumC345560DggArr = {enumC345560Dgg, enumC345560Dgg2, enumC345560Dgg3};
        LL = enumC345560DggArr;
        LLILLJJLI = new C2254308sP(enumC345560DggArr);
    }

    public static EnumC345560Dgg[] values() {
        return (EnumC345560Dgg[]) LL.clone();
    }

    public static EnumC345560Dgg valueOf(String str) {
        return (EnumC345560Dgg) C08FF.LIZ(EnumC345560Dgg.class, str);
    }

    public EnumC345560Dgg(String str, int i) {
    }
}
