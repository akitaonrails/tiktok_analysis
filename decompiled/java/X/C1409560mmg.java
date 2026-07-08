package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS129S0101000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409560mmg extends i<InterfaceC1409590mmj, C0FNC, C0FNG, C0FNL> implements InterfaceC1409590mmj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public static final int LLLIIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public C0FNC LLJJ;
    public final Function0<C0FNG> LLJJI;
    public final Function0<C0FNL> LLJJIII;
    public final InterfaceC1409590mmj LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public CopyOnWriteArrayList<InspirationItemData> LLJLIL;
    public CopyOnWriteArrayList<InspirationItemData> LLJLILLLLZIIL;
    public CopyOnWriteArrayList<String> LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public EnumC1409600mmk LLJZIJLIL;
    public int LLL;
    public final C01GW LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;

    public final void E5() {
        this.LLJLLIL = true;
        InterfaceC1453410nvP interfaceC1453410nvPT5 = t5();
        if (interfaceC1453410nvPT5 != null) {
            interfaceC1453410nvPT5.Qf0();
        }
        C01GW c01gw = C1409580mmi.LIZ;
        ((Keva) c01gw.getValue()).storeInt("key_close_count", ((Keva) c01gw.getValue()).getInt("key_close_count", 0) + 1);
        Z4().oW(false);
        hide();
        C201955140j.LIZJ(C1421590n65.LIZIZ, "onCloseClick close autoRefresh");
        C1409620mmm.LIZLLL(v5(), EnumC1409650mmp.EDIT_BOTTOM, this.LLJZIJLIL, "close", "slide");
    }

    @Override // ge.i
    public int H3() {
        return R.anim.iq;
    }

    public final boolean R5() {
        return S5(false);
    }

    public final void u6() {
        int iH7;
        LiveData<C1456890o11> liveDataYh;
        InterfaceC1451050nrb interfaceC1451050nrbP4;
        LiveData<C1456890o11> liveDataYh2;
        C1456890o11 value;
        if (S5(true)) {
            if (this.LLLI || this.LLLII) {
                C201955140j.LIZJ(C1421590n65.LIZIZ, "inspiration data is changing return");
                return;
            }
            InterfaceC1451050nrb interfaceC1451050nrbP42 = P4();
            if (interfaceC1451050nrbP42 != null && (liveDataYh = interfaceC1451050nrbP42.Yh()) != null && liveDataYh.getValue() != null && (interfaceC1451050nrbP4 = P4()) != null && (liveDataYh2 = interfaceC1451050nrbP4.Yh()) != null && (value = liveDataYh2.getValue()) != null && !value.LIZ) {
                C201955140j.LIZJ(C1421590n65.LIZIZ, "setting hide, not show slide panel");
                return;
            }
            InterfaceC1460000o62 interfaceC1460000o62X5 = x5();
            if (interfaceC1460000o62X5 != null && interfaceC1460000o62X5.fi1()) {
                C201955140j.LIZJ(C1421590n65.LIZIZ, "toolbar expand, not show slide panel");
                this.LLLFZ = true;
                return;
            }
            if (this.LLJLIL.isEmpty() || this.LLJLILLLLZIIL.isEmpty()) {
                C201955140j.LIZJ(C1421590n65.LIZIZ, "inspiration data is empty return");
                hide();
                return;
            }
            InterfaceC1451050nrb interfaceC1451050nrbP43 = P4();
            if (interfaceC1451050nrbP43 != null) {
                iH7 = interfaceC1451050nrbP43.h7();
                if (iH7 == 0) {
                    this.LLJZIJLIL = EnumC1409600mmk.TITLE;
                    m6();
                }
                this.LLL = iH7;
                Z4().oW(true);
            }
            iH7 = -1;
            this.LLJZIJLIL = EnumC1409600mmk.IDEAS;
            d6();
            this.LLL = iH7;
            Z4().oW(true);
        }
    }

    @Override // ge.i
    public int v3() {
        return R.anim.ip;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1409560mmg.class, "publishedEditModel", "getPublishedEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1409560mmg.class, "inspirationDataApi", "getInspirationDataApi()Lcom/ss/android/ugc/aweme/image/inspiration/data/IImageInspirationDataApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1409560mmg.class, "imageEditPreviewApi", "getImageEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1409560mmg.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1409560mmg.class, "progressApi", "getProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1409560mmg.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1409560mmg.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1409560mmg.class, "editStickerScene", "getEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerScene;", 0);
        c09r3.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLLIIL = 8;
    }

    private final InterfaceC1461660o8i O4() {
        return (InterfaceC1461660o8i) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final InterfaceC1451050nrb P4() {
        return (InterfaceC1451050nrb) this.LLJJJ.getValue(this, LLLIIIL[2]);
    }

    private final InterfaceC1441090nbX T4() {
        return (InterfaceC1441090nbX) this.LLJJJJJIL.getValue(this, LLLIIIL[5]);
    }

    private final void d6() {
        C201955140j.LIZJ(C1421590n65.LIZIZ, "showIdeasInspirationSlidePanel");
        show();
        this.LLJLLL = false;
        InterfaceC1451050nrb interfaceC1451050nrbP4 = P4();
        i3(new AwS129S0101000_22(this, interfaceC1451050nrbP4 != null ? interfaceC1451050nrbP4.h7() : 1, 1));
        if (this.LLLIIIIL) {
            return;
        }
        this.LLLIIIIL = true;
        C1409620mmm.LJ(v5(), EnumC1409650mmp.EDIT_BOTTOM, EnumC1409600mmk.IDEAS);
    }

    private final void m6() {
        C201955140j.LIZJ(C1421590n65.LIZIZ, "showTitleInspirationSlidePanel");
        show();
        this.LLJLLL = false;
        i3(new AwS601S0100000_22(this, 111));
        if (this.LLLIIII) {
            return;
        }
        this.LLLIIII = true;
        C1409620mmm.LJ(v5(), EnumC1409650mmp.EDIT_BOTTOM, EnumC1409600mmk.TITLE);
    }

    private final InterfaceC1453410nvP t5() {
        return (InterfaceC1453410nvP) this.LLJJJJ.getValue(this, LLLIIIL[4]);
    }

    private final VideoPublishEditModel v5() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue(this, LLLIIIL[0]);
    }

    public final boolean C5() {
        return this.LLJZ || C545820Lau.LJ(this.LLJILJILJ);
    }

    @Override // ge.i
    public Function0<C0FNC> E3() {
        return new AwS566S0100000_22(this, 144);
    }

    public final void N5() {
        String effectId;
        if (this.LLJZIJLIL == EnumC1409600mmk.TITLE) {
            InspirationItemData inspirationItemData = (InspirationItemData) C13LP.LJJJLZIJ(this.LLLFF + 1, this.LLJLIL);
            if (inspirationItemData == null) {
                return;
            } else {
                effectId = inspirationItemData.getEffectId();
            }
        } else {
            InspirationItemData inspirationItemData2 = (InspirationItemData) C13LP.LJJJLZIJ(this.LLLFF + 1, this.LLJLILLLLZIIL);
            if (inspirationItemData2 == null) {
                return;
            } else {
                effectId = inspirationItemData2.getEffectId();
            }
        }
        if (effectId != null) {
            d5().LJFF(effectId);
        }
    }

    public final C1462070o9N N51() {
        return (C1462070o9N) this.LLJL.getValue(this, LLLIIIL[7]);
    }

    public final InterfaceC1409500mma Z4() {
        return (InterfaceC1409500mma) this.LLJJIJIL.getValue(this, LLLIIIL[1]);
    }

    public final C0FMH d5() {
        return (C0FMH) this.LLJJL.getValue();
    }

    public final InterfaceC1450920nrO k5() {
        return (InterfaceC1450920nrO) this.LLJJJJLIIL.getValue(this, LLLIIIL[6]);
    }

    public final int n5() {
        return ((Number) this.LLLF.getValue()).intValue();
    }

    public final InterfaceC1460000o62 x5() {
        return (InterfaceC1460000o62) this.LLJJJIL.getValue(this, LLLIIIL[3]);
    }

    private final void nD1() {
        LiveData<Boolean> liveDataPy1;
        LiveData<Integer> currentState;
        LiveData<C1456890o11> liveDataYh;
        LiveData<Integer> liveDataUA1;
        C560530Lyd<Unit> c560530LydHb2;
        C560530Lyd<Unit> c560530LydAN0;
        LiveData<Boolean> liveDataPV1;
        MutableLiveData<Integer> mutableLiveDataOr2;
        InterfaceC1441090nbX interfaceC1441090nbXT4 = T4();
        if (interfaceC1441090nbXT4 != null && (mutableLiveDataOr2 = interfaceC1441090nbXT4.Or2()) != null) {
            mutableLiveDataOr2.observe(this, new AObserverS225S0100000_22(this, 18));
        }
        InterfaceC1451050nrb interfaceC1451050nrbP4 = P4();
        if (interfaceC1451050nrbP4 != null && (liveDataPV1 = interfaceC1451050nrbP4.PV1()) != null) {
            liveDataPV1.observe(this, new AObserverS225S0100000_22(this, 19));
        }
        Z4().vI2().LIZ(this, new AObjectS245S0100000_22(this, 24));
        InterfaceC1441090nbX interfaceC1441090nbXT42 = T4();
        if (interfaceC1441090nbXT42 != null && (c560530LydAN0 = interfaceC1441090nbXT42.AN0()) != null) {
            c560530LydAN0.LIZ(this, new AObjectS245S0100000_22(this, 25));
        }
        InterfaceC1441090nbX interfaceC1441090nbXT43 = T4();
        if (interfaceC1441090nbXT43 != null && (c560530LydHb2 = interfaceC1441090nbXT43.hb2()) != null) {
            c560530LydHb2.LIZ(this, new AObjectS245S0100000_22(this, 26));
        }
        Z4().Ad().LIZ(this, new AObjectS245S0100000_22(this, 27));
        Z4().BM0().LIZ(this, new AObjectS245S0100000_22(this, 28));
        InterfaceC1451050nrb interfaceC1451050nrbP42 = P4();
        if (interfaceC1451050nrbP42 != null && (liveDataUA1 = interfaceC1451050nrbP42.UA1()) != null) {
            liveDataUA1.observe(this, new AObserverS225S0100000_22(this, 20));
        }
        InterfaceC1451050nrb interfaceC1451050nrbP43 = P4();
        if (interfaceC1451050nrbP43 != null && (liveDataYh = interfaceC1451050nrbP43.Yh()) != null) {
            liveDataYh.observe(this, new AObserverS225S0100000_22(this, 21));
        }
        InterfaceC1460000o62 interfaceC1460000o62X5 = x5();
        if (interfaceC1460000o62X5 != null && (currentState = interfaceC1460000o62X5.getCurrentState()) != null) {
            currentState.observe(this, new AObserverS225S0100000_22(this, 16));
        }
        InterfaceC1460000o62 interfaceC1460000o62X52 = x5();
        if (interfaceC1460000o62X52 == null || (liveDataPy1 = interfaceC1460000o62X52.Py1()) == null) {
            return;
        }
        liveDataPy1.observe(this, new AObserverS225S0100000_22(this, 17));
    }

    public final void D5() {
        try {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1409550mmf(this, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1421590n65.LIZIZ, "slide inspiration loadDataAndShow: error", e);
        }
    }

    public final void H5() {
        VideoPublishEditModel videoPublishEditModelV5 = v5();
        EnumC1409650mmp enumC1409650mmp = EnumC1409650mmp.EDIT_BOTTOM;
        C1409620mmm.LIZJ(videoPublishEditModelV5, enumC1409650mmp, this.LLJZIJLIL);
        InterfaceC1453410nvP interfaceC1453410nvPT5 = t5();
        if (interfaceC1453410nvPT5 != null) {
            interfaceC1453410nvPT5.Qf0();
        }
        C1462070o9N c1462070o9NN51 = N51();
        if (c1462070o9NN51 != null) {
            C1462070o9N.LLLZLL(c1462070o9NN51, new C388340FKm(AFwS210S0000000_22.get$arr$(83), new C388280FKg(C0FKC.ONLY_PANEL, enumC1409650mmp)), null, 2);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C201955140j.LIZJ(C1421590n65.LIZIZ, "onDestroy");
        this.LLJZ = true;
        d5().LJ();
        C0FNC c0fnc = this.LLJJ;
        if (c0fnc != null) {
            c0fnc.onDestroyView();
        }
    }

    public InterfaceC1409590mmj K4() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FNG> o2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FNL> w2() {
        return this.LLJJIII;
    }

    private final boolean S5(boolean z) {
        boolean z2;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        if (this.LLJLLIL) {
            C201955140j.LIZJ(C1421590n65.LIZIZ, "hasClosedPanel, not show slide panel in this creation flow");
            return false;
        }
        boolean zLJIILLIIL = C357540E0a.LJIILLIIL(C1664590tQ1.LJIIIZ(this));
        C1453810nw3.LIZ.getClass();
        if (((Boolean) C1453810nw3.LIZIZ.getValue()).booleanValue() && ((Boolean) C278950AwX.LIZ.getValue()).booleanValue() && ((Boolean) C0AKA.LIZ.getValue()).booleanValue() && ((Keva) C1409580mmi.LIZ.getValue()).getInt("key_close_count", 0) < 3 && C1428470nHB.LJLIIL(v5()) && (imageAlbumData = v5().getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() >= 2 && !zLJIILLIIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2 && F4(this.LLJLL)) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check label && shouldShowSlidePanel: ");
            sbLIZ.append(z2);
            sbLIZ.append(" isSmallScreen: ");
            sbLIZ.append(zLJIILLIIL);
            C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJLLL) {
            C1421590n65 c1421590n652 = C1421590n65.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("has not show slide && shouldShowSlidePanel: ");
            sbLIZ2.append(z2);
            C201955140j.LIZJ(c1421590n652, C2188811AlT.LIZIZ(sbLIZ2));
            if (!z2) {
                return false;
            }
            if ((v5().hasTextSticker() || v5().hasText()) && !v5().mIsFromDraft) {
                return false;
            }
            return true;
        }
        C1421590n65 c1421590n653 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("shouldShowSlidePanel: ");
        sbLIZ3.append(z2);
        C201955140j.LIZJ(c1421590n653, C2188811AlT.LIZIZ(sbLIZ3));
        return z2;
    }

    public final boolean F4(List<String> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((List) C0BZC.LIZIZ.getValue()).contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void H4(int i) {
        i3(new AwS35S0001000_22(i, 5));
        if (i == this.LLLFF) {
            C354270Duj.LIZ(0L, new AwS566S0100000_22(this, 142));
        }
    }

    public final void J6(C1409380mmO c1409380mmO) {
        this.LLJLIL.clear();
        this.LLJLIL.addAll(c1409380mmO.LIZIZ);
        this.LLJLILLLLZIIL.clear();
        this.LLJLILLLLZIIL.addAll(c1409380mmO.LIZ);
        this.LLJLL.clear();
        this.LLJLL.addAll(c1409380mmO.LIZJ);
    }

    public final void M5(int i) {
        final InspirationItemData inspirationItemData;
        this.LLLFF = i;
        if (this.LLJZIJLIL == EnumC1409600mmk.TITLE) {
            inspirationItemData = (InspirationItemData) C13LP.LJJJLZIJ(i, this.LLJLIL);
        } else {
            inspirationItemData = (InspirationItemData) C13LP.LJJJLZIJ(i, this.LLJLILLLLZIIL);
        }
        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickItem :");
        sbLIZ.append(inspirationItemData);
        C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        if (inspirationItemData == null) {
            return;
        }
        InterfaceC1453410nvP interfaceC1453410nvPT5 = t5();
        if (interfaceC1453410nvPT5 != null) {
            interfaceC1453410nvPT5.Qf0();
        }
        d5().LIZIZ(i, inspirationItemData, new C0FMP() { // from class: X.0mmh
            @Override // X.C0FMP
            public final void LIZ(int i2) {
                if (this.LIZ.C5()) {
                    return;
                }
                this.LIZ.H4(i2);
            }

            @Override // X.C0FMP
            public final void LIZIZ(int i2) {
                if (this.LIZ.C5()) {
                    return;
                }
                this.LIZ.i3(new AwS35S0001000_22(i2, 6));
            }

            @Override // X.C0FMP
            public final void LIZJ(int i2, C0FMO c0fmo) {
                if (this.LIZ.C5()) {
                    return;
                }
                this.LIZ.i3(new AwS35S0001000_22(i2, 7));
                if (this.LIZ.LLLFF == i2) {
                    ((Keva) C1409580mmi.LIZ.getValue()).storeInt("key_close_count", 0);
                    C1462070o9N c1462070o9NN51 = this.LIZ.N51();
                    if (c1462070o9NN51 != null) {
                        C1462070o9N.LLLZLL(c1462070o9NN51, new C388340FKm(new AwS266S0300000_22(this.LIZ, c0fmo, inspirationItemData, 1), new C388280FKg(C0FKC.EDITOR, EnumC1409650mmp.EDIT_BOTTOM)), null, 2);
                    }
                    this.LIZ.N5();
                }
            }
        });
        C1409620mmm.LIZIZ(v5(), EnumC1409650mmp.EDIT_BOTTOM, this.LLJZIJLIL, Integer.valueOf(i + 1), inspirationItemData.getTitle().length() + inspirationItemData.getContent().length());
    }

    public C1409560mmg(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJI = AFwS191S0000000_5.get$arr$(38);
        this.LLJJIII = new AwS549S0100000_5(this, 54);
        this.LLJJIJI = this;
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1409500mma.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 53));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 143));
        this.LLJL = new C1466810oH1(this, 12);
        this.LLJLIL = new CopyOnWriteArrayList<>();
        this.LLJLILLLLZIIL = new CopyOnWriteArrayList<>();
        this.LLJLL = new CopyOnWriteArrayList<>();
        this.LLJLLL = true;
        this.LLJZIJLIL = EnumC1409600mmk.NONE;
        this.LLL = -1;
        this.LLLF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(39));
        this.LLLFF = -1;
    }
}
