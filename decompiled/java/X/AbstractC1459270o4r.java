package X;

import Y.AObjectS245S0100000_22;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS10S0000001_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0o4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1459270o4r extends i<InterfaceC1418580n1E, C2248481CzW, C1459370o51, C1461510o8T> implements InterfaceC1418580n1E, InterfaceC379610EuV, InterfaceC1166920gTK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final C1DRG LLJILJILJ;
    public final Function0<C1459370o51> LLJILLL;
    public final Function0<C1461510o8T> LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public float LLJZIJLIL;
    public final C560530Lyd<Pair<Integer, Integer>> LLL;
    public final LiveEvent<Pair<Integer, Integer>> LLLF;
    public final C560530Lyd<Boolean> LLLFF;
    public final LiveEvent<Boolean> LLLFFI;
    public final C560530Lyd<Boolean> LLLFZ;
    public final LiveEvent<Boolean> LLLI;
    public final C1459430o57 LLLII;
    public boolean LLLIIII;

    public abstract boolean F4();

    public abstract boolean H4();

    public abstract void K4(VEVolumeChangeOp vEVolumeChangeOp);

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1459270o4r.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1459270o4r.class, "rememberLastSelectMusicApi", "getRememberLastSelectMusicApi()Lcom/ss/android/ugc/gamora/editor/music/RememberLastSelectMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AbstractC1459270o4r.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AbstractC1459270o4r.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AbstractC1459270o4r.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(AbstractC1459270o4r.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(AbstractC1459270o4r.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(AbstractC1459270o4r.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(AbstractC1459270o4r.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(AbstractC1459270o4r.class, "audioCopyRightDistributeApi", "getAudioCopyRightDistributeApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AudioCopyRightDistributeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(AbstractC1459270o4r.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(AbstractC1459270o4r.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(AbstractC1459270o4r.class, "autoPlayAPI", "getAutoPlayAPI()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(AbstractC1459270o4r.class, "silentAutoCaptionApi", "getSilentAutoCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SilentAutoCaptionApiComponent;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14};
    }

    private final InterfaceC559500Lwy C5() {
        return (InterfaceC559500Lwy) this.LLJJL.getValue(this, LLLIIIIL[10]);
    }

    private final InterfaceC1453200nv4 D5() {
        return (InterfaceC1453200nv4) this.LLJJI.getValue(this, LLLIIIIL[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L6() {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1459270o4r.L6():void");
    }

    private final InterfaceC1455610nyx M5() {
        return (InterfaceC1455610nyx) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIIIIL[11]);
    }

    private final InterfaceC377540ErA N5() {
        return (InterfaceC377540ErA) this.LLJJIJI.getValue(this, LLLIIIIL[2]);
    }

    private final InterfaceC1413540mt6 R5() {
        return (InterfaceC1413540mt6) this.LLJJJJ.getValue(this, LLLIIIIL[7]);
    }

    private final InterfaceC1459480o5C d6() {
        return (InterfaceC1459480o5C) this.LLJJIII.getValue(this, LLLIIIIL[1]);
    }

    private final void k5() {
        if (((Boolean) Z1(new C2217381BqS() { // from class: X.0o4u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJFF);
            }
        }).LIZJ()).booleanValue() && F4()) {
            int i = this.LLJLL;
            int iLIZ = C273400Ana.LIZ(this.LLJLLIL);
            if (1 <= i && i < iLIZ) {
                i = iLIZ;
            }
            if (i != this.LLJLL) {
                this.LLJLL = i;
                s7((i * 1.0f) / 100, true);
            }
        }
    }

    private final InterfaceC1455620nyy m6() {
        return (InterfaceC1455620nyy) this.LLJLIL.getValue(this, LLLIIIIL[13]);
    }

    private final InterfaceC1417120mys n5() {
        return (InterfaceC1417120mys) this.LLJJJJLIIL.getValue(this, LLLIIIIL[9]);
    }

    private final InterfaceC372160EiU t5() {
        return (InterfaceC372160EiU) this.LLJL.getValue(this, LLLIIIIL[12]);
    }

    private final InterfaceC1455850nzL v5() {
        return (InterfaceC1455850nzL) this.LLJJJIL.getValue(this, LLLIIIIL[6]);
    }

    private final InterfaceC1453760nvy x5() {
        return (InterfaceC1453760nvy) this.LLJJJJJIL.getValue(this, LLLIIIIL[8]);
    }

    public final InterfaceC1455860nzM E5() {
        return (InterfaceC1455860nzM) this.LLJJIJIL.getValue(this, LLLIIIIL[4]);
    }

    public final InterfaceC1456910o13 H5() {
        return (InterfaceC1456910o13) this.LLJJJ.getValue(this, LLLIIIIL[5]);
    }

    @Override // X.InterfaceC1418580n1E
    public boolean JX1() {
        return ((Boolean) Z1(new C2217381BqS() { // from class: X.0o50
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJI);
            }
        }).LIZJ()).booleanValue();
    }

    public final VideoPublishEditModel S5() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue(this, LLLIIIIL[3]);
    }

    public final boolean U5() {
        return ((Boolean) this.LLJLLL.getValue()).booleanValue();
    }

    private final boolean K6() {
        return (S5().isDuet() || C1403850mdT.LJIIL(S5())) ? false : true;
    }

    private final void Xi() {
        LiveEvent<Boolean> liveEventRl0;
        C0ETY c0ety;
        Class<InterfaceC1453200nv4> cls;
        AwS601S0100000_22 awS601S0100000_22;
        C1DRG diContainer = getDiContainer();
        VideoPublishEditModel videoPublishEditModelS5 = S5();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1453200nv4.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 607);
        } else {
            if (!C365940EWi.LIZLLL(videoPublishEditModelS5)) {
                InterfaceC1453200nv4 interfaceC1453200nv4 = (InterfaceC1453200nv4) ((C05YF) diContainer.LJIIL(null, InterfaceC1453200nv4.class));
                if (interfaceC1453200nv4 == null || (liveEventRl0 = interfaceC1453200nv4.Rl0()) == null) {
                    return;
                }
                liveEventRl0.LIZ(this, new AObjectS245S0100000_22(this, 244));
                return;
            }
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1453200nv4.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 608);
        }
        c0ety.Sd(cls, awS601S0100000_22);
    }

    @Override // X.InterfaceC1418580n1E
    public boolean FR0() {
        L6();
        return T2().LIZLLL || T2().LJFF;
    }

    @Override // X.InterfaceC1418580n1E
    public boolean Fl0() {
        return F4();
    }

    @Override // X.InterfaceC1418580n1E
    public boolean Ie2() {
        if (!C12DO.LIZ()) {
            return ((Boolean) Z1(new C2217381BqS() { // from class: X.0o4y
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1459370o51) obj).LJ);
                }
            }).LIZJ()).booleanValue();
        }
        AudioRecorderParam veAudioRecorderParam = S5().getVeAudioRecorderParam();
        return veAudioRecorderParam != null ? veAudioRecorderParam.getNeedOriginalSound() : ((Boolean) Z1(new C2217381BqS() { // from class: X.0o4v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJ);
            }
        }).LIZJ()).booleanValue();
    }

    public final boolean J6() {
        return ((!S5().hasOriginalSound(false) && !u4.LJJIJ(S5())) || S5().isMuted() || S5().isStitchMode()) ? false : true;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        InterfaceC1413540mt6 interfaceC1413540mt6R5;
        AbstractC856750XjF abstractC856750XjFLP2;
        AbstractC856710XjB abstractC856710XjBLIZJ;
        super.hide();
        InterfaceC1453760nvy interfaceC1453760nvyX5 = x5();
        if (C362370EIp.LIZ((interfaceC1453760nvyX5 == null || (abstractC856750XjFLP2 = interfaceC1453760nvyX5.LP2()) == null || (abstractC856710XjBLIZJ = abstractC856750XjFLP2.LIZJ()) == null) ? -1 : abstractC856710XjBLIZJ.LIZ()) && (interfaceC1413540mt6R5 = R5()) != null) {
            interfaceC1413540mt6R5.lz(null);
        }
        if (!this.LLJLILLLLZIIL && C0MT6.LIZ() && K6()) {
            InterfaceC1453200nv4 interfaceC1453200nv4D5 = D5();
            if (interfaceC1453200nv4D5 != null) {
                interfaceC1453200nv4D5.LJJ(false);
            }
            C1456140nzo.LIZIZ(E5(), false, false, false, false, 12);
        }
        i3(AFwS261S0000000_22.get$arr$(236));
        InterfaceC372160EiU interfaceC372160EiUT5 = t5();
        if (interfaceC372160EiUT5 != null) {
            interfaceC372160EiUT5.cg1(this.LLLII);
        }
        this.LLJZ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        if (S5().isMuted() != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k7() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1459270o4r.k7():boolean");
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1455850nzL interfaceC1455850nzLV5 = v5();
        if (interfaceC1455850nzLV5 != null) {
            interfaceC1455850nzLV5.pp1(this);
        }
        L6();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1455850nzL interfaceC1455850nzLV5 = v5();
        if (interfaceC1455850nzLV5 != null) {
            interfaceC1455850nzLV5.pp1(null);
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        C1456140nzo.LIZIZ(E5(), false, false, false, false, 12);
        L6();
        i3(AFwS261S0000000_22.get$arr$(235));
        InterfaceC372160EiU interfaceC372160EiUT5 = t5();
        if (interfaceC372160EiUT5 != null) {
            interfaceC372160EiUT5.FS1(this.LLLII);
        }
        this.LLJZ = true;
        k5();
    }

    @Override // X.InterfaceC1418580n1E
    public LiveEvent<Pair<Integer, Integer>> Kt2() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1418580n1E
    public void ap2() {
        L6();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1459370o51> o2() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1418580n1E
    public LiveEvent<Boolean> oq2() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1418580n1E
    public LiveEvent<Boolean> vm2() {
        return this.LLLI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1461510o8T> w2() {
        return this.LLJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> O4(X.InterfaceC1455860nzM r11) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1459270o4r.O4(X.0nzM):kotlin.Pair");
    }

    private final void d5(int i) {
        if (((Boolean) Z1(new C2217381BqS() { // from class: X.0o4t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJFF);
            }
        }).LIZJ()).booleanValue() && F4()) {
            int iLIZ = C273400Ana.LIZ(i);
            float f = 100;
            int musicVolume = (int) (S5().getMusicVolume() * f);
            if (1 <= musicVolume && musicVolume < iLIZ) {
                s7((iLIZ * 1.0f) / f, true);
            }
        }
    }

    private final void n7(boolean z) {
        if (S5().getVeAudioRecorderParam() == null) {
            S5().setVeAudioRecorderParam(new AudioRecorderParam());
        }
        AudioRecorderParam veAudioRecorderParam = S5().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setNeedOriginalSound(z);
        }
        if (z) {
            if (S5().getVoiceVolume() <= 0.0f) {
                S5().setVoiceVolume(1.0f);
            }
        } else if (S5().getVoiceVolume() > 0.0f) {
            S5().setVoiceVolume(0.0f);
        }
        InterfaceC1453200nv4 interfaceC1453200nv4D5 = D5();
        if (interfaceC1453200nv4D5 != null) {
            interfaceC1453200nv4D5.ll1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o7(X.EnumC1461710o8n r15) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1459270o4r.o7(X.0o8n):void");
    }

    @Override // X.InterfaceC1418580n1E
    public void A10(float f) {
        if (!F4()) {
            return;
        }
        s7(f, true);
    }

    @Override // X.InterfaceC1418580n1E
    public void Ca1(boolean z) {
        float voiceVolume = 0.0f;
        if (S5().getVoiceVolume() == 0.0f) {
            return;
        }
        if (z) {
            voiceVolume = S5().getVoiceVolume();
        }
        K4(VEVolumeChangeOp.ofVoice(voiceVolume));
    }

    @Override // X.InterfaceC1418580n1E
    public void Iy1(boolean z) {
        Hr1(z, false, true);
        LLLLZI(z);
    }

    @Override // X.InterfaceC1418580n1E
    public void LLLLZI(boolean z) {
        float f = 0.0f;
        if (!z) {
            if (((Boolean) C273180AnE.LIZ.getValue()).booleanValue()) {
                this.LLJZIJLIL = 0.0f;
            } else if (S5().getMusicVolume() > 0.0f) {
                this.LLJZIJLIL = S5().getMusicVolume();
            }
        } else {
            if (U5() && S5().getMusicVolume() > 0.0f) {
                this.LLJZIJLIL = S5().getMusicVolume();
            }
            if (this.LLJZIJLIL == 0.0f) {
                this.LLJZIJLIL = 1.0f;
            }
            f = this.LLJZIJLIL;
        }
        s7(f, true);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C319900CgO(this, z, null), 2);
        i3(new AwS108S0110000_22(this, z, 13));
    }

    public void N6(String str) {
        InterfaceC1417120mys interfaceC1417120mysN5;
        InterfaceC1459480o5C interfaceC1459480o5CD6;
        if (U5()) {
            int iIntValue = ((Number) H2(new C2217381BqS() { // from class: X.0o53
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1459370o51) obj).LIZ);
                }
            }).LIZJ()).intValue();
            int i = this.LLJLLIL;
            if (i == 0) {
                if (iIntValue > 0) {
                    n7(true);
                }
            } else if (i > 0 && iIntValue == 0) {
                n7(false);
            }
            if (((Number) H2(new C2217381BqS() { // from class: X.0o54
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1459370o51) obj).LIZIZ);
                }
            }).LIZJ()).intValue() <= 0 && (interfaceC1459480o5CD6 = d6()) != null) {
                interfaceC1459480o5CD6.QI1();
            }
        }
        InterfaceC377540ErA interfaceC377540ErAN5 = N5();
        if (interfaceC377540ErAN5 != null && interfaceC377540ErAN5.isShowing()) {
            InterfaceC377540ErA interfaceC377540ErAN52 = N5();
            if (interfaceC377540ErAN52 != null) {
                interfaceC377540ErAN52.nO2();
            }
        } else {
            C1456140nzo.LIZIZ(E5(), true, false, false, false, 12);
        }
        try {
            InterfaceC559500Lwy interfaceC559500LwyC5 = C5();
            if (interfaceC559500LwyC5 != null) {
                interfaceC559500LwyC5.Qk(false);
            }
            int iIntValue2 = ((Number) Z1(new C2217381BqS() { // from class: X.0o52
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1459370o51) obj).LIZ);
                }
            }).LIZJ()).intValue();
            if (this.LLJLLIL == 0 && iIntValue2 > 0.0f && ((Boolean) Z1(new C2217381BqS() { // from class: X.0o4z
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1459370o51) obj).LJ);
                }
            }).LIZJ()).booleanValue() && (interfaceC1417120mysN5 = n5()) != null) {
                interfaceC1417120mysN5.oC();
            }
            int iIntValue3 = ((Number) Z1(new C2217381BqS() { // from class: X.0o55
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1459370o51) obj).LIZIZ);
                }
            }).LIZJ()).intValue();
            int iIntValue4 = ((Number) Z1(new C2217381BqS() { // from class: X.0o56
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1459370o51) obj).LIZJ);
                }
            }).LIZJ()).intValue();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C319890CgN(this, iIntValue4, iIntValue3, null), 2);
            C1637890six.LIZ("aweme_short_video_volume_set", null, new JSONObject().put("mVoiceVolume", iIntValue2).put("mMusicVolume", iIntValue3).put("mRecordVolume", iIntValue4));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        hide();
    }

    @Override // X.InterfaceC1418580n1E
    public void N81(float f) {
        NLEModel nLEModelLIZ;
        if (C294050Bfn.LIZ()) {
            InterfaceC1452170ntP value = E5().g().getValue();
            if (value != null) {
                nLEModelLIZ = C352130DrH.LIZ(value);
            } else {
                nLEModelLIZ = null;
            }
            if (!H4() && (nLEModelLIZ == null || !C0EYQ.LJIIL(nLEModelLIZ))) {
                return;
            }
        } else if (!H4()) {
            return;
        }
        y7(f, true);
    }

    public final void P6(int i) {
        boolean z;
        InterfaceC1459480o5C interfaceC1459480o5CD6;
        float f = 100;
        int iLIZIZ = C273400Ana.LIZIZ(i, (int) (S5().getVoiceVolume() * f));
        float f2 = (iLIZIZ * 1.0f) / f;
        if (iLIZIZ != i) {
            z = true;
        } else {
            z = false;
        }
        s7(f2, z);
        if (U5() && this.LLJLL == 0 && iLIZIZ > 0 && (interfaceC1459480o5CD6 = d6()) != null) {
            interfaceC1459480o5CD6.wG1();
        }
    }

    public final void S6(int i) {
        I7(this, (i * 1.0f) / 100, false, 2, null);
        d5(i);
    }

    public final void T6(boolean z) {
        if (z) {
            InterfaceC1452170ntP value = E5().g().getValue();
            if (value != null) {
                value.play();
                return;
            }
            return;
        }
        InterfaceC1452170ntP value2 = E5().g().getValue();
        if (value2 == null) {
            return;
        }
        value2.pause();
    }

    public final void W6(int i) {
        int iLIZIZ = C273400Ana.LIZIZ(i, (int) (S5().getVoiceVolume() * 100));
        C1403470mcr.LJIIIZ(iLIZIZ, S5(), "background");
        i3(new AwS35S0001000_22(iLIZIZ, 26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final boolean Z7(EnumC1461710o8n enumC1461710o8n) {
        NLEModel nLEModelLIZ;
        ?? arrayList;
        boolean z;
        NLEResType resourceType;
        NLEResourceNode resource;
        InterfaceC1452170ntP value = E5().g().getValue();
        if (value != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        List<NLETrack> listLIZ = C349880Dne.LIZ(nLEModelLIZ, enumC1461710o8n);
        if (listLIZ != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrack> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                Iterable slots = it2.next().getSlots();
                if (slots == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList2);
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
                if ((keyframes != null && !keyframes.isEmpty()) || (C351220Dpo.LLIIIJ(nLETrackSlot) && C351220Dpo.LLFF(nLETrackSlot, NLEKeyframeType.Volume))) {
                    z = true;
                } else {
                    z = false;
                }
                if (enumC1461710o8n == EnumC1461710o8n.VIDEO_VOICE) {
                    if (z) {
                        NLEResType nLEResType = NLEResType.VIDEO;
                        NLESegment mainSegment = nLETrackSlot.getMainSegment();
                        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                            resourceType = resource.getResourceType();
                        } else {
                            resourceType = null;
                        }
                        if (nLEResType == resourceType) {
                            arrayList.add(obj);
                        }
                    }
                } else if (z) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return !arrayList.isEmpty();
    }

    public final void d7(int i) {
        C1403470mcr.LJIIIZ(i, S5(), "voice");
        i3(new AwS35S0001000_22(i, 27));
        d5(i);
    }

    public final void d8(boolean z) {
        this.LLLIIII = z;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC1418580n1E
    public void rI1(float f) {
        L7(f, true);
    }

    public final boolean u6(EnumC1461520o8U enumC1461520o8U) {
        VideoPublishEditModel videoPublishEditModelS5;
        if (enumC1461520o8U == EnumC1461520o8U.ENABLE_KEYFRAME) {
            if (C0BYP.LIZ() || ((videoPublishEditModelS5 = S5()) != null && C1428470nHB.LJJIZ(videoPublishEditModelS5))) {
                return true;
            }
            return false;
        }
        if (enumC1461520o8U != EnumC1461520o8U.SHOW_CUT_PRO) {
            return false;
        }
        String str = S5().creativeModel.ugcTemplateData.ugcTemplateId;
        if (str == null || a0.LJJJIL(str) || u4.LJLJJI(S5())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1418580n1E
    public void uB1(boolean z) {
        float musicVolume = 0.0f;
        if (S5().getMusicVolume() == 0.0f) {
            return;
        }
        if (z) {
            musicVolume = S5().getMusicVolume();
        }
        K4(VEVolumeChangeOp.ofMusic(musicVolume));
    }

    @Override // X.InterfaceC1418580n1E
    public void wM1(boolean z) {
        Ca1(z);
        uB1(z);
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.0o57] */
    public AbstractC1459270o4r(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = new AwS566S0100000_22(this, 788);
        this.LLJJ = new AwS566S0100000_22(this, 789);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459480o5C.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453760nvy.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417120mys.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372160EiU.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455620nyy.class, null);
        this.LLJLL = Integer.MIN_VALUE;
        this.LLJLLIL = Integer.MIN_VALUE;
        this.LLJLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(273));
        this.LLJZIJLIL = S5().getMusicVolume();
        C560530Lyd<Pair<Integer, Integer>> c560530Lyd = new C560530Lyd<>();
        this.LLL = c560530Lyd;
        this.LLLF = c560530Lyd;
        C560530Lyd<Boolean> c560530Lyd2 = new C560530Lyd<>();
        this.LLLFF = c560530Lyd2;
        this.LLLFFI = c560530Lyd2;
        C560530Lyd<Boolean> c560530Lyd3 = new C560530Lyd<>();
        this.LLLFZ = c560530Lyd3;
        this.LLLI = c560530Lyd3;
        this.LLLII = new InterfaceC1462000o9G() { // from class: X.0o57
            @Override // X.InterfaceC1462000o9G
            public final boolean LJL(boolean z) {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean LLIIIJ() {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean b0() {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean x0() {
                return this.LL.LLLIIII;
            }
        };
    }

    private final void L7(float f, boolean z) {
        if (f >= 0.0f && f <= 2.0f) {
            AudioRecorderParam veAudioRecorderParam = S5().getVeAudioRecorderParam();
            if (veAudioRecorderParam == null) {
                veAudioRecorderParam = new AudioRecorderParam();
            }
            if (S5().getVeAudioRecorderParam() == null) {
                S5().setVeAudioRecorderParam(veAudioRecorderParam);
            }
            veAudioRecorderParam.setNeedOriginalSound(Ie2());
            K4(VEVolumeChangeOp.ofRecord(f));
            AudioRecorderParam veAudioRecorderParam2 = S5().getVeAudioRecorderParam();
            if (veAudioRecorderParam2 != null) {
                veAudioRecorderParam2.setRecordVolume(f);
            }
            if (z) {
                i3(new AwS10S0000001_22(f, 7));
            }
        }
    }

    private final void y7(float f, boolean z) {
        InterfaceC1455620nyy interfaceC1455620nyyM6;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setOriginalSoundVolumeInternal: volume = ");
        sbLIZ.append(f);
        sbLIZ.append(", needRefreshUI = ");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        if (f >= 0.0f && f <= 2.0f) {
            if (f == 0.0f && (interfaceC1455620nyyM6 = m6()) != null) {
                interfaceC1455620nyyM6.jE();
            }
            K4(VEVolumeChangeOp.ofVoice(f));
            S5().setVoiceVolume(f);
            if (z) {
                i3(new AwS10S0000001_22(f, 6));
            }
        }
    }

    public final void P4(boolean z, EnumC1461710o8n enumC1461710o8n) {
        NLEModel nLEModelLIZ;
        long jLLLLLLJ;
        String str;
        boolean zU6 = u6(EnumC1461520o8U.SHOW_CUT_PRO);
        if (z) {
            if (zU6) {
                this.LLJLILLLLZIIL = true;
                hide();
                this.LLJLILLLLZIIL = false;
                InterfaceC1452170ntP value = E5().g().getValue();
                String uuid = null;
                if (value != null) {
                    nLEModelLIZ = C352130DrH.LIZ(value);
                } else {
                    nLEModelLIZ = null;
                }
                if (E5().g().getValue() != null) {
                    jLLLLLLJ = C351220Dpo.LLLLLLJ(r0.LLL());
                } else {
                    jLLLLLLJ = 0;
                }
                Pair<NLETrackSlot, Long> pairLIZIZ = C349880Dne.LIZIZ(nLEModelLIZ, jLLLLLLJ, enumC1461710o8n);
                if (enumC1461710o8n == EnumC1461710o8n.MUSIC) {
                    str = "bottom_item_bgm_edit_volume";
                } else {
                    str = "bottom_item_edit_volume";
                }
                IMusicEditService iMusicEditService = (IMusicEditService) PluggableExtentionKt.pluggableSpi$default(IMusicEditService.class, false, false, false, 14, null);
                if (iMusicEditService != null) {
                    Long second = pairLIZIZ.getSecond();
                    NLETrackSlot first = pairLIZIZ.getFirst();
                    if (first != null) {
                        uuid = first.getUUID();
                    }
                    iMusicEditService.LJIIZILJ(second, uuid, str);
                }
                InterfaceC1455610nyx interfaceC1455610nyxM5 = M5();
                if (interfaceC1455610nyxM5 != null) {
                    interfaceC1455610nyxM5.Ws(15);
                    return;
                }
                return;
            }
            o7(enumC1461710o8n);
            return;
        }
        if (!zU6) {
            return;
        }
        o7(enumC1461710o8n);
    }

    public void s7(float f, boolean z) {
        if (f >= 0.0f && f <= 2.0f) {
            K4(VEVolumeChangeOp.ofMusic(f));
            S5().setMusicVolume(f);
            List<MusicBuzModel> list = S5().creativeModel.musicBuzModel.extendMusicList;
            if (list != null) {
                Iterator<MusicBuzModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().musicVolume = f;
                }
            }
            if (z) {
                i3(new AwS10S0000001_22(f, 5));
            }
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    private final void T4(boolean z, float f, boolean z2) {
        NLEModel nLEModelLIZ;
        InterfaceC559500Lwy interfaceC559500LwyC5;
        NLEModel nLEModelLIZ2;
        VecNLETrackSPtr tracks;
        float f2;
        InterfaceC1452170ntP value = E5().g().getValue();
        if (value != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        if (C1428470nHB.LLIIJLIL(nLEModelLIZ)) {
            InterfaceC1452170ntP value2 = E5().g().getValue();
            if (value2 != null && (nLEModelLIZ2 = C352130DrH.LIZ(value2)) != null && (tracks = nLEModelLIZ2.getTracks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (C351220Dpo.LLF((NLETrackSlot) obj)) {
                        arrayList3.add(obj);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    VecNLETrackSlotSPtr keyframes = ((NLETrackSlot) it3.next()).getKeyframes();
                    if (keyframes != null) {
                        for (NLETrackSlot nLETrackSlot : keyframes) {
                            NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                            if (nLESegmentAudio != null) {
                                if (z) {
                                    f2 = f;
                                } else {
                                    f2 = 0.0f;
                                }
                                nLESegmentAudio.setVolume(f2);
                            }
                            NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                            if (nLESegmentVideo != null) {
                                nLESegmentVideo.setEnableAudio(z);
                            }
                        }
                    }
                }
            }
            InterfaceC1452170ntP value3 = E5().g().getValue();
            if (value3 != null) {
                value3.jg();
                value3.of();
            }
        }
        if (z2 && (interfaceC559500LwyC5 = C5()) != null) {
            interfaceC559500LwyC5.Qk(false);
        }
    }

    public void Hr1(boolean z, boolean z2, boolean z3) {
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        boolean z4;
        AudioRecorderParam veAudioRecorderParam;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableOriginSound: ");
        sbLIZ.append(z);
        sbLIZ.append(", forceUpdate = ");
        sbLIZ.append(z2);
        sbLIZ.append(", curState = ");
        sbLIZ.append(((Boolean) Z1(new C2217381BqS() { // from class: X.0o4w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJ);
            }
        }).LIZJ()).booleanValue());
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        if (!C12DO.LIZ() && !z2 && ((Boolean) Z1(new C2217381BqS() { // from class: X.0o4x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJ);
            }
        }).LIZJ()).booleanValue() == z) {
            return;
        }
        if (C12DO.LIZ() && !z2 && (veAudioRecorderParam = S5().getVeAudioRecorderParam()) != null && veAudioRecorderParam.getNeedOriginalSound() == z) {
            return;
        }
        AudioRecorderParam veAudioRecorderParam2 = S5().getVeAudioRecorderParam();
        if (veAudioRecorderParam2 == null) {
            veAudioRecorderParam2 = new AudioRecorderParam();
        }
        if (S5().getVeAudioRecorderParam() == null) {
            S5().setVeAudioRecorderParam(veAudioRecorderParam2);
            if (C12DO.LIZ()) {
                if (C294050Bfn.LIZ() && (value = E5().g().getValue()) != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && C0EYQ.LJIIL(nLEModelLIZ)) {
                    Pair<Boolean, Boolean> pairO4 = O4(E5());
                    boolean zBooleanValue = pairO4.getFirst().booleanValue();
                    pairO4.getSecond().booleanValue();
                    if (!zBooleanValue && !S5().realHasOriginalSound()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    veAudioRecorderParam2.setHasOriginalSound(z4);
                } else {
                    veAudioRecorderParam2.setHasOriginalSound(S5().hasOriginalSound(false));
                }
            }
        }
        veAudioRecorderParam2.setNeedOriginalSound(z);
        if (z && !H4()) {
            return;
        }
        float voiceVolume = 0.0f;
        if (!z) {
            veAudioRecorderParam2.setVoiceVolume(S5().getVoiceVolume());
        } else {
            if (veAudioRecorderParam2.getVoiceVolume() == 0.0f) {
                veAudioRecorderParam2.setVoiceVolume(1.0f);
            }
            voiceVolume = veAudioRecorderParam2.getVoiceVolume();
        }
        y7(voiceVolume, true);
        InterfaceC377540ErA interfaceC377540ErAN5 = N5();
        if (interfaceC377540ErAN5 != null) {
            interfaceC377540ErAN5.Tp(true);
        }
        i3(new AwS35S0010000_22(z, 28));
        InterfaceC1453200nv4 interfaceC1453200nv4D5 = D5();
        if (interfaceC1453200nv4D5 != null) {
            interfaceC1453200nv4D5.ll1();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C319910CgP(this, z, null), 2);
        Z4(this, z, 0.0f, z3, 2, null);
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    public static /* synthetic */ void I7(AbstractC1459270o4r abstractC1459270o4r, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC1459270o4r.y7(f, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOriginalSoundVolumeInternal");
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    public static /* synthetic */ void Z4(AbstractC1459270o4r abstractC1459270o4r, boolean z, float f, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            abstractC1459270o4r.T4(z, f, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableOriginalSoundNLE");
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
