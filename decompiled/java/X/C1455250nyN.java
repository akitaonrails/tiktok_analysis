package X;

import Y.AObjectS245S0100000_22;
import Y.ARunnableS0S0720000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS1S0420000_22;
import Y.ARunnableS1S0520000_22;
import Y.AfS191S0100000_22;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLERenderAction;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationEventManager;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationListener;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationResType;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.service.IStoryAlbumEnterEditTimingService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController;
import com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS260S0000000_22;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S0310000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS639S0100000_25;
import org.greenrobot.eventbus.EventBus;
import v7.o;

/* JADX INFO: renamed from: X.0nyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455250nyN extends AbstractC1453750nvx implements InterfaceC536950L4b, InterfaceC384890F7f, InterfaceC379610EuV {
    public static final C1456670o0f LLLLLLLLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLLZIL;
    public final C1DRG LLJJ;
    public C1462070o9N LLJJJ;
    public InterfaceC1455610nyx LLJJJJ;
    public InterfaceC1457600o2A LLJJJJJIL;
    public InterfaceC1456870o0z LLJJJJLIIL;
    public InterfaceC1464740oDg LLJJL;
    public boolean LLJL;
    public boolean LLJLIL;
    public C1DRG LLJLILLLLZIIL;
    public InterfaceC1461350o8D LLJLLIL;
    public final C1664750tQH LLJZ;
    public InterfaceC1455590nyv LLJZIJLIL;
    public InterfaceC1457250o1b LLL;
    public InterfaceC1453420nvQ LLLFF;
    public InterfaceC23230098i LLLFFI;
    public InterfaceC2180241AUk LLLI;
    public InterfaceC1431860nMe LLLIIII;
    public final C1664750tQH LLLIIIIL;
    public InterfaceC1455680nz4 LLLIIIL;
    public C0MFO LLLIIL;
    public C19740512Lj LLLIILIL;
    public C1439740nZM LLLIL;
    public InterfaceC1444130ngR LLLILZ;
    public View LLLILZJ;
    public C1649540t1k LLLILZLLLI;
    public InterfaceC1453610nvj LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLL;
    public long LLLLII;
    public long LLLLIIIILLL;
    public boolean LLLLIIL;
    public InterfaceC1455360nyY LLLLLJIL;
    public NLEVEOperationEventManager LLLLLL;
    public C1455520nyo LLLLLLIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(364));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 927));
    public final C1453870nw9<EnumC1453860nw8> LLJJIJI = new C1453870nw9<>();
    public final C1453870nw9<EnumC1453850nw7> LLJJIJIIJIL = new C1453870nw9<>();
    public final C385680FAg<EnumC1453860nw8, EnumC1453850nw7> LLJJIJIL = new C385680FAg<>();
    public final Map<String, String> LLJJJIL = new LinkedHashMap();
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 929));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 933));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 932));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 928));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 931));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 930));
    public final C1455320nyU LLLJL = new SocialPublishCallback() { // from class: X.0nyU
        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onReadyToCreateAweme(PublishModel publishModel) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onReportPublish() {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        public final void onSynthesisSuccess(PublishModel publishModel, String str) {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
        @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPublishStart(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r9) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1455320nyU.onPublishStart(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):void");
        }
    };
    public boolean LLLLIILL = true;
    public final C11NJ LLLLIILLL = new C11NJ();
    public final C01GW LLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(365));
    public final C054G LLLLILI = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C054G LLLLJ = C2296808zG.LIZIZ();
    public final C01GW LLLLJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(366));
    public final C01GW LLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 934));
    public final C1455830nzJ LLLLLIL = new C1455830nzJ();
    public final C0EN4 LLLLLILLIL = new C0EN4();
    public final C1455380nya LLLLLJLJLL = new InterfaceC578380MmK() { // from class: X.0nya
        @Override // X.InterfaceC578380MmK
        public final boolean C1() {
            C1462070o9N c1462070o9NLLLLLJIL;
            return (this.LIZ.LLLLLLZ() && (c1462070o9NLLLLLJIL = this.LIZ.LLLLLJIL()) != null && c1462070o9NLLLLLJIL.C1()) || this.LIZ.getEditModel().hasUserAddStickers();
        }

        @Override // X.InterfaceC578380MmK
        public final void LJJLIIIJJIZ() {
            this.LIZ.LLLLLLL(true);
        }

        @Override // X.InterfaceC578380MmK
        public final boolean nu() {
            C1455250nyN c1455250nyN = this.LIZ;
            InterfaceC2180241AUk interfaceC2180241AUk = (c1455250nyN.LLLI == null && C365940EWi.LIZLLL(c1455250nyN.getEditModel())) ? (InterfaceC2180241AUk) c1455250nyN.LLLII.getValue() : c1455250nyN.LLLI;
            return interfaceC2180241AUk != null && interfaceC2180241AUk.nu();
        }

        @Override // X.InterfaceC578380MmK
        public final void pu() {
            C1455250nyN c1455250nyN = this.LIZ;
            InterfaceC2180241AUk interfaceC2180241AUk = (c1455250nyN.LLLI == null && C365940EWi.LIZLLL(c1455250nyN.getEditModel())) ? (InterfaceC2180241AUk) c1455250nyN.LLLII.getValue() : c1455250nyN.LLLI;
            if (interfaceC2180241AUk != null) {
                interfaceC2180241AUk.jn0(false);
            }
        }

        @Override // X.InterfaceC578380MmK
        public final void ou(Runnable runnable) {
            C1455250nyN c1455250nyN = this.LIZ;
            c1455250nyN.LLLLIIL = true;
            c1455250nyN.LLLLLLJ(new Runnable() { // from class: X.0nzm
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SocialEditRootScene@8880.editExitHelper$1$nextStepCustom$1");
                    C1C7U.LIZIZ("SocialEditRootScene@8880.editExitHelper$1$nextStepCustom$1");
                }
            }, runnable, c1455250nyN.LLJL, c1455250nyN.LLJLIL, true);
        }
    };
    public boolean LLLLLLJ = true;
    public final C01GW LLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 926));
    public final C1455350nyX LLLLLLLLL = new InterfaceC1462140o9U() { // from class: X.0nyX
        @Override // X.InterfaceC1462140o9U
        public final C364440EQo LIZIZ() {
            return null;
        }

        @Override // X.InterfaceC1462140o9U
        public final C385670FAf<InterfaceC1460000o62> LJ() {
            return null;
        }

        @Override // X.InterfaceC1462140o9U
        public final void LJFF() {
        }

        @Override // X.InterfaceC1462140o9U
        public final LiveData<Integer> LIZ() {
            InterfaceC1455610nyx interfaceC1455610nyx = this.LIZ.LLJJJJ;
            if (interfaceC1455610nyx != null) {
                return interfaceC1455610nyx.ww();
            }
            return null;
        }

        @Override // X.InterfaceC1462140o9U
        public final InterfaceC19672111xv LIZJ() {
            return new InterfaceC19672111xv() { // from class: X.0nzj
                @Override // X.InterfaceC19672111xv
                public final Bitmap LIZ(VideoPublishEditModel videoPublishEditModel) {
                    return null;
                }

                @Override // X.InterfaceC19672111xv
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC19672111xv
                public final View LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC19672111xv
                public final Rect LIZLLL() {
                    return null;
                }
            };
        }

        @Override // X.InterfaceC1462140o9U
        public final void LIZLLL() {
            C1455250nyN c1455250nyN = this.LIZ;
            c1455250nyN.LLLLLIL().Pn().LJ(c1455250nyN, new AObjectS245S0100000_22(c1455250nyN, 273));
        }

        @Override // X.InterfaceC1462140o9U
        public final void LJII() {
            InterfaceC1455610nyx interfaceC1455610nyx = this.LIZ.LLJJJJ;
            if (interfaceC1455610nyx != null) {
                interfaceC1455610nyx.Ws(1);
            }
        }

        @Override // X.InterfaceC1462140o9U
        public final Scene LJIIIIZZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1462140o9U
        public final AbstractC1664510tPt LJI(C1DRG c1drg, C1462090o9P c1462090o9P) {
            if (C1454460nx6.LIZ()) {
                return new C1460270o6T(c1462090o9P, c1drg);
            }
            return new C1460260o6S(c1462090o9P, c1drg);
        }
    };

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0o0f] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1455250nyN.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLLLLLLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1455250nyN.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0)};
        LLLLLLLLLL = new Object() { // from class: X.0o0f
        };
    }

    @Override // X.InterfaceC384890F7f
    public final InterfaceC1444130ngR LLJIJIL() {
        InterfaceC1444130ngR interfaceC1444130ngR = this.LLLILZ;
        if (interfaceC1444130ngR == null) {
            return null;
        }
        return interfaceC1444130ngR;
    }

    @Override // X.AbstractC1453750nvx
    public final C1DRG LLLLLILLIL() {
        if (this.LLLJ) {
            return C1664600tQ2.LJ(this).LJFF();
        }
        return null;
    }

    @Override // X.AbstractC1453750nvx
    public final boolean LLLLLLZ() {
        return findSceneByTag("EditStickerScene") != null;
    }

    public final InterfaceC1446740nke LLLLZLL() {
        return (InterfaceC1446740nke) this.LLJZ.getValue(this, LLLLLLLZIL[0]);
    }

    public final AbstractC214814194y LLLZ() {
        return (AbstractC214814194y) this.LLLIIIIL.getValue(this, LLLLLLLZIL[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLIIIILLL() {
        if (C1454460nx6.LIZ()) {
            InterfaceC1456870o0z interfaceC1456870o0z = this.LLJJJJLIIL;
            if (interfaceC1456870o0z != null) {
                interfaceC1456870o0z.lV();
                return;
            }
            return;
        }
        InterfaceC1457600o2A interfaceC1457600o2A = this.LLJJJJJIL;
        if (interfaceC1457600o2A != null) {
            interfaceC1457600o2A.rZ();
        }
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLJ() {
        C1DRG c1drgLJIIIZ;
        InterfaceC379580EuS interfaceC379580EuS;
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        if (c1462070o9NLLLLLJIL == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NLLLLLJIL)) == null || (interfaceC379580EuS = (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class)) == null) {
            return;
        }
        interfaceC379580EuS.m4();
    }

    public final InterfaceC1452170ntP LLLLZLLIL() {
        return LLLLZLL().g().getValue();
    }

    public final C348100Dkm LLLLZLLLI() {
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL = LLLLZLLIL();
        if (interfaceC1452170ntPLLLLZLLIL instanceof C1463670oBx) {
            return ((C1463670oBx) interfaceC1452170ntPLLLLZLLIL).LIZLLL();
        }
        return null;
    }

    @Override // X.AbstractC1453750nvx
    /* JADX INFO: renamed from: LLLZI, reason: merged with bridge method [inline-methods] */
    public final C1462070o9N LLLLLJIL() {
        C1462070o9N c1462070o9N;
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        C1462070o9N c1462070o9N2 = this.LLJJJ;
        if (c1462070o9N2 != null) {
            return c1462070o9N2;
        }
        C1DRG c1drgLJFF = C1664600tQ2.LJ(this).LJFF();
        if (c1drgLJFF == null || ((C0ETY) c1drgLJFF.LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class) == null || (c1462070o9N = (C1462070o9N) findSceneByTag("EditStickerScene")) == null) {
            return null;
        }
        this.LLJJJ = c1462070o9N;
        return c1462070o9N;
    }

    public final void LLLZZ() {
        NLEEditor nLEEditor;
        if (!C1440380naO.LIZIZ(getEditModel())) {
            C201955140j.LIZLLL(C201950140e.LIZIZ, "SocialEditRootScene", "replaceStreamingUrl: not a streaming-entry session, skip");
            return;
        }
        C348100Dkm c348100DkmLLLLZLLLI = LLLLZLLLI();
        if (c348100DkmLLLLZLLLI == null || (nLEEditor = c348100DkmLLLLZLLLI.LIZ) == null) {
            C201955140j.LIZLLL(C201950140e.LIZIZ, "SocialEditRootScene", "replaceStreamingUrl: nleEditor is null");
            return;
        }
        IShareToStoryVideoStreamController iShareToStoryVideoStreamController = (IShareToStoryVideoStreamController) PluggableExtentionKt.pluggableSpi$default(IShareToStoryVideoStreamController.class, false, false, false, 14, null);
        if (iShareToStoryVideoStreamController == null) {
            C201955140j.LIZLLL(C201950140e.LIZIZ, "SocialEditRootScene", "replaceStreamingUrl: streamController SPI is null");
            return;
        }
        Set<String> setLIZJ = C348750Dlp.LIZJ(nLEEditor.getModel(), new AwS601S0100000_22(iShareToStoryVideoStreamController, 730), AFwS261S0000000_22.get$arr$(292), new AwS601S0100000_22(nLEEditor, 697));
        if (!setLIZJ.isEmpty()) {
            C201950140e c201950140e = C201950140e.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceStreamingUrl: ");
            sbLIZ.append(setLIZJ.size());
            sbLIZ.append(" URL(s) still downloading");
            C201955140j.LIZLLL(c201950140e, "SocialEditRootScene", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        this.LLLJ = false;
        C1403010mc7.LIZ.getMusicService().al();
        if (!C0FQX.LIZIZ) {
            C2275708vr.LIZ();
        }
        C366400EYc.LIZ.getClass();
        this.LLLLIILLL.dispose();
        C2296808zG.LIZJ(this.LLLLILI, null);
        C1414150mu5.LIZIZ.clear();
        C1414150mu5.LIZ = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.f8(this.LLLJL);
        }
        if (C365940EWi.LIZLLL(getEditModel())) {
            ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        }
        C1453180nv2.LIZ = 0;
        C1453180nv2.LIZIZ = 0;
        C0CHQ.LIZ().LJJIIJ().destroy();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        NLEVEOperationEventManager nLEVEOperationEventManager = this.LLLLLL;
        if (nLEVEOperationEventManager != null) {
            nLEVEOperationEventManager.clearVEOperationListener();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0nyo, com.bytedance.ies.nle.editor_jni.NLEVEOperationListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C201955140j.LIZ("VEVideoPublishEditActivity onResume EditRootScene");
        this.LLLJIL = false;
        this.LLLL = false;
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
        if (c1drgLJIIIZ != null) {
            if (C365940EWi.LIZLLL(getEditModel())) {
                ((C0ETY) c1drgLJIIIZ.LJII(C0ETY.class, null)).Sd(InterfaceC2180241AUk.class, new AwS260S0000000_22(18));
            } else {
                InterfaceC2180241AUk interfaceC2180241AUk = (InterfaceC2180241AUk) ((C05YF) c1drgLJIIIZ.LJIIL(null, InterfaceC2180241AUk.class));
                if (interfaceC2180241AUk != null) {
                    interfaceC2180241AUk.jn0(false);
                }
            }
        }
        if (getEditModel().isDraftMusicIllegal() && !C879450Yel.LIZ(getEditModel())) {
            InterfaceC1455610nyx interfaceC1455610nyx = this.LLJJJJ;
            if (interfaceC1455610nyx != null) {
                interfaceC1455610nyx.Ws(1);
            }
            C879450Yel.LIZLLL(getEditModel(), true);
        }
        if (C0FGC.LIZ) {
            this.LLLLLL = NLEVEOperationEventManager.obtain();
            ?? r1 = new NLEVEOperationListener() { // from class: X.0nyo
                @Override // com.bytedance.ies.nle.editor_jni.NLEVEOperationListener
                public final void onVEOperationEvent(NLEVEOperationResType nLEVEOperationResType, String str, NLEResourceNode nLEResourceNode, int i, NLERenderAction nLERenderAction) {
                    C348100Dkm c348100DkmLLLLZLLLI = this.LIZ.LLLLZLLLI();
                    if (c348100DkmLLLLZLLLI != null) {
                        C1455250nyN c1455250nyN = this.LIZ;
                        C366400EYc c366400EYc = C366400EYc.LIZ;
                        VideoPublishEditModel editModel = c1455250nyN.getEditModel();
                        c348100DkmLLLLZLLLI.LIZ.getModel();
                        c366400EYc.getClass();
                        C366400EYc.LIZLLL(editModel, nLEVEOperationResType, nLEResourceNode, i, nLERenderAction, false);
                    }
                }
            };
            this.LLLLLLIL = r1;
            NLEVEOperationEventManager nLEVEOperationEventManager = this.LLLLLL;
            if (nLEVEOperationEventManager != 0) {
                nLEVEOperationEventManager.addVEOperationListener(r1);
            }
        }
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService = (IStoryAlbumEnterEditTimingService) this.LLJJI.getValue();
        if (iStoryAlbumEnterEditTimingService != null) {
            iStoryAlbumEnterEditTimingService.LIZ();
        }
    }

    @Override // X.AbstractC1453750nvx
    public final Map<String, String> LLLLL() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1453750nvx
    public final boolean LLLLLJLJLL() {
        return this.LLLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJ;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0nyU] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0nya] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0nyX] */
    public C1455250nyN(C1DRG c1drg) {
        this.LLJJ = c1drg;
        this.LLJZ = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLIL(ARunnableS122S0100000_22 aRunnableS122S0100000_22) {
        LLLZLL(false, false, aRunnableS122S0100000_22, true);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLL(boolean z) {
        this.LLLL = z;
    }

    public final Bitmap LLLZIIL(Bitmap bitmap) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel2;
        List<StickerItemModel> list2;
        if (getEditModel().getInfoStickerModel() != null && (infoStickerModel = getEditModel().getInfoStickerModel()) != null && (list = infoStickerModel.stickers) != null && !list.isEmpty() && (infoStickerModel2 = getEditModel().getInfoStickerModel()) != null && (list2 = infoStickerModel2.stickers) != null) {
            for (StickerItemModel stickerItemModel : list2) {
                if (stickerItemModel.type == 2) {
                    Bitmap bitmapLIZIZ = C097U.LIZIZ(bitmap.getWidth(), bitmap.getHeight(), stickerItemModel.path);
                    bitmap = C2475009mu.LIZLLL(bitmap, bitmapLIZIZ);
                    C2475009mu.LJ(bitmapLIZIZ);
                }
            }
        }
        return bitmap;
    }

    public final void LLLZIL(InterfaceC1461350o8D interfaceC1461350o8D) {
        C1462070o9N c1462070o9NLLLLLJIL;
        InterfaceC1461660o8i interfaceC1461660o8iLLLLLLLLL;
        C201955140j.LIZ("VEVideoPublishEditActivity initAllStickerModules");
        InterfaceC391240FVq interfaceC391240FVqU30 = interfaceC1461350o8D.u30();
        if (interfaceC391240FVqU30 != null) {
            interfaceC391240FVqU30.KN2();
        }
        C1462070o9N c1462070o9NLLLLLJIL2 = LLLLLJIL();
        if (c1462070o9NLLLLLJIL2 != null) {
            c1462070o9NLLLLLJIL2.LLLLLZL();
        }
        C1462070o9N c1462070o9NLLLLLJIL3 = LLLLLJIL();
        if (c1462070o9NLLLLLJIL3 != null) {
            c1462070o9NLLLLLJIL3.LLLLZ();
        }
        C1462070o9N c1462070o9NLLLLLJIL4 = LLLLLJIL();
        if (c1462070o9NLLLLLJIL4 != null) {
            c1462070o9NLLLLLJIL4.LLLLZIL();
        }
        LLLLZLL().u90();
        if (((!C0L0X.LIZ(getEditModel().creativeModel) && !C1416310mxZ.LJJJJIZL(getEditModel()) && !getEditModel().getEditorProModel().getFromEditorProEntranceInAlbum()) || getEditModel().creativeModel.pugcTemplateData.isFromCreateTemplate) && (c1462070o9NLLLLLJIL = LLLLLJIL()) != null && (interfaceC1461660o8iLLLLLLLLL = c1462070o9NLLLLLJIL.LLLLLLLLL()) != null) {
            interfaceC1461660o8iLLLLLLLLL.T1();
        }
        C1452150ntN.LIZ(getEditModel(), new AwS549S0100000_5(new AwS601S0100000_22(this, 693), (Function1<? super List<? extends EffectPointModel>, Unit>) 41));
        C1452150ntN.LIZ(getEditModel(), new AwS549S0100000_5(new AwS601S0100000_22(this, 694), (Function1<? super List<? extends EffectPointModel>, Unit>) 40));
        C1452150ntN.LIZ(getEditModel(), new AwS549S0100000_5(new AwS601S0100000_22(this, 695), (Function1<? super List<? extends EffectPointModel>, Unit>) 42));
        C1452150ntN.LIZLLL();
        InterfaceC1453420nvQ interfaceC1453420nvQ = this.LLLFF;
        if (interfaceC1453420nvQ != null) {
            interfaceC1453420nvQ.Si1();
            return;
        }
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
        if (c1drgLJIIIZ == null) {
            return;
        }
        if (C365940EWi.LIZLLL(getEditModel())) {
            ((C0ETY) c1drgLJIIIZ.LJII(C0ETY.class, null)).Sd(InterfaceC1453420nvQ.class, new AwS260S0000000_22(19));
            return;
        }
        InterfaceC1453420nvQ interfaceC1453420nvQ2 = (InterfaceC1453420nvQ) ((C05YF) c1drgLJIIIZ.LJIIL(null, InterfaceC1453420nvQ.class));
        if (interfaceC1453420nvQ2 == null) {
            return;
        }
        interfaceC1453420nvQ2.Si1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
    
        r6.stickers.add(r9);
     */
    @Override // X.InterfaceC384890F7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZILL(com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r9) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455250nyN.LLZILL(com.ss.android.ugc.aweme.editSticker.model.StickerItemModel):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ee  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455250nyN.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLILI(Runnable runnable, Runnable runnable2) {
        C122Q c122q;
        LLLZZ();
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        if (c1462070o9NLLLLLJIL != null && (c122q = c1462070o9NLLLLLJIL.LLLLLJLJLL) != null) {
            c122q.Mj0();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialEditRootScene -> nextStepCustom -> captions.Size = ");
        sbLIZ.append(C363730ENv.LIZIZ(getEditModel()));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1452170ntP value = LLLLZLL().g().getValue();
        if (value != null) {
            getEditModel().getPreviewInfo().setPreviewVideoLength(value.getDuration());
        }
        if (getEditModel().mIsFromDraft && getEditModel().isDraftMusicIllegal() && MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel) != null) {
            getEditModel().setDraftMusicIllegal(false);
        }
        LLLLZ(this.LLJL, this.LLJLIL, runnable, true, runnable2);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLLLLL(Effect effect, CustomStickerInfo customStickerInfo) {
        LLLLZLL().vW1().setValue(C1452730nuJ.LIZLLL(0L));
        C1455830nzJ c1455830nzJ = this.LLLLLIL;
        c1455830nzJ.LIZ.LJIIJ(new C1456640o0c(effect, customStickerInfo));
    }

    public final void LLLLLZ(boolean z, final C1456350o09 c1456350o09) {
        C1455340nyW c1455340nyWLIZJ = C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ();
        ArrayList arrayList = new ArrayList();
        C0MH8 c0mh8 = C0MH8.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        VideoPublishEditModel editModel2 = getEditModel();
        c0mh8.getClass();
        c0mh8.LIZ(editModel, new CoverNewItem(C0MH8.LJIIIIZZ(editModel2), c1456350o09.LIZ, 2, null, 0L, Boolean.TRUE, null, 88, null), false);
        final AwS59S0310000_22 awS59S0310000_22 = new AwS59S0310000_22(c1455340nyWLIZJ, this, arrayList, z, 8);
        C1456230nzx c1456230nzx = new C1456230nzx(getEditModel());
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL = LLLLZLLIL();
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LJIIIIZZ = interfaceC1452170ntPLLLLZLLIL;
        c1457050o1H.LIZIZ = c1456350o09.LIZ;
        c1457050o1H.LJFF = c1456350o09.LIZIZ;
        c1457050o1H.LJIIJJI = c1456350o09.LIZJ;
        c1457050o1H.LJIIL = c1456350o09.LIZLLL;
        c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0nz5
            @Override // X.InterfaceC1457180o1U
            public final void onError(int i, String str) {
                C2354709Kn.LJIJJLI(c1456350o09.LIZ);
                awS59S0310000_22.invoke();
                C201955140j.LJ(str);
            }
        };
        AwS59S0310000_22 awS59S0310000_222 = new AwS59S0310000_22(c1455340nyWLIZJ, this, arrayList, z, 7);
        C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
        c1457050o1H2.LJ = awS59S0310000_222;
        c1457050o1H2.LIZJ = new C0MBV() { // from class: X.0nzk
            @Override // X.C0MBV
            public final void LIZLLL() {
                awS59S0310000_22.invoke();
            }
        };
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 691);
        C1457050o1H c1457050o1H3 = c1456230nzx.LIZ;
        c1457050o1H3.LJIIIZ = awS601S0100000_22;
        C1457060o1I.LIZIZ(c1457050o1H3);
    }

    public final void LLLZZIL(int i, boolean z) {
        InterfaceC1455010nxz interfaceC1455010nxz;
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL = LLLLZLLIL();
        if (interfaceC1452170ntPLLLLZLLIL != null) {
            InterfaceC1455010nxz interfaceC1455010nxz2 = this.LLJLLIL;
            if (interfaceC1455010nxz2 != null || (interfaceC1455010nxz2 = (InterfaceC1455010nxz) this.LLJLLL.getValue()) != null) {
                interfaceC1455010nxz2.l0(new Pair<>(Integer.valueOf(interfaceC1452170ntPLLLLZLLIL.mo51if()), Integer.valueOf(i)));
            }
            if (z && ((interfaceC1455010nxz = this.LLJLLIL) != null || (interfaceC1455010nxz = (InterfaceC1455010nxz) this.LLJLLL.getValue()) != null)) {
                interfaceC1455010nxz.v1(i, true);
            }
            InterfaceC1455010nxz interfaceC1455010nxz3 = this.LLJLLIL;
            if (interfaceC1455010nxz3 != null || (interfaceC1455010nxz3 = (InterfaceC1455010nxz) this.LLJLLL.getValue()) != null) {
                interfaceC1455010nxz3.u1();
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1456130nzn.LIZ();
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLL(ARunnableS122S0100000_22 aRunnableS122S0100000_22, boolean z, boolean z2) {
        if (((Number) C296210BjH.LIZ.getValue()).intValue() != 0) {
            C112C c112c = C112C.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
            c112c.getClass();
            C112C.LJI(editModel, c1462070o9NLLLLLJIL);
        } else if (C0BUA.LIZ()) {
            if (C0BKM.LIZ()) {
                C112C c112c2 = C112C.LIZ;
                VideoPublishEditModel editModel2 = getEditModel();
                C1462070o9N c1462070o9NLLLLLJIL2 = LLLLLJIL();
                c112c2.getClass();
                C112C.LJIILIIL = C112C.LIZJ(editModel2, c1462070o9NLLLLLJIL2);
                C112C.LIZIZ();
            } else {
                C112C c112c3 = C112C.LIZ;
                VideoPublishEditModel editModel3 = getEditModel();
                C1462070o9N c1462070o9NLLLLLJIL3 = LLLLLJIL();
                c112c3.getClass();
                C112C.LIZ(editModel3, c1462070o9NLLLLLJIL3);
            }
        }
        if (getEditModel().creativeModel.imageEditModel.isVideoChildPageFromImage) {
            getEditModel().creativeModel.imageEditModel.isVideoChildPageFromImage = false;
        }
        C1411910mqT c1411910mqT = C1411910mqT.LIZ;
        VideoPublishEditModel editModel4 = getEditModel();
        c1411910mqT.getClass();
        C1411910mqT.LIZIZ(editModel4);
        LLLLLLJ(aRunnableS122S0100000_22, null, z, z2, false);
    }

    public final void LLLLLZL(final boolean z, final Runnable runnable, final Runnable runnable2) {
        boolean z2;
        String first;
        int iIntValue;
        boolean z3;
        String first2;
        InterfaceC1452170ntP value;
        LLLZZ();
        if (C1428470nHB.LLF(getEditModel()) && (value = LLLLZLL().g().getValue()) != null) {
            getEditModel().getPreviewInfo().setPreviewVideoLength(value.getDuration());
        }
        if (C493401w4.LIZ()) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c0mh8.getClass();
            if (C1429320nIY.LIZJ(editModel) && !C1429320nIY.LJ(editModel) && !C1428470nHB.LJZL(getEditModel())) {
                LLLLZ(this.LLJL, this.LLJLIL, runnable, z, runnable2);
                return;
            }
        }
        if (getEditModel() != null && C1428470nHB.LJZL(getEditModel()) && C2286708xd.LIZJ(C1429320nIY.LIZIZ(getEditModel()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        AwS587S0100000_8 awS587S0100000_8 = null;
        if (z2) {
            Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(getEditModel(), false, null, true, 5);
            if (pairLJJIIJZLJL != null) {
                first2 = pairLJJIIJZLJL.getFirst();
            } else {
                first2 = null;
            }
            C23250099c.LIZLLL(this.LLLLJ, null, null, new C564350MBl(this, runnable, z, runnable2, first2, null), 3);
            return;
        }
        if (C1428520nHG.LJI(getEditModel()) && !C1428470nHB.LLIIIJ(getEditModel())) {
            boolean z4 = this.LLJL;
            boolean z5 = this.LLJLIL;
            Pair<String, Integer> pairLJJIIJZLJL2 = C1428520nHG.LJJIIJZLJL(getEditModel(), false, null, true, 2);
            if (pairLJJIIJZLJL2 != null) {
                first = pairLJJIIJZLJL2.getFirst();
                iIntValue = pairLJJIIJZLJL2.getSecond().intValue();
            } else {
                first = "";
                iIntValue = 0;
            }
            String str = first;
            if (C1455550nyr.LIZIZ() && !getEditModel().isMvThemeVideoType() && getEditModel().getCanvasVideoData() == null && !C1428470nHB.LLFF(getEditModel()) && !C1428470nHB.LJLZ(getEditModel()) && !C1428470nHB.LLFFF(getEditModel())) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1456350o09 c1456350o09 = new C1456350o09(str, iIntValue, z3);
            if (C295820Bie.LIZIZ() == 1 || C1428520nHG.LJI(getEditModel())) {
                LLLLLZ(false, c1456350o09);
            }
            getEditModel().creativeModel.publishPreviewModel.firstFramePath = str;
            C524780Ki4.LIZ.step("av_video_publish", "begin_compile_sticker");
            C013C c013c = new C013C();
            c013c.element = true;
            ARunnableS1S0520000_22 aRunnableS1S0520000_22 = new ARunnableS1S0520000_22(c013c, this, runnable2, c1456350o09, z4, z5, runnable, 1);
            InterfaceC1455760nzC interfaceC1455760nzC = (InterfaceC1455760nzC) this.LLJLL.getValue();
            if (interfaceC1455760nzC == null || interfaceC1455760nzC.p82(aRunnableS1S0520000_22, true, z) == null) {
                C15O7.LJIIJ(Unit.LIZ);
            }
            if (!c013c.element) {
                return;
            }
            LLLLZLL().oL2();
            c013c.element = false;
            return;
        }
        if (C1428470nHB.LLIIIJ(getEditModel())) {
            LLLLZIL(this.LLJL, this.LLJLIL, runnable, runnable2, z, null);
            return;
        }
        C0CHQ.LIZ().getPublishService().LJIIJ();
        if (C856570Xix.LIZLLL(getEditModel()) && !this.LLLLIIL && !C1428470nHB.LJJJJLL(getEditModel())) {
            boolean z6 = this.LLJL;
            boolean z7 = this.LLJLIL;
            InterfaceC1455590nyv interfaceC1455590nyv = this.LLJZIJLIL;
            if (interfaceC1455590nyv != null) {
                interfaceC1455590nyv.TA(LLLLZLLIL(), getEditModel(), new AwS566S0100000_22(this, 935), new AwS566S0100000_22(this, 936));
            }
            C524780Ki4.LIZ.step("av_video_publish", "begin_compile_sticker");
            C013C c013c2 = new C013C();
            c013c2.element = true;
            ARunnableS1S0420000_22 aRunnableS1S0420000_22 = new ARunnableS1S0420000_22(c013c2, this, runnable2, z6, z7, runnable, 0);
            InterfaceC1455760nzC interfaceC1455760nzC2 = (InterfaceC1455760nzC) this.LLJLL.getValue();
            if (interfaceC1455760nzC2 == null || interfaceC1455760nzC2.p82(aRunnableS1S0420000_22, true, z) == null) {
                C15O7.LJIIJ(Unit.LIZ);
            }
            if (!c013c2.element) {
                return;
            }
            LLLLZLL().oL2();
            c013c2.element = false;
            return;
        }
        if (this.LLLLIIL) {
            this.LLLLIIL = false;
        }
        final boolean z8 = this.LLJL;
        final boolean z9 = this.LLJLIL;
        final Pair<String, Integer> pairLJJIIJZLJL3 = C1428520nHG.LJJIIJZLJL(getEditModel(), false, null, true, 2);
        if (C1428470nHB.LJJJJZ(getEditModel())) {
            awS587S0100000_8 = new AwS587S0100000_8(this, 652);
        }
        if (pairLJJIIJZLJL3 != null) {
            C1456230nzx c1456230nzx = new C1456230nzx(getEditModel());
            c1456230nzx.LIZ.LJIIIIZZ = LLLLZLLIL();
            int iIntValue2 = pairLJJIIJZLJL3.getSecond().intValue();
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJFF = iIntValue2;
            c1457050o1H.LJIIIZ = awS587S0100000_8;
            c1456230nzx.LIZ.LIZIZ = pairLJJIIJZLJL3.getFirst();
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 968);
            C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
            c1457050o1H2.LJ = awS552S0100000_8;
            c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0MBn
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str2) {
                    VEEditorAutoStartStopArbiter value2 = this.LIZ.LLLLZLL().b10().getValue();
                    if (value2 != null) {
                        value2.LLIZ = true;
                    }
                    C201955140j.LJ(str2);
                }
            };
            c1457050o1H2.LIZJ = new C0MBV() { // from class: X.0MBm
                @Override // X.C0MBV
                public final void LIZLLL() {
                    VEEditorAutoStartStopArbiter value2 = this.LIZ.LLLLZLL().b10().getValue();
                    if (value2 != null) {
                        value2.LLIZ = true;
                    }
                    C1440950nbJ.LIZJ(this.LIZ.getEditModel(), pairLJJIIJZLJL3.getFirst());
                    this.LIZ.LLLLZ(z8, z9, runnable, z, runnable2);
                }
            };
            C1457060o1I.LIZIZ(c1457050o1H2);
            return;
        }
        LLLLZ(z8, z9, runnable, z, runnable2);
    }

    public final void LLLZLZ(Intent intent, boolean z, boolean z2) {
        boolean z3;
        String entryPoint;
        if (C123100dR.LIZ(getEditModel().creativeModel.paidContentModel.getCollectionId())) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.mActivity, "aweme://paidcontent/series/post");
            VideoPublishEditModel editModel = getEditModel();
            if (!(editModel instanceof Parcelable)) {
                editModel = null;
            }
            smartRouteBuildRoute.withParam("edit_model", (Parcelable) editModel);
            smartRouteBuildRoute.withParam("creative_model", getEditModel().creativeModel);
            smartRouteBuildRoute.withParam("is_from_publish", false);
            smartRouteBuildRoute.withParam("collection_id", getEditModel().creativeModel.paidContentModel.getCollectionId());
            smartRouteBuildRoute.withParam("collection_cover_url", getEditModel().creativeModel.paidContentModel.getCollectionCoverUrl());
            smartRouteBuildRoute.withParam("collection_name", getEditModel().creativeModel.paidContentModel.getCollectionName());
            String entryPoint2 = getEditModel().creativeModel.paidContentModel.getEntryPoint();
            if (entryPoint2 != null && entryPoint2.length() != 0) {
                entryPoint = getEditModel().creativeModel.paidContentModel.getEntryPoint();
            } else {
                entryPoint = "feed";
            }
            smartRouteBuildRoute.withParam("entry_point", entryPoint);
            smartRouteBuildRoute.withParam("enter_from", getEditModel().getEnterFrom());
            smartRouteBuildRoute.open();
            return;
        }
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        if (!C571290Mat.LIZLLL(getEditModel()) && !getEditModel().isDirectToPublishByNewExp()) {
            z3 = false;
        } else {
            z3 = true;
        }
        C1438930nY3 c1438930nY3 = new C1438930nY3(requireActivity(), intent, z, z2, z3);
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438930nY3);
    }

    @Override // X.AbstractC1453750nvx, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iLIZIZ;
        j jVar = C524780Ki4.LIZ;
        jVar.step("av_video_edit", "begin EditRootScene:onCreateView");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ViewGroup viewGroup2 = (ViewGroup) ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutFiles("scene_edit_root", getSceneContext(), layoutInflater, R.layout.f9p, viewGroup, false);
        if (C293350Bef.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ = 0;
        }
        this.LLLIILIL = C1451800nso.LIZ(viewGroup.getContext(), (ViewGroup) viewGroup2.findViewById(R.id.gpu), iLIZIZ, 8);
        C365090ETb.LIZIZ();
        if (C0L2Z.LIZ()) {
            View viewFindViewById = viewGroup2.findViewById(R.id.gqv);
            if (viewFindViewById != null) {
                new C20576115fL((ViewStub) viewFindViewById).LIZIZ(new AwS552S0100000_8(this, 966), new AwS552S0100000_8(this, 967));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C365090ETb.LIZIZ();
        this.LLLILZJ = viewGroup2.findViewById(R.id.gss);
        this.LLLILZLLLI = (C1649540t1k) viewGroup2.findViewById(R.id.gre);
        this.LLLLII = SystemClock.elapsedRealtime() - jElapsedRealtime;
        jVar.step("av_video_edit", "end EditRootScene:onCreateView");
        if (!C0CHQ.LIZ().getAccountService().LIZ() && C0CHQ.LIZ().getAccountService().isLogin() && (((IVideoTrendingTopicService) this.LLLLIL.getValue()).LIZJ() || ((IVideoTrendingTopicService) this.LLLLIL.getValue()).LIZIZ())) {
            this.LLLLIILLL.LIZ(((IVideoTrendingTopicService) this.LLLLIL.getValue()).LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS191S0100000_22(this, 41), new C09JN() { // from class: X.05Pl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SocialEditRootScene@8880.getVideoTrendingTopicStatus$2");
                    C2344809Gs.LJI((Throwable) obj);
                    C1C7U.LIZIZ("SocialEditRootScene@8880.getVideoTrendingTopicStatus$2");
                }
            }));
        }
        if (C1454460nx6.LIZ() || C291030Bav.LIZ()) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.vo5);
            ViewTreeLifecycleOwner.set(viewGroup3, this);
            viewGroup3.setTag(R.id.view_tree_saved_state_registry_owner, this);
            ViewTreeViewModelStoreOwner.set(viewGroup3, this);
            C20038513ap c20038513ap = new C20038513ap(requireSceneContext());
            c20038513ap.setViewCompositionStrategy(C20088213iq.LIZIZ);
            c20038513ap.setBackgroundColor(0);
            c20038513ap.setContent(new C19719212De(706180864, new AwS639S0100000_25(this, 107), true));
            viewGroup3.addView(c20038513ap);
        }
        return viewGroup2;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x03eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLL(boolean r14, final boolean r15, java.lang.Runnable r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455250nyN.LLLZLL(boolean, boolean, java.lang.Runnable, boolean):void");
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLJ(Runnable runnable, Runnable runnable2, boolean z, boolean z2, boolean z3) {
        C122Q c122q;
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        if (c1462070o9NLLLLLJIL != null && (c122q = c1462070o9NLLLLLJIL.LLLLLJLJLL) != null) {
            c122q.Mj0();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialEditRootScene -> nextStepCustom -> captions.Size = ");
        sbLIZ.append(C363730ENv.LIZIZ(getEditModel()));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1452170ntP value = LLLLZLL().g().getValue();
        if (value != null) {
            getEditModel().getPreviewInfo().setPreviewVideoLength(value.getDuration());
        }
        if (getEditModel().mIsFromDraft && getEditModel().isDraftMusicIllegal() && MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel) != null) {
            getEditModel().setDraftMusicIllegal(false);
        }
        if (z3 && !C1428470nHB.LLIIIJ(getEditModel()) && !u4.LJLL(getEditModel()) && C571300Mau.LIZ()) {
            LLLLZLL().RF0();
        }
        if (C1463450oBb.LIZ()) {
            LLLLLZL(!z3, runnable, runnable2);
            return;
        }
        VideoPublishEditModel editModel = getEditModel();
        AwS59S0310000_22 awS59S0310000_22 = new AwS59S0310000_22(this, runnable, runnable2, z3, 10);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C353101Yr(editModel, null, awS59S0310000_22), 3);
    }

    public final void LLLLZ(boolean z, boolean z2, Runnable runnable, boolean z3, Runnable runnable2) {
        InterfaceC1455760nzC interfaceC1455760nzC;
        if ((!C1453840nw6.LJII(getEditModel()) || getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) && (interfaceC1455760nzC = (InterfaceC1455760nzC) this.LLJLL.getValue()) != null) {
            interfaceC1455760nzC.Ly0(true, z3, new C1456440o0I(this, runnable2, z, z2, runnable));
        }
    }

    public final void LLZ(Runnable runnable, Runnable runnable2, boolean z, boolean z2, boolean z3) {
        if (runnable != null) {
            runnable.run();
            return;
        }
        if (z) {
            VideoPublishEditModel editModel = getEditModel();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[saveDraft]: save draft creation id = ");
            sbLIZ.append(editModel.getCreationId());
            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            new C1438570nXT("VEVideoPublishEditActivity");
            AwemeDraft awemeDraftLIZLLL = C1438570nXT.LIZLLL(editModel);
            awemeDraftLIZLLL.lastEditTime = System.currentTimeMillis();
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJII(editModel.getCreationId());
            C0CHQ.LIZ().LJI().LIZIZ().LJFF(new C545640Lac(awemeDraftLIZLLL, new C0M2T(false, "VEVideoPublishEditActivity", null, 3, false, 28)));
            return;
        }
        C524780Ki4.LIZ.step("av_video_publish", "compile_sticker_done");
        LLLZLL(z2, z3, runnable2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    public final void LLLLZIL(boolean z, boolean z2, Runnable runnable, Runnable runnable2, boolean z3, Runnable runnable3) {
        C259800zU c259800zU = new C259800zU();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = (int) (getEditModel().getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
        o oVar = new o();
        Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(getEditModel(), false, null, true, 2);
        if (pairLJJIIJZLJL != null) {
            c259800zU.element = pairLJJIIJZLJL.getFirst();
            c118300cf.element = pairLJJIIJZLJL.getSecond().intValue();
        }
        PublishPreviewModel publishPreviewModel = getEditModel().creativeModel.publishPreviewModel;
        String str = (String) c259800zU.element;
        if (str == null) {
            str = "";
        }
        publishPreviewModel.firstFramePath = str;
        LLLLZ(z, z2, runnable, z3, new ARunnableS0S0720000_22(this, c259800zU, c118300cf, runnable3, oVar, runnable2, z, z2, runnable, 1));
    }
}
