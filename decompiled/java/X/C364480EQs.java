package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364480EQs extends i<InterfaceC364550EQz, C0EV3, C364500EQu, C0ER6> implements InterfaceC379610EuV, C0EVI, InterfaceC364550EQz {
    public static final C0ER3 LLJJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC364550EQz LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final C0E48 LLJJIJI;
    public List<TextStickerModel> LLJJIJIIJIL;
    public HashMap<String, Float> LLJJIJIL;
    public final C01GW LLJJJ;
    public final Function0<C364500EQu> LLJJJIL;
    public final Function0<C0ER6> LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ER3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C364480EQs.class, "headerApi", "getHeaderApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/fillerword/api/CaptionFillerWordHeaderApi;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C364480EQs.class, "contextData", "getContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/fillerword/ui/CaptionFillerWordPanelContext;", 0)};
        LLJJL = new Object() { // from class: X.0ER3
        };
        LLJL = 8;
    }

    private final void F4() {
    }

    @Override // X.C0EVI
    public void cH() {
    }

    @Override // X.C0EVI
    public void t4(boolean z) {
    }

    private final C0ER2 n5() {
        return (C0ER2) this.LLJJI.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    private final C2217061Bpw t5() {
        return (C2217061Bpw) this.LLJJJ.getValue();
    }

    @Override // X.C0EVI
    public void AD() {
        i3(AFwS234S0000000_5.get$arr$(276));
    }

    public final void R5() {
        InterfaceC361710EGb interfaceC361710EGb;
        C364510EQv c364510EQv;
        View view;
        C19A3 c19a3 = this.LLJILJILJ;
        if ((c19a3 instanceof C364510EQv) && (c364510EQv = (C364510EQv) c19a3) != null) {
            View view2 = c364510EQv.mView;
            if (view2 != null && !view2.isLaidOut() && (view = c364510EQv.mView) != null) {
                C786410Ut5.T4(view, 0.0f);
            }
            View view3 = c364510EQv.mView;
            if (view3 != null) {
                if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                    view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(c364510EQv, 4));
                } else {
                    c364510EQv.LLLLLIL();
                    C214799194j c214799194j = c364510EQv.LLJJ;
                    if (c214799194j != null) {
                        c214799194j.LLLLIL();
                    }
                }
            }
        }
        C364490EQt c364490EQtD5 = d5();
        if (c364490EQtD5 != null && (interfaceC361710EGb = (InterfaceC361710EGb) c364490EQtD5.LLJJIJIL.getValue(c364490EQtD5, C364490EQt.LLJJL[5])) != null) {
            interfaceC361710EGb.LLJJIJIIJIL(true);
        }
        C364490EQt c364490EQtD52 = d5();
        v5(c364490EQtD52 != null ? c364490EQtD52.LJIIJ() : null, false);
    }

    public final C364490EQt d5() {
        return (C364490EQt) this.LLJJIII.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    public final void d6() {
        ArrayList arrayList;
        Function2<List<TextStickerData>, Boolean, Unit> function2;
        C0EJ3 c0ej3LJIIL;
        List<TextStickerModel> list = this.LLJJIJIIJIL;
        if (list == null || list.isEmpty()) {
            C0E48 c0e48 = this.LLJJIJI;
            if (c0e48 != null) {
                c0e48.S7().LIZIZ(Unit.LIZ, "clear_caption", false);
                return;
            }
            return;
        }
        List<TextStickerModel> list2 = this.LLJJIJIIJIL;
        List<TextStickerData> listLJLLLL = null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (TextStickerModel textStickerModel : list2) {
                if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                    arrayList2.add(textStickerModel);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(C0F7U.LIZJ((TextStickerModel) it2.next()));
            }
            arrayList = new ArrayList();
            C13LP.LLFII(arrayList3, arrayList);
        } else {
            arrayList = null;
        }
        C0E48 c0e482 = this.LLJJIJI;
        if (c0e482 != null) {
            c0e482.S7().LIZIZ(arrayList, "add_recognized_caption", false);
        }
        C364490EQt c364490EQtD5 = d5();
        List<TextStickerModel> listSb = (c364490EQtD5 == null || (c0ej3LJIIL = c364490EQtD5.LJIIL()) == null) ? null : c0ej3LJIIL.Sb();
        C364490EQt c364490EQtD52 = d5();
        T4(c364490EQtD52 != null ? c364490EQtD52.LJIIJ() : null, listSb);
        if (listSb != null) {
            ArrayList arrayList4 = new ArrayList();
            for (TextStickerModel textStickerModel2 : listSb) {
                if (C0F8Y.LJIIIIZZ(textStickerModel2)) {
                    arrayList4.add(textStickerModel2);
                }
            }
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(C0F7U.LIZJ((TextStickerModel) it3.next()));
            }
            ArrayList arrayList6 = new ArrayList();
            C13LP.LLFII(arrayList5, arrayList6);
            listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(34), arrayList6);
        }
        C364490EQt c364490EQtD53 = d5();
        if (c364490EQtD53 == null || (function2 = c364490EQtD53.LLJJ) == null) {
            return;
        }
        function2.invoke(listLJLLLL, Boolean.FALSE);
    }

    private final void D5() {
        C0E48 c0e48;
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ = d5().LJIIIIZZ();
        this.LLJJJJLIIL = (videoPublishEditModelLJIIIIZZ != null ? Float.valueOf(videoPublishEditModelLJIIIIZZ.getTextLayoutHeight()) : Integer.valueOf(ScreenUtils.getScreenHeight(this.LLJILJILJ.requireSceneContext()))).intValue();
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ2 = d5().LJIIIIZZ();
        int iIntValue = (videoPublishEditModelLJIIIIZZ2 != null ? Float.valueOf(videoPublishEditModelLJIIIIZZ2.getTextLayoutWidth()) : Integer.valueOf(ScreenUtils.getScreenHeight(this.LLJILJILJ.requireSceneContext()))).intValue();
        this.LLJJJJJIL = iIntValue;
        if ((this.LLJJJJLIIL == 0 || iIntValue == 0) && (c0e48 = d5().LLILLJJLI) != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            int screenWidth = ScreenUtils.getScreenWidth(this.LLJILJILJ.requireSceneContext());
            int canvasRatio = (int) (screenWidth / nLEModelLJI.getCanvasRatio());
            this.LLJJJJJIL = screenWidth;
            this.LLJJJJLIIL = canvasRatio;
        }
    }

    private final Pair<Integer, Integer> k5() {
        int i = 0;
        int i2 = 0;
        for (Pair<Integer, TextStickerData> pair : T2().LJ) {
            pair.getFirst().intValue();
            TextStickerData second = pair.getSecond();
            if (Intrinsics.LJFF(second.getFilterTag(), C0EVA.SILENT.getValue())) {
                i2++;
            }
            Iterator<Word> it2 = second.getWords().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getTag(), C0EVA.FILLER.getValue())) {
                    i++;
                }
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u6() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364480EQs.u6():void");
    }

    @Override // X.InterfaceC364550EQz
    public void LJLJI() {
        u6();
        i3(AFwS234S0000000_5.get$arr$(275));
        E5("show");
    }

    @Override // X.InterfaceC364550EQz
    public void LJZI() {
        if (T2().LIZLLL == EnumC364790ERx.SHOW_LOADING) {
            i3(AFwS234S0000000_5.get$arr$(269));
        } else {
            R5();
            d6();
        }
        E5("close");
    }

    public final void S5() {
        String str = d5().LLJILJIL.LIZJ;
        C0E48 c0e48 = d5().LLILLJJLI;
        NLEModel nLEModelLJI = c0e48 != null ? C350870DpF.LJI(c0e48) : null;
        C2217061Bpw c2217061BpwT5 = t5();
        if (c2217061BpwT5 != null) {
            c2217061BpwT5.LJIIL(str, nLEModelLJI, Boolean.FALSE, C294870Bh7.LIZ(d5().LJIIIIZZ()), C1416310mxZ.LJIILJJIL(d5().LJIIIIZZ()), C289240BVi.LIZ(d5().LJIIIIZZ()) ? "big_caption" : null);
        }
        i3(AFwS234S0000000_5.get$arr$(274));
    }

    @Override // X.InterfaceC364550EQz
    public List<C0EVA> ja1() {
        return T2().LIZJ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        D5();
        hj1(d5().LLJILJILJ);
    }

    public InterfaceC364550EQz Z4() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C364500EQu> o2() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0ER6> w2() {
        return this.LLJJJJ;
    }

    private final void H4(C0E1X c0e1x) {
        NLEEditor nLEEditorLJI;
        if (C0E2B.LIZ()) {
            F4();
            C0E1X c0e1x2 = new C0E1X(C0E1V.EDIT_CAPTION.getNameId(), null, null, null, null, 30);
            if (c0e1x == null) {
                c0e1x = c0e1x2;
            }
            C0E48 c0e48 = this.LLJJIJI;
            if (c0e48 != null) {
                nLEEditorLJI = c0e48.LLFII().LJI();
            } else {
                nLEEditorLJI = null;
            }
            C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
        }
    }

    public final void E5(String str) {
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ;
        String str2;
        String str3;
        C364490EQt c364490EQtD5 = d5();
        if (c364490EQtD5 != null && (videoPublishEditModelLJIIIIZZ = c364490EQtD5.LJIIIIZZ()) != null) {
            Pair<Integer, Integer> pairK5 = k5();
            int iIntValue = pairK5.getFirst().intValue();
            int iIntValue2 = pairK5.getSecond().intValue();
            boolean zContains = T2().LIZJ.contains(C0EVA.FILLER);
            boolean zContains2 = T2().LIZJ.contains(C0EVA.SILENT);
            InlineCaptionModel inlineCaptionModel = videoPublishEditModelLJIIIIZZ.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel == null || (str2 = inlineCaptionModel.selectLanguageCode) == null) {
                str2 = "";
            }
            C0LAB c0labLJJ = u4.LJJ(1, videoPublishEditModelLJIIIIZZ, str2);
            c0labLJJ.LJ("action", str);
            c0labLJJ.LIZ(iIntValue, "filler_words_cnt");
            c0labLJJ.LIZ(iIntValue2, "pause_cnt");
            String str4 = "on";
            if (zContains) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            c0labLJJ.LJ("detect_filler_words_status", str3);
            if (!zContains2) {
                str4 = "off";
            }
            c0labLJJ.LJ("detect_pauses_status", str4);
            C20684815ws.LJIILLIIL("filler_words_panel_actions", c0labLJJ.LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0474, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0292, code lost:
    
        r14 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x029a, code lost:
    
        if (r14.hasNext() == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x029c, code lost:
    
        r10 = r14.next();
        r5 = (com.ss.android.ugc.aweme.sticker.data.Word) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b5, code lost:
    
        if (((int) (r5.getStartTime() + X.C364540EQy.LIZIZ(r6))) < r7.getEndTime()) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c1, code lost:
    
        if (r5.getEndTime() <= r5.getStartTime()) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c3, code lost:
    
        if (r10 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c5, code lost:
    
        r11 = X.C13LP.LJJJLZIJ(r3.indexOf(r10) - 1, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H5(java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData> r95) {
        /*
            Method dump skipped, instruction units count: 2183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364480EQs.H5(java.util.List):void");
    }

    public final void N5(EnumC364790ERx enumC364790ERx) {
        n5().OB2(enumC364790ERx);
    }

    @Override // X.InterfaceC364550EQz
    public void hj1(List<TextStickerData> list) {
        NLEModel nLEModelLJI;
        List<TextStickerModel> listSb;
        String filterTag;
        C2217061Bpw c2217061BpwT5 = t5();
        if (c2217061BpwT5 != null) {
            c2217061BpwT5.LJIIJ = this;
        }
        String str = d5().LLJILJIL.LIZJ;
        C0E48 c0e48 = d5().LLILLJJLI;
        String str2 = null;
        if (c0e48 != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48);
        } else {
            nLEModelLJI = null;
        }
        C0EJ3 c0ej3LJIIL = d5().LJIIL();
        if (c0ej3LJIIL != null) {
            listSb = c0ej3LJIIL.Sb();
        } else {
            listSb = null;
        }
        this.LLJJIJIIJIL = listSb;
        if (list != null) {
            TextStickerData textStickerData = (TextStickerData) C13LP.LJJJLL(list);
            if (textStickerData != null) {
                filterTag = textStickerData.getFilterTag();
            } else {
                filterTag = null;
            }
            if (C123100dR.LIZ(filterTag)) {
                Context sceneContext = this.LLJILJILJ.getSceneContext();
                if (sceneContext == null) {
                    return;
                }
                m6(C363740ENw.LJIIIZ(sceneContext, list), C13BV.INSTANCE, EnumC364790ERx.SHOW_LOADING_WITHOUT_PROCESS);
                return;
            }
        }
        i3(AFwS234S0000000_5.get$arr$(268));
        C2217061Bpw c2217061BpwT52 = t5();
        if (c2217061BpwT52 != null) {
            c2217061BpwT52.LJIJJ();
        }
        C2217061Bpw c2217061BpwT53 = t5();
        if (c2217061BpwT53 != null) {
            boolean zLIZ = C294870Bh7.LIZ(d5().LJIIIIZZ());
            boolean zLJIILJJIL = C1416310mxZ.LJIILJJIL(d5().LJIIIIZZ());
            if (C289240BVi.LIZ(d5().LJIIIIZZ())) {
                str2 = "big_caption";
            }
            c2217061BpwT53.LJIIL(str, nLEModelLJI, Boolean.FALSE, zLIZ, zLJIILJJIL, str2);
        }
    }

    public C364480EQs(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = this;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C0ER2.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C364490EQt.class, null);
        this.LLJJIJI = d5().LLILLJJLI;
        this.LLJJIJIL = new HashMap<>();
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 605));
        this.LLJJJIL = new AwS549S0100000_5(this, 604);
        this.LLJJJJ = new AwS549S0100000_5(this, 606);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T4(com.bytedance.ies.nle.editor_jni.NLEModel r15, java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r16) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364480EQs.T4(com.bytedance.ies.nle.editor_jni.NLEModel, java.util.List):void");
    }

    private final TextStickerData U5(List<TextStickerModel> list, TextStickerData textStickerData) {
        Iterator<TextStickerModel> it2 = list.iterator();
        TextStyleModel textStyleModelLIZ = null;
        TextStickerModel next = null;
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                float fLIZIZ = C364540EQy.LIZIZ(next);
                float endTime = next.getBaseStickerModel().getEndTime();
                float startTime = textStickerData.getStartTime();
                if ((fLIZIZ <= startTime && startTime <= endTime) || textStickerData.getStartTime() < fLIZIZ) {
                    break;
                }
            } else if (next == null) {
                return textStickerData;
            }
        }
        TextStickerModel textStickerModelLJ = C0F7U.LJ(textStickerData, new Pair(Integer.valueOf(next.getBaseStickerModel().getContainerWidth() / 2), Integer.valueOf(next.getBaseStickerModel().getContainerHeight() / 2)), 1);
        TextStyleModel textStyle = next.getTextStyle();
        if (textStyle != null) {
            textStyleModelLIZ = TextStyleModel.LIZ(textStyle, null, null, null, null, false, null, 2047);
        }
        TextFontModel textFontModelLIZ = TextFontModel.LIZ(next.getFontModel(), null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
        return C0F7U.LIZJ(TextStickerModel.copy$default(TextStickerModel.copy$default(textStickerModelLJ, BaseStickerModel.copy$default(next.getBaseStickerModel(), textStickerModelLJ.getBaseStickerModel().getId(), 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, textStickerModelLJ.getBaseStickerModel().getStartTime(), textStickerModelLJ.getBaseStickerModel().getEndTime(), false, textStickerModelLJ.getBaseStickerModel().getStartTime(), textStickerModelLJ.getBaseStickerModel().getEndTime(), textStickerModelLJ.getBaseStickerModel().getVisible(), 0.0f, null, null, null, false, -1979711490, 15, null), null, null, null, null, next.getMode(), next.getColor(), next.getAlign(), 0.0f, textFontModelLIZ, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, TextMotionModel.LIZ(next.getTextMotionModel(), null, 0.0f, 0, null, null, 0, false, 1023), null, false, null, null, false, false, CaptionTemplateModel.LIZ(next.getCaptionTemplateModel(), false, null, null, false, false, false, 63), textStyleModelLIZ, null, null, null, null, false, false, null, false, false, false, null, -268436194, 65511, null), BaseStickerModel.copy$default(textStickerModelLJ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, next.getBaseStickerModel().getTranslateX(), next.getBaseStickerModel().getTranslateY(), next.getBaseStickerModel().getScale(), next.getBaseStickerModel().getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457281, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
    }

    private final void v5(NLEModel nLEModel, boolean z) {
        VecNLETrackSPtr tracks;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        Float f;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLILLL(nLETrack)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                    if (!C363740ENw.LJFF(nLETrackSlot)) {
                        if (z) {
                            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                            if (nLESegmentAudioDynamicCast2 != null) {
                                this.LLJJIJIL.put(nLETrackSlot.getUUID(), Float.valueOf(nLESegmentAudioDynamicCast2.getVolume()));
                                nLESegmentAudioDynamicCast2.setVolume(0.0f);
                            }
                        } else {
                            nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                            if (nLESegmentAudioDynamicCast == null && (f = this.LLJJIJIL.get(nLETrackSlot.getUUID())) != null) {
                                nLESegmentAudioDynamicCast.setVolume(f.floatValue());
                            }
                        }
                    } else if (!z) {
                        nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast == null) {
                        }
                    }
                }
            }
        }
        C0E48 c0e48 = d5().LLILLJJLI;
        if (c0e48 != null) {
            C350870DpF.LIZ(c0e48, false);
        }
    }

    @Override // X.InterfaceC364550EQz
    public void G30(C0EVA c0eva, boolean z) {
        ArrayList arrayList = new ArrayList(T2().LIZJ);
        if (z) {
            arrayList.add(c0eva);
        } else {
            arrayList.remove(c0eva);
        }
        i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 531));
        E5("change_mode");
    }

    private final Pair<TextStickerModel, TextStickerModel> O4(List<TextStickerModel> list, String str, Pair<Integer, Integer> pair) {
        TextStickerModel next;
        C364490EQt c364490EQtD5;
        C0EJ3 c0ej3LJIIL;
        if (list != null) {
            Iterator<TextStickerModel> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    TextStickerModel textStickerModel = next;
                    if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                        int startTime = (int) textStickerModel.getBaseStickerModel().getStartTime();
                        int endTime = (int) textStickerModel.getBaseStickerModel().getEndTime();
                        int iIntValue = pair.getFirst().intValue();
                        if (startTime <= iIntValue && iIntValue <= endTime) {
                            int startTime2 = (int) textStickerModel.getBaseStickerModel().getStartTime();
                            int endTime2 = (int) textStickerModel.getBaseStickerModel().getEndTime();
                            int iIntValue2 = pair.getSecond().intValue();
                            if (startTime2 <= iIntValue2 && iIntValue2 <= endTime2) {
                                break;
                            }
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TextStickerModel textStickerModel2 = next;
            if (textStickerModel2 != null && (c364490EQtD5 = d5()) != null && (c0ej3LJIIL = c364490EQtD5.LJIIL()) != null) {
                String uuid = textStickerModel2.getUuid();
                if (uuid == null) {
                    uuid = "";
                }
                TextStickerModel textStickerModelYC = c0ej3LJIIL.YC(uuid);
                if (textStickerModelYC != null && textStickerModelYC.getCaptionModel() != null && a0.LJJIIZI(textStickerModelYC.getTextStr(), str, false)) {
                    return new Pair<>(textStickerModel2, textStickerModelYC);
                }
            }
            return null;
        }
        return null;
    }

    private final void m6(List<TextStickerData> list, List<? extends C0EVA> list2, EnumC364790ERx enumC364790ERx) {
        boolean z = false;
        for (TextStickerData textStickerData : list) {
            if (C363740ENw.LIZLLL(textStickerData.getFilterTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                textStickerData.setFilterSelected(true);
                z = true;
            }
            List<Word> words = textStickerData.getWords();
            if (!(words instanceof Collection) || !words.isEmpty()) {
                Iterator<Word> it2 = words.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (C363740ENw.LIZLLL(it2.next().getTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                        textStickerData.setFilterSelected(true);
                        z = true;
                        break;
                    }
                }
            }
        }
        if ((!list.isEmpty()) && !z) {
            Context sceneContext = this.LLJILJILJ.getSceneContext();
            if (sceneContext == null) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(sceneContext.getString(2131833331));
            C1390380mHk.LIZJ(sceneContext, 3027, creativeToastBuilder);
            R5();
            return;
        }
        i3(new AwS214S0300000_5((List) list, (List<TextStickerData>) list2, (List<? extends C0EVA>) enumC364790ERx, (EnumC364790ERx) 10));
        v5(d5().LJIIJ(), true);
    }

    public final void M5(List<Integer> list, List<? extends C0EVA> list2, boolean z, boolean z2) {
        C0EOK c0eokLJIIIZ;
        C0EOK c0eokLJIIIZ2;
        C0EOK c0eokLJIIIZ3;
        C0EOK c0eokLJIIIZ4;
        C0EJ3 c0ej3LJIIL = d5().LJIIL();
        if (c0ej3LJIIL == null) {
            return;
        }
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            TextStickerData textStickerData = (TextStickerData) C13LP.LJJJLZIJ(it2.next().intValue(), T2().LIZIZ);
            if (textStickerData != null) {
                String placeholderSlotId = textStickerData.getPlaceholderSlotId();
                if (placeholderSlotId == null) {
                    placeholderSlotId = "";
                }
                TextStickerModel textStickerModelYC = c0ej3LJIIL.YC(placeholderSlotId);
                if (textStickerModelYC == null) {
                    return;
                }
                if (z) {
                    Word word = (Word) C13LP.LJJJLL(textStickerData.getWords());
                    ArrayList arrayList = new ArrayList(textStickerModelYC.getWords());
                    C364520EQw.LIZ(arrayList, new AwS584S0100000_5(word, 530));
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, AFwS234S0000000_5.get$arr$(273), 30);
                    if (a0.LJJJIL(strLJJLIIIJ) && textStickerModelYC.isVERenderSticker()) {
                        C364490EQt c364490EQtD5 = d5();
                        if (c364490EQtD5 != null && (c0eokLJIIIZ2 = c364490EQtD5.LJIIIZ()) != null) {
                            c0eokLJIIIZ2.k3(TextStickerModel.copy$default(textStickerModelYC, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -16385, 65535, null), EnumC356070Dxd.COMMIT);
                        }
                    } else {
                        String strT20 = c0ej3LJIIL.t20(strLJJLIIIJ, textStickerModelYC.getFontModel(), d5().LLJJJJLIIL, this.LLJILJILJ.getSceneContext());
                        C364490EQt c364490EQtD52 = d5();
                        if (c364490EQtD52 != null && (c0eokLJIIIZ = c364490EQtD52.LJIIIZ()) != null) {
                            c0eokLJIIIZ.k3(TextStickerModel.copy$default(textStickerModelYC, null, null, null, strLJJLIIIJ, strT20, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -25, 65535, null), EnumC356070Dxd.COMMIT);
                        }
                    }
                } else if (!textStickerModelYC.getEnable()) {
                    C364490EQt c364490EQtD53 = d5();
                    if (c364490EQtD53 != null && (c0eokLJIIIZ3 = c364490EQtD53.LJIIIZ()) != null) {
                        c0eokLJIIIZ3.k3(TextStickerModel.copy$default(textStickerModelYC, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, true, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -16385, 65535, null), EnumC356070Dxd.COMMIT);
                    }
                } else {
                    String textStr = textStickerData.getTextStr();
                    if (textStr == null) {
                        textStr = "";
                    }
                    String strT202 = c0ej3LJIIL.t20(textStr, textStickerModelYC.getFontModel(), d5().LLJJJJLIIL, this.LLJILJILJ.getSceneContext());
                    C364490EQt c364490EQtD54 = d5();
                    if (c364490EQtD54 != null && (c0eokLJIIIZ4 = c364490EQtD54.LJIIIZ()) != null) {
                        String textStr2 = textStickerData.getTextStr();
                        if (textStr2 == null) {
                            textStr2 = "";
                        }
                        if (strT202 == null) {
                            strT202 = "";
                        }
                        c0eokLJIIIZ4.k3(TextStickerModel.copy$default(textStickerModelYC, null, null, null, textStr2, strT202, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -25, 65535, null), EnumC356070Dxd.COMMIT);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    @Override // X.C0EVI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bO(java.util.List<com.ss.android.ugc.aweme.sticker.data.Utterance> r10, java.lang.String r11, java.lang.Boolean r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364480EQs.bO(java.util.List, java.lang.String, java.lang.Boolean, java.lang.String):void");
    }

    private final boolean x5(final NLETrack nLETrack, final NLETrackSlot nLETrackSlot, long j, long j2, final long j3, final boolean z, final List<NLETrackSlot> list) {
        if (this.LLJJIJI == null) {
            return false;
        }
        if (j <= nLETrackSlot.getStartTime() && j2 >= nLETrackSlot.getEndTime()) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("case 4: fillerStartMicros: ");
            sbLIZ.append(j);
            sbLIZ.append(", fillerEndMicros: ");
            sbLIZ.append(j2);
            sbLIZ.append(", duration: ");
            sbLIZ.append(j3);
            sbLIZ.append(",slot start time ");
            sbLIZ.append(nLETrackSlot.getStartTime());
            sbLIZ.append(", slot end time ");
            sbLIZ.append(nLETrackSlot.getEndTime());
            sbLIZ.append(", slot duration: ");
            sbLIZ.append(nLETrackSlot.getDuration());
            C201955140j.LIZLLL(c563650M8t, "elfredfiller", C2188811AlT.LIZIZ(sbLIZ));
            if (C351220Dpo.LLLLJ(nLETrack)) {
                this.LLJJIJI.LLFII().LLIIII(nLETrackSlot, EnumC356070Dxd.COMMIT, true);
                return true;
            }
            nLETrack.removeSlot(nLETrackSlot);
            return true;
        }
        if (j >= nLETrackSlot.getStartTime() && j2 < nLETrackSlot.getEndTime()) {
            C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("case 1: fillerStartMicros: ");
            sbLIZ2.append(j);
            sbLIZ2.append(", fillerEndMicros: ");
            sbLIZ2.append(j2);
            sbLIZ2.append(", duration: ");
            sbLIZ2.append(j3);
            sbLIZ2.append(",slot start time ");
            sbLIZ2.append(nLETrackSlot.getStartTime());
            sbLIZ2.append(", slot end time ");
            sbLIZ2.append(nLETrackSlot.getEndTime());
            sbLIZ2.append(", slot duration: ");
            sbLIZ2.append(nLETrackSlot.getDuration());
            C201955140j.LIZLLL(c563650M8t2, "elfredfiller", C2188811AlT.LIZIZ(sbLIZ2));
            int i = C349360Dmo.LIZJ;
            C350670Dov.LIZJ(this.LLJJIJI, EnumC356070Dxd.NONE, new InterfaceC349350Dmn() { // from class: X.0Dq0
                @Override // X.InterfaceC349350Dmn
                public final void LIZ(NLETrackSlot nLETrackSlot2, NLETrackSlot nLETrackSlot3) {
                    List<NLETrackSlot> list2;
                    if (z) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast == null) {
                            return;
                        }
                        InterfaceC351350Dq1 interfaceC351350Dq1LLFII = this.LLJJIJI.LLFII();
                        long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                        interfaceC351350Dq1LLFII.LLFZ(nLETrackSlot2, timeClipStart / j4, (nLETrackSlot2.getDuration() - j3) / j4, 1, EnumC356070Dxd.NONE);
                        C563650M8t c563650M8t3 = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("new slot start time ");
                        sbLIZ3.append(Long.valueOf(nLETrackSlot2.getStartTime()));
                        sbLIZ3.append(", slot end time ");
                        sbLIZ3.append(Long.valueOf(nLETrackSlot2.getEndTime()));
                        sbLIZ3.append(", slot duration: ");
                        sbLIZ3.append(Long.valueOf(nLETrackSlot2.getDuration()));
                        C201955140j.LIZLLL(c563650M8t3, "elfredfiller", C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        this.LLJJIJI.LLFII().LLJ(nLETrackSlot2, 0L, nLETrackSlot2.getDuration() - j3, EnumC356070Dxd.NONE);
                        if (nLETrackSlot3.getEndTime() - nLETrackSlot3.getStartTime() >= 100000 && (list2 = list) != null) {
                            list2.add(nLETrackSlot3);
                        }
                    }
                    nLETrackSlot2.setExtra("is_editorpro_filler_word", "true");
                    nLETrackSlot3.setExtra("is_editorpro_filler_word", "true");
                    if (nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime() <= 100000) {
                        if (C351220Dpo.LLLLJ(nLETrack)) {
                            this.LLJJIJI.LLFII().LLIIII(nLETrackSlot2, EnumC356070Dxd.COMMIT, true);
                        } else {
                            nLETrack.removeSlot(nLETrackSlot2);
                        }
                    }
                    if (nLETrackSlot3.getEndTime() - nLETrackSlot3.getStartTime() <= 100000) {
                        if (C351220Dpo.LLLLJ(nLETrack)) {
                            this.LLJJIJI.LLFII().LLIIII(nLETrackSlot3, EnumC356070Dxd.COMMIT, true);
                        } else {
                            nLETrack.removeSlot(nLETrackSlot3);
                        }
                    }
                }
            }, nLETrackSlot, Long.valueOf(j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), false);
            return true;
        }
        if (j2 >= nLETrackSlot.getStartTime() && j2 <= nLETrackSlot.getEndTime() && j < nLETrackSlot.getStartTime()) {
            C563650M8t c563650M8t3 = C563650M8t.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("case 2: fillerStartMicros: ");
            sbLIZ3.append(j);
            sbLIZ3.append(", fillerEndMicros: ");
            sbLIZ3.append(j2);
            sbLIZ3.append(", duration: ");
            sbLIZ3.append(j3);
            sbLIZ3.append(",slot start time ");
            sbLIZ3.append(nLETrackSlot.getStartTime());
            sbLIZ3.append(", slot end time ");
            sbLIZ3.append(nLETrackSlot.getEndTime());
            sbLIZ3.append(", slot duration: ");
            sbLIZ3.append(nLETrackSlot.getDuration());
            C201955140j.LIZLLL(c563650M8t3, "elfredfiller", C2188811AlT.LIZIZ(sbLIZ3));
            if (z) {
                InterfaceC351350Dq1 interfaceC351350Dq1LLFII = this.LLJJIJI.LLFII();
                long startTime = j2 - nLETrackSlot.getStartTime();
                long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                interfaceC351350Dq1LLFII.LLFZ(nLETrackSlot, startTime / j4, (nLETrackSlot.getDuration() - (j2 - nLETrackSlot.getStartTime())) / j4, 0, EnumC356070Dxd.NONE);
            } else {
                this.LLJJIJI.LLFII().LLJ(nLETrackSlot, j2 - nLETrackSlot.getStartTime(), nLETrackSlot.getDuration() - (j2 - nLETrackSlot.getStartTime()), EnumC356070Dxd.NONE);
            }
            nLETrackSlot.setExtra("is_editorpro_filler_word", "true");
            if (nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime() <= 100000) {
                if (C351220Dpo.LLLLJ(nLETrack)) {
                    this.LLJJIJI.LLFII().LLIIII(nLETrackSlot, EnumC356070Dxd.COMMIT, true);
                    return false;
                }
                nLETrack.removeSlot(nLETrackSlot);
                return false;
            }
            return false;
        }
        if (j >= nLETrackSlot.getStartTime() && j <= nLETrackSlot.getEndTime() && j2 >= nLETrackSlot.getEndTime()) {
            C563650M8t c563650M8t4 = C563650M8t.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("case 3: fillerStartMicros: ");
            sbLIZ4.append(j);
            sbLIZ4.append(", fillerEndMicros: ");
            sbLIZ4.append(j2);
            sbLIZ4.append(", duration: ");
            sbLIZ4.append(j3);
            sbLIZ4.append(",slot start time ");
            sbLIZ4.append(nLETrackSlot.getStartTime());
            sbLIZ4.append(", slot end time ");
            sbLIZ4.append(nLETrackSlot.getEndTime());
            sbLIZ4.append(", slot duration: ");
            sbLIZ4.append(nLETrackSlot.getDuration());
            C201955140j.LIZLLL(c563650M8t4, "elfredfiller", C2188811AlT.LIZIZ(sbLIZ4));
            if (z) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentVideoDynamicCast == null) {
                    return false;
                }
                InterfaceC351350Dq1 interfaceC351350Dq1LLFII2 = this.LLJJIJI.LLFII();
                long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
                interfaceC351350Dq1LLFII2.LLFZ(nLETrackSlot, timeClipStart / j5, (nLETrackSlot.getDuration() - (nLETrackSlot.getEndTime() - j)) / j5, 1, EnumC356070Dxd.NONE);
            } else {
                this.LLJJIJI.LLFII().LLJ(nLETrackSlot, 0L, nLETrackSlot.getDuration() - (nLETrackSlot.getEndTime() - j), EnumC356070Dxd.NONE);
            }
            nLETrackSlot.setExtra("is_editorpro_filler_word", "true");
            if (nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime() <= 100000) {
                if (C351220Dpo.LLLLJ(nLETrack)) {
                    this.LLJJIJI.LLFII().LLIIII(nLETrackSlot, EnumC356070Dxd.COMMIT, true);
                    return false;
                }
                nLETrack.removeSlot(nLETrackSlot);
                return false;
            }
            return false;
        }
        return false;
    }
}
