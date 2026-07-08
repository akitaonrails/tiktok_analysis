package X;

import Y.AComparatorS41S0000000_22;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462520oA6 extends AbstractC2255721DQs<InterfaceC1456910o13> implements InterfaceC1456910o13, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public static final int LLLIIII;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final C364440EQo LLILZ;
    public String LLILZLL;
    public final h0<List<CaptionUtterance>> LLJILJIL;
    public final C385670FAf<List<CaptionUtterance>> LLJILJILJ;
    public final C560530Lyd<Long> LLJILLL;
    public final LiveEvent<Long> LLJJ;
    public final C560530Lyd<Unit> LLJJI;
    public final LiveEvent<Unit> LLJJIII;
    public AbstractC2217051Bpv LLJJIJI;
    public final MutableLiveData<Integer> LLJJIJIIJIL;
    public final MutableLiveData<Integer> LLJJIJIL;
    public final MutableLiveData<Integer> LLJJJ;
    public final MutableLiveData<Integer> LLJJJIL;
    public final MutableLiveData<Pair<String, Integer>> LLJJJJ;
    public final MutableLiveData<Pair<String, Integer>> LLJJJJJIL;
    public final MutableLiveData<Integer> LLJJJJLIIL;
    public final MutableLiveData<Integer> LLJJL;
    public final MutableLiveData<Unit> LLJJLIIIJLLLLLLLZ;
    public final LiveData<Unit> LLJL;
    public final MutableLiveData<Unit> LLJLIL;
    public final LiveData<Unit> LLJLILLLLZIIL;
    public final C560530Lyd<List<TextStickerData>> LLJLL;
    public final LiveEvent<List<TextStickerData>> LLJLLIL;
    public final C560530Lyd<Unit> LLJLLL;
    public final LiveEvent<Unit> LLJZ;
    public final MutableLiveData<Pair<String, Boolean>> LLJZIJLIL;
    public final LiveData<Pair<String, Boolean>> LLL;
    public final C560530Lyd<Unit> LLLF;
    public final LiveEvent<Unit> LLLFF;
    public final MutableLiveData<C364440EQo> LLLFFI;
    public final LiveData<C364440EQo> LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 744));
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final MutableLiveData<Boolean> LLJIJIL = new MutableLiveData<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462520oA6.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1462520oA6.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1462520oA6.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1462520oA6.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1462520oA6.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLLIIII = 8;
    }

    public InterfaceC1456910o13 W1() {
        return this;
    }

    private final EditCaptionScene G2() {
        return (EditCaptionScene) this.LLILZIL.getValue();
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLIZLLLIL.getValue(this, LLLII[1]);
    }

    private final C1451630nsX o2() {
        return (C1451630nsX) this.LLJI.getValue(this, LLLII[3]);
    }

    private final InterfaceC19530111b1 w2() {
        return (InterfaceC19530111b1) this.LLLI.getValue(this, LLLII[4]);
    }

    @Override // X.InterfaceC1456910o13
    public void As2() {
        this.LLJJLIIIJLLLLLLLZ.setValue(Unit.LIZ);
    }

    public final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLJ.getValue(this, LLLII[2]);
    }

    @Override // X.InterfaceC1456910o13
    public void cn2() {
        this.LLLF.LJIIJ(Unit.LIZ);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLLII[0]);
    }

    @Override // X.InterfaceC1456910o13
    public void hide() {
        this.LLILLJJLI.hide(G2());
        EditCaptionScene.LLLZZIL(G2(), false);
        C1451630nsX c1451630nsXO2 = o2();
        if (c1451630nsXO2 != null) {
            c1451630nsXO2.LIZIZ(AFwS261S0000000_22.get$arr$(223));
        }
        InterfaceC19530111b1 interfaceC19530111b1W2 = w2();
        if (interfaceC19530111b1W2 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1W2, false, false, false, null, false, 30);
        }
    }

    @Override // X.InterfaceC1456910o13
    public void hz() {
        this.LLJLIL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1456910o13
    public void n80() {
        AbstractC2217051Bpv abstractC2217051Bpv = this.LLJJIJI;
        if (abstractC2217051Bpv != null) {
            abstractC2217051Bpv.LJIILL();
        }
    }

    @Override // X.InterfaceC1456910o13
    public void pQ0() {
        this.LLJJI.LJIIJ(null);
    }

    @Override // X.InterfaceC1456910o13
    public boolean sj1() {
        AbstractC2217051Bpv abstractC2217051Bpv = this.LLJJIJI;
        return abstractC2217051Bpv != null && abstractC2217051Bpv.LJI();
    }

    private final InterfaceC1461660o8i H2() {
        return X1().AT().LIZJ();
    }

    private final C0FVT T2() {
        InterfaceC1461660o8i interfaceC1461660o8iH2 = H2();
        if (interfaceC1461660o8iH2 != null) {
            return interfaceC1461660o8iH2.kR();
        }
        return null;
    }

    @Override // X.InterfaceC1456910o13
    public void Rw() {
        ArrayList<TextStickerData> arrayListQT1;
        ArrayList<StickerItemModel> arrayList;
        ArrayList<StickerItemModel> arrayList2;
        if (!u4.LJLJLJ(getEditModel()) || getEditModel().creativeModel.inlineCaptionModel == null) {
            return;
        }
        InterfaceC1461660o8i interfaceC1461660o8iH2 = H2();
        if (interfaceC1461660o8iH2 != null) {
            arrayListQT1 = interfaceC1461660o8iH2.qT1();
            if (arrayListQT1 != null) {
                C13LP.LJLLLL(new AComparatorS41S0000000_22(9), arrayListQT1);
            }
        } else {
            arrayListQT1 = null;
        }
        Xp2(arrayListQT1);
        if (arrayListQT1 == null) {
            getEditModel().creativeModel.inlineCaptionModel = null;
            return;
        }
        if (C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            return;
        }
        InlineCaptionModel inlineCaptionModel = getEditModel().creativeModel.inlineCaptionModel;
        if (inlineCaptionModel != null && (arrayList2 = inlineCaptionModel.utterances) != null) {
            arrayList2.clear();
        }
        int size = arrayListQT1.size();
        for (int i = 0; i < size; i++) {
            InlineCaptionModel inlineCaptionModel2 = getEditModel().creativeModel.inlineCaptionModel;
            if (inlineCaptionModel2 != null && (arrayList = inlineCaptionModel2.utterances) != null) {
                arrayList.add(C0F7Y.LIZ((TextStickerData) ListProtector.get(arrayListQT1, i), i));
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C366800EZq.LIZIZ = new C11NJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C11NJ c11nj = C366800EZq.LIZIZ;
        if (c11nj != null) {
            c11nj.dispose();
        }
        C366800EZq.LIZIZ = null;
    }

    @Override // X.InterfaceC1456910o13
    public LiveEvent<Unit> BH1() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1456910o13
    public LiveEvent<Unit> EI2() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1456910o13
    public MutableLiveData<Integer> Gl() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveData<Boolean> Jy1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveData<Unit> Kp2() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveEvent<List<TextStickerData>> OR() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1456910o13
    public MutableLiveData<Integer> Rv() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1456910o13
    public MutableLiveData<Pair<String, Integer>> Vn() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveData<Unit> b91() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveEvent<Long> bi0() {
        return this.LLJJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveData<Pair<String, Boolean>> nW0() {
        return this.LLL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveEvent<Unit> ri1() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1456910o13
    public AbstractC2217051Bpv rw1() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1456910o13
    public C385670FAf<List<CaptionUtterance>> sF() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1456910o13
    public MutableLiveData<Integer> tk() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1456910o13
    public LiveData<C364440EQo> vh1() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1456910o13
    public void Dt1(NLEModel nLEModel) {
        AbstractC2217051Bpv abstractC2217051Bpv = this.LLJJIJI;
        if (abstractC2217051Bpv != null) {
            abstractC2217051Bpv.LJII(nLEModel);
        }
    }

    @Override // X.InterfaceC1456910o13
    public void Hs1(boolean z) {
        this.LLJIJIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1456910o13
    public void M8(int i) {
        this.LLJJIJIIJIL.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1456910o13
    public void O32(boolean z) {
        InterfaceC1455610nyx interfaceC1455610nyx;
        if (!getEditModel().hasMusic()) {
            if (z && (interfaceC1455610nyx = (InterfaceC1455610nyx) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1460000o62.class)) != null) {
                interfaceC1455610nyx.refresh();
            }
            this.LLJLLL.LJIIJ(null);
            return;
        }
        String musicId = getEditModel().getMusicId();
        if (musicId != null && musicId.length() != 0) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isLocalMusic()) {
                return;
            }
            C366800EZq.LIZIZ(getEditModel().getMusicId(), new AwS108S0110000_22(this, z, 10));
        }
    }

    @Override // X.InterfaceC1456910o13
    public void RG2(ArrayList<TextStickerData> arrayList) {
        this.LLJLL.LJIIJ(arrayList);
    }

    @Override // X.InterfaceC1456910o13
    public void SI(Pair<String, Integer> pair) {
        this.LLJJJJ.setValue(pair);
    }

    @Override // X.InterfaceC1456910o13
    public void TC1(long j) {
        this.LLJILLL.LJIIJ(Long.valueOf(j));
    }

    @Override // X.InterfaceC1456910o13
    public void Xf(int i) {
        this.LLJJJ.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1456910o13
    public void Xp2(ArrayList<TextStickerData> arrayList) {
        String str;
        C364440EQo c364440EQo = this.LLILZ;
        InlineCaptionModel inlineCaptionModel = getEditModel().creativeModel.inlineCaptionModel;
        if (inlineCaptionModel == null || (str = inlineCaptionModel.selectLanguage) == null) {
            str = "";
        }
        c364440EQo.LJ(str, arrayList, null, null);
    }

    @Override // X.InterfaceC1456910o13
    public void Z30(C364440EQo c364440EQo) {
        this.LLLFFI.setValue(c364440EQo);
    }

    @Override // X.InterfaceC1456910o13
    public void iW(String str) {
        this.LLILZLL = str;
        if (this.LLILLJJLI.isAdded(G2())) {
            this.LLILLJJLI.show(G2());
        }
        G2();
        EditCaptionScene.LLLZZIL(G2(), true);
        C1451630nsX c1451630nsXO2 = o2();
        if (c1451630nsXO2 != null) {
            c1451630nsXO2.LIZIZ(AFwS261S0000000_22.get$arr$(224));
        }
        InterfaceC19530111b1 interfaceC19530111b1W2 = w2();
        if (interfaceC19530111b1W2 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1W2, true, false, false, null, false, 30);
        }
    }

    @Override // X.InterfaceC1456910o13
    public void z6(int i) {
        this.LLJJJJLIIL.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1456910o13
    public void eN1(List<CaptionUtterance> list, boolean z) {
        if (z || !Intrinsics.LJFF(this.LLJILJIL.LIZJ(), list) || !Intrinsics.LJFF(C363730ENv.LIZLLL(getEditModel()), list)) {
            this.LLJILJIL.LJII(list);
        }
    }

    @Override // X.InterfaceC1456910o13
    public void s02(VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM) {
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc;
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            InterfaceC1452170ntP interfaceC1452170ntPLJJ = null;
            if (interfaceC1455860nzM != null && (abstractC1452680nuEGc = interfaceC1455860nzM.gc()) != null) {
                interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
            }
            if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
                c1463670oBx.LIZJ();
            }
        }
        this.LLJJIJI = new C2217061Bpw(videoPublishEditModel);
    }

    public C1462520oA6(C1DRG c1drg, C19A3 c19a3, int i, C364440EQo c364440EQo) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = c364440EQo;
        h0<List<CaptionUtterance>> h0Var = new h0<>(null);
        this.LLJILJIL = h0Var;
        this.LLJILJILJ = h0Var;
        C560530Lyd<Long> c560530Lyd = new C560530Lyd<>();
        this.LLJILLL = c560530Lyd;
        this.LLJJ = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJI = c560530Lyd2;
        this.LLJJIII = c560530Lyd2;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LLJJIJIIJIL = mutableLiveData;
        this.LLJJIJIL = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJJ = mutableLiveData2;
        this.LLJJJIL = mutableLiveData2;
        MutableLiveData<Pair<String, Integer>> mutableLiveData3 = new MutableLiveData<>();
        this.LLJJJJ = mutableLiveData3;
        this.LLJJJJJIL = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.LLJJJJLIIL = mutableLiveData4;
        this.LLJJL = mutableLiveData4;
        MutableLiveData<Unit> mutableLiveData5 = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = mutableLiveData5;
        this.LLJL = mutableLiveData5;
        MutableLiveData<Unit> mutableLiveData6 = new MutableLiveData<>();
        this.LLJLIL = mutableLiveData6;
        this.LLJLILLLLZIIL = mutableLiveData6;
        C560530Lyd<List<TextStickerData>> c560530Lyd3 = new C560530Lyd<>();
        this.LLJLL = c560530Lyd3;
        this.LLJLLIL = c560530Lyd3;
        C560530Lyd<Unit> c560530Lyd4 = new C560530Lyd<>();
        this.LLJLLL = c560530Lyd4;
        this.LLJZ = c560530Lyd4;
        MutableLiveData<Pair<String, Boolean>> mutableLiveData7 = new MutableLiveData<>();
        this.LLJZIJLIL = mutableLiveData7;
        this.LLL = mutableLiveData7;
        C560530Lyd<Unit> c560530Lyd5 = new C560530Lyd<>();
        this.LLLF = c560530Lyd5;
        this.LLLFF = c560530Lyd5;
        MutableLiveData<C364440EQo> mutableLiveData8 = new MutableLiveData<>();
        this.LLLFFI = mutableLiveData8;
        this.LLLFZ = mutableLiveData8;
        this.LLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
    }
}
