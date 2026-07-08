package Y;

import X.AbstractC528270Knh;
import X.C0L9X;
import X.C0LD3;
import X.C0LEP;
import X.C0LF2;
import X.C0MPH;
import X.C0MVY;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1390390mHl;
import X.C1448790nnx;
import X.C1644050sst;
import X.C194353111z;
import X.C19EG;
import X.C201955140j;
import X.C2188811AlT;
import X.C523360Kfm;
import X.C529030Kov;
import X.C529740Kq4;
import X.C539630LEj;
import X.C545820Lau;
import X.C559810LxT;
import X.C785410UrT;
import X.C830690WiJ;
import X.InterfaceC1648570t0B;
import X.InterfaceC528410Knv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS383S0100000_8 implements Function0 {
    public final int $t;
    public Object l0;

    public static final Object invoke$19(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        return C559810LxT.lambda$semisugar$invokeSuspend$lambda$0$0((NewCutPlayerActivity) aObjectS383S0100000_8.l0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        C19EG c19eg = (C19EG) aObjectS383S0100000_8.l0;
        AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi(AVDraftMigrateService.class);
        if (aVDraftMigrateService != null) {
            aVDraftMigrateService.observeM2DraftMigrationResult(c19eg);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        p1 p1Var = (p1) aObjectS383S0100000_8.l0;
        p1Var.LJFF.ko0(false);
        InterfaceC1648570t0B interfaceC1648570t0B = p1Var.LJFF;
        C1644050sst c1644050sst = new C1644050sst("lyric_anchor_gate_failed");
        c1644050sst.LIZ = 3;
        interfaceC1648570t0B.tu0(c1644050sst);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        return Integer.valueOf(((C529740Kq4) aObjectS383S0100000_8.l0).LLLJL);
    }

    public static final Object invoke$11(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        InterfaceC528410Knv interfaceC528410Knv = ((C529740Kq4) aObjectS383S0100000_8.l0).LLJJ;
        if (interfaceC528410Knv != null) {
            interfaceC528410Knv.LJIILIIL("inappropriate_content");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        return ((C529740Kq4) aObjectS383S0100000_8.l0).LLJJ;
    }

    public static final Object invoke$13(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS383S0100000_8.l0;
        String str = VideoRecordPermissionActivity._pnsPageId;
        C539630LEj.LJIIIIZZ(videoRecordPermissionActivity.getIntent(), C0L9X.CANCELLED, null);
        C1448790nnx.LIZIZ("camera_error", "1", null, 12);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        Bundle extras;
        Bundle extras2;
        VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS383S0100000_8.l0;
        String str = VideoRecordPermissionActivity._pnsPageId;
        if (videoRecordPermissionActivity.getIntent().hasExtra("exterior_record_model")) {
            try {
                extras = videoRecordPermissionActivity.getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            if (C0LF2.LIZ(extras, "ecommerce_photo_search") == null) {
                try {
                    extras2 = videoRecordPermissionActivity.getIntent().getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    extras2 = null;
                }
                C0LF2.LIZ(extras2, "aigc_take_selfie");
            }
            C539630LEj.LJIIIIZZ(videoRecordPermissionActivity.getIntent(), C0L9X.FAILED, null);
        }
        videoRecordPermissionActivity.finish();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS383S0100000_8.l0;
        String str = VideoRecordPermissionActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LJFF;
    }

    public static final Object invoke$16(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        ((Runnable) aObjectS383S0100000_8.l0).run();
        return null;
    }

    public static final Object invoke$17(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        Activity activity;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS383S0100000_8.l0;
        videoPublishContainerScene.LLLLJI.incrementAndGet();
        if (videoPublishContainerScene.LLLLJ == null && (activity = videoPublishContainerScene.mActivity) != null && !activity.isFinishing()) {
            videoPublishContainerScene.LLLLJ = C0MPH.LIZLLL(videoPublishContainerScene.mActivity, videoPublishContainerScene.getString(2131846487));
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoPublish prepareEffects:");
            sbLIZ.append(videoPublishContainerScene.LLLLJ);
            C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
            C194353111z.LIZ.LIZIZ(1602, C0MVY.SHOW, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
            return null;
        }
        return null;
    }

    public static final Object invoke$18(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        C0MPH c0mph;
        Activity activity;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS383S0100000_8.l0;
        if (videoPublishContainerScene.LLLLJI.decrementAndGet() == 0 && (c0mph = videoPublishContainerScene.LLLLJ) != null && c0mph.isShowing() && (activity = videoPublishContainerScene.mActivity) != null && !activity.isFinishing()) {
            C0MPH c0mph2 = videoPublishContainerScene.LLLLJ;
            c0mph2.dismiss();
            C785410UrT.LIZ(c0mph2);
            videoPublishContainerScene.LLLLJ = null;
            C194353111z.LIZ.LIZIZ(1602, C0MVY.DISMISS, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(Y.AObjectS383S0100000_8 r0) {
        /*
            java.lang.Object r0 = r0.l0
            X.0Knh r0 = (X.AbstractC528270Knh) r0
            boolean r0 = r0.LLLLII
            if (r0 != 0) goto L19
            X.0L0I r0 = X.C0L0I.LIZ
            r0.getClass()
            boolean r0 = X.C0L0I.LIZIZ()
            if (r0 != 0) goto L19
            r0 = 0
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L19:
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS383S0100000_8.invoke$2(Y.AObjectS383S0100000_8):java.lang.Object");
    }

    public static final Object invoke$20(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        Context context = (Context) aObjectS383S0100000_8.l0;
        String str = DraftBoxActivity._pnsPageId;
        DraftBoxActivity.LLLLZLL(context, new Intent(context, (Class<?>) DraftBoxActivity.class));
        return null;
    }

    public static final Object invoke$21(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        DraftBoxActivity.LLLLZLLLI((Context) aObjectS383S0100000_8.l0);
        return null;
    }

    public static final Object invoke$22(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        DraftBoxActivity draftBoxActivity = (DraftBoxActivity) aObjectS383S0100000_8.l0;
        String str = DraftBoxActivity._pnsPageId;
        draftBoxActivity.init();
        return null;
    }

    public static final Object invoke$23(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        DraftBoxActivity draftBoxActivity = (DraftBoxActivity) aObjectS383S0100000_8.l0;
        String str = DraftBoxActivity._pnsPageId;
        draftBoxActivity.getClass();
        C1390390mHl c1390390mHl = C1390390mHl.LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131832434);
        c1390390mHl.createToast(draftBoxActivity, 5005, creativeToastBuilder);
        draftBoxActivity.finish();
        return null;
    }

    public static final Object invoke$24(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        DraftBoxActivity.LLLLZLLLI((Context) aObjectS383S0100000_8.l0);
        return null;
    }

    public static final Object invoke$25(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aObjectS383S0100000_8.l0;
        HandlerHook.viewPost(viewHolder.itemView, new ARunnableS108S0100000_8(viewHolder, 152));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        ((AbstractC528270Knh) aObjectS383S0100000_8.l0).getClass();
        return Boolean.valueOf(C523360Kfm.LIZJ());
    }

    public static final Object invoke$4(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        C529030Kov c529030Kov = (C529030Kov) aObjectS383S0100000_8.l0;
        c529030Kov.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view is invalid, ignore media data load callback, activityRef=");
        sbLIZ.append(c529030Kov.mActivity);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        C529030Kov c529030Kov = (C529030Kov) aObjectS383S0100000_8.l0;
        c529030Kov.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view is invalid, ignore media album data load callback, contextRef=");
        sbLIZ.append(C545820Lau.LIZIZ(c529030Kov));
        sbLIZ.append(", isViewValid = ");
        sbLIZ.append(c529030Kov.LLJJIJIIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        return Integer.valueOf(((C529740Kq4) aObjectS383S0100000_8.l0).LLJLLL);
    }

    public static final Object invoke$7(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        return Integer.valueOf(((C529740Kq4) aObjectS383S0100000_8.l0).LLJLL);
    }

    public static final Object invoke$8(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        return Integer.valueOf(((C529740Kq4) aObjectS383S0100000_8.l0).LLLJL);
    }

    public static final Object invoke$9(AObjectS383S0100000_8 aObjectS383S0100000_8) {
        InterfaceC528410Knv interfaceC528410Knv = ((C529740Kq4) aObjectS383S0100000_8.l0).LLJJ;
        if (interfaceC528410Knv != null) {
            interfaceC528410Knv.LJIILIIL("inappropriate_content");
        }
        return Unit.LIZ;
    }

    public AObjectS383S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
