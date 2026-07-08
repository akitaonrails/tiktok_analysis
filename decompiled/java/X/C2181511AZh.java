package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181511AZh {
    public static final EnumC955290axz LIZ(C1CWQ c1cwq) {
        int i = C1CX4.LIZ[c1cwq.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC955290axz.INIT_STATE;
                }
                return EnumC955290axz.LINKED_STATE;
            }
            return EnumC955290axz.PREPARING_STATE;
        }
        return EnumC955290axz.INIT_STATE;
    }

    public static final EnumC943640afC LIZIZ(C1CXK c1cxk) {
        int i = C1CX4.LJ[c1cxk.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC943640afC.UNDEFINED;
                }
                return EnumC943640afC.DISCONNECT;
            }
            return EnumC943640afC.NORMAL;
        }
        return EnumC943640afC.UNDEFINED;
    }

    public static final EnumC1286590jaL LIZJ(C1CX5 c1cx5) {
        switch (C1CX4.LIZLLL[c1cx5.ordinal()]) {
        }
        return EnumC1286590jaL.UNDEFINED;
    }

    public static final EnumC942070acf LIZLLL(C1CXJ c1cxj) {
        int i = C1CX4.LIZIZ[c1cxj.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return EnumC942070acf.UNKNOWN_STATE;
            }
            return EnumC942070acf.PAUSE_STATE;
        }
        return EnumC942070acf.NORMAL_STATE;
    }

    public static final C957030b0n LJ(C2181811AaB c2181811AaB) {
        PosIdentity posIdentityLJI;
        MultiGuestSpotExtra multiGuestSpotExtraLJIIIZ;
        long j = c2181811AaB.LIZ;
        C1283230jUv c1283230jUv = c2181811AaB.LIZIZ;
        MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtraLJIIJ = null;
        if (c1283230jUv != null) {
            posIdentityLJI = C1282000jSw.LJI(c1283230jUv);
        } else {
            posIdentityLJI = null;
        }
        String str = c2181811AaB.LIZLLL;
        if (str != null) {
            C973010bQZ c973010bQZ = C973010bQZ.LIZ;
            multiGuestSpotExtraLJIIIZ = C973010bQZ.LJIIIZ(str);
        } else {
            multiGuestSpotExtraLJIIIZ = null;
        }
        String str2 = c2181811AaB.LJ;
        String str3 = c2181811AaB.LJFF;
        if (str3 != null) {
            C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
            multiGuestSpotNonSeiExtraLJIIJ = C973010bQZ.LJIIJ(str3);
        }
        return new C957030b0n(j, posIdentityLJI, multiGuestSpotExtraLJIIIZ, str2, multiGuestSpotNonSeiExtraLJIIJ, c2181811AaB.LJI);
    }

    public static final C955230axt LJFF(C2181851AaF c2181851AaF) {
        C917100ZyO c917100ZyO;
        String str = c2181851AaF.LIZ;
        String str2 = c2181851AaF.LIZIZ;
        C2181931AaN c2181931AaN = c2181851AaF.LIZLLL;
        if (c2181931AaN != null) {
            c917100ZyO = new C917100ZyO(c2181931AaN.LIZ, c2181931AaN.LIZIZ);
        } else {
            c917100ZyO = null;
        }
        return new C955230axt(str, str2, c917100ZyO);
    }

    public static final Rect LJI(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.leftMargin;
            return new Rect(i, marginLayoutParams.topMargin, layoutParams.width + i, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + layoutParams.height);
        }
        return new Rect(0, 0, 0, 0);
    }

    public static final C2181931AaN LJII(C917100ZyO c917100ZyO) {
        return new C2181931AaN(c917100ZyO.LIZ, c917100ZyO.LIZIZ);
    }

    public static final EnumC2181681AZy LJIIIIZZ(EnumC965630bEf enumC965630bEf) {
        C2182201Aao c2182201Aao = EnumC2181681AZy.Companion;
        int value = enumC965630bEf.getValue();
        c2182201Aao.getClass();
        switch (value) {
            case 0:
                return EnumC2181681AZy.Unknown;
            case 1:
                return EnumC2181681AZy.FinishChannelApi;
            case 2:
                return EnumC2181681AZy.FinishChannelMsg;
            case 3:
                return EnumC2181681AZy.Reset;
            case 4:
                return EnumC2181681AZy.Drop;
            case 5:
                return EnumC2181681AZy.SeiEnd;
            case 6:
                return EnumC2181681AZy.LayoutKeyBlocked;
            case 7:
                return EnumC2181681AZy.RemoveLayout;
            case 8:
                return EnumC2181681AZy.RtcError;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2181681AZy.LeaveGroup;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2181681AZy.LeaveGroupMessage;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2181681AZy.RechargeGroupNotLinked;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2181681AZy.FullScreenEnd;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unmatched primitive enum value: LinkLayoutEndSource with ");
                sbLIZ.append(value);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final int LJIIIZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        return 0;
    }

    public static final JSONObject LJIIJ(C1283980jW8 c1283980jW8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        double d = c1283980jW8.LIZ;
        double d2 = 0.0d;
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        jSONObject.put("left", d);
        double d3 = c1283980jW8.LIZIZ;
        if (Double.isNaN(d3)) {
            d3 = 0.0d;
        }
        jSONObject.put("top", d3);
        double d4 = c1283980jW8.LIZJ;
        if (Double.isNaN(d4)) {
            d4 = 0.0d;
        }
        jSONObject.put("right", d4);
        double d5 = c1283980jW8.LIZLLL;
        if (Double.isNaN(d5)) {
            d5 = 0.0d;
        }
        jSONObject.put("bottom", d5);
        double d6 = c1283980jW8.LJ;
        if (!Double.isNaN(d6)) {
            d2 = d6;
        }
        jSONObject.put("radius", d2);
        return jSONObject;
    }

    public static final JSONObject LJIIJJI(C2181741Aa4 c2181741Aa4) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, c2181741Aa4.LIZ);
        jSONObject2.put("spotId", c2181741Aa4.LIZIZ);
        jSONObject2.put("contentLinkMicId", c2181741Aa4.LIZJ);
        C2182241Aas c2182241Aas = c2181741Aa4.LIZLLL;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(FollowStatusChangeMethod.PARAM_UID, c2182241Aas.LIZ);
        jSONObject3.put("frame", LJIIJ(c2182241Aas.LIZIZ));
        jSONObject2.put("viewInfo", jSONObject3);
        C2182241Aas c2182241Aas2 = c2181741Aa4.LJ;
        if (c2182241Aas2 != null) {
            jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c2182241Aas2.LIZ);
            jSONObject.put("frame", LJIIJ(c2182241Aas2.LIZIZ));
        } else {
            jSONObject = null;
        }
        jSONObject2.put("rtcViewInfo", jSONObject);
        jSONObject2.put("winState", c2181741Aa4.LJFF);
        jSONObject2.put("onlineState", c2181741Aa4.LJI);
        jSONObject2.put("zOrder", c2181741Aa4.LJII);
        C1283230jUv c1283230jUv = c2181741Aa4.LJIIIIZZ;
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("posType", c1283230jUv.LIZ);
        jSONObject4.put("value", c1283230jUv.LIZIZ);
        jSONObject2.put("uiPos", jSONObject4);
        jSONObject2.put("isSelf", c2181741Aa4.LJIIIZ);
        jSONObject2.put("isRoomOwner", c2181741Aa4.LJIIJ);
        C2182121Aag c2182121Aag = c2181741Aa4.LJIIJJI;
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("multiGuestSpotExtra", c2182121Aag.LIZ);
        jSONObject2.put("extra", jSONObject5);
        return jSONObject2;
    }

    public static final EnumC965730bEp LJIIL(C1AZU c1azu) {
        int i = C1CX4.LIZJ[c1azu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return EnumC965730bEp.CROSS;
        }
        return EnumC965730bEp.INNER;
    }

    public static final int LJIILIIL(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return 0;
    }
}
