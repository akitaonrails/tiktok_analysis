package X;

import android.view.View;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.model.InlineCaptionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F54, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F54 {
    public final C0F5K LIZ;
    public final Function0<C0F5X> LIZIZ;

    public final void LIZ(boolean z) {
        C19A3 c19a3;
        C1DRG c1drg;
        ArrayList<TextStickerData> arrayListLJIIIIZZ;
        String str;
        CreativeModel creativeModel;
        InlineCaptionModel inlineCaptionModel;
        String str2;
        ArrayList<CaptionUtterance> arrayList;
        String string;
        C0F59 c0f59 = (C0F59) this.LIZ.LIZ.LLZ.getValue();
        C0F5K c0f5k = this.LIZ;
        C0E48 c0e48 = c0f5k.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = c0f5k.LIZJ;
        InlineCaptionViewModel inlineCaptionViewModel = c0f5k.LIZLLL;
        C0F5P c0f5p = c0f5k.LJI;
        String str3 = c0f5p.LIZIZ;
        String str4 = c0f5p.LIZ;
        C0EJ3 c0ej3 = c0f5k.LJ;
        if (c0e48 != null) {
            c0f59.getClass();
            c0e48.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
        }
        View view = c0f59.LIZ.getView();
        if (view != null) {
            Scene sceneLIZ = C0EBE.LIZ(view);
            if ((sceneLIZ instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null && c19a3.findSceneByTag(C364510EQv.class.getSimpleName()) == null && c0ej3 != null) {
                List<TextStickerModel> listSb = c0ej3.Sb();
                ArrayList arrayList2 = new ArrayList();
                for (TextStickerModel textStickerModel : listSb) {
                    if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                        arrayList2.add(textStickerModel);
                    }
                }
                int size = arrayList2.size();
                C1402610mbT.LJJIIZI(videoPublishEditModel, "click", "remove_filler_words", inlineCaptionViewModel.vQ2(str4));
                C364440EQo c364440EQoU4 = c0ej3.u4();
                if (c364440EQoU4 != null) {
                    if (str3 == null) {
                        str2 = str4;
                    } else {
                        str2 = str3;
                    }
                    CaptionCachesModel captionCachesModel = c364440EQoU4.LIZ.get(str2);
                    if (captionCachesModel != null && z && (arrayList = captionCachesModel.captionsList) != null) {
                        arrayListLJIIIIZZ = C363730ENv.LJIIIIZZ(arrayList);
                        if (!arrayListLJIIIIZZ.isEmpty()) {
                            for (TextStickerData textStickerData : arrayListLJIIIIZZ) {
                                if (!C363740ENw.LIZLLL(textStickerData.getFilterTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                                    List<Word> words = textStickerData.getWords();
                                    if (!(words instanceof Collection) || !words.isEmpty()) {
                                        Iterator<Word> it2 = words.iterator();
                                        while (it2.hasNext()) {
                                            if (C363740ENw.LIZLLL(it2.next().getTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C19EG activity = c0f59.LIZ.getActivity();
                        if (activity != null) {
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            C19EG activity2 = c0f59.LIZ.getActivity();
                            if (activity2 != null) {
                                string = activity2.getString(2131833331);
                            } else {
                                string = null;
                            }
                            creativeToastBuilder.message(string);
                            C1390380mHk.LIZ(activity, 3027, creativeToastBuilder);
                            return;
                        }
                        return;
                    }
                    arrayListLJIIIIZZ = null;
                } else {
                    arrayListLJIIIIZZ = null;
                }
                c0f59.LIZIZ.LIZIZ(C0F58.CAPTION_WORD_FILTER);
                if (c0e48 != null) {
                    c0e48.getPlayer().pause(false);
                    C364440EQo c364440EQoU42 = c0ej3.u4();
                    if (c364440EQoU42 == null) {
                        c364440EQoU42 = new C364440EQo();
                    }
                    int iLIZ = ((C0ES4) c0f59.LIZ.LLLLLZIL.getValue()).LIZ() - C0ES3.LIZ;
                    if (str3 == null) {
                        str3 = str4;
                    }
                    C375820EoO.LIZ(c19a3, c0e48, C364510EQv.class, new C364490EQt(c19a3, c0e48, c1drg, c364440EQoU42, new C0EJ2(iLIZ, true, str3, 8), arrayListLJIIIIZZ, new AwS406S0200000_5(c0f59, c0e48, 1), new AwS441S0200000_5(c0f59, inlineCaptionViewModel, 0)), 16);
                    if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (inlineCaptionModel = creativeModel.inlineCaptionModel) != null) {
                        str = inlineCaptionModel.selectLanguageCode;
                    } else {
                        str = null;
                    }
                    C1402610mbT.LJJIFFI(size, videoPublishEditModel, "click_caption_bulk_editing_panel", str);
                }
            }
        }
    }

    public C0F54(C0F5K c0f5k, AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = c0f5k;
        this.LIZIZ = awS549S0100000_5;
    }
}
