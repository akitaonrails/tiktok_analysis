package Y;

import X.C1360680lVq;
import X.C1370970lmR;
import X.C1389890mGx;
import X.C1C7U;
import X.C2188811AlT;
import X.C2208281Bbm;
import X.EnumC1364450lbv;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS13S1000000_21 implements Runnable {
    public final int $t;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS13S1000000_21 aRunnableS13S1000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("RecentSharedSortManager@1185.shareWithNoCheck$4");
        try {
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZIZ().LJJIIZ(EnumC1364450lbv.SOURCE_ACTION_SHARE.getValue(), null, aRunnableS13S1000000_21.s0, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecentSharedSortManager@1185.shareWithNoCheck$4");
    }

    public static final void run$1(ARunnableS13S1000000_21 aRunnableS13S1000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("DuetWithMovieHelper@adfe.showToast$2");
        try {
            if (ActivityStack.getValidTopActivity() != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getValidTopActivity());
                c1389890mGx.LJIIJ(aRunnableS13S1000000_21.s0);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.showToast$2");
    }

    public static final void run$2(ARunnableS13S1000000_21 aRunnableS13S1000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentInnerPhotoAssem@eb60.onBind$imageDisplayListener$2$1$onComplete$1");
        try {
            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
            String str = aRunnableS13S1000000_21.s0;
            c2208281Bbm.getClass();
            C2208281Bbm.LIZJ(1, -1, str, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentInnerPhotoAssem@eb60.onBind$imageDisplayListener$2$1$onComplete$1");
    }

    public static final void run$3(ARunnableS13S1000000_21 aRunnableS13S1000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentImageComponent@3874.bindCommentPhotoLegacy$2$onComplete$1$1");
        try {
            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
            String str = aRunnableS13S1000000_21.s0;
            c2208281Bbm.getClass();
            C2208281Bbm.LIZJ(1, -1, str, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentImageComponent@3874.bindCommentPhotoLegacy$2$onComplete$1$1");
    }

    public static final void run$4(ARunnableS13S1000000_21 aRunnableS13S1000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentImageComponent@3874.createListPhotoDisplayListener$1$onComplete$1$1");
        try {
            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
            String str = aRunnableS13S1000000_21.s0;
            c2208281Bbm.getClass();
            C2208281Bbm.LIZJ(1, -1, str, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentImageComponent@3874.createListPhotoDisplayListener$1$onComplete$1$1");
    }

    public static final void run$5(ARunnableS13S1000000_21 aRunnableS13S1000000_21) {
        boolean zLIZ;
        C1C7U.LIZ("RepostFeedManager@553f.updatePageToken$1");
        try {
            Keva keva = C1360680lVq.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page_token_");
            C1360680lVq.LIZ.getClass();
            sbLIZ.append(C1360680lVq.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str = aRunnableS13S1000000_21.s0;
            if (str == null) {
                str = "";
            }
            keva.storeString(strLIZIZ, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RepostFeedManager@553f.updatePageToken$1");
    }

    public ARunnableS13S1000000_21(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
