package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ghd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1175790ghd {
    public static final EnumC1175790ghd CARD_VIEW;
    public static final /* synthetic */ EnumC1175790ghd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1175790ghd POI_LIST_FIVE_SHEET;
    public static final EnumC1175790ghd POI_LIST_NINE_SHEET;
    public static final EnumC1175790ghd POI_LIST_THREE_SHEET;

    public EnumC1175790ghd() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1175790ghd> getEntries() {
        return LLILLJJLI;
    }

    public abstract boolean isSheetExpand();

    public void onChangeCurrentTab(C1175770ghb c1175770ghb) {
    }

    public void onClickListIconBtn(C1175770ghb c1175770ghb) {
    }

    public void onClickMapIconBtn(C1175770ghb c1175770ghb) {
    }

    public void onError(C1175770ghb c1175770ghb) {
    }

    public void onFilterChanged(C1175770ghb c1175770ghb) {
    }

    public void onFindPlacesNearby(C1175770ghb c1175770ghb) {
    }

    public void onMapMoved(C1175770ghb c1175770ghb) {
    }

    public void onMarkerHighlight(C1175770ghb c1175770ghb, String str) {
    }

    public void onPoiListDataLoaded(C1175770ghb c1175770ghb) {
    }

    public void onPoiListDataStart(C1175770ghb c1175770ghb, boolean z) {
    }

    public void onRetry(C1175770ghb c1175770ghb) {
    }

    public void onReturnToCity(C1175770ghb c1175770ghb) {
    }

    public void onSearchArea(C1175770ghb c1175770ghb) {
    }

    public void onSeeMore(C1175770ghb c1175770ghb) {
    }

    public void onSheetSwipedToFive(C1175770ghb c1175770ghb) {
    }

    public void onSheetSwipedToNine(C1175770ghb c1175770ghb) {
    }

    public void onSheetSwipedToThree(C1175770ghb c1175770ghb) {
    }

    public abstract String toMobStateStr();

    static {
        EnumC1175790ghd enumC1175790ghd = new EnumC1175790ghd() { // from class: X.0ghX
            @Override // X.EnumC1175790ghd
            public final boolean isSheetExpand() {
                return false;
            }

            @Override // X.EnumC1175790ghd
            public final String toMobStateStr() {
                return "initial";
            }

            @Override // X.EnumC1175790ghd
            public final void onChangeCurrentTab(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onClickListIconBtn(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_NINE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onClickMapIconBtn(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onError(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onFindPlacesNearby(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onRetry(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onReturnToCity(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSearchArea(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSeeMore(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onMarkerHighlight(C1175770ghb c1175770ghb, String str) {
                c1175770ghb.LIZLLL(this);
            }
        };
        CARD_VIEW = enumC1175790ghd;
        EnumC1175790ghd enumC1175790ghd2 = new EnumC1175790ghd() { // from class: X.0ghW
            @Override // X.EnumC1175790ghd
            public final boolean isSheetExpand() {
                return true;
            }

            @Override // X.EnumC1175790ghd
            public final String toMobStateStr() {
                return "full_sheet_discovery";
            }

            @Override // X.EnumC1175790ghd
            public final void onClickMapIconBtn(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onFindPlacesNearby(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onRetry(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onReturnToCity(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSearchArea(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSeeMore(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSheetSwipedToFive(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_FIVE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSheetSwipedToThree(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onMarkerHighlight(C1175770ghb c1175770ghb, String str) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.CARD_VIEW);
            }
        };
        POI_LIST_NINE_SHEET = enumC1175790ghd2;
        EnumC1175790ghd enumC1175790ghd3 = new EnumC1175790ghd() { // from class: X.0ghc
            @Override // X.EnumC1175790ghd
            public final boolean isSheetExpand() {
                return false;
            }

            @Override // X.EnumC1175790ghd
            public final String toMobStateStr() {
                return "half_map_discovery";
            }

            @Override // X.EnumC1175790ghd
            public final void onClickListIconBtn(C1175770ghb c1175770ghb) {
                super.onClickListIconBtn(c1175770ghb);
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_NINE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onClickMapIconBtn(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onFindPlacesNearby(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onMapMoved(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSearchArea(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSheetSwipedToNine(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_NINE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSheetSwipedToThree(C1175770ghb c1175770ghb) {
                super.onSheetSwipedToThree(c1175770ghb);
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onMarkerHighlight(C1175770ghb c1175770ghb, String str) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.CARD_VIEW);
            }
        };
        POI_LIST_FIVE_SHEET = enumC1175790ghd3;
        EnumC1175790ghd enumC1175790ghd4 = new EnumC1175790ghd() { // from class: X.0ghV
            @Override // X.EnumC1175790ghd
            public final boolean isSheetExpand() {
                return false;
            }

            @Override // X.EnumC1175790ghd
            public final String toMobStateStr() {
                return "full_map_discovery";
            }

            @Override // X.EnumC1175790ghd
            public final void onClickListIconBtn(C1175770ghb c1175770ghb) {
                super.onClickListIconBtn(c1175770ghb);
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_NINE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSheetSwipedToFive(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_FIVE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onSheetSwipedToNine(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.POI_LIST_NINE_SHEET);
            }

            @Override // X.EnumC1175790ghd
            public final void onMarkerHighlight(C1175770ghb c1175770ghb, String str) {
                c1175770ghb.LIZLLL(EnumC1175790ghd.CARD_VIEW);
            }
        };
        POI_LIST_THREE_SHEET = enumC1175790ghd4;
        EnumC1175790ghd[] enumC1175790ghdArr = {enumC1175790ghd, enumC1175790ghd2, enumC1175790ghd3, enumC1175790ghd4};
        LL = enumC1175790ghdArr;
        LLILLJJLI = new C2254308sP(enumC1175790ghdArr);
    }

    public static EnumC1175790ghd[] values() {
        return (EnumC1175790ghd[]) LL.clone();
    }

    public static EnumC1175790ghd valueOf(String str) {
        return (EnumC1175790ghd) C08FF.LIZ(EnumC1175790ghd.class, str);
    }

    public EnumC1175790ghd(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
