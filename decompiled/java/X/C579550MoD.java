package X;

import Y.AfS144S0200000_8;
import androidx.lifecycle.ViewModelProvider;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.PhotoEditData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.aigc.abtest.AIGCEffectPathRedesignExperiment;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.runtime.VEMem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import lnn.q;
import mn3.e0;
import org.json.JSONException;
import org.json.JSONObject;
import x5h.d;

/* JADX INFO: renamed from: X.0MoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579550MoD implements InterfaceC1650140t2i {
    public static final C579500Mo8 LJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIJJ;
    public final k LIZ;
    public final C19EG LIZIZ;
    public final e0 LIZJ;
    public final C1656050tCF<?> LIZLLL;
    public final q LJ;
    public final C1DRG LJFF;
    public final InterfaceC2254081DKk LJI;
    public final ShortVideoContextViewModel LJII;
    public long LJIIIIZZ;
    public final ShortVideoContext LJIIIZ;
    public final C580090Mp5 LJIIJ;
    public final List<InterfaceC579700MoS> LJIIJJI = new ArrayList();
    public final long LJIIL = 1000;
    public final a LJIILIIL;
    public final d LJIILJJIL;
    public final InterfaceC1648570t0B LJIILL;
    public C578760Mmw LJIILLIIL;
    public volatile boolean LJIIZILJ;
    public final C579600MoI LJIJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Mo8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C579550MoD.class, "lazyBeautyFilter", "getLazyBeautyFilter()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C13LE.LIZ.getClass();
        LJIJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJIJI = new Object() { // from class: X.0Mo8
        };
    }

    @Override // X.InterfaceC1650140t2i
    public final void LIZ(InterfaceC579700MoS interfaceC579700MoS) {
        ((ArrayList) this.LJIIJJI).add(interfaceC579700MoS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.05Vn, X.099V, java.lang.Boolean, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.0Mmw] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // X.InterfaceC1650140t2i
    public final void LIZIZ(C0LZD c0lzd) throws JSONException {
        boolean z;
        ?? c578760Mmw;
        q qVar;
        Effect effectLLILIL;
        q qVar2;
        Effect effectLLILIL2;
        q qVar3;
        Effect effectLLILIL3;
        EnumC1448590nnd enumC1448590nndLIZJ;
        boolean z2;
        int i;
        C385670FAf<InterfaceC1647520syU> c385670FAfHl0;
        InterfaceC1647520syU interfaceC1647520syULIZJ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        Long l;
        this.LJIILIIL.Z22();
        Boolean bool = (Boolean) this.LJII.LLILLJJLI.get("has_go_next");
        if (bool != null && bool.booleanValue()) {
            C201955140j.LJIIL("VideoRecordActivity hasGoNext true return");
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService().getJatoBoostAbilityForEditPage();
        this.LJII.ko0(true);
        this.LIZLLL.KQ();
        ShortVideoContext shortVideoContext = this.LJIIIZ;
        long j = shortVideoContext.cameraComponentModel.mTotalRecordingTime;
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null && (l = recordPageOptionalConfig.recordBottomTabConfig.minVideoDuration) != null && j < l.longValue()) {
            this.LJII.ko0(false);
            this.LIZLLL.h81(new C1644050sst("record end"));
            this.LIZLLL.yF2(true);
            this.LIZJ.pw0().mWorkspace.LL.hH();
            return;
        }
        ShortVideoContext shortVideoContext2 = this.LJIIIZ;
        ?? r12 = 0;
        if (shortVideoContext2.shootMode == 16) {
            CreativeModel creativeModel = shortVideoContext2.creativeModel;
            creativeModel.eventData.extraEventParams = shortVideoContext2.extraEventParams;
            r12 = 0;
            NowsShootModel nowsShootModel = new NowsShootModel(0, null, null, null, null, new NowsExtra("back_first", "", null, "", "", "now", "now_shoot_page", null, 0, null, null, false, false, 0, null), new PhotoEditData(1, true, true), null, null, null, "");
            NowsExtra nowsExtra = nowsShootModel.nowsExtra;
            ShortVideoContext shortVideoContext3 = this.LJIIIZ;
            nowsExtra.enterFrom = shortVideoContext3.enterFrom;
            nowsExtra.shootWay = shortVideoContext3.shootWay;
            nowsExtra.nowTabEnterMethod = shortVideoContext3.enterMethod;
            nowsExtra.allowChangeRatio = true;
            InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) this.LJFF.LJIIL(null, InterfaceC1646220swO.class);
            if (interfaceC1646220swO != null && (c385670FAfDk = interfaceC1646220swO.dk()) != null) {
                enumC1448590nndLIZJ = c385670FAfDk.LIZJ();
            } else {
                enumC1448590nndLIZJ = null;
            }
            if (enumC1448590nndLIZJ == EnumC1448590nnd.RATIO_9_16) {
                z2 = true;
            } else {
                z2 = false;
            }
            nowsExtra.is9To16Ratio = z2;
            nowsShootModel.editData.setAllowGestureOpti(true);
            PhotoEditData photoEditData = nowsShootModel.editData;
            if (nowsShootModel.nowsExtra.is9To16Ratio) {
                i = 2;
            } else {
                i = 1;
            }
            photoEditData.setRatio(i);
            InterfaceC1647420syK interfaceC1647420syK = (InterfaceC1647420syK) this.LJFF.LJIIL(null, InterfaceC1647420syK.class);
            if (interfaceC1647420syK != null && (c385670FAfHl0 = interfaceC1647420syK.Hl0()) != null && (interfaceC1647520syULIZJ = c385670FAfHl0.LIZJ()) != null) {
                interfaceC1647520syULIZJ.Rz(true);
            }
            creativeModel.nowsShootModel = nowsShootModel;
        }
        if (!C539900LFk.LIZ(this.LJIIIZ) ? !this.LJIIIZ.LJJJJZ() || this.LJIIIZ.LJJIL() : j == 0) {
            z = true;
        } else {
            z = false;
        }
        C1443960ngA.LJIIL(this.LJIIIZ);
        if (j < this.LJIIL && (z || this.LJIIIZ.LJJIIZI())) {
            NowsShootModel nowsShootModel2 = this.LJIIIZ.creativeModel.nowsShootModel;
            if (nowsShootModel2 != null) {
                nowsShootModel2.type = 0;
            }
            this.LJIIZILJ = false;
            if (this.LJIIIZ.LJJIIJZLJL()) {
                c578760Mmw = new C578760Mmw((Boolean) r12, Boolean.TRUE, (Function1) r12, 11);
            } else if (AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled() && (qVar2 = this.LJ) != null && (effectLLILIL2 = qVar2.C0().LLILIL()) != null && C1449600npG.LJFF(effectLLILIL2)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", "willSnapshot");
                    this.LJI.getEffectController().sendEffectMsg(41, 0L, 0L, C786410Ut5.J3(jSONObject));
                } catch (C1633860scS e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c578760Mmw = new C578760Mmw(Boolean.TRUE, (Boolean) r12, new AwS587S0100000_8(this, 792), 5);
            } else if (this.LJIIIZ.creativeModel.aigcOfflineModel.isOfflineAIGCEffectEnabled && (qVar = this.LJ) != null && (effectLLILIL = qVar.C0().LLILIL()) != null && (!C1449600npG.LJIIIIZZ(effectLLILIL))) {
                c578760Mmw = new C578760Mmw(Boolean.TRUE, (Boolean) r12, new AwS587S0100000_8(this, 793), 5);
            } else {
                c578760Mmw = r12;
            }
            this.LJIILLIIL = c578760Mmw;
            if (AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled() && (qVar3 = this.LJ) != null && (effectLLILIL3 = qVar3.C0().LLILIL()) != null && C1449600npG.LJFF(effectLLILIL3)) {
                this.LJI.getEffectController().Tn(this.LJIJ);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), r12, r12, new C579580MoG(this, r12), 3);
                this.LJI.getEffectController().to(this.LJIJ);
            } else {
                this.LJIILJJIL.LIZ(AFwS194S0000000_8.get$arr$(647), new AwS587S0100000_8(this, 788), this.LJIILLIIL);
            }
            if (!C539900LFk.LIZ(this.LJIIIZ)) {
                this.LIZJ.HT1(false);
                return;
            } else {
                this.LJII.ko0(false);
                return;
            }
        }
        NowsShootModel nowsShootModel3 = this.LJIIIZ.creativeModel.nowsShootModel;
        if (nowsShootModel3 != null) {
            nowsShootModel3.type = 2;
        }
        int size = ((ArrayList) this.LJIIJJI).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((InterfaceC579700MoS) ListProtector.get(this.LJIIJJI, i2)).LIZ(c0lzd)) {
                C201955140j.LJIIL("VideoRecordActivity interceptor handle return");
                this.LIZLLL.ko0(false);
                return;
            }
        }
        C201955140j.LJIIL("VideoRecordActivity setHasGoNext true");
        this.LJII.ko0(true);
        j jVar = C524780Ki4.LIZ;
        jVar.start("av_video_edit", "showProgressDialog");
        if (C298330Bmh.LIZ()) {
            jVar.start("av_video_editor_init", "showProgressDialog");
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        if (this.LJIIIZ.LJJLL()) {
            this.LJI.E4(this.LJIIIZ.cameraComponentModel.isMuted);
        }
        if (MusicBeanUtilKt.extractAVMusic(this.LJIIIZ.creativeModel.musicBuzModel) == null) {
            ShortVideoContext shortVideoContext4 = this.LJIIIZ;
            if (shortVideoContext4.mIsFromDraft && shortVideoContext4.creativeModel.musicBuzModel.isDraftMusicIllegal) {
                this.LJI.E4(true);
            }
        }
        jVar.step("av_video_edit", "startConcat");
        C1655760tBm c1655760tBmQd1 = this.LIZJ.qd1();
        c1655760tBmQd1.LIZ = this.LJIIIZ.cameraComponentModel.mWorkspace.LIZIZ().getPath();
        c1655760tBmQd1.LIZIZ = this.LJIIIZ.cameraComponentModel.mWorkspace.LIZ().getPath();
        c1655760tBmQd1.LJ = this.LJI.getMediaController();
        ShortVideoContext shortVideoContext5 = this.LJIIIZ;
        c1655760tBmQd1.LIZLLL = shortVideoContext5.enableSingleSegmentConcatUseCopy;
        c1655760tBmQd1.LJI = true ^ shortVideoContext5.LJJJJLL();
        c1655760tBmQd1.LJII = VEMem.getInstance().inLowMemMode();
        SettingsManager.LIZLLL().getClass();
        c1655760tBmQd1.LJFF = SettingsManager.LIZ("pre_release_gpu_resource", false);
        String path = this.LJIIIZ.cameraComponentModel.mWorkspace.LIZIZ().getPath();
        Integer numValueOf = Integer.valueOf((int) this.LJIIIZ.cameraComponentModel.mTotalRecordingTime);
        Integer numValueOf2 = Integer.valueOf(this.LJIIIZ.cameraComponentModel.mVideoWidth);
        Integer numValueOf3 = Integer.valueOf(this.LJIIIZ.cameraComponentModel.mVideoHeight);
        ?? r122 = r12;
        if (this.LJIIIZ.LJJLL()) {
            r122 = this.LJIIIZ.cameraComponentModel.duetContext.windowInfoList;
        }
        c1655760tBmQd1.LIZJ = C580200MpG.LIZIZ(path, numValueOf, numValueOf2, numValueOf3, r122);
        c1655760tBmQd1.LIZ(new InterfaceC1656000tCA() { // from class: X.0MoC
            @Override // X.InterfaceC1656000tCA
            public final void LIZ(int i3, String str, String str2, String str3) {
                C11NZ c11nzLJJJLZIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiEditLog: concat statusCode");
                sbLIZ.append(i3);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C524780Ki4.LIZ.step("av_video_edit", "concatEnd");
                C579650MoN c579650MoN = new C579650MoN(str, str2, str3, i3);
                C579550MoD c579550MoD = this.LIZ;
                c579550MoD.LIZLLL.Ak().LIZ();
                C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new C2325391G0r(c579550MoD.LJIIIZ, 2));
                ShortVideoContext shortVideoContext6 = c579550MoD.LJIIIZ;
                if (shortVideoContext6.LJJJJLL()) {
                    c11nzLJJJLZIJ = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0MoJ
                        @Override // X.InterfaceC1478005qU
                        public final void subscribe(C09AJ<AbstractC19852312lt<MultiEditVideoStatusRecordData>> c09aj) {
                            C1C7U.LIZ("LighteningGoNextAction@4c30.getMultiEditVideoStatusRecordData$1");
                            c09aj.onNext(AbstractC19852312lt.absent());
                            c09aj.onComplete();
                            C1C7U.LIZIZ("LighteningGoNextAction@4c30.getMultiEditVideoStatusRecordData$1");
                        }
                    });
                } else {
                    c11nzLJJJLZIJ = C11NZ.LJIJJLI(new C581240Mqw(shortVideoContext6, c579550MoD, str3, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                }
                C11NZ.LJLLI(c19482711KfLJIJJLI, c11nzLJJJLZIJ, C11NZ.LJIJJLI(new C581220Mqu(c579650MoN, c579550MoD, 9)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), new InterfaceC953020auK() { // from class: X.0MoQ
                    @Override // X.InterfaceC953020auK
                    public final Object LIZ(Object obj, Object obj2, Object obj3) {
                        return new C579660MoO((AbstractC19852312lt) obj, (AbstractC19852312lt) obj2, obj3);
                    }
                }).LJJLL(new AfS144S0200000_8(c579550MoD, c579650MoN, 10), C2356409Le.LL);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0MoI] */
    public C579550MoD(k kVar, C19EG c19eg, e0 e0Var, C1656050tCF<?> c1656050tCF, ShortVideoContext shortVideoContext, C580090Mp5 c580090Mp5, q qVar, a aVar, InterfaceC1644770su3 interfaceC1644770su3, ln3.a aVar2, InterfaceC1647420syK interfaceC1647420syK, C1DRG c1drg) {
        this.LIZ = kVar;
        this.LIZIZ = c19eg;
        this.LIZJ = e0Var;
        this.LIZLLL = c1656050tCF;
        this.LJ = qVar;
        this.LJFF = c1drg;
        C1664740tQG c1664740tQG = new C1664740tQG(c1drg.LJIILIIL("lazyBeautyFilter", C1645380sv2.class), C1645380sv2.class);
        this.LJIILL = (InterfaceC1648570t0B) c1drg.LJIIL(null, InterfaceC1648570t0B.class);
        this.LJI = e0Var.St2();
        this.LJIILIIL = aVar;
        this.LJIIIZ = shortVideoContext;
        this.LJIIJ = c580090Mp5;
        this.LJII = (ShortVideoContextViewModel) ((ViewModelProvider) c1drg.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        this.LJIILJJIL = new C579620MoK(c19eg, new AwS552S0100000_8(this, 1152), new AwS552S0100000_8(this, 1153), new AwS552S0100000_8(this, 1154), new AwS552S0100000_8(shortVideoContext, 1155), new AwS552S0100000_8(interfaceC1644770su3, 1156), new AwS552S0100000_8(aVar2, 1157), new AwS552S0100000_8(interfaceC1647420syK, 1158), C1622090sJT.LIZ((C1645380sv2) c1664740tQG.getValue(this, LJIJJ[0])), c1drg).LIZ();
        this.LJIJ = new MessageCenter.Listener() { // from class: X.0MoI
            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public final void onMessageReceived(int i, int i2, int i3, String str) {
                if (str == null) {
                    return;
                }
                try {
                    if (JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "event"), "name").equals("startSnapshot") && !this.LL.LJIIZILJ) {
                        this.LL.LJIIZILJ = true;
                        C579550MoD c579550MoD = this.LL;
                        c579550MoD.LJIILJJIL.LIZ(AFwS194S0000000_8.get$arr$(647), new AwS587S0100000_8(c579550MoD, 788), c579550MoD.LJIILLIIL);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }
}
