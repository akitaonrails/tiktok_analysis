package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ybi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1864040ybi {
    public static final /* synthetic */ EnumC1864040ybi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1864040ybi ON_CREATE;
    public static final EnumC1864040ybi ON_CREATE_VIEW;
    public static final EnumC1864040ybi ON_DESTROY;
    public static final EnumC1864040ybi ON_DESTROY_VIEW;
    public static final EnumC1864040ybi ON_PAUSE;
    public static final EnumC1864040ybi ON_RESUME;
    public static final EnumC1864040ybi ON_START;
    public static final EnumC1864040ybi ON_STOP;
    public static final EnumC1864040ybi ON_VIEW_CREATED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1864040ybi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1864040ybi enumC1864040ybi = new EnumC1864040ybi("ON_CREATE", 0, "onCreate");
        ON_CREATE = enumC1864040ybi;
        EnumC1864040ybi enumC1864040ybi2 = new EnumC1864040ybi("ON_CREATE_VIEW", 1, "onCreateView");
        ON_CREATE_VIEW = enumC1864040ybi2;
        EnumC1864040ybi enumC1864040ybi3 = new EnumC1864040ybi("ON_VIEW_CREATED", 2, "onViewCreated");
        ON_VIEW_CREATED = enumC1864040ybi3;
        EnumC1864040ybi enumC1864040ybi4 = new EnumC1864040ybi("ON_START", 3, "onStart");
        ON_START = enumC1864040ybi4;
        EnumC1864040ybi enumC1864040ybi5 = new EnumC1864040ybi("ON_RESUME", 4, "onResume");
        ON_RESUME = enumC1864040ybi5;
        EnumC1864040ybi enumC1864040ybi6 = new EnumC1864040ybi("ON_PAUSE", 5, "onPause");
        ON_PAUSE = enumC1864040ybi6;
        EnumC1864040ybi enumC1864040ybi7 = new EnumC1864040ybi("ON_STOP", 6, "onStop");
        ON_STOP = enumC1864040ybi7;
        EnumC1864040ybi enumC1864040ybi8 = new EnumC1864040ybi("ON_DESTROY_VIEW", 7, "onDestroyView");
        ON_DESTROY_VIEW = enumC1864040ybi8;
        EnumC1864040ybi enumC1864040ybi9 = new EnumC1864040ybi("ON_DESTROY", 8, "onDestroy");
        ON_DESTROY = enumC1864040ybi9;
        EnumC1864040ybi[] enumC1864040ybiArr = {enumC1864040ybi, enumC1864040ybi2, enumC1864040ybi3, enumC1864040ybi4, enumC1864040ybi5, enumC1864040ybi6, enumC1864040ybi7, enumC1864040ybi8, enumC1864040ybi9};
        LLILLJJLI = enumC1864040ybiArr;
        LLILLL = new C2254308sP(enumC1864040ybiArr);
    }

    public static EnumC1864040ybi[] values() {
        return (EnumC1864040ybi[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1864040ybi valueOf(String str) {
        return (EnumC1864040ybi) C08FF.LIZ(EnumC1864040ybi.class, str);
    }

    public EnumC1864040ybi(String str, int i, String str2) {
        this.LL = str2;
    }
}
