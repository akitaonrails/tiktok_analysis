package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19367310pr {
    public static final /* synthetic */ EnumC19367310pr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19367310pr RECORD_ON_CREATE;
    public static final EnumC19367310pr RECORD_ON_DESTROY;
    public static final EnumC19367310pr RECORD_ON_FIRST_FRAME;
    public static final EnumC19367310pr RECORD_ON_NONE;
    public static final EnumC19367310pr RECORD_ON_PAUSE;
    public static final EnumC19367310pr RECORD_ON_RESUME;
    public static final EnumC19367310pr RECORD_ON_UI_SHOW;

    public static InterfaceC2044707zh<EnumC19367310pr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19367310pr enumC19367310pr = new EnumC19367310pr("RECORD_ON_NONE", 0);
        RECORD_ON_NONE = enumC19367310pr;
        EnumC19367310pr enumC19367310pr2 = new EnumC19367310pr("RECORD_ON_CREATE", 1);
        RECORD_ON_CREATE = enumC19367310pr2;
        EnumC19367310pr enumC19367310pr3 = new EnumC19367310pr("RECORD_ON_RESUME", 2);
        RECORD_ON_RESUME = enumC19367310pr3;
        EnumC19367310pr enumC19367310pr4 = new EnumC19367310pr("RECORD_ON_PAUSE", 3);
        RECORD_ON_PAUSE = enumC19367310pr4;
        EnumC19367310pr enumC19367310pr5 = new EnumC19367310pr("RECORD_ON_FIRST_FRAME", 4);
        RECORD_ON_FIRST_FRAME = enumC19367310pr5;
        EnumC19367310pr enumC19367310pr6 = new EnumC19367310pr("RECORD_ON_UI_SHOW", 5);
        RECORD_ON_UI_SHOW = enumC19367310pr6;
        EnumC19367310pr enumC19367310pr7 = new EnumC19367310pr("RECORD_ON_DESTROY", 6);
        RECORD_ON_DESTROY = enumC19367310pr7;
        EnumC19367310pr[] enumC19367310prArr = {enumC19367310pr, enumC19367310pr2, enumC19367310pr3, enumC19367310pr4, enumC19367310pr5, enumC19367310pr6, enumC19367310pr7};
        LL = enumC19367310prArr;
        LLILLJJLI = new C2254308sP(enumC19367310prArr);
    }

    public static EnumC19367310pr[] values() {
        return (EnumC19367310pr[]) LL.clone();
    }

    public static EnumC19367310pr valueOf(String str) {
        return (EnumC19367310pr) C08FF.LIZ(EnumC19367310pr.class, str);
    }

    public EnumC19367310pr(String str, int i) {
    }
}
