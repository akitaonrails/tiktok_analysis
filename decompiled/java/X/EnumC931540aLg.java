package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC931540aLg {
    public static final EnumC931540aLg CALLING;
    public static final EnumC931540aLg IDLE;
    public static final /* synthetic */ EnumC931540aLg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC931540aLg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC931540aLg enumC931540aLg = new EnumC931540aLg("IDLE", 0);
        IDLE = enumC931540aLg;
        EnumC931540aLg enumC931540aLg2 = new EnumC931540aLg("CALLING", 1);
        CALLING = enumC931540aLg2;
        EnumC931540aLg[] enumC931540aLgArr = {enumC931540aLg, enumC931540aLg2};
        LL = enumC931540aLgArr;
        LLILLJJLI = new C2254308sP(enumC931540aLgArr);
    }

    public static EnumC931540aLg[] values() {
        return (EnumC931540aLg[]) LL.clone();
    }

    public static EnumC931540aLg valueOf(String str) {
        return (EnumC931540aLg) C08FF.LIZ(EnumC931540aLg.class, str);
    }

    public EnumC931540aLg(String str, int i) {
    }
}
