package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.CreationOnThisDayPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568160MQc extends AbstractC568390MQz {
    public final C19A3 LLILZIL;
    public int LLILZLL;
    public final C1DRG LLIZ;
    public final int LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final ArrayList<ForwardMedia> LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJIJIL;
    }

    @Override // X.C0MR0
    public final Object LJJIJL(int i) {
        List<PhotoModeImageUrlModel> imageList;
        if (i == this.LLJI.size() && (this.LLILZIL instanceof CreationOnThisDayPreviewScene)) {
            if (this.LLJILJILJ) {
                AbstractC568240MQk abstractC568240MQk = new AbstractC568240MQk() { // from class: X.0MQj
                    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
                    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ekq, viewGroup, false);
                    }
                };
                abstractC568240MQk.LLJJL = this.LLIZ;
                abstractC568240MQk.LLJJJJ = i;
                abstractC568240MQk.LLLLIL(this.LLILZLL);
                return abstractC568240MQk;
            }
            C0MR9 c0mr9 = new C0MR9();
            c0mr9.LLJJL = this.LLIZ;
            c0mr9.LLJJJJ = i;
            c0mr9.LLLLIL(this.LLILZLL);
            return c0mr9;
        }
        ForwardMedia forwardMedia = (ForwardMedia) C13LP.LJJJLZIJ(i, this.LLJI);
        if (forwardMedia != null) {
            MediaModel mediaModel = forwardMedia.localMedia;
            if (mediaModel != null && (this.LLILZIL instanceof CreationOnThisDayPreviewScene)) {
                if (mediaModel.LJIIJ()) {
                    C0MR6 c0mr6 = new C0MR6();
                    LJJIL(c0mr6, forwardMedia, i);
                    return c0mr6;
                }
                C0MRJ c0mrj = new C0MRJ();
                LJJIL(c0mrj, forwardMedia, i);
                return c0mrj;
            }
            if (C565720MGs.LIZ(forwardMedia)) {
                PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    int size = imageList.size();
                    if (size > 1) {
                        C0MRF c0mrf = new C0MRF();
                        LJJIL(c0mrf, forwardMedia, i);
                        return c0mrf;
                    }
                    if (size == 1) {
                        C0MR6 c0mr62 = new C0MR6();
                        LJJIL(c0mr62, forwardMedia, i);
                        return c0mr62;
                    }
                }
                ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
                C0MRJ c0mrj2 = new C0MRJ();
                LJJIL(c0mrj2, forwardMedia, i);
                return c0mrj2;
            }
            C0MRJ c0mrj3 = new C0MRJ();
            LJJIL(c0mrj3, forwardMedia, i);
            return c0mrj3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can't get position item of forwardMediaList, position: ");
        sbLIZ.append(i);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia> r4, boolean r5) {
        /*
            r3 = this;
            java.util.ArrayList<com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia> r0 = r3.LLJI
            r0.clear()
            java.util.ArrayList<com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia> r0 = r3.LLJI
            r0.addAll(r4)
            r2 = 0
            r3.LLJILJIL = r2
            r3.LLJILJILJ = r2
            boolean r0 = X.C0CHK.LIZ()
            r1 = 1
            if (r0 == 0) goto L33
            X.19A3 r0 = r3.LLILZIL
            boolean r0 = r0 instanceof com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.CreationOnThisDayPreviewScene
            if (r0 == 0) goto L33
            if (r5 == 0) goto L52
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L33
            X.0ML5 r0 = X.C0ML5.LIZ
            r0.getClass()
            boolean r0 = X.C0ML5.LIZ()
            if (r0 == 0) goto L4f
            r3.LLJILJILJ = r1
        L33:
            java.util.ArrayList<com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia> r0 = r3.LLJI
            int r1 = r0.size()
            r3.LLJIJIL = r1
            boolean r0 = r3.LLJILJIL
            if (r0 != 0) goto L43
            boolean r0 = r3.LLJILJILJ
            if (r0 == 0) goto L4b
        L43:
            int r0 = r3.LLIZLLLIL
            if (r0 != 0) goto L4b
            int r0 = r1 + 1
            r3.LLJIJIL = r0
        L4b:
            r3.notifyDataSetChanged()
            return
        L4f:
            r3.LLJILJIL = r1
            goto L33
        L52:
            boolean r0 = r3.LLJILLL
            if (r0 != 0) goto L81
            X.0ML5 r0 = X.C0ML5.LIZ
            r0.getClass()
            X.0ML6 r0 = X.C0ML6.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C0ML6.LIZ()
            java.lang.String r0 = "has_allow_scan_album"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L84
            X.0LGY r0 = X.C0LGY.LIZ
            r0.getClass()
            boolean r0 = X.C0LGY.LJFF()
            if (r0 == 0) goto L84
            r1 = 0
        L78:
            boolean r0 = X.C0ML5.LJFF()
            if (r1 == 0) goto L81
            if (r0 != 0) goto L81
            r2 = 1
        L81:
            r3.LLJILJIL = r2
            goto L33
        L84:
            r1 = 1
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568160MQc.LJJIZ(java.util.List, boolean):void");
    }

    public final void LJJIL(C0MRN c0mrn, ForwardMedia forwardMedia, int i) {
        c0mrn.LLJJJ = forwardMedia;
        c0mrn.LLLLIL(this.LLILZLL);
        c0mrn.LLJJJJ = i;
        c0mrn.LLJJL = this.LLIZ;
        c0mrn.LLJJJIL = this.LLIZLLLIL;
        c0mrn.LLJJLIIIJLLLLLLLZ = this.LLJ;
    }

    public C568160MQc(OnThisDayCardPreviewScene onThisDayCardPreviewScene, int i, C1DRG c1drg, int i2, C568170MQd c568170MQd) {
        super(onThisDayCardPreviewScene);
        this.LLILZIL = onThisDayCardPreviewScene;
        this.LLILZLL = i;
        this.LLIZ = c1drg;
        this.LLIZLLLIL = i2;
        this.LLJ = c568170MQd;
        this.LLJI = new ArrayList<>();
    }
}
