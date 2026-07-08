package Y;

import X.C05FZ;
import X.C09JN;
import X.C1C7U;
import X.C2097608Jq;
import X.C2241008qG;
import X.C23112093u;
import X.C313360CQc;
import X.C793770VBv;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AfS0S0000100_4 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public AfS0S0000100_4(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.j0 = j;
                break;
            default:
                this.j0 = j;
                break;
        }
    }

    public static final void accept$0(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        long j = afS0S0000100_4.j0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$1L");
        C313360CQc.LIZ(0, ((BaseResponse) obj).status_code, System.currentTimeMillis() - j, "/tiktok/v1/edibility/birthdate/");
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$1L");
    }

    public static final void accept$1(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        int errorCode;
        long j = afS0S0000100_4.j0;
        Throwable th = (Throwable) obj;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$2L");
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (th instanceof C23112093u) {
            errorCode = ((C23112093u) th).getErrorCode();
        } else {
            errorCode = -1;
        }
        C313360CQc.LIZ(1, errorCode, jCurrentTimeMillis, "/tiktok/v1/edibility/birthdate/");
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$2L");
    }

    public static final void accept$2(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C1C7U.LIZ("AccountSettingAction@cdcf.doRealOpen$1");
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("service", "/tiktok/v1/edibility/birthdate/");
        c2241008qG.LIZ.put("code", Integer.valueOf(((BaseResponse) obj).status_code));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        C2241008qG c2241008qG2 = new C2241008qG();
        c2241008qG2.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - afS0S0000100_4.j0));
        C793770VBv.LJIIJ("compliance_age_gate_api", 0, jSONObjectLJ, c2241008qG2.LJ(), null);
        C1C7U.LIZIZ("AccountSettingAction@cdcf.doRealOpen$1");
    }

    public static final void accept$3(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doLoadMore$2");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS0S0000100_4.j0)), new Pair("reason", "success"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doLoadMore$2");
    }

    public static final void accept$4(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doRefresh$3");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS0S0000100_4.j0)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doRefresh$3");
    }

    public static final void accept$5(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.requestMixDetail$3");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS0S0000100_4.j0)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LIZLLL(mapLJIIIIZZ);
        C1C7U.LIZIZ("MixVideosViewModel@67cc.requestMixDetail$3");
    }

    public static final void accept$6(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C1C7U.LIZ("SettingManageMyAccountRouter@934e.open$1");
        C313360CQc.LIZ(0, ((BaseResponse) obj).status_code, System.currentTimeMillis() - afS0S0000100_4.j0, "/tiktok/v1/edibility/birthdate/");
        C1C7U.LIZIZ("SettingManageMyAccountRouter@934e.open$1");
    }

    public static final void accept$7(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        int errorCode;
        C1C7U.LIZ("SettingManageMyAccountRouter@934e.open$2");
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS0S0000100_4.j0;
        if (th instanceof C23112093u) {
            errorCode = ((C23112093u) th).getErrorCode();
        } else {
            errorCode = -1;
        }
        C313360CQc.LIZ(1, errorCode, jCurrentTimeMillis, "/tiktok/v1/edibility/birthdate/");
        C1C7U.LIZIZ("SettingManageMyAccountRouter@934e.open$2");
    }
}
