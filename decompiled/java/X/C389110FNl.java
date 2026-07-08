package X;

import Y.AObjectS238S0100000_2;
import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricTrimPointService;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389110FNl extends i<C0EJ0, C389250FNz, C389180FNs, C389160FNq> implements InterfaceC379610EuV, C0EJ0 {
    public static final C389130FNn LLLFF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final String LLLFZ;
    public final C366480EYk LLJILJILJ;
    public final VideoPublishEditModel LLJILLL;
    public final C1DRG LLJJ;
    public final C0EJ0 LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public Map<String, C09AE> LLJJJIL;
    public Map<String, C09AE> LLJJJJ;
    public final h0<ResourceItem> LLJJJJJIL;
    public final C385670FAf<ResourceItem> LLJJJJLIIL;
    public final C560530Lyd<C375830EoP<Unit>> LLJJL;
    public final LiveEvent<C375830EoP<Unit>> LLJJLIIIJLLLLLLLZ;
    public final h0<C375830EoP<Unit>> LLJL;
    public final C385670FAf<C375830EoP<Unit>> LLJLIL;
    public final h0<C375830EoP<Unit>> LLJLILLLLZIIL;
    public final C385670FAf<C375830EoP<Unit>> LLJLL;
    public final C560530Lyd<String> LLJLLIL;
    public final LiveEvent<String> LLJLLL;
    public ResourceItem LLJZ;
    public AnonymousClass0957<Boolean> LLJZIJLIL;
    public AnonymousClass0079 LLL;
    public String LLLF;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0FNn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C389110FNl.class, "dataApi", "getDataApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C389110FNl.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0), new C2217381BqS(C389110FNl.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C389110FNl.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C389110FNl.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        LLLFF = new Object() { // from class: X.0FNn
        };
        LLLFZ = "lyric_effect";
    }

    @Override // X.C0EJ0
    public void onBackPressed() {
    }

    private final ILyricTrimPointService C5() {
        return (ILyricTrimPointService) PluggableExtentionKt.pluggableSpi$default(ILyricTrimPointService.class, false, false, false, 14, null);
    }

    private final void F4() {
        MusicBuzModel musicBuzModel = (MusicBuzModel) C13LP.LJJJLZIJ(0, C1429680nJ8.LIZIZ(this.LLJILLL.creativeModel.musicBuzModel));
        String strLIZJ = musicBuzModel != null ? C1429680nJ8.LIZJ(musicBuzModel) : null;
        AnonymousClass0079 anonymousClass0079 = this.LLL;
        if (anonymousClass0079 == null || !anonymousClass0079.LIZ(strLIZJ)) {
            this.LLL = new AnonymousClass0079(strLIZJ, 6);
            this.LLJZIJLIL = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1391205cU(this, null), 3);
        }
    }

    private final void O4() {
        Iterator<Map.Entry<String, C09AE>> it2 = this.LLJJJIL.entrySet().iterator();
        while (it2.hasNext()) {
            C09AE value = it2.next().getValue();
            if (value != null && value.isActive()) {
                value.LIZIZ(null);
            }
        }
        this.LLJJJIL.clear();
        Iterator<Map.Entry<String, C09AE>> it3 = this.LLJJJJ.entrySet().iterator();
        while (it3.hasNext()) {
            C09AE value2 = it3.next().getValue();
            if (value2 != null && value2.isActive()) {
                value2.LIZIZ(null);
            }
        }
        this.LLJJJJ.clear();
    }

    private final void P4() {
        AnonymousClass0957<Boolean> anonymousClass0957 = this.LLJZIJLIL;
        if (anonymousClass0957 != null && anonymousClass0957.isActive()) {
            AnonymousClass0957<Boolean> anonymousClass09572 = this.LLJZIJLIL;
            if (anonymousClass09572 != null) {
                anonymousClass09572.LIZIZ(null);
            }
            this.LLJZIJLIL = null;
        }
        this.LLJZIJLIL = null;
    }

    private final void S6() {
        MusicBuzModel musicBuzModel = (MusicBuzModel) C13LP.LJJJLZIJ(0, C1429680nJ8.LIZIZ(this.LLJILLL.creativeModel.musicBuzModel));
        String strFC1 = k5().fC1(this.LLJILJILJ.LIZ, musicBuzModel != null ? C1429680nJ8.LIZJ(musicBuzModel) : null);
        if (strFC1 == null) {
            C201955140j.LIZJ(C563650M8t.LIZIZ, "trySelectLyricSlot failed find slotId failed");
        } else if (strFC1.length() == 0) {
            C201955140j.LIZJ(C563650M8t.LIZIZ, "trySelectLyricSlot failed find slotId empty");
        } else {
            this.LLJLLIL.LJIIIZ(strFC1);
        }
    }

    private final void T6() {
        InterfaceC1461350o8D interfaceC1461350o8DV5;
        C0EZ1 c0ez1WM2;
        boolean z = this.LLJILJILJ.LIZ;
        if (z || C1533950q1J.LJ(this.LLLF) || !k5().aL(z) || (interfaceC1461350o8DV5 = v5()) == null || (c0ez1WM2 = interfaceC1461350o8DV5.WM2()) == null) {
            return;
        }
        c0ez1WM2.pP2();
    }

    private final InterfaceC1457250o1b n5() {
        return (InterfaceC1457250o1b) this.LLJJIJI.getValue(this, LLLFFI[1]);
    }

    private final InterfaceC1455860nzM t5() {
        return (InterfaceC1455860nzM) this.LLJJJ.getValue(this, LLLFFI[4]);
    }

    private final InterfaceC1461350o8D v5() {
        return (InterfaceC1461350o8D) this.LLJJIJIL.getValue(this, LLLFFI[3]);
    }

    private final InterfaceC1413540mt6 x5() {
        return (InterfaceC1413540mt6) this.LLJJIJIIJIL.getValue(this, LLLFFI[2]);
    }

    public final void H5() {
        this.LLJJL.LJIIJ(new C375830EoP<>(Unit.LIZ));
    }

    public final boolean J6() {
        int size = ((ArrayList) C1429680nJ8.LIZIZ(this.LLJILLL.creativeModel.musicBuzModel)).size();
        return (size == 1 || (size > 1 && C1416310mxZ.LJJJJLI(this.LLJILLL))) && !this.LLJILJILJ.LIZ;
    }

    @Override // X.C0EJ0
    public void LIZ() {
        i3(new AwS584S0100000_5(this, 167));
        F4();
        this.LLLF = k5().VQ0(this.LLJILJILJ.LIZ);
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPanel lyricEffectResIdWhenEnter = ");
        sbLIZ.append(this.LLLF);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        VideoPublishEditModel videoPublishEditModel = this.LLJILLL;
        boolean z = this.LLJILJILJ.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("music_id", C0EZ7.LIZ(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("is_editor_pro", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("ttcrt_lyrics_panel_show", c0lab.LIZ);
    }

    public final void M5() {
        this.LLJJL.LJIIJ(new C375830EoP<>(Unit.LIZ));
    }

    public final void U5() {
        i3(AFwS234S0000000_5.get$arr$(112));
        O4();
        P4();
        i3(AFwS234S0000000_5.get$arr$(113));
    }

    public final void d6() {
        this.LLJL.LJII(new C375830EoP<>(Unit.LIZ));
    }

    public final InterfaceC366450EYh k5() {
        return (InterfaceC366450EYh) this.LLJJIII.getValue(this, LLLFFI[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C389180FNs> o2() {
        return new AwS549S0100000_5(this, 163);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C389160FNq> w2() {
        return new AwS549S0100000_5(this, 164);
    }

    @Override // X.C0EJ0
    public void xN0() {
        AnonymousClass0079 anonymousClass0079 = this.LLL;
        if (anonymousClass0079 != null) {
            MusicBuzModel musicBuzModel = (MusicBuzModel) C13LP.LJJJLL(C1429680nJ8.LIZIZ(this.LLJILLL.creativeModel.musicBuzModel));
            if (anonymousClass0079.LIZ(musicBuzModel != null ? C1429680nJ8.LIZJ(musicBuzModel) : null)) {
                C01TT.LIZLLL(new AwS546S0100000_2(this, 877));
                return;
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1391605cY(this, null), 3);
    }

    private final void K4() {
        k5().yS(this.LLJILJILJ.LIZ);
        i3(AFwS234S0000000_5.get$arr$(111));
    }

    private final boolean K6() {
        Object c098200Yq;
        InterfaceC1457250o1b interfaceC1457250o1bN5 = n5();
        if (interfaceC1457250o1bN5 == null) {
            return false;
        }
        try {
            interfaceC1457250o1bN5.LLLL(this.LLJILLL.getVideoLength());
            VideoPublishEditModel videoPublishEditModel = this.LLJILLL;
            MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
            if (musicObject != null) {
                interfaceC1457250o1bN5.oJ2(videoPublishEditModel.getVideoLength(), musicObject.duration);
            }
            AnonymousClass0079 anonymousClass0079 = this.LLL;
            interfaceC1457250o1bN5.LLLIIII(anonymousClass0079 != null ? anonymousClass0079.LIZIZ : null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m5exceptionOrNullimpl(c098200Yq) == null;
    }

    private final void N6() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMT5 = t5();
        if (interfaceC1455860nzMT5 == null || (liveDataG = interfaceC1455860nzMT5.g()) == null || (value = liveDataG.getValue()) == null) {
            return;
        }
        String strVQ0 = k5().VQ0(this.LLJILJILJ.LIZ);
        String str = this.LLLF;
        if (((str == null || str.length() == 0) && (strVQ0 == null || strVQ0.length() == 0)) || Intrinsics.LJFF(str, strVQ0)) {
            return;
        }
        C391360FWc.LIZLLL("", value, new AwS56S1000000_5((C1533950q1J.LJ(str) && (strVQ0 == null || strVQ0.length() == 0)) ? C0E1V.REMOVE_LYRIC_STICKER.getNameId() : ((str == null || str.length() == 0) && C1533950q1J.LJ(strVQ0)) ? C0E1V.ADD_LYRIC_STICKER.getNameId() : C0E1V.UPDATE_LYRIC_STYLE.getNameId(), 5));
    }

    private final void P6() {
        MutableLiveData<Boolean> mutableLiveDataFz0;
        InterfaceC1457250o1b interfaceC1457250o1bN5 = n5();
        if (interfaceC1457250o1bN5 != null) {
            interfaceC1457250o1bN5.Xv0(false);
        }
        InterfaceC1457250o1b interfaceC1457250o1bN52 = n5();
        if (interfaceC1457250o1bN52 != null) {
            interfaceC1457250o1bN52.ca(true);
        }
        InterfaceC1457250o1b interfaceC1457250o1bN53 = n5();
        if (interfaceC1457250o1bN53 != null) {
            interfaceC1457250o1bN53.gp1(LLLFZ);
        }
        InterfaceC1413540mt6 interfaceC1413540mt6X5 = x5();
        if (interfaceC1413540mt6X5 != null) {
            interfaceC1413540mt6X5.is0(true);
        }
        InterfaceC1461350o8D interfaceC1461350o8DV5 = v5();
        if (interfaceC1461350o8DV5 == null || (mutableLiveDataFz0 = interfaceC1461350o8DV5.fz0()) == null) {
            return;
        }
        mutableLiveDataFz0.setValue(Boolean.FALSE);
    }

    private final void Xi() {
        LiveEvent<Unit> liveEventZy0;
        k5().Hy0().observe(this, new AObserverS209S0100000_5(this, 17));
        k5().Sz2().observe(this, new AObserverS209S0100000_5(this, 18));
        k5().Qq2().LIZ(this, new AObjectS240S0100000_5(this, 25));
        InterfaceC1457250o1b interfaceC1457250o1bN5 = n5();
        if (interfaceC1457250o1bN5 == null || (liveEventZy0 = interfaceC1457250o1bN5.zy0()) == null) {
            return;
        }
        liveEventZy0.LIZ(this, new AObjectS238S0100000_2(this, 0));
    }

    public final void E5() {
        k5().NJ0(this.LLJILJILJ.LIZ);
        k5().LC1(true);
        if (this.LLJILJILJ.LIZ) {
            S6();
        }
    }

    public final void L6() {
        P6();
        if (!K6()) {
            this.LLJLILLLLZIIL.LJII(new C375830EoP<>(Unit.LIZ));
            return;
        }
        InterfaceC1457250o1b interfaceC1457250o1bN5 = n5();
        if (interfaceC1457250o1bN5 != null) {
            interfaceC1457250o1bN5.show();
        }
    }

    @Override // X.C0EJ0
    public void LIZLLL() {
        T6();
        N6();
        U5();
    }

    public final void S5() {
        k5().ow2();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1429680nJ8.LIZIZ(this.LLJILLL.creativeModel.musicBuzModel);
    }

    @Override // X.C0EJ0
    public C385670FAf<C375830EoP<Unit>> Xt0() {
        return this.LLJLL;
    }

    public C0EJ0 Z4() {
        return this.LLJJI;
    }

    public final C366480EYk d5() {
        return this.LLJILJILJ;
    }

    @Override // X.C0EJ0
    public C385670FAf<ResourceItem> f9() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LLJILLL;
    }

    @Override // X.C0EJ0
    public LiveEvent<String> oX0() {
        return this.LLJLLL;
    }

    @Override // X.C0EJ0
    public LiveEvent<C375830EoP<Unit>> v2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C0EJ0
    public C385670FAf<C375830EoP<Unit>> ye1() {
        return this.LLJLIL;
    }

    private final void H4(String str) {
        C09AE c09ae = this.LLJJJIL.get(str);
        if (c09ae != null && c09ae.isActive()) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJJJJ.get(str);
        if (c09ae2 != null && c09ae2.isActive()) {
            c09ae2.LIZIZ(null);
        }
        this.LLJJJIL.remove(str);
        this.LLJJJJ.remove(str);
    }

    public final void D5(AbstractC366540EYq abstractC366540EYq) {
        C01TT.LIZLLL(new AwS406S0200000_5(this, abstractC366540EYq, 24));
    }

    public final void N5(AbstractC366540EYq abstractC366540EYq) {
        C01TT.LIZLLL(new AwS406S0200000_5(this, abstractC366540EYq, 25));
    }

    public final void T4(Pair<? extends List<C0EQL>, C05WK> pair) {
        this.LLJJJJ.put(pair.getSecond().LIZIZ, C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C366470EYj(this, pair, null), 3));
    }

    @Override // X.C0EJ0
    public void gW(EnumC366550EYr enumC366550EYr) {
        boolean z;
        if (enumC366550EYr == EnumC366550EYr.STICKER_PANEL && !k5().aL(this.LLJILJILJ.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        i3(new AwS93S0110000_5(z, enumC366550EYr, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389110FNl.m6(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u6(X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C1391405cW
            if (r0 == 0) goto L20
            r4 = r12
            X.05cW r4 = (X.C1391405cW) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L5a
        L20:
            X.05cW r4 = new X.05cW
            r4.<init>(r11, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicService> r5 = com.ss.android.ugc.aweme.music.service.IMusicService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L63
            com.ss.android.ugc.aweme.music.service.IMusicService r0 = (com.ss.android.ugc.aweme.music.service.IMusicService) r0     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L44
            r0.LJJIIJ()     // Catch: java.lang.Throwable -> L63
        L44:
            if (r0 == 0) goto L4e
            boolean r0 = r0.LJJIL()     // Catch: java.lang.Throwable -> L63
            if (r0 != r2) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L5d
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r11.m6(r4)     // Catch: java.lang.Throwable -> L63
            if (r0 != r1) goto L5d
            return r1
        L5a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L63
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L63
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6f:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 != 0) goto L7a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L7a:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389110FNl.u6(X.05Vn):java.lang.Object");
    }

    public final void R5(int i, ResourceItem resourceItem, boolean z) {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.LLJILLL;
        boolean z2 = this.LLJILJILJ.LIZ;
        String resourceId = resourceItem.getResourceId();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("music_id", C0EZ7.LIZ(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_editor_pro", str);
        c0lab.LJ("resource_id", resourceId);
        C20684815ws.LJIILLIIL("ttcrt_select_lyrics_style", c0lab.LIZ);
        if (!z && !this.LLJILJILJ.LIZIZ) {
            return;
        }
        H4(resourceItem.getResourceId());
        if (!z) {
            K4();
            return;
        }
        this.LLJZ = resourceItem;
        this.LLJJJIL.put(resourceItem.getResourceId(), C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C366490EYl(this, resourceItem, null), 2));
    }

    public C389110FNl(C19A3 c19a3, C1DRG c1drg, C366480EYk c366480EYk, VideoPublishEditModel videoPublishEditModel) {
        super(c19a3);
        this.LLJILJILJ = c366480EYk;
        this.LLJILLL = videoPublishEditModel;
        this.LLJJ = c1drg;
        this.LLJJI = this;
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC366450EYh.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457250o1b.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJIL = new LinkedHashMap();
        this.LLJJJJ = new LinkedHashMap();
        h0<ResourceItem> h0Var = new h0<>(null);
        this.LLJJJJJIL = h0Var;
        this.LLJJJJLIIL = h0Var;
        C560530Lyd<C375830EoP<Unit>> c560530Lyd = new C560530Lyd<>();
        this.LLJJL = c560530Lyd;
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd;
        h0<C375830EoP<Unit>> h0Var2 = new h0<>(null);
        this.LLJL = h0Var2;
        this.LLJLIL = h0Var2;
        h0<C375830EoP<Unit>> h0Var3 = new h0<>(null);
        this.LLJLILLLLZIIL = h0Var3;
        this.LLJLL = h0Var3;
        C560530Lyd<String> c560530Lyd2 = new C560530Lyd<>();
        this.LLJLLIL = c560530Lyd2;
        this.LLJLLL = c560530Lyd2;
    }
}
