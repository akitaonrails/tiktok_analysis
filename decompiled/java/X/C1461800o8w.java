package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import ge.i;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS11S1001000_22;
import kotlin.jvm.internal.AwS137S1200000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nv7.c0;

/* JADX INFO: renamed from: X.0o8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461800o8w extends i<InterfaceC1441090nbX, C12G1, C12G7, C1461890o95> implements InterfaceC1441090nbX, InterfaceC379610EuV {
    public static final C1461830o8z LLLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public static final int LLLILZLLLI;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C1462760oAU LLJJ;
    public final int LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public C09AE LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public final MutableLiveData<Integer> LLJLIL;
    public final MutableLiveData<Integer> LLJLILLLLZIIL;
    public final C560530Lyd<Integer> LLJLL;
    public final C560530Lyd<Integer> LLJLLIL;
    public final C560530Lyd<Unit> LLJLLL;
    public final C560530Lyd<Unit> LLJZ;
    public final C560530Lyd<Unit> LLJZIJLIL;
    public final C560530Lyd<Unit> LLL;
    public SafeHandler LLLF;
    public final C1461820o8y LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public Function0<Unit> LLLII;
    public C12G1 LLLIIII;
    public boolean LLLIIIIL;
    public final Function0<C12G7> LLLIIIL;
    public final Function0<C1461890o95> LLLIIL;
    public boolean LLLIILIL;
    public List<? extends View> LLLIL;

    private final boolean x5() {
        return true;
    }

    public final void P6(boolean z) {
    }

    @Override // X.InterfaceC1441090nbX
    public void he1() {
        this.LLLIIIIL = true;
        Tr(false);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0o8z] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461800o8w.class, "imageAlbumData", "getImageAlbumData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0);
        C13LE.LIZ.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1461800o8w.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1461800o8w.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0), new C2217381BqS(C1461800o8w.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0), new C2217381BqS(C1461800o8w.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0), new C2217381BqS(C1461800o8w.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1461800o8w.class, "mixEditingAssetsApi", "getMixEditingAssetsApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0), new C2217381BqS(C1461800o8w.class, "autoCutPreloadingApi", "getAutoCutPreloadingApi()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0), new C2217381BqS(C1461800o8w.class, "collageApi", "getCollageApi()Lcom/ss/android/ugc/aweme/image/collage/ImageCollageApi;", 0), new C2217381BqS(C1461800o8w.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0)};
        LLLILZ = new Object() { // from class: X.0o8z
        };
        LLLILZLLLI = 8;
    }

    private final InterfaceC1417110myr H4() {
        return (InterfaceC1417110myr) this.LLJJJJJIL.getValue(this, LLLILZJ[7]);
    }

    private final InterfaceC1460000o62 P4() {
        return (InterfaceC1460000o62) this.LLJJJIL.getValue(this, LLLILZJ[5]);
    }

    private final void S6() {
        C12G3 c12g3LJ;
        C1446760nkg.LIZ.getClass();
        if (C1446760nkg.LIZJ()) {
            String creationId = n5().creativeModel.creativeInfo.getCreationId();
            if (!(!a0.LJJJIL(creationId)) || creationId == null) {
                return;
            }
            this.LLJL = creationId;
            AICoverPluginService.LIZ.getClass();
            AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
            if (aICoverPluginServiceLIZ == null || (c12g3LJ = aICoverPluginServiceLIZ.LJ(n5(), creationId)) == null) {
                return;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJJLIIIJLLLLLLLZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2353109Jx(c12g3LJ, this, null), 3);
        }
    }

    private final InterfaceC1453410nvP Z4() {
        return (InterfaceC1453410nvP) this.LLJJIJIL.getValue(this, LLLILZJ[3]);
    }

    private final InterfaceC1450920nrO d5() {
        return (InterfaceC1450920nrO) this.LLJJL.getValue(this, LLLILZJ[9]);
    }

    private final InterfaceC1414530muh k5() {
        return (InterfaceC1414530muh) this.LLJJJJ.getValue(this, LLLILZJ[6]);
    }

    private final InterfaceC578430MmP t5() {
        return (InterfaceC578430MmP) this.LLJJJ.getValue(this, LLLILZJ[4]);
    }

    @Override // ge.i
    public Function0<C12G1> E3() {
        return new AwS566S0100000_22(this, 202);
    }

    public final InterfaceC1452390ntl K4() {
        return (InterfaceC1452390ntl) this.LLJJJJLIIL.getValue(this, LLLILZJ[8]);
    }

    public final InterfaceC1451050nrb O4() {
        return (InterfaceC1451050nrb) this.LLJJIJIIJIL.getValue(this, LLLILZJ[2]);
    }

    public final ImageAlbumData T4() {
        return (ImageAlbumData) this.LLJJIII.getValue(this, LLLILZJ[0]);
    }

    @Override // X.InterfaceC1441090nbX
    public int dU1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C12G1 c12g1 = this.LLLIIII;
        if (c12g1 == null) {
            return 0;
        }
        RecyclerView recyclerView = c12g1.LLJJJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Integer numValueOf = Integer.valueOf((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) ? 0 : marginLayoutParams.topMargin);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final VideoPublishEditModel n5() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLLILZJ[1]);
    }

    public final boolean v5() {
        return this.LLJJ.LLLIZZ;
    }

    private final void Xi() {
        O4().Yh().observe(this, new AObjectS245S0100000_22(this, 41));
        Z4().Zm0().observe(this, new AObserverS225S0100000_22(this, 35));
    }

    public final boolean D5() {
        U5();
        C0L1G c0l1g = C0L1G.LIZ;
        ImageAlbumData imageAlbumDataT4 = T4();
        c0l1g.getClass();
        if (!C0L1G.LIZ(imageAlbumDataT4)) {
            String strLJI = C20642515q3.LJI(2131826406);
            C533730KwV.LIZ.getClass();
            String strJ4 = C786410Ut5.j4(strLJI, Arrays.copyOf(new Object[]{Integer.valueOf(C533730KwV.LJII())}, 1));
            C1389890mGx c1389890mGx = new C1389890mGx(C1664590tQ1.LJII(this));
            c1389890mGx.LJIIJ(strJ4);
            c1389890mGx.LJIIJJI();
            return false;
        }
        boolean z = u4.LJJJJI(n5()) && !C1428470nHB.LJJJZ(n5());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click addImage creationId = ");
        sbLIZ.append(n5().getCreationId());
        sbLIZ.append(" open album");
        C1450070nq1.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C0L1H.LIZ(C0L1H.LIZ, C1664590tQ1.LJII(this), n5(), false, C295670BiP.LIZ(), z, true, null, 68);
        return true;
    }

    public final boolean H5() {
        InterfaceC1460000o62 interfaceC1460000o62P4 = P4();
        if (interfaceC1460000o62P4 == null || !interfaceC1460000o62P4.fi1() || !C0C64.LJIILLIIL().LJIIIZ(31744, "photo_toolbar_collapse_optimize", true, false)) {
            return false;
        }
        InterfaceC1460000o62 interfaceC1460000o62P42 = P4();
        if (interfaceC1460000o62P42 != null) {
            interfaceC1460000o62P42.bo();
        }
        return true;
    }

    public final boolean M5() {
        U5();
        C0L1H.LIZ(C0L1H.LIZ, C1664590tQ1.LJII(this), n5(), true, C295670BiP.LIZ(), false, false, null, 112);
        return true;
    }

    public final void U5() {
        Z4().pause(false);
        Z4().Qf0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    @Override // ge.i, X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r9 = this;
            super.onCreate()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.n5()
            boolean r0 = X.C573570MeZ.LIZJ(r0)
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L37
            X.01GW r0 = X.C280010AyF.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L37
            X.0mvL r1 = X.C1414930mvL.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.n5()
            r1.getClass()
            boolean r0 = X.C1414930mvL.LJII(r0, r7)
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.n5()
            boolean r0 = X.C1441980ncy.LIZIZ(r0)
            if (r0 == 0) goto L47
        L37:
            boolean r0 = r9.x5()
            if (r0 == 0) goto L4e
            r9.LLLFZ = r8
            r9.Tr(r8)
            r9.N6(r8)
            r9.LLLFZ = r7
        L47:
            r9.Xi()
            r9.S6()
            return
        L4e:
            X.0o8y r0 = r9.LLLFF
            r0.getClass()
            com.bytedance.keva.Keva r6 = X.C1461820o8y.LIZIZ
            java.lang.String r5 = "thumbnail_has_shown_times"
            int r4 = r6.getInt(r5, r7)
            X.0C64 r3 = X.C0C64.LJIILLIIL()
            r2 = 31744(0x7c00, float:4.4483E-41)
            r1 = 3
            java.lang.String r0 = "edit_thumbnail_show_times"
            int r0 = r3.LJIJ(r2, r1, r0, r8)
            if (r4 >= r0) goto L86
            r0 = 1
        L6b:
            r9.LLLFZ = r0
            if (r0 == 0) goto L88
            r9.Tr(r8)
            r9.N6(r8)
            r9.LLLFZ = r7
            X.0o8y r0 = r9.LLLFF
            r0.getClass()
            int r0 = r6.getInt(r5, r7)
            int r0 = r0 + 1
            r6.storeInt(r5, r0)
            goto L47
        L86:
            r0 = 0
            goto L6b
        L88:
            r9.N6(r7)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1461800o8w.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C09AE c09ae = this.LLJJLIIIJLLLLLLLZ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        String str = this.LLJL;
        if (str != null) {
            AICoverPluginService.LIZ.getClass();
            AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
            if (aICoverPluginServiceLIZ != null) {
                aICoverPluginServiceLIZ.LIZJ(n5(), str);
            }
        }
        this.LLJL = null;
        this.LLLII = null;
    }

    @Override // X.InterfaceC1441090nbX
    public C560530Lyd<Unit> AN0() {
        return this.LLL;
    }

    @Override // X.InterfaceC1441090nbX
    public C560530Lyd<Integer> Ad() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1441090nbX
    public boolean LJJII() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1441090nbX
    public MutableLiveData<Integer> Or2() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1441090nbX
    public boolean Xh1() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1441090nbX
    public C560530Lyd<Unit> hb2() {
        return this.LLJZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12G7> o2() {
        return this.LLLIIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1461890o95> w2() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1441090nbX
    public List<View> zN0() {
        return this.LLLIL;
    }

    private final void N6(boolean z) {
        i3(new AwS35S0010000_22(z, 10));
    }

    private final void R5(boolean z) {
        this.LLJLLL.LJIIIZ(Unit.LIZ);
        if (z) {
            C2487409ou.LIZLLL(600L, new ARunnableS122S0100000_22(this, 27));
        } else {
            C1456140nzo.LIZIZ(O4(), true, false, false, false, 12);
        }
        this.LLLFFI = false;
    }

    public final void C5(int i) {
        this.LLJZIJLIL.LJIIIZ(Unit.LIZ);
        U5();
        this.LLLFFI = true;
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.REPLACE.ordinal()));
        C1456140nzo.LIZIZ(O4(), false, false, false, false, 12);
    }

    public final void F4(int i) {
        O4().LLLZLL(i);
        LLLZLL(i);
    }

    public final SingleImageData J6(int i) {
        List<SingleImageData> imageList = T4().getImageList();
        if (imageList.isEmpty()) {
            return null;
        }
        return (SingleImageData) C13LP.LJJJLZIJ(C13LZ.LJ(i, 0, imageList.size() - 1), imageList);
    }

    public final int K6(SingleImageData singleImageData) {
        String path;
        String path2;
        if (singleImageData == null) {
            return -1;
        }
        String id = singleImageData.getId();
        if (id == null || !(!a0.LJJJIL(id))) {
            id = null;
        }
        SrcImageInfo srcImageInfo = singleImageData.getSrcImageInfo();
        if (srcImageInfo == null || (path = srcImageInfo.getPath()) == null || !(!a0.LJJJIL(path))) {
            path = null;
        }
        int i = 0;
        for (SingleImageData singleImageData2 : T4().getImageList()) {
            if (singleImageData2 != singleImageData && (id == null || !Intrinsics.LJFF(singleImageData2.getId(), id))) {
                if (path != null) {
                    SrcImageInfo srcImageInfo2 = singleImageData2.getSrcImageInfo();
                    if (srcImageInfo2 != null) {
                        path2 = srcImageInfo2.getPath();
                    } else {
                        path2 = null;
                    }
                    if (Intrinsics.LJFF(path2, path)) {
                    }
                }
                i++;
            }
            return i;
        }
        return -1;
    }

    public final void L6(List<? extends View> list) {
        ls2(list);
    }

    @Override // X.InterfaceC1441090nbX
    public void LLLZ(List<C12GP> list) {
        i3(new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 133));
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.ADD.ordinal()));
    }

    @Override // X.InterfaceC1441090nbX
    public void LLLZLL(int i) {
        i3(new AwS35S0001000_22(i, 8));
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.DELETE.ordinal()));
    }

    public final void N5(int i) {
        O4().LLLZLL(i);
        C1428520nHG.LJLIIIL(n5());
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.DELETE.ordinal()));
        R5(true);
    }

    public final void Or1(boolean z) {
        i3(new AwS35S0010000_22(z, 11));
    }

    @Override // X.InterfaceC1441090nbX
    public void Tr(boolean z) {
        InterfaceC578430MmP interfaceC578430MmPT5;
        InterfaceC1414530muh interfaceC1414530muhK5;
        int iLLJJJJLIIL;
        int iO2;
        if (this.LLLIIIIL && z) {
            return;
        }
        si(z);
        this.LLLF.removeCallbacksAndMessages(null);
        i3(new AwS35S0010000_22(z, 12));
        if (z) {
            if (!this.LLLFZ) {
                U5();
            }
            Z4().Xm2(false);
            InterfaceC1417110myr interfaceC1417110myrH4 = H4();
            if (interfaceC1417110myrH4 != null) {
                interfaceC1417110myrH4.dZ0();
            }
            InterfaceC578430MmP interfaceC578430MmPT52 = t5();
            if (interfaceC578430MmPT52 != null) {
                interfaceC578430MmPT52.hide();
                return;
            }
            return;
        }
        Z4().resume();
        Z4().kM1(this.LLJJ.getCurrentItem(), 0.0f);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
        if (C1462920oAk.LIZLLL()) {
            c0 c0Var = c0.LIZ;
            c0Var.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                if (c1660590tJZ.LJII()) {
                    iLLJJJJLIIL = c0Var.LLJJJJLIIL() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(69));
                    iO2 = c0Var.o2();
                } else {
                    iLLJJJJLIIL = c0Var.LLJJJJLIIL() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
                    iO2 = c0Var.o2();
                }
                iLIZIZ = iLLJJJJLIIL - iO2;
            }
        }
        if (n5().creativeModel.imageEditModel.enterFromImagePublishPreview) {
            if (C1462920oAk.LIZLLL()) {
                iLIZIZ -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31));
            }
        } else if (!C1428470nHB.LIZIZ(n5()) && (interfaceC578430MmPT5 = t5()) != null) {
            interfaceC578430MmPT5.show();
        }
        Z4().LLLIIL(iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)));
        Z4().Xm2(true);
        if (!C573570MeZ.LIZJ(n5()) || (interfaceC1414530muhK5 = k5()) == null) {
            return;
        }
        interfaceC1414530muhK5.be(true);
    }

    @Override // X.InterfaceC1441090nbX
    public void UA2(int i) {
        O4().tU0();
        U5();
        this.LLJJ.LLFFF(i, false);
        Z4().kM1(i, 0.0f);
    }

    @Override // X.InterfaceC1441090nbX
    public void gP0(int i) {
        i3(new AwS35S0001000_22(i, 9));
    }

    @Override // X.InterfaceC1441090nbX
    public void hH1(boolean z) {
        i3(new AwS35S0010000_22(z, 13));
    }

    @Override // X.InterfaceC1441090nbX
    public void ls2(List<? extends View> list) {
        this.LLLIL = list;
    }

    public final void m6(int i) {
        Or2().setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1441090nbX
    public void si(boolean z) {
        this.LLLIILIL = z;
    }

    public final void E5(Function1<? super Boolean, Unit> function1, String str) {
        if (this.LLJJ.LLLIZZ) {
            this.LLLII = new AwS137S1200000_22(this, (C1461800o8w) function1, (Function1<? super Boolean, Unit>) str, (String) 0);
        } else {
            d5().Gk2(new AwS137S1200000_22(this, (C1461800o8w) function1, (Function1<? super Boolean, Unit>) str, (String) 1));
        }
    }

    @Override // X.InterfaceC1441090nbX
    public void Hw1(int i, String str) {
        i3(new AwS11S1001000_22(i, str, 2));
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.ADD.ordinal()));
    }

    @Override // X.InterfaceC1441090nbX
    public void Za2(int i, String str) {
        i3(new AwS11S1001000_22(i, str, 3));
    }

    public final void d6(int i, int i2) {
        if (i != i2) {
            O4().Sq2(i, i2);
        }
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.REORDER.ordinal()));
        R5(false);
    }

    @Override // X.InterfaceC1441090nbX
    public void f6(int i, String str) {
        i3(new AwS11S1001000_22(i, str, 4));
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.UPDATE.ordinal()));
    }

    @Override // X.InterfaceC1441090nbX
    public void nT(int i, String str) {
        i3(new AwS11S1001000_22(i, str, 1));
        this.LLJLL.LJIIIZ(Integer.valueOf(EnumC1461810o8x.ADD.ordinal()));
    }

    public final void u6(SingleImageData singleImageData, SingleImageData singleImageData2) {
        String id;
        if (singleImageData == null || (id = singleImageData.getId()) == null || !(!a0.LJJJIL(id))) {
            id = null;
        }
        String id2 = singleImageData2.getId();
        if (id2 == null || !(!a0.LJJJIL(id2))) {
            id2 = null;
        }
        String[] strArr = new String[2];
        strArr[0] = id;
        if (!Intrinsics.LJFF(id2, id)) {
            id2 = null;
        }
        strArr[1] = id2;
        for (String str : C13LP.LJJJJI(C13LQ.LJIJI(strArr))) {
            n5().creativeModel.imageEditModel.map.remove(str);
            C1450090nq3 c1450090nq3WD0 = O4().wD0();
            if (c1450090nq3WD0 != null) {
                c1450090nq3WD0.LJ(null, str);
            }
        }
    }

    public C1461800o8w(C19A3 c19a3, C1DRG c1drg, C1462760oAU c1462760oAU, int i) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c1462760oAU;
        this.LLJJI = i;
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578430MmP.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1414530muh.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417110myr.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452390ntl.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(-1);
        this.LLJLIL = mutableLiveData;
        this.LLJLILLLLZIIL = mutableLiveData;
        C560530Lyd<Integer> c560530Lyd = new C560530Lyd<>();
        this.LLJLL = c560530Lyd;
        this.LLJLLIL = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJLLL = c560530Lyd2;
        this.LLJZ = c560530Lyd2;
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJZIJLIL = c560530Lyd3;
        this.LLL = c560530Lyd3;
        this.LLLF = new SafeHandler(c19a3);
        this.LLLFF = C1461820o8y.LIZ;
        this.LLLIIIL = new AwS566S0100000_22(this, 200);
        this.LLLIIL = new AwS566S0100000_22(this, 201);
        this.LLLIL = C13BV.INSTANCE;
    }
}
