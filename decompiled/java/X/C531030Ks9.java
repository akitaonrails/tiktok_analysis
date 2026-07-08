package X;

import Y.AObjectS241S0100000_8;
import android.text.TextUtils;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Ks9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531030Ks9 extends i<C0LFR, C530550KrN, C530600KrS, C530960Ks2> implements C0LFR, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final a LLJJ;
    public final ShortVideoContext LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public InterfaceC531040KsA LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public int LLJJJ;
    public final C01GW LLJJJIL;
    public final Function0<C530550KrN> LLJJJJ;
    public final Function0<C530600KrS> LLJJJJJIL;
    public final Function0<C530960Ks2> LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C531030Ks9.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C531030Ks9.class, "recordControApi", "getRecordControApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C531030Ks9.class, "vtFlowApiComponent", "getVtFlowApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/VideoTemplateFlowApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    public final void R5() {
    }

    @Override // X.C0LFR
    public void pt2(boolean z) {
    }

    private final InterfaceC1648570t0B O4() {
        return (InterfaceC1648570t0B) this.LLJJIJIIJIL.getValue(this, LLJJL[1]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJIII.getValue(this, LLJJL[0]);
    }

    private final InterfaceC531050KsB k5() {
        return (InterfaceC531050KsB) this.LLJJIJIL.getValue(this, LLJJL[2]);
    }

    private final void n5() {
        ArrayList arrayList;
        CameraSlotModel cameraSlotModel = this.LLJJI.creativeModel.templateData.getCameraSlotModel();
        if (cameraSlotModel != null) {
            int slotIndex = cameraSlotModel.getSlotIndex();
            ArrayList<CutSameVideoImageExtraData> arrayListU6 = u6(cameraSlotModel.getTemplateSlots());
            ArrayList<MediaModel> mediaList = cameraSlotModel.getMediaList();
            if (mediaList != null) {
                arrayList = new ArrayList();
                Iterator<MediaModel> it2 = mediaList.iterator();
                while (it2.hasNext()) {
                    TikTokMediaModel tikTokMediaModelH4 = H4(it2.next());
                    if (tikTokMediaModelH4 != null) {
                        arrayList.add(tikTokMediaModelH4);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayListLIZ = C09HN.LIZ(arrayList);
            if (arrayListLIZ == null) {
                arrayListLIZ = new ArrayList();
            }
            int minVideoOrPhotoCount = cameraSlotModel.getMinVideoOrPhotoCount();
            if (minVideoOrPhotoCount > 0) {
                this.LLJJJ = minVideoOrPhotoCount;
            }
            i3(new C530610KrT(cameraSlotModel, slotIndex, arrayListU6, arrayListLIZ));
            U5(slotIndex);
            N5(arrayListLIZ);
        }
    }

    private final void nD1() {
        LiveEvent<TimeSpeedModelExtension> liveEventYM2;
        this.LLJJ.va().LIZ(this, new AObjectS241S0100000_8(this, 23));
        InterfaceC1648570t0B interfaceC1648570t0BO4 = O4();
        if (interfaceC1648570t0BO4 == null || (liveEventYM2 = interfaceC1648570t0BO4.yM2()) == null) {
            return;
        }
        liveEventYM2.LIZ(this, new AObjectS241S0100000_8(this, 24));
    }

    private final void t5() {
        if (this.LLJJIJI == null && getDiContainer().LIZJ(InterfaceC531040KsA.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC531040KsA.class, new AwS587S0100000_8(this, 226));
        }
    }

    public final void C5() {
        InterfaceC531040KsA interfaceC531040KsA;
        InterfaceC531040KsA interfaceC531040KsA2 = this.LLJJIJI;
        if (interfaceC531040KsA2 == null || !interfaceC531040KsA2.Fh() || (interfaceC531040KsA = this.LLJJIJI) == null) {
            return;
        }
        interfaceC531040KsA.VX();
    }

    public final void J6() {
        C118300cf c118300cf = new C118300cf();
        int iLIZIZ = C0LEO.LIZIZ();
        C1546210qL5.LIZ.getClass();
        c118300cf.element = iLIZIZ - C814420VxA.LIZIZ(C1546210qL5.LIZ(49));
        if (C1462920oAk.LIZLLL()) {
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            c118300cf.element = c1660590tJZ != null ? c1660590tJZ.LIZIZ() : 0;
        }
        i3(new AwS587S0100000_8(c118300cf, 228));
    }

    public final C530550KrN P4() {
        return (C530550KrN) this.LLJJJIL.getValue();
    }

    private final int K4() {
        List<CutSameVideoImageExtraData> listD5;
        int iLLLLLJIL = P4().LLLLLJIL();
        if (iLLLLLJIL < 0 || (listD5 = d5()) == null || iLLLLLJIL >= listD5.size()) {
            return 0;
        }
        return iLLLLLJIL;
    }

    private final float T4() {
        int iZ4 = Z4();
        List<CutSameVideoImageExtraData> listD5 = d5();
        if (iZ4 < 0 || iZ4 >= listD5.size()) {
            return 0.0f;
        }
        return ((CutSameVideoImageExtraData) ListProtector.get(listD5, iZ4)).extraDuration;
    }

    private final int Z4() {
        C375830EoP<Integer> c375830EoP = T2().LIZLLL;
        if (c375830EoP != null) {
            return c375830EoP.LIZ.intValue();
        }
        return -1;
    }

    private final List<CutSameVideoImageExtraData> d5() {
        C530530KrL c530530KrL;
        ArrayList<CutSameVideoImageExtraData> arrayList;
        C375830EoP<C530530KrL> c375830EoP = T2().LIZ;
        return (c375830EoP == null || (c530530KrL = c375830EoP.LIZ) == null || (arrayList = c530530KrL.LIZJ) == null) ? C13BV.INSTANCE : arrayList;
    }

    public final void D5() {
        EventBus.LIZLLL().LJIILL(new C522440KeI(oB2(), VO1(), true));
    }

    @Override // X.C0LFR
    public void Fo0() {
        if (P4().LLLLLJIL() >= 0) {
            i3(AFwS239S0000000_8.get$arr$(108));
        }
    }

    @Override // X.C0LFR
    public int VO1() {
        return P4().LLLLLJIL();
    }

    @Override // X.C0LFR
    public CutSameVideoImageExtraData fg0() {
        CutSameVideoImageExtraData cutSameVideoImageExtraData;
        int iK4 = K4();
        List<CutSameVideoImageExtraData> listD5 = d5();
        if (listD5 == null || (cutSameVideoImageExtraData = (CutSameVideoImageExtraData) C13LP.LJJJLZIJ(iK4, listD5)) == null) {
            return null;
        }
        return cutSameVideoImageExtraData;
    }

    @Override // X.C0LFR
    public List<TikTokMediaModel> oB2() {
        List<TikTokMediaModel> selectedMediaModels;
        C530520KrK c530520KrK = P4().LLJJJJ;
        return (c530520KrK == null || (selectedMediaModels = c530520KrK.getSelectedMediaModels()) == null) ? C13BV.INSTANCE : selectedMediaModels;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        t5();
        nD1();
    }

    @Override // ge.i
    public Function0<C530550KrN> E3() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C530600KrS> o2() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C530960Ks2> w2() {
        return this.LLJJJJLIIL;
    }

    private final boolean F4(List<? extends TikTokMediaModel> list) {
        int i;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<? extends TikTokMediaModel> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((!x5(it2.next())) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (i >= this.LLJJJ) {
            return true;
        }
        return false;
    }

    private final TikTokMediaModel H4(MediaModel mediaModel) {
        C530020KqW c530020KqWLIZ;
        if (getDiContainer() == null || (c530020KqWLIZ = (C530020KqW) getDiContainer().LJIIL(null, C530020KqW.class)) == null) {
            c530020KqWLIZ = C527250Km3.LIZ();
        }
        TikTokMediaModel.Companion.getClass();
        return C527240Km2.LIZJ(c530020KqWLIZ, mediaModel);
    }

    private final void N5(List<? extends TikTokMediaModel> list) {
        boolean z;
        S5(F4(list));
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : list) {
            if (true ^ x5(tikTokMediaModel)) {
                arrayList.add(tikTokMediaModel);
            }
        }
        if (arrayList.size() >= d5().size() && d5().size() > 0) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC531050KsB interfaceC531050KsBK5 = k5();
        if (interfaceC531050KsBK5 != null) {
            interfaceC531050KsBK5.dG1(!z);
        }
        i3(new AwS587S0100000_8(this, 227));
    }

    private final void Or1(boolean z) {
        super.show();
        S5(false);
        if (z) {
            n5();
        }
    }

    private final void S5(boolean z) {
        i3(new AwS23S0010000_8(z, 9));
    }

    private final void U5(int i) {
        List<TikTokMediaModel> selectedMediaModels;
        i3(new AwS23S0001000_8(i, 7));
        if (this.LLJJI.creativeModel.templateData.getCameraSlotModel().getSlotIndex() != i) {
            this.LLJJI.creativeModel.templateData.getCameraSlotModel().setSlotIndex(i);
        }
        CutSameVideoImageExtraData cutSameVideoImageExtraData = (CutSameVideoImageExtraData) C13LP.LJJJLZIJ(i, d5());
        if (cutSameVideoImageExtraData != null) {
            C530520KrK c530520KrK = P4().LLJJJJ;
            if (c530520KrK == null || (selectedMediaModels = c530520KrK.getSelectedMediaModels()) == null) {
                selectedMediaModels = C13BV.INSTANCE;
            }
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(i, selectedMediaModels);
            K6(i, cutSameVideoImageExtraData);
            m6(cutSameVideoImageExtraData, tikTokMediaModel);
        }
    }

    private final ArrayList<CutSameVideoImageExtraData> u6(ArrayList<VideoTemplateSlot> arrayList) {
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<VideoTemplateSlot> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C531600Kt4.LIZ(it2.next(), this.LLJJI));
        }
        ArrayList<CutSameVideoImageExtraData> arrayListLIZ = C09HN.LIZ(arrayList2);
        if (arrayListLIZ == null) {
            return new ArrayList<>();
        }
        return arrayListLIZ;
    }

    private final boolean x5(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return true;
        }
        if (!C530690Krb.LIZIZ(tikTokMediaModel) && TextUtils.isEmpty(tikTokMediaModel.LJFF()) && TextUtils.isEmpty(tikTokMediaModel.thumbnail)) {
            return true;
        }
        return false;
    }

    public final void M5(List<? extends TikTokMediaModel> list) {
        N5(list);
    }

    @Override // X.C0LFR
    public void Xf2(boolean z) {
        i3(new AwS23S0010000_8(z, 8));
    }

    public C531030Ks9(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = (a) getDiContainer().LJII(a.class, null);
        this.LLJJI = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC531050KsB.class, null);
        this.LLJJJ = -1;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 334));
        this.LLJJJJ = new AwS552S0100000_8(this, 336);
        this.LLJJJJJIL = AFwS194S0000000_8.get$arr$(167);
        this.LLJJJJLIIL = new AwS552S0100000_8(this, 335);
    }

    private final void K6(int i, CutSameVideoImageExtraData cutSameVideoImageExtraData) {
        this.LLJJI.creativeModel.templateData.getCameraSlotModel().setSlotIndex(i);
        long j = cutSameVideoImageExtraData.extraDuration;
        if (j > 0) {
            this.LLJJI.LJJLIIIJJI(j);
            InterfaceC1648570t0B interfaceC1648570t0BO4 = O4();
            if (interfaceC1648570t0BO4 != null) {
                interfaceC1648570t0BO4.ht1(new C531060KsC(j));
            }
        }
    }

    private final void m6(CutSameVideoImageExtraData cutSameVideoImageExtraData, TikTokMediaModel tikTokMediaModel) {
        String tag;
        if (tikTokMediaModel == null) {
            return;
        }
        if (C528080KnO.LIZ(tikTokMediaModel)) {
            InterfaceC531040KsA interfaceC531040KsA = this.LLJJIJI;
            if (interfaceC531040KsA != null) {
                interfaceC531040KsA.VX();
            }
            boolean zLJFF = Intrinsics.LJFF(cutSameVideoImageExtraData.materialType, "video");
            if (!Intrinsics.LJFF(cutSameVideoImageExtraData.materialType, "image")) {
                if (!zLJFF) {
                    gq().JN0(true);
                    return;
                }
            } else {
                if (!zLJFF) {
                    tag = EnumC1647570syZ.RECORD_NOW.getTag();
                }
                gq().gj(tag, true);
                gq().JN0(false);
                return;
            }
            tag = "record_custom_duration_video";
            gq().gj(tag, true);
            gq().JN0(false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String strLJFF = tikTokMediaModel.LJFF();
        String musicPath = this.LLJJI.getMusicPath();
        ShortVideoContext shortVideoContext = this.LLJJI;
        arrayList.add(new C539860LFg(strLJFF, musicPath, (int) shortVideoContext.cameraComponentModel.mMaxDuration, (int) shortVideoContext.LJIILJJIL(), this.LLJJI.cameraComponentModel.musicEndTime, Boolean.valueOf(tikTokMediaModel.LJIILJJIL()), 128));
        InterfaceC531040KsA interfaceC531040KsA2 = this.LLJJIJI;
        if (interfaceC531040KsA2 == null) {
            return;
        }
        interfaceC531040KsA2.QW1(arrayList, false);
    }

    public final void E5(List<C539860LFg> list, boolean z) {
        InterfaceC531040KsA interfaceC531040KsA = this.LLJJIJI;
        if (interfaceC531040KsA != null) {
            interfaceC531040KsA.QW1(list, z);
        }
    }

    @Override // X.C0LFR
    public void P91(Boolean bool, String str) {
        C0L91 c0l91;
        boolean z;
        int iLLLLLJIL = P4().LLLLLJIL();
        if (iLLLLLJIL < 0) {
            return;
        }
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            c0l91 = C0L91.VIDEO;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            c0l91 = C0L91.IMAGE;
        } else if (bool == null) {
            if (Intrinsics.LJFF(C0CHQ.LIZ().LJIILL().getMediaTypeCache(str), bool2)) {
                c0l91 = C0L91.IMAGE;
            } else {
                c0l91 = C0L91.VIDEO;
            }
        } else {
            throw new C1954807lC();
        }
        if (c0l91 == C0L91.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
        mediaModel.extra = "from_record";
        mediaModel.relativePath = str;
        mediaModel.LJIILL(str);
        mediaModel.date = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (z) {
            Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(str);
            mediaModel.duration = 3000L;
            mediaModel.width = pairLIZJ.getFirst().intValue();
            mediaModel.height = pairLIZJ.getSecond().intValue();
            mediaModel.type = 1;
        } else {
            VideoFileInfo videoFileInfoLJIIJ = C571500MbE.LJIIJ(str);
            mediaModel.width = videoFileInfoLJIIJ.getWidth();
            mediaModel.height = videoFileInfoLJIIJ.getHeight();
            mediaModel.duration = videoFileInfoLJIIJ.getDuration();
            mediaModel.startTime = 0;
            mediaModel.endTime = (int) videoFileInfoLJIIJ.getDuration();
            mediaModel.fps = videoFileInfoLJIIJ.getFps();
            mediaModel.type = 4;
        }
        TikTokMediaModel tikTokMediaModelH4 = H4(mediaModel);
        tikTokMediaModelH4.isFromRecord = true;
        if (fg0() != null) {
            i3(new AwS116S0101000_8(iLLLLLJIL, tikTokMediaModelH4, 4));
        }
    }

    @Override // X.C0LFR
    public void pi1(boolean z, boolean z2) {
        if (z) {
            if (isShowing()) {
                return;
            }
            Or1(z2);
            return;
        }
        hide();
    }

    public final void v5(int i, boolean z) {
        List<TikTokMediaModel> selectedMediaModels;
        int iLLLLLJIL = P4().LLLLLJIL();
        CutSameVideoImageExtraData cutSameVideoImageExtraData = (CutSameVideoImageExtraData) C13LP.LJJJLZIJ(iLLLLLJIL, d5());
        if (cutSameVideoImageExtraData != null) {
            C530520KrK c530520KrK = P4().LLJJJJ;
            if (c530520KrK == null || (selectedMediaModels = c530520KrK.getSelectedMediaModels()) == null) {
                selectedMediaModels = C13BV.INSTANCE;
            }
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(iLLLLLJIL, selectedMediaModels);
            K6(iLLLLLJIL, cutSameVideoImageExtraData);
            m6(cutSameVideoImageExtraData, tikTokMediaModel);
        }
    }
}
