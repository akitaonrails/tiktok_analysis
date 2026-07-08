package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0giU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class EnumC1176320giU {
    public static final EnumC1176320giU LIST_COMPLETE;
    public static final EnumC1176320giU LIST_LOADING;
    public static final EnumC1176320giU LIST_SILENCE_LOADING;
    public static final /* synthetic */ EnumC1176320giU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public EnumC1176320giU() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1176320giU> getEntries() {
        return LLILLJJLI;
    }

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

    static {
        EnumC1176320giU enumC1176320giU = new EnumC1176320giU() { // from class: X.0giX
            @Override // X.EnumC1176320giU
            public final void onPoiListDataLoaded(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZJ(EnumC1176320giU.LIST_COMPLETE);
            }
        };
        LIST_LOADING = enumC1176320giU;
        EnumC1176320giU enumC1176320giU2 = new EnumC1176320giU() { // from class: X.0giY
            @Override // X.EnumC1176320giU
            public final void onPoiListDataLoaded(C1175770ghb c1175770ghb) {
                c1175770ghb.LIZJ(EnumC1176320giU.LIST_COMPLETE);
            }

            @Override // X.EnumC1176320giU
            public final void onPoiListDataStart(C1175770ghb c1175770ghb, boolean z) {
                if (z) {
                    c1175770ghb.LIZJ(this);
                } else {
                    c1175770ghb.LIZJ(EnumC1176320giU.LIST_LOADING);
                }
            }
        };
        LIST_SILENCE_LOADING = enumC1176320giU2;
        EnumC1176320giU enumC1176320giU3 = new EnumC1176320giU() { // from class: X.0giV
            @Override // X.EnumC1176320giU
            public final void onPoiListDataStart(C1175770ghb c1175770ghb, boolean z) {
                if (z) {
                    c1175770ghb.LIZJ(EnumC1176320giU.LIST_SILENCE_LOADING);
                } else {
                    c1175770ghb.LIZJ(EnumC1176320giU.LIST_LOADING);
                }
            }
        };
        LIST_COMPLETE = enumC1176320giU3;
        EnumC1176320giU[] enumC1176320giUArr = {enumC1176320giU, enumC1176320giU2, enumC1176320giU3};
        LL = enumC1176320giUArr;
        LLILLJJLI = new C2254308sP(enumC1176320giUArr);
    }

    public static EnumC1176320giU[] values() {
        return (EnumC1176320giU[]) LL.clone();
    }

    public static EnumC1176320giU valueOf(String str) {
        return (EnumC1176320giU) C08FF.LIZ(EnumC1176320giU.class, str);
    }

    public EnumC1176320giU(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
