package X;

import Y.AObjectS247S0100000_29;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19621111ph extends AbstractC2255721DQs<InterfaceC1459040o4U> implements InterfaceC1459040o4U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1464960oE2.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
    public BaseStickerModel LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C560530Lyd<Boolean> LLJILJILJ;
    public final LiveEvent<Boolean> LLJILLL;
    public final C19621211pi LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19621111ph.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19621111ph.class, "imageStickerApi", "getImageStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19621111ph.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19621111ph.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19621111ph.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public InterfaceC1459040o4U Z1() {
        return this;
    }

    private final InterfaceC1464960oE2 G2() {
        return (InterfaceC1464960oE2) this.LLILLL.getValue(this, LLJJI[1]);
    }

    private final InterfaceC391240FVq H2() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLJJI[0]);
    }

    private final InterfaceC1454960nxu W2() {
        return (InterfaceC1454960nxu) this.LLILZ.getValue(this, LLJJI[2]);
    }

    @Override // X.InterfaceC1459040o4U
    public Function1<StickerModel, Unit> Pi() {
        return new AwS608S0100000_29(this, 376);
    }

    public final VideoPublishEditModel T2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJI[3]);
    }

    @Override // X.InterfaceC1459040o4U
    public void b6() {
        MusicStickerModel musicStickerModel;
        if (this.LLIZLLLIL) {
            StickerModel stickerModelPX1 = pX1();
            if (!(stickerModelPX1 instanceof MusicStickerModel) || (musicStickerModel = (MusicStickerModel) stickerModelPX1) == null) {
                return;
            }
            BaseStickerModel baseStickerModel = this.LLIZ;
            if (baseStickerModel != null) {
                this.LLIZLLLIL = false;
                InterfaceC391240FVq interfaceC391240FVqH2 = H2();
                if (interfaceC391240FVqH2 != null) {
                    interfaceC391240FVqH2.k3(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, baseStickerModel.getCenterX(), baseStickerModel.getCenterY(), 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY(), baseStickerModel.getScale(), baseStickerModel.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom), EnumC356070Dxd.COMMIT);
                } else {
                    InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
                    if (interfaceC1464960oE2G2 != null) {
                        interfaceC1464960oE2G2.J4(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, baseStickerModel.getCenterX(), baseStickerModel.getCenterY(), 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY(), baseStickerModel.getScale(), baseStickerModel.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
                    }
                }
            }
            C19620811pe c19620811peO2 = o2();
            if (c19620811peO2 != null) {
                try {
                    C21637819mC c21637819mC = (C21637819mC) c19620811peO2.LJIJ.LIZJ(C13LE.LIZ(C21637819mC.class));
                    if (c21637819mC != null) {
                        c21637819mC.LIZIZ(c19620811peO2);
                    }
                } catch (C1955307lH e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final InterfaceC559500Lwy w2() {
        return (InterfaceC559500Lwy) this.LLILZLL.getValue(this, LLJJI[4]);
    }

    private final C19620811pe o2() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C19620811pe c19620811pe;
        List<C0FTJ<StickerModel>> listLLLLLZ2;
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        C0FTJ c0ftj = (interfaceC391240FVqH2 == null || (listLLLLLZ2 = interfaceC391240FVqH2.LLLLLZ(EnumC1466150oFx.MUSIC_STICKER)) == null) ? null : (C0FTJ) C13LP.LJJJLL(listLLLLLZ2);
        if ((c0ftj instanceof C19620811pe) && (c19620811pe = (C19620811pe) c0ftj) != null) {
            return c19620811pe;
        }
        InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
        C0FTJ c0ftj2 = (interfaceC1464960oE2G2 == null || (listLLLLLZ = interfaceC1464960oE2G2.LLLLLZ(EnumC1466150oFx.MUSIC_STICKER)) == null) ? null : (C0FTJ) C13LP.LJJJLL(listLLLLLZ);
        if (c0ftj2 instanceof C19620811pe) {
            return (C19620811pe) c0ftj2;
        }
        return null;
    }

    public final void i3() {
        C860620XpU.LIZIZ(T2(), Boolean.valueOf(this.LLJI), Boolean.valueOf(this.LLJ), Boolean.valueOf(this.LLJIJIL), Boolean.valueOf(this.LLJILJIL));
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        h0 h0VarZq;
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS608S0100000_29(this, 377));
        }
        if (getDiContainer().LIZJ(InterfaceC1464960oE2.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1464960oE2.class, new AwS608S0100000_29(this, 378));
        }
        InterfaceC1454960nxu interfaceC1454960nxuW2 = W2();
        if (interfaceC1454960nxuW2 == null || (h0VarZq = interfaceC1454960nxuW2.Zq()) == null) {
            return;
        }
        h0VarZq.LJ(this, new AObjectS247S0100000_29(this, 83));
    }

    @Override // X.InterfaceC1459040o4U
    public StickerModel pX1() {
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        if (interfaceC391240FVqH2 != null && (stickerModel = (StickerModel) C13LP.LJJJLZIJ(0, interfaceC391240FVqH2.LLLILZLLLI(EnumC1466150oFx.MUSIC_STICKER))) != null) {
            return stickerModel;
        }
        InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
        StickerModel stickerModel2 = null;
        if (interfaceC1464960oE2G2 == null) {
            return null;
        }
        Iterator<StickerModel> it2 = interfaceC1464960oE2G2.Dt().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StickerModel next = it2.next();
            if (next.getStickerType() == EnumC1466150oFx.MUSIC_STICKER) {
                stickerModel2 = next;
                break;
            }
        }
        return stickerModel2;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1459040o4U
    public LiveEvent<Boolean> lD() {
        return this.LLJILLL;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.11pi] */
    public C19621111ph(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<Boolean> c560530Lyd = new C560530Lyd<>();
        this.LLJILJILJ = c560530Lyd;
        this.LLJILLL = c560530Lyd;
        final Class<MusicStickerModel> cls = MusicStickerModel.class;
        this.LLJJ = new AbstractC19622511pv<MusicStickerModel>(cls) { // from class: X.11pi
            public final EnumC1466150oFx LLILLJJLI = EnumC1466150oFx.MUSIC_STICKER;

            @Override // X.AbstractC19622511pv
            public final EnumC1466150oFx LJJIJLIJ() {
                return this.LLILLJJLI;
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJI(StickerModel stickerModel) {
                this.LLILLL.LLJIJIL = true;
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJJ(StickerModel stickerModel) {
                this.LLILLL.i3();
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJLZIJ(StickerModel stickerModel) {
                this.LLILLL.LLJ = true;
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJJL(StickerModel stickerModel, String str) {
                if (Intrinsics.LJFF(str, "MUSIC_OR_LYRIC_STICKER_CHANGE")) {
                    C19621111ph c19621111ph = this.LLILLL;
                    c19621111ph.LLJI = false;
                    c19621111ph.LLJILJIL = true;
                } else {
                    this.LLILLL.LLJI = true;
                }
                this.LLILLL.T2().creativeModel.stickerModel.musicStickerLastState = false;
                this.LLILLL.i3();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final UrlModel W1(AVMusic aVMusic) {
        String picMedium;
        EnumC1419660n2y enumC1419660n2yLIZ;
        int i;
        UrlModel coverMedium;
        List<String> urlList;
        String picSmall;
        EnumC1419660n2y enumC1419660n2yLIZ2;
        int i2;
        UrlModel coverMedium2;
        List<String> urlList2;
        if (aVMusic == null) {
            aVMusic = MusicBeanUtilKt.extractAVMusic(T2().creativeModel.musicBuzModel);
        }
        if (aVMusic != null && (aVMusic.musicType == 3 || aVMusic.musicType == 0)) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C1697810uHb.LJ(aVMusic.getLocalThumbPath()));
            return urlModel;
        }
        Object obj = null;
        if (C113L.LIZ()) {
            if (aVMusic != null && (picSmall = aVMusic.getPicSmall()) != null && picSmall.length() != 0) {
                if (aVMusic != null && (enumC1419660n2yLIZ2 = C1418630n1J.LIZ(aVMusic)) != null && (i2 = C1419730n35.LIZ[enumC1419660n2yLIZ2.ordinal()]) != -1) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 == 3) {
                            UrlModel urlModel2 = new UrlModel();
                            String[] strArr = new String[1];
                            MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
                            if (matchedPGCSoundInfo != null && (coverMedium2 = matchedPGCSoundInfo.getCoverMedium()) != null && (urlList2 = coverMedium2.getUrlList()) != null) {
                                obj = ListProtector.get(urlList2, 0);
                            }
                            strArr[0] = obj;
                            urlModel2.setUrlList(C1697810uHb.LJ(strArr));
                            return urlModel2;
                        }
                        throw new C1954807lC();
                    }
                    UrlModel urlModel3 = new UrlModel();
                    urlModel3.setUrlList(C1697810uHb.LJ(aVMusic.getPicSmall()));
                    return urlModel3;
                }
                return new UrlModel();
            }
            return new UrlModel();
        }
        if (aVMusic != null && (picMedium = aVMusic.getPicMedium()) != null && picMedium.length() != 0) {
            if (aVMusic != null && (enumC1419660n2yLIZ = C1418630n1J.LIZ(aVMusic)) != null && (i = C1419730n35.LIZ[enumC1419660n2yLIZ.ordinal()]) != -1) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        UrlModel urlModel4 = new UrlModel();
                        String[] strArr2 = new String[1];
                        MatchedPGCSoundInfo matchedPGCSoundInfo2 = aVMusic.getMatchedPGCSoundInfo();
                        if (matchedPGCSoundInfo2 != null && (coverMedium = matchedPGCSoundInfo2.getCoverMedium()) != null && (urlList = coverMedium.getUrlList()) != null) {
                            obj = ListProtector.get(urlList, 0);
                        }
                        strArr2[0] = obj;
                        urlModel4.setUrlList(C1697810uHb.LJ(strArr2));
                        return urlModel4;
                    }
                    throw new C1954807lC();
                }
                UrlModel urlModel5 = new UrlModel();
                urlModel5.setUrlList(C1697810uHb.LJ(aVMusic.getPicMedium()));
                return urlModel5;
            }
            return new UrlModel();
        }
        return new UrlModel();
    }

    @Override // X.InterfaceC1459040o4U
    public void Bu(boolean z) {
        MusicStickerModel musicStickerModel;
        StickerModel stickerModelPX1 = pX1();
        if ((stickerModelPX1 instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModelPX1) != null) {
            InterfaceC391240FVq interfaceC391240FVqH2 = H2();
            if (interfaceC391240FVqH2 != null) {
                interfaceC391240FVqH2.k3(musicStickerModel.copy(musicStickerModel.baseStickerModel, z, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom), EnumC356070Dxd.COMMIT);
                return;
            }
            InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
            if (interfaceC1464960oE2G2 == null) {
                return;
            }
            interfaceC1464960oE2G2.J4(musicStickerModel.copy(musicStickerModel.baseStickerModel, z, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
        }
    }

    @Override // X.InterfaceC1459040o4U
    public void Qj(String str) {
        StickerModel stickerModelPX1 = pX1();
        if (stickerModelPX1 == null) {
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        if (interfaceC391240FVqH2 != null) {
            interfaceC391240FVqH2.LLILII(false, "", stickerModelPX1.getId(), C0FSX.BOTTOM, null, null, null, null, null);
            interfaceC391240FVqH2.XJ(stickerModelPX1.getId(), str, EnumC356070Dxd.COMMIT);
        } else {
            InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
            if (interfaceC1464960oE2G2 != null) {
                interfaceC1464960oE2G2.LLILII(false, "", stickerModelPX1.getId(), C0FSX.BOTTOM, null, null, null, null, null);
                interfaceC1464960oE2G2.Rd1(stickerModelPX1.getId(), str);
            }
        }
        this.LLIZLLLIL = false;
        this.LLIZ = null;
    }

    @Override // X.InterfaceC1459040o4U
    public void Rv1(BaseStickerModel baseStickerModel) {
        MusicStickerModel musicStickerModel;
        StickerModel stickerModelPX1 = pX1();
        if ((stickerModelPX1 instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModelPX1) != null) {
            Zu(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, baseStickerModel.getCenterX(), baseStickerModel.getCenterY(), 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY(), baseStickerModel.getScale(), baseStickerModel.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
        }
    }

    @Override // X.InterfaceC1459040o4U
    public void Zu(MusicStickerModel musicStickerModel) {
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        if (interfaceC391240FVqH2 != null) {
            interfaceC391240FVqH2.k3(musicStickerModel, EnumC356070Dxd.COMMIT);
            return;
        }
        InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
        if (interfaceC1464960oE2G2 == null) {
            return;
        }
        interfaceC1464960oE2G2.J4(musicStickerModel);
    }

    public final void c3(boolean z) {
        this.LLJILJILJ.LJIIJ(Boolean.valueOf(z));
    }

    public final void m3(AVMusic aVMusic) {
        MusicStickerModel musicStickerModel;
        StickerModel stickerModelPX1 = pX1();
        if ((stickerModelPX1 instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModelPX1) != null) {
            MusicStickerModel musicStickerModelLIZ = C1443950ng9.LIZ(T2().creativeModel, musicStickerModel.getStickerStyle(), aVMusic);
            if (musicStickerModelLIZ != null) {
                if (!Intrinsics.LJFF(musicStickerModel.getMusicId(), musicStickerModelLIZ.getMusicId())) {
                    C860620XpU.LIZ(T2());
                }
                Zu(musicStickerModel.copy(musicStickerModel.baseStickerModel, musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModelLIZ.getMusicId(), musicStickerModelLIZ.getArtistName(), musicStickerModelLIZ.getTitle(), W1(aVMusic), musicStickerModelLIZ.isPGC(), musicStickerModelLIZ.getStickerStyle(), musicStickerModel.musicStickerFrom));
                return;
            }
            Qj(null);
        }
    }

    @Override // X.InterfaceC1459040o4U
    public void zi(boolean z) {
        MusicStickerModel musicStickerModel;
        if (this.LLIZLLLIL) {
            return;
        }
        StickerModel stickerModelPX1 = pX1();
        if ((stickerModelPX1 instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModelPX1) != null) {
            if (z) {
                this.LLIZ = BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
                this.LLIZLLLIL = true;
            }
            InterfaceC391240FVq interfaceC391240FVqH2 = H2();
            if (interfaceC391240FVqH2 != null) {
                interfaceC391240FVqH2.k3(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148)), 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom), EnumC356070Dxd.COMMIT);
                return;
            }
            InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
            if (interfaceC1464960oE2G2 == null) {
                return;
            }
            interfaceC1464960oE2G2.J4(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148)), 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
        }
    }

    @Override // X.InterfaceC1459040o4U
    public void mU0(int i, boolean z) {
        String str;
        MusicStickerModel musicStickerModel;
        if (T2().creativeModel.stickerModel.musicStickerPreAdded) {
            T2().creativeModel.stickerModel.musicStickerEnterMethod = "sticker_panel";
            T2().creativeModel.stickerModel.musicStickerPreAdded = false;
            str = "2";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        StickerModel stickerModelPX1 = pX1();
        if ((stickerModelPX1 instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModelPX1) != null) {
            MusicStickerModel musicStickerModelLIZ = C1443950ng9.LIZ(T2().creativeModel, musicStickerModel.getStickerStyle(), null);
            if (musicStickerModelLIZ != null) {
                musicStickerModelLIZ.getBaseStickerModel().setStickerSource(str);
                Zu(musicStickerModel.copy(musicStickerModelLIZ.getBaseStickerModel(), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModelLIZ.getMusicId(), musicStickerModelLIZ.getArtistName(), musicStickerModelLIZ.getTitle(), W1(null), musicStickerModelLIZ.isPGC(), musicStickerModelLIZ.getStickerStyle(), musicStickerModel.musicStickerFrom));
                return;
            }
            Qj(null);
            return;
        }
        MusicStickerModel musicStickerModelLIZ2 = C1443950ng9.LIZ(T2().creativeModel, i, null);
        if (musicStickerModelLIZ2 == null) {
            return;
        }
        musicStickerModelLIZ2.getBaseStickerModel().setStickerSource(str);
        if (!z) {
            C860620XpU.LIZ(T2());
        }
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        if (interfaceC391240FVqH2 != null) {
            interfaceC391240FVqH2.f3(musicStickerModelLIZ2.copy(musicStickerModelLIZ2.baseStickerModel, musicStickerModelLIZ2.visible, musicStickerModelLIZ2.editable, musicStickerModelLIZ2.clickable, musicStickerModelLIZ2.musicId, musicStickerModelLIZ2.artistName, musicStickerModelLIZ2.title, W1(null), musicStickerModelLIZ2.isPGC, musicStickerModelLIZ2.stickerStyle, musicStickerModelLIZ2.musicStickerFrom), EnumC356070Dxd.COMMIT);
            if (z) {
                return;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1663030tNV(interfaceC391240FVqH2, this, null), 3);
            return;
        }
        InterfaceC1464960oE2 interfaceC1464960oE2G2 = G2();
        if (interfaceC1464960oE2G2 == null) {
            return;
        }
        interfaceC1464960oE2G2.f4(musicStickerModelLIZ2);
        if (z) {
            return;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1663040tNW(interfaceC1464960oE2G2, this, null), 3);
    }
}
