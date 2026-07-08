package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0F4T, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4T extends AbstractC365870EWb {
    public final C554970Lpf LIZ;
    public final boolean LIZIZ = !C297640Bla.LIZ();
    public final InterfaceC1635410sex LIZJ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final List<C0F4V> LIZLLL = new ArrayList();

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 20;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 460;
    }

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C0F4T(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        List<SingleImageData> imageList;
        Iterable textStickerModels;
        if (!this.LIZ.LJ.LJIIL()) {
            return true;
        }
        ImageAlbumData imageAlbumData = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList<TextStickerModel> arrayList = new ArrayList();
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine == null || (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) == null) {
                    textStickerModels = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(textStickerModels, arrayList);
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            for (TextStickerModel textStickerModel : arrayList) {
                if (C0F8Y.LJIIL(textStickerModel)) {
                    C0F4V c0f4v = new C0F4V(textStickerModel.getTextTemplateModel().templateEffectId);
                    if (!C2354709Kn.LIZIZ(textStickerModel.getTextTemplateModel().templatePath)) {
                        c0f4v.LIZIZ = true;
                    }
                    for (TextTemplateTools.TextTemplateDependResource textTemplateDependResource : ((TextTemplateTools.TextTemplateDependResources) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), textStickerModel.getTextTemplateModel().dependResourcesJson, TextTemplateTools.TextTemplateDependResources.class)).dependResourceList) {
                        if (!C2354709Kn.LIZIZ(textTemplateDependResource.resourcePath)) {
                            c0f4v.LIZJ.add(textTemplateDependResource);
                        }
                    }
                    if (c0f4v.LIZIZ || (!c0f4v.LIZJ.isEmpty())) {
                        ((ArrayList) this.LIZLLL).add(c0f4v);
                    }
                } else if (textStickerModel.getTextTemplateModel().enableTextTemplate) {
                    C0F4V c0f4v2 = new C0F4V(textStickerModel.getTextTemplateModel().templateEffectId);
                    if (!C2354709Kn.LIZIZ(textStickerModel.getTextTemplateModel().templatePath)) {
                        c0f4v2.LIZIZ = true;
                    }
                    if (textStickerModel.getTextTemplateModel().useDefaultFont) {
                        String str = textStickerModel.getTextTemplateModel().defaultFontPath;
                        if (str.length() != 0 && !C2354709Kn.LIZIZ(str)) {
                            c0f4v2.LIZLLL = textStickerModel.getTextTemplateModel().defaultFontID;
                        }
                    }
                    if (c0f4v2.LIZIZ || c0f4v2.LIZLLL != null) {
                        ((ArrayList) this.LIZLLL).add(c0f4v2);
                    }
                }
            }
            return Boolean.valueOf(((ArrayList) this.LIZLLL).isEmpty());
        }
        return true;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        List<SingleImageData> imageList;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        if (!this.LIZ.LJ.LJIIL()) {
            return true;
        }
        ImageAlbumData imageAlbumData = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                    Iterator<TextStickerModel> it3 = textStickerModels.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().getTextTemplateModel().enableTextTemplate) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C0M7M.LIZ("DraftImageAdjustRestoreHandler ; restore start ...");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C356710Dyf(this, c2252611DEt, null), 3);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009e -> B:16:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0100 -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0102 -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012a -> B:16:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0141 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC20236714Gf<? super java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult>> r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F4T.LJIIIIZZ(X.14Gf, X.05Vn):java.lang.Object");
    }
}
