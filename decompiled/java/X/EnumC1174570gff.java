package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1174570gff {
    public static final EnumC1174570gff CARD_VIEW;
    public static final /* synthetic */ EnumC1174570gff[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1174570gff POI_LIST_NINE_SHEET;
    public static final EnumC1174570gff POI_LIST_THREE_SHEET;

    public EnumC1174570gff() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1174570gff> getEntries() {
        return LLILLJJLI;
    }

    public abstract boolean isSheetExpand();

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

    public abstract String toMobStateStr();

    static {
        EnumC1174570gff enumC1174570gff = new EnumC1174570gff() { // from class: X.0gfm
            @Override // X.EnumC1174570gff
            public final boolean isSheetExpand() {
                return false;
            }

            @Override // X.EnumC1174570gff
            public final String toMobStateStr() {
                return "initial";
            }

            @Override // X.EnumC1174570gff
            public final void onChangeCurrentTab(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onClickListIconBtn(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onClickMapIconBtn(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onError(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onFindPlacesNearby(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onRetry(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onReturnToCity(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onSearchArea(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onSeeMore(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onMarkerHighlight(C1174480gfW c1174480gfW, String str) {
                c1174480gfW.LIZJ(this);
            }
        };
        CARD_VIEW = enumC1174570gff;
        EnumC1174570gff enumC1174570gff2 = new EnumC1174570gff() { // from class: X.0gfk
            @Override // X.EnumC1174570gff
            public final boolean isSheetExpand() {
                return true;
            }

            @Override // X.EnumC1174570gff
            public final String toMobStateStr() {
                return "full_sheet_discovery";
            }

            @Override // X.EnumC1174570gff
            public final void onChangeCurrentTab(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onClickMapIconBtn(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onError(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onFindPlacesNearby(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onRetry(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onReturnToCity(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onSearchArea(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onSeeMore(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onSheetSwipedToThree(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onMarkerHighlight(C1174480gfW c1174480gfW, String str) {
                c1174480gfW.LIZJ(EnumC1174570gff.CARD_VIEW);
            }
        };
        POI_LIST_NINE_SHEET = enumC1174570gff2;
        EnumC1174570gff enumC1174570gff3 = new EnumC1174570gff() { // from class: X.0gfl
            @Override // X.EnumC1174570gff
            public final boolean isSheetExpand() {
                return false;
            }

            @Override // X.EnumC1174570gff
            public final String toMobStateStr() {
                return "full_map_discovery";
            }

            @Override // X.EnumC1174570gff
            public final void onSheetSwipedToNine(C1174480gfW c1174480gfW) {
                c1174480gfW.LIZJ(EnumC1174570gff.POI_LIST_NINE_SHEET);
            }

            @Override // X.EnumC1174570gff
            public final void onMarkerHighlight(C1174480gfW c1174480gfW, String str) {
                c1174480gfW.LIZJ(EnumC1174570gff.CARD_VIEW);
            }
        };
        POI_LIST_THREE_SHEET = enumC1174570gff3;
        EnumC1174570gff[] enumC1174570gffArr = {enumC1174570gff, enumC1174570gff2, enumC1174570gff3};
        LL = enumC1174570gffArr;
        LLILLJJLI = new C2254308sP(enumC1174570gffArr);
    }

    public static EnumC1174570gff[] values() {
        return (EnumC1174570gff[]) LL.clone();
    }

    public static EnumC1174570gff valueOf(String str) {
        return (EnumC1174570gff) C08FF.LIZ(EnumC1174570gff.class, str);
    }

    public EnumC1174570gff(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
