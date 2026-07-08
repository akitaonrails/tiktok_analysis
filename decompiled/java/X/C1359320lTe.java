package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359320lTe {
    public static final C1359320lTe LIZ = new C1359320lTe();

    public static void LIZ(String str, UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, C1359270lTZ c1359270lTZ, Function1 function1) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        if (!c1359270lTZ.LIZIZ) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            C1359400lTm c1359400lTm = new C1359400lTm(upvotePublishExtraData, upvotePublishMobParam, str);
            C1359460lTs c1359460lTs = new C1359460lTs();
            c1359460lTs.LIZ = new WeakReference<>(c19egLIZIZ);
            c1359460lTs.LIZIZ = upvotePublishMobParam.enterMethod;
            c1359460lTs.LIZJ = c1359400lTm;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            C1359570lU3 c1359570lU3 = new Object() { // from class: X.0lU3
            };
            Aweme aweme = upvotePublishExtraData.aweme;
            String str2 = upvotePublishMobParam.enterFrom;
            String str3 = upvotePublishMobParam.enterMethod;
            c1359570lU3.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show F1 encourage input: enterFrom=");
            sbLIZ.append(str2);
            sbLIZ.append(", enterMethod=");
            sbLIZ.append(str3);
            sbLIZ.append(", isFromWhiteBar=");
            sbLIZ.append(C13LP.LJJJJ(c1359460lTs.LIZIZ, C13LQ.LJLIIL(new String[]{"expose_button", "button", "quick_repost"})));
            C429430Gsf.LIZ("RepostTextEncourageInputLauncher", C2188811AlT.LIZIZ(sbLIZ));
            String str4 = RepostInputFragment._pnsPageId;
            C1359730lUJ.LIZIZ(c19egLIZIZ);
            RepostInputFragment repostInputFragmentLIZ = C1359730lUJ.LIZ(aweme, true, str2, str3, null, null, EnumC1359800lUQ.BUTTON, null, null, null, null, null, null, null, 32624);
            repostInputFragmentLIZ.LLLF = c1359460lTs;
            repostInputFragmentLIZ.show(c19egLIZIZ.getSupportFragmentManager(), "REPOST_INPUT");
            return;
        }
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e A[PHI: r1
      0x017e: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v65 java.lang.String) binds: [B:28:0x004c, B:30:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1359320lTe r27, java.lang.String r28, com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r29, boolean r30, kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function0 r32, boolean r33, com.ss.android.ugc.aweme.feed.model.upvote.CarrierType r34, java.lang.String r35, java.lang.String r36, androidx.fragment.app.Fragment r37, int r38) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359320lTe.LIZJ(X.0lTe, java.lang.String, com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, com.ss.android.ugc.aweme.feed.model.upvote.CarrierType, java.lang.String, java.lang.String, androidx.fragment.app.Fragment, int):void");
    }
}
