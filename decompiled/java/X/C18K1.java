package X;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18K1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18K1 {
    public static final C18K1 CANCEL_FAVOURITE_POI;
    public static final C18K1 CLICK_PRODUCT_SHELF_ITEM;
    public static final C18K1 CLICK_SUBMIT_ORDER;
    public static final C18JO Companion;
    public static final C18K1 ENTER_ORDER_SUBMIT_PAGE;
    public static final C18K1 ENTER_POI_WEBVIEW;
    public static final C18K1 FAVOURITE_POI;
    public static final /* synthetic */ C18K1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C18K1 MULTI_ANCHOR_ENTRANCE_CLICK;
    public static final C18K1 MULTI_ANCHOR_ENTRANCE_SHOW;
    public static final C18K1 POI_DETAIL_STAY_TIME;
    public static final C18K1 SHARE_POI;
    public static final C18K1 STAY_TIME;
    public static final C18K1 SUBMIT_ORDER_RESULT;
    public static final HashMap<String, C18K1> findMap;
    public final String LL;

    public static InterfaceC2044707zh<C18K1> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.18JO] */
    static {
        C18K1 c18k1 = new C18K1("MULTI_ANCHOR_ENTRANCE_SHOW", 0, "multi_anchor_entrance_show");
        MULTI_ANCHOR_ENTRANCE_SHOW = c18k1;
        C18K1 c18k12 = new C18K1("MULTI_ANCHOR_ENTRANCE_CLICK", 1, "multi_anchor_entrance_click");
        MULTI_ANCHOR_ENTRANCE_CLICK = c18k12;
        C18K1 c18k13 = new C18K1("SHARE_POI", 2, "share_poi");
        SHARE_POI = c18k13;
        C18K1 c18k14 = new C18K1("FAVOURITE_POI", 3, "favourite_poi");
        FAVOURITE_POI = c18k14;
        C18K1 c18k15 = new C18K1("CANCEL_FAVOURITE_POI", 4, "cancel_favourite_poi");
        CANCEL_FAVOURITE_POI = c18k15;
        C18K1 c18k16 = new C18K1("CLICK_PRODUCT_SHELF_ITEM", 5, "click_product_shelf_item");
        CLICK_PRODUCT_SHELF_ITEM = c18k16;
        C18K1 c18k17 = new C18K1("ENTER_POI_WEBVIEW", 6, "enter_poi_webview");
        ENTER_POI_WEBVIEW = c18k17;
        C18K1 c18k18 = new C18K1("ENTER_ORDER_SUBMIT_PAGE", 7, "enter_order_submit_page");
        ENTER_ORDER_SUBMIT_PAGE = c18k18;
        C18K1 c18k19 = new C18K1("CLICK_SUBMIT_ORDER", 8, "click_submit_order");
        CLICK_SUBMIT_ORDER = c18k19;
        C18K1 c18k110 = new C18K1("SUBMIT_ORDER_RESULT", 9, "submit_order_result");
        SUBMIT_ORDER_RESULT = c18k110;
        C18K1 c18k111 = new C18K1("POI_DETAIL_STAY_TIME", 10, "poi_detail_stay_time");
        POI_DETAIL_STAY_TIME = c18k111;
        C18K1 c18k112 = new C18K1("STAY_TIME", 11, "stay_time");
        STAY_TIME = c18k112;
        C18K1[] c18k1Arr = {c18k1, c18k12, c18k13, c18k14, c18k15, c18k16, c18k17, c18k18, c18k19, c18k110, c18k111, c18k112};
        LLILLJJLI = c18k1Arr;
        LLILLL = new C2254308sP(c18k1Arr);
        Companion = new Object() { // from class: X.18JO
        };
        findMap = new HashMap<>();
        for (C18K1 c18k113 : values()) {
            findMap.put(c18k113.LL, c18k113);
        }
    }

    public static C18K1[] values() {
        return (C18K1[]) LLILLJJLI.clone();
    }

    public final String getEvent() {
        return this.LL;
    }

    public static C18K1 valueOf(String str) {
        return (C18K1) C08FF.LIZ(C18K1.class, str);
    }

    public C18K1(String str, int i, String str2) {
        this.LL = str2;
    }
}
