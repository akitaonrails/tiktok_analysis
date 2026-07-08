package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EX7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EX7 implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public List<TextStickerModel> LLILLJJLI;
    public final C0EX2 LLILLL = C0EX2.EP_TEXT_STICKER;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664750tQH LLJI;
    public AICaptionTagStickerModel LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EX7.class, "epTextStickerApi", "getEpTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EX7.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EX7.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EX7.class, "aIMemeApiComponent", "getAIMemeApiComponent()Lcom/ss/android/ugc/aweme/aicaption/AIMemeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EX7.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EX7.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0EX7.class, "editorContext", "getEditorContext()Lcom/ss/ugc/android/editor/core/EditorContextApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    public final C0EJ3 LJIIIZ() {
        return (C0EJ3) this.LLILZ.getValue(this, LLJILJIL[0]);
    }

    public final InterfaceC391240FVq LJIIJ() {
        return ((InterfaceC1455850nzL) this.LLILZIL.getValue(this, LLJILJIL[1])).Nr0().LIZJ();
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
        List<TextStickerModel> listSb = LJIIIZ().Sb();
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listSb) {
            TextStickerModel textStickerModel2 = textStickerModel;
            InterfaceC391240FVq interfaceC391240FVqLJIIJ = LJIIJ();
            if (interfaceC391240FVqLJIIJ == null || interfaceC391240FVqLJIIJ.tq(textStickerModel2.getId()) == null) {
                arrayList.add(textStickerModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TextStickerModel textStickerModelDeepCopy = ((TextStickerModel) it2.next()).deepCopy();
            textStickerModelDeepCopy.getBaseStickerModel().setEnableNLEChange(false);
            arrayList2.add(textStickerModelDeepCopy);
        }
        InterfaceC391240FVq interfaceC391240FVqLJIIJ2 = LJIIJ();
        if (interfaceC391240FVqLJIIJ2 != null) {
            interfaceC391240FVqLJIIJ2.w3(arrayList2, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLL;
    }

    public C0EX7(C1DRG c1drg, List<TextStickerModel> list) {
        this.LL = c1drg;
        this.LLILLJJLI = list;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C0EJ3.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC19530111b1.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, C0EXI.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, C0EGY.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC357200DzS.class, null);
    }

    public static void LJIIIIZZ(NLETrackSlot nLETrackSlot, TextStickerModel textStickerModel) {
        String extra = nLETrackSlot.getExtra("is_editorpro_trim_text_length");
        String extra2 = nLETrackSlot.getExtra("is_editorpro_copy_text");
        String extra3 = nLETrackSlot.getExtra("is_editorpro_tts");
        String extra4 = nLETrackSlot.getExtra("editorpro_tts_tone_id");
        textStickerModel.getMobModel().isEditorProTrimLength = extra;
        textStickerModel.getMobModel().isEditorProCopyText = extra2;
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel != null) {
            ttsModel.isEditorProTTS = Intrinsics.LJFF(extra3, "1");
        }
        TTSModel ttsModel2 = textStickerModel.getTtsModel();
        if (ttsModel2 != null) {
            ttsModel2.editorProTTSID = extra4;
        }
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        List<StickerModel> listS32;
        TextStickerModel textStickerModel;
        TTSModel ttsModel;
        BaseStickerModel baseStickerModel;
        InterfaceC391240FVq interfaceC391240FVqLJIIJ = LJIIJ();
        if (interfaceC391240FVqLJIIJ != null && (listS32 = interfaceC391240FVqLJIIJ.s32()) != null) {
            for (StickerModel stickerModel : listS32) {
                boolean z = stickerModel instanceof TextStickerModel;
                String str = null;
                if (z) {
                    TextStickerModel textStickerModel2 = (TextStickerModel) stickerModel;
                    if (textStickerModel2 != null && (baseStickerModel = textStickerModel2.getBaseStickerModel()) != null) {
                        baseStickerModel.setEnableNLEChange(true);
                    }
                    if (z && (textStickerModel = (TextStickerModel) stickerModel) != null && (ttsModel = textStickerModel.getTtsModel()) != null) {
                        str = ttsModel.audioTrackFilePath;
                    }
                }
                EditModelProvider.Companion.getClass();
                C386320FCs editorProFileCenter = C0E1T.LIZ().getEditorProFileCenter();
                if (str == null) {
                    str = "";
                }
                editorProFileCenter.LIZ.remove(str);
            }
        }
        InterfaceC391240FVq interfaceC391240FVqLJIIJ2 = LJIIJ();
        if (interfaceC391240FVqLJIIJ2 != null && (listLLLLLZ = interfaceC391240FVqLJIIJ2.LLLLLZ(EnumC1466150oFx.TEXT)) != null) {
            Iterator<C0FTJ<StickerModel>> it2 = listLLLLLZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIJZLJL().setEnableNLEChange(true);
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return C351220Dpo.LLLJIL(nLETrackSlot);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // X.InterfaceC366210EXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C0EXH r7, X.C0EY3 r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EX7.LIZLLL(X.0EXH, X.0EY3, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) throws Throwable {
        C348100Dkm c348100DkmLIZIZ;
        C0FW6 c0fw6LJIIIZ;
        List<C0EXF> list;
        C0EY1 c0ey1 = c0exh.LIZIZ;
        ArrayList arrayList = null;
        if (c0ey1 != null && (list = c0ey1.LIZIZ) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C0EXF> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ.getSecond());
            }
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        NLEModel nLEModel = c0ey3.LIZ;
        EditorProModel editorProModel = c0ey3.LIZIZ.getEditorProModel();
        c363500EMy.getClass();
        C362740EKa.LIZ.getClass();
        C362740EKa.LIZIZ(nLEModel, editorProModel);
        InterfaceC1452170ntP value = ((InterfaceC1455860nzM) this.LLIZLLLIL.getValue(this, LLJILJIL[4])).g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            c0fw6LJIIIZ.LJIIJJI(c0ey3.LIZ);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(c366230EXl, C2107308Nj.LIZ, new C0EX8(c0ey3, this, arrayList, c0exh, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
