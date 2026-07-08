package X;

import Y.AObserverS225S0100000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.IAutoCutService;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417240mz4 extends AbstractC2255721DQs<InterfaceC1417110myr> implements InterfaceC1417110myr, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public boolean LLIZLLLIL;
    public C09AE LLJ;
    public boolean LLJI;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public String LLILZ = "";
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public boolean LLJIJIL = true;
    public final InterfaceC1417110myr LLJILJIL = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1417240mz4.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1417240mz4.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1417240mz4.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1417240mz4.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1417240mz4.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILLL = 8;
    }

    @Override // X.InterfaceC1417110myr
    public void f90() {
        this.LLJIJIL = true;
    }

    @Override // X.InterfaceC1417110myr
    public void js0() {
        this.LLJI = false;
    }

    @Override // X.InterfaceC1417110myr
    public void lO0() {
        this.LLJI = true;
    }

    @Override // X.InterfaceC1417110myr
    public void uQ0() {
        this.LLJIJIL = false;
    }

    private final InterfaceC1417050myl o2() {
        return (InterfaceC1417050myl) this.LLILZLL.getValue(this, LLJILJILJ[3]);
    }

    private final InterfaceC1455860nzM w2() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLJILJILJ[2]);
    }

    @Override // X.InterfaceC1417110myr
    public void Ev() {
        if (this.LLILZ.length() > 0) {
            i3(C1417300mzA.LIZ);
        }
    }

    public final InterfaceC377540ErA G2() {
        return (InterfaceC377540ErA) this.LLIZ.getValue(this, LLJILJILJ[4]);
    }

    public final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJILJILJ[0]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLJILJILJ[1]);
    }

    @Override // X.InterfaceC1417110myr
    public void pE0() {
        i3(new AbstractC1417270mz7() { // from class: X.0mz9
        });
    }

    @Override // X.InterfaceC1417110myr
    public void qo() {
        i3(C1417300mzA.LIZ);
    }

    private final void T2() {
        w2().ww2().observe(this, new AObserverS225S0100000_22(this, 39));
    }

    private final boolean W2() {
        if (C1428470nHB.LJJZZI(H2())) {
            return true;
        }
        InterfaceC1417050myl interfaceC1417050mylO2 = o2();
        return (interfaceC1417050mylO2 == null || interfaceC1417050mylO2.XC1(0, C0MJ9.AUTO_CUT) == null) ? false : true;
    }

    private final boolean X1() {
        return H2().creativeModel.onThisDayData.isFromOnThisDay();
    }

    public final void W1() {
        AutoCutModel autoCutModel = H2().creativeModel.autoCutModel;
        C1417160myw c1417160myw = C1417160myw.LIZ;
        C1DRG diContainer = getDiContainer();
        c1417160myw.getClass();
        autoCutModel.templateList.removeAll(C1417160myw.LJIIIZ(autoCutModel));
        InterfaceC1417050myl interfaceC1417050myl = (InterfaceC1417050myl) ((C0ETY) diContainer.LJII(C0ETY.class, null)).MY1(InterfaceC1417050myl.class);
        if (interfaceC1417050myl != null) {
            interfaceC1417050myl.clearCache();
        }
    }

    @Override // X.InterfaceC1417110myr
    public void dZ0() {
        InterfaceC377540ErA interfaceC377540ErAG2 = G2();
        if (interfaceC377540ErAG2 == null || !interfaceC377540ErAG2.isShowing()) {
            i3(C1417280mz8.LIZ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1417050myl interfaceC1417050mylO2;
        super.onCreate();
        T2();
        C1417310mzB c1417310mzB = C0FQV.LIZ;
        if (c1417310mzB != null && (interfaceC1417050mylO2 = o2()) != null) {
            interfaceC1417050mylO2.nL0(0, C0MJ9.AUTO_CUT, c1417310mzB);
        }
        C0FQV.LIZ = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (C1428470nHB.LJJZZI(H2())) {
            C0FQU.LIZ = null;
        } else {
            C0FQV.LIZ = null;
        }
    }

    public InterfaceC1417110myr Z1() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1417240mz4(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1417110myr
    public void gu0(String str) {
        this.LLILZ = str;
    }

    public final void i3(AbstractC1417270mz7 abstractC1417270mz7) {
        int iLJIJ;
        C09AE c09ae;
        if (X1() || (iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_autocut_preloading_since_last_day", true)) <= 0 || System.currentTimeMillis() - ((IAutoCutService) ServiceManager.get().getService(IAutoCutService.class)).LIZIZ() > ((long) iLJIJ) * 86400000 || !this.LLJIJIL || !C1417160myw.LJIJJ(null, H2()) || u4.LJLL(H2())) {
            return;
        }
        C1417160myw c1417160myw = C1417160myw.LIZ;
        VideoPublishEditModel videoPublishEditModelH2 = H2();
        c1417160myw.getClass();
        if (C1417160myw.LJIJI(videoPublishEditModelH2)) {
            return;
        }
        if (C1428470nHB.LJJJZ(H2()) && !C0C64.LJIILLIIL().LJIIIZ(31744, "preload_autocut_data_after_retrive_draft", true, false)) {
            return;
        }
        s.LIZ.getClass();
        if (s.LJJIJIL()) {
            return;
        }
        C844470XAv.LIZ.getClass();
        if (C2188561Al4.LJIIJ(C844470XAv.LIZ()) || !C1697810uHb.LJIIJJI(EnumC1661320tKk.MEDERATE, EnumC1661320tKk.EXCELLENT).contains(C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZ)) {
            return;
        }
        C1417180myy c1417180myyLJII = C1417160myw.LJII(getActivity(), H2(), getDiContainer(), true);
        if (C1417160myw.LJIJJ(null, H2()) && c1417180myyLJII.LIZ != null) {
            if (Intrinsics.LJFF(abstractC1417270mz7, C1417280mz8.LIZ)) {
                if (this.LLIZLLLIL) {
                    return;
                } else {
                    this.LLIZLLLIL = true;
                }
            }
            C09AE c09ae2 = this.LLJ;
            if (c09ae2 != null && c09ae2.isActive() && (c09ae = this.LLJ) != null) {
                c09ae.LIZIZ(null);
            }
            this.LLJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1417250mz5(this, c1417180myyLJII, abstractC1417270mz7, null), 3);
        }
    }

    public final boolean c3(C1417180myy c1417180myy, AbstractC1417270mz7 abstractC1417270mz7) {
        String musicId;
        if (this.LLJI || !this.LLJIJIL) {
            return false;
        }
        if ((H2().isCurrentAutoCutMode() || H2().creativeModel.autoCutModel.isNone) && H2().creativeModel.autoCutModel.requestSource == EnumC1157310gDp.MANUAL.ordinal()) {
            C1417160myw c1417160myw = C1417160myw.LIZ;
            C19EG activity = getActivity();
            VideoPublishEditModel videoPublishEditModelH2 = H2();
            C1DRG diContainer = getDiContainer();
            c1417160myw.getClass();
            return !C1417160myw.LJIILJJIL(activity, videoPublishEditModelH2, diContainer, c1417180myy);
        }
        C1417160myw c1417160myw2 = C1417160myw.LIZ;
        VideoPublishEditModel videoPublishEditModelH22 = H2();
        c1417160myw2.getClass();
        AVMusic aVMusicLJI = C1417160myw.LJI(videoPublishEditModelH22);
        if (abstractC1417270mz7 instanceof C1417280mz8) {
            if (C1417160myw.LJIILJJIL(getActivity(), H2(), getDiContainer(), c1417180myy) && W2()) {
                return false;
            }
        } else {
            if (aVMusicLJI == null || (musicId = aVMusicLJI.getMusicId()) == null) {
                musicId = "";
            }
            if (Intrinsics.LJFF(musicId, this.LLILZ) && C1417160myw.LJIILJJIL(getActivity(), H2(), getDiContainer(), c1417180myy) && W2()) {
                return false;
            }
        }
        return true;
    }
}
