package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.020T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020T extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFeedHeaderStickyChanged, isSticky=");
        sbLIZ.append(c020t.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click: (isShoppingCartCardReady: ");
        sbLIZ.append(c020t.z0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onShowingStatusChange -> ");
        sbLIZ.append(c020t.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SwipeRefreshBlock] canChildScrollUp callback invoked, isShowing=");
        sbLIZ.append(c020t.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startAutoScroll] ");
        sbLIZ.append(c020t.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMSource-onIMSDKLoginOrLogout: ");
        sbLIZ.append(c020t.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(C020T c020t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pool setAllBubblesVisibility: (isVisible: ");
        sbLIZ.append(c020t.z0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020T(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
