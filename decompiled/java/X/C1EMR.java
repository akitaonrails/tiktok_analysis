package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1EMR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1EMR implements LSError {
    public static final C1EMR API_PRELOAD_UNAVAILABLE;
    public static final C1EMR COUPON_PANEL_ERR;
    public static final C1EMR DYNAMIC_MAP_DISABLE;
    public static final C1EMR FAILED_TO_CONVERT_JSON_TO_MAP;
    public static final C1EMR FEED_ANCHOR_CTR_SCORE_PARSE_ERROR;
    public static final C1EMR FETCH_LOCATION_ERROR;
    public static final C1EMR GET_TTNET_STATUS_CODE_ERROR;
    public static final C1EMR GOOGLE_PLAY_SERVICE_DISABLE;
    public static final C1EMR IMPLEMENTATION_IS_NOT_FOUND;
    public static final /* synthetic */ C1EMR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1EMR LOCATION_NET_INTERCEPTOR_ERROR;
    public static final C1EMR LS_FETCH_LOCATION;
    public static final C1EMR LS_ULTIMATE_INFLATER_LAYOUT_ID_INVALID;
    public static final C1EMR MAP_MODE_ERR;
    public static final C1EMR METADATA_ERROR;
    public static final C1EMR POI_COLOR_UNAVAILABLE;
    public static final C1EMR POI_CREATOR_STRENGTH_FEAT;
    public static final C1EMR POI_DETAIL_CLAIM;
    public static final C1EMR POI_DETAIL_LOCATION;
    public static final C1EMR POI_DETAIL_PRELOAD_ERR;
    public static final C1EMR POI_DYNAMIC_MAP_DISABLE;
    public static final C1EMR POI_ICON_UNAVAILABLE;
    public static final C1EMR POI_MEMORY_CACHE_ERR;
    public static final C1EMR POI_NETWORK_ERROR;
    public static final C1EMR POI_OFFLINE;
    public static final C1EMR POI_REGION_UNAVAILABLE;
    public static final C1EMR POI_RETAG;
    public static final C1EMR POI_SESSION_MANAGER_ERR;
    public static final C1EMR REPORT_ORDER_ATTRIBUTE_ERROR;
    public static final C1EMR SEND_NETWORK_INFO_ERROR;
    public static final C1EMR SHOW_MOB_DEDUP_DECIDE_ERROR;
    public static final C1EMR SLASH_LAYOUT_ERROR;
    public static final C1EMR SPARK_INTERCEPTOR_ERR;
    public static final C1EMR UNKNOWN_ERR;
    public static final C1EMR YMAL_ERR;

    public C1EMR() {
        throw null;
    }

    public static InterfaceC2044707zh<C1EMR> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ String message();

    static {
        C1EMR c1emr = new C1EMR() { // from class: X.1EML
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "ensureNotReachHere";
            }
        };
        UNKNOWN_ERR = c1emr;
        C1EMR c1emr2 = new C1EMR() { // from class: X.1EMK
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "sparkInterceptorErr";
            }
        };
        SPARK_INTERCEPTOR_ERR = c1emr2;
        C1EMR c1emr3 = new C1EMR() { // from class: X.1EMQ
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi anchor ctr score parse error";
            }
        };
        FEED_ANCHOR_CTR_SCORE_PARSE_ERROR = c1emr3;
        C1EMR c1emr4 = new C1EMR() { // from class: X.1EMH
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poiSessionManagerErr";
            }
        };
        POI_SESSION_MANAGER_ERR = c1emr4;
        C1EMR c1emr5 = new C1EMR() { // from class: X.1EMN
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "mapModeErr";
            }
        };
        MAP_MODE_ERR = c1emr5;
        C1EMR c1emr6 = new C1EMR() { // from class: X.1EMM
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "yamlErr";
            }
        };
        YMAL_ERR = c1emr6;
        C1EMR c1emr7 = new C1EMR() { // from class: X.1EMO
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "metaDataError";
            }
        };
        METADATA_ERROR = c1emr7;
        C1EMR c1emr8 = new C1EMR() { // from class: X.1EMn
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "get location detail info";
            }
        };
        FETCH_LOCATION_ERROR = c1emr8;
        C1EMR c1emr9 = new C1EMR() { // from class: X.1EMP
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi memory cache err";
            }
        };
        POI_MEMORY_CACHE_ERR = c1emr9;
        C1EMR c1emr10 = new C1EMR() { // from class: X.1EMl
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "coupon panel err";
            }
        };
        COUPON_PANEL_ERR = c1emr10;
        C1EMR c1emr11 = new C1EMR() { // from class: X.1EMJ
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "send network info error";
            }
        };
        SEND_NETWORK_INFO_ERROR = c1emr11;
        C1EMR c1emr12 = new C1EMR() { // from class: X.1EMo
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "get ttnet status code error";
            }
        };
        GET_TTNET_STATUS_CODE_ERROR = c1emr12;
        C1EMR c1emr13 = new C1EMR() { // from class: X.1EMm
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "failed to convert json to map";
            }
        };
        FAILED_TO_CONVERT_JSON_TO_MAP = c1emr13;
        C1EMR c1emr14 = new C1EMR() { // from class: X.1EMI
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "report order attribute error";
            }
        };
        REPORT_ORDER_ATTRIBUTE_ERROR = c1emr14;
        C1EMR c1emr15 = new C1EMR() { // from class: X.1EMp
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "location net interceptor error";
            }
        };
        LOCATION_NET_INTERCEPTOR_ERROR = c1emr15;
        C1EMR c1emr16 = new C1EMR() { // from class: X.1EMk
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "LSUltimateInflater preload failed,layoutName and layoutId are null";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P0;
            }
        };
        LS_ULTIMATE_INFLATER_LAYOUT_ID_INVALID = c1emr16;
        C1EMR c1emr17 = new C1EMR() { // from class: X.1EMj
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "No implementation of the LSInflaterInterface interface was found";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P0;
            }
        };
        IMPLEMENTATION_IS_NOT_FOUND = c1emr17;
        C1EMR c1emr18 = new C1EMR() { // from class: X.1EMS
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "api preload unavailable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        API_PRELOAD_UNAVAILABLE = c1emr18;
        C1EMR c1emr19 = new C1EMR() { // from class: X.1EMg
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_detail_location";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_DETAIL_LOCATION = c1emr19;
        C1EMR c1emr20 = new C1EMR() { // from class: X.1EMd
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "ls_fetch_location";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        LS_FETCH_LOCATION = c1emr20;
        C1EMR c1emr21 = new C1EMR() { // from class: X.1EMe
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_creator_strength";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_CREATOR_STRENGTH_FEAT = c1emr21;
        C1EMR c1emr22 = new C1EMR() { // from class: X.1EMi
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_retag";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_RETAG = c1emr22;
        C1EMR c1emr23 = new C1EMR() { // from class: X.1EMh
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_detail_preload_err";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_DETAIL_PRELOAD_ERR = c1emr23;
        C1EMR c1emr24 = new C1EMR() { // from class: X.1EMf
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_detail_claim";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_DETAIL_CLAIM = c1emr24;
        C1EMR c1emr25 = new C1EMR() { // from class: X.1EMa
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_offline";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_OFFLINE = c1emr25;
        C1EMR c1emr26 = new C1EMR() { // from class: X.1EMZ
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_network_error";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_NETWORK_ERROR = c1emr26;
        C1EMR c1emr27 = new C1EMR() { // from class: X.1EMb
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_region_unavailable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_REGION_UNAVAILABLE = c1emr27;
        C1EMR c1emr28 = new C1EMR() { // from class: X.1EMY
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_icon_unavailable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_ICON_UNAVAILABLE = c1emr28;
        C1EMR c1emr29 = new C1EMR() { // from class: X.1EMW
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_color_unavailable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_COLOR_UNAVAILABLE = c1emr29;
        C1EMR c1emr30 = new C1EMR() { // from class: X.1EMT
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "dynamic_map_disable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        DYNAMIC_MAP_DISABLE = c1emr30;
        C1EMR c1emr31 = new C1EMR() { // from class: X.1EMX
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_dynamic_map_disable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_DYNAMIC_MAP_DISABLE = c1emr31;
        C1EMR c1emr32 = new C1EMR() { // from class: X.1EMV
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "google_play_service_disable";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        GOOGLE_PLAY_SERVICE_DISABLE = c1emr32;
        C1EMR c1emr33 = new C1EMR() { // from class: X.1EMU
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "slash_layout_error";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        SLASH_LAYOUT_ERROR = c1emr33;
        C1EMR c1emr34 = new C1EMR() { // from class: X.1EMc
            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "show_mob_dedup_decide_error";
            }

            @Override // X.C1EMR, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        SHOW_MOB_DEDUP_DECIDE_ERROR = c1emr34;
        C1EMR[] c1emrArr = {c1emr, c1emr2, c1emr3, c1emr4, c1emr5, c1emr6, c1emr7, c1emr8, c1emr9, c1emr10, c1emr11, c1emr12, c1emr13, c1emr14, c1emr15, c1emr16, c1emr17, c1emr18, c1emr19, c1emr20, c1emr21, c1emr22, c1emr23, c1emr24, c1emr25, c1emr26, c1emr27, c1emr28, c1emr29, c1emr30, c1emr31, c1emr32, c1emr33, c1emr34};
        LL = c1emrArr;
        LLILLJJLI = new C2254308sP(c1emrArr);
    }

    public static C1EMR[] values() {
        return (C1EMR[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static C1EMR valueOf(String str) {
        return (C1EMR) C08FF.LIZ(C1EMR.class, str);
    }

    public C1EMR(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
