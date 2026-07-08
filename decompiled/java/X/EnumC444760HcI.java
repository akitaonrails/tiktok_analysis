package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class EnumC444760HcI implements InterfaceC439650HLv {
    public static final EnumC444760HcI ALL_DONE;
    public static final EnumC444760HcI INITIAL;
    public static final /* synthetic */ EnumC444760HcI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC444760HcI MUGSHOT_DETECTING;
    public static final EnumC444760HcI MUGSHOT_SUCCEED;
    public static final EnumC444760HcI MUGSHOT_TAKEN;
    public static final EnumC444760HcI PHOTO_UPLOADING;

    public EnumC444760HcI() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC444760HcI> getEntries() {
        return LLILLJJLI;
    }

    public AbstractC444400Hbi animation(boolean z) {
        return null;
    }

    public abstract /* synthetic */ C439640HLu detectConfig();

    @Override // X.InterfaceC439650HLv
    public int exitStep() {
        return 1;
    }

    public abstract /* synthetic */ C444820HcO hintWord();

    public abstract /* synthetic */ InterfaceC439650HLv nextStage();

    @Override // X.InterfaceC439650HLv
    public boolean noNeedDetection() {
        return false;
    }

    public abstract /* synthetic */ InterfaceC439650HLv previousStage();

    static {
        EnumC444760HcI enumC444760HcI = new EnumC444760HcI() { // from class: X.0HcL
            @Override // X.EnumC444760HcI
            public final InterfaceC439650HLv previousStage() {
                return null;
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final C439640HLu detectConfig() {
                return new C439640HLu(null, false, false, 7);
            }

            @Override // X.EnumC444760HcI
            public final C444820HcO hintWord() {
                return new C444820HcO();
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final InterfaceC439650HLv nextStage() {
                return EnumC444760HcI.MUGSHOT_DETECTING;
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final AbstractC444400Hbi animation(boolean z) {
                return C444450Hbn.LJI;
            }
        };
        INITIAL = enumC444760HcI;
        EnumC444760HcI enumC444760HcI2 = new EnumC444760HcI() { // from class: X.0HcJ
            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final C439640HLu detectConfig() {
                return new C439640HLu(EnumC1684560twE.FRONT_DETECTION, false, false, 14);
            }

            @Override // X.EnumC444760HcI
            public final C444820HcO hintWord() {
                return new C444820HcO();
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final InterfaceC439650HLv nextStage() {
                return EnumC444760HcI.MUGSHOT_SUCCEED;
            }

            @Override // X.EnumC444760HcI
            public final InterfaceC439650HLv previousStage() {
                return EnumC444760HcI.INITIAL;
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final AbstractC444400Hbi animation(boolean z) {
                return C444450Hbn.LJI;
            }
        };
        MUGSHOT_DETECTING = enumC444760HcI2;
        EnumC444760HcI enumC444760HcI3 = new EnumC444760HcI() { // from class: X.0HcK
            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final C439640HLu detectConfig() {
                return new C439640HLu(EnumC1684560twE.FRONT_DETECTION, false, false, 14);
            }

            @Override // X.EnumC444760HcI
            public final C444820HcO hintWord() {
                return new C444820HcO();
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final InterfaceC439650HLv nextStage() {
                return EnumC444760HcI.MUGSHOT_TAKEN;
            }

            @Override // X.EnumC444760HcI
            public final InterfaceC439650HLv previousStage() {
                return EnumC444760HcI.MUGSHOT_DETECTING;
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final AbstractC444400Hbi animation(boolean z) {
                return C444450Hbn.LJI;
            }
        };
        MUGSHOT_SUCCEED = enumC444760HcI3;
        EnumC444760HcI enumC444760HcI4 = new EnumC444760HcI() { // from class: X.0HcH
            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final C439640HLu detectConfig() {
                return new C439640HLu(null, false, true, 3);
            }

            @Override // X.EnumC444760HcI
            public final C444820HcO hintWord() {
                return new C444820HcO();
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final InterfaceC439650HLv nextStage() {
                return EnumC444760HcI.PHOTO_UPLOADING;
            }

            @Override // X.EnumC444760HcI
            public final InterfaceC439650HLv previousStage() {
                return EnumC444760HcI.MUGSHOT_SUCCEED;
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final AbstractC444400Hbi animation(boolean z) {
                return new AbstractC444400Hbi() { // from class: X.0Hbm
                    {
                        new C444460Hbo(AbstractC444400Hbi.LJFF);
                    }
                };
            }
        };
        MUGSHOT_TAKEN = enumC444760HcI4;
        EnumC444760HcI enumC444760HcI5 = new EnumC444760HcI() { // from class: X.0HcM
            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final C439640HLu detectConfig() {
                return new C439640HLu(null, true, false, 13);
            }

            @Override // X.EnumC444760HcI
            public final C444820HcO hintWord() {
                return new C444820HcO();
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final InterfaceC439650HLv nextStage() {
                return EnumC444760HcI.ALL_DONE;
            }

            @Override // X.EnumC444760HcI
            public final InterfaceC439650HLv previousStage() {
                return EnumC444760HcI.MUGSHOT_TAKEN;
            }
        };
        PHOTO_UPLOADING = enumC444760HcI5;
        EnumC444760HcI enumC444760HcI6 = new EnumC444760HcI() { // from class: X.0HcN
            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final InterfaceC439650HLv nextStage() {
                return null;
            }

            @Override // X.EnumC444760HcI, X.InterfaceC439650HLv
            public final C439640HLu detectConfig() {
                return new C439640HLu(null, false, false, 15);
            }

            @Override // X.EnumC444760HcI
            public final C444820HcO hintWord() {
                return new C444820HcO();
            }

            @Override // X.EnumC444760HcI
            public final InterfaceC439650HLv previousStage() {
                return EnumC444760HcI.PHOTO_UPLOADING;
            }
        };
        ALL_DONE = enumC444760HcI6;
        EnumC444760HcI[] enumC444760HcIArr = {enumC444760HcI, enumC444760HcI2, enumC444760HcI3, enumC444760HcI4, enumC444760HcI5, enumC444760HcI6};
        LL = enumC444760HcIArr;
        LLILLJJLI = new C2254308sP(enumC444760HcIArr);
    }

    public static EnumC444760HcI[] values() {
        return (EnumC444760HcI[]) LL.clone();
    }

    @Override // X.InterfaceC439650HLv
    public InterfaceC439650HLv getLastStage() {
        return ALL_DONE;
    }

    public static EnumC444760HcI valueOf(String str) {
        return (EnumC444760HcI) C08FF.LIZ(EnumC444760HcI.class, str);
    }

    public EnumC444760HcI(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
