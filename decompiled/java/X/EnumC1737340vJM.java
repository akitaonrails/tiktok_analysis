package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class EnumC1737340vJM {
    public static final EnumC1737340vJM CAMERA;
    public static final C1737320vJK Companion;
    public static final /* synthetic */ EnumC1737340vJM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1737340vJM LOCAL;
    public static final EnumC1737340vJM NOT_SET;
    public static final EnumC1737340vJM OFFICIAL;
    public final int LL;

    public EnumC1737340vJM() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1737340vJM> getEntries() {
        return LLILLL;
    }

    public abstract String getIconAssetSource();

    static {
        EnumC1737340vJM enumC1737340vJM = new EnumC1737340vJM() { // from class: X.0vJU
            @Override // X.EnumC1737340vJM
            public final String getIconAssetSource() {
                return "";
            }
        };
        NOT_SET = enumC1737340vJM;
        EnumC1737340vJM enumC1737340vJM2 = new EnumC1737340vJM() { // from class: X.0vJW
            @Override // X.EnumC1737340vJM
            public final String getIconAssetSource() {
                return "official";
            }
        };
        OFFICIAL = enumC1737340vJM2;
        EnumC1737340vJM enumC1737340vJM3 = new EnumC1737340vJM() { // from class: X.0vJV
            @Override // X.EnumC1737340vJM
            public final String getIconAssetSource() {
                return "upload";
            }
        };
        LOCAL = enumC1737340vJM3;
        EnumC1737340vJM enumC1737340vJM4 = new EnumC1737340vJM() { // from class: X.0vJT
            @Override // X.EnumC1737340vJM
            public final String getIconAssetSource() {
                return "camera";
            }
        };
        CAMERA = enumC1737340vJM4;
        EnumC1737340vJM[] enumC1737340vJMArr = {enumC1737340vJM, enumC1737340vJM2, enumC1737340vJM3, enumC1737340vJM4};
        LLILLJJLI = enumC1737340vJMArr;
        LLILLL = new C2254308sP(enumC1737340vJMArr);
        Companion = new C1737320vJK();
    }

    public static EnumC1737340vJM[] values() {
        return (EnumC1737340vJM[]) LLILLJJLI.clone();
    }

    public final int getIntValue() {
        return this.LL;
    }

    public static EnumC1737340vJM valueOf(String str) {
        return (EnumC1737340vJM) C08FF.LIZ(EnumC1737340vJM.class, str);
    }

    public EnumC1737340vJM(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = i2;
    }
}
