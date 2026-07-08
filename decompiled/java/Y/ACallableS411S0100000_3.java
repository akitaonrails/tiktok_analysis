package Y;

import X.C08EY;
import X.C098200Yq;
import X.C09BH;
import X.C09ZM;
import X.C0C64;
import X.C0CHQ;
import X.C0MH8;
import X.C0MI0;
import X.C0VSF;
import X.C0VSJ;
import X.C0WZX;
import X.C1286680jaU;
import X.C1445850njD;
import X.C1469770oLn;
import X.C1720106oR;
import X.C189200o6;
import X.C19290510dT;
import X.C1C7U;
import X.C201955140j;
import X.C2107108Nh;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2223208nO;
import X.C2260008tK;
import X.C2286708xd;
import X.C2339809Eu;
import X.C2347809Hw;
import X.C2354709Kn;
import X.C2354809Ko;
import X.C2405709bj;
import X.C2406509br;
import X.C2407909c5;
import X.C2408609cC;
import X.C2419309dv;
import X.C2426709f7;
import X.C2439109h7;
import X.C2475309mx;
import X.C259800zU;
import X.C533730KwV;
import X.C535020Kya;
import X.C570230MYb;
import X.C574790MgX;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794210VDn;
import X.C810670Vr7;
import X.InterfaceC1594010raB;
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.aweme.storage.CompatJobService;
import com.aweme.storage.JobService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.ss.android.ugc.aweme.effect.EffectJobService;
import com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.setting.AvPeriodicCleanStorageSettings;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.monitor.DraftOperationEvent;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.vesdk.VEUtils;
import com.tts.oecverify.BdTuring;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS411S0100000_3 implements Callable {
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return call$18(this);
            case 19:
                return call$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            case 28:
                return call$28(this);
            case 29:
                return call$29(this);
            case 30:
                return call$30(this);
            case 31:
                return call$31(this);
            case 32:
                return call$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return call$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return call$34(this);
            case 35:
                return call$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return call$36(this);
            case 37:
                return call$37(this);
            case 38:
                return call$38(this);
            case 39:
                return call$39(this);
            case 40:
                return call$40(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("MultiEditVideoHelper@300b.deleteMultiEditTempFile$1");
        if (C2354709Kn.LIZIZ(((AwemeDraft) aCallableS411S0100000_3.l0).LJI())) {
            new C0VSJ(((AwemeDraft) aCallableS411S0100000_3.l0).LJI()).delete();
        }
        C1C7U.LIZIZ("MultiEditVideoHelper@300b.deleteMultiEditTempFile$1");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS411S0100000_3 r14) {
        /*
            java.lang.String r13 = "FileCacheManager@2eae.startClean$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r5 = r14.l0
            android.content.Context r5 = (android.content.Context) r5
            boolean r0 = X.C2426709f7.LIZ
            if (r0 != 0) goto Lb1
            if (r5 == 0) goto Lb1
            long r1 = X.C0WYJ.LJI()
            X.09f4 r0 = X.EnumC2426409f4.APP_BACKGROUND
            X.C1336210ksN.LJ(r1, r0)
            com.ss.android.ugc.aweme.base.storage.IFileCacheCleanerService r0 = com.ss.android.ugc.aweme.shortvideo.util.FileCacheCleanerService.LIZLLL()
            boolean r0 = r0.LIZ()
            r1 = 0
            r3 = 0
            r12 = 1
            if (r0 == 0) goto La9
            java.lang.String r0 = "clean_storage_pref"
            android.content.SharedPreferences r1 = X.C810670Vr7.LIZJ(r5, r1, r0)
            java.lang.String r0 = "key_clean_date"
            long r10 = r1.getLong(r0, r3)
            X.01GW r0 = X.C1095404Qe.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r6 = (long) r0
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 * r8
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L69
            X.01GW r0 = X.C2250201D5m.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r6 = (long) r0
            long r6 = r6 * r8
            boolean r0 = X.C1336210ksN.LIZ()
            if (r0 == 0) goto La9
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto La9
        L69:
            X.C2426709f7.LIZ = r12
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L9e
            boolean r0 = com.aweme.storage.CompatJobService.LL     // Catch: java.lang.Exception -> Lad
            if (r0 != 0) goto Lb1
            com.aweme.storage.CompatJobService.LL = r12     // Catch: java.lang.Exception -> Lad
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder     // Catch: java.lang.Exception -> Lad
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> Lad
            java.lang.Class<com.aweme.storage.CompatJobService> r0 = com.aweme.storage.CompatJobService.class
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> Lad
            r0 = 1193041(0x123451, float:1.671807E-39)
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> Lad
            r2.setMinimumLatency(r3)     // Catch: java.lang.Exception -> Lad
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.setOverrideDeadline(r0)     // Catch: java.lang.Exception -> Lad
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r1 = X.C786410Ut5.H2(r5, r0)     // Catch: java.lang.Exception -> Lad
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1     // Catch: java.lang.Exception -> Lad
            android.app.job.JobInfo r0 = r2.build()     // Catch: java.lang.Exception -> Lad
            r1.schedule(r0)     // Catch: java.lang.Exception -> Lad
            goto Lb1
        L9e:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.aweme.storage.JobService> r0 = com.aweme.storage.JobService.class
            r1.<init>(r5, r0)
            X.C786410Ut5.s3(r5, r1)
            goto Lb1
        La9:
            X.C2427609fG.LIZIZ(r5)
            goto Lb1
        Lad:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb1:
            X.C1C7U.LIZIZ(r13)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS411S0100000_3.call$1(Y.ACallableS411S0100000_3):java.lang.Object");
    }

    public static final Object call$10(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("ExtendsKt@5a50.serialCall$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19290510dT.LIZJ("Extends", "serialCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExtendsKt@5a50.serialCall$1");
        return unit;
    }

    public static final Object call$11(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("ExtendsKt@5a50.asyncCall$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19290510dT.LIZJ("Extends", "asyncCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExtendsKt@5a50.asyncCall$1");
        return unit;
    }

    public static final Object call$12(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("ExtendsKt@5a50.postMain$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19290510dT.LIZJ("Extends", "mainCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExtendsKt@5a50.postMain$1");
        return unit;
    }

    public static final Object call$13(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Context context = (Context) aCallableS411S0100000_3.l0;
        C1C7U.LIZ("CleanEffectsTask@460.startCleanEffect$1L");
        if (context != null) {
            Context contextN3 = C786410Ut5.N3(context);
            if (!CleanEffectsTask.LL && contextN3 != null && !CleanEffectsTask.LLILLJJLI) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                CleanEffectsTask.LLILLJJLI = true;
                InterfaceC1594010raB interfaceC1594010raB = (InterfaceC1594010raB) C2419309dv.LIZ(contextN3, InterfaceC1594010raB.class);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLIZIZ = interfaceC1594010raB.LIZIZ();
                if (AvPeriodicCleanStorageSettings.LIZ().isOpen > 0 && jCurrentTimeMillis - jLIZIZ >= ((long) AvPeriodicCleanStorageSettings.LIZ().storageCleanIntervalDays) * 86400000) {
                    interfaceC1594010raB.LIZJ(jCurrentTimeMillis);
                    CleanEffectsTask.LL = true;
                    if (Build.VERSION.SDK_INT >= 26) {
                        try {
                            if (!EffectCompatJobService.LL) {
                                EffectCompatJobService.LL = true;
                                JobInfo.Builder builder = new JobInfo.Builder(190806, new ComponentName(contextN3, (Class<?>) EffectCompatJobService.class));
                                builder.setMinimumLatency(0L);
                                builder.setOverrideDeadline(3000L);
                                ((JobScheduler) C786410Ut5.H2(contextN3, "jobscheduler")).schedule(builder.build());
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        C786410Ut5.s3(contextN3, new Intent(contextN3, (Class<?>) EffectJobService.class));
                    }
                }
            }
        }
        C1C7U.LIZIZ("CleanEffectsTask@460.startCleanEffect$1L");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor.LIZJ.add(r6);
        r7.LIZIZ();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$14(Y.ACallableS411S0100000_3 r8) {
        /*
            java.lang.String r0 = "RealtimeFeedbackInterceptor@e5f0.onEvent$1$1"
            X.C1C7U.LIZ(r0)
            com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor r7 = com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor.LIZ
            java.lang.Object r6 = r8.l0
            X.07de r6 = (X.C1908007de) r6
            monitor-enter(r7)
            java.util.ArrayList<X.07de> r0 = com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor.LIZJ     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L59
        L12:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L46
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> L59
            X.07de r4 = (X.C1908007de) r4     // Catch: java.lang.Throwable -> L59
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZIZ     // Catch: java.lang.Throwable -> L59
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.String r0 = "item_id"
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L12
            java.util.Map<java.lang.String, java.lang.String> r1 = r6.LIZIZ     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L35
            java.lang.String r0 = "item_id"
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> L59
        L35:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r3)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L12
            java.lang.String r1 = r4.LIZ     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Throwable -> L59
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L12
            goto L50
        L46:
            java.util.ArrayList<X.07de> r0 = com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor.LIZJ     // Catch: java.lang.Throwable -> L59
            r0.add(r6)     // Catch: java.lang.Throwable -> L59
            r7.LIZIZ()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r7)
            goto L51
        L50:
            monitor-exit(r7)
        L51:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "RealtimeFeedbackInterceptor@e5f0.onEvent$1$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L59:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS411S0100000_3.call$14(Y.ACallableS411S0100000_3):java.lang.Object");
    }

    public static final Object call$15(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("VideoImageMixedController@1fe.loadVideoInfoToCache$1");
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(((TikTokMediaModel) aCallableS411S0100000_3.l0).LJFF());
        C1C7U.LIZIZ("VideoImageMixedController@1fe.loadVideoInfoToCache$1");
        return videoFileInfo;
    }

    public static final Object call$16(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        String strLJFF;
        C1C7U.LIZ("VideoImageMixedHelper@c682.check4KVideo$1");
        Iterator it2 = ((List) aCallableS411S0100000_3.l0).iterator();
        while (true) {
            if (it2.hasNext()) {
                MediaModel mediaModel = (MediaModel) it2.next();
                C533730KwV c533730KwV = C533730KwV.LIZ;
                String strLJFF2 = mediaModel.LJFF();
                c533730KwV.getClass();
                if (!C533730KwV.LJIIJ(strLJFF2)) {
                    if (mediaModel.width <= 0 || mediaModel.height <= 0) {
                        int[] iArr = new int[10];
                        if (C574790MgX.LIZIZ(mediaModel.LJFF(), iArr) == 0) {
                            mediaModel.width = iArr[0];
                            mediaModel.height = iArr[1];
                        }
                    }
                    int i = mediaModel.width;
                    int i2 = mediaModel.height;
                    if (i > i2) {
                        i = i2;
                    }
                    if (i > 1100) {
                        strLJFF = mediaModel.LJFF();
                        break;
                    }
                }
            } else {
                strLJFF = null;
                break;
            }
        }
        C1C7U.LIZIZ("VideoImageMixedHelper@c682.check4KVideo$1");
        return strLJFF;
    }

    public static final Object call$17(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("VideoImageMixedHelper@c682.deleteTempResizeImage$1");
        C533730KwV c533730KwV = C533730KwV.LIZ;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS411S0100000_3.l0;
        c533730KwV.getClass();
        String strLJFF = C533730KwV.LJFF(creativeInfo);
        if (C2354809Ko.LIZIZ(strLJFF)) {
            C533730KwV.LIZIZ(new C0VSJ(strLJFF));
        }
        C1C7U.LIZIZ("VideoImageMixedHelper@c682.deleteTempResizeImage$1");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$18(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("DraftSaveOpKt@48ea.saveFile$3");
        Boolean boolValueOf = Boolean.valueOf(C2286708xd.LJIJ((String) ((C259800zU) aCallableS411S0100000_3.l0).element));
        C1C7U.LIZIZ("DraftSaveOpKt@48ea.saveFile$3");
        return boolValueOf;
    }

    public static final Object call$19(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Runnable runnable = (Runnable) aCallableS411S0100000_3.l0;
        C1C7U.LIZ("BoltsUtils@fdc5.callInUi$1L");
        if (runnable == null) {
            C1C7U.LIZIZ("BoltsUtils@fdc5.callInUi$1L");
            return null;
        }
        runnable.run();
        C1C7U.LIZIZ("BoltsUtils@fdc5.callInUi$1L");
        return null;
    }

    public static final Object call$2(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("FileCacheManager@2eae.updateClean$1");
        Context context = (Context) aCallableS411S0100000_3.l0;
        if (context == null) {
            C1C7U.LIZIZ("FileCacheManager@2eae.updateClean$1");
            return null;
        }
        C810670Vr7.LIZJ(context, 0, "clean_storage_pref").edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
        C2426709f7.LIZ = false;
        C1C7U.LIZIZ("FileCacheManager@2eae.updateClean$1");
        return null;
    }

    public static final Object call$20(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Runnable runnable = (Runnable) aCallableS411S0100000_3.l0;
        C1C7U.LIZ("BoltsUtils@fdc5.callInBackground$1L");
        if (runnable == null) {
            C1C7U.LIZIZ("BoltsUtils@fdc5.callInBackground$1L");
            return null;
        }
        runnable.run();
        C1C7U.LIZIZ("BoltsUtils@fdc5.callInBackground$1L");
        return null;
    }

    public static final Object call$21(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Runnable runnable = (Runnable) aCallableS411S0100000_3.l0;
        C1C7U.LIZ("GifShareNew@9c1b.runTaskInMainThread$1L");
        runnable.run();
        C1C7U.LIZIZ("GifShareNew@9c1b.runTaskInMainThread$1L");
        return null;
    }

    public static final Object call$22(ACallableS411S0100000_3 aCallableS411S0100000_3) throws Throwable {
        long j;
        C1C7U.LIZ("CreativeDraftLogManager@1344.updateLog$1");
        C570230MYb.LIZ.getClass();
        File fileLIZJ = C570230MYb.LIZJ();
        String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), (DraftOperationEvent) aCallableS411S0100000_3.l0);
        if (fileLIZJ.length() > C0C64.LJIILLIIL().LJIJ(31744, 100, "studio_max_size_of_draft_log_file", true) * 1024) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new C0VSF(C570230MYb.LIZLLL()));
                j = 0;
                while (true) {
                    Throwable th = null;
                    try {
                        try {
                            if (bufferedReader.readLine() == null) {
                                break;
                            }
                            j++;
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C201955140j.LIZ(Log.getStackTraceString(e));
                        }
                    } finally {
                    }
                }
                C2107108Nh.LIZ(bufferedReader, null);
            } catch (Exception e2) {
                e = e2;
                j = 0;
            }
            long j2 = j / ((long) 2);
            C570230MYb.LIZ.getClass();
            int i = 0;
            C0VSJ c0vsjLJIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIL(C1445850njD.LIZ, C0MI0.LAST_PUBLISH_FAILED_LOG, "temp.json", false);
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileLIZJ, "rw");
            BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn(c0vsjLJIIL));
            randomAccessFile.seek(0L);
            for (String line = randomAccessFile.readLine(); line != null; line = randomAccessFile.readLine()) {
                i++;
                if (i > j2) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
            randomAccessFile.close();
            bufferedWriter.close();
            fileLIZJ.delete();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(json);
            sbLIZ.append('\n');
            C09BH.LIZJ(c0vsjLJIIL, C2188811AlT.LIZIZ(sbLIZ), Charsets.UTF_8);
            c0vsjLJIIL.renameTo(fileLIZJ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(json);
            sbLIZ2.append('\n');
            C09BH.LIZJ(fileLIZJ, C2188811AlT.LIZIZ(sbLIZ2), Charsets.UTF_8);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeDraftLogManager@1344.updateLog$1");
        return unit;
    }

    public static final Object call$23(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.resolveLocalAsset$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolver not supported ");
        sbLIZ.append((C535020Kya) aCallableS411S0100000_3.l0);
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.resolveLocalAsset$1");
        return runtimeException;
    }

    public static final Object call$24(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.resolveLocalAsset$resourceResolver$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolver not found ");
        sbLIZ.append((C535020Kya) aCallableS411S0100000_3.l0);
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.resolveLocalAsset$resourceResolver$1");
        return runtimeException;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.09c6] */
    public static final Object call$25(ACallableS411S0100000_3 aCallableS411S0100000_3) throws Exception {
        C1C7U.LIZ("JavaHeapDetectorInstaller@cebf.tryInstall$1");
        Application application = (Application) C786410Ut5.N3((Context) aCallableS411S0100000_3.l0);
        if (application != null) {
            try {
                C2405709bj.LIZ = application;
                C2408609cC.LIZ();
                C2406509br.LIZJ = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new C2406509br());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Context context = (Context) aCallableS411S0100000_3.l0;
        if (context != null) {
            if (C2407909c5.LIZ && C2407909c5.LIZIZ == null) {
                C2223208nO.LIZ("LocalMemDump", "registerReceiver");
                C2407909c5.LIZIZ = new BroadcastReceiver() { // from class: X.09c6
                    public final void LIZ(Intent intent) {
                        String stringExtra;
                        C2223208nO.LIZ("LocalMemDump", "onReceive");
                        if (intent != null && intent.getBooleanExtra("dump", false)) {
                            try {
                                stringExtra = intent.getStringExtra("channel");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                stringExtra = null;
                            }
                            if (!"chaos_hprof_test".equals(stringExtra)) {
                                return;
                            }
                            if (C2407909c5.LIZLLL) {
                                C2223208nO.LIZ("LocalMemDump", "is already period running");
                                return;
                            }
                            boolean booleanExtra = intent.getBooleanExtra("force", false);
                            boolean booleanExtra2 = intent.getBooleanExtra("thread", false);
                            boolean booleanExtra3 = intent.getBooleanExtra("speed", false);
                            int iMax = Math.max(intent.getIntExtra("timeout", 60), 30);
                            int intExtra = intent.getIntExtra("period", 0);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("received broadcast, dump hprof channel:");
                            sbLIZ.append(stringExtra);
                            sbLIZ.append(" speed:");
                            sbLIZ.append(booleanExtra3);
                            sbLIZ.append(" timeout:");
                            sbLIZ.append(iMax);
                            sbLIZ.append(" period:");
                            sbLIZ.append(intExtra);
                            C2223208nO.LIZ("LocalMemDump", C2188811AlT.LIZIZ(sbLIZ));
                            RunnableC2407709c3 runnableC2407709c3 = new RunnableC2407709c3(this, booleanExtra, booleanExtra2, iMax, booleanExtra3, stringExtra);
                            if (intExtra > 0) {
                                C2407909c5.LIZLLL = true;
                                int iMax2 = Math.max(intExtra, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("start peroid dump period:");
                                sbLIZ2.append(iMax2);
                                C2223208nO.LIZ("LocalMemDump", C2188811AlT.LIZIZ(sbLIZ2));
                                SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C2405709bj.LIZ, 0, "hprof_swift").edit();
                                editorEdit.putInt("local_period", iMax2);
                                editorEdit.apply();
                                long j = iMax2;
                                C2407909c5.LJ.scheduleWithFixedDelay(runnableC2407709c3, j, j, TimeUnit.SECONDS);
                                return;
                            }
                            runnableC2407709c3.run();
                        }
                    }

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        if (!C2214201BlK.LJIIJJI && intent != null) {
                            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                C2188191AkT.LIZIZ();
                            }
                        }
                        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            LIZ(intent);
                        } else {
                            C2408409cA.LIZ();
                            LIZ(intent);
                        }
                    }
                };
                C786410Ut5.LJIJJ(context, C2407909c5.LIZIZ, new IntentFilter("COM.TT.MEMO.LOCAL"));
                int i = C810670Vr7.LIZJ(C2405709bj.LIZ, 0, "hprof_swift").getInt("local_period", 0);
                if (i > 0) {
                    C2223208nO.LIZ("LocalMemDump", "coldBoot start period dump:" + i);
                    Intent intent = new Intent();
                    intent.setAction("COM.TT.MEMO.LOCAL");
                    intent.putExtra("dump", true);
                    intent.putExtra("channel", "chaos_hprof_test");
                    intent.putExtra("period", i);
                    C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1ijT845PLaEDhLZ7fU04lVK5cG54XiWaJaTvQ==", null));
                }
            }
        } else {
            boolean z = C2407909c5.LIZ;
        }
        C1C7U.LIZIZ("JavaHeapDetectorInstaller@cebf.tryInstall$1");
        return null;
    }

    public static final Object call$26(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("RxDisposableManager@a94e.submitRunnable$3");
        ((Runnable) aCallableS411S0100000_3.l0).run();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("RxDisposableManager@a94e.submitRunnable$3");
        return bool;
    }

    public static final Object call$27(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Object c098200Yq;
        C1C7U.LIZ("MemoryCheck@16fe.isAvailableMemLowerThan$1$1");
        try {
            c098200Yq = Long.valueOf(Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        long jLongValue = ((Number) c098200Yq).longValue();
        if (jLongValue > 0) {
            ((C08EY) aCallableS411S0100000_3.l0).LIZIZ = System.currentTimeMillis();
            ((C08EY) aCallableS411S0100000_3.l0).LIZJ = jLongValue;
        }
        Long lValueOf = Long.valueOf(((C08EY) aCallableS411S0100000_3.l0).LIZJ);
        C1C7U.LIZIZ("MemoryCheck@16fe.isAvailableMemLowerThan$1$1");
        return lValueOf;
    }

    public static final Object call$28(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        int iIntValue;
        C1C7U.LIZ("SeriesVoucherClaimViewModel@27e2.getMainColorAndSetBackground$1");
        Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7((Bitmap) aCallableS411S0100000_3.l0, null)).LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = -1;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        C1C7U.LIZIZ("SeriesVoucherClaimViewModel@27e2.getMainColorAndSetBackground$1");
        return numValueOf;
    }

    public static final Object call$29(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("ImageEditRootScene@a14e.buildPublishIntent$2");
        FileUtils.INSTANCE.removeFile(((VideoPublishEditModel) aCallableS411S0100000_3.l0).getVideoCoverPath());
        C0MH8 c0mh8 = C0MH8.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS411S0100000_3.l0;
        C0MH8.LJIILJJIL(c0mh8, videoPublishEditModel, videoPublishEditModel.getVideoCoverPath(), null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.buildPublishIntent$2");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS411S0100000_3 r7) throws java.lang.Throwable {
        /*
            java.lang.Object r3 = r7.l0
            X.0k4a r3 = (X.C1305340k4a) r3
            r3.getClass()
            java.lang.String r7 = "CpuInfoFetcher@9fab.fetch$1L"
            X.C1C7U.LIZ(r7)
            java.lang.String r4 = ""
            r6 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L7c
            X.0VSF r2 = new X.0VSF     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L7c
            X.0VSJ r1 = new X.0VSJ     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L7c
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L7c
            r2.<init>(r1)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L7c
            r5.<init>(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L7c
        L20:
            java.lang.String r1 = r5.readLine()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L79
            if (r1 == 0) goto L39
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.startsWith(r0)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L79
            if (r0 == 0) goto L20
            r4 = r1
            goto L39
        L30:
            r0 = move-exception
            goto L34
        L32:
            r0 = move-exception
            r5 = r6
        L34:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L41
        L39:
            r5.close()     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            int r0 = r4.length()
            if (r0 <= 0) goto L58
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r4.split(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L58
            r0 = 1
            r0 = r2[r0]
            java.lang.String r4 = r0.trim()
        L58:
            X.09Eu r2 = X.C2339809Eu.LIZJ()
            Y.ARunnableS17S1100000_12 r1 = new Y.ARunnableS17S1100000_12
            r0 = 0
            r1.<init>(r3, r4, r0)
            boolean r0 = r2.LIZ
            if (r0 == 0) goto L71
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r2.LIZJ
            if (r0 == 0) goto L6d
            X.C786410Ut5.LJJZZIII(r0, r1)
        L6d:
            X.C1C7U.LIZIZ(r7)
            return r6
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "LiveTaskManager: Must call init() before use."
            r1.<init>(r0)
            throw r1
        L79:
            r1 = move-exception
            r6 = r5
            goto L7d
        L7c:
            r1 = move-exception
        L7d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            if (r6 == 0) goto L8a
            r6.close()     // Catch: java.io.IOException -> L86
            throw r1
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS411S0100000_3.call$3(Y.ACallableS411S0100000_3):java.lang.Object");
    }

    public static final Object call$30(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("StickerBitmapResizeHelperKt@959a.deleteUploadPicStickerResizeImage$1");
        String strLIZLLL = C2347809Hw.LIZLLL((CreativeInfo) aCallableS411S0100000_3.l0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(File.separator);
        sbLIZ.append("PixelLoopResize.bmp");
        C2260008tK.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerBitmapResizeHelperKt@959a.deleteUploadPicStickerResizeImage$1");
        return unit;
    }

    public static final Object call$31(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("BridgeGeckoUpdateListener@90e1.onCheckServerVersionFail$1");
        ((C09ZM) aCallableS411S0100000_3.l0).LIZ.LJFF();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BridgeGeckoUpdateListener@90e1.onCheckServerVersionFail$1");
        return unit;
    }

    public static final Object call$32(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        List<String> list = (List) aCallableS411S0100000_3.l0;
        C1C7U.LIZ("MvThemeUtils@1e6a.saveMvThemePhoto$1L");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int[] iArrLIZJ = C2475309mx.LIZJ(str);
            if (iArrLIZJ != null) {
                arrayList.add(PhotoContext.fromUpload(str, iArrLIZJ[0], iArrLIZJ[1]));
            }
        }
        C1C7U.LIZIZ("MvThemeUtils@1e6a.saveMvThemePhoto$1L");
        return arrayList;
    }

    public static final Object call$33(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Unit unit;
        C1C7U.LIZ("FriendsTabKevaKt@9aa4.asyncCallWhenOnMain$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
            unit = Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("PerfExt", "asyncCall error", th);
            unit = null;
        }
        C1C7U.LIZIZ("FriendsTabKevaKt@9aa4.asyncCallWhenOnMain$1");
        return unit;
    }

    public static final Object call$34(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("WidgetThreadExtKt@4825.postMain$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("Extends", "mainCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WidgetThreadExtKt@4825.postMain$1");
        return unit;
    }

    public static final Object call$35(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("WidgetThreadExtKt@4825.serialCall$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("PerfExt", "serialCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WidgetThreadExtKt@4825.serialCall$1");
        return unit;
    }

    public static final Object call$36(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("PerfExtKt@17a.asyncCall$2");
        try {
            Object objInvoke = ((Function0) aCallableS411S0100000_3.l0).invoke();
            C1C7U.LIZIZ("PerfExtKt@17a.asyncCall$2");
            return objInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("PerfExt", "asyncCall error", th);
            C1C7U.LIZIZ("PerfExtKt@17a.asyncCall$2");
            return null;
        }
    }

    public static final Object call$37(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("PerfExtKt@17a.postMain$1");
        try {
            ((Function0) aCallableS411S0100000_3.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("Extends", "mainCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PerfExtKt@17a.postMain$1");
        return unit;
    }

    public static final Object call$38(ACallableS411S0100000_3 aCallableS411S0100000_3) throws Throwable {
        Throwable th = (Throwable) aCallableS411S0100000_3.l0;
        if (th instanceof Exception) {
            throw th;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeModel.fetchListRx: ");
        sbLIZ.append(th.getMessage());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object call$39(ACallableS411S0100000_3 aCallableS411S0100000_3) throws Throwable {
        Throwable th = (Throwable) aCallableS411S0100000_3.l0;
        if (th instanceof Exception) {
            throw th;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeModel.fetchListRx: ");
        sbLIZ.append(th.getMessage());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object call$4(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        Function0 function0 = (Function0) aCallableS411S0100000_3.l0;
        C1C7U.LIZ("TTLivePlayer2@b012.executeWithThreadTimeOut$1L");
        Process.setThreadPriority(-20);
        function0.invoke();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("TTLivePlayer2@b012.executeWithThreadTimeOut$1L");
        return bool;
    }

    public static final Object call$40(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("ExtractMusicController@63e0.loadVideoInfoToCache$1");
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(((TikTokMediaModel) aCallableS411S0100000_3.l0).LJFF());
        C1C7U.LIZIZ("ExtractMusicController@63e0.loadVideoInfoToCache$1");
        return videoFileInfo;
    }

    public static final Object call$5(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        final C1286680jaU c1286680jaU = (C1286680jaU) aCallableS411S0100000_3.l0;
        c1286680jaU.getClass();
        C1C7U.LIZ("LivePlayerLog@554c.markStart$1L");
        final float fLIZ = C1469770oLn.LIZ() / 1024.0f;
        C2339809Eu c2339809EuLIZJ = C2339809Eu.LIZJ();
        Runnable runnable = new Runnable() { // from class: X.09Ex
            @Override // java.lang.Runnable
            public final void run() {
                C1286680jaU c1286680jaU2 = c1286680jaU;
                float f = fLIZ;
                c1286680jaU2.getClass();
                C1C7U.LIZ("LivePlayerLog@554c.markStart$1L$1L");
                if (!c1286680jaU2.LIZ || f < 0.0f) {
                    C1C7U.LIZIZ("LivePlayerLog@554c.markStart$1L$1L");
                } else {
                    c1286680jaU2.getClass();
                    C1C7U.LIZIZ("LivePlayerLog@554c.markStart$1L$1L");
                }
            }
        };
        if (c2339809EuLIZJ.LIZ) {
            BPEAHandler bPEAHandler = c2339809EuLIZJ.LIZJ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, runnable);
            }
            C1C7U.LIZIZ("LivePlayerLog@554c.markStart$1L");
            return null;
        }
        throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
    }

    public static final Object call$6(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("IMStickerFetchUtil@7966.runOnBackgroundThread$1");
        ((Function0) aCallableS411S0100000_3.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMStickerFetchUtil@7966.runOnBackgroundThread$1");
        return unit;
    }

    public static final Object call$7(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("CompatJobService@3e1c.onStartJob$3");
        CompatJobService compatJobService = (CompatJobService) aCallableS411S0100000_3.l0;
        C793770VBv.LIZJ("disk_auto_clean_monitor");
        C2426709f7.LIZIZ(compatJobService);
        C1C7U.LIZIZ("CompatJobService@3e1c.onStartJob$3");
        return null;
    }

    public static final Object call$8(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("JobService@7491.onCreate$3");
        JobService jobService = (JobService) aCallableS411S0100000_3.l0;
        C793770VBv.LIZJ("disk_auto_clean_monitor");
        C2426709f7.LIZIZ(jobService);
        C1C7U.LIZIZ("JobService@7491.onCreate$3");
        return null;
    }

    public static final Object call$9(ACallableS411S0100000_3 aCallableS411S0100000_3) {
        C1C7U.LIZ("LynxView@80d.dispatchDraw$1");
        HashMap map = new HashMap();
        ((LynxView) aCallableS411S0100000_3.l0).putPendingPipelineIdsToMap(map);
        C1C7U.LIZIZ("LynxView@80d.dispatchDraw$1");
        return map;
    }

    public ACallableS411S0100000_3(Context context, int i) {
        this.$t = i;
        switch (i) {
            case 1:
            case 2:
            case 25:
                this.l0 = context;
                break;
            default:
                this.l0 = context;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS411S0100000_3(List list, List<? extends MediaModel> list2) {
        this.$t = list2;
        if (16 - list2 != 0) {
            this.l0 = list;
        } else {
            this.l0 = list;
        }
    }

    public ACallableS411S0100000_3(Function0 function0, int i) {
        this.$t = i;
        if (4 - i != 0) {
            this.l0 = function0;
        } else {
            this.l0 = function0;
        }
    }

    public ACallableS411S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ACallableS411S0100000_3(Runnable runnable, String str, int i) {
        this.$t = i;
        this.l0 = runnable;
    }
}
