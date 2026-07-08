package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC680300QmK implements C1D61 {
    public static final /* synthetic */ EnumC680300QmK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC680300QmK ON_AUDIO_RESOURCE_LOADED;
    public static final EnumC680300QmK ON_BIND;
    public static final EnumC680300QmK ON_HOLDER_PAUSE;
    public static final EnumC680300QmK ON_HOLDER_RESUME;
    public static final EnumC680300QmK ON_SCREEN_ROTATE_LANDSCAPE;
    public static final EnumC680300QmK ON_SCREEN_ROTATE_PORTRAIT;
    public static final EnumC680300QmK ON_VIEWHOLDER_SELECTED;
    public static final EnumC680300QmK ON_VIEWHOLDER_UNSELECTED;
    public static final EnumC680300QmK UN_BIND;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC680300QmK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC680300QmK enumC680300QmK = new EnumC680300QmK("ON_HOLDER_PAUSE", 0);
        ON_HOLDER_PAUSE = enumC680300QmK;
        EnumC680300QmK enumC680300QmK2 = new EnumC680300QmK("ON_VIEWHOLDER_SELECTED", 1);
        ON_VIEWHOLDER_SELECTED = enumC680300QmK2;
        EnumC680300QmK enumC680300QmK3 = new EnumC680300QmK("ON_VIEWHOLDER_UNSELECTED", 2);
        ON_VIEWHOLDER_UNSELECTED = enumC680300QmK3;
        EnumC680300QmK enumC680300QmK4 = new EnumC680300QmK("ON_HOLDER_RESUME", 3);
        ON_HOLDER_RESUME = enumC680300QmK4;
        EnumC680300QmK enumC680300QmK5 = new EnumC680300QmK("ON_SCREEN_ROTATE_LANDSCAPE", 4);
        ON_SCREEN_ROTATE_LANDSCAPE = enumC680300QmK5;
        EnumC680300QmK enumC680300QmK6 = new EnumC680300QmK("ON_SCREEN_ROTATE_PORTRAIT", 5);
        ON_SCREEN_ROTATE_PORTRAIT = enumC680300QmK6;
        EnumC680300QmK enumC680300QmK7 = new EnumC680300QmK("UN_BIND", 6);
        UN_BIND = enumC680300QmK7;
        EnumC680300QmK enumC680300QmK8 = new EnumC680300QmK("ON_BIND", 7);
        ON_BIND = enumC680300QmK8;
        EnumC680300QmK enumC680300QmK9 = new EnumC680300QmK("ON_AUDIO_RESOURCE_LOADED", 8);
        ON_AUDIO_RESOURCE_LOADED = enumC680300QmK9;
        EnumC680300QmK[] enumC680300QmKArr = {enumC680300QmK, enumC680300QmK2, enumC680300QmK3, enumC680300QmK4, enumC680300QmK5, enumC680300QmK6, enumC680300QmK7, enumC680300QmK8, enumC680300QmK9};
        LLILLJJLI = enumC680300QmKArr;
        LLILLL = new C2254308sP(enumC680300QmKArr);
    }

    public static EnumC680300QmK[] values() {
        return (EnumC680300QmK[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC680300QmK valueOf(String str) {
        return (EnumC680300QmK) C08FF.LIZ(EnumC680300QmK.class, str);
    }

    public EnumC680300QmK(String str, int i) {
    }
}
