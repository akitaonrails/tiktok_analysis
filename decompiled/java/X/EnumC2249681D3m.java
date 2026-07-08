package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249681D3m implements InterfaceC1641620soy {
    public static final EnumC2249681D3m DUET;
    public static final EnumC2249681D3m EDIT;
    public static final /* synthetic */ EnumC2249681D3m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2249681D3m SHOOT;
    public static final EnumC2249681D3m STITCH;
    public static final EnumC2249681D3m TTEP_PREVIEW;

    public static InterfaceC2044707zh<EnumC2249681D3m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2249681D3m enumC2249681D3m = new EnumC2249681D3m("SHOOT", 0);
        SHOOT = enumC2249681D3m;
        EnumC2249681D3m enumC2249681D3m2 = new EnumC2249681D3m("DUET", 1);
        DUET = enumC2249681D3m2;
        EnumC2249681D3m enumC2249681D3m3 = new EnumC2249681D3m("STITCH", 2);
        STITCH = enumC2249681D3m3;
        EnumC2249681D3m enumC2249681D3m4 = new EnumC2249681D3m("TTEP_PREVIEW", 3);
        TTEP_PREVIEW = enumC2249681D3m4;
        EnumC2249681D3m enumC2249681D3m5 = new EnumC2249681D3m("EDIT", 4);
        EDIT = enumC2249681D3m5;
        EnumC2249681D3m[] enumC2249681D3mArr = {enumC2249681D3m, enumC2249681D3m2, enumC2249681D3m3, enumC2249681D3m4, enumC2249681D3m5};
        LL = enumC2249681D3mArr;
        LLILLJJLI = new C2254308sP(enumC2249681D3mArr);
    }

    public static EnumC2249681D3m[] values() {
        return (EnumC2249681D3m[]) LL.clone();
    }

    public static EnumC2249681D3m valueOf(String str) {
        return (EnumC2249681D3m) C08FF.LIZ(EnumC2249681D3m.class, str);
    }

    public EnumC2249681D3m(String str, int i) {
    }
}
