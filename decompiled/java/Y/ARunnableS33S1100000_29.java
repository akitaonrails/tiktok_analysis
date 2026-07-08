package Y;

import X.C11BC;
import X.C11BD;
import X.C122P;
import X.C12U9;
import X.C1404250me7;
import X.C1465480oEs;
import X.C19389810tU;
import X.C19390010tW;
import X.C194509117z;
import X.C19659311vr;
import X.C19713312Ax;
import X.C19722512El;
import X.C19762612Tw;
import X.C1C7U;
import X.C20296414bK;
import X.C20684815ws;
import X.C21290818Tq;
import X.C2188811AlT;
import X.C2354709Kn;
import X.EnumC19385810sq;
import X.EnumC585150MxF;
import X.InterfaceC19429510zt;
import X.InterfaceC19722312Ej;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.interest.InterestReselectionService;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.play.PlayViewComponent;
import com.ss.android.ugc.aweme.view.autocreation.ProfileNaviAutoCreationCameraContainerFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationViewModel;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS33S1100000_29 implements Runnable {
    public final int $t;
    public Object l1;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1465480oEs c1465480oEs = new C1465480oEs();
        C19659311vr c19659311vr = (C19659311vr) this.l1;
        Activity activity = c19659311vr.mActivity;
        if (activity == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        List<TextStickerData> listLIZIZ = c1465480oEs.LIZIZ(activity, c19659311vr.getEditModel(), this.s0);
        C19659311vr c19659311vr2 = (C19659311vr) this.l1;
        for (TextStickerData textStickerData : listLIZIZ) {
            C122P c122p = c19659311vr2.LLJJL;
            if (c122p == null) {
                c122p = null;
            }
            c122p.LIZIZ(textStickerData, true);
        }
    }

    public final void LIZ$1() {
        String str = this.s0;
        if (str == null) {
            return;
        }
        InterestReselectionService interestReselectionService = (InterestReselectionService) this.l1;
        synchronized (interestReselectionService.LIZIZ) {
            try {
                if (!Intrinsics.LJFF(interestReselectionService.LJI, str)) {
                    interestReselectionService.LJI = str;
                    interestReselectionService.LJJII().storeInt("keva_key_vv_counter", interestReselectionService.LIZJ.incrementAndGet());
                    C194509117z.LIZ.getClass();
                    int i = C194509117z.LIZ().startAtVv;
                    if (i <= 0 || interestReselectionService.LIZLLL.get() <= i + 2) {
                        interestReselectionService.LJJII().storeInt("keva_key_vv_counter_since_install", interestReselectionService.LIZLLL.incrementAndGet());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$2() {
        ((C19762612Tw) this.l1).LLLJL = false;
        C19762612Tw c19762612Tw = (C19762612Tw) this.l1;
        c19762612Tw.LLLL.sendEmptyMessage(c19762612Tw.LLLLII);
        if (!u.LJIIZILJ(this.s0, "wav", false)) {
            C2354709Kn.LJIJJLI(this.s0);
        }
        C19762612Tw c19762612Tw2 = (C19762612Tw) this.l1;
        c19762612Tw2.LLLL.sendEmptyMessage(c19762612Tw2.LLLLIIL);
    }

    public final void LIZ$3() {
        BaseActivity baseActivity = ((PlayViewComponent) this.l1).LLILLL;
        if (baseActivity == null) {
            baseActivity = null;
        }
        if (Intrinsics.LJFF(baseActivity.getLocalClassName(), this.s0)) {
            return;
        }
        BaseActivity baseActivity2 = ((PlayViewComponent) this.l1).LLILLL;
        if (baseActivity2 == null) {
            baseActivity2 = null;
        }
        String localClassName = baseActivity2.getLocalClassName();
        Activity activityLIZIZ = C19713312Ax.LIZIZ();
        if (Intrinsics.LJFF(localClassName, activityLIZIZ != null ? activityLIZIZ.getLocalClassName() : null)) {
            C20684815ws.LJIILLIIL("enter_template_preview_page", C1404250me7.LIZ(((PlayViewComponent) this.l1).LLILLJJLI.LIZJ()).LIZ);
        }
    }

    public final void LIZ$4() {
        C19722512El c19722512El = (C19722512El) this.l1;
        c19722512El.LLJILJIL = this.s0;
        InterfaceC19722312Ej interfaceC19722312Ej = c19722512El.LLJILJILJ;
        SurfaceView surfaceViewLJIJJLI = interfaceC19722312Ej != null ? interfaceC19722312Ej.LJIJJLI() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareVideo: onSuccess, surfaceView is null ");
        sbLIZ.append(surfaceViewLJIJJLI == null);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
        if (surfaceViewLJIJJLI != null) {
            ((C19722512El) this.l1).z4(this.s0, surfaceViewLJIJJLI);
        }
    }

    public final void LIZ$5() {
        if (this.s0 == null) {
            ((C19722512El) this.l1).i3(AFwS273S0000000_29.get$arr$(261));
            return;
        }
        C19722512El c19722512El = (C19722512El) this.l1;
        c19722512El.Z4(c19722512El.T2().LIZ);
        ((C19722512El) this.l1).O3().gu2(Collections.singletonList(this.s0));
        ((C19722512El) this.l1).hide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$6() {
        InterfaceC19429510zt naviManager;
        Bitmap bitmapLJIILL;
        try {
            ProfileNaviDataModel profileNaviDataModel = (ProfileNaviDataModel) new Gson().LJII(this.s0, ProfileNaviDataModel.class);
            C20296414bK c20296414bKNR = ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).NR();
            if (c20296414bKNR == null || (naviManager = c20296414bKNR.getNaviManager()) == null || (bitmapLJIILL = naviManager.LJIILL(false)) == null) {
                return;
            }
            ((ProfileNaviAutoCreationState) ((ProfileNaviAutoCreationViewModel) ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).LLILZIL.getValue()).FQ2()).setSelfieBitmap(bitmapLJIILL);
            ProfileNaviAutoCreationViewModel profileNaviAutoCreationViewModel = (ProfileNaviAutoCreationViewModel) ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).LLILZIL.getValue();
            profileNaviAutoCreationViewModel.getClass();
            profileNaviAutoCreationViewModel.setStateImmediate(new AwS608S0100000_29(profileNaviDataModel, 562));
            profileNaviAutoCreationViewModel.setStateImmediate(AFwS273S0000000_29.get$arr$(307));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getMessage() != null) {
                ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).getTag();
            }
        }
    }

    public static final void run$0(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditTextStickerScene@bc67.onActivityCreated$2");
        try {
            aRunnableS33S1100000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditTextStickerScene@bc67.onActivityCreated$2");
    }

    public static final void run$1(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("InterestReselectionService@585f.increaseVV$1");
        try {
            aRunnableS33S1100000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InterestReselectionService@585f.increaseVV$1");
    }

    public static final void run$10(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileNaviAutoCreationCameraContainerFragment@5852.onAvatarFitResult$1");
        try {
            aRunnableS33S1100000_29.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileNaviAutoCreationCameraContainerFragment@5852.onAvatarFitResult$1");
    }

    public static final void run$2(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("InterestReselectionService@585f.persistInterestCardBackgroundMusic$1");
        try {
            ((InterestReselectionService) aRunnableS33S1100000_29.l1).LJJII().storeString("keva_key_interest_card_music_url", aRunnableS33S1100000_29.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InterestReselectionService@585f.persistInterestCardBackgroundMusic$1");
    }

    public static final void run$3(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditAudioRecordScene@9075.closeWithDelFile$target$1");
        try {
            aRunnableS33S1100000_29.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditAudioRecordScene@9075.closeWithDelFile$target$1");
    }

    public static final void run$4(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("PlayViewComponent@5b79.onResume$1");
        try {
            aRunnableS33S1100000_29.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayViewComponent@5b79.onResume$1");
    }

    public static final void run$5(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("SearchBar@f3cd.handleTextChanged$runnable$1");
        try {
            C11BC c11bc = ((C11BD) aRunnableS33S1100000_29.l1).LL;
            if (c11bc != null) {
                c11bc.LLIILII(aRunnableS33S1100000_29.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchBar@f3cd.handleTextChanged$runnable$1");
    }

    public static final void run$6(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AiChatExtractFramesComponent@a74a.prepareVideo$onSuccess$1$1");
        try {
            aRunnableS33S1100000_29.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatExtractFramesComponent@a74a.prepareVideo$onSuccess$1$1");
    }

    public static final void run$7(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AiChatExtractFramesComponent@a74a.sceneActions$1$3$1$1");
        try {
            aRunnableS33S1100000_29.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatExtractFramesComponent@a74a.sceneActions$1$3$1$1");
    }

    public static final void run$8(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        EnumC585150MxF enumC585150MxF;
        C1C7U.LIZ("PlayerViewComponent@ca10.startPlay$4");
        try {
            if (Intrinsics.LJFF(((C19389810tU) aRunnableS33S1100000_29.l1).LLJJ, aRunnableS33S1100000_29.s0)) {
                C19389810tU c19389810tU = (C19389810tU) aRunnableS33S1100000_29.l1;
                C19390010tW c19390010tW = c19389810tU.LLILZLL;
                if (c19390010tW != null) {
                    enumC585150MxF = c19390010tW.LJ.LL;
                } else {
                    enumC585150MxF = null;
                }
                if (enumC585150MxF == EnumC585150MxF.PREPARED) {
                    c19389810tU.LJJ().vQ2(EnumC19385810sq.LOADING);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerViewComponent@ca10.startPlay$4");
    }

    public static final void run$9(ARunnableS33S1100000_29 aRunnableS33S1100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("FTCEditAudioRecordScene@eb2b.closeWithDelFile$target$1");
        try {
            ((C12U9) aRunnableS33S1100000_29.l1).LLLILZ = false;
            ((C12U9) aRunnableS33S1100000_29.l1).LLLILZJ.sendEmptyMessage(1);
            if (!u.LJIIZILJ(aRunnableS33S1100000_29.s0, "wav", false)) {
                C2354709Kn.LJIJJLI(aRunnableS33S1100000_29.s0);
            }
            ((C12U9) aRunnableS33S1100000_29.l1).LLLILZJ.sendEmptyMessage(4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCEditAudioRecordScene@eb2b.closeWithDelFile$target$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS33S1100000_29(X.C19722512El r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 6 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS33S1100000_29.<init>(X.12El, java.lang.String, int):void");
    }

    public ARunnableS33S1100000_29(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
