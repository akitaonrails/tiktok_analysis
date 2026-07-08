package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextWatcher;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0EPI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPI extends AbstractC381020Ewm<C0EJ3> implements C0EJ3, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final C0EJ3 LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public List<? extends NLETrack> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public Long LLJJJIL;
    public C385230F8n LLJJJJ;
    public final C01GW LLJJJJJIL;
    public TextWatcher LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EPI.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EPI.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EPI.class, "captionApi", "getCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/CaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EPI.class, "captionProvider", "getCaptionProvider()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/EditorProCaptionProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EPI.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EPI.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0EPI.class, "consoleBar", "getConsoleBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0EPI.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0EPI.class, "textEditPanelApi", "getTextEditPanelApi()Lcom/ss/android/ugc/editorpro/components/api/text/editpanel/EPTextEditPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0EPI.class, "editorProVoiceClonePanelApi", "getEditorProVoiceClonePanelApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/voiceclone/EditorProVoiceClonePanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0EPI.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
        LLJLIL = 8;
    }

    private final C0EPL G2() {
        return (C0EPL) this.LLJ.getValue(this, LLJL[3]);
    }

    private final InterfaceC360800ECo H2() {
        return (InterfaceC360800ECo) this.LLJILJILJ.getValue(this, LLJL[6]);
    }

    private final C0EY2 i3() {
        return (C0EY2) this.LLJIJIL.getValue(this, LLJL[4]);
    }

    private final C363460EMu m3() {
        return (C363460EMu) this.LLJJIJIL.getValue();
    }

    private final InterfaceC361710EGb q3() {
        return (InterfaceC361710EGb) this.LLJILJIL.getValue(this, LLJL[5]);
    }

    private final C0EPM w2() {
        return (C0EPM) this.LLIZLLLIL.getValue(this, LLJL[2]);
    }

    public final C0FK0 B3() {
        return (C0FK0) this.LLJJJJJIL.getValue();
    }

    public final C0EKW E3() {
        return (C0EKW) this.LLJJIJIIJIL.getValue();
    }

    public final C387590FHp H3() {
        return (C387590FHp) this.LLJI.getValue();
    }

    @Override // X.C0EJ3
    public C0FF8 LJIIJ() {
        return new C0FF8() { // from class: X.0EPJ
            @Override // X.C0FF8
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.C0FF8
            public final void LJ(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5) {
            }

            @Override // X.C0FF8
            public final void LJFF(TextFontModel textFontModel, int i, int i2) {
            }

            @Override // X.C0FF8
            public final int LJIIIIZZ() {
                return -1;
            }

            @Override // X.C0FF8
            public final InterfaceC388160FJu LJIIJ() {
                return null;
            }

            @Override // X.C0FF8
            public final int LJIIJJI() {
                return 1;
            }

            @Override // X.C0FF8
            public final void LJIIL() {
            }

            @Override // X.C0FF8
            public final int LJIILJJIL(TextStickerModel textStickerModel, String str) {
                return 0;
            }

            @Override // X.C0FF8
            public final TTSVoiceModel LJIILL() {
                return null;
            }

            @Override // X.C0FF8
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.C0FF8
            public final boolean LJIJ() {
                return true;
            }

            @Override // X.C0FF8
            public final void LJIJJ(String str) {
            }

            @Override // X.C0FF8
            public final C0FGA Co() {
                NLEEditor nLEEditorLF2;
                C0EPI c0epi = this.LIZ;
                C385230F8n c385230F8n = c0epi.LLJJJJ;
                if (c385230F8n != null) {
                    return c385230F8n;
                }
                InterfaceC1452170ntP interfaceC1452170ntPO3 = c0epi.O3();
                if (interfaceC1452170ntPO3 == null || (nLEEditorLF2 = this.LIZ.LF2()) == null) {
                    return null;
                }
                C385230F8n c385230F8n2 = new C385230F8n(C1664590tQ1.LJIIIZ(this.LIZ), nLEEditorLF2, this.LIZ.getEditModel(), this.LIZ.T2(), interfaceC1452170ntPO3.getInitSize(), this.LIZ);
                this.LIZ.LLJJJJ = c385230F8n2;
                return c385230F8n2;
            }

            @Override // X.C0FF8
            public final C0FGR LIZJ() {
                return this.LIZ.H3();
            }

            @Override // X.C0FF8
            public final C0FF7 LJII() {
                return (C0FF7) this.LIZ.getDiContainer().LJIIL(null, InterfaceC384330F5b.class);
            }

            @Override // X.C0FF8
            public final TextWatcher LJIIIZ() {
                return this.LIZ.LLJJJJLIIL;
            }

            @Override // X.C0FF8
            public final boolean LJIILIIL() {
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                return editModel != null && editModel.isMvThemeVideoType();
            }

            @Override // X.C0FF8
            public final C0FK0 LJIILLIIL() {
                return this.LIZ.B3();
            }

            @Override // X.C0FF8
            public final TextFontModel LJIJI() {
                return C0EPO.LIZ();
            }

            @Override // X.C0FF8
            public final boolean LIZIZ(int i) {
                if (this.LIZ.Q3(i) && C1416310mxZ.LJIIZILJ(this.LIZ.getEditModel())) {
                    return true;
                }
                return false;
            }

            @Override // X.C0FF8
            public final boolean LJI(String str) {
                return EffectPlatform.LJJJJLI(str, false);
            }

            @Override // X.C0FF8
            public final boolean LIZ(int i, boolean z) {
                if (this.LIZ.LLJJLIIIJLLLLLLLZ) {
                    return true;
                }
                if (z) {
                    return false;
                }
                return !r2.Q3(i);
            }
        };
    }

    public final InterfaceC1452170ntP O3() {
        return (InterfaceC1452170ntP) this.LLJJJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0489 A[PHI: r146
      0x0489: PHI (r146v12 java.lang.String) = (r146v1 java.lang.String), (r146v13 java.lang.String) binds: [B:146:0x0487, B:144:0x0483] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0493 A[PHI: r146
      0x0493: PHI (r146v2 java.lang.String) = (r146v1 java.lang.String), (r146v12 java.lang.String), (r146v12 java.lang.String) binds: [B:146:0x0487, B:148:0x048b, B:150:0x0491] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0497 A[PHI: r146 r147
      0x0497: PHI (r146v11 java.lang.String) = (r146v2 java.lang.String), (r146v12 java.lang.String) binds: [B:152:0x0495, B:150:0x0491] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r147v9 java.lang.String) = (r147v1 java.lang.String), (r147v10 java.lang.String) binds: [B:152:0x0495, B:150:0x0491] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a1 A[PHI: r146 r147
      0x04a1: PHI (r146v3 java.lang.String) = (r146v2 java.lang.String), (r146v11 java.lang.String), (r146v11 java.lang.String) binds: [B:152:0x0495, B:154:0x0499, B:156:0x049f] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r147v2 java.lang.String) = (r147v1 java.lang.String), (r147v9 java.lang.String), (r147v9 java.lang.String) binds: [B:152:0x0495, B:154:0x0499, B:156:0x049f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a5 A[PHI: r146 r147 r148
      0x04a5: PHI (r146v10 java.lang.String) = (r146v3 java.lang.String), (r146v11 java.lang.String) binds: [B:158:0x04a3, B:156:0x049f] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r147v8 java.lang.String) = (r147v2 java.lang.String), (r147v9 java.lang.String) binds: [B:158:0x04a3, B:156:0x049f] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r148v7 java.lang.String) = (r148v1 java.lang.String), (r148v8 java.lang.String) binds: [B:158:0x04a3, B:156:0x049f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04a9 A[PHI: r146 r147 r148
      0x04a9: PHI (r146v9 java.lang.String) = (r146v3 java.lang.String), (r146v10 java.lang.String) binds: [B:158:0x04a3, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]
      0x04a9: PHI (r147v7 java.lang.String) = (r147v2 java.lang.String), (r147v8 java.lang.String) binds: [B:158:0x04a3, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]
      0x04a9: PHI (r148v6 java.lang.String) = (r148v1 java.lang.String), (r148v7 java.lang.String) binds: [B:158:0x04a3, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ad A[PHI: r3 r146 r147 r148
      0x04ad: PHI (r3v14 java.lang.String) = (r3v18 java.lang.String), (r3v19 java.lang.String) binds: [B:162:0x04ab, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]
      0x04ad: PHI (r146v4 java.lang.String) = (r146v9 java.lang.String), (r146v10 java.lang.String) binds: [B:162:0x04ab, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]
      0x04ad: PHI (r147v3 java.lang.String) = (r147v7 java.lang.String), (r147v8 java.lang.String) binds: [B:162:0x04ab, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]
      0x04ad: PHI (r148v2 java.lang.String) = (r148v6 java.lang.String), (r148v7 java.lang.String) binds: [B:162:0x04ab, B:160:0x04a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b1 A[PHI: r3 r146 r147 r148
      0x04b1: PHI (r3v17 java.lang.String) = (r3v14 java.lang.String), (r3v18 java.lang.String) binds: [B:164:0x04af, B:162:0x04ab] A[DONT_GENERATE, DONT_INLINE]
      0x04b1: PHI (r146v8 java.lang.String) = (r146v4 java.lang.String), (r146v9 java.lang.String) binds: [B:164:0x04af, B:162:0x04ab] A[DONT_GENERATE, DONT_INLINE]
      0x04b1: PHI (r147v6 java.lang.String) = (r147v3 java.lang.String), (r147v7 java.lang.String) binds: [B:164:0x04af, B:162:0x04ab] A[DONT_GENERATE, DONT_INLINE]
      0x04b1: PHI (r148v5 java.lang.String) = (r148v2 java.lang.String), (r148v6 java.lang.String) binds: [B:164:0x04af, B:162:0x04ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b5 A[PHI: r2 r3 r146 r147 r148
      0x04b5: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v10 java.lang.String) binds: [B:164:0x04af, B:166:0x04b3] A[DONT_GENERATE, DONT_INLINE]
      0x04b5: PHI (r3v16 java.lang.String) = (r3v14 java.lang.String), (r3v17 java.lang.String) binds: [B:164:0x04af, B:166:0x04b3] A[DONT_GENERATE, DONT_INLINE]
      0x04b5: PHI (r146v7 java.lang.String) = (r146v4 java.lang.String), (r146v8 java.lang.String) binds: [B:164:0x04af, B:166:0x04b3] A[DONT_GENERATE, DONT_INLINE]
      0x04b5: PHI (r147v5 java.lang.String) = (r147v3 java.lang.String), (r147v6 java.lang.String) binds: [B:164:0x04af, B:166:0x04b3] A[DONT_GENERATE, DONT_INLINE]
      0x04b5: PHI (r148v4 java.lang.String) = (r148v2 java.lang.String), (r148v5 java.lang.String) binds: [B:164:0x04af, B:166:0x04b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x054e A[PHI: r8
      0x054e: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:184:0x054c, B:182:0x0548] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x056a A[PHI: r3
      0x056a: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v10 int), (r3v10 int) binds: [B:209:0x0593, B:193:0x055e, B:195:0x0562, B:197:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x056e A[PHI: r3 r23
      0x056e: PHI (r3v9 int) = (r3v6 int), (r3v10 int) binds: [B:199:0x056c, B:197:0x0568] A[DONT_GENERATE, DONT_INLINE]
      0x056e: PHI (r23v3 java.lang.String) = (r23v0 java.lang.String), (r23v4 java.lang.String) binds: [B:199:0x056c, B:197:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x057c A[PHI: r3 r23
      0x057c: PHI (r3v7 int) = (r3v6 int), (r3v9 int), (r3v9 int), (r3v9 int) binds: [B:199:0x056c, B:201:0x0570, B:203:0x0574, B:205:0x057a] A[DONT_GENERATE, DONT_INLINE]
      0x057c: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v3 java.lang.String), (r23v3 java.lang.String), (r23v3 java.lang.String) binds: [B:199:0x056c, B:201:0x0570, B:203:0x0574, B:205:0x057a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0596 A[PHI: r8
      0x0596: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:184:0x054c, B:186:0x0550] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0EJ3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Rc() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EPI.Rc():void");
    }

    public final InterfaceC1455860nzM T2() {
        return (InterfaceC1455860nzM) this.LLILZLL.getValue(this, LLJL[0]);
    }

    public final C0EOK W2() {
        return (C0EOK) this.LLIZ.getValue(this, LLJL[1]);
    }

    public final InterfaceC362470EIz c3() {
        return (InterfaceC362470EIz) this.LLJJI.getValue(this, LLJL[9]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJIII.getValue(this, LLJL[10]);
    }

    public final VideoPublishEditModel getEditModel() {
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                return editModel;
            }
        }
        return new VideoPublishEditModel();
    }

    @Override // X.C0EJ3
    public List<NLETrack> iO2() {
        List list = this.LLJJIJI;
        return list == null ? C13BV.INSTANCE : list;
    }

    @Override // X.C0EJ3
    public void k1() throws JSONException {
        if (this.LLJJJIL == null) {
            C0E48 c0e48W1 = W1();
            this.LLJJJIL = c0e48W1 != null ? Long.valueOf(C350870DpF.LJI(c0e48W1).getMaxTargetEnd()) : null;
            return;
        }
        C0E48 c0e48W12 = W1();
        Long lValueOf = c0e48W12 != null ? Long.valueOf(C350870DpF.LJI(c0e48W12).getMaxTargetEnd()) : null;
        if (!Intrinsics.LJFF(lValueOf, this.LLJJJIL)) {
            Rc();
        }
        this.LLJJJIL = lValueOf;
    }

    public final C0EGY o2() {
        return (C0EGY) this.LLJILLL.getValue(this, LLJL[7]);
    }

    public final InterfaceC384330F5b v3() {
        return (InterfaceC384330F5b) this.LLJJ.getValue(this, LLJL[8]);
    }

    @Override // X.C0EJ3
    public void GT() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || !C350870DpF.LJI(c0e48W1).hasExtra("is_apply_to_all")) {
            return;
        }
        C0E48 c0e48W12 = W1();
        boolean z = Boolean.parseBoolean(c0e48W12 != null ? C350870DpF.LJI(c0e48W12).getExtra("is_apply_to_all") : null);
        if (z != new C0EKG().LIZ()) {
            new C0EKG().LIZIZ(z);
        }
    }

    @Override // X.C0EJ3
    public ArrayList<TextStickerData> IP() {
        List<TextStickerModel> listSb = Sb();
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listSb) {
            if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                arrayList.add(textStickerModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C0F7U.LIZJ((TextStickerModel) it2.next()));
        }
        ArrayList<TextStickerData> arrayList3 = new ArrayList<>();
        C13LP.LLFII(arrayList2, arrayList3);
        if (arrayList3.size() > 1) {
            C08XD.LJJ(arrayList3, new AComparatorS24S0000000_5(39));
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return arrayList3;
    }

    @Override // X.C0EJ3
    public void J2() {
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null) {
            c0eokW2.fO2(EnumC1466150oFx.TEXT, "edit_page_entrance", AFwS234S0000000_5.get$arr$(302));
        }
    }

    public final NLEEditor LF2() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        InterfaceC1452170ntP interfaceC1452170ntPO3 = O3();
        if (!(interfaceC1452170ntPO3 instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPO3) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null) {
            return null;
        }
        return c348100DkmLIZLLL.LIZ;
    }

    @Override // X.C0EJ3
    public String LLIILZL() {
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmW2 = w2();
            if (c0epmW2 != null) {
                return c0epmW2.LLIILZL();
            }
            return null;
        }
        C0EPL c0eplG2 = G2();
        if (c0eplG2 != null) {
            return c0eplG2.LLIILZL();
        }
        return null;
    }

    @Override // X.C0EJ3
    public C364440EQo LLLZIL() {
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmW2 = w2();
            if (c0epmW2 != null) {
                return c0epmW2.LLLZIL();
            }
            return null;
        }
        C0EPL c0eplG2 = G2();
        if (c0eplG2 != null) {
            return c0eplG2.LLLZIL();
        }
        return null;
    }

    @Override // X.C0EJ3
    public List<TextStickerModel> Oo1() {
        List<TextStickerModel> listSb = Sb();
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listSb) {
            if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                arrayList.add(textStickerModel);
            }
        }
        return arrayList;
    }

    @Override // X.C0EJ3
    public List<TextStickerModel> Sb() {
        List<StickerModel> listLLLILZLLLI;
        C0EOK c0eokW2 = W2();
        if (c0eokW2 == null || (listLLLILZLLLI = c0eokW2.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // X.C0EJ3
    public String U41() {
        C0EPM c0epmW2 = w2();
        if (c0epmW2 != null) {
            return c0epmW2.iH();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C385230F8n c385230F8n = this.LLJJJJ;
        if (c385230F8n != null) {
            c385230F8n.destroy();
        }
    }

    @Override // X.C0EJ3
    public void to0() {
        C0E48 c0e48W1 = W1();
        this.LLJJIJI = c0e48W1 != null ? C351220Dpo.LJLLI(C350870DpF.LJI(c0e48W1)) : null;
    }

    @Override // X.C0EJ3
    public C364440EQo u4() {
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmW2 = w2();
            if (c0epmW2 != null) {
                return c0epmW2.u4();
            }
            return null;
        }
        C0EPL c0eplG2 = G2();
        if (c0eplG2 != null) {
            return c0eplG2.u4();
        }
        return null;
    }

    public C0EJ3 Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    private final TextStickerModel X1(int i) {
        List<C0FFC> listC1;
        C0EOK c0eokW2 = W2();
        Object obj = null;
        if (c0eokW2 == null || (listC1 = c0eokW2.c1()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listC1, 10));
        Iterator<C0FFC> it2 = listC1.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJLI());
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (C364540EQy.LIZ((TextStickerModel) next) == i) {
                obj = next;
                break;
            }
        }
        return (TextStickerModel) obj;
    }

    @Override // X.C0EJ3
    public void Gu0(TextStickerModel textStickerModel) {
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null) {
            c0eokW2.Ca(textStickerModel.getBaseStickerModel().getId(), AFwS234S0000000_5.get$arr$(304));
        }
    }

    @Override // X.C0EJ3
    public void LA0(NLETrackSlot nLETrackSlot) {
        List<C0FFC> listC1;
        boolean z;
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null && (listC1 = c0eokW2.c1()) != null) {
            for (C0FFC c0ffc : listC1) {
                if (Intrinsics.LJFF(c0ffc.LJLI().getUuid(), nLETrackSlot.getUUID())) {
                    VideoPublishEditModel editModel = getEditModel();
                    TTSModel ttsModel = c0ffc.LJLI().getTtsModel();
                    if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    u4.LJJLIIIIJ(editModel, "click_text", 1, null, Boolean.valueOf(z), null, null, null, Boolean.valueOf(C0F8Y.LJIIIIZZ(c0ffc.LJLI())), Boolean.valueOf(c0ffc.LJLI().isVERenderSticker()), 224);
                }
            }
        }
        Y61(nLETrackSlot);
    }

    @Override // X.C0EJ3
    public void LLJJL(C364440EQo c364440EQo) {
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmW2 = w2();
            if (c0epmW2 != null) {
                c0epmW2.LLJJL(c364440EQo);
                return;
            }
            return;
        }
        C0EPL c0eplG2 = G2();
        if (c0eplG2 == null) {
            return;
        }
        c0eplG2.LLJJL(c364440EQo);
    }

    @Override // X.C0EJ3
    public void LLLLZIL(String str) {
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmW2 = w2();
            if (c0epmW2 != null) {
                c0epmW2.LLLLZIL(str);
                return;
            }
            return;
        }
        C0EPL c0eplG2 = G2();
        if (c0eplG2 == null) {
            return;
        }
        c0eplG2.LLLLZIL(str);
    }

    public final boolean Q3(int i) {
        StickerModel stickerModelLLJJIJI;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EOK c0eokW2 = W2();
        String uuid = null;
        if (c0eokW2 != null) {
            stickerModelLLJJIJI = c0eokW2.LLJJIJI(i);
        } else {
            stickerModelLLJJIJI = null;
        }
        if (!(stickerModelLLJJIJI instanceof TextStickerModel)) {
            return false;
        }
        String uuid2 = ((TextStickerModel) stickerModelLLJJIJI).getUuid();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null) {
            uuid = nLETrackSlotLLLLLLIL.getUUID();
        }
        return Intrinsics.LJFF(uuid2, uuid);
    }

    @Override // X.C0EJ3
    public void Y61(NLETrackSlot nLETrackSlot) {
        List<C0FFC> listC1;
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null && (listC1 = c0eokW2.c1()) != null) {
            for (C0FFC c0ffc : listC1) {
                if (Intrinsics.LJFF(c0ffc.LJLI().getUuid(), nLETrackSlot.getUUID())) {
                    C0EOK c0eokW22 = W2();
                    if (c0eokW22 != null) {
                        c0eokW22.Ca(c0ffc.getStickerId(), AFwS234S0000000_5.get$arr$(303));
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.C0EJ3
    public TextStickerModel YC(String str) {
        TextStickerModel textStickerModel = null;
        if (a0.LJJJIL(str)) {
            return null;
        }
        Iterator<TextStickerModel> it2 = Sb().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerModel next = it2.next();
            if (Intrinsics.LJFF(next.getUuid(), str)) {
                textStickerModel = next;
                break;
            }
        }
        return textStickerModel;
    }

    @Override // X.C0EJ3
    public void bR(String str) {
        C0EPM c0epmW2 = w2();
        if (c0epmW2 != null) {
            c0epmW2.c40(str);
        }
    }

    @Override // X.C0EJ3
    public void cf0(String str) {
        C0EOK c0eokW2;
        TextStickerModel textStickerModelYC = YC(str);
        if (textStickerModelYC != null && (c0eokW2 = W2()) != null) {
            c0eokW2.gN1(textStickerModelYC.getId(), true, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0EJ3
    public void q(C364440EQo c364440EQo) {
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmW2 = w2();
            if (c0epmW2 != null) {
                c0epmW2.q(c364440EQo);
                return;
            }
            return;
        }
        C0EPL c0eplG2 = G2();
        if (c0eplG2 == null) {
            return;
        }
        c0eplG2.q(c364440EQo);
    }

    public C0EPI(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EPM.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EPL.class, null);
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 699));
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EGY.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC384330F5b.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362470EIz.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 698));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 696));
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 697));
    }

    private final void e4(C0FFC c0ffc, boolean z) {
        C0FFP c0ffpLJJIL;
        if (z && c0ffc != null && (c0ffpLJJIL = c0ffc.LJJIL()) != null) {
            c0ffpLJJIL.LIZIZ();
        }
    }

    @Override // X.C0EJ3
    public void BO0(NLETrackSlot nLETrackSlot, boolean z) {
        List<C0FFC> listC1;
        C0FFC next;
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null && (listC1 = c0eokW2.c1()) != null) {
            Iterator<C0FFC> it2 = listC1.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJLI().getUuid(), nLETrackSlot.getUUID())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FFC c0ffc = next;
            if (c0ffc != null) {
                e4(c0ffc, z);
            }
        }
    }

    @Override // X.C0EJ3
    public void ED2(TextStickerModel textStickerModel, boolean z) {
        C0EKW c0ekwE3 = E3();
        c0ekwE3.getClass();
        if (textStickerModel.isNotEmptyModel()) {
            if (z) {
                c0ekwE3.LJJLIIJ(textStickerModel, true);
            }
            C0EKW.LJJLIL(c0ekwE3, textStickerModel, null, null, EnumC356070Dxd.DONE, false, false, 52);
            return;
        }
        c0ekwE3.LJJLIIIJLLLLLLLZ(textStickerModel, null, c0ekwE3.LLJJIII);
    }

    @Override // X.C0EJ3
    public void Kx2(ArrayList<Pair<String, String>> arrayList, final boolean z) {
        Integer numValueOf;
        C0EOK c0eokW2;
        MutableLiveData<Boolean> mutableLiveDataEa1;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProTextNewComponent init size = ");
        C364440EQo c364440EQoLLLZIL = LLLZIL();
        if (c364440EQoLLLZIL != null) {
            numValueOf = Integer.valueOf(c364440EQoLLLZIL.LIZIZ().size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LIZLLL(c563650M8t, "inline-captions", C2188811AlT.LIZIZ(sbLIZ));
        C0EY2 c0ey2I3 = i3();
        if (c0ey2I3 != null && (liveDataZu2 = c0ey2I3.zu2()) != null && (value = liveDataZu2.getValue()) != null) {
            this.LLJJLIIIJLLLLLLLZ = value.LJ.getEffectMultiTrackMode();
        }
        if (!this.LLJJL && (c0eokW2 = W2()) != null && (mutableLiveDataEa1 = c0eokW2.Ea1()) != null) {
            mutableLiveDataEa1.observe(this, new Observer() { // from class: X.0EPK
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) throws JSONException {
                    if (((Boolean) obj).booleanValue()) {
                        C0EPI c0epi = this.LL;
                        if (!c0epi.LLJJL) {
                            C0EOK c0eokW22 = c0epi.W2();
                            if (c0eokW22 != null) {
                                c0eokW22.LJJZZI(this.LL.E3());
                            }
                            C0EPI c0epi2 = this.LL;
                            c0epi2.LLJJL = true;
                            if (z) {
                                c0epi2.Rc();
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // X.C0EJ3
    public void OZ0(List<TextStickerModel> list, boolean z) {
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null) {
            c0eokW2.T(list, EnumC356070Dxd.COMMIT);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TextStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            TextStickerModel textStickerModelX1 = X1(C364540EQy.LIZ(it2.next()));
            if (textStickerModelX1 != null) {
                arrayList.add(textStickerModelX1);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0EKW.LJJLIL(E3(), (TextStickerModel) it3.next(), null, null, EnumC356070Dxd.NONE, z, false, 4);
        }
    }

    @Override // X.C0EJ3
    public void RF(TextStickerModel textStickerModel, boolean z) {
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null) {
            c0eokW2.k3(textStickerModel, EnumC356070Dxd.COMMIT);
        }
        TextStickerModel textStickerModelX1 = X1(textStickerModel.getBaseStickerModel().getId());
        if (textStickerModelX1 != null) {
            C0EKW.LJJLIL(E3(), textStickerModelX1, null, null, EnumC356070Dxd.NONE, z, false, 4);
        }
    }

    @Override // X.C0EJ3
    public void xQ1(TextStickerModel textStickerModel, boolean z) {
        List<C0FFC> listC1;
        C0FFC next;
        C0EOK c0eokW2 = W2();
        if (c0eokW2 != null && (listC1 = c0eokW2.c1()) != null) {
            Iterator<C0FFC> it2 = listC1.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getStickerId() == textStickerModel.getBaseStickerModel().getId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FFC c0ffc = next;
            if (c0ffc != null) {
                e4(c0ffc, z);
            }
        }
    }

    @Override // X.C0EJ3
    public String t20(String str, TextFontModel textFontModel, TextPaint textPaint, Context context) {
        textPaint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(textFontModel.fontSize)));
        textPaint.setTypeface(C0FI2.LJJI(textFontModel.fileName));
        return C385390F9d.LIZ(str, context, textPaint);
    }
}
