package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.infra.riskapi.api.PFVisibleInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.feed.platform.cell.interact.next.ability.StandardPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0S41, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S41 {
    public static final C0S41 LIZ = new C0S41();

    public static C0S4B LJI(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C0S4B) {
            return (C0S4B) obj;
        }
        if (obj instanceof StandardPriorityProtocol) {
            InterfaceC736810SvH interfaceC736810SvHJO0 = ((StandardPriorityProtocol) obj).jO0();
            if (!(interfaceC736810SvHJO0 instanceof C0S4B)) {
                return null;
            }
            return (C0S4B) interfaceC736810SvHJO0;
        }
        if (!(obj instanceof C0RY3)) {
            return null;
        }
        return LJI(((C0RY3) obj).a7());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PFVisibleInfo LIZ(int i, ViewParent viewParent) {
        if (i <= 0 || !(viewParent instanceof View)) {
            return null;
        }
        View view = (View) viewParent;
        return new PFVisibleInfo("", String.valueOf(view.getVisibility()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()), Float.valueOf(view.getAlpha()), C2180521AVm.LIZIZ(view, EnumC20441014ye.V), null, LIZ(i - 1, view.getParent()));
    }

    public static void LIZJ(JSONObject jSONObject, long j, C0SZ8 c0sz8) throws JSONException {
        Aweme aweme;
        int awemePosition;
        long j2;
        Object obj;
        VideoBaseCell videoBaseCell;
        Integer numValueOf = null;
        if (c0sz8 != null) {
            aweme = c0sz8.getAweme();
        } else {
            aweme = null;
        }
        boolean z = c0sz8 instanceof VideoViewCell;
        if (z && (videoBaseCell = (VideoBaseCell) c0sz8) != null) {
            awemePosition = videoBaseCell.LLJJI;
            if (aweme != null) {
                numValueOf = Integer.valueOf(aweme.getAwemeType());
            }
        } else if (aweme != null) {
            awemePosition = AwemeBizExtKt.getAwemePosition(aweme);
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            awemePosition = -1;
        }
        jSONObject.put("aweme_type", numValueOf);
        if (j > Mp4ScreenVideoLoadTimeout.CONTROL) {
            j2 = 50;
        } else {
            j2 = j / ((long) 100);
        }
        jSONObject.put("select_gap", j2);
        if (z) {
            VideoViewCell videoViewCell = (VideoViewCell) c0sz8;
            C0RF0 c0rf0 = videoViewCell.LLJILJILJ;
            int i = c0rf0.LJIIJ;
            jSONObject.put("cell_type", c0rf0.LJIILJJIL);
            jSONObject.put("page_type", i);
            jSONObject.put("pos", awemePosition);
            String str = "1";
            if (videoViewCell.yE0()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_clean", obj);
            HashMap map = new HashMap();
            map.put("clean_type", TextUtils.join("_", videoViewCell.LLZIL));
            Boolean bool = videoViewCell.K;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                str = "-1";
            }
            map.put("cell_create", str);
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public static C0S46 LJ(int i, View view, boolean z) {
        C1AV2 c1av2;
        C1AV2 c1av22;
        if (view == null) {
            return C0S46.EMPTY;
        }
        if (view.getVisibility() != 0) {
            if (z) {
                Object tag = view.getTag(R.id.emg);
                if ((tag instanceof C1AV2) && (c1av22 = (C1AV2) tag) != null && c1av22.LJI) {
                    return C0S46.NONE_SKIP;
                }
            }
            return C0S46.VISIBILITY;
        }
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            if (view.getAlpha() <= 0.0f) {
                if (z) {
                    Object tag2 = view.getTag(R.id.eme);
                    if ((tag2 instanceof C1AV2) && (c1av2 = (C1AV2) tag2) != null && c1av2.LJI) {
                        return C0S46.NONE_SKIP;
                    }
                }
                return C0S46.ALPHA;
            }
            if (i == 0) {
                return C0S46.NONE;
            }
            if (view.getParent() instanceof View) {
                return LJ(i - 1, (View) view.getParent(), z);
            }
            return C0S46.NONE;
        }
        return C0S46.SIZE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(java.util.Map r8, boolean r9, boolean r10, boolean r11) {
        /*
            if (r9 == 0) goto L9
            X.0S42 r0 = X.C0S42.CLEAN_MODE
            int r0 = r0.getId()
            return r0
        L9:
            if (r10 == 0) goto L12
            X.0S42 r0 = X.C0S42.UG_CARD_SURVEY
            int r0 = r0.getId()
            return r0
        L12:
            if (r11 == 0) goto L1b
            X.0S42 r0 = X.C0S42.REFERRAL
            int r0 = r0.getId()
            return r0
        L1b:
            com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor r0 = com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor.LL
            r0.getClass()
            X.0S3v r7 = com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor.LLJI
            if (r7 == 0) goto L51
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r7.LIZIZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
            long r5 = r5 - r3
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L51
            if (r7 == 0) goto L51
            java.lang.String r1 = r7.LIZJ
            if (r1 == 0) goto L42
            java.lang.String r0 = "skip_extra_biz_id"
            r8.put(r0, r1)
        L42:
            X.0S43 r0 = r7.LIZ
            if (r0 == 0) goto L51
            X.0S42 r0 = r0.getSkipType()
            if (r0 == 0) goto L51
        L4c:
            int r0 = r0.getId()
            return r0
        L51:
            X.0S42 r0 = X.C0S42.NONE
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S41.LIZLLL(java.util.Map, boolean, boolean, boolean):int");
    }

    public final PFVisibleInfo LIZIZ(View view, int i, String str, boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Float fValueOf;
        Map<String, C1AV2> mapLIZIZ;
        getClass();
        C0S46 c0s46LJ = LJ(i, view, true);
        if (Intrinsics.LJFF(str, C0S45.INFO_TITLE.getViewKey()) && c0s46LJ == C0S46.SIZE) {
            c0s46LJ = C0S46.NONE;
        }
        PFVisibleInfo pFVisibleInfoLIZ = null;
        ViewParent parent = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        if (view != null) {
            numValueOf2 = Integer.valueOf(view.getWidth());
            numValueOf3 = Integer.valueOf(view.getHeight());
            fValueOf = Float.valueOf(view.getAlpha());
            mapLIZIZ = C2180521AVm.LIZIZ(view, EnumC20441014ye.V);
        } else {
            numValueOf2 = null;
            numValueOf3 = null;
            fValueOf = null;
            mapLIZIZ = null;
        }
        if (z) {
            if (view != null) {
                parent = view.getParent();
            }
            pFVisibleInfoLIZ = LIZ(i, parent);
        }
        return new PFVisibleInfo(str, strValueOf, numValueOf2, numValueOf3, fValueOf, mapLIZIZ, c0s46LJ, pFVisibleInfoLIZ);
    }
}
