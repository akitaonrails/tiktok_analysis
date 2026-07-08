package X;

import com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1DUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256641DUg implements InterfaceC1435520nSY {
    public static final C2256641DUg LIZIZ = new C2256641DUg();

    @Override // X.InterfaceC1435520nSY
    public final InterfaceC457730HxD LJI() {
        return new InterfaceC457730HxD() { // from class: X.0nje
            public static Long LIZJ;
            public static EnumC1446110njd LIZLLL;

            public static final void LIZIZ() {
                EnumC1446110njd enumC1446110njd;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                Long l = LIZJ;
                if (l != null && l.longValue() > 0 && (enumC1446110njd = LIZLLL) != null) {
                    interfaceC1493505szLIZIZ.sendEvent("enter_media_detail_delay", C2097608Jq.LJIIIIZZ(new Pair("time_cost", String.valueOf(System.currentTimeMillis() - l.longValue())), new Pair("media_type", enumC1446110njd.getType())));
                }
                LIZJ = null;
                LIZLLL = null;
            }

            @Override // X.InterfaceC457730HxD
            public final void LIZ(EnumC1446110njd enumC1446110njd) {
                LIZJ = Long.valueOf(System.currentTimeMillis());
                LIZLLL = enumC1446110njd;
            }
        };
    }

    @Override // X.InterfaceC1435520nSY
    public final IMediaUploadPerformanceMonitor LJII() {
        return MediaUploadPerformanceMonitor.LIZIZ;
    }

    public static String LJ(C869590Y9l c869590Y9l) {
        Map<String, String> localExt;
        String str;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str = localExt.get("content_source")) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    public static String LJFF(C869590Y9l c869590Y9l) {
        Map<String, String> localExt;
        String str;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str = localExt.get("effect_handler_type")) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    public static String LJIIIIZZ(C869590Y9l c869590Y9l) {
        Map<String, String> localExt;
        String str;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str = localExt.get("effect_handler_type_active")) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    public static String LJIIJ(C869590Y9l c869590Y9l) {
        Map<String, String> localExt;
        String str;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str = localExt.get("prop_id")) != null && str.length() > 0) {
            return str;
        }
        return null;
    }

    public static void LIZLLL(Integer num, String str) {
        int iIntValue;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[2];
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        pairArr[0] = new Pair("error_code", String.valueOf(iIntValue));
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("vregion", str);
        C20684815ws.LJIILLIIL("dm_video_play_failed", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static String LJIIIZ(C869590Y9l c869590Y9l, String str) {
        String strLJIIIZ;
        Map<String, String> localExt;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        if (c869590Y9l == null) {
            return str;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        String enterMethod = null;
        if (baseTemplateLIZ != null && (baseRequestComponentRj = baseTemplateLIZ.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null) {
            strLJIIIZ = map.get("enter_method");
        } else {
            strLJIIIZ = null;
        }
        if (strLJIIIZ == null && ((localExt = c869590Y9l.getLocalExt()) == null || (strLJIIIZ = localExt.get("enter_method")) == null || strLJIIIZ.length() == 0)) {
            IMAnalyticsUtil.LIZIZ.getClass();
            SessionInfo sessionInfo = IMAnalyticsUtil.LJ;
            if (sessionInfo != null) {
                enterMethod = sessionInfo.getEnterMethod();
            }
            if (C123100dR.LIZ(enterMethod)) {
                if (sessionInfo != null) {
                    strLJIIIZ = sessionInfo.getEnterMethod();
                }
                strLJIIIZ = "";
            } else {
                strLJIIIZ = IMAnalyticsUtil.LJIIIZ("enter_method", "button");
            }
            if (strLJIIIZ == null) {
                strLJIIIZ = "";
            }
        }
        if (strLJIIIZ.length() > 0) {
            return strLJIIIZ;
        }
        return str;
    }

    public static final void LIZ(long j, String str, boolean z) {
        String str2;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[3];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("result", str2);
        pairArr[1] = new Pair("time_cost", String.valueOf(j));
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("fail_reason", str);
        interfaceC1493505szLIZIZ.sendEvent("dm_photo_detail_load", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZIZ(boolean z, C2256701DUm c2256701DUm, C869590Y9l c869590Y9l, C0YMW c0ymw, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        String string;
        String strategy;
        String str2 = "1";
        String string2 = null;
        if (c2256701DUm.LJI) {
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[11];
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("result", str2);
            pairArr[1] = new Pair("media_type", c2256701DUm.LJ.getType());
            EnumC2249731D3r enumC2249731D3r = c2256701DUm.LIZLLL;
            if (enumC2249731D3r == null || (strategy = enumC2249731D3r.getStrategy()) == null) {
                strategy = "";
            }
            pairArr[2] = new Pair("strategy", strategy);
            pairArr[3] = new Pair("time_cost", String.valueOf(System.currentTimeMillis() - c2256701DUm.LIZ));
            pairArr[4] = new Pair("enter_method", LJIIIZ(c869590Y9l, c2256701DUm.LJIIJ));
            pairArr[5] = new Pair("effect_handler_type", LJFF(c869590Y9l));
            pairArr[6] = new Pair("effect_handler_type_active", LJIIIIZZ(c869590Y9l));
            pairArr[7] = new Pair("prop_id", LJIIJ(c869590Y9l));
            pairArr[8] = new Pair("content_source", LJ(c869590Y9l));
            if (c0ymw != null) {
                string2 = c0ymw.toString();
            }
            pairArr[9] = new Pair("send_error", string2);
            pairArr[10] = new Pair("failure_source", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dm_camera_resend ");
            sbLIZ.append(mapLJIIIIZZ);
            C21682519tP.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), z);
            C20684815ws.LJIILLIIL("dm_camera_resend", mapLJIIIIZZ);
            return;
        }
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr2 = new Pair[16];
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr2[0] = new Pair("result", obj);
        pairArr2[1] = new Pair("media_type", c2256701DUm.LJ.getType());
        if (c2256701DUm.LIZIZ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr2[2] = new Pair("is_fast_send", obj2);
        if (c2256701DUm.LIZJ) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr2[3] = new Pair("from_record", obj3);
        pairArr2[4] = new Pair("total_time_cost", String.valueOf(System.currentTimeMillis() - c2256701DUm.LIZ));
        pairArr2[5] = new Pair("select_count", String.valueOf(c2256701DUm.LJFF));
        if (!c2256701DUm.LJIIIIZZ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr2[6] = new Pair("is_prepublish_used", str2);
        pairArr2[7] = new Pair("media_task_id", c2256701DUm.LJII);
        Long l = c2256701DUm.LJIIIZ;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        pairArr2[8] = new Pair("video_duration", string);
        pairArr2[9] = new Pair("enter_method", LJIIIZ(c869590Y9l, c2256701DUm.LJIIJ));
        pairArr2[10] = new Pair("effect_handler_type", LJFF(c869590Y9l));
        pairArr2[11] = new Pair("effect_handler_type_active", LJIIIIZZ(c869590Y9l));
        pairArr2[12] = new Pair("prop_id", LJIIJ(c869590Y9l));
        pairArr2[13] = new Pair("content_source", LJ(c869590Y9l));
        if (c0ymw != null) {
            string2 = c0ymw.toString();
        }
        pairArr2[14] = new Pair("send_error", string2);
        pairArr2[15] = new Pair("failure_source", str);
        Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dm_camera_send ");
        sbLIZ2.append(mapLJIIIIZZ2);
        C21682519tP.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), z);
        C20684815ws.LJIILLIIL("dm_camera_send", mapLJIIIIZZ2);
    }
}
