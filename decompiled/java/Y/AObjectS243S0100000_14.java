package Y;

import X.AbstractC855580XhM;
import X.AbstractC856710XjB;
import X.AnonymousClass1941;
import X.C07PW;
import X.C0C64;
import X.C0CHQ;
import X.C0FPS;
import X.C0PEM;
import X.C1428470nHB;
import X.C1442850neN;
import X.C1455260nyO;
import X.C1459970o5z;
import X.C1459980o60;
import X.C1647390syH;
import X.C21378018lO;
import X.C2296808zG;
import X.C23250099c;
import X.C298660BnE;
import X.C298680BnG;
import X.C306450Bzn;
import X.C345250DgB;
import X.C350901Xv;
import X.C353150Dsv;
import X.C786410Ut5;
import X.C817503Hh;
import X.C855010XgR;
import X.C856820XjM;
import X.C856830XjN;
import X.C858910Xmj;
import X.C861450Xqp;
import X.C895680ZBu;
import X.C907110ZiH;
import X.C907140ZiK;
import X.InterfaceC1414530muh;
import X.InterfaceC1441305kZ;
import X.InterfaceC855180Xgi;
import X.InterfaceC855710XhZ;
import X.InterfaceC856590Xiz;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVMixFeedService;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.IPermissionAction;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import oyl.d0;

