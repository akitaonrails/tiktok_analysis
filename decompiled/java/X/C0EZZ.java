package X;

import Y.AObjectS240S0100000_5;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZZ extends AbstractC2255721DQs<InterfaceC366660EZc> implements InterfaceC366660EZc, InterfaceC379610EuV {
    public static final C366650EZb LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376040Eok.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    public final LiveData<Void> LLIZLLLIL = new MutableLiveData();
    public int LLJ;
    public boolean LLJI;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0EZb] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EZZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EZZ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C0EZZ.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new C2217381BqS(C0EZZ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C0EZZ.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C0EZZ.class, "context", "getContext()Landroid/content/Context;", 0)};
        LLJIJIL = new Object() { // from class: X.0EZb
        };
        LLJILJILJ = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c3() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EZZ.c3():void");
    }

    public InterfaceC366660EZc w2() {
        return this;
    }

    private final InterfaceC1461350o8D T2() {
        return (InterfaceC1461350o8D) this.LLILZLL.getValue(this, LLJILJIL[4]);
    }

    private final Context getContext() {
        return (Context) this.LLIZ.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC1455850nzL G2() {
        return (InterfaceC1455850nzL) this.LLILZIL.getValue(this, LLJILJIL[3]);
    }

    public final InterfaceC376040Eok H2() {
        return (InterfaceC376040Eok) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    public final VideoPublishEditModel W2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    private final NLEModel LLZ() {
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null) {
            return C352130DrH.LIZ(value);
        }
        return null;
    }

    private final void Z1() {
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ != null) {
            C363500EMy c363500EMy = C363500EMy.LIZ;
            EditorProModel editorProModel = W2().getEditorProModel();
            c363500EMy.getClass();
            C363500EMy.LIZIZ(editorProModel, nLEModelLLZ, null);
            if (C351220Dpo.LJJLIIIJLJLI(nLEModelLLZ).isEmpty() && ((ArrayList) C351220Dpo.LJLIL(nLEModelLLZ)).isEmpty()) {
                return;
            }
            C363500EMy.LIZJ(W2().creativeModel.magicCombineEffectModel, nLEModelLLZ);
            EditorProModel editorProModel2 = W2().getEditorProModel();
            editorProModel2.setAdvancedEditDraft(true);
            editorProModel2.setRealOrigin((Integer) C351360Dq2.LIZIZ(nLEModelLLZ, W2().getOrigin()).getSecond());
        }
    }

    private final void q3() {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return;
        }
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.setModel(nLEModelLIZ);
        nLEEditorLIZ.commit();
        nLEEditorLIZ.done();
        String strStore = nLEEditorLIZ.store();
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(W2().getCreativeInfo(), EnumC20228214Cy.UGC_TEMPLATE, "original_nle_data.json", false).getAbsolutePath();
        C2354709Kn.LJJ(absolutePath, strStore);
        W2().creativeModel.ugcTemplateData.originalNormalizedNLEPath = absolutePath;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if ((C1416310mxZ.LJJJLIIL(W2()) || Intrinsics.LJFF(C1416310mxZ.LJJIJIIJI(W2(), null, false), C1412630mrd.LIZLLL(EnumC1412640mre.SGT)) || C1428470nHB.LLIIIZ(W2()) || u4.LJJJJIZL(W2()) || C1416310mxZ.LJJJLL(W2())) && (!W2().mIsFromDraft || W2().mDraftToEditFrom == 8)) {
            JY0().ww2().observe(this, new AObjectS240S0100000_5(this, 149));
        } else {
            QS().postValue(null);
        }
    }

    @Override // X.InterfaceC366660EZc
    public LiveData<Void> QS() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366660EZc
    public boolean uE2() {
        return this.LLJI;
    }

    public C0EZZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0EZ1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    private final void X1(NLEModel nLEModel) {
        ?? arrayList;
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        List arrayList2;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && nLEModel != null && C351220Dpo.LLFFF(nLEModel)) {
            new C0EK5();
            VESize initSize = value.getInitSize();
            int iLIZIZ = C497820Jfg.LIZIZ(C1664590tQ1.LJII(this));
            VESize vESize = new VESize(iLIZIZ, (int) ((iLIZIZ / initSize.width) * initSize.height));
            if (vESize.width > 0 && vESize.height > 0) {
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                if (tracks != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        if (C351220Dpo.LLJLLIL(nLETrack)) {
                            arrayList3.add(nLETrack);
                        }
                    }
                    arrayList2 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Iterable slots = ((NLETrack) it2.next()).getSlots();
                        if (slots == null) {
                            slots = C13BV.INSTANCE;
                        }
                        C19719612Di.LJJI(slots, arrayList2);
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                if (arrayList2.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        LyricStickerModel lyricStickerModelLIZLLL = C0EK5.LIZLLL((NLETrackSlot) it3.next(), vESize, 0);
                        if (lyricStickerModelLIZLLL != null) {
                            arrayList.add(lyricStickerModelLIZLLL);
                        }
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if ((!arrayList.isEmpty()) && (creativeModel = W2().creativeModel) != null && (stickerNewEngineModel = creativeModel.stickerModel) != null) {
                stickerNewEngineModel.enableLyricSticker = Boolean.TRUE;
            }
            ?? WM2 = T2().WM2();
            if (WM2 != 0) {
                WM2.M(arrayList, EnumC356070Dxd.NONE);
            }
        }
    }

    private final void o2(StickerItemModel stickerItemModel) {
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null) {
            return;
        }
        float[] srtInfoStickerInitPosition = c348100DkmLIZIZ.LJIIIZ().LIZ().getSrtInfoStickerInitPosition(stickerItemModel.uuid);
        stickerItemModel.currentOffsetX = srtInfoStickerInitPosition[0];
        stickerItemModel.currentOffsetY = srtInfoStickerInitPosition[1];
        float[] fArrLIZJ = c348100DkmLIZIZ.LJIIIZ().LIZ().LIZJ(stickerItemModel.uuid);
        VESize initSize = value.getInitSize();
        float f = stickerItemModel.scale;
        if (f == 0.0f) {
            f = 1.0f;
        }
        stickerItemModel.scale = f;
        stickerItemModel.initWidth = ((fArrLIZJ[2] - fArrLIZJ[0]) * initSize.width) / f;
        stickerItemModel.initHeight = ((fArrLIZJ[1] - fArrLIZJ[3]) * initSize.height) / f;
    }

    private final void W1(StickerItemModel stickerItemModel, TextStickerData textStickerData) {
        textStickerData.setFontSize(28);
        C0F7U.LJIIJ(getContext(), JY0(), "EditUgcTemplateComponent", textStickerData, new AwS214S0300000_5(stickerItemModel, textStickerData, this, 28));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditUgcTemplateComponent addToProcessSplitTextTask fontType: ");
        sbLIZ.append(textStickerData.getFontType());
        sbLIZ.append(" text ");
        sbLIZ.append(textStickerData.getTextStr());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJI = false;
    }

    private final void i3(StickerItemModel stickerItemModel, boolean z) {
        TextStickerData textStickerData;
        Integer numValueOf;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, TextStickerData.class)) == null || Intrinsics.LJFF(textStickerData.getType(), "type_inline_caption")) {
            return;
        }
        int i = value.getInitSize().width;
        int i2 = value.getInitSize().height;
        textStickerData.setX(textStickerData.getX() * i);
        textStickerData.setY(textStickerData.getY() * i2);
        boolean zLIZLLL = C351420Dq8.LIZLLL(C352130DrH.LIZ(value));
        if (zLIZLLL || (((Boolean) C0AYF.LIZ.getValue()).booleanValue() && stickerItemModel.isFromPugcTemplate().booleanValue())) {
            numValueOf = Integer.valueOf(stickerItemModel.layerWeight);
        } else {
            numValueOf = null;
        }
        if (C1416310mxZ.LJJLIIIJJIZ(W2())) {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = C1416310mxZ.LJJIJIL(W2()).size();
            this.LLJI = false;
            C0F7U.LJIIJ(getContext(), JY0(), "EditUgcTemplateComponent", textStickerData, new C366640EZa(textStickerData, this, c118300cf, z, zLIZLLL, numValueOf));
            return;
        }
        stickerItemModel.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
        W1(stickerItemModel, textStickerData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0006  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC366660EZc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d10(boolean r8, X.C0E4T r9, com.bytedance.ies.nle.editor_jni.NLEModel r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EZZ.d10(boolean, X.0E4T, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }
}
