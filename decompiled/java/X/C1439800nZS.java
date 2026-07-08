package X;

import android.util.Size;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS2S0502000_5;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439800nZS implements InterfaceC1428340nGy, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public List<TextStickerModel> LLJ;
    public boolean LLJI;
    public C346940Diu LLJIJIL;
    public List<TextStickerModel> LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1439800nZS.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1439800nZS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1439800nZS.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1439800nZS.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1439800nZS.class, "filterApi", "getFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1439800nZS.class, "imageGlobalStickerApi", "getImageGlobalStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean init() {
        this.LLJI = false;
        LJ().T22(false, null);
        return true;
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean mn() {
        return false;
    }

    public final InterfaceC1451050nrb LIZIZ() {
        return (InterfaceC1451050nrb) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    public final InterfaceC1464960oE2 LIZJ() {
        return (InterfaceC1464960oE2) this.LLIZLLLIL.getValue(this, LLJILLL[5]);
    }

    public final InterfaceC1450920nrO LJ() {
        return (InterfaceC1450920nrO) this.LLILZLL.getValue(this, LLJILLL[3]);
    }

    public final VideoPublishEditModel LJFF() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    @Override // X.InterfaceC1428340nGy
    public final Size N2() {
        return (Size) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC1428340nGy
    public final Size cn() {
        return new Size(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ);
    }

    @Override // X.InterfaceC1428340nGy
    public final CreativeInfo LIZ() {
        return LJFF().getCreativeInfo();
    }

    public final C0FVY LIZLLL() {
        return (C0FVY) LJ().V51(C0FVY.class);
    }

    @Override // X.InterfaceC1428340nGy
    public final SingleImageData LJIL() {
        return LJ().OR1();
    }

    @Override // X.InterfaceC1428340nGy
    public final ViewGroup.MarginLayoutParams ej() {
        return LIZIZ().ej();
    }

    @Override // X.InterfaceC1428340nGy
    public final InterfaceC1452170ntP g() {
        return LIZIZ().g().getValue();
    }

    @Override // X.InterfaceC1428340nGy
    public final int gn() {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = LJFF().getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return 1;
        }
        return imageList.size();
    }

    @Override // X.InterfaceC1428340nGy
    public final int h7() {
        return LIZIZ().h7();
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean in() {
        return LJIL().isEdited(true, false);
    }

    @Override // X.InterfaceC1428340nGy
    public final List<TextStickerModel> kn() {
        C0FVY c0fvyLIZLLL = LIZLLL();
        return c0fvyLIZLLL != null ? LJI(c0fvyLIZLLL) : C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean nn() {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = LJFF().getImageAlbumData();
        return (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() <= 1) ? false : true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public static List LJI(C0FVY c0fvy) {
        List<StickerModel> listLLLILZLLLI = c0fvy.LLLILZLLLI(EnumC1466150oFx.TEXT);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next());
        }
        return arrayList2;
    }

    public static void LJII(C0FVY c0fvy) {
        Iterator it2 = ((ArrayList) LJI(c0fvy)).iterator();
        while (it2.hasNext()) {
            c0fvy.L2(((TextStickerModel) it2.next()).getId());
        }
    }

    public final void LJIIIIZZ(float f) {
        float fFloatValue;
        float fFloatValue2;
        if (C1441980ncy.LIZIZ(LJFF())) {
            return;
        }
        LJ().wf2().setEditRect(LJ().iK0(false, f));
        C346940Diu c346940Diu = this.LLJIJIL;
        if (c346940Diu != null) {
            Float f2 = c346940Diu.LIZJ;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            float f3 = C1450870nrJ.LIZ;
            Float f4 = c346940Diu.LJ;
            if (f4 != null) {
                fFloatValue2 = f4.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            LJ().wf2().LIZJ(fFloatValue, f3 * (-fFloatValue2));
        }
    }

    @Override // X.InterfaceC1428340nGy
    public final void LLLZLL(int i) {
        LIZIZ().LLLZLL(i);
        InterfaceC1441090nbX interfaceC1441090nbX = (InterfaceC1441090nbX) this.LLILZIL.getValue(this, LLJILLL[2]);
        if (interfaceC1441090nbX != null) {
            interfaceC1441090nbX.LLLZLL(i);
        }
        InterfaceC1464960oE2 interfaceC1464960oE2LIZJ = LIZJ();
        if (interfaceC1464960oE2LIZJ != null) {
            interfaceC1464960oE2LIZJ.LLLLZLL(true);
        }
    }

    @Override // X.InterfaceC1428340nGy
    public final void fn(C346940Diu c346940Diu) {
        float fFloatValue;
        float fFloatValue2;
        this.LLJIJIL = c346940Diu;
        if (C1441980ncy.LIZIZ(LJFF())) {
            LIZIZ().fu1(c346940Diu);
            return;
        }
        LIZIZ().cv0(c346940Diu, false);
        Float f = c346940Diu.LIZJ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        float f2 = C1450870nrJ.LIZ;
        Float f3 = c346940Diu.LJ;
        if (f3 != null) {
            fFloatValue2 = f3.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        float f4 = f2 * (-fFloatValue2);
        LJ().wf2().LIZJ(fFloatValue, f4);
        LJ().Tp1(fFloatValue, f4);
    }

    public C1439800nZS(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1441090nbX.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1450920nrO.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453430nvR.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1464960oE2.class, null);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJ = c13bv;
        this.LLJILJIL = c13bv;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 952));
    }

    @Override // X.InterfaceC1428340nGy
    public final void jn(boolean z, boolean z2) {
        if (z) {
            C1456140nzo.LIZIZ(LIZIZ(), false, true, false, false, 12);
            LIZIZ().vW1().setValue(C1452730nuJ.LIZJ());
        } else {
            LJ().wf2().LL = -1;
            C1456140nzo.LIZIZ(LIZIZ(), true, true, false, false, 12);
            LIZIZ().vW1().setValue(C1452730nuJ.LIZ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel>] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel>] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.13BV] */
    @Override // X.InterfaceC1428340nGy
    public final void ln(boolean z, boolean z2) {
        ?? arrayList;
        ?? arrayList2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStickers ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        C385200F8k.LIZ("ImagePhotoTemplateExternalApiAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1464960oE2 interfaceC1464960oE2LIZJ = LIZJ();
        if (interfaceC1464960oE2LIZJ != null) {
            interfaceC1464960oE2LIZJ.LLLLZLL(z);
        }
        if (z) {
            if (z2) {
                C0FVY c0fvyLIZLLL = LIZLLL();
                if (c0fvyLIZLLL != null) {
                    LJII(c0fvyLIZLLL);
                }
                for (TextStickerModel textStickerModel : this.LLJILJIL) {
                    C0FVY c0fvyLIZLLL2 = LIZLLL();
                    if (c0fvyLIZLLL2 != null) {
                        c0fvyLIZLLL2.f4(textStickerModel);
                    }
                }
            } else if (this.LLJI) {
                C0FVY c0fvyLIZLLL3 = LIZLLL();
                if (c0fvyLIZLLL3 != null) {
                    LJII(c0fvyLIZLLL3);
                }
                for (TextStickerModel textStickerModel2 : this.LLJ) {
                    C0FVY c0fvyLIZLLL4 = LIZLLL();
                    if (c0fvyLIZLLL4 != null) {
                        c0fvyLIZLLL4.f4(textStickerModel2);
                    }
                }
                this.LLJI = false;
            }
            LJIIIIZZ(LJIL().getImageRatio());
            return;
        }
        if (z2) {
            C0FVY c0fvyLIZLLL5 = LIZLLL();
            if (c0fvyLIZLLL5 != null) {
                List listLJI = LJI(c0fvyLIZLLL5);
                arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
                for (TextStickerModel textStickerModel3 : (ArrayList) listLJI) {
                    arrayList2.add(TextStickerModel.copy$default(textStickerModel3, BaseStickerModel.copy$default(textStickerModel3.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, TextTemplateModel.LIZ(textStickerModel3.getTextTemplateModel(), "", 266338303), false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -536870916, 65535, null));
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            this.LLJILJIL = arrayList2;
        }
        if (!this.LLJI) {
            C0FVY c0fvyLIZLLL6 = LIZLLL();
            if (c0fvyLIZLLL6 != null) {
                List listLJI2 = LJI(c0fvyLIZLLL6);
                arrayList = new ArrayList(C15438062q.LJIJJ(listLJI2, 10));
                for (TextStickerModel textStickerModel4 : (ArrayList) listLJI2) {
                    arrayList.add(TextStickerModel.copy$default(textStickerModel4, BaseStickerModel.copy$default(textStickerModel4.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, TextTemplateModel.LIZ(textStickerModel4.getTextTemplateModel(), "", 266338303), false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -536870916, 65535, null));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            this.LLJ = arrayList;
            C0FVY c0fvyLIZLLL7 = LIZLLL();
            if (c0fvyLIZLLL7 != null) {
                LJII(c0fvyLIZLLL7);
            }
            this.LLJI = true;
        } else {
            C0FVY c0fvyLIZLLL8 = LIZLLL();
            if (c0fvyLIZLLL8 != null) {
                LJII(c0fvyLIZLLL8);
            }
        }
        LJIIIIZZ(LJIL().getImageRatio());
    }

    @Override // X.InterfaceC1428340nGy
    public final void dn(NLEModel nLEModel, NLETemplateModel nLETemplateModel, C5183020f c5183020f) {
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (!nLETrack.getMainTrack()) {
                arrayList.add(nLETrack);
            }
        }
        int size = arrayList.size();
        VecNLETrackSPtr tracks2 = nLETemplateModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack2 : tracks2) {
            if (!nLETrack2.getMainTrack()) {
                arrayList2.add(nLETrack2);
            }
        }
        int i = 0;
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                C0CNO.LIZLLL(0L, new AwS2S0502000_5(this, nLEModel, (NLETrack) obj, nLETemplateModel, c5183020f, i, size, 1));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC1428340nGy
    public final void on(NLEModel nLEModel, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            LJFF().creativeModel.imageEditModel.map.put(str, str2);
        } else {
            LJFF().creativeModel.imageEditModel.map.remove(str);
        }
        LJ().qz(str, nLEModel);
    }

    @Override // X.InterfaceC1428340nGy
    public final void en(int i, SingleImageData singleImageData, String str, NLEModel nLEModel) {
        String id = singleImageData.getId();
        C371780Ehs.LIZLLL(id);
        on(nLEModel, id, str);
        C1664740tQG c1664740tQG = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) c1664740tQG.getValue(this, interfaceC2217461BqaArr[4]);
        if (interfaceC1453430nvR != null) {
            interfaceC1453430nvR.l4(true);
        }
        C1450610nqt c1450610nqt = (C1450610nqt) LJ().V51(C1450610nqt.class);
        if (c1450610nqt != null) {
            c1450610nqt.LJ = false;
        }
        LIZIZ().F71(i, singleImageData);
        InterfaceC1441090nbX interfaceC1441090nbX = (InterfaceC1441090nbX) this.LLILZIL.getValue(this, interfaceC2217461BqaArr[2]);
        if (interfaceC1441090nbX != null) {
            interfaceC1441090nbX.f6(i, singleImageData.getSrcImageInfo().getPath());
        }
        InterfaceC1464960oE2 interfaceC1464960oE2LIZJ = LIZJ();
        if (interfaceC1464960oE2LIZJ != null) {
            interfaceC1464960oE2LIZJ.LLLLZLL(true);
        }
    }

    @Override // X.InterfaceC1428340nGy
    public final void hn(int i, SingleImageData singleImageData, String str, NLEModel nLEModel) {
        String id = singleImageData.getId();
        C371780Ehs.LIZLLL(id);
        on(nLEModel, id, str);
        LIZIZ().r40(i, singleImageData);
        InterfaceC1441090nbX interfaceC1441090nbX = (InterfaceC1441090nbX) this.LLILZIL.getValue(this, LLJILLL[2]);
        if (interfaceC1441090nbX != null) {
            interfaceC1441090nbX.nT(i, singleImageData.getSrcImageInfo().getPath());
        }
        InterfaceC1464960oE2 interfaceC1464960oE2LIZJ = LIZJ();
        if (interfaceC1464960oE2LIZJ != null) {
            interfaceC1464960oE2LIZJ.LLLLZLL(true);
        }
    }
}
