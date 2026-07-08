package Y;

import X.AnonymousClass1573;
import X.AnonymousClass1574;
import X.C013C;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1399150mVt;
import X.C13LP;
import X.C14JQ;
import X.C15AO;
import X.C15AS;
import X.C15AX;
import X.C15AY;
import X.C15AZ;
import X.C15IP;
import X.C15LD;
import X.C15LG;
import X.C15WQ;
import X.C1835340xrQ;
import X.C19EG;
import X.C1C7U;
import X.C204747159t;
import X.C20494215Hg;
import X.C20517115Qb;
import X.C20571715ed;
import X.C20597915ir;
import X.C20646915ql;
import X.C20648715r3;
import X.C20691515xx;
import X.C20750016Hq;
import X.C2188811AlT;
import X.C276970AtL;
import X.C294080Bfq;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1399740mWq;
import X.InterfaceC1399770mWt;
import X.InterfaceC204675156z;
import X.InterfaceC20517315Qd;
import X.InterfaceC20517715Qh;
import X.InterfaceC480050Is7;
import X.ProgressDialogC1399760mWs;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.sticker.assem.CommonHorizontalContainerAssem;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachStorageConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS240S0300000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS64S0300000_31 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$1() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        GradientDrawable gradientDrawable = (GradientDrawable) this.l1;
        ViewGroup viewGroup = (ViewGroup) this.l2;
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new C14JQ());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS233S0200000_31(gradientDrawable, viewGroup, 7));
        valueAnimatorOfInt.addListener(new ALAdapterS14S0300000_31((GradientDrawable) this.l1, (ViewGroup) this.l2, (ExploreFeedCell) this.l0, 1));
        ((ExploreFeedCell) this.l0).LLJJIJIL = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

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
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((FrameLayout) this.l0).getParent() != null) {
            try {
                if (!C294080Bfq.LIZ()) {
                    C19EG c19eg = (C19EG) this.l1;
                    C723850SaN.LIZIZ(c19eg, new AwS240S0300000_31((FrameLayout) this.l0, c19eg, (CommonHorizontalContainerAssem) this.l2, 3));
                } else {
                    C19EG c19eg2 = (C19EG) this.l1;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ$2() {
        MiniGameFragment miniGameFragment = (MiniGameFragment) this.l0;
        boolean z = ((C013C) this.l1).element;
        miniGameFragment.LLLZ = z;
        if (z) {
            FrameLayout frameLayout = miniGameFragment.LLZIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
        } else {
            FrameLayout frameLayout2 = miniGameFragment.LLZIL;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
        }
        if (((C013C) this.l2).element) {
            FrameLayout frameLayout3 = ((MiniGameFragment) this.l0).LLZ;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
            ImageView imageView = ((MiniGameFragment) this.l0).m;
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
                return;
            }
            return;
        }
        FrameLayout frameLayout4 = ((MiniGameFragment) this.l0).LLZ;
        if (frameLayout4 != null) {
            C786410Ut5.LJZ(8, frameLayout4);
        }
        ImageView imageView2 = ((MiniGameFragment) this.l0).m;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
        }
    }

    public final void LIZ$3() {
        ArrayList arrayList;
        int i = ((OutreachStorageConfig) C20646915ql.LIZIZ.getValue()).maxShownModelCount;
        if (((List) this.l0).size() > i) {
            int size = (int) (((double) i) * 0.4d);
            if (size < 0) {
                size = (int) (((double) ((List) this.l0).size()) * 0.5d);
            }
            List list = (List) this.l0;
            if (list instanceof CopyOnWriteArrayList) {
                int size2 = ((CopyOnWriteArrayList) list).size() - size;
                if (size2 < 0) {
                    size2 = 0;
                }
                while (((CopyOnWriteArrayList) ((List) this.l0)).size() > size2) {
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((List) this.l0);
                    copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
                }
            } else {
                List listLJJJJJ = C13LP.LJJJJJ(size, list);
                if ((listLJJJJJ instanceof ArrayList) && (arrayList = (ArrayList) listLJJJJJ) != null && !arrayList.isEmpty()) {
                    ((OutreachRecordConfig) this.l1)._outreachRecordList = arrayList;
                }
            }
            C20571715ed c20571715ed = C20571715ed.LIZ;
            ((OutreachRecordConfig) this.l1)._outreachRecordList.size();
            c20571715ed.getClass();
        }
        C20648715r3 c20648715r3 = C20648715r3.LIZ;
        OutreachRecordData outreachRecordData = (OutreachRecordData) this.l2;
        c20648715r3.getClass();
        C20648715r3.LJI(outreachRecordData, false);
    }

    public static final void run$0(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MentionServiceImpl@aed1.assembleMentionStickerList$1");
        try {
            aRunnableS64S0300000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MentionServiceImpl@aed1.assembleMentionStickerList$1");
    }

    public static final void run$1(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFeedCell@544c.startSchemaHighlight$2$onAnimationEnd$disappearRunnable$1");
        try {
            aRunnableS64S0300000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedCell@544c.startSchemaHighlight$2$onAnimationEnd$disappearRunnable$1");
    }

    public static final void run$10(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("Top3AvatarGeniusView@a469.updateAnimation$1$11$onAnimationEnd$1");
        try {
            C15AZ geniusModel = (C15AZ) aRunnableS64S0300000_31.l0;
            if (geniusModel != null || (geniusModel = ((C204747159t) aRunnableS64S0300000_31.l1).getGeniusModel()) != null) {
                C204747159t c204747159t = (C204747159t) aRunnableS64S0300000_31.l1;
                c204747159t.LJFF(geniusModel);
                c204747159t.LJIIIIZZ(geniusModel);
            }
            Function2 function2 = (Function2) aRunnableS64S0300000_31.l2;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Top3AvatarGeniusView@a469.updateAnimation$1$11$onAnimationEnd$1");
    }

    public static final void run$11(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        C15LD c15ld = (C15LD) aRunnableS64S0300000_31.l0;
        Effect effect = (Effect) aRunnableS64S0300000_31.l1;
        MusicModel musicModel = (MusicModel) aRunnableS64S0300000_31.l2;
        C15LG c15lg = c15ld.LJFF.LJ;
        if (c15lg != null) {
            c15lg.fB(effect, musicModel);
        }
    }

    public static final void run$12(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SmartColorProcessor@381f.fetchVideoBitmap$threadTask$1");
        try {
            if (!((C20517115Qb) aRunnableS64S0300000_31.l0).LIZIZ.get()) {
                Function0 function0 = (Function0) aRunnableS64S0300000_31.l1;
                InterfaceC20517715Qh interfaceC20517715Qh = (InterfaceC20517715Qh) aRunnableS64S0300000_31.l2;
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC20517715Qh.onFail();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartColorProcessor@381f.fetchVideoBitmap$threadTask$1");
    }

    public static final void run$13(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SmartColorProcessor@381f.start$threadTask$1");
        try {
            if (!((C20517115Qb) aRunnableS64S0300000_31.l0).LIZIZ.get()) {
                Function0 function0 = (Function0) aRunnableS64S0300000_31.l1;
                C20517115Qb c20517115Qb = (C20517115Qb) aRunnableS64S0300000_31.l0;
                InterfaceC20517315Qd interfaceC20517315Qd = (InterfaceC20517315Qd) aRunnableS64S0300000_31.l2;
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c20517115Qb.LIZIZ(interfaceC20517315Qd);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartColorProcessor@381f.start$threadTask$1");
    }

    public static final void run$14(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("GetImageColorsWithParamsMethod@a22a.handle$1");
        try {
            AnonymousClass1573 anonymousClass1573 = (AnonymousClass1573) aRunnableS64S0300000_31.l0;
            InterfaceC204675156z interfaceC204675156z = (InterfaceC204675156z) aRunnableS64S0300000_31.l1;
            CompletionBlock completionBlock = (CompletionBlock) aRunnableS64S0300000_31.l2;
            anonymousClass1573.getClass();
            C20750016Hq c20750016Hq = new C20750016Hq(completionBlock, interfaceC204675156z, anonymousClass1573, 1);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(interfaceC204675156z.getImageUrl());
            c1331670kl3LJIIIZ.LJJIIJZLJL = AnonymousClass1574.LL;
            c1331670kl3LJIIIZ.LJJIIJ(c20750016Hq);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GetImageColorsWithParamsMethod@a22a.handle$1");
    }

    public static final void run$15(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("OrderSubmitJumpLogisticsSmoothScroller@fd4e.onStop$2$onScrollStateChanged$1$1$2");
        try {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.g0, ((View) aRunnableS64S0300000_31.l0).getContext());
            if (numLIZJ != null) {
                C20691515xx c20691515xx = (C20691515xx) aRunnableS64S0300000_31.l1;
                int iIntValue = numLIZJ.intValue();
                View view = c20691515xx.LJIJJ;
                if (view != null) {
                    view.setBackgroundColor(iIntValue);
                }
            }
            ((C20691515xx) aRunnableS64S0300000_31.l1).LJIILL.removeOnScrollListener((AsS56S0100000_31) aRunnableS64S0300000_31.l2);
            C20691515xx c20691515xx2 = (C20691515xx) aRunnableS64S0300000_31.l1;
            c20691515xx2.LJIJ = null;
            c20691515xx2.LJIJJ = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OrderSubmitJumpLogisticsSmoothScroller@fd4e.onStop$2$onScrollStateChanged$1$1$2");
    }

    public static final void run$16(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("OrderSubmitJumpLogisticsSmoothScroller@fd4e.onStop$2$onScrollStateChanged$1$1");
        try {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zv, ((View) aRunnableS64S0300000_31.l0).getContext());
            if (numLIZJ != null) {
                C20691515xx c20691515xx = (C20691515xx) aRunnableS64S0300000_31.l1;
                int iIntValue = numLIZJ.intValue();
                View view = c20691515xx.LJIJJ;
                if (view != null) {
                    view.setBackgroundColor(iIntValue);
                }
            }
            View view2 = (View) aRunnableS64S0300000_31.l0;
            HandlerHook.viewPostDelay(view2, new ARunnableS64S0300000_31((C20691515xx) aRunnableS64S0300000_31.l1, (AsS56S0100000_31) aRunnableS64S0300000_31.l2, view2, 15), 1000L);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OrderSubmitJumpLogisticsSmoothScroller@fd4e.onStop$2$onScrollStateChanged$1$1");
    }

    public static final void run$2(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        WeakReference weakReference = (WeakReference) aRunnableS64S0300000_31.l0;
        Activity activity = (Activity) aRunnableS64S0300000_31.l1;
        ImageView imageView = (ImageView) aRunnableS64S0300000_31.l2;
        C1C7U.LIZ("ImageStopLossLanect@81dc.clearImage$2L");
        try {
            ImageView imageView2 = (ImageView) weakReference.get();
            if (imageView2 != null && imageView2.getDrawable() != null && !imageView2.isAttachedToWindow()) {
                if ((((Number) C276970AtL.LIZ.getValue()).intValue() & 2) != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("activity ");
                    sbLIZ.append(activity);
                    sbLIZ.append(" image ");
                    sbLIZ.append(imageView);
                    new StringBuffer(C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" leak!!!, image drawable is ");
                    sbLIZ2.append(imageView.getDrawable());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(", image background is ");
                    sbLIZ3.append(imageView.getBackground());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (((PreloadWidgetsData) C20597915ir.LIZIZ.getValue()).disableRecycleImage && (activity instanceof InterfaceC480050Is7)) {
                    C1C7U.LIZIZ("ImageStopLossLanect@81dc.clearImage$2L");
                    return;
                }
                if (imageView != null) {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                    imageView.setImageDrawable(null);
                }
                if (imageView.getBackground() != null) {
                    try {
                        imageView.getBackground().setCallback(null);
                        imageView.setBackgroundDrawable(null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("ImageStopLossLanect@81dc.clearImage$2L");
    }

    public static final void run$3(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.initWSServer$4$1$1");
        try {
            aRunnableS64S0300000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.initWSServer$4$1$1");
    }

    public static final void run$4(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        final MusicRecordService musicRecordService = (MusicRecordService) aRunnableS64S0300000_31.l0;
        Activity activity = (Activity) aRunnableS64S0300000_31.l1;
        final MusicModel musicModel = (MusicModel) aRunnableS64S0300000_31.l2;
        musicRecordService.getClass();
        C1C7U.LIZ("MusicRecordService@49d8.showProgressDialog$1L");
        if (musicRecordService.LJFF && activity != null && !activity.isFinishing()) {
            ProgressDialogC1399760mWs progressDialogC1399760mWsLIZIZ = C1399150mVt.LIZIZ(activity, EnumC1399740mWq.VISIBLE, new InterfaceC1399770mWt() { // from class: X.15L5
                @Override // X.InterfaceC1399770mWt
                public final void LIZ() {
                    musicRecordService.LJ.LIZ(musicModel.getMusicId());
                }
            });
            musicRecordService.LIZLLL = progressDialogC1399760mWsLIZIZ;
            progressDialogC1399760mWsLIZIZ.setMessage(activity.getResources().getString(R.string.txr));
            MusicRecordService.LIZJ(true);
        }
        C1C7U.LIZIZ("MusicRecordService@49d8.showProgressDialog$1L");
    }

    public static final void run$5(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("OutreachRecordConfig@26ad.addRecord$1");
        try {
            aRunnableS64S0300000_31.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OutreachRecordConfig@26ad.addRecord$1");
    }

    public static final void run$6(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LottieLoadAbility@74f1.playLottieAnimation$5");
        try {
            C1835340xrQ.LIZ("update playAnimation");
            C15AS.LIZLLL((C1295960jpS) aRunnableS64S0300000_31.l1, (C1294720jnS) aRunnableS64S0300000_31.l0, (C15AO) aRunnableS64S0300000_31.l2);
            C15AY c15ay = C15AX.LJJLIIIJLJLI;
            C1295960jpS c1295960jpS = (C1295960jpS) aRunnableS64S0300000_31.l1;
            c15ay.getClass();
            c1295960jpS.getDrawable().setVisible(true, false);
            c1295960jpS.playAnimation();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LottieLoadAbility@74f1.playLottieAnimation$5");
    }

    public static final void run$7(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MixStickyController@ede6.processHideStickyViewsNew$2");
        try {
            ((FrameLayout) aRunnableS64S0300000_31.l0).requestLayout();
            ((View) aRunnableS64S0300000_31.l1).requestLayout();
            ((C15WQ) aRunnableS64S0300000_31.l2).LIZ.requestLayout();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("MixStickyController@ede6.processHideStickyViewsNew$2");
    }

    public static final void run$8(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        C20494215Hg c20494215Hg = (C20494215Hg) aRunnableS64S0300000_31.l0;
        MusicModel musicModel = (MusicModel) aRunnableS64S0300000_31.l1;
        C15IP c15ip = (C15IP) aRunnableS64S0300000_31.l2;
        c20494215Hg.getClass();
        C1C7U.LIZ("MusicAdapter@94e6.<field>$3$onClick$1$onSuccess$1L");
        c20494215Hg.LIZLLL.LIZ.LLLIILIL(c15ip, musicModel);
        C1C7U.LIZIZ("MusicAdapter@94e6.<field>$3$onClick$1$onSuccess$1L");
    }

    public static final void run$9(ARunnableS64S0300000_31 aRunnableS64S0300000_31) {
        boolean zLIZ;
        C1C7U.LIZ("Top3AvatarGeniusView@a469.updateAnimation$1$11$onAnimationCancel$1");
        try {
            C15AZ geniusModel = (C15AZ) aRunnableS64S0300000_31.l0;
            if (geniusModel != null || (geniusModel = ((C204747159t) aRunnableS64S0300000_31.l1).getGeniusModel()) != null) {
                C204747159t c204747159t = (C204747159t) aRunnableS64S0300000_31.l1;
                c204747159t.LJFF(geniusModel);
                c204747159t.LJIIIIZZ(geniusModel);
            }
            Function2 function2 = (Function2) aRunnableS64S0300000_31.l2;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Top3AvatarGeniusView@a469.updateAnimation$1$11$onAnimationCancel$1");
    }

    public ARunnableS64S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
