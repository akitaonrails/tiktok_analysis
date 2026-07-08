package X;

import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409690mmt extends i<InterfaceC1409660mmq, C1409900mnE, C1409750mmz, C1409760mn0> implements InterfaceC1409660mmq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public TextStickerData LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final C01GW LLJJJJ;
    public CopyOnWriteArrayList<InspirationItemData> LLJJJJJIL;
    public CopyOnWriteArrayList<InspirationItemData> LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public EnumC1409600mmk LLJLIL;
    public InspirationItemData LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final AtomicBoolean LLJZIJLIL;
    public C09AE LLL;
    public boolean LLLF;
    public C1409900mnE LLLFF;
    public final Function0<C1409750mmz> LLLFFI;
    public final Function0<C1409760mn0> LLLFZ;
    public boolean LLLI;
    public EnumC1409650mmp LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1409690mmt.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1409690mmt.class, "publishedEditModel", "getPublishedEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1409690mmt.class, "imageEditPreviewApi", "getImageEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1409690mmt.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1409690mmt.class, "inspirationDataApi", "getInspirationDataApi()Lcom/ss/android/ugc/aweme/image/inspiration/data/IImageInspirationDataApi;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLLIIIIL = 8;
    }

    public final void d6() {
        this.LLJL = 1;
        i3(AFwS261S0000000_22.get$arr$(68));
    }

    private final InterfaceC1455860nzM K4() {
        return (InterfaceC1455860nzM) this.LLJJI.getValue(this, LLLIIII[0]);
    }

    private final InterfaceC1451050nrb T4() {
        return (InterfaceC1451050nrb) this.LLJJIJI.getValue(this, LLLIIII[2]);
    }

    @Override // ge.i
    public Function0<C1409900mnE> E3() {
        return new AwS566S0100000_22(this, 141);
    }

    public final void E5() {
        String effectId = null;
        if (this.LLJLIL == EnumC1409600mmk.TITLE) {
            InspirationItemData inspirationItemData = (InspirationItemData) C13LP.LJJJLZIJ(this.LLJJLIIIJLLLLLLLZ + 1, this.LLJJJJJIL);
            if (inspirationItemData != null) {
                effectId = inspirationItemData.getEffectId();
            }
        } else {
            InspirationItemData inspirationItemData2 = (InspirationItemData) C13LP.LJJJLZIJ(this.LLJJLIIIJLLLLLLLZ + 1, this.LLJJJJLIIL);
            if (inspirationItemData2 != null) {
                effectId = inspirationItemData2.getEffectId();
            }
        }
        C0FMH c0fmhD5 = d5();
        if (effectId == null) {
            effectId = "";
        }
        c0fmhD5.LJFF(effectId);
    }

    public final InterfaceC1461660o8i O4() {
        return (InterfaceC1461660o8i) this.LLJJIJIL.getValue();
    }

    public final C0FVT P4() {
        return (C0FVT) this.LLJJJ.getValue();
    }

    public final InterfaceC1409500mma Z4() {
        return (InterfaceC1409500mma) this.LLJJJIL.getValue(this, LLLIIII[4]);
    }

    public final C0FMH d5() {
        return (C0FMH) this.LLJJJJ.getValue();
    }

    public final InterfaceC1450920nrO k5() {
        return (InterfaceC1450920nrO) this.LLJJIJIIJIL.getValue(this, LLLIIII[3]);
    }

    public final VideoPublishEditModel n5() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLLIIII[1]);
    }

    public final boolean t5() {
        return this.LLLF || C545820Lau.LJ(this.LLJILJILJ);
    }

    private final void D5() {
        if (d5().LIZLLL()) {
            InterfaceC388390FKr interfaceC388390FKrLIZJ = d5().LIZJ();
            if (interfaceC388390FKrLIZJ != null) {
                interfaceC388390FKrLIZJ.LLZZJLIL();
            }
            i3(AFwS261S0000000_22.get$arr$(64));
        }
        C1409620mmm.LIZLLL(n5(), this.LLLII, this.LLJLIL, "close", "half_page");
        Uy(false, this.LLLII, AFwS210S0000000_22.get$arr$(80));
        C354270Duj.LIZ(320L, new AwS566S0100000_22(this, 139));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void N5() {
        /*
            r5 = this;
            X.0FVT r0 = r5.P4()
            r4 = 0
            if (r0 == 0) goto L54
            X.0FVQ r0 = r0.nj()
            if (r0 == 0) goto L54
            X.0FVY r1 = r0.LIZJ
            r3 = 1
            if (r1 == 0) goto L54
            X.0oFx r0 = X.EnumC1466150oFx.TEXT
            java.lang.Object r0 = r1.LLIIIZ(r0)
            X.0FWO r0 = (X.C0FWO) r0
            if (r0 == 0) goto L54
            X.0tQA r0 = r0.Z()
            if (r0 == 0) goto L54
            STATE r1 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r1 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r1
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel r0 = r1.getTextTemplateModel()
            boolean r0 = r0.enableTextTemplate
            if (r0 != 0) goto L54
            java.lang.String r0 = r1.getTextStr()
            int r0 = r0.length()
            if (r0 <= 0) goto L54
        L3a:
            r2 = -1
            if (r3 == 0) goto L56
            X.0n65 r1 = X.C1421590n65.LIZIZ
            java.lang.String r0 = "has type text so no default selected item"
            X.C201955140j.LIZJ(r1, r0)
            int r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 < 0) goto L4a
            r5.LLJJLIIIJLLLLLLLZ = r2
        L4a:
            r0 = 65
            kotlin.jvm.internal.AFwS261S0000000_22 r0 = kotlin.jvm.internal.AFwS261S0000000_22.get$arr$(r0)
            r5.i3(r0)
            return
        L54:
            r3 = 0
            goto L3a
        L56:
            X.0n65 r1 = X.C1421590n65.LIZIZ
            java.lang.String r0 = "default select 0 position"
            X.C201955140j.LIZJ(r1, r0)
            r5.LLJJLIIIJLLLLLLLZ = r2
            r0 = 66
            kotlin.jvm.internal.AFwS261S0000000_22 r0 = kotlin.jvm.internal.AFwS261S0000000_22.get$arr$(r0)
            r5.i3(r0)
            r5.LLJJLIIIJLLLLLLLZ = r4
            kotlin.jvm.internal.AwS601S0100000_22 r1 = new kotlin.jvm.internal.AwS601S0100000_22
            r0 = 106(0x6a, float:1.49E-43)
            r1.<init>(r5, r0)
            r5.i3(r1)
            int r0 = r5.LLJJLIIIJLLLLLLLZ
            r5.C5(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409690mmt.N5():void");
    }

    public final void H5() {
        this.LLJLL = System.currentTimeMillis();
        this.LLJZ = true;
        this.LLJLLL = false;
        d6();
        H4(false);
    }

    @Override // X.InterfaceC1409660mmq
    public boolean Oh() {
        v5(d5().LIZLLL(), "close_blank");
        return true;
    }

    @Override // X.InterfaceC1409660mmq
    public void bn2() {
        if (d5().LIZLLL()) {
            InterfaceC388390FKr interfaceC388390FKrLIZJ = d5().LIZJ();
            if (interfaceC388390FKrLIZJ != null) {
                interfaceC388390FKrLIZJ.LLZZJLIL();
            }
            i3(AFwS261S0000000_22.get$arr$(63));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLLF = true;
        try {
            C09AE c09ae = this.LLL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            d5().LJ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1409660mmq
    public boolean uW0() {
        D5();
        return true;
    }

    @Override // X.InterfaceC1409660mmq
    public boolean A5() {
        return this.LLLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1409750mmz> o2() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1409760mn0> w2() {
        return this.LLLFZ;
    }

    private final void H4(boolean z) {
        if (!z && this.LLJZIJLIL.get()) {
            C201955140j.LIZJ(C1421590n65.LIZIZ, "onReLoadData is already running, skip.");
            return;
        }
        C201955140j.LIZJ(C1421590n65.LIZIZ, "force reLoadData");
        C09AE c09ae = this.LLL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1409510mmb(this, null), 3);
    }

    private final void M5(boolean z) {
        String str;
        if (this.LLJLLL) {
            return;
        }
        long jCurrentTimeMillis = 0;
        if (this.LLJLL > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLL;
        }
        boolean z2 = !this.LLJLLIL;
        VideoPublishEditModel videoPublishEditModelN5 = n5();
        EnumC1409650mmp enumC1409650mmp = this.LLLII;
        EnumC1409600mmk enumC1409600mmk = this.LLJLIL;
        C1409620mmm.LIZ.getClass();
        C0LAB c0labLIZ = C1409620mmm.LIZ(videoPublishEditModelN5);
        c0labLIZ.LJ("from_previous_entrance", enumC1409650mmp.getValue());
        c0labLIZ.LJ("idea_type", enumC1409600mmk.getValue());
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c0labLIZ.LJ("action_result", str);
        c0labLIZ.LIZIZ(jCurrentTimeMillis, "wait_duration");
        c0labLIZ.LJFF("is_cache", z2);
        C20684815ws.LJIILLIIL("show_text_inspiration_ideas", c0labLIZ.LIZ);
        this.LLJLLL = true;
    }

    public final void C5(int i) {
        final InspirationItemData inspirationItemData;
        this.LLJJLIIIJLLLLLLLZ = i;
        if (this.LLJLIL == EnumC1409600mmk.TITLE) {
            inspirationItemData = (InspirationItemData) C13LP.LJJJLZIJ(i, this.LLJJJJJIL);
        } else {
            inspirationItemData = (InspirationItemData) C13LP.LJJJLZIJ(i, this.LLJJJJLIIL);
        }
        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickItem :");
        sbLIZ.append(inspirationItemData);
        C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        if (inspirationItemData == null) {
            return;
        }
        d5().LIZIZ(i, inspirationItemData, new C0FMP() { // from class: X.0mmu
            @Override // X.C0FMP
            public final void LIZ(int i2) {
                if (this.LIZ.t5()) {
                    return;
                }
                this.LIZ.i3(new AwS35S0001000_22(i2, 3));
                this.LIZ.F4(i2);
            }

            @Override // X.C0FMP
            public final void LIZIZ(int i2) {
                if (this.LIZ.t5()) {
                    return;
                }
                this.LIZ.i3(new AwS35S0001000_22(i2, 2));
            }

            @Override // X.C0FMP
            public final void LIZJ(int i2, C0FMO c0fmo) {
                if (this.LIZ.t5()) {
                    return;
                }
                this.LIZ.i3(new AwS35S0001000_22(i2, 4));
                C1409690mmt c1409690mmt = this.LIZ;
                if (c1409690mmt.LLJJLIIIJLLLLLLLZ == i2) {
                    c1409690mmt.d5().LJI(c0fmo, inspirationItemData);
                    this.LIZ.E5();
                }
            }
        });
        C1409620mmm.LIZIZ(n5(), this.LLLII, this.LLJLIL, Integer.valueOf(i + 1), inspirationItemData.getTitle().length() + inspirationItemData.getContent().length());
    }

    public final void F4(int i) {
        i3(new AwS35S0001000_22(i, 1));
        if (i == this.LLJJLIIIJLLLLLLLZ) {
            C354270Duj.LIZ(0L, new AwS566S0100000_22(this, 135));
        }
    }

    public final void U5(C1409380mmO c1409380mmO) {
        List<InspirationItemData> list;
        boolean z;
        if (this.LLJLIL == EnumC1409600mmk.TITLE) {
            list = c1409380mmO.LIZIZ;
        } else {
            list = c1409380mmO.LIZ;
        }
        if (this.LLJL == 1 && C290720BaQ.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJL = 2;
        C1409900mnE c1409900mnE = this.LLLFF;
        if (c1409900mnE != null) {
            EnumC1409600mmk enumC1409600mmk = this.LLJLIL;
            C1415620mwS c1415620mwS = c1409900mnE.LLJJJJ;
            if (c1415620mwS != null) {
                c1415620mwS.setInspirationPanelType(enumC1409600mmk);
            }
        }
        i3(new AwS108S0110000_22(list, z, 1));
        N5();
        M5(true);
    }

    public final void m6(C1409380mmO c1409380mmO) {
        this.LLJJJJJIL.clear();
        this.LLJJJJJIL.addAll(c1409380mmO.LIZIZ);
        this.LLJJJJLIIL.clear();
        this.LLJJJJLIIL.addAll(c1409380mmO.LIZ);
    }

    public C1409690mmt(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 136));
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 137));
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1409500mma.class, null);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 138));
        this.LLJJJJJIL = new CopyOnWriteArrayList<>();
        this.LLJJJJLIIL = new CopyOnWriteArrayList<>();
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJLIL = EnumC1409600mmk.TITLE;
        this.LLJZIJLIL = new AtomicBoolean(false);
        this.LLLFFI = AFwS210S0000000_22.get$arr$(81);
        this.LLLFZ = new AwS566S0100000_22(this, 140);
        this.LLLII = EnumC1409650mmp.TEXT_STICKER;
    }

    public final void R5(int i, String str) {
        this.LLJL = 3;
        i3(AFwS261S0000000_22.get$arr$(67));
        M5(false);
    }

    public final void v5(boolean z, String str) {
        C0FVQ c0fvqNj;
        C0FVQ c0fvqNj2;
        String str2;
        C0FWO c0fwo;
        C1664680tQA<TextStickerModel> c1664680tQALLZLLIL;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        C1409620mmm.LIZLLL(n5(), this.LLLII, this.LLJLIL, str, "half_page");
        Uy(false, this.LLLII, AFwS210S0000000_22.get$arr$(80));
        if (z && d5().LIZLLL()) {
            C0FVT c0fvtP4 = P4();
            if (c0fvtP4 != null && (c0fvqNj2 = c0fvtP4.nj()) != null) {
                InterfaceC388390FKr interfaceC388390FKrLIZJ = d5().LIZJ();
                if (interfaceC388390FKrLIZJ == null || (c1664680tQALLZLLIL = interfaceC388390FKrLIZJ.LLZLLIL()) == null || (textStickerModel = c1664680tQALLZLLIL.LIZ) == null || (textTemplateModel = textStickerModel.getTextTemplateModel()) == null || (str2 = textTemplateModel.defaultText) == null) {
                    str2 = "";
                }
                EnumC1409650mmp enumC1409650mmp = this.LLLII;
                C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter inspiration edit state, defaultText: ");
                sbLIZ.append(str2);
                C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
                C1456140nzo.LIZIZ(c0fvqNj2.LIZIZ, false, false, false, false, 12);
                C0FVY c0fvy = c0fvqNj2.LIZJ;
                if (c0fvy != null && (c0fwo = (C0FWO) c0fvy.LLIIIZ(EnumC1466150oFx.TEXT)) != null) {
                    c0fwo.y4(str2, enumC1409650mmp);
                    return;
                }
                return;
            }
            return;
        }
        C0FVT c0fvtP42 = P4();
        if (c0fvtP42 == null || (c0fvqNj = c0fvtP42.nj()) == null) {
            return;
        }
        c0fvqNj.LIZ();
    }

    @Override // X.InterfaceC1409660mmq
    public void Uy(boolean z, EnumC1409650mmp enumC1409650mmp, Function0<Unit> function0) {
        EnumC1409600mmk enumC1409600mmk;
        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOrHideScene:");
        sbLIZ.append(z);
        C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        C1456140nzo.LIZIZ(K4(), !z, false, false, false, 12);
        this.LLLI = z;
        this.LLLII = enumC1409650mmp;
        int iIntValue = -16777216;
        if (z) {
            this.LLJLL = System.currentTimeMillis();
            this.LLJZ = false;
            this.LLJLLL = false;
            K4().EH2(true);
            int iH7 = T4().h7();
            this.LLJJL = iH7;
            if (iH7 == 0) {
                enumC1409600mmk = EnumC1409600mmk.TITLE;
            } else {
                enumC1409600mmk = EnumC1409600mmk.IDEAS;
            }
            this.LLJLIL = enumC1409600mmk;
            show();
            Window window = C1664590tQ1.LJII(this).getWindow();
            if (window != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bn, C1664590tQ1.LJII(this));
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                window.setNavigationBarColor(iIntValue);
            }
            i3(AFwS261S0000000_22.get$arr$(69));
            i3(new AwS601S0100000_22(this, 107));
            d6();
            H4(false);
            return;
        }
        K4().EH2(false);
        this.LLJLILLLLZIIL = null;
        function0.invoke();
        Window window2 = C1664590tQ1.LJII(this).getWindow();
        if (window2 != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e1, C1664590tQ1.LJII(this));
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            window2.setNavigationBarColor(iIntValue);
        }
        i3(AFwS261S0000000_22.get$arr$(70));
        C09AE c09ae = this.LLL;
        if (c09ae == null) {
            return;
        }
        c09ae.LIZIZ(null);
    }
}
