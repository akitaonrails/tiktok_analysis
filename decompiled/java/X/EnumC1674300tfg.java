package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1674300tfg {
    public static final EnumC1674300tfg FIRST_TIME_ERROR;
    public static final EnumC1674300tfg FIRST_TIME_LOADING;
    public static final EnumC1674300tfg INITIAL;
    public static final /* synthetic */ EnumC1674300tfg[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1674300tfg LOADED_COMPLETE;
    public static final EnumC1674300tfg LOADED_EMPTY;
    public static final EnumC1674300tfg LOADED_HAS_MORE;
    public static final EnumC1674300tfg LOAD_MORE_ERROR;
    public static final EnumC1674300tfg LOAD_MORE_LOADING;
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public static InterfaceC2044707zh<EnumC1674300tfg> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1674300tfg enumC1674300tfg = new EnumC1674300tfg(0, "INITIAL", false, true, false, true);
        INITIAL = enumC1674300tfg;
        EnumC1674300tfg enumC1674300tfg2 = new EnumC1674300tfg(1, "FIRST_TIME_LOADING", true, true, false, true);
        FIRST_TIME_LOADING = enumC1674300tfg2;
        EnumC1674300tfg enumC1674300tfg3 = new EnumC1674300tfg(2, "LOAD_MORE_LOADING", true, true, false, false);
        LOAD_MORE_LOADING = enumC1674300tfg3;
        EnumC1674300tfg enumC1674300tfg4 = new EnumC1674300tfg(3, "FIRST_TIME_ERROR", false, true, true, true);
        FIRST_TIME_ERROR = enumC1674300tfg4;
        EnumC1674300tfg enumC1674300tfg5 = new EnumC1674300tfg(4, "LOAD_MORE_ERROR", false, true, true, false);
        LOAD_MORE_ERROR = enumC1674300tfg5;
        EnumC1674300tfg enumC1674300tfg6 = new EnumC1674300tfg(5, "LOADED_HAS_MORE", false, true, false, false);
        LOADED_HAS_MORE = enumC1674300tfg6;
        EnumC1674300tfg enumC1674300tfg7 = new EnumC1674300tfg(6, "LOADED_EMPTY", false, false, false, true);
        LOADED_EMPTY = enumC1674300tfg7;
        EnumC1674300tfg enumC1674300tfg8 = new EnumC1674300tfg(7, "LOADED_COMPLETE", false, false, false, false);
        LOADED_COMPLETE = enumC1674300tfg8;
        EnumC1674300tfg[] enumC1674300tfgArr = {enumC1674300tfg, enumC1674300tfg2, enumC1674300tfg3, enumC1674300tfg4, enumC1674300tfg5, enumC1674300tfg6, enumC1674300tfg7, enumC1674300tfg8};
        LLILZIL = enumC1674300tfgArr;
        LLILZLL = new C2254308sP(enumC1674300tfgArr);
    }

    public static EnumC1674300tfg[] values() {
        return (EnumC1674300tfg[]) LLILZIL.clone();
    }

    public final boolean canManualLoad() {
        return !this.LL && this.LLILLJJLI;
    }

    public final EnumC1674280tfe loadMoreFooterState() {
        switch (C1674310tfh.LIZ[ordinal()]) {
            case 1:
                return EnumC1674280tfe.LOADING;
            case 2:
                return EnumC1674280tfe.LOADING;
            case 3:
                return EnumC1674280tfe.ERROR;
            case 4:
                return EnumC1674280tfe.COMPLETE;
            case 5:
                return EnumC1674280tfe.LOADING;
            case 6:
                return EnumC1674280tfe.ERROR;
            case 7:
                return EnumC1674280tfe.LOADING;
            case 8:
                return EnumC1674280tfe.COMPLETE;
            default:
                throw new C1954807lC();
        }
    }

    public final EnumC1674300tfg stateError() {
        return !this.LL ? this : this.LLILZ ? FIRST_TIME_ERROR : LOAD_MORE_ERROR;
    }

    public final EnumC1670920taE statusViewState() {
        int i = C1674310tfh.LIZ[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnumC1670920taE.NULL : EnumC1670920taE.EMPTY : EnumC1670920taE.ERROR : EnumC1670920taE.LOADING : EnumC1670920taE.LOADING;
    }

    public final boolean canAutoLoadMore() {
        return canManualLoad();
    }

    public final EnumC1674300tfg stateLoading() {
        return !canManualLoad() ? this : this.LLILZ ? FIRST_TIME_LOADING : LOAD_MORE_LOADING;
    }

    public final boolean getHasError() {
        return this.LLILLL;
    }

    public final boolean getHasMore() {
        return this.LLILLJJLI;
    }

    public final boolean isEmpty() {
        return this.LLILZ;
    }

    public final boolean isLoading() {
        return this.LL;
    }

    public static EnumC1674300tfg valueOf(String str) {
        return (EnumC1674300tfg) C08FF.LIZ(EnumC1674300tfg.class, str);
    }

    public final EnumC1674300tfg stateLoaded(boolean z, boolean z2) {
        if (!this.LL) {
            return this;
        }
        if (z) {
            if (!z2) {
                return LOADED_HAS_MORE;
            }
            return this;
        }
        if (z2) {
            return LOADED_EMPTY;
        }
        return LOADED_COMPLETE;
    }

    public static /* synthetic */ EnumC1674300tfg stateLoaded$default(EnumC1674300tfg enumC1674300tfg, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return enumC1674300tfg.stateLoaded(z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stateLoaded");
    }

    public EnumC1674300tfg(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
    }
}
