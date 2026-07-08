package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571990Mc1 extends AbstractC2255721DQs<InterfaceC572090McB> implements InterfaceC379610EuV, InterfaceC572090McB {
    public static final C572040Mc6 LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public C09AE LLJILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 404));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0CSK.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC572080McA.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), C0CSH.class, null);
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 405));
    public final MutableLiveData<Boolean> LLJJ = new MutableLiveData<>();
    public final MutableLiveData<String> LLJJI = new MutableLiveData<>();

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Mc6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C571990Mc1.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C571990Mc1.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/texttoimage/TextToImageEditPreviewApi;", 0), new C2217381BqS(C571990Mc1.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C571990Mc1.class, "editContainerComponent", "getEditContainerComponent()Lcom/ss/android/ugc/aweme/texttoimage/editcontainer/TextToImageEditContainerApiComponent;", 0), new C2217381BqS(C571990Mc1.class, "generateCover", "getGenerateCover()Lcom/ss/android/ugc/aweme/texttoimage/IGenerateCover;", 0)};
        LLJJIII = new Object() { // from class: X.0Mc6
        };
        LLJJIJIIJIL = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    @Override // X.InterfaceC572090McB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E91() {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C571990Mc1.E91():void");
    }

    public InterfaceC572090McB X1() {
        return this;
    }

    private final InterfaceC572080McA Z1() {
        return (InterfaceC572080McA) this.LLIZLLLIL.getValue(this, LLJJIJI[3]);
    }

    public final C0CSH G2() {
        return (C0CSH) this.LLJ.getValue(this, LLJJIJI[4]);
    }

    public final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJIJI[0]);
    }

    public final AbstractC214814194y T2() {
        return (AbstractC214814194y) this.LLIZ.getValue(this, LLJJIJI[2]);
    }

    public final void W2() {
        if (this.LLJILJILJ == null) {
            C1403010mc7.LIZ.getMusicService().dl();
            C1458410o3T.LJIIJJI(true);
        }
        FlowDataMusicInfo flowDataMusicInfo = H2().creativeModel.creativeFlowData.getFlowDataMusicInfo();
        if ((flowDataMusicInfo == null || flowDataMusicInfo.isSelectedByAuto()) && !Intrinsics.LJFF(this.LLJILJILJ, H2().creativeModel.text2ImageModel.text) && !H2().creativeModel.draftInfoModel.isDraft) {
            C1403010mc7.LIZ.getMusicService().dl();
            C1458410o3T.LJIIJJI(true);
            MusicBeanUtilKt.updateAVMusic(H2().creativeModel.musicBuzModel, null);
            H2().setMMusicPath(null);
        }
        this.LLJILJILJ = String.valueOf(H2().creativeModel.text2ImageModel.text);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILZ.getValue();
    }

    public final InterfaceC572020Mc4 o2() {
        return (InterfaceC572020Mc4) this.LLJI.getValue();
    }

    public final C0CSK w2() {
        return (C0CSK) this.LLILZLL.getValue(this, LLJJIJI[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(this.LLILLL, new C572100McC(getDiContainer()), "nextbartag");
    }

    @Override // X.InterfaceC572090McB
    public LiveData<Boolean> Up() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC572090McB
    public boolean WE() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC572090McB
    public boolean ZY() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC572090McB
    public LiveData<String> getShowToast() {
        return this.LLJJI;
    }

    private final EnumC572000Mc2 W1(String str) {
        if (a0.LJJJIL(str)) {
            return EnumC572000Mc2.BLANK;
        }
        if (str.length() > 250) {
            return EnumC572000Mc2.OUT_OF_LIMIT;
        }
        return EnumC572000Mc2.VALID;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    @Override // X.InterfaceC572090McB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x92(android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C571990Mc1.x92(android.view.View):void");
    }

    public C571990Mc1(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }

    public final C09AE c3(float f, int i, DialogC1390150mHN dialogC1390150mHN, int i2, int i3) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C314960CWg(i, i3, f, dialogC1390150mHN, null), 2);
    }
}