/* JADX INFO: loaded from: classes15.dex */
public class AObjectS243S0100000_14 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
        }
    }

    public AObjectS243S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        boolean z;
        final Integer num = (Integer) obj;
        boolean z2 = false;
        if (num != null && num.intValue() == 4) {
            if (C298680BnG.LIZ()) {
                ((AnonymousClass1941) aObjectS243S0100000_14.l0).k5().isPrivate = num.intValue();
            }
            ((AnonymousClass1941) aObjectS243S0100000_14.l0).k5().creativeModel.privacySettingModel.isSubscribeOnly = true;
        } else {
            ((AnonymousClass1941) aObjectS243S0100000_14.l0).k5().isPrivate = num.intValue();
            ((AnonymousClass1941) aObjectS243S0100000_14.l0).k5().creativeModel.privacySettingModel.isSubscribeOnly = false;
        }
        if (((AnonymousClass1941) aObjectS243S0100000_14.l0).T4().getUpdateAnchor().getValue() != null) {
            ExtensionDataRepo extensionDataRepoT4 = ((AnonymousClass1941) aObjectS243S0100000_14.l0).T4();
            final AnonymousClass1941 anonymousClass1941 = (AnonymousClass1941) aObjectS243S0100000_14.l0;
            extensionDataRepoT4.setIPermissionAction(new IPermissionAction() { // from class: X.0Xiy
                @Override // com.ss.android.ugc.aweme.services.publish.IPermissionAction
                public final void cancel() {
                    AnonymousClass1941 anonymousClass19412 = anonymousClass1941;
                    anonymousClass19412.LLIZ.setValue(Integer.valueOf(anonymousClass19412.hu0()));
                }

                @Override // com.ss.android.ugc.aweme.services.publish.IPermissionAction
                public final void confirm() {
                    Integer num2 = num;
                    if (num2 == null || num2.intValue() != 1) {
                        anonymousClass1941.T4().getI18nPrivacy().setValue(Boolean.TRUE);
                    } else {
                        anonymousClass1941.T4().getI18nPrivacy().setValue(Boolean.FALSE);
                        anonymousClass1941.T4().getUpdateAnchor().setValue(null);
                    }
                    anonymousClass1941.H5(num.intValue());
                }
            });
            Function1<Integer, Boolean> showPermissionAction = ((AnonymousClass1941) aObjectS243S0100000_14.l0).T4().getShowPermissionAction();
            if (showPermissionAction != null) {
                AnonymousClass1941 anonymousClass19412 = (AnonymousClass1941) aObjectS243S0100000_14.l0;
                if (!showPermissionAction.invoke(num).booleanValue()) {
                    if (num.intValue() != 1) {
                        anonymousClass19412.T4().getI18nPrivacy().setValue(Boolean.TRUE);
                    } else {
                        anonymousClass19412.T4().getI18nPrivacy().setValue(Boolean.FALSE);
                    }
                    anonymousClass19412.H5(num.intValue());
                }
            } else {
                ((AnonymousClass1941) aObjectS243S0100000_14.l0).H5(num.intValue());
            }
        } else {
            MutableLiveData<Boolean> i18nPrivacy = ((AnonymousClass1941) aObjectS243S0100000_14.l0).T4().getI18nPrivacy();
            if (num.intValue() != 1) {
                z = true;
            } else {
                z = false;
            }
            i18nPrivacy.setValue(Boolean.valueOf(z));
            ((AnonymousClass1941) aObjectS243S0100000_14.l0).H5(num.intValue());
        }
        if (((IAVMixFeedService) ServiceManager.get().getService(IAVMixFeedService.class)).needShowAddOrRemoveButton()) {
            if (num.intValue() == 0 || (num.intValue() == 4 && C298660BnE.LIZ())) {
                z2 = true;
            }
            InterfaceC856590Xiz interfaceC856590XizO4 = ((AnonymousClass1941) aObjectS243S0100000_14.l0).O4();
            if (interfaceC856590XizO4 != null) {
                interfaceC856590XizO4.setEnable(z2);
            }
        }
        if (num.intValue() == 4) {
            ((AnonymousClass1941) aObjectS243S0100000_14.l0).t5().LJFF();
        }
        ((AnonymousClass1941) aObjectS243S0100000_14.l0).k5().creativeModel.transientPostPageModel.LJIILLIIL = num.intValue();
        AbstractC855580XhM abstractC855580XhMC5 = ((AnonymousClass1941) aObjectS243S0100000_14.l0).C5();
        if (abstractC855580XhMC5 != null) {
            int iIntValue = num.intValue();
            InterfaceC855710XhZ interfaceC855710XhZ = abstractC855580XhMC5.LIZ;
            if (interfaceC855710XhZ != null) {
                ((C855010XgR) interfaceC855710XhZ).LIZ.LIZJ(iIntValue);
            }
        }
        if (C350901Xv.LIZ()) {
            ((AnonymousClass1941) aObjectS243S0100000_14.l0).k5().stopCache();
        }
    }

    public static final void onChanged$1(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        InterfaceC855180Xgi interfaceC855180Xgi;
        C07PW c07pw;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS243S0100000_14.l0;
        Boolean bool = (Boolean) obj;
        videoPublishContainerScene.getClass();
        if (bool.booleanValue() && (c07pw = videoPublishContainerScene.LLLLLJLJLL) != null) {
            Iterator it2 = ((List) c07pw.LIZIZ.getValue()).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    next.getClass();
                    do {
                        it2.next().getClass();
                    } while (it2.hasNext());
                }
                if (next != null) {
                    throw null;
                }
            }
            ((List) c07pw.LIZIZ.getValue()).clear();
        }
        if (bool.booleanValue() && (interfaceC855180Xgi = videoPublishContainerScene.LLJLIL) != null) {
            interfaceC855180Xgi.Lj1();
        }
    }

    public static final void onChanged$10(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        ((C1459970o5z) aObjectS243S0100000_14.l0).LLLLLLZZ();
    }

    public static final void onChanged$11(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        VideoEditContainerScene videoEditContainerScene;
        Scene scene = ((C1455260nyO) aObjectS243S0100000_14.l0).mParentScene;
        if ((scene instanceof VideoEditContainerScene) && (videoEditContainerScene = (VideoEditContainerScene) scene) != null) {
            videoEditContainerScene.LLLLLLZZ();
        }
    }

    public static final void onChanged$12(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        ((C1459980o60) aObjectS243S0100000_14.l0).LJI();
    }

    public static final void onChanged$13(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        ((C1459980o60) aObjectS243S0100000_14.l0).LJI();
    }

    public static final void onChanged$14(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        ((C1459980o60) aObjectS243S0100000_14.l0).LJI();
    }

    public static final void onChanged$2(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C858910Xmj((C1442850neN) aObjectS243S0100000_14.l0, null), 3);
    }

    public static final void onChanged$3(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C907140ZiK) aObjectS243S0100000_14.l0).IC0();
        }
    }

    public static final void onChanged$4(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C907140ZiK) aObjectS243S0100000_14.l0), null, null, new C861450Xqp((C907140ZiK) aObjectS243S0100000_14.l0, (C1647390syH) obj, null), 3);
    }

    public static final void onChanged$5(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        String strValueOf;
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ((C907110ZiH) aObjectS243S0100000_14.l0).z4();
            ((C907110ZiH) aObjectS243S0100000_14.l0).LLJJ = C856830XjN.LIZIZ;
            boolean z = false;
            boolean z2 = Keva.getRepo("copyright_auto_check").getBoolean(C0CHQ.LIZ().getAccountService().getCurrentUserID(), false);
            if (((C907110ZiH) aObjectS243S0100000_14.l0).H3() && !C1428470nHB.LJIIZILJ(((C907110ZiH) aObjectS243S0100000_14.l0).i3())) {
                C856820XjM c856820XjM = C856820XjM.LIZ;
                C907110ZiH c907110ZiH = (C907110ZiH) aObjectS243S0100000_14.l0;
                AbstractC856710XjB abstractC856710XjB = c907110ZiH.LLJJJ;
                VideoPublishEditModel videoPublishEditModelI3 = c907110ZiH.i3();
                c856820XjM.getClass();
                if (abstractC856710XjB != null) {
                    IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                    if (abstractC856710XjB.LIZ() == C0FPS.ECOMMERCE.getScene()) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    String creationId = videoPublishEditModelI3.getCreationId();
                    String str = videoPublishEditModelI3.mShootWay;
                    if (videoPublishEditModelI3.getDraftId() > 0) {
                        strValueOf = String.valueOf(videoPublishEditModelI3.getDraftId());
                    } else {
                        strValueOf = null;
                    }
                    iECommerceAnchorService.LJJJLL(creationId, boolValueOf, str, strValueOf, C1428470nHB.LJIILL(videoPublishEditModelI3), C1428470nHB.LJIILIIL(videoPublishEditModelI3), videoPublishEditModelI3.getMusicId());
                }
                C907110ZiH c907110ZiH2 = (C907110ZiH) aObjectS243S0100000_14.l0;
                if (!c907110ZiH2.LLJJ && z2) {
                    c907110ZiH2.o4(new AwS558S0100000_14(c907110ZiH2, 1171));
                    return;
                }
                c907110ZiH2.H4();
                C907110ZiH c907110ZiH3 = (C907110ZiH) aObjectS243S0100000_14.l0;
                if (!c907110ZiH3.LLJJ) {
                    if (c907110ZiH3.m3() != null) {
                        C21378018lO c21378018lOM3 = ((C907110ZiH) aObjectS243S0100000_14.l0).m3();
                        if (c21378018lOM3 != null) {
                            c21378018lOM3.UM2(new C345250DgB("AudioCopyrightUpdateCheckTask", new AwS549S0100000_5((C907110ZiH) aObjectS243S0100000_14.l0, 157), AFwS248S0000000_14.get$arr$(348)));
                        }
                    } else {
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C353150Dsv((C907110ZiH) aObjectS243S0100000_14.l0, null), 2);
                    }
                }
                C856830XjN.LIZLLL();
                C907110ZiH c907110ZiH4 = (C907110ZiH) aObjectS243S0100000_14.l0;
                C856820XjM.LIZ(c907110ZiH4.LLJJJ, c907110ZiH4.i3(), 2);
            }
        }
    }

    public static final void onChanged$6(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        ((C907110ZiH) aObjectS243S0100000_14.l0).LLJJIII = ((Boolean) obj).booleanValue();
        C895680ZBu c895680ZBu = C895680ZBu.LIZ;
        String creationId = ((C907110ZiH) aObjectS243S0100000_14.l0).i3().getCreationId();
        int iC3 = ((C907110ZiH) aObjectS243S0100000_14.l0).c3();
        c895680ZBu.getClass();
        C895680ZBu.LIZIZ(iC3, creationId);
        ((C907110ZiH) aObjectS243S0100000_14.l0).F4();
    }

    public static final void onChanged$7(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        InterfaceC1414530muh interfaceC1414530muh;
        if (!C306450Bzn.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "tudio_mix_material_forbid_transcode_audio_frequency", true, false) && (interfaceC1414530muh = ((C907110ZiH) aObjectS243S0100000_14.l0).LLJI) != null && interfaceC1414530muh.LJLILLLLZI()) {
            return;
        }
        if (((C907110ZiH) aObjectS243S0100000_14.l0).Q3()) {
            ((C907110ZiH) aObjectS243S0100000_14.l0).H4();
            return;
        }
        ((C907110ZiH) aObjectS243S0100000_14.l0).i3().creativeModel.audioCopyrightDetectModel.setDetectResults(null);
        C907110ZiH c907110ZiH = (C907110ZiH) aObjectS243S0100000_14.l0;
        c907110ZiH.LLJJIJIIJIL = c907110ZiH.c3();
        C895680ZBu c895680ZBu = C895680ZBu.LIZ;
        String creationId = ((C907110ZiH) aObjectS243S0100000_14.l0).i3().getCreationId();
        int i = ((C907110ZiH) aObjectS243S0100000_14.l0).LLJJIJIIJIL;
        c895680ZBu.getClass();
        C895680ZBu.LIZIZ(i, creationId);
    }

    public static final void onChanged$8(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        MessageQueue messageQueueMyQueue = Looper.myQueue();
        final C1455260nyO c1455260nyO = (C1455260nyO) aObjectS243S0100000_14.l0;
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0nwL
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                c1455260nyO.LLJJIJIL.LIZIZ(EnumC1453850nw7.UI_FIRST_FRAME);
                return false;
            }
        }, messageQueueMyQueue);
    }

    public static final void onChanged$9(AObjectS243S0100000_14 aObjectS243S0100000_14, Object obj) {
        C1459970o5z c1459970o5z = (C1459970o5z) aObjectS243S0100000_14.l0;
        d0 d0Var = c1459970o5z.LLJJI;
        if (d0Var == null) {
            d0Var = null;
        }
        HandlerHook.viewPost(d0Var, new ARunnableS83S0200000_14(c1459970o5z, aObjectS243S0100000_14, 16));
    }
}
