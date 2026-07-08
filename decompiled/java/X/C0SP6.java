package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import java.util.List;

/* JADX INFO: renamed from: X.0SP6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SP6 {
    public static final C0SP6 LIZ = new C0SP6();

    public static void LIZ(final String str, final Aweme aweme, final Long l, final String str2, final String str3, final Context context, final C2189821An6 c2189821An6) {
        String authorUid;
        String aid;
        Integer numValueOf;
        Integer numValueOf2;
        boolean zHasTitle;
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList;
        try {
            if (C0P13.LIZ() && C299850Bp9.LIZ()) {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0SP7
                    public final void LIZ() {
                        Aweme aweme2;
                        PhotoModeImageInfo photoModeImageInfo3;
                        PhotoModeImageInfo photoModeImageInfo4;
                        List<PhotoModeImageUrlModel> imageList2;
                        try {
                            C735840Sti c735840Sti = C735840Sti.LIZ;
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", str);
                            Aweme aweme3 = aweme;
                            c2344009Gk.LJIIIIZZ("author_id", aweme3 != null ? AwemeExtKt.getAuthorUid(aweme3) : null);
                            Aweme aweme4 = aweme;
                            c2344009Gk.LJIIIIZZ("group_id", aweme4 != null ? aweme4.getAid() : null);
                            Aweme aweme5 = aweme;
                            c2344009Gk.LJ((aweme5 == null || (photoModeImageInfo4 = aweme5.getPhotoModeImageInfo()) == null || (imageList2 = photoModeImageInfo4.getImageList()) == null) ? null : Integer.valueOf(imageList2.size()), "pic_cnt");
                            Aweme aweme6 = aweme;
                            c2344009Gk.LJ(aweme6 != null ? Integer.valueOf(aweme6.getAwemeType()) : null, "aweme_type");
                            c2344009Gk.LJ(l, "duration");
                            Aweme aweme7 = aweme;
                            c2344009Gk.LJ(Boolean.valueOf((aweme7 == null || (photoModeImageInfo3 = aweme7.getPhotoModeImageInfo()) == null) ? false : photoModeImageInfo3.hasTitle()), "has_title");
                            c2344009Gk.LJIIIIZZ("from_page", str2);
                            C719730SLb.LIZ(aweme, c2344009Gk);
                            Aweme aweme8 = aweme;
                            String str4 = str;
                            String str5 = str3;
                            Context context2 = context;
                            c735840Sti.getClass();
                            C735840Sti.LIZJ(c2344009Gk, aweme8, str4, str5, context2, null);
                            c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
                            if (!C1823107Cb.LIZ() && (aweme2 = aweme) != null) {
                                String requestId = aweme2.getRequestId();
                                if (requestId == null) {
                                    requestId = "";
                                }
                                String strLJIIIZ = C735370Ssx.LJIIIZ(aweme2, requestId);
                                if (strLJIIIZ != null && strLJIIIZ.length() > 0) {
                                }
                            }
                            C2189821An6 c2189821An62 = c2189821An6;
                            if (c2189821An62 != null) {
                                TakoAIVideoMobFiller.INSTANCE.appendFeedParams(c2344009Gk, c2189821An62);
                            }
                            C20684815ws.LJIILLIIL("video_pause_time", c2344009Gk.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PauseDurationMobHelper@b1fb.logPauseDuration$$inlined$postMobEvent$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PauseDurationMobHelper@b1fb.logPauseDuration$$inlined$postMobEvent$1");
                    }
                });
                return;
            }
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme != null && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                numValueOf = Integer.valueOf(imageList.size());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "pic_cnt");
            if (aweme != null) {
                numValueOf2 = Integer.valueOf(aweme.getAwemeType());
            } else {
                numValueOf2 = null;
            }
            c2344009Gk.LJ(numValueOf2, "aweme_type");
            c2344009Gk.LJ(l, "duration");
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null) {
                zHasTitle = photoModeImageInfo.hasTitle();
            } else {
                zHasTitle = false;
            }
            c2344009Gk.LJ(Boolean.valueOf(zHasTitle), "has_title");
            c2344009Gk.LJIIIIZZ("from_page", str2);
            C719730SLb.LIZ(aweme, c2344009Gk);
            c735840Sti.getClass();
            C735840Sti.LIZJ(c2344009Gk, aweme, str, str3, context, null);
            c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
            if (!C1823107Cb.LIZ() && aweme != null) {
                String requestId = aweme.getRequestId();
                if (requestId == null) {
                    requestId = "";
                }
                String strLJIIIZ = C735370Ssx.LJIIIZ(aweme, requestId);
                if (strLJIIIZ != null && strLJIIIZ.length() > 0) {
                }
            }
            if (c2189821An6 != null) {
                TakoAIVideoMobFiller.INSTANCE.appendFeedParams(c2344009Gk, c2189821An6);
            }
            C20684815ws.LJIILLIIL("video_pause_time", c2344009Gk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
