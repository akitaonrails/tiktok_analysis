package X;

import Y.AfS197S0100000_28;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionsPreviewSettingsRequest;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewFragment;

/* JADX INFO: renamed from: X.10AN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10AN implements SubscriptionPreviewService {
    public final C10AO LIZ;
    public final C11NJ LIZIZ = new C11NJ();

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final C10AO LIZIZ() {
        return this.LIZ;
    }

    public C10AN(C10AO c10ao) {
        this.LIZ = c10ao;
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final void LIZ(C10AQ c10aq) {
        long jLongValue;
        long jLongValue2;
        C10AO c10ao = this.LIZ;
        boolean z = c10aq.LIZ;
        Long l = c10aq.LIZIZ;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = c10aq.LIZJ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long l3 = c10aq.LIZLLL;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        this.LIZIZ.LIZ(c10ao.LIZIZ(new SubscriptionsPreviewSettingsRequest(z, jLongValue, jLongValue2, jLongValue3)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS197S0100000_28(c10aq, 87), new C09JN() { // from class: X.10AK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscriptionPreviewServiceImpl@ef18.updatePreviewSettings$2");
                C19210910Dr.LIZ(C10AT.LIZ);
                C1C7U.LIZIZ("SubscriptionPreviewServiceImpl@ef18.updatePreviewSettings$2");
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final Fragment LIZLLL(FragmentManager fragmentManager, C10FW c10fw) {
        PreviewRangeSelectorFragment previewRangeSelectorFragment = new PreviewRangeSelectorFragment();
        previewRangeSelectorFragment.LLJILJILJ = c10fw;
        if (fragmentManager != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = previewRangeSelectorFragment;
            tuxSheet.LLJJIJIIJIL = true;
            c1390920mIc.LJIIIIZZ(4);
            c1390920mIc.LIZ.show(fragmentManager, (String) null);
        }
        return previewRangeSelectorFragment;
    }

    @Override // com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService
    public final Fragment LIZJ(FragmentManager fragmentManager, C19201510Ab c19201510Ab, int i) {
        PhotoPreviewFragment photoPreviewFragment = new PhotoPreviewFragment();
        photoPreviewFragment.LLILLL = c19201510Ab;
        if (fragmentManager != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = photoPreviewFragment;
            tuxSheet.LLJJIJIIJIL = false;
            c1390920mIc.LJIIIIZZ(1);
            int iLIZIZ = C814420VxA.LIZIZ(i * 0.75f);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLIZIZ;
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLJLLL = false;
            tuxSheet2.show(fragmentManager, (String) null);
        }
        return photoPreviewFragment;
    }
}
