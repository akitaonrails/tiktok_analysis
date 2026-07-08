package Y;

import X.AbstractC848400XPy;
import X.C097U;
import X.C0CHQ;
import X.C0I7D;
import X.C0M88;
import X.C0VSJ;
import X.C0XQ7;
import X.C1255650imR;
import X.C1322110kVd;
import X.C1445410niV;
import X.C1C7U;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C443530HaJ;
import X.C524980KiO;
import X.C558570LvT;
import X.C568750MSj;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS13S1200000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        int length;
        C0VSJ c0vsj;
        try {
            c0vsj = new C0VSJ(this.s0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
        if (!c0vsj.exists() || c0vsj.length() <= 4194304) {
            length = 4194304;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload file size: ");
            sbLIZ.append(c0vsj.length());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            length = (((int) (c0vsj.length() / ((long) 1024))) + 1) * 1024;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(Api.LIZIZ);
        sbLIZ2.append("?uid=");
        sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJZ(((C1255650imR) this.l1).LIZJ, strLIZIZ, length, this.s0, (List) this.l2);
    }

    public final void LIZ$2() {
        int width = ((C1322110kVd) this.l1).getWidth();
        float f = width;
        if (((C1445410niV) this.l2).LLJLLL == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        float fVideoWidth = r0.videoWidth() * 1.0f;
        if (((C1445410niV) this.l2).LLJLLL == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Bitmap bitmapLIZIZ = C097U.LIZIZ(width, (int) (f / (fVideoWidth / r0.videoHeight())), this.s0);
        if (bitmapLIZIZ != null) {
            ((C1322110kVd) this.l1).setImageDrawable(new C443530HaJ(((C1445410niV) this.l2).requireActivity().getResources(), bitmapLIZIZ));
        }
    }

    public final void LIZ$0() {
        if (C0CHQ.LIZ().LJI().LJIILJJIL().LIZ(new C558570LvT(((CreativeModel) this.l1).creativeInfo, false, false, false, 14))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't use same creationId as the draft, ");
            sbLIZ.append(((CreativeModel) this.l1).creativeInfo.getCreationId());
            sbLIZ.append(", \nisDraft: ");
            sbLIZ.append(((CreativeModel) this.l1).draftInfoModel.isDraft);
            sbLIZ.append(", mIsFromDraft: ");
            VideoPublishEditModel videoPublishEditModel = ((C0M88) this.l2).LIZJ;
            sbLIZ.append(videoPublishEditModel != null ? Boolean.valueOf(videoPublishEditModel.mIsFromDraft) : null);
            sbLIZ.append(", saveDraftScene: ");
            sbLIZ.append(((CreativeModel) this.l1).draftInfoModel.saveDraftScene);
            sbLIZ.append(", supportReEditeImage: ");
            sbLIZ.append(C568750MSj.LIZ((CreativeModel) this.l1));
            sbLIZ.append(", \nstackTrace:");
            sbLIZ.append(this.s0);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            RuntimeException runtimeException = new RuntimeException(strLIZIZ);
            C0CHQ.LIZ().isDebugConfigOpen();
            Npth.reportBizException("SameCreationIdDraftMonitor", runtimeException, strLIZIZ, C2097908Jt.LIZJ(new Pair("shoot_way", ((C0M88) this.l2).LIZIZ)));
        }
    }

    public static final void run$0(ARunnableS13S1200000_8 aRunnableS13S1200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AutoPickAlbumComponent@59d1.restoreAddMediaSelections$1");
        try {
            C524980KiO c524980KiO = (C524980KiO) aRunnableS13S1200000_8.l1;
            List<? extends TikTokMediaModel> list = (List) aRunnableS13S1200000_8.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aRunnableS13S1200000_8.s0);
            sbLIZ.append("_post_restore");
            c524980KiO.k5(list, C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoPickAlbumComponent@59d1.restoreAddMediaSelections$1");
    }

    public static final void run$1(ARunnableS13S1200000_8 aRunnableS13S1200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("SameCreationIdDraftMonitor@e2c5.checkIsSameCreationIdDraftExist$1");
        try {
            aRunnableS13S1200000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SameCreationIdDraftMonitor@e2c5.checkIsSameCreationIdDraftExist$1");
    }

    public static final void run$2(ARunnableS13S1200000_8 aRunnableS13S1200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("HeadUploadHelper@8ad6.doUpload$1");
        try {
            aRunnableS13S1200000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HeadUploadHelper@8ad6.doUpload$1");
    }

    public static final void run$3(ARunnableS13S1200000_8 aRunnableS13S1200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AddressAssociateFragment@4c2b.setEditViewTextAndFocus$1$1");
        try {
            ((C0I7D) aRunnableS13S1200000_8.l1).setText(aRunnableS13S1200000_8.s0);
            ((C0I7D) aRunnableS13S1200000_8.l1).requestFocus();
            ((C0I7D) aRunnableS13S1200000_8.l1).setSelection(aRunnableS13S1200000_8.s0.length());
            Context context = ((AddressAssociateFragment) aRunnableS13S1200000_8.l2).getContext();
            if (context != null) {
                KeyboardUtils.LIZIZ(context, (C0I7D) aRunnableS13S1200000_8.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddressAssociateFragment@4c2b.setEditViewTextAndFocus$1$1");
    }

    public static final void run$4(ARunnableS13S1200000_8 aRunnableS13S1200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("EditPostPublishScene@f667.setThumbImageWithUri$2");
        try {
            aRunnableS13S1200000_8.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditPostPublishScene@f667.setThumbImageWithUri$2");
    }

    public ARunnableS13S1200000_8(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
