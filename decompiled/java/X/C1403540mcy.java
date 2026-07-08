package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403540mcy {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(Object obj) {
        String str;
        if (obj instanceof ShortVideoContext) {
            return ((ShortVideoContext) obj).getCreationId();
        }
        if (obj instanceof VideoPublishEditModel) {
            return ((BaseShortVideoContext) obj).getCreationId();
        }
        if (!(obj instanceof LinkedHashMap)) {
            return null;
        }
        Object obj2 = ((Map) obj).get("creation_id");
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            return str;
        }
        return "";
    }

    public static String LIZLLL(Object obj) {
        String str;
        if (obj instanceof ShortVideoContext) {
            return ((ShortVideoContext) obj).enterFrom;
        }
        if (obj instanceof VideoPublishEditModel) {
            return ((VideoPublishEditModelKt) obj).getEnterFrom();
        }
        if (!(obj instanceof LinkedHashMap)) {
            return null;
        }
        Object obj2 = ((Map) obj).get("enter_from");
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            return str;
        }
        return "";
    }

    public static String LJ(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            return LJFF(videoPublishEditModel.getNewDraftId(), videoPublishEditModel.isFromCrash(), videoPublishEditModel.isFromRestoreRecover(), videoPublishEditModel.mIsFromDraft);
        }
        if (obj instanceof LinkedHashMap) {
            Map map = (Map) obj;
            Object obj2 = map.get("is_from_crash");
            String str = null;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            boolean zLJFF = Intrinsics.LJFF(obj2, "true");
            Object obj3 = map.get("is_from_restore_recover");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            boolean zLJFF2 = Intrinsics.LJFF(obj3, "true");
            Object obj4 = map.get("is_from_draft");
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            boolean zLJFF3 = Intrinsics.LJFF(obj4, "true");
            Object obj5 = map.get("new_draft_id");
            if (obj5 instanceof String) {
                str = (String) obj5;
            }
            return LJFF(str, zLJFF, zLJFF2, zLJFF3);
        }
        return "other";
    }

    public static String LJI(Object obj, String str) {
        String str2;
        if (obj instanceof ShortVideoContext) {
            return ((ShortVideoContext) obj).shootWay;
        }
        if (obj instanceof VideoPublishEditModel) {
            return ((BaseShortVideoContext) obj).mShootWay;
        }
        if (!(obj instanceof LinkedHashMap)) {
            return str;
        }
        Object obj2 = ((Map) obj).get("shoot_way");
        if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
            return str2;
        }
        return "";
    }

    public static String LIZ(String str, String str2, boolean z) {
        if (z && str.length() > 0 && !Intrinsics.LJFF(str2, str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('-');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public static String LIZIZ(List list, List list2, boolean z) {
        if (z && !list2.containsAll(list)) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLI(list, list2), ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ.length() > 0) {
                return strLJJLIIIJ;
            }
            return null;
        }
        return null;
    }

    public static String LJFF(String str, boolean z, boolean z2, boolean z3) {
        if (z) {
            if (!z2) {
                return "crash_return_record";
            }
            return "crash_return_edit";
        }
        if (!z3) {
            if (C123100dR.LIZ(str) && !z) {
                return "draft";
            }
            return "other";
        }
        return "draft";
    }
}
