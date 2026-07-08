package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048040dNa {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        boolean z;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) it2.next();
                if (anchorCommonStruct.getType() == EnumC1430380nKG.TTCM.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.BA_DOWNLOAD_ANCHOR.getTYPE()) {
                    if (anchorCommonStruct.getExtra().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            String string = JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "business_data")), "anchorData")), "extra")), "adRefAppId");
                            string.toString();
                            return string;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                            return null;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static Integer LIZIZ(List list) {
        boolean z;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) it2.next();
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_TCM_COMMENT.getTYPE()) {
                    if (anchorCommonStruct.getExtra().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            return Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "business_data")), "anchorData")), "extra")), "anchor_partner"));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                            return null;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static Pair LIZJ(List list) {
        Integer numValueOf = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) it2.next();
                int type = anchorCommonStruct.getType();
                EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.BA_PRODUCT_ANCHOR;
                if (type == enumC1430380nKG.getTYPE()) {
                    String typename = enumC1430380nKG.getTYPENAME();
                    try {
                        numValueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(anchorCommonStruct.getExtra()), "partner_scence"));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return new Pair(typename, numValueOf);
                }
                EnumC1430380nKG enumC1430380nKG2 = EnumC1430380nKG.GET_LEADS;
                if (type == enumC1430380nKG2.getTYPE()) {
                    return new Pair(enumC1430380nKG2.getTYPENAME(), null);
                }
                if (type == EnumC1430380nKG.DM_ANCHOR.getTYPE()) {
                    return new Pair("ba_DM_anchor", null);
                }
                if (type != EnumC1430380nKG.TTCM.getTYPE()) {
                    if (type != EnumC1430380nKG.BA_DOWNLOAD_ANCHOR.getTYPE()) {
                        EnumC1430380nKG enumC1430380nKG3 = EnumC1430380nKG.ANCHOR_TCM_COMMENT;
                        if (type == enumC1430380nKG3.getTYPE()) {
                            String strValueOf = String.valueOf(enumC1430380nKG3.getTYPE());
                            try {
                                numValueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "business_data")), "anchorData")), "partnerScence"));
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            return new Pair(strValueOf, numValueOf);
                        }
                        C0OFE.LIZ(null, null);
                    } else {
                        try {
                            numValueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "business_data")), "anchorData")), "partnerScence"));
                        } catch (JSONException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                        return new Pair("download_ba_anchor", numValueOf);
                    }
                } else {
                    try {
                        numValueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "business_data")), "anchorData")), "partnerScence"));
                    } catch (JSONException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    return new Pair("download_anchor", numValueOf);
                }
            }
        }
        return new Pair(null, null);
    }

    public static String LIZLLL(List list) {
        AnchorCommonStruct anchorCommonStruct;
        boolean z;
        if (list != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(list)) != null) {
            if (anchorCommonStruct.getType() == 76 || anchorCommonStruct.getType() == 56) {
                if (anchorCommonStruct.getExtra().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        String string = JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "pixel_id");
                        string.toString();
                        return string;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
