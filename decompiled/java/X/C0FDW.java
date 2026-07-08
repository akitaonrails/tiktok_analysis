package X;

import Y.AObjectS240S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS475S0200000_6;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FDW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FDW extends i<InterfaceC362820EKi, C386540FDo, C386420FDc, C386520FDm> implements InterfaceC379610EuV, InterfaceC362820EKi {
    public static final C386440FDe LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final int LLJILJILJ;
    public final C19A3 LLJILLL;
    public final C1DRG LLJJ;
    public final Function0<C386420FDc> LLJJI;
    public final Function0<C386520FDm> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final C0FDM LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public InterfaceC386430FDd LLJJJIL;
    public TextStickerModel LLJJJJ;
    public C385670FAf<Boolean> LLJJJJJIL;
    public C09AE LLJJJJLIIL;
    public C09AE LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0FDe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FDW.class, "textMobService", "getTextMobService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/ITextStickerMobService;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0FDW.class, "panelContextData", "getPanelContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/template/ui/CaptionTemplatePanelContext;", 0), new C2217381BqS(C0FDW.class, "captionTemplatePanelApi", "getCaptionTemplatePanelApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/template/api/ICaptionTemplatePanelApi;", 0)};
        LLJL = new Object() { // from class: X.0FDe
        };
        LLJLILLLLZIIL = 8;
    }

    private final C0FDZ T4() {
        if (!C385050F7v.LJIILIIL(this.LLJJJJ)) {
            return new C0FDZ("custom_caption_template", false, CustomCaptionTemplateData.LIZ(this.LLJJJJ.getCaptionTemplateModel().customTemplateData, false, 63), null, 8);
        }
        boolean zLJIIJJI = C385050F7v.LJIIJJI(this.LLJJJJ);
        CustomCaptionTemplateData customCaptionTemplateDataLIZLLL = (C385050F7v.LJIIJJI(this.LLJJJJ) && this.LLJJJJ.getCaptionTemplateModel().isManuallyCleared) ? this.LLJJJJ.getCaptionTemplateModel().customTemplateData : C363470EMv.LIZLLL(this.LLJJJJ);
        this.LLJJJJ.getCaptionTemplateModel().templateData = null;
        this.LLJJJJ.getCaptionTemplateModel().customTemplateData = customCaptionTemplateDataLIZLLL;
        return new C0FDZ("custom_caption_template", !zLJIIJJI, CustomCaptionTemplateData.LIZ(customCaptionTemplateDataLIZLLL, false, 63), null, 8);
    }

    private final C0FGR k5() {
        return (C0FGR) this.LLJJIJI.getValue(this, LLJLIL[0]);
    }

    public final void H5() {
        List listLJFF = C365460EUm.LJFF("tiktok_ep_caption_template");
        if (listLJFF == null || listLJFF.isEmpty()) {
            return;
        }
        i3(new AwS371S0200000_5(this, (C0FDW) listLJFF, (List<? extends Effect>) 110));
    }

    public final void LLILZLL() {
        i3(AFwS234S0000000_5.get$arr$(284));
        P4(false);
    }

    public final void O4() {
        InterfaceC386430FDd interfaceC386430FDd = this.LLJJJIL;
        if (interfaceC386430FDd != null) {
            interfaceC386430FDd.LIZIZ(new AwS584S0100000_5(this, 557));
        }
    }

    public final InterfaceC364910ESj Z4() {
        return (InterfaceC364910ESj) this.LLJJJ.getValue(this, LLJLIL[2]);
    }

    public final C362760EKc d5() {
        return (C362760EKc) this.LLJJIJIL.getValue(this, LLJLIL[1]);
    }

    public final void E5() {
        C0E55 c0e55LJIILIIL;
        NLETrackSlot nLETrackSlotLJIIJ;
        C362760EKc c362760EKcD5 = d5();
        if (c362760EKcD5 == null || (c0e55LJIILIIL = c362760EKcD5.LJIILIIL()) == null) {
            return;
        }
        c0e55LJIILIIL.pause(false);
        C362760EKc c362760EKcD52 = d5();
        if (c362760EKcD52 == null || (nLETrackSlotLJIIJ = c362760EKcD52.LJIIJ()) == null) {
            return;
        }
        long startTime = nLETrackSlotLJIIJ.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        c0e55LJIILIIL.LJJIIZI(startTime + j, nLETrackSlotLJIIJ.getEndTime() - j, false, true);
    }

    @Override // X.InterfaceC362820EKi
    public void gI1() {
        List<C0FDZ> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (C0FDZ c0fdz : list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C0FDZ c0fdz2 = c0fdz;
            C386400FDa c386400FDa = c0fdz2.LIZLLL;
            arrayList.add(C0FDZ.LIZ(c0fdz2, false, null, c386400FDa != null ? C386400FDa.LIZ(c386400FDa, 0, EnumC1641420soe.NOT_DOWNLOAD, 111) : null, 5));
            i = i2;
        }
        i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 556));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C09AE c09ae = this.LLJJJJLIIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJJL;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC362820EKi
    public boolean e9() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C386420FDc> o2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C386520FDm> w2() {
        return this.LLJJIII;
    }

    private final void P4(boolean z) {
        if (!T2().LIZIZ.isEmpty()) {
            return;
        }
        C09AE c09ae = this.LLJJJJLIIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<? extends Effect> listLJFF = C365460EUm.LJFF("tiktok_ep_caption_template");
        i3(AFwS234S0000000_5.get$arr$(282));
        if (listLJFF != null && !listLJFF.isEmpty()) {
            C5(z, K4(listLJFF));
            C0FGR c0fgrK5 = k5();
            if (c0fgrK5 != null) {
                c0fgrK5.LJIJI(0, System.currentTimeMillis() - jCurrentTimeMillis, null, "caption_template_list_download", null, true);
                return;
            }
            return;
        }
        this.LLJJJJLIIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C0FDK(this, z, null), 2);
    }

    @Override // X.InterfaceC362820EKi
    public void Hi0(InterfaceC386430FDd interfaceC386430FDd) {
        this.LLJJJIL = interfaceC386430FDd;
    }

    public final List<C0FDZ> K4(List<? extends Effect> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(T4());
        for (Effect effect : list) {
            CaptionTemplateData captionTemplateDataLIZ = C363470EMv.LIZ(effect);
            if (captionTemplateDataLIZ != null) {
                String resource_id = effect.getResource_id();
                String resource_id2 = effect.getResource_id();
                CaptionTemplateData captionTemplateData = this.LLJJJJ.getCaptionTemplateModel().templateData;
                if (captionTemplateData != null) {
                    str = captionTemplateData.resID;
                } else {
                    str = null;
                }
                arrayList.add(new C0FDZ(resource_id, Intrinsics.LJFF(resource_id2, str), null, new C386400FDa(captionTemplateDataLIZ, effect.getIcon_url().getUrlList(), false, 0, EnumC1641420soe.NOT_DOWNLOAD, false, effect), 4));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC362820EKi
    public void LJJLIIIJJIZ(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModel2 = this.LLJJJJ;
        this.LLJJJJ = textStickerModel;
        if (textStickerModel.getBaseStickerModel().getId() != C364540EQy.LIZ(textStickerModel2)) {
            H5();
        }
    }

    public final boolean n5(C0FDZ c0fdz) {
        C386400FDa c386400FDa;
        CaptionTemplateData captionTemplateData;
        String str;
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LLJILLL);
        if (contextLIZIZ == null || !this.LLJJJJ.getWords().isEmpty() || Intrinsics.LJFF(c0fdz.LIZ, "custom_caption_template") || (c386400FDa = c0fdz.LIZLLL) == null || (captionTemplateData = c386400FDa.LIZ) == null || (str = captionTemplateData.captionAnimId) == null || str.length() == 0) {
            return false;
        }
        if (C0DHG.LIZ() && C1388190mED.LIZ(contextLIZIZ) != null) {
            C632670Orh.LIZIZ(contextLIZIZ, new C19719212De(-477962497, new AwS475S0200000_6(c0fdz, this, 3), true));
            return true;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(contextLIZIZ);
        c1397580mTM.LJFF(2131828370);
        c1397580mTM.LIZ(2131828368);
        C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(c0fdz, this, 109));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return true;
    }

    private final void M5(int i, Function0<Unit> function0) {
        boolean z;
        C386400FDa c386400FDaLIZ;
        List<C0FDZ> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (C0FDZ c0fdz : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C0FDZ c0fdz2 = c0fdz;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                C386400FDa c386400FDa = c0fdz2.LIZLLL;
                if (c386400FDa != null) {
                    c386400FDaLIZ = C386400FDa.LIZ(c386400FDa, 0, EnumC1641420soe.NOT_DOWNLOAD, 111);
                } else {
                    c386400FDaLIZ = null;
                }
                arrayList.add(C0FDZ.LIZ(c0fdz2, z, null, c386400FDaLIZ, 5));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 558));
        View view = this.LLJILLL.mView;
        if (view != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS74S0200000_5(view, function0, 25));
        }
    }

    private final void t5(long j, CaptionTemplateData captionTemplateData) {
        String second;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(C0FGD.LIZ(captionTemplateData.resID, captionTemplateData.panel));
        String str = captionTemplateData.fontId;
        if (str != null) {
            arrayList.add(str);
        }
        String str2 = captionTemplateData.styleId;
        if (str2 != null) {
            arrayList.add(str2);
        }
        String str3 = captionTemplateData.textAnimId;
        if (str3 != null) {
            arrayList.add(str3);
        }
        String str4 = captionTemplateData.captionAnimId;
        if (str4 != null) {
            arrayList.add(str4);
        }
        for (String str5 : arrayList) {
            C0FGR c0fgrK5 = k5();
            if (c0fgrK5 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                Pair<String, String> pairLIZJ = C0FGD.LIZJ(str5);
                if (pairLIZJ != null) {
                    second = pairLIZJ.getSecond();
                } else {
                    second = null;
                }
                this.LLJJIJIIJIL.getClass();
                c0fgrK5.LJJIIJ(0, jCurrentTimeMillis, second, C0FDM.LJIIIZ(captionTemplateData, str5), captionTemplateData.resID, true, null, null);
            }
        }
    }

    public final void C5(boolean z, List<C0FDZ> list) {
        C385670FAf<Boolean> c385670FAf;
        AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(this, (C0FDW) list, (List<C0FDZ>) 59);
        if (z && (c385670FAf = this.LLJJJJJIL) != null) {
            c385670FAf.LIZ(this, new AObjectS240S0100000_5(awS406S0200000_5, 84));
        } else {
            awS406S0200000_5.invoke();
        }
    }

    public final void D5(int i, C0FDZ c0fdz) {
        String str;
        if (Intrinsics.LJFF(c0fdz.LIZ, "custom_caption_template")) {
            str = "custom";
        } else {
            str = c0fdz.LIZ;
        }
        C0FGR c0fgrK5 = k5();
        if (c0fgrK5 != null) {
            c0fgrK5.LJIILJJIL(str);
        }
    }

    public final void F4(CustomCaptionTemplateData customCaptionTemplateData, boolean z) {
        InterfaceC386430FDd interfaceC386430FDd;
        if (customCaptionTemplateData != null && (interfaceC386430FDd = this.LLJJJIL) != null) {
            interfaceC386430FDd.LIZJ(z, customCaptionTemplateData, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    public final void H4(CaptionTemplateData captionTemplateData, boolean z) {
        InterfaceC386430FDd interfaceC386430FDd = this.LLJJJIL;
        if (interfaceC386430FDd != null) {
            interfaceC386430FDd.LIZ(z, captionTemplateData, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // X.InterfaceC362820EKi
    public void mv1(TextStickerModel textStickerModel, C385670FAf<Boolean> c385670FAf) {
        this.LLJJJJ = textStickerModel;
        this.LLJJJJJIL = c385670FAf;
        P4(true);
    }

    public final void v5(boolean z, boolean z2) {
        CaptionTemplateData captionTemplateData;
        if (z == this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        if (z && z2 && (captionTemplateData = this.LLJJJJ.getCaptionTemplateModel().templateData) != null) {
            H4(captionTemplateData, false);
        }
    }

    public final void x5(int i, C0FDZ c0fdz) {
        C0FDZ next;
        String str;
        CaptionTemplateData captionTemplateData;
        Iterator<C0FDZ> it2 = T2().LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0FDZ c0fdz2 = next;
        if (c0fdz2 != null) {
            str = c0fdz2.LIZ;
        } else {
            str = null;
        }
        if (((Boolean) C275400Aqo.LIZ.getValue()).booleanValue() && !Intrinsics.LJFF(c0fdz.LIZ, "custom_caption_template")) {
            C0E12 c0e12 = C363750ENx.LIZ;
            String str2 = c0fdz.LIZ;
            str2.toString();
            C0E12 c0e122 = C363750ENx.LIZ;
            c0e122.getClass();
            c0e122.LIZ.storeString("style_template_res_id", str2);
        }
        if (Intrinsics.LJFF(c0fdz.LIZ, "custom_caption_template")) {
            if (Intrinsics.LJFF(str, "custom_caption_template")) {
                O4();
                return;
            } else {
                M5(i, new AwS406S0200000_5(c0fdz, this, 57));
                return;
            }
        }
        C0FGR c0fgrK5 = k5();
        if (c0fgrK5 != null) {
            c0fgrK5.LJIIL(c0fdz.LIZ);
        }
        C09AE c09ae = this.LLJJL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C386400FDa c386400FDa = c0fdz.LIZLLL;
        if (c386400FDa != null && (captionTemplateData = c386400FDa.LIZ) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C362850EKl.LIZIZ(captionTemplateData)) {
                t5(jCurrentTimeMillis, captionTemplateData);
                if (n5(c0fdz)) {
                    return;
                }
                if (Intrinsics.LJFF(str, c0fdz.LIZ)) {
                    E5();
                    return;
                } else {
                    M5(i, new AwS406S0200000_5(this, captionTemplateData, 58));
                    return;
                }
            }
            M5(i, new C0FDY(this, captionTemplateData, i, c0fdz, str));
        }
    }

    public C0FDW(int i, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = i;
        this.LLJILLL = c19a3;
        this.LLJJ = c1drg;
        this.LLJJI = new AwS549S0100000_5(this, 658);
        this.LLJJIII = new AwS549S0100000_5(this, 659);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C0FGR.class, null);
        this.LLJJIJIIJIL = new C0FDM(C196909122h.LIZ(), k5());
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C362760EKc.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC364910ESj.class, null);
        this.LLJJJJ = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(int r10, X.EnumC1641420soe r11, int r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.T2()
            X.0FDc r0 = (X.C386420FDc) r0
            java.util.List<X.0FDZ> r1 = r0.LIZIZ
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
            r6 = 0
            r1 = 0
        L19:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r7 = r8.next()
            int r5 = r1 + 1
            r3 = 0
            if (r1 < 0) goto L4f
            X.0FDZ r7 = (X.C0FDZ) r7
            if (r1 != r10) goto L40
            X.0FDa r1 = r7.LIZLLL
            if (r1 == 0) goto L4d
            r0 = 103(0x67, float:1.44E-43)
            X.0FDa r1 = X.C386400FDa.LIZ(r1, r12, r11, r0)
        L36:
            r0 = 7
            X.0FDZ r0 = X.C0FDZ.LIZ(r7, r6, r3, r1, r0)
            r4.add(r0)
            r1 = r5
            goto L19
        L40:
            X.0FDa r2 = r7.LIZLLL
            if (r2 == 0) goto L4d
            X.0soe r1 = X.EnumC1641420soe.NOT_DOWNLOAD
            r0 = 111(0x6f, float:1.56E-43)
            X.0FDa r1 = X.C386400FDa.LIZ(r2, r6, r1, r0)
            goto L36
        L4d:
            r1 = r3
            goto L36
        L4f:
            X.C1697810uHb.LJIJI()
            throw r3
        L53:
            kotlin.jvm.internal.AwS584S0100000_5 r1 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 559(0x22f, float:7.83E-43)
            r1.<init>(r4, r0)
            r9.i3(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FDW.R5(int, X.0soe, int):void");
    }
}
