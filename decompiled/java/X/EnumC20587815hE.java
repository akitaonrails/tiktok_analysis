package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20587815hE {
    public static final /* synthetic */ EnumC20587815hE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20587815hE PUBLISH;
    public static final EnumC20587815hE SHOOT;
    public static final EnumC20587815hE VIDEOCUT;
    public static final EnumC20587815hE VIDEOEDIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20587815hE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20587815hE enumC20587815hE = new EnumC20587815hE("SHOOT", 0, 0);
        SHOOT = enumC20587815hE;
        EnumC20587815hE enumC20587815hE2 = new EnumC20587815hE("VIDEOEDIT", 1, 1);
        VIDEOEDIT = enumC20587815hE2;
        EnumC20587815hE enumC20587815hE3 = new EnumC20587815hE("VIDEOCUT", 2, 2);
        VIDEOCUT = enumC20587815hE3;
        EnumC20587815hE enumC20587815hE4 = new EnumC20587815hE("PUBLISH", 3, 3);
        PUBLISH = enumC20587815hE4;
        EnumC20587815hE[] enumC20587815hEArr = {enumC20587815hE, enumC20587815hE2, enumC20587815hE3, enumC20587815hE4};
        LLILLJJLI = enumC20587815hEArr;
        LLILLL = new C2254308sP(enumC20587815hEArr);
    }

    public static EnumC20587815hE[] values() {
        return (EnumC20587815hE[]) LLILLJJLI.clone();
    }

    public final int getStage() {
        return this.LL;
    }

    public static EnumC20587815hE valueOf(String str) {
        return (EnumC20587815hE) C08FF.LIZ(EnumC20587815hE.class, str);
    }

    public EnumC20587815hE(String str, int i, int i2) {
        this.LL = i2;
    }
}
