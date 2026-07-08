package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.network.model.LogPbBean;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.108v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191983108v {
    public final String LIZ;
    public final String LIZIZ;
    public Boolean LIZJ;
    public boolean LIZLLL;
    public Integer LJ;

    public final void LIZIZ(String str) {
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        C1913480ztS.LIZIZ("pns_tpsc_item_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LJ(String str) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        C1913480ztS.LIZIZ("pns_tpsc_item_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C191983108v(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public final void LIZ(int i, Integer num, String str) {
        this.LJ = num;
        Pair[] pairArr = new Pair[6];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        pairArr[4] = new Pair("from_value", String.valueOf(num));
        pairArr[5] = new Pair("to_value", String.valueOf(i));
        C1913480ztS.LIZIZ("pns_tpsc_item_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LIZJ(int i, Integer num, String str) {
        this.LJ = num;
        Pair[] pairArr = new Pair[7];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        pairArr[4] = new Pair("from_value", String.valueOf(num));
        pairArr[5] = new Pair("to_value", String.valueOf(i));
        pairArr[6] = new Pair("option_value", String.valueOf(i));
        C1913480ztS.LIZIZ("pns_tpsc_item_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LJFF(int i, String str, Throwable th) {
        C632200Oqw c632200Oqw;
        BaseResponse rawResponse;
        String str2;
        Integer numValueOf;
        LogPbBean logPb;
        String errorMsg = null;
        if (th instanceof C632200Oqw) {
            c632200Oqw = (C632200Oqw) th;
        } else {
            c632200Oqw = null;
        }
        Pair[] pairArr = new Pair[10];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        pairArr[4] = new Pair("is_success", "false");
        pairArr[5] = new Pair("from_value", String.valueOf(this.LJ));
        pairArr[6] = new Pair("to_value", String.valueOf(i));
        if (c632200Oqw != null) {
            rawResponse = c632200Oqw.getRawResponse();
        } else {
            rawResponse = null;
        }
        if ((rawResponse instanceof BaseResponse) && rawResponse != null && (logPb = rawResponse.getLogPb()) != null) {
            str2 = logPb.imprId;
        } else {
            str2 = null;
        }
        pairArr[7] = new Pair("log_id", String.valueOf(str2));
        if (c632200Oqw != null) {
            numValueOf = Integer.valueOf(c632200Oqw.getErrorCode());
        } else {
            numValueOf = null;
        }
        pairArr[8] = new Pair("error_code", String.valueOf(numValueOf));
        if (c632200Oqw != null) {
            errorMsg = c632200Oqw.getErrorMsg();
        }
        pairArr[9] = new Pair("error_msg", String.valueOf(errorMsg));
        C1913480ztS.LIZIZ("pns_tpsc_item_update_result", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LJI(int i, String str, BaseResponse baseResponse) {
        String str2;
        LogPbBean logPb;
        Pair[] pairArr = new Pair[8];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        pairArr[4] = new Pair("is_success", "true");
        pairArr[5] = new Pair("from_value", String.valueOf(this.LJ));
        pairArr[6] = new Pair("to_value", String.valueOf(i));
        if (baseResponse != null && (logPb = baseResponse.getLogPb()) != null) {
            str2 = logPb.imprId;
        } else {
            str2 = null;
        }
        pairArr[7] = new Pair("log_id", String.valueOf(str2));
        C1913480ztS.LIZIZ("pns_tpsc_item_update_result", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LIZLLL(Integer num, Integer num2, String str, boolean z) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.put("is_checked", String.valueOf(z));
        mapLJIIJ.put("setting_value", String.valueOf(num));
        if (num2 != null) {
            mapLJIIJ.put("option_value", num2.toString());
        }
        C1913480ztS.LIZIZ("pns_tpsc_item_show", mapLJIIJ);
    }
}
