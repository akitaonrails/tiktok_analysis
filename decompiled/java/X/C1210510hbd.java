package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210510hbd {
    public static final String LIZ(Aweme aweme) {
        for (AnchorCommonStruct anchorCommonStruct : aweme.getAnchors()) {
            if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                return anchorCommonStruct.getId();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean LIZIZ(Aweme aweme) {
        return LIZJ(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), aweme);
    }

    public static final boolean LIZLLL(Aweme aweme) {
        return LIZJ(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), aweme);
    }

    public static final boolean LIZJ(int i, Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        AnchorCommonStruct next;
        String extra;
        String string;
        String extra2;
        Object objOpt;
        if (aweme.getAnchors() == null || !(!aweme.getAnchors().isEmpty())) {
            return false;
        }
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == i) {
                Iterator<AnchorCommonStruct> it3 = aweme.getAnchors().iterator();
                while (true) {
                    anchorCommonStruct = null;
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.getType() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct2 = next;
                String str = "";
                if (anchorCommonStruct2 == null || (extra = anchorCommonStruct2.getExtra()) == null) {
                    extra = "";
                }
                try {
                    objOpt = new JSONObject(extra).opt("origin_video_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (objOpt == null) {
                    string = "";
                } else {
                    string = objOpt.toString();
                    if (string == null) {
                        string = "";
                    }
                }
                if (!Intrinsics.LJFF(string, aweme.getAid())) {
                    return false;
                }
                Iterator<AnchorCommonStruct> it4 = aweme.getAnchors().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next2 = it4.next();
                    if (next2.getType() == i) {
                        anchorCommonStruct = next2;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
                if (anchorCommonStruct3 == null || (extra2 = anchorCommonStruct3.getExtra()) == null) {
                    extra2 = "";
                }
                try {
                    Object objOpt2 = new JSONObject(extra2).opt("author_id");
                    if (objOpt2 != null) {
                        String string2 = objOpt2.toString();
                        if (string2 != null) {
                            str = string2;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (!Intrinsics.LJFF(str, C0XQ7.LJFF().getCurUserId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
