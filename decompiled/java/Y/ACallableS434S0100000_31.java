package Y;

import X.C09S2;
import X.C0CQT;
import X.C11K9;
import X.C11NZ;
import X.C15NH;
import X.C15OF;
import X.C15OG;
import X.C15OK;
import X.C16EG;
import X.C16EH;
import X.C1C7U;
import X.C20504015La;
import X.C20556015c6;
import X.C20591215hm;
import X.C2201941BFw;
import X.C298690BnH;
import X.C737600SwY;
import X.C786410Ut5;
import X.EnumC895770ZCd;
import X.InterfaceC20498115It;
import X.InterfaceC20510315Nl;
import X.InterfaceC2661011f;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.base.ui.AudioControlView$AudioControlHandler;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tag.api.MentionCheckResult;
import com.ss.android.ugc.aweme.tag.api.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.tag.api.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class ACallableS434S0100000_31 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        C1C7U.LIZ("TabletActivityLifecycle@1be1.onPageCreated$1");
        C20591215hm c20591215hm = C20591215hm.LIZ;
        int i = ((Activity) aCallableS434S0100000_31.l0).getResources().getConfiguration().orientation;
        Activity activity = (Activity) aCallableS434S0100000_31.l0;
        c20591215hm.getClass();
        C20591215hm.LJ(i, activity, "on_create");
        C20591215hm.LIZLLL((Activity) aCallableS434S0100000_31.l0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabletActivityLifecycle@1be1.onPageCreated$1");
        return unit;
    }

    public static final Object call$1(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryForExploreAwemeList$1$1");
        C11K9 c11k9LJJJJZ = C11NZ.LJJJJZ((ExploreAwemeList) aCallableS434S0100000_31.l0);
        C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryForExploreAwemeList$1$1");
        return c11k9LJJJJZ;
    }

    public static final Object call$10(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        InterfaceC20498115It interfaceC20498115It = (InterfaceC20498115It) aCallableS434S0100000_31.l0;
        C1C7U.LIZ("MusicService@3f29.downloadMusic$1L");
        interfaceC20498115It.onFailed(new Exception());
        C1C7U.LIZIZ("MusicService@3f29.downloadMusic$1L");
        return null;
    }

    public static final Object call$11(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        String uid;
        Object objCreate;
        long jLongValue;
        String uid2;
        C1C7U.LIZ("VideoTagFriendsListViewModel@4d0b.loadAllFriends$1");
        List<IMUser> listLJIILL = ((IIMService) ((VideoTagFriendsListViewModel) aCallableS434S0100000_31.l0).LLIZLLLIL.getValue()).getImUserService().LJIILL();
        VideoTagFriendsListViewModel videoTagFriendsListViewModel = (VideoTagFriendsListViewModel) aCallableS434S0100000_31.l0;
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : listLJIILL) {
            String uid3 = iMUser.getUid();
            IMUser iMUser2 = videoTagFriendsListViewModel.LLILZIL;
            if (iMUser2 != null) {
                uid2 = iMUser2.getUid();
            } else {
                uid2 = null;
            }
            if (!Intrinsics.LJFF(uid3, uid2)) {
                arrayList.add(iMUser);
            }
        }
        ArrayList<IMUser> arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        try {
            InterfaceC20510315Nl.LIZ.getClass();
            InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0CQT.LIZJ);
            if (interfaceC2661011fLIZ != null) {
                objCreate = interfaceC2661011fLIZ.create(InterfaceC20510315Nl.class);
            } else {
                objCreate = null;
            }
            MentionRecentContactResponse mentionRecentContactResponse = ((InterfaceC20510315Nl) objCreate).LJIIJ(EnumC895770ZCd.VIDEO_TAG.getType(), 0L, false).execute().LIZIZ;
            HashMap map = new HashMap();
            ArrayList<MentionCheckResult> arrayList4 = mentionRecentContactResponse.blockResults;
            if (arrayList4 != null) {
                for (MentionCheckResult mentionCheckResult : arrayList4) {
                    ArrayList<MentionCheckSingleTypeResult> arrayList5 = mentionCheckResult.tagUpdateStatus;
                    if (arrayList5 != null) {
                        Iterator<MentionCheckSingleTypeResult> it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().mentionType == EnumC895770ZCd.VIDEO_TAG.getType()) {
                                map.put(String.valueOf(mentionCheckResult.uid), Long.valueOf(r10.blockType));
                            }
                        }
                    }
                }
            }
            ArrayList<User> arrayList6 = mentionRecentContactResponse.userList;
            if (arrayList6 != null) {
                for (User user : arrayList6) {
                    if (arrayList3.size() < 10) {
                        IMUser.Companion.getClass();
                        IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
                        if (iMUserLIZJ != null) {
                            Long l = (Long) map.get(iMUserLIZJ.getUid());
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            iMUserLIZJ.setVideoTagBlockStatus(jLongValue);
                            arrayList3.add(iMUserLIZJ);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (arrayList3.size() < 10) {
            List<IMUser> listLJIIL = ((IIMService) ((VideoTagFriendsListViewModel) aCallableS434S0100000_31.l0).LLIZLLLIL.getValue()).getImUserService().LJIIL();
            VideoTagFriendsListViewModel videoTagFriendsListViewModel2 = (VideoTagFriendsListViewModel) aCallableS434S0100000_31.l0;
            for (IMUser iMUser3 : listLJIIL) {
                if (arrayList3.size() < 10 && !arrayList3.contains(iMUser3)) {
                    String uid4 = iMUser3.getUid();
                    IMUser iMUser4 = videoTagFriendsListViewModel2.LLILZIL;
                    if (iMUser4 != null) {
                        uid = iMUser4.getUid();
                    } else {
                        uid = null;
                    }
                    if (!Intrinsics.LJFF(uid4, uid)) {
                        arrayList3.add(iMUser3);
                    }
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (IMUser iMUser5 : arrayList2) {
            if (!arrayList3.contains(iMUser5)) {
                if (iMUser5.getFollowStatus() == 2) {
                    arrayList7.add(iMUser5);
                } else {
                    arrayList8.add(iMUser5);
                }
            }
        }
        if (C298690BnH.LIZJ()) {
            List<? extends IMUser> list = C737600SwY.LIZ;
            for (IMUser iMUser6 : list) {
                if (arrayList3.contains(iMUser6)) {
                    arrayList3.remove(iMUser6);
                } else if (arrayList7.contains(iMUser6)) {
                    arrayList7.remove(iMUser6);
                } else if (arrayList8.contains(iMUser6)) {
                    arrayList8.remove(iMUser6);
                }
            }
            arrayList3.addAll(0, list);
        }
        ArrayList arrayList9 = new ArrayList();
        arrayList9.addAll(arrayList3);
        arrayList9.addAll(arrayList7);
        arrayList9.addAll(arrayList8);
        VideoTagFriendsListViewModel videoTagFriendsListViewModel3 = (VideoTagFriendsListViewModel) aCallableS434S0100000_31.l0;
        C15NH c15nh = new C15NH(arrayList3, arrayList7, arrayList8, arrayList9);
        videoTagFriendsListViewModel3.LLJJ = c15nh;
        C1C7U.LIZIZ("VideoTagFriendsListViewModel@4d0b.loadAllFriends$1");
        return c15nh;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$12(Y.ACallableS434S0100000_31 r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS434S0100000_31.call$12(Y.ACallableS434S0100000_31):java.lang.Object");
    }

    public static final Object call$2(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        AudioControlView$AudioControlHandler audioControlView$AudioControlHandler = (AudioControlView$AudioControlHandler) aCallableS434S0100000_31.l0;
        audioControlView$AudioControlHandler.getClass();
        C1C7U.LIZ("AudioControlView$AudioControlHandler@858e.updateView$1L");
        C16EG c16eg = audioControlView$AudioControlHandler.LL.get();
        if (c16eg != null) {
            c16eg.setProgress(audioControlView$AudioControlHandler.LLILZIL / audioControlView$AudioControlHandler.LLILLL);
            if (!c16eg.LLJIJIL) {
                c16eg.invalidate();
                ValueAnimator valueAnimator = c16eg.LLIZ;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    c16eg.LLIZ.cancel();
                    c16eg.LLIZ = null;
                }
                C16EH c16eh = c16eg.LLILZLL;
                if (c16eh != null) {
                    c16eh.onCancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                c16eg.LLIZ = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(1400L);
                c16eg.LLIZ.addListener(new ALAdapterS25S0100000_31(c16eg, 13));
                c16eg.LLIZ.start();
            }
        }
        C1C7U.LIZIZ("AudioControlView$AudioControlHandler@858e.updateView$1L");
        return null;
    }

    public static final Object call$3(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.handleFailedInMain$1");
        C15OF c15of = (C15OF) aCallableS434S0100000_31.l0;
        if (c15of.LIZ != null) {
            c15of.LIZ();
            c15of.LJII(2131832379, C15OK.DOWNLOAD_FAILED);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.handleFailedInMain$1");
        return unit;
    }

    public static final Object call$4(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        Aweme aweme = (Aweme) aCallableS434S0100000_31.l0;
        C1C7U.LIZ("DuetWithMovieHelper@adfe.goDuetWithMovie$1L");
        CheckDuetReactPermissionResponse checkDuetReactPermissionResponseCheckDuetReactPermission = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().privacyConfig().checkDuetReactPermission(aweme.getAid(), 1);
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.goDuetWithMovie$1L");
        return checkDuetReactPermissionResponseCheckDuetReactPermission;
    }

    public static final Object call$5(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        C15OG c15og = (C15OG) aCallableS434S0100000_31.l0;
        c15og.getClass();
        C1C7U.LIZ("DuetWithMovieHelper@adfe.privacyGrantAndNext$1L");
        Aweme awemeLJIIJ = c15og.LJJIIZI.LJIIJ(c15og.LJIILL.getAid(), "");
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.privacyGrantAndNext$1L");
        return awemeLJIIJ;
    }

    public static final Object call$6(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.goStitchWithMovie$3");
        CheckDuetReactPermissionResponse checkDuetReactPermissionResponseCheckDuetReactPermission = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().privacyConfig().checkDuetReactPermission(((Aweme) aCallableS434S0100000_31.l0).getAid(), 2);
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.goStitchWithMovie$3");
        return checkDuetReactPermissionResponseCheckDuetReactPermission;
    }

    public static final Object call$7(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.privacyGrantAndNext$1");
        C15OF c15of = (C15OF) aCallableS434S0100000_31.l0;
        DetailFeedService detailFeedService = c15of.LJIIJ;
        Aweme aweme = c15of.LIZLLL;
        if (aweme == null) {
            aweme = null;
        }
        Aweme awemeLJIIJ = detailFeedService.LJIIJ(aweme.getAid(), "");
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.privacyGrantAndNext$1");
        return awemeLJIIJ;
    }

    public static final Object call$8(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        BaseDiscoverMusicFragment baseDiscoverMusicFragment = (BaseDiscoverMusicFragment) aCallableS434S0100000_31.l0;
        baseDiscoverMusicFragment.getClass();
        C1C7U.LIZ("BaseDiscoverMusicFragment@1ccc.lambda$onActivityCreated$2$1L");
        baseDiscoverMusicFragment.LJJIFFI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseDiscoverMusicFragment@1ccc.lambda$onActivityCreated$2$1L");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.15La, android.view.View] */
    public static final Object call$9(ACallableS434S0100000_31 aCallableS434S0100000_31) {
        FrameLayout frameLayout;
        C1C7U.LIZ("CellAdaptionComponent@341f.showStickerArea$1");
        C20556015c6.LIZ.getClass();
        if (C20556015c6.LIZLLL && (frameLayout = ((CellAdaptionComponent) aCallableS434S0100000_31.l0).LLLIIIL) != 0) {
            final Context context = ((CellAdaptionComponent) aCallableS434S0100000_31.l0).getContext();
            final List<? extends OcrLocation> list = ((CellAdaptionComponent) aCallableS434S0100000_31.l0).LLJLL;
            ?? r2 = new View(context, list) { // from class: X.15La
                public final List<? extends OcrLocation> LL;

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    Paint paint = new Paint();
                    paint.setColor(-65281);
                    paint.setAlpha(128);
                    List<? extends OcrLocation> list2 = this.LL;
                    if (list2 == null) {
                        return;
                    }
                    for (OcrLocation ocrLocation : list2) {
                        canvas.drawRect(new Rect((int) (ocrLocation.xMin * ((double) getWidth())), (int) (ocrLocation.yMin * ((double) getHeight())), (int) (ocrLocation.xMax * ((double) getWidth())), (int) (ocrLocation.yMax * ((double) getHeight()))), paint);
                    }
                }

                {
                    this.LL = list;
                }
            };
            C20504015La c20504015La = ((CellAdaptionComponent) aCallableS434S0100000_31.l0).LLLJL;
            if (c20504015La != null) {
                C786410Ut5.LJJJZ(c20504015La, frameLayout);
            }
            frameLayout.addView((View) r2, -1);
            ((CellAdaptionComponent) aCallableS434S0100000_31.l0).LLLJL = r2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CellAdaptionComponent@341f.showStickerArea$1");
        return unit;
    }

    public ACallableS434S0100000_31(Aweme aweme, int i) {
        this.$t = i;
        if (4 - i != 0) {
            this.l0 = aweme;
        } else {
            this.l0 = aweme;
        }
    }

    public ACallableS434S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
