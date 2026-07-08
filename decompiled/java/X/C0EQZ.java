package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.util.LruCache;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricMiniDraftData;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService;
import com.ss.android.ugc.gamora.editor.lyric.api.LyricMiniDraftItemData;
import com.ss.android.ugc.gamora.editor.lyric.api.LyricMiniDraftRespData;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQZ extends AbstractC2255721DQs<InterfaceC366450EYh> implements InterfaceC366450EYh, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1DRG LL;
    public boolean LLJ;
    public BaseStickerModel LLJI;
    public volatile String LLJJIJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(720));
    public final Map<String, AnonymousClass0957<Pair<LyricMiniDraftData, C05WK>>> LLILLL = new LinkedHashMap();
    public final Map<String, AnonymousClass0957<C1425705i3>> LLILZ = new LinkedHashMap();
    public final InterfaceC383701eN LLILZIL = C2191201ApK.LIZ();
    public final C1427105iH LLILZLL = new LruCache<String, C1425705i3>() { // from class: X.05iH
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, C1425705i3 c1425705i3) {
            return 1;
        }
    };
    public final C1427005iG LLIZ = new LruCache<String, Pair<? extends List<? extends C0EQL>, ? extends C05WK>>() { // from class: X.05iG
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, Pair<? extends List<? extends C0EQL>, ? extends C05WK> pair) {
            return 1;
        }
    };
    public final LinkedHashMap<String, C0EQM> LLIZLLLIL = new LinkedHashMap<>();
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 162));
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EYP.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC366450EYh LLJJI = this;
    public final MutableLiveData<C189200o6<Pair<List<ResourceItem>, Boolean>>> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<AbstractC366540EYq> LLJJIJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJJIJIIJIL = new MutableLiveData<>();
    public final C560530Lyd<C375830EoP<AbstractC366540EYq>> LLJJJ = new C560530Lyd<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EQZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EQZ.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EQZ.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EQZ.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final String v5(boolean z) {
        return z ? "edit_pro_sound" : "edit_page_stickers";
    }

    @Override // X.InterfaceC366450EYh
    public void MT1() {
        this.LLJ = false;
        this.LLIZLLLIL.clear();
    }

    public final void t5() {
        LiveEvent<Unit> liveEventA4;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(false);
        if (interfaceC364330EQdH3 == null || (liveEventA4 = interfaceC364330EQdH3.A4()) == null) {
            return;
        }
        liveEventA4.LIZ(this, new AObjectS240S0100000_5(this, 24));
    }

    private final C0EYP B3() {
        return (C0EYP) this.LLJILLL.getValue(this, LLJJJIL[2]);
    }

    private final C348100Dkm e4() {
        return (C348100Dkm) this.LLJILJIL.getValue();
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJJJIL[3]);
    }

    private final InterfaceC1461350o8D v3() {
        return (InterfaceC1461350o8D) this.LLJILJILJ.getValue(this, LLJJJIL[1]);
    }

    public final InterfaceC1635390sev E3() {
        return (InterfaceC1635390sev) this.LLILLJJLI.getValue();
    }

    public final ILyricMiniDraftService O3() {
        return (ILyricMiniDraftService) PluggableExtentionKt.pluggableSpi$default(ILyricMiniDraftService.class, false, false, false, 14, null);
    }

    public final ILyricStickerEffectDownloadService m3() {
        return (ILyricStickerEffectDownloadService) PluggableExtentionKt.pluggableSpi$default(ILyricStickerEffectDownloadService.class, false, false, false, 14, null);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Iterator<Map.Entry<String, AnonymousClass0957<Pair<LyricMiniDraftData, C05WK>>>> it2 = this.LLILLL.entrySet().iterator();
        while (it2.hasNext()) {
            AnonymousClass0957<Pair<LyricMiniDraftData, C05WK>> value = it2.next().getValue();
            if (value.isActive()) {
                value.LIZIZ(null);
            }
        }
        this.LLILLL.clear();
        MT1();
        super.onDestroy();
    }

    public final InterfaceC1455860nzM q3() {
        return (InterfaceC1455860nzM) this.LLJIJIL.getValue(this, LLJJJIL[0]);
    }

    public final void K4() {
        C348100Dkm c348100DkmE4;
        VideoPublishEditModel editModel;
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        NLEEditor nLEEditor;
        NLEModel model;
        CreativeModel creativeModel2;
        StickerNewEngineModel stickerNewEngineModel2;
        VideoPublishEditModel editModel2 = getEditModel();
        boolean z = true;
        if ((editModel2 == null || (creativeModel2 = editModel2.creativeModel) == null || (stickerNewEngineModel2 = creativeModel2.stickerModel) == null || !(!stickerNewEngineModel2.lyricStickerModels.isEmpty())) && (((c348100DkmE4 = e4()) == null || (nLEEditor = c348100DkmE4.LIZ) == null || (model = nLEEditor.getModel()) == null || !C351220Dpo.LLFFF(model)) && ((editModel = getEditModel()) == null || (creativeModel = editModel.creativeModel) == null || (stickerNewEngineModel = creativeModel.stickerModel) == null || !Intrinsics.LJFF(stickerNewEngineModel.globalLyricToggleState, Boolean.TRUE)))) {
            z = false;
        }
        LC1(z);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Void> liveDataWw2;
        super.onCreate();
        InterfaceC1455860nzM interfaceC1455860nzMQ3 = q3();
        if (interfaceC1455860nzMQ3 == null || (liveDataWw2 = interfaceC1455860nzMQ3.ww2()) == null) {
            return;
        }
        liveDataWw2.observe(this, new AObserverS209S0100000_5(this, 16));
    }

    @Override // X.InterfaceC366450EYh
    public void ow2() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1427205iI(this, null), 2);
    }

    @Override // X.InterfaceC366450EYh
    public LiveData<C189200o6<Pair<List<ResourceItem>, Boolean>>> Hy0() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC366450EYh
    public LiveEvent<C375830EoP<AbstractC366540EYq>> Qq2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC366450EYh
    public LiveData<AbstractC366540EYq> Sz2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC366450EYh i3() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC366450EYh
    public LiveData<Boolean> q72() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC366450EYh
    public String x41() {
        return this.LLJJIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.05iH] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.05iG] */
    public C0EQZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void C5(boolean z) {
        LyricStickerModel lyricStickerModel;
        BaseStickerModel baseStickerModel;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 != null && (lyricStickerModel = (LyricStickerModel) C13LP.LJJJLL(interfaceC364330EQdH3.i4())) != null && (baseStickerModel = lyricStickerModel.getBaseStickerModel()) != null) {
            this.LLJI = baseStickerModel;
        }
    }

    private final InterfaceC364330EQd H3(boolean z) {
        C385670FAf<C0EHC> c385670FAfUy1;
        if (z) {
            C0EYP c0eypB3 = B3();
            if (c0eypB3 == null || (c385670FAfUy1 = c0eypB3.uy1()) == null) {
                return null;
            }
            return c385670FAfUy1.LIZJ();
        }
        InterfaceC1461350o8D interfaceC1461350o8DV3 = v3();
        if (interfaceC1461350o8DV3 == null) {
            return null;
        }
        return interfaceC1461350o8DV3.WM2();
    }

    private final void n5(Pair<? extends List<C0EQL>, C05WK> pair) {
        if (!this.LLJ) {
            return;
        }
        List<C0EQL> first = pair.getFirst();
        C05WK second = pair.getSecond();
        if (first != null) {
            for (C0EQL c0eql : first) {
                String strX1 = X1(c0eql.LIZLLL, c0eql.LIZIZ, c0eql.LIZJ);
                if (strX1 != null) {
                    this.LLIZLLLIL.put(strX1, new C0EQM(c0eql, second));
                }
            }
        }
    }

    private final void o4(boolean z) {
        if (!z) {
            this.LLJI = null;
        }
    }

    private final void x5(boolean z) {
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && (creativeModel = editModel.creativeModel) != null && (stickerNewEngineModel = creativeModel.stickerModel) != null) {
            stickerNewEngineModel.globalLyricToggleState = Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        return com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, 0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G2(X.InterfaceC1364105Vn<? super com.ss.ugc.android.editor.base.resource.ResourceItem> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1427505iL
            if (r0 == 0) goto L80
            r4 = r7
            X.05iL r4 = (X.C1427505iL) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L74
            if (r1 != r0) goto L8b
            X.C155000ia.LIZIZ(r2)
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r2 = r2.m10unboximpl()
        L28:
            X.01GW r0 = X.C384090F4d.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.gamora.editor.experiment.LyricsEffectConfig r0 = (com.ss.android.ugc.gamora.editor.experiment.LyricsEffectConfig) r0
            java.lang.String r5 = r0.getDefaultApplyResId()
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r2)
            r1 = 0
            if (r0 != 0) goto L73
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r4 = r2.getFirst()
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L73
            r3 = 0
            if (r5 == 0) goto L86
            int r0 = r5.length()
            if (r0 == 0) goto L86
            java.util.Iterator r2 = r4.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r0
            java.lang.String r0 = r0.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L56
            if (r1 != 0) goto L73
        L6f:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
        L73:
            return r1
        L74:
            X.C155000ia.LIZIZ(r2)
            r4.LLILLL = r0
            java.lang.Object r2 = r6.O4(r4)
            if (r2 != r3) goto L28
            return r3
        L80:
            X.05iL r4 = new X.05iL
            r4.<init>(r6, r7)
            goto L12
        L86:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            return r1
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQZ.G2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC366450EYh
    public void LC1(boolean z) {
        x5(z);
        if (!Intrinsics.LJFF(this.LLJJIJIIJIL.getValue(), Boolean.valueOf(z))) {
            this.LLJJIJIIJIL.postValue(Boolean.valueOf(z));
        }
        o4(z);
    }

    @Override // X.InterfaceC366450EYh
    public void NJ0(boolean z) {
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 != null) {
            interfaceC364330EQdH3.e1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O4(X.InterfaceC1364105Vn<? super X.C189200o6<? extends kotlin.Pair<? extends java.util.List<? extends com.ss.ugc.android.editor.base.resource.ResourceItem>, java.lang.Boolean>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1427405iK
            if (r0 == 0) goto L56
            r4 = r6
            X.05iK r4 = (X.C1427405iK) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L5c
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r0 = r2.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            r4.LLILLL = r1
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r1, r0)
            r2.LJIJJ()
            X.0sev r1 = r5.E3()
            X.05iJ r0 = new X.05iJ
            r0.<init>()
            X.C365370EUd.LIZJ(r1, r0)
            java.lang.Object r2 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L53
            X.C099Q.LIZJ(r4)
        L53:
            if (r2 != r3) goto L22
            return r3
        L56:
            X.05iK r4 = new X.05iK
            r4.<init>(r5, r6)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQZ.O4(X.05Vn):java.lang.Object");
    }

    public final Pair<Long, Long> Q3(NLETrackSlot nLETrackSlot) {
        long timeClipStart;
        Long lValueOf;
        long measuredEndTime;
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast != null) {
            timeClipStart = nLESegmentAudioDynamicCast.getTimeClipStart();
        } else {
            timeClipStart = 0;
        }
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = timeClipStart / j;
        if (nLESegmentAudioDynamicCast != null) {
            lValueOf = Long.valueOf(nLESegmentAudioDynamicCast.getTimeClipEnd());
        } else {
            lValueOf = null;
        }
        if (C08A4.LIZIZ(lValueOf)) {
            measuredEndTime = nLESegmentAudioDynamicCast.getTimeClipEnd() / j;
        } else {
            measuredEndTime = (nLETrackSlot.getMeasuredEndTime() - nLETrackSlot.getMeasuredStartTime()) / j;
        }
        return new Pair<>(Long.valueOf(j2), Long.valueOf(measuredEndTime));
    }

    @Override // X.InterfaceC366450EYh
    public String VQ0(boolean z) {
        List<LyricStickerModel> listI4;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 == null || (listI4 = interfaceC364330EQdH3.i4()) == null) {
            listI4 = C13BV.INSTANCE;
        }
        LyricStickerModel lyricStickerModel = (LyricStickerModel) C13LP.LJJJLL(listI4);
        if (lyricStickerModel != null) {
            return lyricStickerModel.getResourceId();
        }
        return null;
    }

    @Override // X.InterfaceC366450EYh
    public void ZJ2(String str) {
        this.LLJJIJIL = str;
    }

    @Override // X.InterfaceC366450EYh
    public boolean aL(boolean z) {
        List<LyricStickerModel> listI4;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 == null || (listI4 = interfaceC364330EQdH3.i4()) == null) {
            listI4 = C13BV.INSTANCE;
        }
        return !listI4.isEmpty();
    }

    @Override // X.InterfaceC366450EYh
    public void bA(boolean z) {
        InterfaceC1455860nzM interfaceC1455860nzMQ3;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        LyricStickerModel lyricStickerModel;
        C348100Dkm c348100DkmE4;
        INLEMediaSession iNLEMediaSession;
        NLEModel dataSource;
        List<NLETrack> listLJJLIIIJ;
        Object next;
        Iterable slots;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 != null && (interfaceC1455860nzMQ3 = q3()) != null && (liveDataG = interfaceC1455860nzMQ3.g()) != null && (value = liveDataG.getValue()) != null && (lyricStickerModel = (LyricStickerModel) C13LP.LJJJLL(interfaceC364330EQdH3.i4())) != null && (c348100DkmE4 = e4()) != null && (iNLEMediaSession = c348100DkmE4.LIZIZ) != null && (dataSource = iNLEMediaSession.getDataSource()) != null && (listLJJLIIIJ = C351220Dpo.LJJLIIIJ(dataSource)) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : listLJJLIIIJ) {
                if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(C351220Dpo.LJJLI((NLETrackSlot) next), lyricStickerModel.getMusicId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
            if (nLETrackSlot == null) {
                return;
            }
            C391360FWc.LIZLLL("", value, new AwS103S0400000_5(this, nLETrackSlot, interfaceC364330EQdH3, lyricStickerModel, 0));
        }
    }

    @Override // X.InterfaceC366450EYh
    public String gA1(boolean z) {
        List<LyricStickerModel> listI4;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 == null || (listI4 = interfaceC364330EQdH3.i4()) == null) {
            listI4 = C13BV.INSTANCE;
        }
        LyricStickerModel lyricStickerModel = (LyricStickerModel) C13LP.LJJJLL(listI4);
        if (lyricStickerModel != null) {
            return lyricStickerModel.getMusicId();
        }
        return null;
    }

    @Override // X.InterfaceC366450EYh
    public void jV(boolean z) {
        x5(z);
        if (!Intrinsics.LJFF(this.LLJJIJIIJIL.getValue(), Boolean.valueOf(z))) {
            this.LLJJIJIIJIL.setValue(Boolean.valueOf(z));
        }
        o4(z);
    }

    @Override // X.InterfaceC366450EYh
    public void l71(List<LyricStickerModel> list) {
        this.LLJ = true;
        this.LLIZLLLIL.clear();
        for (LyricStickerModel lyricStickerModel : list) {
            C0EQM c0eqmC3 = c3(lyricStickerModel.getResourceId(), lyricStickerModel.getMusicId(), lyricStickerModel.getLyricId());
            if (c0eqmC3 != null) {
                C0EQL c0eql = c0eqmC3.LIZ;
                String strX1 = X1(c0eql.LIZLLL, c0eql.LIZIZ, c0eql.LIZJ);
                if (strX1 != null) {
                    this.LLIZLLLIL.put(strX1, c0eqmC3);
                }
            }
        }
    }

    public final boolean o2(boolean z) {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null || (creativeModel = editModel.creativeModel) == null || (musicBuzModel = creativeModel.musicBuzModel) == null || !C1458070o2v.LJ(musicBuzModel)) {
            return true;
        }
        String strLIZJ = C1429680nJ8.LIZJ(musicBuzModel);
        if (strLIZJ.length() == 0) {
            return true;
        }
        return kC(strLIZJ, true, z);
    }

    @Override // X.InterfaceC366450EYh
    public boolean wH0(boolean z) {
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 == null) {
            return false;
        }
        return interfaceC364330EQdH3.D1();
    }

    @Override // X.InterfaceC366450EYh
    public void yS(boolean z) {
        C5(z);
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z);
        if (interfaceC364330EQdH3 != null) {
            interfaceC364330EQdH3.r(EnumC356070Dxd.COMMIT);
        }
    }

    private final C1425705i3 T2(List<String> list, C1425705i3 c1425705i3) {
        LyricMiniDraftRespData data;
        List<LyricMiniDraftItemData> list2;
        LyricMiniDraftRespData lyricMiniDraftRespData = null;
        if (c1425705i3 == null || (data = c1425705i3.getData()) == null || (list2 = data.miniDraftList) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<LyricMiniDraftItemData> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    LyricMiniDraftItemData next = it2.next();
                    if (Intrinsics.LJFF(next.musicId, str)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        C1425705i3 c1425705i32 = new C1425705i3();
        if (c1425705i3.getData() != null) {
            lyricMiniDraftRespData = new LyricMiniDraftRespData(arrayList);
        }
        c1425705i32.setData(lyricMiniDraftRespData);
        return c1425705i32;
    }

    private final void z4(boolean z, String str) {
        C375830EoP<AbstractC366540EYq> c375830EoP;
        C560530Lyd<C375830EoP<AbstractC366540EYq>> c560530Lyd = this.LLJJJ;
        if (z) {
            c375830EoP = new C375830EoP<>(new C366520EYo(str, null));
        } else {
            c375830EoP = new C375830EoP<>(new C366510EYn(str));
        }
        c560530Lyd.LJIIIZ(c375830EoP);
    }

    @Override // X.InterfaceC366450EYh
    public void US1(boolean z, String str) {
        InterfaceC364330EQd interfaceC364330EQdH3;
        C5(z);
        if (str.length() != 0 && (interfaceC364330EQdH3 = H3(z)) != null) {
            interfaceC364330EQdH3.B1(str, EnumC356070Dxd.COMMIT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<List<C0EQL>, C05WK> W1(Pair<? extends List<C0EQL>, C05WK> pair, String str) {
        if (pair != 0 && str != null && str.length() != 0) {
            List list = (List) pair.getFirst();
            Object second = pair.getSecond();
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C0EQL.LIZ((C0EQL) it2.next(), null, str, 31));
                }
                arrayList = arrayList2;
            }
            return new Pair<>(arrayList, second);
        }
        return pair;
    }

    public final C1425705i3 W2(List<? extends AVMusic> list, C1425705i3 c1425705i3) {
        LyricMiniDraftRespData data;
        List<LyricMiniDraftItemData> list2;
        String musicId;
        LyricMiniDraftRespData lyricMiniDraftRespData = null;
        if (c1425705i3 == null || (data = c1425705i3.getData()) == null || (list2 = data.miniDraftList) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AVMusic aVMusic : list) {
            Iterator<LyricMiniDraftItemData> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    LyricMiniDraftItemData next = it2.next();
                    String str = next.musicId;
                    if (aVMusic != null) {
                        musicId = aVMusic.getMusicId();
                    } else {
                        musicId = null;
                    }
                    if (Intrinsics.LJFF(str, musicId)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        C1425705i3 c1425705i32 = new C1425705i3();
        if (c1425705i3.getData() != null) {
            lyricMiniDraftRespData = new LyricMiniDraftRespData(arrayList);
        }
        c1425705i32.setData(lyricMiniDraftRespData);
        return c1425705i32;
    }

    public final String Z1(String str, List<? extends AVMusic> list) {
        List listLJJJJLI = C13LP.LJJJJLI(list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
        while (it2.hasNext()) {
            String musicId = ((AVMusic) it2.next()).getMusicId();
            if (musicId != null) {
                arrayList.add(musicId);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return String.valueOf((str + '#' + C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62)).hashCode());
    }

    @Override // X.InterfaceC366450EYh
    public String fC1(boolean z, String str) {
        boolean z2;
        InterfaceC364330EQd interfaceC364330EQdH3;
        List<LyricStickerModel> listI4;
        LyricStickerModel next;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || (interfaceC364330EQdH3 = H3(z)) == null || (listI4 = interfaceC364330EQdH3.i4()) == null || listI4.isEmpty()) {
            return null;
        }
        Iterator<LyricStickerModel> it2 = listI4.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getMusicId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LyricStickerModel lyricStickerModel = next;
        if (lyricStickerModel == null) {
            return null;
        }
        return lyricStickerModel.getUuid();
    }

    private final String X1(String str, String str2, String str3) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0 || str3 == null || str3.length() <= 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(str2);
        sbLIZ.append('#');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final C0EQM c3(String str, String str2, String str3) {
        Object next;
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0) {
            Iterator<T> it2 = snapshot().values().iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                List list = (List) pair.getFirst();
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            C0EQL c0eql = (C0EQL) next;
                            if (Intrinsics.LJFF(c0eql.LIZLLL, str) && Intrinsics.LJFF(c0eql.LIZIZ, str2) && Intrinsics.LJFF(c0eql.LIZJ, str3)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C0EQL c0eql2 = (C0EQL) next;
                    if (c0eql2 != null) {
                        return new C0EQM(c0eql2, (C05WK) pair.getSecond());
                    }
                }
            }
        }
        return null;
    }

    public final void F4(boolean z, String str, Pair<? extends List<C0EQL>, C05WK> pair) {
        AbstractC366540EYq c366510EYn;
        MutableLiveData<AbstractC366540EYq> mutableLiveData = this.LLJJIJI;
        if (z) {
            c366510EYn = new C366520EYo(str, pair);
        } else {
            c366510EYn = new C366510EYn(str);
        }
        mutableLiveData.postValue(c366510EYn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H2(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.ugc.android.editor.base.resource.ResourceItem> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1427605iM
            if (r0 == 0) goto L71
            r4 = r8
            X.05iM r4 = (X.C1427605iM) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L61
            if (r1 != r0) goto L78
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r1 = r3.m10unboximpl()
        L2c:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            r4 = 0
            if (r0 != 0) goto L77
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.ugc.android.editor.base.resource.ResourceItem r1 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r1
            java.lang.String r0 = r1.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 != 0) goto L60
            java.lang.String r0 = r1.getEffectId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L3f
        L60:
            return r2
        L61:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r0
            java.lang.Object r1 = r5.O4(r4)
            if (r1 != r2) goto L2c
            return r2
        L71:
            X.05iM r4 = new X.05iM
            r4.<init>(r5, r8)
            goto L12
        L77:
            return r4
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQZ.H2(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object k5(String str, List<? extends AVMusic> list, InterfaceC1364105Vn<? super AnonymousClass0957<C1425705i3>> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1425505i1(this, str, list, null), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC366450EYh
    public boolean kC(String str, boolean z, boolean z2) {
        INLEMediaSession iNLEMediaSession;
        NLEModel dataSource;
        List<NLETrackSlot> listLJ;
        LyricStickerModel lyricStickerModel;
        InterfaceC364330EQd interfaceC364330EQdH3 = H3(z2);
        if (interfaceC364330EQdH3 == null) {
            return false;
        }
        boolean z3 = true;
        if (!z) {
            List<LyricStickerModel> listI4 = interfaceC364330EQdH3.i4();
            if (listI4 == null || listI4.isEmpty()) {
                return false;
            }
            Iterator it2 = C13LP.LJJJJIZL(listI4, 1).iterator();
            while (it2.hasNext()) {
                String uuid = ((LyricStickerModel) it2.next()).getUuid();
                if (uuid == null) {
                    uuid = "";
                }
                interfaceC364330EQdH3.g3(uuid, EnumC356070Dxd.NONE);
            }
            return true;
        }
        C348100Dkm c348100DkmE4 = e4();
        if (c348100DkmE4 == null || (iNLEMediaSession = c348100DkmE4.LIZIZ) == null || (dataSource = iNLEMediaSession.getDataSource()) == null || (listLJ = C349930Dnj.LJ(dataSource, str)) == null || listLJ.isEmpty()) {
            return false;
        }
        List<NLETrackSlot> listLJJJJIZL = C13LP.LJJJJIZL(listLJ, 1);
        List<LyricStickerModel> listI42 = interfaceC364330EQdH3.i4();
        if (listI42 == null || (lyricStickerModel = (LyricStickerModel) C13LP.LJJJLL(listI42)) == null) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : listLJJJJIZL) {
            Pair<Long, Long> pairQ3 = Q3(nLETrackSlot);
            long jLongValue = pairQ3.getFirst().longValue();
            long jLongValue2 = pairQ3.getSecond().longValue();
            BaseStickerModel baseStickerModel = lyricStickerModel.getBaseStickerModel();
            long startTime = nLETrackSlot.getStartTime();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startTime / j, nLETrackSlot.getEndTime() / j, false, nLETrackSlot.getMeasuredStartTime() / j, nLETrackSlot.getMeasuredEndTime() / j, false, 0.0f, null, null, null, false, -905969666, 15, null);
            List<TextStickerModel> textStickerModels = lyricStickerModel.getTextStickerModels();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(textStickerModels, 10));
            Iterator<TextStickerModel> it3 = textStickerModels.iterator();
            while (it3.hasNext()) {
                arrayList.add(TextStickerModel.copy$default(it3.next(), null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -3, 65535, null));
            }
            interfaceC364330EQdH3.h1(lyricStickerModel.copy(baseStickerModelCopy$default, null, jLongValue, jLongValue2, lyricStickerModel.musicId, lyricStickerModel.lyricId, lyricStickerModel.musicName, lyricStickerModel.lyricStyleUrs, lyricStickerModel.selectedFrom, lyricStickerModel.lyricStyleEffectId, lyricStickerModel.recommendWidth, lyricStickerModel.recommendHeight, lyricStickerModel.initialTrimInfo, new ArrayList(arrayList), lyricStickerModel.fallbackFonts, lyricStickerModel.enabled), EnumC356070Dxd.NONE);
            z3 = true;
        }
        return z3;
    }

    @Override // X.InterfaceC366450EYh
    public C0EQM pv2(String str, String str2, String str3) {
        C0EQM c0eqm;
        String strX1 = X1(str, str2, str3);
        if (strX1 != null && (c0eqm = this.LLIZLLLIL.get(strX1)) != null) {
            return c0eqm;
        }
        return c3(str, str2, str3);
    }

    public final List<C0EQL> w2(List<LyricMiniDraftItemData> list, List<? extends AVMusic> list2, C05WK c05wk) {
        AVMusic next;
        String str;
        String musicId;
        ILyricMiniDraftService iLyricMiniDraftServiceO3 = O3();
        if (iLyricMiniDraftServiceO3 == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<LyricMiniDraftItemData> arrayList = new ArrayList();
        for (LyricMiniDraftItemData lyricMiniDraftItemData : list) {
            LyricMiniDraftItemData lyricMiniDraftItemData2 = lyricMiniDraftItemData;
            if (lyricMiniDraftItemData2 != null && C1533950q1J.LJ(lyricMiniDraftItemData2.miniDraft)) {
                arrayList.add(lyricMiniDraftItemData);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (LyricMiniDraftItemData lyricMiniDraftItemData3 : arrayList) {
            String str2 = lyricMiniDraftItemData3.musicId;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = lyricMiniDraftItemData3.lyricId;
            if (str4 == null) {
                str4 = "";
            }
            Iterator<? extends AVMusic> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AVMusic aVMusic = next;
                    if (aVMusic != null) {
                        musicId = aVMusic.getMusicId();
                    } else {
                        musicId = null;
                    }
                    if (Intrinsics.LJFF(musicId, lyricMiniDraftItemData3.musicId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AVMusic aVMusic2 = next;
            if (aVMusic2 == null || (str = aVMusic2.musicName) == null) {
                str = "";
            }
            String str5 = lyricMiniDraftItemData3.resourceId;
            if (str5 != null) {
                str3 = str5;
            }
            arrayList2.add(new C0EQL(str, str2, str4, str3, iLyricMiniDraftServiceO3.LIZJ(c05wk, lyricMiniDraftItemData3.miniDraft)));
        }
        return arrayList2;
    }

    public final Object P4(ResourceItem resourceItem, List<? extends AVMusic> list, C1426205i8 c1426205i8, InterfaceC1364105Vn<? super Pair<? extends List<C0EQL>, C05WK>> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1425105hx(resourceItem, this, c1426205i8, list, null), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC366450EYh
    public Object Uu0(boolean z, List<? extends AVMusic> list, String str, InterfaceC1364105Vn<? super Pair<? extends List<C0EQL>, C05WK>> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1425805i4(this, str, list, null), interfaceC1364105Vn);
    }

    public static final void Z4(C0EQZ c0eqz, InterfaceC364330EQd interfaceC364330EQd, LyricStickerModel lyricStickerModel, C348100Dkm c348100Dkm, EnumC356070Dxd enumC356070Dxd) {
        EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
        if (enumC356070Dxd != enumC356070Dxd2) {
            enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
        }
        interfaceC364330EQd.x1(lyricStickerModel, enumC356070Dxd2);
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C350410DoV.LIZLLL(c348100Dkm.LIZ, true, C051R.LIZIZ(new C0E1X(C0E1V.EDIT_STICKER.getNameId(), null, null, null, null, 30)), false, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // X.InterfaceC366450EYh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N82(boolean r104, kotlin.Pair<? extends java.util.List<X.C0EQL>, X.C05WK> r105, boolean r106, X.C1426205i8 r107, X.InterfaceC1364105Vn<? super java.lang.Boolean> r108) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQZ.N82(boolean, kotlin.Pair, boolean, X.05i8, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // X.InterfaceC366450EYh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object yQ0(boolean r11, kotlin.Pair<? extends java.util.List<X.C0EQL>, X.C05WK> r12, boolean r13, X.C1426205i8 r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C1431105iv
            r4 = r10
            if (r0 == 0) goto L4d
            r9 = r15
            X.05iv r9 = (X.C1431105iv) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r9.LLILZ = r2
        L13:
            java.lang.Object r3 = r9.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L53
            X.05WK r0 = r9.LL
            X.C155000ia.LIZIZ(r3)
        L25:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            java.lang.String r0 = r0.LIZIZ
            r4.z4(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L35:
            X.C155000ia.LIZIZ(r3)
            r6 = r12
            java.lang.Object r0 = r6.getSecond()
            X.05WK r0 = (X.C05WK) r0
            r9.LL = r0
            r9.LLILZ = r1
            r8 = r14
            r7 = r13
            r5 = r11
            java.lang.Object r3 = r4.N82(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L25
            return r2
        L4d:
            X.05iv r9 = new X.05iv
            r9.<init>(r4, r15)
            goto L13
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQZ.yQ0(boolean, kotlin.Pair, boolean, X.05i8, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC366450EYh
    public Object nG1(boolean z, List<? extends AVMusic> list, String str, String str2, C05WF c05wf, InterfaceC1364105Vn<? super Pair<? extends List<C0EQL>, C05WK>> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1425905i5(this, str, list, c05wf, str2, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    @Override // X.InterfaceC366450EYh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x12(boolean r18, java.util.List<? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic> r19, com.ss.ugc.android.editor.base.resource.ResourceItem r20, java.lang.String r21, X.C05WF r22, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<X.C0EQL>, X.C05WK>> r23) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQZ.x12(boolean, java.util.List, com.ss.ugc.android.editor.base.resource.ResourceItem, java.lang.String, X.05WF, X.05Vn):java.lang.Object");
    }
}
