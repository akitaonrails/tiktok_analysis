package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2250111D5d {
    public static final EnumC2250111D5d BASS;
    public static final EnumC2250111D5d FULL;
    public static final /* synthetic */ EnumC2250111D5d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2250111D5d MID;
    public static final EnumC2250111D5d OFF;
    public static final EnumC2250111D5d TREBLE;

    public static InterfaceC2044707zh<EnumC2250111D5d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2250111D5d enumC2250111D5d = new EnumC2250111D5d("OFF", 0);
        OFF = enumC2250111D5d;
        EnumC2250111D5d enumC2250111D5d2 = new EnumC2250111D5d("BASS", 1);
        BASS = enumC2250111D5d2;
        EnumC2250111D5d enumC2250111D5d3 = new EnumC2250111D5d("MID", 2);
        MID = enumC2250111D5d3;
        EnumC2250111D5d enumC2250111D5d4 = new EnumC2250111D5d("TREBLE", 3);
        TREBLE = enumC2250111D5d4;
        EnumC2250111D5d enumC2250111D5d5 = new EnumC2250111D5d("FULL", 4);
        FULL = enumC2250111D5d5;
        EnumC2250111D5d[] enumC2250111D5dArr = {enumC2250111D5d, enumC2250111D5d2, enumC2250111D5d3, enumC2250111D5d4, enumC2250111D5d5};
        LL = enumC2250111D5dArr;
        LLILLJJLI = new C2254308sP(enumC2250111D5dArr);
    }

    public static EnumC2250111D5d[] values() {
        return (EnumC2250111D5d[]) LL.clone();
    }

    public static EnumC2250111D5d valueOf(String str) {
        return (EnumC2250111D5d) C08FF.LIZ(EnumC2250111D5d.class, str);
    }

    public EnumC2250111D5d(String str, int i) {
    }

    public final float resolve(float f, float f2, float f3) {
        int i = C2250121D5e.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return Math.max(f, Math.max(f2, f3));
                        }
                        throw new C1954807lC();
                    }
                    return f3;
                }
                return f2;
            }
            return f;
        }
        return 0.0f;
    }
}
