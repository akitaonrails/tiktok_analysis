package X;

import Y.AComparatorS41S0000000_22;
import Y.ARunnableS55S0300000_22;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ngP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444110ngP extends AbstractC2255721DQs<InterfaceC1455760nzC> implements InterfaceC1455760nzC, InterfaceC379610EuV, InterfaceC384890F7f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final InterfaceC1455760nzC LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C1439740nZM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450440nqc.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC23230098i.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1444110ngP.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1444110ngP.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1444110ngP.class, "sizeProvider", "getSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1444110ngP.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1444110ngP.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1444110ngP.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1444110ngP.class, "editCanvasApi", "getEditCanvasApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/EditCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1444110ngP.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1444110ngP.class, "editGlobalLoadingApi", "getEditGlobalLoadingApi()Lcom/ss/android/ugc/gamora/editor/flow/EditGlobalLoadingApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJILJILJ = 8;
    }

    private final InterfaceC1444130ngR W2() {
        return (InterfaceC1444130ngR) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLJI.getValue(this, LLJILJIL[7]);
    }

    private final InterfaceC1450440nqc Z1() {
        return (InterfaceC1450440nqc) this.LLJ.getValue(this, LLJILJIL[6]);
    }

    private final C1439740nZM c3() {
        return (C1439740nZM) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    private final void q3() {
        int i;
        ArrayList arrayList = new ArrayList();
        InfoStickerModel infoStickerModel = T2().getInfoStickerModel();
        if (infoStickerModel == null || !(!infoStickerModel.stickers.isEmpty())) {
            i = 1;
        } else {
            i = 1;
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                int i2 = stickerItemModel.type;
                if (i2 == 4) {
                    arrayList.add(stickerItemModel);
                } else if (i2 == 7) {
                    arrayList.add(stickerItemModel);
                } else if (i2 == 26) {
                    arrayList.add(stickerItemModel);
                } else if (i2 == 24) {
                    arrayList.add(stickerItemModel);
                } else {
                    int i3 = stickerItemModel.layerWeight;
                    if (i3 > i) {
                        i = i3;
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS41S0000000_22(8));
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((StickerItemModel) ListProtector.get(arrayList, i4)).layerWeight = i + i4 + 1;
        }
    }

    private final AbstractC1453750nvx w2() {
        return (AbstractC1453750nvx) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    public final InterfaceC1461350o8D G2() {
        return (InterfaceC1461350o8D) this.LLIZLLLIL.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    public final VideoPublishEditModel T2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final InterfaceC23230098i o2() {
        return (InterfaceC23230098i) this.LLJIJIL.getValue(this, LLJILJIL[8]);
    }

    private final InterfaceC1461650o8h H2() {
        return X1().Iz2().LIZJ();
    }

    private final InterfaceC1444170ngV i3() {
        return w2().LLLLLJIL();
    }

    @Override // X.InterfaceC384890F7f
    public InterfaceC1444130ngR LLJIJIL() {
        return W2();
    }

    public final void v3() {
        InterfaceC1444170ngV interfaceC1444170ngVI3 = i3();
        if (interfaceC1444170ngVI3 != null) {
            interfaceC1444170ngVI3.LJLI();
        }
    }

    public InterfaceC1455760nzC W1() {
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

    public C1444110ngP(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void m3(List<TextStickerData> list) {
        String effectId;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(((TextStickerData) ListProtector.get(list, i)).getFontType());
                if (textFontStyleDataLJIILL != null) {
                    String str = textFontStyleDataLJIILL.title;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    Effect effect = textFontStyleDataLJIILL.LJ;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    sb2.append(effectId);
                    if (i != list.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            T2().setTextTypes(sb.toString());
            T2().setTextEffectIds(sb2.toString());
            return;
        }
        T2().setTextTypes("");
        T2().setTextEffectIds("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        r5.stickers.add(r7);
     */
    @Override // X.InterfaceC384890F7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLZILL(com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.path
            boolean r0 = X.C2354709Kn.LIZIZ(r0)
            if (r0 != 0) goto L1e
            boolean r0 = X.C1440480naY.LIZ()
            if (r0 == 0) goto Laa
            boolean r0 = r7.isTextSticker()
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.T2()
            boolean r0 = X.C1428470nHB.LJLJI(r0)
            if (r0 == 0) goto Laa
        L1e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.T2()
            boolean r0 = r0.hasInfoStickers()
            if (r0 != 0) goto L48
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r6.T2()
            com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel r2 = new com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0o7a r1 = r0.getPathAdapter()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.T2()
            java.lang.String r0 = r1.LJJLIIIJ(r0)
            r2.<init>(r0)
            r3.setInfoStickerModel(r2)
        L48:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.T2()
            com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel r5 = r0.getInfoStickerModel()
            if (r5 == 0) goto La7
            java.util.List<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r5.stickers
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r5.stickers
            java.util.Iterator r3 = r0.iterator()
            r2 = 1
        L63:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r1 = (com.ss.android.ugc.aweme.editSticker.model.StickerItemModel) r1
            boolean r0 = X.C1403820mdQ.LIZ(r1)
            if (r0 == 0) goto L63
            int r0 = r1.layerWeight
            if (r0 <= r2) goto L63
            r2 = r0
            goto L63
        L7b:
            r2 = 1
        L7c:
            int r0 = r7.layerWeight
            int r0 = r0 + r2
            r7.layerWeight = r0
            java.util.List<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r5.stickers
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L88:
            boolean r0 = r4.hasNext()
            r2 = -1
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r0 = (com.ss.android.ugc.aweme.editSticker.model.StickerItemModel) r0
            int r1 = r0.viewHash
            int r0 = r7.viewHash
            if (r1 != r0) goto Lab
            if (r3 <= r2) goto Lae
            java.util.List<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r5.stickers
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r3)
            java.util.List<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r5.stickers
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r0, r3, r7)
        La7:
            r6.q3()
        Laa:
            return
        Lab:
            int r3 = r3 + 1
            goto L88
        Lae:
            java.util.List<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r5.stickers
            r0.add(r7)
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444110ngP.LLZILL(com.ss.android.ugc.aweme.editSticker.model.StickerItemModel):void");
    }

    @Override // X.InterfaceC1455760nzC, X.InterfaceC1460660o76
    public void Jq(Runnable runnable, boolean z, boolean z2) {
        p82(runnable, z, z2);
    }

    @Override // X.InterfaceC1455760nzC
    public void Ly0(boolean z, boolean z2, Function0<Unit> function0) {
        C013C c013c = new C013C();
        c013c.element = true;
        p82(new ARunnableS55S0300000_22(c013c, this, function0, 7), z, z2);
        if (c013c.element) {
            JY0().oL2();
            c013c.element = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x022c  */
    @Override // X.InterfaceC1455760nzC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C15O7<kotlin.Unit> p82(final java.lang.Runnable r16, boolean r17, final boolean r18) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444110ngP.p82(java.lang.Runnable, boolean, boolean):X.15O7");
    }
}
