package X;

import Y.AObserverS225S0100000_22;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428430nH7 extends AbstractC1664470tPp<InterfaceC1451320ns2, C1428440nH8, C1428380nH2> implements InterfaceC1451320ns2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final h0<Unit> LLIZ;
    public final C385670FAf<Unit> LLIZLLLIL;
    public final C01GW LLJ;
    public final C1424090nA7 LLJI;
    public final C01GW LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final Function0<C1428440nH8> LLJILLL;
    public final Function0<C1428380nH2> LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1428430nH7.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1428430nH7.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIII = 8;
    }

    public InterfaceC1451320ns2 q3() {
        return this;
    }

    private final C1428330nGx E3() {
        return (C1428330nGx) this.LLJIJIL.getValue();
    }

    private final void Xi() {
        InterfaceC1451050nrb interfaceC1451050nrbV3;
        MutableLiveData<Boolean> mutableLiveDataGJ;
        if (!this.LLILZLL || (interfaceC1451050nrbV3 = v3()) == null || (mutableLiveDataGJ = interfaceC1451050nrbV3.gJ()) == null) {
            return;
        }
        C0EHK.LJIIJ(mutableLiveDataGJ, this, new AObserverS225S0100000_22(this, 24));
    }

    private final InterfaceC1451050nrb v3() {
        return (InterfaceC1451050nrb) this.LLJILJILJ.getValue(this, LLJJI[1]);
    }

    public final InterfaceC1428340nGy B3() {
        return (InterfaceC1428340nGy) this.LLJ.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJILJIL.getValue(this, LLJJI[0]);
    }

    @Override // X.InterfaceC1451320ns2
    public boolean LJJII() {
        return E3().isVisible();
    }

    @Override // X.InterfaceC1451320ns2
    public void N30() {
        if (E3().LLJJJJLIIL && E3().isVisible() && this.LLILZ.isAdded(E3())) {
            E3().LLJJJJLIIL = false;
            C385200F8k.LIZ("PhotoTemplateComponent", "PhotoTemplateComponent delayHideScene");
            this.LLILZ.hide(E3());
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        q3();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1451320ns2
    public C385670FAf<Unit> nV0() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1428440nH8> o2() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1428380nH2> w2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1451320ns2
    public void oh2(boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPhotoTemplatePanel ");
        sbLIZ.append(z);
        C385200F8k.LIZ("PhotoTemplateComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!B3().init()) {
            Activity activity = this.LLILZ.mActivity;
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131830093);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (!this.LLILZ.isAdded(E3())) {
            this.LLILZ.add(this.LLILZIL, E3(), "PhotoTemplateComponent");
        }
        C1428330nGx c1428330nGxE3 = E3();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1428330nGx.LLLIIII;
        c1428330nGxE3.LLLLLZ(null, z);
        if (z) {
            C1412270mr3 c1412270mr3 = C1412270mr3.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c1412270mr3.getClass();
            C0LAB c0lab = new C0LAB();
            C1412270mr3.LIZIZ(editModel, c0lab);
            c0lab.LIZ(editModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
            if (!C573570MeZ.LIZJ(editModel) && !C573570MeZ.LIZIZ(editModel)) {
                i = 0;
            } else {
                i = 1;
            }
            c0lab.LIZ(i, "is_pic_frame_single_pic_edit");
            if (C573570MeZ.LIZJ(editModel) || C573570MeZ.LIZIZ(editModel)) {
                c0lab.LIZ(1, "pic_cnt");
                c0lab.LJ("content_type", "multi_photo");
            }
            int i2 = editModel.creativeModel.imageEditModel.livePicCnt;
            if (i2 > 0) {
                c0lab.LIZ(i2, "live_pic_cnt");
            }
            C1413430msv.LIZ(editModel, c0lab);
            C1413430msv.LIZLLL(editModel, c0lab);
            C1413430msv.LIZIZ(editModel, c0lab);
            C1413430msv.LJFF(editModel, c0lab);
            C580270MpN.LJIILIIL(editModel, c0lab, "click_photo_template_entrance");
            C572310McX.LJ(editModel, c0lab);
            c0lab.LIZ(editModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("click_photo_template_entrance", c0lab.LIZ);
        }
    }

    public C1428430nH7(C1DRG c1drg, C19A3 c19a3, int i, boolean z) {
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
        this.LLILZIL = i;
        this.LLILZLL = z;
        h0<Unit> h0Var = new h0<>(null);
        this.LLIZ = h0Var;
        this.LLIZLLLIL = h0Var;
        this.LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 149));
        this.LLJI = new C1424090nA7();
        this.LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 150));
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJILLL = AFwS210S0000000_22.get$arr$(86);
        this.LLJJ = new AwS566S0100000_22(this, 151);
    }
}
