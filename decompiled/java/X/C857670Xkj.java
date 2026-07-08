package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857670Xkj {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJ() {
        return (!((Boolean) C276210As7.LIZ.getValue()).booleanValue() || C0CHQ.LIZ().getAccountService().LIZ() || LIZJ()) ? false : true;
    }

    public static InterfaceC2257101DWa LIZ() {
        return C0CHQ.LIZ().getAccountService().getCurrentUser();
    }

    public static boolean LIZJ() {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        return currentUser != null && currentUser.LJIIIZ();
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isFromOnThisDay()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getTtStoryUploadModel() != null) {
                return true;
            }
            str = videoPublishEditModel.mShootWay;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "story")) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        Boolean boolValueOf;
        if (!LJ()) {
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ab:");
            sbLIZ.append(((Boolean) C276210As7.LIZ.getValue()).booleanValue());
            sbLIZ.append(", isChildrenMode:");
            sbLIZ.append(C0CHQ.LIZ().getAccountService().LIZ());
            sbLIZ.append(", isPrivateAccount:");
            sbLIZ.append(LIZJ());
            C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (videoPublishEditModel != null) {
            boolValueOf = Boolean.valueOf(C1428470nHB.LJJZZI(videoPublishEditModel));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck is in image mode");
            return false;
        }
        if (LIZLLL(videoPublishEditModel)) {
            C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck in story mode");
            return false;
        }
        if (LIZIZ(videoPublishEditModel)) {
            C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck isFromOnThisDay");
            return false;
        }
        return true;
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, boolean z, Function0 function0) {
        if ((z && videoPublishEditModel != null && C1428470nHB.LJZL(videoPublishEditModel)) || !LJFF(videoPublishEditModel)) {
            return;
        }
        try {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C858840Xmc(videoPublishEditModel, null, function0), 3);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("crash e:");
            sbLIZ.append(e.getMessage());
            C201955140j.LJII(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
