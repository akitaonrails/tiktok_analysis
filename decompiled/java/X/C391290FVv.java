package X;

import Y.AObserverS209S0100000_5;
import android.graphics.RectF;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391290FVv extends AbstractC2255721DQs<C0EZ1> implements C0EZ1, InterfaceC379610EuV {
    public static final C0FW0 LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LL;
    public final C391300FVw LLJILJIL;
    public final C560530Lyd<Unit> LLILLJJLI = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 185));
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444410ngt.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391330FVz.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EZ2.class, null);
    public final C364350EQf LLJILJILJ = new C0FUI() { // from class: X.0EQf
        @Override // X.C0FUI
        public final boolean LIZ(int i, boolean z) {
            return false;
        }

        @Override // X.C0FUI
        public final boolean LIZIZ(int i) {
            return false;
        }

        @Override // X.C0FUI
        public final Integer LIZJ() {
            return Integer.valueOf(C364360EQg.LIZ);
        }

        @Override // X.C0FUI
        public final Integer LIZLLL() {
            return Integer.valueOf(C364360EQg.LIZ());
        }

        @Override // X.C0FUI
        public final void LJ(BaseStickerModel baseStickerModel) {
            int id = baseStickerModel.getId();
            C391290FVv c391290FVv = this.LIZ;
            List<LyricStickerModel> listI4 = c391290FVv.i4();
            ArrayList<LyricStickerModel> arrayList = new ArrayList();
            for (LyricStickerModel lyricStickerModel : listI4) {
                if (lyricStickerModel.getBaseStickerModel().getId() != id) {
                    arrayList.add(lyricStickerModel);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (LyricStickerModel lyricStickerModel2 : arrayList) {
                arrayList2.add(lyricStickerModel2.copy(BaseStickerModel.copy$default(lyricStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY(), baseStickerModel.getScale(), baseStickerModel.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457281, 15, null), lyricStickerModel2.uuid, lyricStickerModel2.clipStart, lyricStickerModel2.clipEnd, lyricStickerModel2.musicId, lyricStickerModel2.lyricId, lyricStickerModel2.musicName, lyricStickerModel2.lyricStyleUrs, lyricStickerModel2.selectedFrom, lyricStickerModel2.lyricStyleEffectId, lyricStickerModel2.recommendWidth, lyricStickerModel2.recommendHeight, lyricStickerModel2.initialTrimInfo, lyricStickerModel2.textStickerModels, lyricStickerModel2.fallbackFonts, lyricStickerModel2.enabled));
            }
            c391290FVv.f(arrayList2, EnumC356070Dxd.COMMIT);
        }
    };

    public C0EZ1 W1() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0FW0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C391290FVv.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C391290FVv.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C391290FVv.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C391290FVv.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0), new C2217381BqS(C391290FVv.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C391290FVv.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C391290FVv.class, "lyricStickerEffectPanelApi", "getLyricStickerEffectPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/EditLyricStickerEffectWrapperApi;", 0), new C2217381BqS(C391290FVv.class, "lyricsRightsChecker", "getLyricsRightsChecker()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/copyright/LyricsRightsCheckerApi;", 0)};
        LLJILLL = new Object() { // from class: X.0FW0
        };
    }

    private final C0EZ2 H2() {
        return (C0EZ2) this.LLJIJIL.getValue(this, LLJJ[7]);
    }

    private final InterfaceC1452170ntP W2() {
        return (InterfaceC1452170ntP) this.LLILZLL.getValue();
    }

    public final InterfaceC391330FVz G2() {
        return (InterfaceC391330FVz) this.LLJI.getValue(this, LLJJ[6]);
    }

    public final InterfaceC1444410ngt T2() {
        return (InterfaceC1444410ngt) this.LLIZ.getValue(this, LLJJ[3]);
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLJJ[2]);
    }

    public final InterfaceC1455610nyx Z1() {
        return (InterfaceC1455610nyx) this.LLIZLLLIL.getValue(this, LLJJ[4]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLJJ[5]);
    }

    public final InterfaceC377540ErA o2() {
        return (InterfaceC377540ErA) this.LLILZ.getValue(this, LLJJ[1]);
    }

    public final InterfaceC391240FVq w2() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLJJ[0]);
    }

    private final void Dj() {
        InterfaceC391240FVq interfaceC391240FVqW2 = w2();
        if (interfaceC391240FVqW2 != null) {
            interfaceC391240FVqW2.JF2(null, EnumC1466150oFx.LYRIC_STICKER);
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public boolean D1() {
        return C1466090oFr.LJIIIIZZ(i4(), true);
    }

    public final NLEEditor LF2() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        InterfaceC1452170ntP interfaceC1452170ntPW2 = W2();
        if (!(interfaceC1452170ntPW2 instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPW2) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null) {
            return null;
        }
        return c348100DkmLIZLLL.LIZ;
    }

    @Override // X.C0EZ1
    public C0EZ2 Og1() {
        return H2();
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void e1() {
        if (C1466090oFr.LJIIIIZZ(i4(), true)) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(C1664590tQ1.LJII(this));
        c1389890mGx.LJIIIZ(2131836935);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public List<LyricStickerModel> i4() {
        List<StickerModel> listS32;
        InterfaceC391240FVq interfaceC391240FVqW2 = w2();
        if (interfaceC391240FVqW2 == null || (listS32 = interfaceC391240FVqW2.s32()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerModel stickerModel : listS32) {
            if (stickerModel instanceof LyricStickerModel) {
                arrayList.add(stickerModel);
            }
        }
        return arrayList;
    }

    @Override // X.C0EZ1
    public void k9() {
        InterfaceC391330FVz interfaceC391330FVzG2 = G2();
        if (interfaceC391330FVzG2 != null) {
            interfaceC391330FVzG2.hide();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1455860nzM interfaceC1455860nzMX1;
        LiveData<Void> liveDataWw2;
        super.onCreate();
        if (C1430550nKX.LIZ(getEditModel()) && (interfaceC1455860nzMX1 = X1()) != null && (liveDataWw2 = interfaceC1455860nzMX1.ww2()) != null) {
            liveDataWw2.observe(this, new AObserverS209S0100000_5(this, 25));
        }
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS584S0100000_5(this, 192));
        }
    }

    @Override // X.C0EZ1
    public void pP2() {
        if (C1466090oFr.LJIIIIZZ(i4(), false)) {
            C0E12 c0e12 = C391320FVy.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has_show_lyric_preview_guide_");
            sbLIZ.append(C391320FVy.LIZ());
            if (c0e12.LIZ(C2188811AlT.LIZIZ(sbLIZ), false)) {
                return;
            }
            RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            float scale = 1.0f;
            for (LyricStickerModel lyricStickerModel : i4()) {
                RectF visibleRectWithoutRotation = lyricStickerModel.getBaseStickerModel().getVisibleRectWithoutRotation();
                if (lyricStickerModel.getBaseStickerModel().getScale() != 1.0f) {
                    scale = lyricStickerModel.getBaseStickerModel().getScale();
                }
                if (visibleRectWithoutRotation.width() > rectF.width()) {
                    rectF.left = visibleRectWithoutRotation.left;
                    rectF.right = visibleRectWithoutRotation.right;
                }
                if (visibleRectWithoutRotation.height() > rectF.height()) {
                    rectF.top = visibleRectWithoutRotation.top;
                    rectF.bottom = visibleRectWithoutRotation.bottom;
                }
            }
            rectF.left = Math.max(rectF.left, C418440Gaw.LIZIZ(10));
            float fLIZLLL = C418440Gaw.LIZLLL(C1664590tQ1.LJII(this)) - C418440Gaw.LIZIZ(10);
            if (fLIZLLL > 0.0f) {
                rectF.right = Math.min(rectF.right, fLIZLLL);
            }
            InterfaceC391240FVq interfaceC391240FVqW2 = w2();
            if (interfaceC391240FVqW2 != null) {
                interfaceC391240FVqW2.pm(new C390500FSu(3000L, 0.0f, C1664590tQ1.LJII(this).getString(2131836924), rectF, scale, EnumC1466150oFx.LYRIC_STICKER));
            }
            C0E12 c0e122 = C391320FVy.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("has_show_lyric_preview_guide_");
            sbLIZ2.append(C391320FVy.LIZ());
            c0e122.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), true);
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public LiveEvent<Unit> A4() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0EZ1
    public C0FUI w() {
        return this.LLJILJILJ;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0FVw] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0EQf] */
    public C391290FVv(C1DRG c1drg) {
        this.LL = c1drg;
        final Class<LyricStickerModel> cls = LyricStickerModel.class;
        this.LLJILJIL = new AbstractC19622511pv<LyricStickerModel>(cls) { // from class: X.0FVw
            public final EnumC1466150oFx LLILLJJLI = EnumC1466150oFx.LYRIC_STICKER;

            @Override // X.AbstractC19622511pv
            public final EnumC1466150oFx LJJIJLIJ() {
                return this.LLILLJJLI;
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJI(StickerModel stickerModel) {
                InterfaceC391240FVq interfaceC391240FVqW2 = this.LLILLL.w2();
                if (interfaceC391240FVqW2 != null) {
                    interfaceC391240FVqW2.ck();
                }
                InterfaceC391330FVz interfaceC391330FVzG2 = this.LLILLL.G2();
                if (interfaceC391330FVzG2 != null) {
                    interfaceC391330FVzG2.GZ0(EnumC366550EYr.CLICK_STICKER);
                }
                C0EZ7.LIZIZ(this.LLILLL.getEditModel(), "click_on_video_edit_page", false);
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJIL(StickerModel stickerModel) {
                InterfaceC391240FVq interfaceC391240FVqW2 = this.LLILLL.w2();
                if (interfaceC391240FVqW2 != null) {
                    interfaceC391240FVqW2.ck();
                }
                InterfaceC391330FVz interfaceC391330FVzG2 = this.LLILLL.G2();
                if (interfaceC391330FVzG2 != null) {
                    interfaceC391330FVzG2.GZ0(EnumC366550EYr.CLICK_STICKER);
                }
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJI(StickerModel stickerModel) {
                InterfaceC391240FVq interfaceC391240FVqW2 = this.LLILLL.w2();
                if (interfaceC391240FVqW2 != null) {
                    interfaceC391240FVqW2.ck();
                }
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJLL(StickerModel stickerModel) {
                InterfaceC391240FVq interfaceC391240FVqW2 = this.LLILLL.w2();
                if (interfaceC391240FVqW2 != null) {
                    interfaceC391240FVqW2.ck();
                }
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJLIIL(StickerModel stickerModel) {
                InterfaceC391240FVq interfaceC391240FVqW2 = this.LLILLL.w2();
                if (interfaceC391240FVqW2 != null) {
                    interfaceC391240FVqW2.ck();
                }
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJJL(StickerModel stickerModel, String str) {
                if (Intrinsics.LJFF(str, "SLIDE_UP")) {
                    this.LLILLL.r(EnumC356070Dxd.COMMIT);
                    this.LLILLL.LLILLJJLI.LJIIIZ(Unit.LIZ);
                }
            }
        };
    }

    @Override // X.C0EZ1
    public void ee(EnumC366550EYr enumC366550EYr) {
        InterfaceC391330FVz interfaceC391330FVzG2 = G2();
        if (interfaceC391330FVzG2 != null) {
            interfaceC391330FVzG2.GZ0(enumC366550EYr);
        }
    }

    @Override // X.C0EZ1
    public void kK1(AVMusic aVMusic) {
        InterfaceC1460000o62 interfaceC1460000o62;
        if (C1428470nHB.LJJJZ(getEditModel())) {
            return;
        }
        InterfaceC1455610nyx interfaceC1455610nyxZ1 = Z1();
        if ((interfaceC1455610nyxZ1 instanceof InterfaceC1460000o62) && (interfaceC1460000o62 = (InterfaceC1460000o62) interfaceC1455610nyxZ1) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C391310FVx(new AwS249S0300000_5(this, aVMusic, interfaceC1460000o62, 4), interfaceC1460000o62, null), 3);
        }
    }

    @Override // X.C0EZ1
    public List<LyricStickerModel> kh(String str) {
        List<StickerModel> listS32;
        InterfaceC391240FVq interfaceC391240FVqW2 = w2();
        ArrayList arrayList = null;
        if (interfaceC391240FVqW2 != null && (listS32 = interfaceC391240FVqW2.s32()) != null) {
            ArrayList<StickerModel> arrayList2 = new ArrayList();
            for (StickerModel stickerModel : listS32) {
                StickerModel stickerModel2 = stickerModel;
                if ((stickerModel2 instanceof LyricStickerModel) && Intrinsics.LJFF(((LyricStickerModel) stickerModel2).getMusicId(), str)) {
                    arrayList2.add(stickerModel);
                }
            }
            arrayList = new ArrayList();
            for (StickerModel stickerModel3 : arrayList2) {
                if ((stickerModel3 instanceof LyricStickerModel) && stickerModel3 != null) {
                    arrayList.add(stickerModel3);
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void r(EnumC356070Dxd enumC356070Dxd) {
        InterfaceC391240FVq interfaceC391240FVqW2 = w2();
        if (interfaceC391240FVqW2 != null) {
            List<LyricStickerModel> listI4 = i4();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listI4, 10));
            Iterator<LyricStickerModel> it2 = listI4.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().getId()));
            }
            interfaceC391240FVqW2.M3(arrayList, null, enumC356070Dxd);
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void B1(String str, EnumC356070Dxd enumC356070Dxd) {
        List<LyricStickerModel> listKh = kh(str);
        if (listKh != null) {
            for (LyricStickerModel lyricStickerModel : listKh) {
                InterfaceC391240FVq interfaceC391240FVqW2 = w2();
                if (interfaceC391240FVqW2 != null) {
                    interfaceC391240FVqW2.XJ(lyricStickerModel.getId(), null, enumC356070Dxd);
                }
            }
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void M(List<LyricStickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        NLEEditor nLEEditorLF2;
        for (LyricStickerModel lyricStickerModel : list) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            h1(lyricStickerModel, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE && (nLEEditorLF2 = LF2()) != null) {
            nLEEditorLF2.done();
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void M0(List<String> list, EnumC356070Dxd enumC356070Dxd) {
        NLEEditor nLEEditorLF2;
        for (String str : list) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            B1(str, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE && (nLEEditorLF2 = LF2()) != null) {
            nLEEditorLF2.done();
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void f(List<LyricStickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        NLEEditor nLEEditorLF2;
        for (LyricStickerModel lyricStickerModel : list) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            x1(lyricStickerModel, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE && (nLEEditorLF2 = LF2()) != null) {
            nLEEditorLF2.done();
        }
        Dj();
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void g3(String str, EnumC356070Dxd enumC356070Dxd) {
        NLEEditor nLEEditorLF2;
        List<LyricStickerModel> listI4 = i4();
        if (listI4 != null) {
            ArrayList<LyricStickerModel> arrayList = new ArrayList();
            for (LyricStickerModel lyricStickerModel : listI4) {
                if (Intrinsics.LJFF(lyricStickerModel.getUuid(), str)) {
                    arrayList.add(lyricStickerModel);
                }
            }
            for (LyricStickerModel lyricStickerModel2 : arrayList) {
                InterfaceC391240FVq interfaceC391240FVqW2 = w2();
                if (interfaceC391240FVqW2 != null) {
                    int id = lyricStickerModel2.getId();
                    EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
                    if (enumC356070Dxd != enumC356070Dxd2) {
                        enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
                    }
                    interfaceC391240FVqW2.XJ(id, null, enumC356070Dxd2);
                }
            }
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE && (nLEEditorLF2 = LF2()) != null) {
            nLEEditorLF2.done();
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void h1(LyricStickerModel lyricStickerModel, EnumC356070Dxd enumC356070Dxd) {
        if (lyricStickerModel.getBaseStickerModel().getZIndex() == 0) {
            lyricStickerModel.getBaseStickerModel().setZIndex(C364360EQg.LIZ());
        }
        InterfaceC391240FVq interfaceC391240FVqW2 = w2();
        if (interfaceC391240FVqW2 != null) {
            interfaceC391240FVqW2.f3(lyricStickerModel, enumC356070Dxd);
        }
    }

    @Override // X.C0EZ1, X.InterfaceC364330EQd
    public void x1(LyricStickerModel lyricStickerModel, EnumC356070Dxd enumC356070Dxd) {
        InterfaceC391240FVq interfaceC391240FVqW2 = w2();
        if (interfaceC391240FVqW2 != null) {
            interfaceC391240FVqW2.k3(lyricStickerModel, enumC356070Dxd);
        }
        Dj();
    }
}
