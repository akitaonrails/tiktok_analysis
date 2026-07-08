package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0msU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1413160msU {
    public static final /* synthetic */ EnumC1413160msU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1413160msU NONE;
    public static final EnumC1413160msU SLIDESHOW;
    public static final EnumC1413160msU TEMPLATE;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1413160msU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1413160msU enumC1413160msU = new EnumC1413160msU("NONE", 0, 0);
        NONE = enumC1413160msU;
        EnumC1413160msU enumC1413160msU2 = new EnumC1413160msU("SLIDESHOW", 1, 1);
        SLIDESHOW = enumC1413160msU2;
        EnumC1413160msU enumC1413160msU3 = new EnumC1413160msU("TEMPLATE", 2, 2);
        TEMPLATE = enumC1413160msU3;
        EnumC1413160msU[] enumC1413160msUArr = {enumC1413160msU, enumC1413160msU2, enumC1413160msU3};
        LLILLJJLI = enumC1413160msUArr;
        LLILLL = new C2254308sP(enumC1413160msUArr);
    }

    public static EnumC1413160msU[] values() {
        return (EnumC1413160msU[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C1413170msV.LIZ[ordinal()];
        if (i == 1) {
            return "multi_photo";
        }
        if (i == 2) {
            return "slideshow";
        }
        if (i == 3) {
            return "autocut";
        }
        throw new C1954807lC();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1413160msU valueOf(String str) {
        return (EnumC1413160msU) C08FF.LIZ(EnumC1413160msU.class, str);
    }

    public EnumC1413160msU(String str, int i, int i2) {
        this.LL = i2;
    }
}
