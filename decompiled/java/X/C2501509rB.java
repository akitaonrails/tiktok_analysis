package X;

import Y.ACallableS411S0100000_3;
import Y.ARunnableS103S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.aweme.storage.CompatJobService;
import com.aweme.storage.JobService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.ss.android.ugc.aweme.effect.EffectJobService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501509rB implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            case 14:
                return then$14(this, c15o7);
            case 15:
                return then$15(this, c15o7);
            case 16:
                return then$16(this, c15o7);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return then$17(this, c15o7);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return then$18(this, c15o7);
            case 19:
                return then$19(this, c15o7);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return then$20(this, c15o7);
            case 21:
                return then$21(this, c15o7);
            case 22:
                return then$22(this, c15o7);
            case 23:
                return then$23(this, c15o7);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return then$24(this, c15o7);
            case 25:
                return then$25(this, c15o7);
            case 26:
                return then$26(this, c15o7);
            default:
                return null;
        }
    }

    public C2501509rB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("CompatJobService@3e1c.onStartJob$2");
        CompatJobService compatJobService = (CompatJobService) c2501509rB.l0;
        if (compatJobService != null) {
            C15O7.LIZIZ(new ACallableS411S0100000_3(C786410Ut5.N3(compatJobService), 2), C823050WQl.LIZLLL(), null);
        }
        C1C7U.LIZIZ("CompatJobService@3e1c.onStartJob$2");
        return null;
    }

    public static final Object then$1(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("JobService@7491.onCreate$1");
        C2426709f7.LIZ = false;
        C2426709f7.LIZIZ = false;
        C2426709f7.LIZJ = false;
        ((JobService) c2501509rB.l0).stopSelf();
        C1C7U.LIZIZ("JobService@7491.onCreate$1");
        return null;
    }

    public static final Object then$10(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("EditRootScene@37d3.runTaskAfterExtract$2");
        ((Runnable) c2501509rB.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditRootScene@37d3.runTaskAfterExtract$2");
        return unit;
    }

    public static final Object then$11(C2501509rB c2501509rB, C15O7 c15o7) {
        Unit unit;
        C1C7U.LIZ("EffectTextMgr@68cf.compile$2");
        Function0 function0 = (Function0) c2501509rB.l0;
        if (function0 != null) {
            function0.invoke();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("EffectTextMgr@68cf.compile$2");
        return unit;
    }

    public static final Object then$12(C2501509rB c2501509rB, C15O7 c15o7) {
        NetWorkStateReceiver netWorkStateReceiver = (NetWorkStateReceiver) c2501509rB.l0;
        netWorkStateReceiver.getClass();
        C1C7U.LIZ("NetWorkStateReceiver@83ed.com_ss_android_ugc_aweme_common_net_NetWorkStateReceiver__onReceive$___twin___$2L");
        if (!netWorkStateReceiver.LIZIZ || NetWorkStateReceiver.LIZJ) {
            C1440005kM.LIZ(new IEvent() { // from class: X.09ce
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        } else {
            C1440005kM.LIZ(new IEvent() { // from class: X.09ce
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
        C1C7U.LIZIZ("NetWorkStateReceiver@83ed.com_ss_android_ugc_aweme_common_net_NetWorkStateReceiver__onReceive$___twin___$2L");
        return null;
    }

    public static final Object then$13(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverWithCoverText$2");
        C214848196g c214848196g = (C214848196g) c2501509rB.l0;
        c214848196g.LJIILJJIL(c214848196g.LIZ, (Bitmap) c15o7.LJIIL(), false, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$2");
        return unit;
    }

    public static final Object then$14(C2501509rB c2501509rB, C15O7 c15o7) {
        C1BLC c1blc = (C1BLC) c2501509rB.l0;
        C1C7U.LIZ("DFDownloader@b801.download$2L");
        if (!c15o7.LJIILL()) {
            C1C7U.LIZIZ("DFDownloader@b801.download$2L");
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error while start downloading ");
        sbLIZ.append(c1blc.LIZ);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), c15o7.LJIIJJI());
    }

    public static final Object then$15(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("SocialEditRootScene@8880.runTaskAfterExtract$2");
        ((Runnable) c2501509rB.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialEditRootScene@8880.runTaskAfterExtract$2");
        return unit;
    }

    public static final Object then$16(C2501509rB c2501509rB, C15O7 c15o7) {
        Context context = (Context) c2501509rB.l0;
        C1C7U.LIZ("SSWebSettings@8c2a.processSaveImage$1$saveImage$2L");
        if (((Boolean) c15o7.LJIIL()).booleanValue()) {
            C786410Ut5.re(Toast.makeText(context, 2131850442, 1));
        }
        C1C7U.LIZIZ("SSWebSettings@8c2a.processSaveImage$1$saveImage$2L");
        return null;
    }

    public static final Object then$17(C2501509rB c2501509rB, C15O7 c15o7) {
        Object objValueOf;
        C1C7U.LIZ("ApiExtKt@a0c9.taskToObservable$1$1");
        if (!c15o7.LJIILL() && c15o7.LJIILJJIL()) {
            ((C09AJ) c2501509rB.l0).onNext(c15o7.LJIIL());
            objValueOf = Unit.LIZ;
        } else {
            objValueOf = Boolean.valueOf(((C09AJ) c2501509rB.l0).tryOnError(c15o7.LJIIJJI()));
        }
        C1C7U.LIZIZ("ApiExtKt@a0c9.taskToObservable$1$1");
        return objValueOf;
    }

    public static final Object then$18(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("PromoteReplaceMusicMethod@58f2.handle$1");
        Integer num = (Integer) c15o7.LJIIL();
        if (num != null && num.intValue() == 1) {
            CompletionBlock completionBlock = (CompletionBlock) c2501509rB.l0;
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C09VB.class, null);
            C09VB c09vb = (C09VB) xBaseModelLIZJ;
            c09vb.setCode(1);
            c09vb.setMsg("replaceDirectInPromoteScene success");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            CompletionBlock completionBlock2 = (CompletionBlock) c2501509rB.l0;
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C09VB.class, null);
            C09VB c09vb2 = (C09VB) xBaseModelLIZJ2;
            c09vb2.setCode(0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceDirectInPromoteScene failed ");
            sbLIZ.append(c15o7.LJIIL());
            c09vb2.setMsg(C2188811AlT.LIZIZ(sbLIZ));
            completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PromoteReplaceMusicMethod@58f2.handle$1");
        return unit;
    }

    public static final Object then$19(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("PerfExtKt@17a.asyncCall$3");
        ((Function1) c2501509rB.l0).invoke(c15o7.LJIIL());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PerfExtKt@17a.asyncCall$3");
        return unit;
    }

    public static final Object then$2(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("JobService@7491.onCreate$2");
        JobService jobService = (JobService) c2501509rB.l0;
        if (jobService != null) {
            C15O7.LIZIZ(new ACallableS411S0100000_3(C786410Ut5.N3(jobService), 2), C823050WQl.LIZLLL(), null);
        }
        C1C7U.LIZIZ("JobService@7491.onCreate$2");
        return null;
    }

    public static final Object then$20(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("PrefetchNetworkExecutor@3761.get$2");
        C2188408hm c2188408hm = (C2188408hm) c15o7.LJIIL();
        if (c2188408hm.LIZ) {
            InterfaceC2373409Rs interfaceC2373409Rs = (InterfaceC2373409Rs) c2501509rB.l0;
            C20109213mE c20109213mE = new C20109213mE();
            c20109213mE.LIZ = c2188408hm.LIZIZ;
            c20109213mE.LIZJ = new HashMap();
            interfaceC2373409Rs.LIZ(c20109213mE);
        } else {
            ((InterfaceC2373409Rs) c2501509rB.l0).LIZIZ(c2188408hm.LIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PrefetchNetworkExecutor@3761.get$2");
        return unit;
    }

    public static final Object then$21(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("PrefetchNetworkExecutor@3761.post$2");
        C2188408hm c2188408hm = (C2188408hm) c15o7.LJIIL();
        if (c2188408hm.LIZ) {
            InterfaceC2373409Rs interfaceC2373409Rs = (InterfaceC2373409Rs) c2501509rB.l0;
            C20109213mE c20109213mE = new C20109213mE();
            c20109213mE.LIZ = c2188408hm.LIZIZ;
            c20109213mE.LIZJ = new HashMap();
            interfaceC2373409Rs.LIZ(c20109213mE);
        } else {
            ((InterfaceC2373409Rs) c2501509rB.l0).LIZIZ(c2188408hm.LIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PrefetchNetworkExecutor@3761.post$2");
        return unit;
    }

    public static final Object then$22(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("Hpas2svDialog$Companion@dce1.onMainActivityCreate$1");
        if (Intrinsics.LJFF(c15o7.LJIIL(), Boolean.FALSE)) {
            C2487409ou.LIZJ(new ARunnableS103S0100000_3((Activity) c2501509rB.l0, 157));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Hpas2svDialog$Companion@dce1.onMainActivityCreate$1");
        return unit;
    }

    public static final Object then$23(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("AISuggestedQueryManager@ba11.getAISuggestedQueries$1$1");
        if (!c15o7.LJIILL() && c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
            C09AJ c09aj = (C09AJ) c2501509rB.l0;
            Object objLJIIL = c15o7.LJIIL();
            if (objLJIIL == null) {
                objLJIIL = C13BV.INSTANCE;
            }
            c09aj.onNext(objLJIIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AISuggestedQueryManager@ba11.getAISuggestedQueries$1$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$24(C2501509rB c2501509rB, C15O7 c15o7) throws Exception {
        String str;
        C2175508fh c2175508fh;
        C1C7U.LIZ("RequestIdSensitiveTTBoltsCallAdapterFactory$DelegateCallAdapter@1c27.adapt$1");
        if (!c15o7.LJIILIIL()) {
            if (!c15o7.LJIILL()) {
                C0X52 c0x52 = (C0X52) c15o7.LJIIL();
                T t = ((C0X52) c15o7.LJIIL()).LIZIZ;
                if (t instanceof BaseResponse) {
                    BaseResponse baseResponse = (BaseResponse) t;
                    if (c0x52.LIZ != null) {
                        if (((Number) C09UX.LIZ.getValue()).intValue() == 1) {
                            C846790XJt.LIZIZ(baseResponse.status_code, baseResponse, c0x52.LIZ.LIZ);
                        } else {
                            C846790XJt.LIZ(baseResponse.status_code, c0x52.LIZ.LIZ, baseResponse.toString());
                        }
                    }
                }
                if ((t instanceof InterfaceC1201180hMa) && (c2175508fh = c0x52.LIZ) != null) {
                    Object obj = c2175508fh.LJFF;
                    if (obj instanceof C1494600ozq) {
                        ((InterfaceC1201180hMa) t).setRequestInfo((C1494600ozq) obj);
                    }
                }
                if (t instanceof C0X12) {
                    C0X12 c0x12 = (C0X12) t;
                    C09SI c09si = (C09SI) c2501509rB.l0;
                    List<C080U> list = c0x52.LIZ.LIZLLL;
                    c09si.getClass();
                    if (list != null) {
                        for (C080U c080u : list) {
                            if ("X-TT-LOGID".equalsIgnoreCase(c080u.LIZ)) {
                                str = c080u.LIZIZ;
                                break;
                            }
                        }
                        str = null;
                        c0x12.setRequestId(str);
                    } else {
                        str = null;
                        c0x12.setRequestId(str);
                    }
                }
                C1C7U.LIZIZ("RequestIdSensitiveTTBoltsCallAdapterFactory$DelegateCallAdapter@1c27.adapt$1");
                return t;
            }
            throw c15o7.LJIIJJI();
        }
        throw new CancellationException();
    }

    public static final Object then$25(C2501509rB c2501509rB, C15O7 c15o7) {
        CharSequence charSequence;
        C1C7U.LIZ("EmoteCropView@bc6e.startCrop$2");
        if (c15o7.LJIILJJIL() && (charSequence = (CharSequence) ((Pair) c15o7.LJIIL()).getFirst()) != null && charSequence.length() != 0) {
            ((Function2) c2501509rB.l0).invoke(((Pair) c15o7.LJIIL()).getFirst(), 0);
        } else if (c15o7.LJIILJJIL()) {
            C766270U4b.LIZLLL(((Number) ((Pair) c15o7.LJIIL()).getSecond()).intValue());
        } else {
            C766270U4b.LIZLLL(2131851936);
        }
        C1C7U.LIZIZ("EmoteCropView@bc6e.startCrop$2");
        return null;
    }

    public static final Object then$26(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("ExtractMusicController@63e0.loadVideoInfoToCache$2");
        if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
            C2355609Kw.INSTANCE.put(((TikTokMediaModel) c2501509rB.l0).LJFF(), c15o7.LJIIL());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExtractMusicController@63e0.loadVideoInfoToCache$2");
        return unit;
    }

    public static final Object then$3(C2501509rB c2501509rB, C15O7 c15o7) {
        CharSequence charSequence;
        C1C7U.LIZ("CropView@a214.startCrop$2");
        if (c15o7.LJIILJJIL() && (charSequence = (CharSequence) ((Pair) c15o7.LJIIL()).getFirst()) != null && charSequence.length() != 0) {
            ((Function1) c2501509rB.l0).invoke(((Pair) c15o7.LJIIL()).getFirst());
        } else if (c15o7.LJIILJJIL()) {
            C766270U4b.LIZLLL(((Number) ((Pair) c15o7.LJIIL()).getSecond()).intValue());
        } else {
            C766270U4b.LIZLLL(2131851936);
        }
        C1C7U.LIZIZ("CropView@a214.startCrop$2");
        return null;
    }

    public static final Object then$4(C2501509rB c2501509rB, C15O7 c15o7) {
        EffectJobService effectJobService = (EffectJobService) c2501509rB.l0;
        effectJobService.getClass();
        C1C7U.LIZ("EffectJobService@b067.onCreate$2L");
        InterfaceC1594010raB interfaceC1594010raB = (InterfaceC1594010raB) C2419309dv.LIZ(effectJobService, InterfaceC1594010raB.class);
        interfaceC1594010raB.LIZ();
        interfaceC1594010raB.LIZJ(System.currentTimeMillis());
        effectJobService.stopSelf();
        C1C7U.LIZIZ("EffectJobService@b067.onCreate$2L");
        return null;
    }

    public static final Object then$5(C2501509rB c2501509rB, C15O7 c15o7) {
        Object objValueOf;
        C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.taskToObservable$1$1");
        if (!c15o7.LJIILL() && c15o7.LJIILJJIL()) {
            ((C09AJ) c2501509rB.l0).onNext(c15o7.LJIIL());
            objValueOf = Unit.LIZ;
        } else {
            objValueOf = Boolean.valueOf(((C09AJ) c2501509rB.l0).tryOnError(c15o7.LJIIJJI()));
        }
        C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.taskToObservable$1$1");
        return objValueOf;
    }

    public static final Object then$6(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("VideoImageMixedController@1fe.loadVideoInfoToCache$2");
        if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
            C2355609Kw c2355609Kw = C2355609Kw.INSTANCE;
            String strLJFF = ((TikTokMediaModel) c2501509rB.l0).LJFF();
            Object objLJIIL = c15o7.LJIIL();
            if (objLJIIL != null) {
                c2355609Kw.put(strLJFF, objLJIIL);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedController@1fe.loadVideoInfoToCache$2");
        return unit;
    }

    public static final Object then$7(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("VideoImageMixedHelper@c682.check4KVideo$2");
        if (c15o7 != null && c15o7.LJIIL() != null) {
            InterfaceC2471609mM interfaceC2471609mM = (InterfaceC2471609mM) c2501509rB.l0;
            if (interfaceC2471609mM != null) {
                c15o7.LJIIL();
                interfaceC2471609mM.LIZ(true);
            }
        } else {
            InterfaceC2471609mM interfaceC2471609mM2 = (InterfaceC2471609mM) c2501509rB.l0;
            if (interfaceC2471609mM2 != null) {
                interfaceC2471609mM2.LIZ(false);
            }
        }
        C1C7U.LIZIZ("VideoImageMixedHelper@c682.check4KVideo$2");
        return null;
    }

    public static final Object then$8(C2501509rB c2501509rB, C15O7 c15o7) {
        C1C7U.LIZ("VideoImageMixedHelper@c682.resizeSelectImage$2");
        InterfaceC2358509Lz interfaceC2358509Lz = (InterfaceC2358509Lz) c2501509rB.l0;
        if (interfaceC2358509Lz != null) {
            interfaceC2358509Lz.LIZ();
        }
        C1C7U.LIZIZ("VideoImageMixedHelper@c682.resizeSelectImage$2");
        return null;
    }

    public static final Object then$9(C2501509rB c2501509rB, C15O7 c15o7) {
        Unit unit;
        C1C7U.LIZ("PublishPageUtils@13bc.fileToBitmap$2");
        Function1 function1 = (Function1) c2501509rB.l0;
        if (function1 != null) {
            function1.invoke(c15o7.LJIIL());
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("PublishPageUtils@13bc.fileToBitmap$2");
        return unit;
    }
}
