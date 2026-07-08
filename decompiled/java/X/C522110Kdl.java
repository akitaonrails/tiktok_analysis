package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;

/* JADX INFO: renamed from: X.0Kdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522110Kdl {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    public C522110Kdl(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    public final void LIZ(boolean z) {
        FrameLayout frameLayout;
        if (C522640Kec.LIZ()) {
            if (z) {
                this.LIZ.triggerPartialMediaAccessNotice();
                FrameLayout frameLayout2 = this.LIZ.mixedVideContainer;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                    return;
                }
                return;
            }
            if (this.LIZ.hideMixedVideoContainerWhenInit() || (frameLayout = this.LIZ.mixedVideContainer) == null) {
                return;
            }
            C786410Ut5.LJZ(0, frameLayout);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r9, boolean r10) {
        /*
            r8 = this;
            r3 = 0
            if (r9 != 0) goto L6e
            if (r10 == 0) goto L6e
            X.0Kfp r7 = X.C523390Kfp.LIZ
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r0.creativeInfo
            java.lang.String r4 = ""
            if (r0 == 0) goto L15
            java.lang.String r6 = r0.getCreationId()
            if (r6 != 0) goto L16
        L15:
            r6 = r4
        L16:
            X.0LGa r2 = X.C540060LGa.LIZ
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            java.lang.String r1 = r0.shootWay
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.shortVideoContext
            r2.getClass()
            java.lang.String r5 = X.C540060LGa.LJFF(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            int r2 = r0.getChooseScene$tools_camera_record_release()
            X.0Kio r1 = new X.0Kio
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            r1.<init>(r0)
            java.lang.String r1 = X.C540060LGa.LIZLLL(r2, r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            java.lang.String r0 = r0.enterFrom
            if (r0 == 0) goto L3d
            r4 = r0
        L3d:
            r7.getClass()
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            java.lang.String r0 = "creation_id"
            r2.LJ(r0, r6)
            java.lang.String r0 = "shoot_way"
            r2.LJ(r0, r5)
            java.lang.String r0 = "from_page"
            r2.LJ(r0, r1)
            java.lang.String r0 = "enter_from"
            r2.LJ(r0, r4)
            java.lang.String r0 = "status"
            r2.LIZ(r3, r0)
            java.lang.String r1 = X.C540060LGa.LJ()
            java.lang.String r0 = "photo_status"
            r2.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "deny_access_page_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L6e:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r1 = r8.LIZ
            boolean r0 = r1.fromLightRecordTab
            if (r0 == 0) goto La8
            boolean r0 = r1.privateAlbumShowBuiltinAlbum
            r2 = 1
            if (r0 == 0) goto Lb6
            X.0LGY r1 = X.C0LGY.LIZ
            X.0L91 r0 = X.C0L91.IMAGE_AND_VIDEO
            r1.getClass()
            boolean r0 = X.C0LGY.LIZIZ(r0)
            if (r0 != 0) goto Lb6
            r1 = 1
        L87:
            if (r9 == 0) goto Lb4
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            boolean r0 = r0.hasSelectedMedia()
            if (r0 != 0) goto Lb4
            if (r1 != 0) goto Lb4
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            boolean r0 = r0.shouldHideMultiSelectForAiContentEmptyTab()
            if (r0 != 0) goto Lb4
        L9b:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            android.widget.RelativeLayout r0 = r0.selectMultipleLayout
            if (r0 == 0) goto La8
            if (r2 != 0) goto La5
            r3 = 8
        La5:
            X.C786410Ut5.LLIIL(r0, r3)
        La8:
            boolean r0 = X.C295640BiM.LIZ()
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r8.LIZ
            r0.hideMultiSelect()
        Lb3:
            return
        Lb4:
            r2 = 0
            goto L9b
        Lb6:
            r1 = 0
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C522110Kdl.LIZIZ(boolean, boolean):void");
    }
}
