package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779530wPP {
    public static final EnumC1779530wPP DONE;
    public static final EnumC1779530wPP IDLE;
    public static final /* synthetic */ EnumC1779530wPP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779530wPP PREPARE_SHOW;
    public static final EnumC1779530wPP SHOWING;

    public static InterfaceC2044707zh<EnumC1779530wPP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779530wPP enumC1779530wPP = new EnumC1779530wPP("IDLE", 0);
        IDLE = enumC1779530wPP;
        EnumC1779530wPP enumC1779530wPP2 = new EnumC1779530wPP("PREPARE_SHOW", 1);
        PREPARE_SHOW = enumC1779530wPP2;
        EnumC1779530wPP enumC1779530wPP3 = new EnumC1779530wPP("SHOWING", 2);
        SHOWING = enumC1779530wPP3;
        EnumC1779530wPP enumC1779530wPP4 = new EnumC1779530wPP("DONE", 3);
        DONE = enumC1779530wPP4;
        EnumC1779530wPP[] enumC1779530wPPArr = {enumC1779530wPP, enumC1779530wPP2, enumC1779530wPP3, enumC1779530wPP4};
        LL = enumC1779530wPPArr;
        LLILLJJLI = new C2254308sP(enumC1779530wPPArr);
    }

    public static EnumC1779530wPP[] values() {
        return (EnumC1779530wPP[]) LL.clone();
    }

    public static EnumC1779530wPP valueOf(String str) {
        return (EnumC1779530wPP) C08FF.LIZ(EnumC1779530wPP.class, str);
    }

    public EnumC1779530wPP(String str, int i) {
    }
}
