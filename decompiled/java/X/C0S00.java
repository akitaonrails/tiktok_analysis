package X;

import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0S00, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S00 {
    public final VideoViewCell LIZ;
    public boolean LIZIZ = true;

    public final void LIZLLL() {
        AwemeRawAd awemeRawAd;
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("commerce_open_app_optimize_setting", true)) {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        Aweme aweme = this.LIZ.getAweme();
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        try {
            c098200Yq = Boolean.valueOf(C1017070cZd.LJJJJLI(this.LIZ.getAweme()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        awemeRawAd.setHasOpenUrlImmutable((Boolean) c098200Yq);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r4 = 0
            if (r0 != 0) goto La
            return r4
        La:
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            boolean r0 = X.C0SQJ.LIZ(r2)
            r3 = 1
            if (r0 == 0) goto L30
            X.0SQJ r0 = X.C0SQJ.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.feed.slide.IMainPageSlide> r0 = com.ss.android.ugc.aweme.feed.slide.IMainPageSlide.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.feed.slide.IMainPageSlide r0 = (com.ss.android.ugc.aweme.feed.slide.IMainPageSlide) r0
            if (r0 == 0) goto L58
            boolean r0 = r0.LIZ(r2)
            if (r0 != r3) goto L58
        L30:
            r0 = 0
        L31:
            java.lang.String r2 = "CommerceAppSlideGuideManager"
            if (r0 != 0) goto L5a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[canVideoWithSlideGuide] aid="
            r1.append(r0)
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = r0.getAid()
            r1.append(r0)
            java.lang.String r0 = ", supportSlideGuide=false"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1022620cia.LIZ(r2, r0)
            return r4
        L58:
            r0 = 1
            goto L31
        L5a:
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            int r1 = r0.LLLIIL()
            r0 = 2
            if (r1 == r0) goto L8e
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            int r1 = r0.LLLIIL()
            r0 = 7
            if (r1 == r0) goto L8e
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            X.0RF0 r0 = r0.LLJILJILJ
            java.lang.String r1 = r0.LJIIIZ
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L8e
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r0 = r5.LIZ
            X.0RF0 r0 = r0.LLJILJILJ
            java.lang.String r1 = r0.LJIIIZ
            java.lang.String r0 = "general_search"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L8e
            java.lang.String r0 = "current Feed is not FYP ad or commerce ad"
            X.C1022620cia.LIZ(r2, r0)
            return r4
        L8e:
            com.ss.android.ugc.aweme.feed.adapter.VideoViewCell r1 = r5.LIZ
            X.0S0o r0 = r1.LLLLILI
            if (r0 != 0) goto L9a
            java.lang.String r0 = "view pager is null"
            X.C1022620cia.LIZ(r2, r0)
            return r4
        L9a:
            android.content.Context r0 = r1.LLLLLLLLLL
            if (r0 != 0) goto La4
            java.lang.String r0 = "activity is null"
            X.C1022620cia.LIZ(r2, r0)
            return r4
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S00.LIZ():boolean");
    }

    public final void LIZIZ() {
        C714400S0o c714400S0o = this.LIZ.LLLLILI;
        if (c714400S0o == null || !(c714400S0o.getAdapter() instanceof C714200Rzu)) {
            return;
        }
        C1022620cia.LIZ("CommerceAppSlideGuideManager", "resetSlideViewPager: clearPagerListener()");
        c714400S0o.LLLLZ.clear();
        C714200Rzu c714200Rzu = (C714200Rzu) c714400S0o.getAdapter();
        int size = ((ArrayList) c714200Rzu.LLJI).size();
        for (int i = 0; i < size; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyAllItem =");
            sbLIZ.append(ListProtector.get(c714200Rzu.LLJI, i));
            C2188811AlT.LIZIZ(sbLIZ);
            c714200Rzu.LJIIZILJ(c714400S0o, i, ListProtector.get(c714200Rzu.LLJI, i));
        }
        ((ArrayList) c714200Rzu.LLJI).clear();
    }

    public final void LIZJ() {
        C1022620cia.LIZ("CommerceAppSlideGuideManager", "initSlideViewPager: ");
        if (this.LIZ.LLLLLLLLLL == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mPlayerView.getid = ");
        FrameLayout frameLayout = this.LIZ.LLLLIL;
        sbLIZ.append(frameLayout != null ? Integer.valueOf(frameLayout.getId()) : null);
        C1022620cia.LIZ("CommerceAppSlideGuideManager", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout frameLayout2 = this.LIZ.LLLLIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        this.LIZ.LLLLIL = new FrameLayout(this.LIZ.LLLLLLLLLL);
        VideoViewCell videoViewCell = this.LIZ;
        videoViewCell.LLJLIL = videoViewCell.LLLLLZ(videoViewCell.LLJILJILJ);
        C714400S0o c714400S0o = this.LIZ.LLLLILI;
        if (c714400S0o != null) {
            int visibility = c714400S0o.getVisibility();
            c714400S0o.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c714400S0o);
        }
        VideoViewCell videoViewCell2 = this.LIZ;
        C714400S0o c714400S0o2 = videoViewCell2.LLLLILI;
        if (c714400S0o2 != null) {
            Aweme aweme = videoViewCell2.getAweme();
            VideoViewCell videoViewCell3 = this.LIZ;
            c714400S0o2.LLLLZI = aweme;
            c714400S0o2.LLLLZLLLI = videoViewCell3;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C714230Rzx(0));
        arrayList.add(new C714230Rzx(1));
        C19EG activity = this.LIZ.getActivity();
        VideoViewCell videoViewCell4 = this.LIZ;
        C714200Rzu c714200Rzu = new C714200Rzu(activity, videoViewCell4.LLZZZZ, arrayList, videoViewCell4.getAweme());
        c714200Rzu.LLJ.put(0, this.LIZ.LLLLIL);
        if (C07D6.LIZ() > 0.0f) {
            this.LIZ.LLLLILI.setOptPageChangeOffset(1.0f - C07D6.LIZ());
        }
        C714400S0o c714400S0o3 = this.LIZ.LLLLILI;
        if (c714400S0o3 != null) {
            c714400S0o3.LIZLLL(new C738950Syj(this, 6));
        }
        C714400S0o c714400S0o4 = this.LIZ.LLLLILI;
        if (c714400S0o4 != null) {
            c714400S0o4.setAdapter(c714200Rzu);
        }
    }

    public C0S00(VideoViewCell videoViewCell) {
        this.LIZ = videoViewCell;
    }
}
