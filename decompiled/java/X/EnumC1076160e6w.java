package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class EnumC1076160e6w {
    public static final EnumC1076160e6w LIST_COMPLETE;
    public static final EnumC1076160e6w LIST_LOADING;
    public static final /* synthetic */ EnumC1076160e6w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public EnumC1076160e6w() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1076160e6w> getEntries() {
        return LLILLJJLI;
    }

    public void onCategoryChanged(C1076190e6z c1076190e6z) {
    }

    public void onClickListIconBtn(C1076190e6z c1076190e6z) {
    }

    public void onClickMapIconBtn(C1076190e6z c1076190e6z) {
    }

    public void onError(C1076190e6z c1076190e6z) {
    }

    public void onMarkerHighlight(C1076190e6z c1076190e6z, String str) {
    }

    public void onPoiListDataLoaded(C1076190e6z c1076190e6z) {
    }

    public void onPoiListDataStart(C1076190e6z c1076190e6z) {
    }

    public void onRegionFilterChanged(C1076190e6z c1076190e6z) {
    }

    public void onRetry(C1076190e6z c1076190e6z) {
    }

    public void onSheetSwipedToHigh(C1076190e6z c1076190e6z) {
    }

    public void onSheetSwipedToLow(C1076190e6z c1076190e6z) {
    }

    public void onSortChanged(C1076190e6z c1076190e6z) {
    }

    static {
        EnumC1076160e6w enumC1076160e6w = new EnumC1076160e6w() { // from class: X.0e6y
            @Override // X.EnumC1076160e6w
            public final void onPoiListDataLoaded(C1076190e6z c1076190e6z) {
                EnumC1076160e6w enumC1076160e6w2 = EnumC1076160e6w.LIST_COMPLETE;
                synchronized (c1076190e6z) {
                    c1076190e6z.LIZJ = enumC1076160e6w2;
                    c1076190e6z.LIZ();
                }
            }
        };
        LIST_LOADING = enumC1076160e6w;
        EnumC1076160e6w enumC1076160e6w2 = new EnumC1076160e6w() { // from class: X.0e6x
            @Override // X.EnumC1076160e6w
            public final void onPoiListDataStart(C1076190e6z c1076190e6z) {
                EnumC1076160e6w enumC1076160e6w3 = EnumC1076160e6w.LIST_LOADING;
                synchronized (c1076190e6z) {
                    c1076190e6z.LIZJ = enumC1076160e6w3;
                    c1076190e6z.LIZ();
                }
            }
        };
        LIST_COMPLETE = enumC1076160e6w2;
        EnumC1076160e6w[] enumC1076160e6wArr = {enumC1076160e6w, enumC1076160e6w2};
        LL = enumC1076160e6wArr;
        LLILLJJLI = new C2254308sP(enumC1076160e6wArr);
    }

    public static EnumC1076160e6w[] values() {
        return (EnumC1076160e6w[]) LL.clone();
    }

    public static EnumC1076160e6w valueOf(String str) {
        return (EnumC1076160e6w) C08FF.LIZ(EnumC1076160e6w.class, str);
    }

    public EnumC1076160e6w(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
