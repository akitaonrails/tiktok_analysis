package Y;

import X.AnonymousClass1916;
import X.C09NT;
import X.C0VSJ;
import X.C0VSP;
import X.C118300cf;
import X.C120J;
import X.C1322110kVd;
import X.C1324840ka2;
import X.C1390380mHk;
import X.C1399150mVt;
import X.C1440005kM;
import X.C194405113z;
import X.C19460011Bm;
import X.C19460211Bo;
import X.C19460311Bp;
import X.C19460911Bv;
import X.C19461111Bx;
import X.C19510411Uw;
import X.C19578211im;
import X.C19585611jy;
import X.C19632311rV;
import X.C19633011rc;
import X.C19647111tt;
import X.C1C7U;
import X.C2400409as;
import X.C337100DJk;
import X.C341940Daq;
import X.C786410Ut5;
import X.EnumC1399740mWq;
import X.InterfaceC1320380kSq;
import X.InterfaceC1399770mWt;
import X.InterfaceC1645910svt;
import X.InterfaceC19510211Uu;
import X.ProgressDialogC1399760mWs;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.poll.PollDetailFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS62S0300000_29 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C19647111tt c19647111tt = (C19647111tt) this.l0;
        if (c19647111tt.LLIZLLLIL) {
            C19647111tt.LJJJI((C1322110kVd) this.l1, ((ImageSynthesisResult) this.l2).getImageRatio() > c19647111tt.LLJ ? InterfaceC1320380kSq.LIZJ : InterfaceC1320380kSq.LJI);
        }
        ((C19647111tt) this.l0).LJJIJLIJ((C1322110kVd) this.l1, Uri.fromFile(new C0VSJ(((ImageSynthesisResult) this.l2).getPath())));
    }

    public final void LIZ$1() {
        if (!((TTSVoiceRecordService) this.l0).LIZJ || ((Activity) this.l1).isFinishing()) {
            return;
        }
        final TTSVoiceRecordService tTSVoiceRecordService = (TTSVoiceRecordService) this.l0;
        Activity activity = (Activity) this.l1;
        EnumC1399740mWq enumC1399740mWq = EnumC1399740mWq.VISIBLE;
        final MusicModel musicModel = (MusicModel) this.l2;
        tTSVoiceRecordService.LIZ = C1399150mVt.LIZIZ(activity, enumC1399740mWq, new InterfaceC1399770mWt() { // from class: X.120O
            @Override // X.InterfaceC1399770mWt
            public final void LIZ() {
                C15L9 c15l9 = tTSVoiceRecordService.LIZLLL;
                if (c15l9 != null) {
                    MusicModel musicModel2 = musicModel;
                    c15l9.LIZ(musicModel2 != null ? musicModel2.getMusicId() : null);
                }
            }
        });
        ProgressDialogC1399760mWs progressDialogC1399760mWs = ((TTSVoiceRecordService) this.l0).LIZ;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.setMessage(((Activity) this.l1).getString(R.string.txr));
        }
    }

    public final void LIZ$2() {
        if (!((VoiceConversionRecordService) this.l0).LIZJ || ((Activity) this.l1).isFinishing()) {
            return;
        }
        final VoiceConversionRecordService voiceConversionRecordService = (VoiceConversionRecordService) this.l0;
        Activity activity = (Activity) this.l1;
        EnumC1399740mWq enumC1399740mWq = EnumC1399740mWq.VISIBLE;
        final MusicModel musicModel = (MusicModel) this.l2;
        voiceConversionRecordService.LIZ = C1399150mVt.LIZIZ(activity, enumC1399740mWq, new InterfaceC1399770mWt() { // from class: X.120S
            @Override // X.InterfaceC1399770mWt
            public final void LIZ() {
                C15L9 c15l9 = voiceConversionRecordService.LIZLLL;
                if (c15l9 != null) {
                    MusicModel musicModel2 = musicModel;
                    c15l9.LIZ(musicModel2 != null ? musicModel2.getMusicId() : null);
                }
            }
        });
        ProgressDialogC1399760mWs progressDialogC1399760mWs = ((VoiceConversionRecordService) this.l0).LIZ;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.setMessage(((Activity) this.l1).getString(R.string.txr));
        }
    }

    public final void LIZ$3() {
        if (!((View) this.l0).isAttachedToWindow()) {
            C19585611jy c19585611jy = (C19585611jy) this.l1;
            View view = (View) this.l0;
            C118300cf c118300cf = (C118300cf) this.l2;
            c118300cf.element++;
            c19585611jy.o4(view, this, c118300cf.element);
            return;
        }
        if (((C19585611jy) this.l1).F4((View) this.l0)) {
            ((C19585611jy) this.l1).Z1();
            return;
        }
        C19585611jy c19585611jy2 = (C19585611jy) this.l1;
        View view2 = (View) this.l0;
        C118300cf c118300cf2 = (C118300cf) this.l2;
        c118300cf2.element++;
        c19585611jy2.o4(view2, this, c118300cf2.element);
    }

    public final void LIZ$4() {
        ((ViewPropertyAnimator) this.l0).setListener(null);
        ((ArrayList) ((C194405113z) this.l1).LLJL).remove((RecyclerView.ViewHolder) this.l2);
        C786410Ut5.T4(((RecyclerView.ViewHolder) this.l2).itemView, 1.0f);
        ((C194405113z) this.l1).LJIIIZ((RecyclerView.ViewHolder) this.l2);
        C194405113z.LJJIJIL((C194405113z) this.l1);
    }

    public final void LIZ$5() {
        ((ViewPropertyAnimator) this.l0).setListener(null);
        ((ArrayList) ((C194405113z) this.l1).LLJL).remove((RecyclerView.ViewHolder) this.l2);
        C786410Ut5.Jc(((RecyclerView.ViewHolder) this.l2).itemView, 0.0f);
        C786410Ut5.T4(((RecyclerView.ViewHolder) this.l2).itemView, 1.0f);
        ((C194405113z) this.l1).LJIIIZ((RecyclerView.ViewHolder) this.l2);
        C194405113z.LJJIJIL((C194405113z) this.l1);
    }

    public final void LIZ$6() {
        C19461111Bx c19461111Bx = (C19461111Bx) this.l0;
        Activity activity = (Activity) this.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
        if (c19461111Bx.LIZ) {
            c19461111Bx.LIZJ();
            return;
        }
        String outputFile = videoPublishEditModel.getOutputFile();
        long length = new C0VSJ(outputFile).length();
        boolean z = false;
        try {
            try {
                Uri uriLIZLLL = C2400409as.LIZLLL(activity, new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()));
                if (uriLIZLLL != null) {
                    c19461111Bx.LIZ(activity, videoPublishEditModel, new C0VSP(outputFile), C09NT.LJI(activity.getContentResolver(), uriLIZLLL), length);
                    z = true;
                    if (c19461111Bx.LIZ) {
                        activity.getContentResolver().delete(uriLIZLLL, null, null);
                    }
                } else if (!c19461111Bx.LIZ) {
                    c19461111Bx.LIZIZ(videoPublishEditModel);
                }
                c19461111Bx.LIZJ = null;
                if (z && !c19461111Bx.LIZ) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!c19461111Bx.LIZ) {
                    c19461111Bx.LIZIZ(videoPublishEditModel);
                }
                c19461111Bx.LIZJ = null;
                if (0 != 0 && !c19461111Bx.LIZ) {
                    return;
                }
            }
            c19461111Bx.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c19461111Bx.LIZJ = null;
            if (0 == 0 || c19461111Bx.LIZ) {
                c19461111Bx.LIZJ();
            }
            throw th;
        }
    }

    public final void LIZ$7() {
        if (C19460911Bv.LJ(((VideoPublishEditModel) this.l0).getCreationId())) {
            if (C19461111Bx.LJFF) {
                Activity activity = (Activity) this.l1;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.acrossActivities(true);
                creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
                creativeToastBuilder.iconColorRes(R.attr.a0i);
                creativeToastBuilder.messageRes(2131836349);
                C1390380mHk.LIZ(activity, 5003, creativeToastBuilder);
            } else {
                C19460011Bm c19460011Bm = (C19460011Bm) this.l2;
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l0;
                C19460311Bp.LIZIZ = 4;
                C19460311Bp.LIZJ = 0;
                C19460311Bp.LIZLLL = videoPublishEditModel;
                c19460011Bm.getClass();
                C1440005kM.LIZ(new C19460211Bo());
            }
            C19460911Bv.LIZJ(((VideoPublishEditModel) this.l0).getCreationId());
        }
    }

    public final void LIZ$8() {
        String first;
        if (((ViewGroup) this.l0).indexOfChild(((C19510411Uw) this.l1).LIZIZ) == -1 || (!((C19510411Uw) this.l1).LIZIZ.isAttachedToWindow())) {
            return;
        }
        InterfaceC1645910svt interfaceC1645910svt = ((C19510411Uw) this.l1).LJIIIZ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJI();
        }
        C786410Ut5.LJLLLLLL(0, ((C19510411Uw) this.l1).LIZJ);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) this.l2;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJI();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(((C19510411Uw) this.l1).LIZLLL);
        Pair<String, String> pair = ((C19510411Uw) this.l1).LJIIIIZZ;
        if (pair == null || (first = pair.getFirst()) == null) {
            first = "";
        }
        C337100DJk.LIZ(duration, first, ((C19510411Uw) this.l1).LJIIJ);
        C19510411Uw c19510411Uw = (C19510411Uw) this.l1;
        c19510411Uw.LJIIJ = false;
        Interpolator interpolator = c19510411Uw.LJFF;
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.addUpdateListener(new AUListenerS61S0201000_29(((C19510411Uw) this.l1).LIZJ.getMeasuredHeight(), (C19510411Uw) this.l1, (InterfaceC19510211Uu) this.l2, 9));
        duration.addListener(new ALAdapterS23S0200000_29((C19510411Uw) this.l1, (InterfaceC19510211Uu) this.l2, 20));
        duration.start();
    }

    public static final void run$0(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ImagePublishPreviewPageAdapter@57b9.updateSynthesisResult$1$1");
        try {
            aRunnableS62S0300000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImagePublishPreviewPageAdapter@57b9.updateSynthesisResult$1$1");
    }

    public static final void run$1(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TTSVoiceRecordService@cfdb.startRecord$1$showLoading$1");
        try {
            aRunnableS62S0300000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTSVoiceRecordService@cfdb.startRecord$1$showLoading$1");
    }

    public static final void run$10(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("DraftDownloadListener@fac2.onSuccess$runnable$1");
        try {
            aRunnableS62S0300000_29.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftDownloadListener@fac2.onSuccess$runnable$1");
    }

    public static final void run$11(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("DonationStickerView@8eb3.scheduleHuggedTitleWidths$1");
        try {
            if (((TextView) aRunnableS62S0300000_29.l0).getParent() != null) {
                ((Function0) aRunnableS62S0300000_29.l1).invoke();
                C19578211im c19578211im = (C19578211im) aRunnableS62S0300000_29.l2;
                HandlerHook.viewPost(c19578211im, new ARunnableS98S0200000_29(c19578211im, (Function0) aRunnableS62S0300000_29.l1, 69));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DonationStickerView@8eb3.scheduleHuggedTitleWidths$1");
    }

    public static final void run$12(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = (BaseNewMusicTabFragment) aRunnableS62S0300000_29.l0;
        View view = (View) aRunnableS62S0300000_29.l1;
        MusicModel musicModel = (MusicModel) aRunnableS62S0300000_29.l2;
        String str = BaseNewMusicTabFragment.LLLILZLLLI;
        baseNewMusicTabFragment.getClass();
        C1C7U.LIZ("BaseNewMusicTabFragment@f68f.showAddedToFavoritePopup$1L");
        if (baseNewMusicTabFragment.getActivity() != null && !baseNewMusicTabFragment.getActivity().isFinishing() && baseNewMusicTabFragment.PR() != null) {
            C120J c120jPR = baseNewMusicTabFragment.PR();
            c120jPR.getClass();
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                C1324840ka2.LJIIJ(c120jPR.LLILLJJLI, musicModel.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                C1324840ka2.LJIIJ(c120jPR.LLILLJJLI, musicModel.getPicBig(), -1, -1);
            }
            float fLIZ = C341940Daq.LIZ(47.0d) + c120jPR.LLILLL.getPaint().measureText(c120jPR.LLILZ.getContext().getString(R.string.cpj));
            c120jPR.setWidth(view.getWidth() + C341940Daq.LIZ(24.0d));
            if (c120jPR.getWidth() < fLIZ) {
                c120jPR.setWidth((int) fLIZ);
            }
            if (!c120jPR.isShowing()) {
                c120jPR.showAsDropDown(view, (view.getWidth() - c120jPR.getWidth()) / 2, -((view.getHeight() + c120jPR.LLILZ.getMeasuredHeight()) - C341940Daq.LIZ(16.0d)));
            }
            HandlerHook.viewRemoveCallbacks(c120jPR.LLILZ, c120jPR.LL);
            HandlerHook.viewPostDelay(c120jPR.LLILZ, c120jPR.LL, 2000L);
            baseNewMusicTabFragment.LLLILZJ.LJI("added_to_favorites_show_once", true);
        }
        C1C7U.LIZIZ("BaseNewMusicTabFragment@f68f.showAddedToFavoritePopup$1L");
    }

    public static final void run$13(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultViewTransition@cb29.startTransition$1");
        try {
            aRunnableS62S0300000_29.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultViewTransition@cb29.startTransition$1");
    }

    public static final void run$14(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("SharedElementSceneTransitionExecutor2@77b9.executePopChangeV21$2");
        try {
            C786410Ut5.LJLLLLLL(8, (View) aRunnableS62S0300000_29.l0);
            AnonymousClass1916 anonymousClass1916 = (AnonymousClass1916) aRunnableS62S0300000_29.l2;
            if (!anonymousClass1916.LIZLLL) {
                anonymousClass1916.LIZ.getOverlay().remove((View) aRunnableS62S0300000_29.l0);
            }
            ((Runnable) aRunnableS62S0300000_29.l1).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedElementSceneTransitionExecutor2@77b9.executePopChangeV21$2");
    }

    public static final void run$2(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("VoiceConversionRecordService@2919.startRecord$1$showLoading$1");
        try {
            aRunnableS62S0300000_29.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VoiceConversionRecordService@2919.startRecord$1$showLoading$1");
    }

    public static final void run$3(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditDonationStickerComponent@beb5.scheduleDonationTapMoreOptionsHint$retryRunnable$1");
        try {
            aRunnableS62S0300000_29.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditDonationStickerComponent@beb5.scheduleDonationTapMoreOptionsHint$retryRunnable$1");
    }

    public static final void run$4(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("PollDetailFragment@7a49.tryLoadFromSaveData$1");
        try {
            PollDetailFragment pollDetailFragment = (PollDetailFragment) aRunnableS62S0300000_29.l0;
            C19632311rV c19632311rV = pollDetailFragment.LLIZ;
            if (c19632311rV != null) {
                c19632311rV.LJFF = (C19633011rc) aRunnableS62S0300000_29.l1;
            }
            pollDetailFragment.LLJJJIL((List) aRunnableS62S0300000_29.l2, ((C19633011rc) aRunnableS62S0300000_29.l1).LIZIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PollDetailFragment@7a49.tryLoadFromSaveData$1");
    }

    public static final void run$5(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TypingAvatarAnimator@1b43.runPendingAnimations$1$1$2");
        try {
            ((ViewPropertyAnimator) aRunnableS62S0300000_29.l0).setListener(null);
            ((ArrayList) ((C194405113z) aRunnableS62S0300000_29.l1).LLJJJJLIIL).remove((RecyclerView.ViewHolder) aRunnableS62S0300000_29.l2);
            ((C194405113z) aRunnableS62S0300000_29.l1).LJJIIJ((RecyclerView.ViewHolder) aRunnableS62S0300000_29.l2);
            C194405113z.LJJIJIL((C194405113z) aRunnableS62S0300000_29.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TypingAvatarAnimator@1b43.runPendingAnimations$1$1$2");
    }

    public static final void run$6(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TypingAvatarAnimator@1b43.runPendingAnimations$2$1$2");
        try {
            ((ViewPropertyAnimator) aRunnableS62S0300000_29.l0).setListener(null);
            ((ArrayList) ((C194405113z) aRunnableS62S0300000_29.l1).LLJJL).remove((RecyclerView.ViewHolder) aRunnableS62S0300000_29.l2);
            ((C194405113z) aRunnableS62S0300000_29.l1).LJJIIJ((RecyclerView.ViewHolder) aRunnableS62S0300000_29.l2);
            C194405113z.LJJIJIL((C194405113z) aRunnableS62S0300000_29.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TypingAvatarAnimator@1b43.runPendingAnimations$2$1$2");
    }

    public static final void run$7(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TypingAvatarAnimator@1b43.runPendingAnimations$3$1$2");
        try {
            aRunnableS62S0300000_29.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TypingAvatarAnimator@1b43.runPendingAnimations$3$1$2");
    }

    public static final void run$8(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TypingAvatarAnimator@1b43.runPendingAnimations$4$1$2");
        try {
            aRunnableS62S0300000_29.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TypingAvatarAnimator@1b43.runPendingAnimations$4$1$2");
    }

    public static final void run$9(ARunnableS62S0300000_29 aRunnableS62S0300000_29) {
        boolean zLIZ;
        C1C7U.LIZ("DraftDownloadHelper@4c06.saveDraft$1$onCompileDone$callback$1$1");
        try {
            aRunnableS62S0300000_29.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftDownloadHelper@4c06.saveDraft$1$onCompileDone$callback$1$1");
    }

    public ARunnableS62S0300000_29(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
