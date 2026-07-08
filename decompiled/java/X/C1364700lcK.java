package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.model.LiveShareSortModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364700lcK {
    public static final Pair<C1368260li4, C1364850lcZ> LIZ(SharePackage sharePackage) {
        Integer numValueOf;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        Serializable serializable;
        List<? extends IMContact> list;
        Object obj;
        int i;
        String string;
        C1362500lYm c1362500lYm;
        QuickShareAIInfo quickShareAIInfo;
        Integer numValueOf2;
        String string2;
        boolean z5;
        String string3;
        String string4;
        String string5;
        String string6;
        LiveShareSortModel liveShareSortModel;
        List<String> listLLZZJLIL;
        if (sharePackage == null) {
            return new Pair<>(new C1368260li4(0, false), new C1364850lcZ());
        }
        Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(sharePackage);
        if (awemeLJJIJIL != null) {
            numValueOf = Integer.valueOf(awemeLJJIJIL.getAwemeType());
        } else {
            numValueOf = null;
        }
        boolean z6 = sharePackage.extras.getBoolean("key_filter_group_chat");
        boolean z7 = sharePackage.extras.getBoolean("key_filter_group_camera_permission");
        if (z6 || ((awemeLJJIJIL != null && AwemeBizExtKt.isPhotoSwap(awemeLJJIJIL)) || (C1375880luM.LIZJ(numValueOf) && !C0ZNY.LIZJ()))) {
            z = true;
        } else {
            z = false;
        }
        if (!z7 && !C1375880luM.LIZJ(numValueOf)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!sharePackage.extras.getBoolean("key_filter_no_camera_permission") && !C1375880luM.LIZJ(numValueOf)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean zLIZ = C1215190hjB.LIZ(sharePackage);
        sharePackage.extras.getBoolean("is_video_only", false);
        String string7 = sharePackage.extras.getString("enter_from", "");
        C1368260li4 c1368260li4 = new C1368260li4(1, zLIZ);
        c1368260li4.LJIIL = z;
        c1368260li4.LJJ = z2;
        c1368260li4.LJIL = z3;
        c1368260li4.LJJIII = C13BV.INSTANCE;
        c1368260li4.LJJIFFI = 60;
        c1368260li4.LJIILLIIL = true;
        c1368260li4.LJIILL = sharePackage.extras.getBoolean("filter_self");
        c1368260li4.LJJII = z3;
        c1368260li4.LJIILIIL = C1364630lcD.LJ(sharePackage);
        c1368260li4.LJIILJJIL = C1364630lcD.LJFF(sharePackage);
        c1368260li4.LJIIZILJ = Intrinsics.LJFF(sharePackage.itemType, "streak_invite");
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (listLLZZJLIL = iLiveOuterService.LLZZJLIL()) != null) {
            arrayList = new ArrayList(listLLZZJLIL);
        } else {
            arrayList = null;
        }
        c1368260li4.LJIIIZ = arrayList;
        C1364850lcZ c1364850lcZ = new C1364850lcZ();
        String string8 = sharePackage.extras.getString("share_datasource_scene", "");
        if (string8.length() > 0 && C0BV0.LIZ() && (!Intrinsics.LJFF(string8, "ecom_cut_price") || ((Number) C279070Awj.LIZ.getValue()).intValue() == 1)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!Boolean.valueOf(z4).booleanValue()) {
            string8 = "default";
        }
        c1364850lcZ.LIZ = string8;
        ShareModel shareModel = sharePackage.shareModel;
        if (shareModel != null) {
            serializable = shareModel.customModel;
        } else {
            serializable = null;
        }
        if ((serializable instanceof LiveShareSortModel) && (liveShareSortModel = (LiveShareSortModel) serializable) != null) {
            list = liveShareSortModel.shareList;
        } else {
            list = null;
        }
        c1364850lcZ.LIZJ = list;
        Bundle bundle = sharePackage.extras;
        if (bundle != null) {
            try {
                obj = bundle.get("share_bb_guide_status");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, 2)) {
            i = 0;
        } else if (Intrinsics.LJFF(obj, 1)) {
            i = 2;
        } else {
            i = -1;
        }
        Bundle bundle2 = sharePackage.extras;
        if (bundle2 != null) {
            string = bundle2.getString("share_bb_id");
        } else {
            string = null;
        }
        Integer numValueOf3 = Integer.valueOf(i);
        if (i != -1 && string != null) {
            Bundle bundle3 = sharePackage.extras;
            if (bundle3 != null) {
                string3 = bundle3.getString("share_bb_id");
            } else {
                string3 = null;
            }
            Bundle bundle4 = sharePackage.extras;
            if (bundle4 != null) {
                string4 = bundle4.getString("share_bb_name");
            } else {
                string4 = null;
            }
            Bundle bundle5 = sharePackage.extras;
            if (bundle5 != null) {
                string5 = bundle5.getString("share_bb_icon_url");
            } else {
                string5 = null;
            }
            Bundle bundle6 = sharePackage.extras;
            if (bundle6 != null && (string6 = bundle6.getString("share_bb_sub_count")) != null) {
                C2095008Iq.LJIIJJI(string6);
            }
            c1362500lYm = new C1362500lYm(string3, string4, string5);
        } else {
            c1362500lYm = null;
        }
        Pair pair = new Pair(numValueOf3, c1362500lYm);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        C1362500lYm c1362500lYm2 = (C1362500lYm) pair.getSecond();
        if (iIntValue != -1 && c1362500lYm2 != null) {
            c1364850lcZ.LJFF = new C1156310gCD(iIntValue, c1362500lYm2);
        }
        if (C1575980r76.LIZIZ(string7)) {
            c1364850lcZ.LIZLLL = sharePackage.extras.getString("social_vibe_extra_param", "");
        }
        if (awemeLJJIJIL != null) {
            quickShareAIInfo = awemeLJJIJIL.getQuickShareAIInfo();
        } else {
            quickShareAIInfo = null;
        }
        c1364850lcZ.LJI = quickShareAIInfo;
        Bundle bundle7 = sharePackage.extras;
        if (bundle7 != null) {
            numValueOf2 = Integer.valueOf(bundle7.getInt("follow_status"));
        } else {
            numValueOf2 = null;
        }
        Bundle bundle8 = sharePackage.extras;
        if (bundle8 != null) {
            string2 = bundle8.getString("author_id");
        } else {
            string2 = null;
        }
        if (((Number) C289090BUt.LIZ.getValue()).intValue() <= 0 || numValueOf2 == null || numValueOf2.intValue() != 2 || C10EU.LJIIZILJ(string2) || (!Intrinsics.LJFF(sharePackage.itemType, "aweme") && !Intrinsics.LJFF(sharePackage.itemType, "aweme_photo"))) {
            string2 = null;
        }
        c1364850lcZ.LIZIZ = string2;
        c1364850lcZ.LJ = sharePackage.extras.getString("force_insert_conv");
        if (C1250860iei.LIZ(sharePackage) && C902900ZbU.LIZ(sharePackage)) {
            z5 = true;
        } else {
            z5 = false;
        }
        c1364850lcZ.LJII = z5;
        return new Pair<>(c1368260li4, c1364850lcZ);
    }
}
