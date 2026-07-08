package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class EnumC1174300gfE {
    public static final EnumC1174300gfE LIST_COMPLETE;
    public static final EnumC1174300gfE LIST_LOADING;
    public static final /* synthetic */ EnumC1174300gfE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public EnumC1174300gfE() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1174300gfE> getEntries() {
        return LLILLJJLI;
    }

    public void onChangeCurrentTab(C1174480gfW c1174480gfW) {
    }

    public void onClickListIconBtn(C1174480gfW c1174480gfW) {
    }

    public void onClickMapIconBtn(C1174480gfW c1174480gfW) {
    }

    public void onError(C1174480gfW c1174480gfW) {
    }

    public void onFindPlacesNearby(C1174480gfW c1174480gfW) {
    }

    public void onMarkerHighlight(C1174480gfW c1174480gfW, String str) {
    }

    public void onPoiListDataLoaded(C1174480gfW c1174480gfW) {
    }

    public void onPoiListDataStart(C1174480gfW c1174480gfW) {
    }

    public void onRetry(C1174480gfW c1174480gfW) {
    }

    public void onReturnToCity(C1174480gfW c1174480gfW) {
    }

    public void onSearchArea(C1174480gfW c1174480gfW) {
    }

    public void onSeeMore(C1174480gfW c1174480gfW) {
    }

    public void onSheetSwipedToNine(C1174480gfW c1174480gfW) {
    }

    public void onSheetSwipedToThree(C1174480gfW c1174480gfW) {
    }

    static {
        EnumC1174300gfE enumC1174300gfE = new EnumC1174300gfE() { // from class: X.0gfG
            @Override // X.EnumC1174300gfE
            public final void onPoiListDataLoaded(C1174480gfW c1174480gfW) {
                EnumC1174300gfE enumC1174300gfE2 = EnumC1174300gfE.LIST_COMPLETE;
                synchronized (c1174480gfW) {
                    c1174480gfW.LIZJ = enumC1174300gfE2;
                    c1174480gfW.LIZ();
                }
            }
        };
        LIST_LOADING = enumC1174300gfE;
        EnumC1174300gfE enumC1174300gfE2 = new EnumC1174300gfE() { // from class: X.0gfF
            @Override // X.EnumC1174300gfE
            public final void onPoiListDataStart(C1174480gfW c1174480gfW) {
                EnumC1174300gfE enumC1174300gfE3 = EnumC1174300gfE.LIST_LOADING;
                synchronized (c1174480gfW) {
                    c1174480gfW.LIZJ = enumC1174300gfE3;
                    c1174480gfW.LIZ();
                }
            }
        };
        LIST_COMPLETE = enumC1174300gfE2;
        EnumC1174300gfE[] enumC1174300gfEArr = {enumC1174300gfE, enumC1174300gfE2};
        LL = enumC1174300gfEArr;
        LLILLJJLI = new C2254308sP(enumC1174300gfEArr);
    }

    public static EnumC1174300gfE[] values() {
        return (EnumC1174300gfE[]) LL.clone();
    }

    public static EnumC1174300gfE valueOf(String str) {
        return (EnumC1174300gfE) C08FF.LIZ(EnumC1174300gfE.class, str);
    }

    public EnumC1174300gfE(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
