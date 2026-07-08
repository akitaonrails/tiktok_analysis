package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459180o4i extends AbstractC2255721DQs<InterfaceC1457250o1b> implements InterfaceC1457250o1b, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = new C1466810oH1(this, 8);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456450o0J.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366450EYh.class, null);
    public final h0<Integer> LLJILLL = new h0<>(null);
    public final h0<Integer> LLJJ = new h0<>(null);
    public final h0<C20502615Km> LLJJI = new h0<>(null);
    public final C560530Lyd<Unit> LLJJIII;
    public final LiveEvent<Unit> LLJJIJI;
    public final C560530Lyd<Unit> LLJJIJIIJIL;
    public final LiveEvent<Unit> LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public final InterfaceC20502415Kk LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final InterfaceC1464180oCm LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC1457250o1b
    public void Cd1(int i) {
    }

    public InterfaceC1457250o1b X1() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459180o4i.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459180o4i.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1459180o4i.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1459180o4i.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1459180o4i.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1459180o4i.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1459180o4i.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1459180o4i.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1459180o4i.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1459180o4i.class, "lyricsDataApi", "getLyricsDataApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    private final InterfaceC1459220o4m B3() {
        return (InterfaceC1459220o4m) this.LLJJL.getValue();
    }

    private final InterfaceC1456910o13 E3() {
        return (InterfaceC1456910o13) this.LLJI.getValue(this, LLJL[6]);
    }

    private final InterfaceC1461350o8D H2() {
        return (InterfaceC1461350o8D) this.LLJ.getValue(this, LLJL[5]);
    }

    private final InterfaceC1418580n1E T2() {
        return (InterfaceC1418580n1E) this.LLILZIL.getValue(this, LLJL[1]);
    }

    private final InterfaceC377540ErA W2() {
        return (InterfaceC377540ErA) this.LLILZLL.getValue(this, LLJL[2]);
    }

    private final InterfaceC559500Lwy Z1() {
        return (InterfaceC559500Lwy) this.LLJIJIL.getValue(this, LLJL[7]);
    }

    private final InterfaceC1455160nyE m3() {
        return (InterfaceC1455160nyE) this.LLJJJJLIIL.getValue();
    }

    private final InterfaceC1453200nv4 o2() {
        return (InterfaceC1453200nv4) this.LLIZLLLIL.getValue(this, LLJL[4]);
    }

    private final InterfaceC1456450o0J w2() {
        return (InterfaceC1456450o0J) this.LLJILJIL.getValue(this, LLJL[8]);
    }

    public final InterfaceC1455860nzM G2() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLJL[0]);
    }

    @Override // X.InterfaceC1457250o1b
    public void Ow0() {
        this.LLJJIJIIJIL.LJIIJ(Unit.LIZ);
    }

    public final InterfaceC366450EYh c3() {
        return (InterfaceC366450EYh) this.LLJILJILJ.getValue(this, LLJL[9]);
    }

    public final VideoPublishEditModel i3() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJL[3]);
    }

    @Override // X.InterfaceC1457250o1b
    public void of1() {
        this.LLJJIII.LJIIJ(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H3() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.i3()
            boolean r0 = X.C1428470nHB.LJJZZI(r0)
            if (r0 == 0) goto L2d
            boolean r0 = X.C0EM4.LIZ()
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.i3()
            int r0 = r0.getVideoLength()
        L18:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L42
            int r1 = r0.intValue()
        L22:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.i3()
            int r0 = r0.getMCurMusicLength()
            if (r1 <= r0) goto L44
            return
        L2d:
            X.0nzM r0 = r2.G2()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto L42
            int r0 = r0.getDuration()
            goto L18
        L42:
            r1 = 0
            goto L22
        L44:
            X.0nv4 r1 = r2.o2()
            if (r1 == 0) goto L55
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.i3()
            int r0 = r0.getMMusicStart()
            r1.Mp2(r0)
        L55:
            X.0o8D r0 = r2.H2()
            if (r0 == 0) goto L64
            androidx.lifecycle.MutableLiveData r1 = r0.fz0()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459180o4i.H3():void");
    }

    private final InterfaceC1455160nyE q3() {
        InterfaceC1456450o0J interfaceC1456450o0JW2 = w2();
        return interfaceC1456450o0JW2 == null ? m3() : interfaceC1456450o0JW2;
    }

    @Override // X.InterfaceC1457250o1b
    public String getEnterMethod() {
        return qG0() ? "music_panel" : Kc0() ? "entrance_icon" : "";
    }

    @Override // X.InterfaceC1457250o1b
    public void hide() {
        B3().LJJIJIIJIL();
    }

    @Override // X.InterfaceC1457250o1b
    public void show() {
        InterfaceC1459220o4m interfaceC1459220o4mB3 = B3();
        interfaceC1459220o4mB3.h5(C1416310mxZ.LJJJJZ(i3()));
        interfaceC1459220o4mB3.LJJLIIIJJI();
    }

    @Override // X.InterfaceC1457250o1b
    public String w42() {
        return i3().creativeModel.musicBuzModel.soundFilterId;
    }

    @Override // X.InterfaceC1457250o1b
    public boolean Kc0() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1457250o1b
    public String PJ2() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1457250o1b
    public LiveEvent<Unit> Pn1() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1457250o1b
    public C385670FAf<C20502615Km> ed2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1457250o1b
    public C385670FAf<Integer> getVideoLength() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1457250o1b
    public boolean qG0() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1457250o1b
    public /* bridge */ /* synthetic */ C385670FAf rI() {
        return this.LLJJ;
    }

    public h0<Integer> v3() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1457250o1b
    public LiveEvent<Unit> zy0() {
        return this.LLJJIJIL;
    }

    public void F4(boolean z) {
        this.LLJJJIL = z;
    }

    @Override // X.InterfaceC1457250o1b
    public void LLLIIII(List<Integer> list) {
        B3().LLLIIII(list);
    }

    @Override // X.InterfaceC1457250o1b
    public void LLLL(int i) {
        this.LLJILLL.LJII(Integer.valueOf(i));
    }

    public final void W1(AVMusic aVMusic) {
        String strGA1;
        InterfaceC366450EYh interfaceC366450EYhC3;
        if (!C1403850mdT.LJFF(i3()) || aVMusic == null) {
            return;
        }
        InterfaceC366450EYh interfaceC366450EYhC32 = c3();
        if (interfaceC366450EYhC32 != null) {
            strGA1 = interfaceC366450EYhC32.gA1(false);
        } else {
            strGA1 = null;
        }
        if (Intrinsics.LJFF(strGA1, aVMusic.getMusicId()) && (interfaceC366450EYhC3 = c3()) != null) {
            interfaceC366450EYhC3.NJ0(false);
        }
    }

    @Override // X.InterfaceC1457250o1b
    public void Xv0(boolean z) {
        this.LLJJJ = z;
    }

    @Override // X.InterfaceC1457250o1b
    public void ca(boolean z) {
        this.LLJJJIL = z;
        B3().ca(z);
    }

    @Override // X.InterfaceC1457250o1b
    public void gp1(String str) {
        this.LLJJJJ = str;
    }

    @Override // X.InterfaceC1457250o1b
    public void h5(boolean z) {
        B3().h5(z);
    }

    @Override // X.InterfaceC1457250o1b
    public void u70(String str) {
        i3().creativeModel.musicBuzModel.soundFilterId = str;
    }

    public void z4(boolean z) {
        this.LLJJJ = z;
    }

    public final void e4(int i, List<C15JF> list) {
        InterfaceC1452170ntP value = G2().g().getValue();
        if (value == null) {
            return;
        }
        InterfaceC1455860nzM interfaceC1455860nzMG2 = G2();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C15JF c15jf : list) {
            long j = c15jf.LIZJ;
            arrayList.add(new C1450120nq6((int) j, (int) (c15jf.LIZLLL - j), i3().getIsSoundLoop().booleanValue()));
        }
        interfaceC1455860nzMG2.aI0(arrayList);
        int iYf = value.Yf(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.LLJJLIIIJLLLLLLLZ);
        if (iYf != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayMusic seek error: ");
            sbLIZ.append(iYf);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void o4(int i, float f) {
        int duration;
        boolean zIsLoopMusic;
        int maxLoopDuration;
        Integer numValueOf;
        final AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(i3().creativeModel.musicBuzModel);
        InterfaceC1452170ntP value = G2().g().getValue();
        String mMusicPath = i3().getMMusicPath();
        i3();
        int iLIZIZ = C141Q.LIZIZ(i3().getCurMusicServerLength(), mMusicPath);
        if (C1428470nHB.LJJZZI(i3()) && C0EM4.LIZ()) {
            duration = i3().getVideoLength();
        } else {
            InterfaceC1452170ntP value2 = G2().g().getValue();
            if (value2 != null) {
                duration = value2.getDuration();
            } else {
                duration = 0;
            }
        }
        int iLIZ = C1452670nuD.LIZ(aVMusicExtractAVMusic, f, i, iLIZIZ, duration, i3().creativeModel.musicBuzModel);
        i3().setMMusicEnd(i + iLIZ);
        InterfaceC1455860nzM interfaceC1455860nzMG2 = G2();
        C1450120nq6 c1450120nq6 = new C1450120nq6(i, (int) (iLIZ / f), false);
        if (aVMusicExtractAVMusic != null) {
            zIsLoopMusic = aVMusicExtractAVMusic.isLoopMusic();
        } else {
            zIsLoopMusic = false;
        }
        c1450120nq6.LIZLLL = zIsLoopMusic;
        if (aVMusicExtractAVMusic != null) {
            maxLoopDuration = aVMusicExtractAVMusic.getMaxLoopDuration();
        } else {
            maxLoopDuration = 0;
        }
        c1450120nq6.LJ = maxLoopDuration;
        c1450120nq6.LJFF = new InterfaceC1456660o0e() { // from class: X.0o4l
            @Override // X.InterfaceC1456660o0e
            public final void LIZ() {
                InterfaceC366450EYh interfaceC366450EYhC3 = this.LIZ.c3();
                if (interfaceC366450EYhC3 != null) {
                    interfaceC366450EYhC3.bA(false);
                }
                C0CNO.LIZLLL(0L, new AwS423S0200000_22(this.LIZ, aVMusicExtractAVMusic, 46));
            }
        };
        interfaceC1455860nzMG2.SX(c1450120nq6);
        if (value != null) {
            numValueOf = Integer.valueOf(value.Yf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.LLJJLIIIJLLLLLLLZ));
            if (numValueOf != null && numValueOf.intValue() == 0) {
                return;
            }
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayMusic seek error: ");
        sbLIZ.append(numValueOf);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1457250o1b
    public void oJ2(int i, int i2) {
        this.LLJJ.LJII(Integer.valueOf(i2));
        this.LLJILLL.LJII(Integer.valueOf(i));
    }

    public C1459180o4i(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJJIII = c560530Lyd;
        this.LLJJIJI = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJIJIIJIL = c560530Lyd2;
        this.LLJJIJIL = c560530Lyd2;
        this.LLJJJIL = true;
        this.LLJJJJ = "";
        this.LLJJJJJIL = new InterfaceC20502415Kk() { // from class: X.0o4j
            public boolean LIZ;
            public long LIZIZ;
            public long LIZJ;

            @Override // X.InterfaceC20502415Kk
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC20502415Kk
            public final void LIZ() {
                InterfaceC366450EYh interfaceC366450EYhC3 = this.LIZLLL.c3();
                if (interfaceC366450EYhC3 != null) {
                    interfaceC366450EYhC3.bA(false);
                }
            }

            @Override // X.InterfaceC20502415Kk
            public final void LJ() {
                C348100Dkm c348100DkmLIZLLL;
                if (this.LIZ) {
                    InterfaceC1452170ntP value = this.LIZLLL.G2().g().getValue();
                    if (!(value instanceof C1463670oBx) || (c348100DkmLIZLLL = ((C1463670oBx) value).LIZLLL()) == null) {
                        return;
                    }
                    C347660Dk4 c347660Dk4LJJJJ = c348100DkmLIZLLL.LJFF().LJJJJ();
                    if (c347660Dk4LJJJJ != null) {
                        c347660Dk4LJJJJ.LJFF = this.LIZIZ;
                        c347660Dk4LJJJJ.LJI = this.LIZJ;
                    }
                    c348100DkmLIZLLL.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                }
            }

            @Override // X.InterfaceC20502415Kk
            public final void LJII(float f) {
                C348100Dkm c348100DkmLIZLLL;
                if (!u4.LJIIIIZZ(this.LIZLLL.i3())) {
                    this.LIZ = false;
                    if (C0EM4.LIZ()) {
                        LIZIZ(this.LIZLLL.i3().creativeModel.musicBuzModel.musicStart, f);
                        return;
                    }
                    return;
                }
                MusicBeanUtilKt.extractAVMusic(this.LIZLLL.i3().creativeModel.musicBuzModel);
                InterfaceC1452170ntP value = this.LIZLLL.G2().g().getValue();
                if ((value instanceof C1463670oBx) && (c348100DkmLIZLLL = ((C1463670oBx) value).LIZLLL()) != null) {
                    C1459180o4i c1459180o4i = this.LIZLLL;
                    C347660Dk4 c347660Dk4LJJJJ = c348100DkmLIZLLL.LJFF().LJJJJ();
                    if (c347660Dk4LJJJJ != null) {
                        this.LIZIZ = c347660Dk4LJJJJ.LJFF;
                        this.LIZJ = c347660Dk4LJJJJ.LJI;
                        c347660Dk4LJJJJ.LJFF = 0L;
                        c347660Dk4LJJJJ.LJI = -2L;
                    }
                    c348100DkmLIZLLL.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                    this.LIZ = true;
                    LIZIZ(c1459180o4i.i3().creativeModel.musicBuzModel.musicStart, f);
                }
            }

            @Override // X.InterfaceC20502415Kk
            public final void LIZIZ(int i2, float f) {
                this.LIZLLL.o4(i2, f);
            }

            @Override // X.InterfaceC20502415Kk
            public final void LIZLLL(int i2, List<C15JF> list) {
                this.LIZLLL.e4(i2, list);
            }

            @Override // X.InterfaceC20502415Kk
            public final void LJIIIZ(float f, long j) {
                int duration;
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZLLL.i3().creativeModel.musicBuzModel);
                int i2 = (int) j;
                String mMusicPath = this.LIZLLL.i3().getMMusicPath();
                this.LIZLLL.i3();
                int iLIZIZ = C141Q.LIZIZ(this.LIZLLL.i3().getCurMusicServerLength(), mMusicPath);
                if (C1428470nHB.LJJZZI(this.LIZLLL.i3()) && C0EM4.LIZ()) {
                    duration = this.LIZLLL.i3().getVideoLength();
                } else {
                    InterfaceC1452170ntP value = this.LIZLLL.G2().g().getValue();
                    if (value != null) {
                        duration = value.getDuration();
                    } else {
                        duration = 0;
                    }
                }
                C1452670nuD.LIZ(aVMusicExtractAVMusic, f, i2, iLIZIZ, duration, this.LIZLLL.i3().creativeModel.musicBuzModel);
            }

            @Override // X.InterfaceC20502415Kk
            public final void LIZJ(float f, int i2, final boolean z) {
                int duration;
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZLLL.i3().creativeModel.musicBuzModel);
                String mMusicPath = this.LIZLLL.i3().getMMusicPath();
                this.LIZLLL.i3();
                int iLIZIZ = C141Q.LIZIZ(this.LIZLLL.i3().getCurMusicServerLength(), mMusicPath);
                if (C1428470nHB.LJJZZI(this.LIZLLL.i3()) && C0EM4.LIZ()) {
                    duration = this.LIZLLL.i3().getVideoLength();
                } else {
                    InterfaceC1452170ntP value = this.LIZLLL.G2().g().getValue();
                    if (value != null) {
                        duration = value.getDuration();
                    } else {
                        duration = 0;
                    }
                }
                int iLIZ = C1452670nuD.LIZ(aVMusicExtractAVMusic, f, i2, iLIZIZ, duration, this.LIZLLL.i3().creativeModel.musicBuzModel);
                InterfaceC1455860nzM interfaceC1455860nzMG2 = this.LIZLLL.G2();
                C1450120nq6 c1450120nq6 = new C1450120nq6(this.LIZLLL.i3().getMMusicStart(), (int) (iLIZ / f), this.LIZLLL.i3().getIsSoundLoop().booleanValue());
                final C1459180o4i c1459180o4i = this.LIZLLL;
                c1450120nq6.LIZLLL = C1416310mxZ.LJJJJLI(c1459180o4i.i3());
                c1450120nq6.LJ = C1416310mxZ.LJJL(c1459180o4i.i3(), 0, null, 3);
                c1450120nq6.LJFF = new InterfaceC1456660o0e() { // from class: X.0o4o
                    @Override // X.InterfaceC1456660o0e
                    public final void LIZ() {
                        InterfaceC366450EYh interfaceC366450EYhC3 = c1459180o4i.c3();
                        if (interfaceC366450EYhC3 != null) {
                            interfaceC366450EYhC3.kC(c1459180o4i.i3().getMusicId(), z, false);
                        }
                    }
                };
                interfaceC1455860nzMG2.SX(c1450120nq6);
            }

            @Override // X.InterfaceC20502415Kk
            public final void LJI(boolean z, List<C15JF> list, C1459260o4q c1459260o4q) {
                this.LIZLLL.O3(z, list, c1459260o4q);
                this.LIZLLL.hide();
            }

            @Override // X.InterfaceC20502415Kk
            public final void LJFF(boolean z, int i2, C1459260o4q c1459260o4q, float f) {
                this.LIZLLL.Q3(z, i2, c1459260o4q, f);
                this.LIZLLL.hide();
            }
        };
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 448));
        this.LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 449));
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC1464180oCm() { // from class: X.0o4k
            @Override // X.InterfaceC1464180oCm
            public final void onSeekDone(int i2) {
                InterfaceC1452170ntP value;
                if (i2 == 0 && (value = this.LIZ.G2().g().getValue()) != null) {
                    value.play();
                }
            }
        };
    }

    public final void O3(boolean z, List<C15JF> list, C1459260o4q c1459260o4q) {
        String str;
        if (list.isEmpty()) {
            return;
        }
        C15JF c15jf = (C15JF) C13LP.LJJJLL(list);
        if (c15jf != null) {
            i3().creativeModel.musicBuzModel.musicStartFromCut = (int) c15jf.LIZJ;
            i3().creativeModel.musicBuzModel.musicEndFromCut = (int) c15jf.LIZLLL;
            i3().setMMusicStart((int) c15jf.LIZJ);
            i3().setMMusicEnd((int) c15jf.LIZLLL);
        }
        List<MusicBuzModel> list2 = i3().creativeModel.musicBuzModel.extendMusicList;
        ArrayList arrayList = null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (MusicBuzModel musicBuzModel : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    MusicBuzModel musicBuzModel2 = musicBuzModel;
                    C15JF c15jf2 = (C15JF) C13LP.LJJJLZIJ(i2, list);
                    if (c15jf2 != null) {
                        int i3 = (int) c15jf2.LIZJ;
                        musicBuzModel2.musicStartFromCut = i3;
                        int i4 = (int) c15jf2.LIZLLL;
                        musicBuzModel2.musicEndFromCut = i4;
                        musicBuzModel2.musicStart = i3;
                        musicBuzModel2.musicEnd = i4;
                        arrayList2.add(musicBuzModel2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList = arrayList2;
        }
        i3().creativeModel.musicBuzModel.extendMusicList = arrayList;
        if (!z) {
            MusicBuzModel musicBuzModel3 = i3().creativeModel.musicBuzModel;
            if (C0MT6.LIZ()) {
                str = "recommend_music";
            } else {
                str = "edit_normal";
            }
            musicBuzModel3.musicEditFrom = str;
        }
        i3().setIsSoundLoop(Boolean.valueOf(c1459260o4q.LIZ));
        if (C0MT6.LIZ()) {
            C1456140nzo.LIZIZ(G2(), false, false, false, false, 12);
        } else {
            C1456140nzo.LIZIZ(G2(), true, false, false, false, 12);
        }
        InterfaceC1453200nv4 interfaceC1453200nv4O2 = o2();
        if (interfaceC1453200nv4O2 != null) {
            interfaceC1453200nv4O2.hide();
        }
        C1456140nzo.LIZIZ(G2(), true, false, false, false, 12);
        InterfaceC1461350o8D interfaceC1461350o8DH2 = H2();
        if (interfaceC1461350o8DH2 != null) {
            interfaceC1461350o8DH2.fz0().setValue(Boolean.TRUE);
        }
        G2().FJ(false);
        InterfaceC1455860nzM interfaceC1455860nzMG2 = G2();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C15JF c15jf3 : list) {
            long j = c15jf3.LIZJ;
            arrayList3.add(new C1450120nq6((int) j, (int) (c15jf3.LIZLLL - j), i3().getIsSoundLoop().booleanValue()));
        }
        interfaceC1455860nzMG2.aI0(arrayList3);
        InterfaceC1418580n1E interfaceC1418580n1ET2 = T2();
        if (interfaceC1418580n1ET2 != null) {
            interfaceC1418580n1ET2.Ca1(true);
        }
        InterfaceC1456910o13 interfaceC1456910o13E3 = E3();
        if (interfaceC1456910o13E3 != null) {
            interfaceC1456910o13E3.O32(true);
        }
        InterfaceC377540ErA interfaceC377540ErAW2 = W2();
        if (interfaceC377540ErAW2 != null && interfaceC377540ErAW2.isShowing()) {
            C1456140nzo.LIZIZ(G2(), false, false, false, false, 12);
            InterfaceC377540ErA interfaceC377540ErAW22 = W2();
            if (interfaceC377540ErAW22 != null) {
                interfaceC377540ErAW22.nO2();
            }
        }
        InterfaceC559500Lwy interfaceC559500LwyZ1 = Z1();
        if (interfaceC559500LwyZ1 != null) {
            interfaceC559500LwyZ1.Qk(false);
        }
        if (C0MT6.LIZ() && !C729510SjV.LJIILL(i3().getCanvasVideoData())) {
            q3().t3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final void Q3(boolean z, int i, C1459260o4q c1459260o4q, float f) {
        int duration;
        MvCreateVideoData mvCreateVideoData;
        InterfaceC1453200nv4 interfaceC1453200nv4O2;
        String str;
        i3().creativeModel.musicBuzModel.musicStartFromCut = i;
        if (!z) {
            MusicBuzModel musicBuzModel = i3().creativeModel.musicBuzModel;
            if (C0MT6.LIZ()) {
                str = "recommend_music";
            } else {
                str = "edit_normal";
            }
            musicBuzModel.musicEditFrom = str;
        }
        i3().setMMusicStart(i);
        i3().setIsSoundLoop(Boolean.valueOf(c1459260o4q.LIZ));
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(i3().creativeModel.musicBuzModel);
        String mMusicPath = i3().getMMusicPath();
        i3();
        int iLIZIZ = C141Q.LIZIZ(i3().getCurMusicServerLength(), mMusicPath);
        boolean z2 = 0;
        z2 = 0;
        if (C1428470nHB.LJJZZI(i3()) && C0EM4.LIZ()) {
            duration = i3().getVideoLength();
        } else {
            InterfaceC1452170ntP value = G2().g().getValue();
            if (value != null) {
                duration = value.getDuration();
            } else {
                duration = 0;
            }
        }
        int iLIZ = C1452670nuD.LIZ(aVMusicExtractAVMusic, f, i, iLIZIZ, duration, i3().creativeModel.musicBuzModel);
        int i2 = i + iLIZ;
        i3().setMMusicEnd(i2);
        if (C1458070o2v.LIZIZ()) {
            i3().creativeModel.musicBuzModel.musicEndFromCut = i2;
        }
        boolean z3 = true;
        if (C12DO.LIZ()) {
            InterfaceC1453200nv4 interfaceC1453200nv4O22 = o2();
            if (interfaceC1453200nv4O22 == null || !interfaceC1453200nv4O22.isShowing()) {
                z3 = true;
                z2 = 0;
                C1456140nzo.LIZIZ(G2(), true, false, false, false, 12);
            }
        } else if (C0MT6.LIZ()) {
            C1456140nzo.LIZIZ(G2(), false, false, false, false, 12);
        } else {
            z3 = true;
            z2 = 0;
            C1456140nzo.LIZIZ(G2(), true, false, false, false, 12);
        }
        if (!C12DO.LIZ() && (interfaceC1453200nv4O2 = o2()) != null) {
            interfaceC1453200nv4O2.hide();
        }
        if (!C12DO.LIZ()) {
            C1456140nzo.LIZIZ(G2(), z3, z2, z2, z2, 12);
        }
        InterfaceC1461350o8D interfaceC1461350o8DH2 = H2();
        if (interfaceC1461350o8DH2 != null) {
            interfaceC1461350o8DH2.fz0().setValue(Boolean.TRUE);
        }
        G2().FJ(z2);
        InterfaceC1455860nzM interfaceC1455860nzMG2 = G2();
        C1450120nq6 c1450120nq6 = new C1450120nq6(i3().getMMusicStart(), (int) (iLIZ / f), i3().getIsSoundLoop().booleanValue());
        c1450120nq6.LIZLLL = C1416310mxZ.LJJJJLI(i3());
        c1450120nq6.LJ = C1416310mxZ.LJJL(i3(), z2, null, 3);
        c1450120nq6.LJFF = new InterfaceC1456660o0e() { // from class: X.0o4n
            @Override // X.InterfaceC1456660o0e
            public final void LIZ() {
                InterfaceC366450EYh interfaceC366450EYhC3 = this.LIZ.c3();
                if (interfaceC366450EYhC3 != null) {
                    interfaceC366450EYhC3.bA(false);
                }
            }
        };
        interfaceC1455860nzMG2.SX(c1450120nq6);
        o4(i3().getMMusicStart(), f);
        G2().iw0(z3);
        InterfaceC1418580n1E interfaceC1418580n1ET2 = T2();
        if (interfaceC1418580n1ET2 != null) {
            interfaceC1418580n1ET2.Ca1(z3);
        }
        H3();
        if (i3().isMvThemeVideoType() && (mvCreateVideoData = i3().getMvCreateVideoData()) != null && mvCreateVideoData.mvType == z3) {
            q3().Q4(i3().getMMusicPath(), i3().getMMusicStart(), i3().getMMusicEnd(), -1, z2);
        }
        InterfaceC1456910o13 interfaceC1456910o13E3 = E3();
        if (interfaceC1456910o13E3 != null) {
            interfaceC1456910o13E3.O32(z3);
        }
        InterfaceC377540ErA interfaceC377540ErAW2 = W2();
        if (interfaceC377540ErAW2 != null && interfaceC377540ErAW2.isShowing() == z3) {
            C1456140nzo.LIZIZ(G2(), z2, z2, z2, z2, 12);
            InterfaceC377540ErA interfaceC377540ErAW22 = W2();
            if (interfaceC377540ErAW22 != null) {
                interfaceC377540ErAW22.nO2();
            }
        }
        InterfaceC559500Lwy interfaceC559500LwyZ1 = Z1();
        if (interfaceC559500LwyZ1 != 0) {
            interfaceC559500LwyZ1.Qk(z2);
        }
        if (C0MT6.LIZ() && !C729510SjV.LJIILL(i3().getCanvasVideoData()) && !C12DO.LIZ()) {
            q3().t3();
        }
    }

    @Override // X.InterfaceC1457250o1b
    public void yl1(AVMusic aVMusic, String str, int i, int i2, AVMusicWaveBean aVMusicWaveBean) {
        this.LLJJI.LJII(new C20502615Km(aVMusic, str, i, i2, aVMusicWaveBean));
    }
}
