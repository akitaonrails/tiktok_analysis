package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409940mnI {
    public static ComposerBeautyBuriedInfo LIZIZ;
    public static MBeautyStateInfo LIZJ;
    public static String LIZ = "";
    public static String LIZLLL = "";
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(491));
    public static final CopyOnWriteArrayList<ComposerBeautyBuriedInfo> LJFF = new CopyOnWriteArrayList<>();

    public static final void LJI() {
        LIZIZ = null;
        LIZLLL = "";
        LIZ = "";
        LJFF.clear();
    }

    public static final void LJFF() {
        CopyOnWriteArrayList<ComposerBeautyBuriedInfo> copyOnWriteArrayList = LJFF;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
        LIZIZ = null;
        LIZLLL = "";
    }

    public static final String LIZLLL() {
        return LIZ;
    }

    public static final String LJ(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        List<BeautifyInfo> beautifyInfo;
        String json;
        if (Intrinsics.LJFF(composerBeautyBuriedInfo, LIZIZ)) {
            json = LIZLLL;
        } else {
            if (composerBeautyBuriedInfo != null) {
                LJFF.add(composerBeautyBuriedInfo);
            }
            Gson gson = C0CHQ.LIZ().getGson();
            if (composerBeautyBuriedInfo != null) {
                beautifyInfo = composerBeautyBuriedInfo.getBeautifyInfo();
            } else {
                beautifyInfo = null;
            }
            json = GsonProtectorUtils.toJson(gson, beautifyInfo);
        }
        LIZLLL = json;
        if (composerBeautyBuriedInfo != null) {
            LIZIZ = composerBeautyBuriedInfo.copy(composerBeautyBuriedInfo.beautifyUsed, composerBeautyBuriedInfo.isComposer, composerBeautyBuriedInfo.beautyStatus, composerBeautyBuriedInfo.beautifyInfo);
        }
        return json;
    }

    public static BeautyMobParam LIZIZ(List list, boolean z) {
        StrArray strArray = new StrArray();
        StrArray strArray2 = new StrArray();
        StrArray strArray3 = new StrArray();
        StrArray strArray4 = new StrArray();
        StrArray strArray5 = new StrArray();
        StrArray strArray6 = new StrArray();
        if (C1651050t4B.LIZ()) {
            if (z) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ComposerBeauty composerBeauty = (ComposerBeauty) it2.next();
                    String parentId = composerBeauty.getParentId();
                    if (parentId != null && parentId.length() != 0) {
                        strArray.add(composerBeauty.getEffect().getEffectId());
                        strArray2.add(composerBeauty.getEffect().getName());
                        strArray3.add(String.valueOf(composerBeauty.getProgressValue() / 100.0f));
                    } else {
                        strArray4.add(composerBeauty.getEffect().getEffectId());
                        strArray5.add(composerBeauty.getEffect().getName());
                        strArray6.add(String.valueOf(composerBeauty.getProgressValue() / 100.0f));
                    }
                }
            }
        } else {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ComposerBeauty composerBeauty2 = (ComposerBeauty) it3.next();
                String parentId2 = composerBeauty2.getParentId();
                if (parentId2 != null && parentId2.length() != 0) {
                    strArray.add(composerBeauty2.getEffect().getEffectId());
                    strArray2.add(composerBeauty2.getEffect().getName());
                    strArray3.add(String.valueOf(composerBeauty2.getProgressValue() / 100.0f));
                } else {
                    strArray4.add(composerBeauty2.getEffect().getEffectId());
                    strArray5.add(composerBeauty2.getEffect().getName());
                    strArray6.add(String.valueOf(composerBeauty2.getProgressValue() / 100.0f));
                }
            }
        }
        return new BeautyMobParam(strArray.toString(), strArray2.toString(), strArray3.toString(), strArray4.toString(), strArray5.toString(), strArray6.toString());
    }

    public static final int LIZJ(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo) {
        if (composerBeautyBuriedInfo != null && composerBeautyBuriedInfo.getBeautyStatus() == 1) {
            return 1;
        }
        if (mBeautyStateInfo != null && mBeautyStateInfo.getBeautyStatus() == 1) {
            return 1;
        }
        return 0;
    }

    public static void LIZ(Integer num, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo) {
        String strLJ = LJ(composerBeautyBuriedInfo);
        C0LAB c0lab = new C0LAB();
        c0lab.LIZLLL(num, "beautify_used");
        c0lab.LIZ(1, "is_composer");
        if (C294160Bfy.LIZ()) {
            c0lab.LJ("beautify_info", strLJ);
        }
        C2341909Fp.LIZ("perf_record_video", c0lab.LIZ);
        if (LIZ.length() == 0) {
            LIZ = strLJ;
        }
        LIZJ = mBeautyStateInfo;
    }
}
