package X;

import Y.AObjectS246S0100000_25;
import android.content.SharedPreferences;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import ln3.a;
import lnn.q;
import lth.o;

/* JADX INFO: renamed from: X.0suk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645200suk extends AbstractC2255721DQs<InterfaceC1645250sup> implements InterfaceC1645250sup, InterfaceC379610EuV {
    public static final C1645240suo LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C1DRG LL;
    public boolean LLJIJIL;
    public C09AE LLJJ;
    public final InterfaceC1645250sup LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final C11NJ LLJILJILJ = new C11NJ();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 321));

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0suo] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645200suk.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1645200suk.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1645200suk.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1645200suk.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1645200suk.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C2217381BqS(C1645200suk.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1645200suk.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new C2217381BqS(C1645200suk.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new C2217381BqS(C1645200suk.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0)};
        LLJJI = new Object() { // from class: X.0suo
        };
    }

    private final a X1() {
        return (a) this.LLJ.getValue(this, LLJJIII[6]);
    }

    private final C1645380sv2 Z1() {
        return (C1645380sv2) this.LLJILJIL.getValue(this, LLJJIII[8]);
    }

    private final C1DHU ep() {
        return (C1DHU) this.LLJILLL.getValue();
    }

    private final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.LLIZ.getValue(this, LLJJIII[4]);
    }

    private final InterfaceC1621970sJH o2() {
        return (InterfaceC1621970sJH) this.LLJI.getValue(this, LLJJIII[7]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLJJIII[0]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJJIII[2]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZLL.getValue(this, LLJJIII[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJJIII[1]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLIZLLLIL.getValue(this, LLJJIII[5]);
    }

    private final boolean G2() {
        Effect effectLLILIL;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent == null || (effectLLILIL = stickerApiComponent.C0().LLILIL()) == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJIILJJIL(effectLLILIL, "share_ar", false);
    }

    private final void q3() {
        getRecordControlApi().yM2().LIZ(this, new AObjectS246S0100000_25(this, 199));
        getRecordControlApi().Ia0().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0sun
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ((LinkedHashMap) C1445570nil.LIZ).clear();
            }
        });
        getRecordControlApi().pU1().LIZ(this, new AObjectS246S0100000_25(this, 200));
        this.LLJILJILJ.LIZ(getRecordControlApi().uM2().LJJLL(new C09JN() { // from class: X.0sul
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecordCompanionLogicComponent@2a1f.setupRecordControlComponent$4");
                if (obj instanceof C1656250tCZ) {
                    C201955140j.LIZJ(C201967140v.LIZIZ, "clearEdit() called");
                    C1439190nYT.LIZJ();
                }
                C1C7U.LIZIZ("RecordCompanionLogicComponent@2a1f.setupRecordControlComponent$4");
            }
        }, C09HN.LIZ));
    }

    private final void v3() {
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        C385670FAf<Boolean> c385670FAfCP1;
        LiveEvent<Boolean> liveEventRm;
        InterfaceC1621970sJH interfaceC1621970sJHO2 = o2();
        if (interfaceC1621970sJHO2 != null && (liveEventRm = interfaceC1621970sJHO2.Rm()) != null) {
            liveEventRm.LIZ(this, new AObjectS246S0100000_25(this, 201));
        }
        InterfaceC1621970sJH interfaceC1621970sJHO22 = o2();
        if (interfaceC1621970sJHO22 != null && (c385670FAfCP1 = interfaceC1621970sJHO22.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 202));
        }
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent == null || (liveEventMa2 = stickerApiComponent.Ma2()) == null) {
            return;
        }
        liveEventMa2.LIZ(this, new AObjectS246S0100000_25(this, 203));
    }

    public final void m3() {
        if (C0CHQ.LIZ().getAccountService().LIZ() || Intrinsics.LJFF(getShortVideoContext().enterFrom, "effect_qr_scan") || getShortVideoContext().shootMode == 15 || getShortVideoContext().creativeModel.draftInfoModel.isDraft) {
            return;
        }
        long j = getShortVideoContext().cameraComponentModel.mMaxDuration;
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putLong("max_duration", j);
        C1499900p8O.LIZ(editorEdit);
        String str = getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath;
        String str2 = getShortVideoContext().cameraComponentModel.duetContext.duetAudioPath;
        SharedPreferences.Editor editorEdit2 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit2.putString("duet_video_path", str);
        editorEdit2.putString("duet_audio_path", str2);
        C1499900p8O.LIZ(editorEdit2);
        StitchParams stitchParams = getShortVideoContext().stitchContext.stitchParams;
        SharedPreferences.Editor editorEdit3 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit3.putString("stitch_params", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), stitchParams));
        C1499900p8O.LIZ(editorEdit3);
        Keva.getRepo("publish").storeString("ame_drafts_2", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), getShortVideoContext().creativeModel.mobileEffectsModel2));
        boolean z = getShortVideoContext().cameraComponentModel.mUseBeautyFace;
        SharedPreferences.Editor editorEdit4 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit4.putInt("face_beauty", z ? 1 : 0);
        C1499900p8O.LIZ(editorEdit4);
        C1439190nYT.LJFF(getShortVideoContext().creativeInfo);
        SharedARModel sharedARModel = getShortVideoContext().sharedARModel;
        String json = (sharedARModel == null || !G2()) ? "" : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), sharedARModel);
        SharedPreferences.Editor editorEdit5 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit5.putString("shared_ar", json);
        C1499900p8O.LIZ(editorEdit5);
        int i = getShortVideoContext().cameraComponentModel.mHardEncode;
        SharedPreferences.Editor editorEdit6 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit6.putInt("hard_encode", i);
        C1499900p8O.LIZ(editorEdit6);
        C1439190nYT.LJII(getShortVideoContext().cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel), getShortVideoContext().cameraComponentModel.mMusicStart);
        C1441190nbh c1441190nbh = getShortVideoContext().cameraComponentModel.mDurings;
        SharedPreferences.Editor editorEdit7 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit7.putString("segment_video", C2350709Iz.LIZ(c1441190nbh));
        C1499900p8O.LIZ(editorEdit7);
        C863370Xtv.LIZ("normal").LIZJ();
        ExtractFramesModel extractFramesModel = ((C1656090tCJ) getCameraApiComponent().yP()).LJIIJJI;
        SharedPreferences.Editor editorEdit8 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit8.putString("shot_extract_frame", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), extractFramesModel));
        C1499900p8O.LIZ(editorEdit8);
        String string = getShortVideoContext().cameraComponentModel.recordContext.filterLabels.toString();
        String string2 = getShortVideoContext().cameraComponentModel.recordContext.filterIds.toString();
        String string3 = getShortVideoContext().cameraComponentModel.recordContext.filterValues.toString();
        SharedPreferences.Editor editorEdit9 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit9.putString("filter_labels", string);
        editorEdit9.putString("filter_ids", string2);
        editorEdit9.putString("filter_values", string3);
        C1499900p8O.LIZ(editorEdit9);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "upload_metadata", true, false)) {
            if (getShortVideoContext().cameraComponentModel.videoRecordMetadata == null) {
                getShortVideoContext().cameraComponentModel.videoRecordMetadata = C1A66.LIZ();
            } else {
                getShortVideoContext().cameraComponentModel.videoRecordMetadata.putAll(C1A66.LIZ());
            }
            Map<String, Object> map = getShortVideoContext().cameraComponentModel.videoRecordMetadata;
            if (map == null || map.isEmpty()) {
                return;
            }
            SharedPreferences.Editor editorEdit10 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
            editorEdit10.putString("video_record_metadata", C178100mJ.LIZJ(map));
            C1499900p8O.LIZ(editorEdit10);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<C1644900suG> liveEventBZ0;
        super.onCreate();
        if (!C1622090sJT.LIZ(Z1())) {
            InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
            if (filterApiComponent != null && (liveEventBZ0 = filterApiComponent.BZ0()) != null) {
                liveEventBZ0.LIZ(this, new AObjectS246S0100000_25(this, 197));
            }
        } else if (getDiContainer().LIZJ(InterfaceC1644770su3.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1644770su3.class, new AwS604S0100000_25(this, 180));
        }
        getCameraApiComponent().p92().LIZ(this, new AObjectS246S0100000_25(this, 198));
        q3();
        v3();
        C1637850sit.LIZ(this, new AwS569S0100000_25(this, 320));
        C0CHQ.LIZ().LJI().LJIJI(new C0M88(getShortVideoContext().creativeModel, getShortVideoContext().shootWay, null));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJILJILJ.LJ();
    }

    public InterfaceC1645250sup W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1645200suk(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void E3(Effect effect) {
        C09AE c09ae = this.LLJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1628710sU9(this, effect, null), 3);
    }

    private final void H2(Effect effect) {
        if (effect.getTags() != null) {
            if (C1622090sJT.LIZ(Z1())) {
                InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) findReadyComponent(this, InterfaceC1644770su3.class);
                if (interfaceC1644770su3 != null) {
                    List<String> tags = effect.getTags();
                    if (tags == null) {
                        tags = new ArrayList<>();
                    }
                    interfaceC1644770su3.yL2(!tags.contains("disable_beautify_filter"), "build_in");
                    return;
                }
                return;
            }
            InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
            if (filterApiComponent == null) {
                return;
            }
            List<String> tags2 = effect.getTags();
            if (tags2 == null) {
                tags2 = new ArrayList<>();
            }
            filterApiComponent.yL2(!tags2.contains("disable_beautify_filter"), "build_in");
        }
    }

    private final void T2(Effect effect) {
        a aVarX1;
        if (C1651050t4B.LIZ() && (aVarX1 = X1()) != null) {
            aVarX1.zh1(getShortVideoContext().cameraComponentModel.mUseBeautyFace, true);
        }
    }

    private final void W2(Effect effect) {
        a aVarX1;
        if (C1651050t4B.LIZ() && (aVarX1 = X1()) != null) {
            aVarX1.zh1(getShortVideoContext().cameraComponentModel.mUseBeautyFace, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1DGz] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private final void i3(Effect effect) {
        E3(effect);
        ?? r4 = -1;
        int i = -1;
        if (effect != null && effect.getTypes().contains("StabilizationOff")) {
            if (ep().LIZ) {
                C1DHU c1dhuEp = ep();
                getActivity();
                c1dhuEp.LIZ = false;
                if (C1DHU.LJ) {
                    i = 0;
                }
                getCameraApiComponent().Zd1().LJIIIIZZ(i, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_SHAKE_FREE_PROP_HAVE_STICKER, null));
                getCameraApiComponent().qh(0);
                return;
            }
            return;
        }
        if (ep().LIZ) {
            return;
        }
        C1DHU c1dhuEp2 = ep();
        getActivity();
        c1dhuEp2.LIZ = true;
        boolean z = C1DHU.LJ;
        boolean z2 = C1DHU.LJFF;
        if (z != z2) {
            r4 = z2;
        }
        getCameraApiComponent().Zd1().LJIIIIZZ(r4, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_SHAKE_FREE_PROP_NOT_STICKER, null));
        getCameraApiComponent().qh(0);
    }

    public final void B3(Effect effect) {
        if (getRecordControlApi().isRecording().LIZJ().booleanValue()) {
            return;
        }
        if (C1624570sNT.LJIJ(effect)) {
            if (getCameraApiComponent().LJLJJLL() != 1) {
                C2253191DGz c2253191DGzZd1 = getCameraApiComponent().Zd1();
                pyl.q qVarLIZ = pyl.q.LIZ();
                qVarLIZ.LIZJ = Boolean.TRUE;
                c2253191DGzZd1.LJII(qVarLIZ, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_PROP_FRONT, null), null);
            }
        } else if (C1624570sNT.LJJIII(effect, "camera_front")) {
            if (getCameraApiComponent().LJLJJLL() != 1) {
                C2253191DGz c2253191DGzZd12 = getCameraApiComponent().Zd1();
                pyl.q qVarLIZ2 = pyl.q.LIZ();
                qVarLIZ2.LIZJ = Boolean.TRUE;
                c2253191DGzZd12.LJII(qVarLIZ2, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_PROP_FRONT, null), null);
            }
        } else if (C1624570sNT.LJJIII(effect, "camera_back")) {
            if (getCameraApiComponent().LJLJJLL() != 0) {
                C2253191DGz c2253191DGzZd13 = getCameraApiComponent().Zd1();
                pyl.q qVarLIZIZ = pyl.q.LIZIZ();
                qVarLIZIZ.LIZJ = Boolean.TRUE;
                c2253191DGzZd13.LJII(qVarLIZIZ, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_PROP_REAR, null), null);
            }
        } else if (C1624570sNT.LJFF(effect) && getCameraApiComponent().LJLJJLL() != 0) {
            C2253191DGz c2253191DGzZd14 = getCameraApiComponent().Zd1();
            pyl.q qVarLIZIZ2 = pyl.q.LIZIZ();
            qVarLIZIZ2.LIZJ = Boolean.TRUE;
            c2253191DGzZd14.LJII(qVarLIZIZ2, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_AR_PROP_REAR, null), null);
        }
        this.LLJIJIL = true;
        boolean z = false;
        if (!C1624570sNT.LJIJ(effect)) {
            if (effect != null && effect.getTypes() != null && effect.getTypes().contains("AR")) {
                z = true;
            }
            z = !z;
        }
        getCameraApiComponent().Ja0(z);
    }

    public final void c3(C1644900suG c1644900suG) {
        if (Intrinsics.LJFF(c1644900suG.LIZIZ.LIZ, "live")) {
            InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
            C1453230nv7.LJI(c1644900suG.LIZ, c1644900suG.LIZIZ.LIZIZ.LJJI());
            interfaceC1655090tAh.getClass();
        }
    }

    public final void w2(AbstractC1627380sS0 abstractC1627380sS0) {
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            Effect effect = ((C1627370sRz) abstractC1627380sS0).LIZ;
            i3(effect);
            if (C1624570sNT.LJFF(effect)) {
                W2(effect);
                return;
            } else if (effect.getTypes().contains("FaceReplace3D")) {
                H2(effect);
                return;
            } else {
                T2(effect);
                return;
            }
        }
        if (abstractC1627380sS0 instanceof C1627360sRy) {
            i3(null);
            T2(null);
            return;
        }
        throw new C1954807lC();
    }
}
