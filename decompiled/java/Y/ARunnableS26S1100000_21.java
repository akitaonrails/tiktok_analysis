package Y;

import X.C06UM;
import X.C08HL;
import X.C11RK;
import X.C1344860l6K;
import X.C1345760l7m;
import X.C1360460lVU;
import X.C1395560mQ6;
import X.C163A;
import X.C19606111nH;
import X.C1C7U;
import X.C2196981Aye;
import X.C2215208m6;
import X.EnumC1235690iGF;
import X.EnumC1381400m3G;
import X.EnumC1395590mQ9;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.DetailBottomFakeInput;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS135S1100000_21;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS26S1100000_21 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL;
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        c1360460lVU.LJJIJL();
        InterfaceC665370Q7z interfaceC665370Q7zC6 = ((BaseCommentCell) this.l1).c6();
        if (interfaceC665370Q7zC6 != null && (iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(((BaseCommentCell) this.l1).getFragment(), interfaceC665370Q7zC6)) != null) {
            iCommentListAssemAbilityLIZLLL.Zy0(((BaseCommentCell) this.l1).itemView, 2131846395, EnumC1235690iGF.TOP);
        }
        c1360460lVU.LJJJJJ(this.s0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r2.equals("delete_fail") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r2.equals("delete_success") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r2.equals("publish_fail") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r2.equals("delete_cache_success") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r0 = r3.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        r0.LJFF("duplicate_publish");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS26S1100000_21.LIZ$1():void");
    }

    public final void LIZ$2() throws JSONException {
        IReportService iReportService = (IReportService) ServiceManager.get().getService(IReportService.class);
        Activity activity = ((C1395560mQ6) this.l1).LIZJ;
        Uri.Builder builder = new Uri.Builder();
        String str = this.s0;
        C1395560mQ6 c1395560mQ6 = (C1395560mQ6) this.l1;
        builder.appendQueryParameter("object_id", str);
        builder.appendQueryParameter("owner_id", "1");
        builder.appendQueryParameter("report_type", "minis");
        builder.appendQueryParameter("enter_from", "minis");
        builder.appendQueryParameter("enter_method", "minis_report");
        builder.appendQueryParameter("client_key", c1395560mQ6.LIZIZ);
        builder.appendQueryParameter("report_success_notification", "1");
        iReportService.LIZIZ(activity, builder);
        ((C1395560mQ6) this.l1).LJIIIZ.LIZ(EnumC1395590mQ9.OPEN_TNS, EnumC1381400m3G.SUCCESS, null, null);
    }

    public static final void run$0(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("BaseCommentCell@3af4.tryShowRepostGuideTooltip$1");
        try {
            aRunnableS26S1100000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseCommentCell@3af4.tryShowRepostGuideTooltip$1");
    }

    public static final void run$1(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("UpvoteVideoAssemNew@1483.tryShowUpvoteWhiteBar$2");
        try {
            aRunnableS26S1100000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UpvoteVideoAssemNew@1483.tryShowUpvoteWhiteBar$2");
    }

    public static final void run$2(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C11RK<Boolean> c11rkRemove;
        C1C7U.LIZ("TranslationRepo@c3d5.awaitTranslationResults$1$1$1");
        try {
            if (!((C163A) aRunnableS26S1100000_21.l1).LIZJ.containsKey(aRunnableS26S1100000_21.s0) && (c11rkRemove = ((C163A) aRunnableS26S1100000_21.l1).LIZLLL.remove(aRunnableS26S1100000_21.s0)) != null) {
                c11rkRemove.onError(new Exception("Timeout. No result received"));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TranslationRepo@c3d5.awaitTranslationResults$1$1$1");
    }

    public static final void run$3(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisStatusViewWrapper@abbf.setMinisIconUrl$1");
        try {
            C2196981Aye c2196981Aye = (C2196981Aye) aRunnableS26S1100000_21.l1;
            c2196981Aye.LJIIJJI = aRunnableS26S1100000_21.s0;
            c2196981Aye.LIZJ(c2196981Aye.LJII);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisStatusViewWrapper@abbf.setMinisIconUrl$1");
    }

    public static final void run$4(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisReportInstance@2783.openTnSMiniGameReport$1");
        try {
            com.ss.android.ugc.tiktok.report.interfaces.IReportService.LIZ.getClass();
            C06UM.LIZ().report(new AwS135S1100000_21((C1395560mQ6) aRunnableS26S1100000_21.l1, aRunnableS26S1100000_21.s0, 14));
            ((C1395560mQ6) aRunnableS26S1100000_21.l1).LJIIIZ.LIZ(EnumC1395590mQ9.OPEN_TNS, EnumC1381400m3G.SUCCESS, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisReportInstance@2783.openTnSMiniGameReport$1");
    }

    public static final void run$5(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisReportInstance@2783.openTnSReport$1");
        try {
            aRunnableS26S1100000_21.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisReportInstance@2783.openTnSReport$1");
    }

    public static final void run$6(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentAccessibilityDelegate@2ec5.performAccessibilityAction$1");
        try {
            ((View) aRunnableS26S1100000_21.l1).announceForAccessibility(aRunnableS26S1100000_21.s0);
            ((View) aRunnableS26S1100000_21.l1).sendAccessibilityEvent(8);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentAccessibilityDelegate@2ec5.performAccessibilityAction$1");
    }

    public static final void run$7(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentAccessibilityDelegate@2ec5.performAccessibilityAction$2");
        try {
            ((View) aRunnableS26S1100000_21.l1).announceForAccessibility(aRunnableS26S1100000_21.s0);
            ((View) aRunnableS26S1100000_21.l1).sendAccessibilityEvent(8);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentAccessibilityDelegate@2ec5.performAccessibilityAction$2");
    }

    public static final void run$8(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        String strLIZ;
        C1C7U.LIZ("CommentPhotoControlUtil@6f34.preloadPhotoControlLocalData$1");
        try {
            int i = C1344860l6K.LIZ;
            String strLIZJ = C1344860l6K.LIZJ((CommentImageModel) aRunnableS26S1100000_21.l1);
            if (strLIZJ != null && (strLIZ = C08HL.LIZ(new C2215208m6(strLIZJ))) != null) {
                C1344860l6K.LIZLLL(aRunnableS26S1100000_21.s0, strLIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPhotoControlUtil@6f34.preloadPhotoControlLocalData$1");
    }

    public static final void run$9(ARunnableS26S1100000_21 aRunnableS26S1100000_21) {
        boolean zLIZ;
        C1C7U.LIZ("DetailBottomFakeInput@ad3e.onQuickEmojiClick$1");
        try {
            C19606111nH c19606111nH = ((DetailBottomFakeInput) aRunnableS26S1100000_21.l1).LLLILZLLLI;
            if (c19606111nH != null) {
                String str = aRunnableS26S1100000_21.s0;
                str.toString();
                c19606111nH.LIZIZ(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailBottomFakeInput@ad3e.onQuickEmojiClick$1");
    }

    public ARunnableS26S1100000_21(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
