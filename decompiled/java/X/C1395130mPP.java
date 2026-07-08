package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395130mPP {
    public static final boolean LIZJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null) {
            anchors = aweme.getAnchors();
        } else {
            anchors = null;
        }
        if (anchors == null || !(!aweme.getAnchors().isEmpty())) {
            return false;
        }
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (aweme.getAnchors() == null || !(!aweme.getAnchors().isEmpty())) {
            return false;
        }
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE;
                if (!Intrinsics.LJFF(LIZIZ(enumC1430380nKG.getTYPE(), aweme), aweme.getAid()) || !Intrinsics.LJFF(LIZ(enumC1430380nKG.getTYPE(), aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJFF(Aweme aweme) {
        AnchorCommonStruct next;
        String extra;
        String string;
        if (aweme != null) {
            try {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getType() == EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
                        Object objOpt = new JSONObject(extra).opt("is_hide");
                        if (objOpt == null || (string = objOpt.toString()) == null) {
                            string = "";
                        }
                        if (Intrinsics.LJFF("1", string)) {
                            return true;
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static final String LIZ(int i, Aweme aweme) {
        AnchorCommonStruct next;
        String extra;
        boolean z;
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct = next;
        if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null) {
            extra = "";
        }
        try {
            Object objOpt = new JSONObject(extra).opt("author_id");
            if (objOpt != null) {
                String string = objOpt.toString();
                if (string != null) {
                    return string;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    public static final String LIZIZ(int i, Aweme aweme) {
        AnchorCommonStruct next;
        String extra;
        boolean z;
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct = next;
        if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null) {
            extra = "";
        }
        try {
            Object objOpt = new JSONObject(extra).opt("origin_video_id");
            if (objOpt != null) {
                String string = objOpt.toString();
                if (string != null) {
                    return string;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    public static final boolean LJ(int i, Aweme aweme) {
        if (aweme.getAnchors() == null || !(!aweme.getAnchors().isEmpty())) {
            return false;
        }
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == i) {
                if (!Intrinsics.LJFF(LIZIZ(i, aweme), aweme.getAid()) || !Intrinsics.LJFF(LIZ(i, aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJI(int i, Aweme aweme) {
        AnchorCommonStruct next;
        String extra;
        String string;
        boolean zLJFF = false;
        try {
            Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null) {
                Object objOpt = new JSONObject(extra).opt("is_hide");
                if (objOpt == null || (string = objOpt.toString()) == null) {
                    string = "";
                }
                zLJFF = Intrinsics.LJFF("1", string);
                return zLJFF;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zLJFF;
    }

    public static final void LJII(Aweme aweme, boolean z) {
        AnchorCommonStruct next;
        JSONObject jSONObject;
        String str;
        if (aweme != null) {
            try {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getType() == EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct != null) {
                        String extra = anchorCommonStruct.getExtra();
                        if (extra.length() == 0) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(extra);
                        }
                        if (z) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("is_hide", str);
                        anchorCommonStruct.setExtra(C786410Ut5.J3(jSONObject));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
