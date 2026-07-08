package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.MyHandler;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS106S0210000_29;
import kotlin.jvm.internal.AwS178S1100000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import nv7.c0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11Y7 extends i<C0FWT, C114K, C114V, C114M> implements C0FWT, InterfaceC990330bsV, InterfaceC379610EuV {
    public static final C194424114s LLLLLZL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZ;
    public static final String LLLLZI;
    public static float LLLLZIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public SafeHandler LLJJJ;
    public boolean LLJJJIL;
    public final C00B7 LLJJJJ;
    public String LLJJJJJIL;
    public ReadTextEffectBean LLJJJJLIIL;
    public TextStickerData LLJJL;
    public C196925122x LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public volatile boolean LLJLIL;
    public CopyOnWriteArrayList<ReadTextEffectBean> LLJLILLLLZIIL;
    public List<List<ReadTextEffectBean>> LLJLL;
    public TTSSpeakerInfo LLJLLIL;
    public ReadTextEffectBean LLJLLL;
    public List<? extends List<? extends ReadTextEffectBean>> LLJZ;
    public Map<String, String> LLJZIJLIL;
    public List<? extends ReadTextEffectBean> LLL;
    public final C01GW LLLF;
    public HashMap<C386310FCr, Pair<File, Integer>> LLLFF;
    public InputMethodManager LLLFFI;
    public ReadTextEffectBean LLLFZ;
    public String LLLI;
    public String LLLII;
    public String LLLIIII;
    public SpeakerCenter.KevaSpeakerBean LLLIIIIL;
    public final InterfaceC497601wk LLLIIIL;
    public boolean LLLIIL;
    public final InterfaceC1731706qJ LLLIILIL;
    public final List<ReadTextEffectBean> LLLIL;
    public final InterfaceC1731706qJ LLLILZ;
    public final C01GW LLLILZJ;
    public final InterfaceC1731706qJ LLLILZLLLI;
    public final C2378509Tr LLLIZZ;
    public final C11YC LLLJ;
    public long LLLJIL;
    public long LLLJL;
    public long LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public final InterfaceC1731706qJ LLLLIIL;
    public C11FI<TTSAudioParam, TextStickerData> LLLLIILL;
    public C09TF LLLLIILLL;
    public String LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public TextStickerModel LLLLJI;
    public final C01GW LLLLL;
    public boolean LLLLLIL;
    public final Handler LLLLLILLIL;
    public final InterfaceC1731706qJ LLLLLJIL;
    public final InterfaceC383701eN LLLLLJLJLL;
    public final C560530Lyd<Unit> LLLLLL;
    public final Function0<C114V> LLLLLLIL;
    public final Function0<C114M> LLLLLLJ;
    public Function0<Unit> LLLLLLL;
    public final Function1<EffectCategoryModel, Boolean> LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public ReadTextEffectBean LLLLLLLZIL;
    public TextStickerData LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;

    @Override // X.C0FWT
    public void Mu2() {
        this.LLJLIL = false;
        this.LLLLLZIL = false;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.114s] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C11Y7.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C11Y7.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0), new C2217381BqS(C11Y7.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0), new C2217381BqS(C11Y7.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C11Y7.class, "unlockReadTextVoiceApi", "getUnlockReadTextVoiceApi()Lcom/ss/android/ugc/gamora/editor/sticker/read/unlocktts/UnlockReadTextVoiceApiComponent;", 0), new C2217381BqS(C11Y7.class, "ttsRequestLogicApi", "getTtsRequestLogicApi()Lcom/ss/android/ugc/gamora/editor/sticker/read/panel/TTSRequestLogicApi;", 0), new C2217381BqS(C11Y7.class, "voiceCloneApiComponent", "getVoiceCloneApiComponent()Lcom/ss/android/ugc/gamora/editor/sticker/read/voiceclone/VoiceCloneComponentApi;", 0), new C2217381BqS(C11Y7.class, "memeAudioApiComponent", "getMemeAudioApiComponent()Lcom/ss/android/ugc/gamora/editor/audioservice/service/memeaudio/MemeAudioApiComponent;", 0), new C2217381BqS(C11Y7.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0)};
        LLLLLZL = new Object() { // from class: X.114s
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTS_IN_TT_");
        sbLIZ.append("TTSPanelUIComponent");
        LLLLZI = C2188811AlT.LIZIZ(sbLIZ);
        LLLLZIL = 371.0f;
    }

    private final void Da() {
        int i = this.LLJL;
        if (i == Integer.MAX_VALUE) {
            this.LLJL = 0;
        } else {
            this.LLJL = i + 1;
        }
    }

    private final void Ga() {
        Object next;
        if ((!this.LLJZ.isEmpty()) && (!((Collection) ListProtector.get(this.LLJZ, 0)).isEmpty())) {
            Iterator it2 = ((Iterable) ListProtector.get(this.LLJZ, 0)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) next;
                if (!readTextEffectBean.instantClonePlaceHolder && !readTextEffectBean.voiceClonePlaceHolder) {
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean2 = (ReadTextEffectBean) next;
            if (readTextEffectBean2 == null) {
                return;
            }
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean2.mSpeaker;
            this.LLLI = readTextEffectSpeakerExtra.speakreID;
            this.LLLII = readTextEffectSpeakerExtra.streamTTSSpkID;
            this.LLLIIII = readTextEffectSpeakerExtra.speakerName;
            String effect_id = readTextEffectBean2.effect.getEffect_id();
            String str = (String) C13LP.LJJJLL(readTextEffectBean2.effect.getIcon_url().getUrlList());
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBean2.mSpeaker;
            this.LLLIIIIL = new SpeakerCenter.KevaSpeakerBean(effect_id, str, readTextEffectSpeakerExtra2.ttsAnchorName, null, readTextEffectSpeakerExtra2.voiceCreatorUserId, readTextEffectSpeakerExtra2.voiceCreatorUserName, readTextEffectSpeakerExtra2.isCreatorVoice, readTextEffectSpeakerExtra2.ttsAnchorReleaseDate, readTextEffectSpeakerExtra2.ttsReleaseDate);
        }
        Keva keva = SpeakerCenter.LIZ;
        if (!keva.contains("checkbox")) {
            keva.storeBoolean("checkbox", C311110CHl.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "text_reader_allowing_choose_sound_effects", true) != 3);
        }
        if (!SpeakerCenter.LJFF() || this.LLLIIL) {
            return;
        }
        i3(AFwS273S0000000_29.get$arr$(213));
        if (U5(SpeakerCenter.LIZ()) != -1) {
            i3(AFwS273S0000000_29.get$arr$(216));
            return;
        }
        keva.storeString("setCheckText", this.LLLIIII);
        keva.storeString("setCheckVoice", this.LLLI);
        keva.storeString("setCheckStreamVoice", this.LLLII);
        SpeakerCenter.KevaSpeakerBean kevaSpeakerBean = this.LLLIIIIL;
        if (kevaSpeakerBean != null) {
            SpeakerCenter.LJII(kevaSpeakerBean);
        }
        i3(new AwS608S0100000_29(this, 395));
    }

    private final InterfaceC1457820o2W P6() {
        return (InterfaceC1457820o2W) this.LLLLIIL.getValue(this, LLLLZ[7]);
    }

    private final InterfaceC19530111b1 S6() {
        return (InterfaceC19530111b1) this.LLLLLJIL.getValue(this, LLLLZ[8]);
    }

    private final void ra() {
        if (this.LLLLLILLIL.hasMessages(1024)) {
            this.LLLLLILLIL.removeMessages(1024);
            ITTSService iTTSServiceTtsService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).ttsService();
            if (iTTSServiceTtsService != null) {
                iTTSServiceTtsService.stopStreamReading();
            }
            da();
            Message messageObtain = Message.obtain(this.LLLLLILLIL, 1024);
            String string = messageObtain.getData().getString("speakId");
            String string2 = messageObtain.getData().getString("content");
            String str = LLLLZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleMessage resetStreamMsg:");
            sbLIZ.append(string);
            sbLIZ.append(",content:");
            sbLIZ.append(string2);
            C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final InterfaceC2246608rA u7() {
        return (InterfaceC2246608rA) this.LLLILZ.getValue(this, LLLLZ[5]);
    }

    public final InterfaceC2378409Tq I7() {
        return (InterfaceC2378409Tq) this.LLLIILIL.getValue(this, LLLLZ[4]);
    }

    public final InterfaceC1455860nzM J6() {
        return (InterfaceC1455860nzM) this.LLJJIII.getValue(this, LLLLZ[0]);
    }

    public final void K4() {
        InterfaceC497601wk interfaceC497601wk = this.LLLIIIL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C19469011Ey(this, null), 2);
    }

    public final InterfaceC1461660o8i K6() {
        return (InterfaceC1461660o8i) this.LLJJIJIIJIL.getValue(this, LLLLZ[2]);
    }

    public final InterfaceC1635390sev L6() {
        return (InterfaceC1635390sev) this.LLJJ.getValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLLF.getValue();
    }

    @Override // X.C0FWT
    public void QG1() {
        String str = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelRead. isShowing:");
        CreativeDialogWrapper creativeDialogWrapper = W6().LIZ;
        sbLIZ.append(creativeDialogWrapper != null ? Boolean.valueOf(creativeDialogWrapper.isShowing()) : null);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        CreativeDialogWrapper creativeDialogWrapper2 = W6().LIZ;
        if (Intrinsics.LJFF(creativeDialogWrapper2 != null ? Boolean.valueOf(creativeDialogWrapper2.isShowing()) : null, Boolean.TRUE)) {
            C345410DgR.LIZ(W6());
            J6().mw0(false);
        }
    }

    public final void T8() {
        if (this.LLLJIL <= 0 || !this.LLLLII) {
            return;
        }
        this.LLLIZZ.LIZ.put("total_duration", System.currentTimeMillis() - this.LLLJIL);
        this.LLLIZZ.LIZ.put("creation_id", LJJJLIIL().getCreationId());
        this.LLLIZZ.LIZ.put("resource_prepare_duration", this.LLLL);
        C2378509Tr c2378509Tr = this.LLLIZZ;
        c2378509Tr.getClass();
        C11YX c11yx = new C11YX();
        c11yx.LIZIZ(Integer.valueOf(c2378509Tr.LIZ.optInt("error_code")));
        c11yx.LIZJ(c2378509Tr.LIZ.optString("error_msg"));
        c11yx.LIZLLL(C11YJ.CLIENT);
        c11yx.LIZIZ = true;
        c11yx.LJ("panel_did_show");
        C19518711Yb c19518711Yb = C19518711Yb.LIZ;
        JSONObject jSONObject = c2378509Tr.LIZ;
        C11YY c11yyLIZ = c11yx.LIZ();
        c19518711Yb.getClass();
        C20684815ws.LJIJ("panel_did_show", jSONObject != null ? C475630Ikz.LIZ(jSONObject) : null);
        C19518711Yb.LIZ(c11yyLIZ);
        C20684815ws.LJIILLIIL("sami_business_error_mob", c11yyLIZ.LIZ);
        C2378509Tr c2378509Tr2 = this.LLLIZZ;
        c2378509Tr2.getClass();
        c2378509Tr2.LIZ = new JSONObject();
        this.LLLJ.LIZ.put("resource_prepare_duration", this.LLLL);
        this.LLLJ.LIZ.put("total_duration", System.currentTimeMillis() - this.LLLJIL);
        this.LLLJIL = 0L;
    }

    public final C345410DgR W6() {
        return (C345410DgR) this.LLLLILI.getValue();
    }

    public final InterfaceC19469111Ez W7() {
        return (InterfaceC19469111Ez) this.LLLILZLLLI.getValue(this, LLLLZ[6]);
    }

    public final AbstractC214814194y d7() {
        return (AbstractC214814194y) this.LLJJIJIL.getValue(this, LLLLZ[3]);
    }

    public final C122Q k7() {
        return (C122Q) this.LLJJIJI.getValue(this, LLLLZ[1]);
    }

    public final InterfaceC391390FWf o7() {
        return (InterfaceC391390FWf) this.LLLILZJ.getValue();
    }

    public final C09TG s7() {
        return (C09TG) this.LLLLJ.getValue();
    }

    public final ITTSService y7() {
        return (ITTSService) this.LLLLL.getValue();
    }

    private final int L7() {
        return ((ScreenUtils.getFullScreenHeight(C1664590tQ1.LJII(this)) - ((int) C12ES.LIZJ(LLLLZIL + 52.0f, C1664590tQ1.LJII(this)))) - ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this))) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C1664590tQ1.LJII(this));
    }

    private final void Z7() {
        InputMethodManager inputMethodManager;
        View currentFocus = C1664590tQ1.LJII(this).getCurrentFocus();
        if (currentFocus == null || (inputMethodManager = this.LLLFFI) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    private final void pa() {
        Da();
        this.LLJJJJJIL = "";
    }

    private final void v5() {
        W6().LIZIZ(C1664590tQ1.LJII(this));
    }

    public final void P8() {
        T4(LJJJLIIL().getTtsVoiceModel());
        if (!this.LLLLLZIL) {
            C19419110yD.LIZ.getClass();
            if (C19419110yD.LIZ() && W7() != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08WQ(this, null), 3);
            }
        }
        if (!C19422210yi.LIZIZ() || W7() == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08WR(this, null), 3);
    }

    public final void da() {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1452170ntP value = J6().g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return;
        }
        VecNLETrackSPtr sortedTracks = nLEModelLIZ.getSortedTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : sortedTracks) {
            if (o8(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSortedSlots(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            NLESegment mainSegment = ((NLETrackSlot) it3.next()).getMainSegment();
            if (mainSegment != null) {
                C351220Dpo.LLLLLL(mainSegment, C0FM8.LIZ * 1.0f);
            }
        }
        AbstractC1452680nuE abstractC1452680nuEGc = J6().gc();
        if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        nLEEditor.commit();
    }

    public final C0FVT n7() {
        return K6().kR();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        J6().ww2().observe(this, new AObserverS231S0100000_29(this, 108));
        if (C1403860mdU.LIZ(LJJJLIIL(), true)) {
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1457820o2W.class, new AwS608S0100000_29(this, 396));
                ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC19530111b1.class, new AwS608S0100000_29(this, 398));
                return;
            }
            InterfaceC1457820o2W interfaceC1457820o2WP6 = P6();
            if (interfaceC1457820o2WP6 != null) {
                interfaceC1457820o2WP6.KE2(this);
            }
            InterfaceC19530111b1 interfaceC19530111b1S6 = S6();
            if (interfaceC19530111b1S6 != null) {
                interfaceC19530111b1S6.hp2(this);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLLIIIL, null);
        this.LLLLIILLL = null;
        this.LLLLIILL = null;
        C09TG c09tgS7 = s7();
        c09tgS7.LIZ = null;
        c09tgS7.LIZIZ.clear();
        if (this.LLLLLILLIL.hasMessages(1024)) {
            this.LLLLLILLIL.removeCallbacksAndMessages(null);
        }
        ITTSService iTTSServiceY7 = y7();
        if (iTTSServiceY7 != null) {
            iTTSServiceY7.onDestroy();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        ReadTextEffectBean readTextEffectBean;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        super.onResume();
        if (this.LLLLLZIL || this.LLJLLIL == null) {
            return;
        }
        C19419110yD.LIZ.getClass();
        if (C19419110yD.LIZ()) {
            this.LLLLIIIILLL = false;
            TTSSpeakerInfo tTSSpeakerInfo = this.LLJLLIL;
            if (tTSSpeakerInfo != null) {
                String str = tTSSpeakerInfo.speakerId;
                ReadTextEffectBean readTextEffectBean2 = this.LLLLLLLZIL;
                if (Intrinsics.LJFF(str, (readTextEffectBean2 == null || (readTextEffectSpeakerExtra = readTextEffectBean2.mSpeaker) == null) ? null : readTextEffectSpeakerExtra.speakreID) && (readTextEffectBean = this.LLLLLLLZIL) != null && readTextEffectBean.selected) {
                    o7().Gn();
                }
            }
            if (W7() != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08WP(this, null), 3);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        ITTSService iTTSServiceY7;
        ITTSService iTTSServiceY72;
        super.onStop();
        if (!C1366905Wp.LIZ()) {
            C09TF c09tf = this.LLLLIILLL;
            if (c09tf != null && C123100dR.LIZ(c09tf.LIZJ) && (iTTSServiceY7 = y7()) != null) {
                iTTSServiceY7.stopStreamReading();
            }
            ITTSService iTTSServiceY73 = y7();
            if (iTTSServiceY73 != null) {
                iTTSServiceY73.destroyAudioSDKHandler();
            }
            C345410DgR.LIZ(W6());
            return;
        }
        if (this.LLLLLIL) {
            C09TF c09tf2 = this.LLLLIILLL;
            if (c09tf2 != null && C123100dR.LIZ(c09tf2.LIZJ) && (iTTSServiceY72 = y7()) != null) {
                iTTSServiceY72.stopStreamReading();
            }
            ITTSService iTTSServiceY74 = y7();
            if (iTTSServiceY74 != null) {
                iTTSServiceY74.destroyAudioSDKHandler();
            }
            C345410DgR.LIZ(W6());
        }
    }

    @Override // X.C0FWT
    public void px0() {
        this.LLLJL = System.currentTimeMillis();
        this.LLLLII = false;
    }

    @Override // X.C0FWT
    public LiveEvent<Unit> Iv1() {
        return this.LLLLLL;
    }

    @Override // X.C0FWT
    public boolean Lo2() {
        return this.LLLIIL;
    }

    public final boolean N6() {
        return this.LLJLIL;
    }

    public final boolean T6() {
        return this.LLLLLZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.C0FWT
    public C09TF ko1() {
        return this.LLLLIILLL;
    }

    public final boolean m6() {
        return this.LLLLLLZZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C114V> o2() {
        return this.LLLLLLIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C114M> w2() {
        return this.LLLLLLJ;
    }

    private final void F4(TextStickerData textStickerData) {
        H4(textStickerData, new C0VSJ(textStickerData.getAudioTrackFilePath()), textStickerData.getAudioTrackDuration());
    }

    private final void P4(TextStickerData textStickerData) {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMJ6 = J6();
        if (interfaceC1455860nzMJ6 != null && (liveDataG = interfaceC1455860nzMJ6.g()) != null && (value = liveDataG.getValue()) != null && !TextUtils.isEmpty(textStickerData.getNleUuid())) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null) {
                C347650Dk3 c347650Dk3 = c348100DkmLIZIZ.LJFF().get(textStickerData.getNleUuid());
                if (c347650Dk3 != null) {
                    C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
                    if (c348100DkmLIZIZ2 != null) {
                        c348100DkmLIZIZ2.LJFF().LJJJI(c347650Dk3);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                textStickerData.setNleUuid("");
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        textStickerData.setHasReadTextAudio(false);
        textStickerData.setAudioTrackIndex(-1);
        textStickerData.setAudioTrackFilePath(null);
    }

    private final void T4(TTSVoiceModel tTSVoiceModel) {
        InterfaceC1635390sev interfaceC1635390sevL6;
        if (tTSVoiceModel != null && this.LLJLLL == null) {
            String effectId = tTSVoiceModel.getEffectId();
            if ((effectId != null && effectId.length() == 0) || this.LLLLLLLLLL) {
                return;
            }
            Iterator<? extends ReadTextEffectBean> it2 = this.LLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ReadTextEffectBean next = it2.next();
                if (Intrinsics.LJFF(next.effect.getEffect_id(), tTSVoiceModel.getEffectId())) {
                    if (next != null) {
                        this.LLLLLLLLLL = true;
                        return;
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("panel", "speaking-voice");
            String effectId2 = tTSVoiceModel.getEffectId();
            if (effectId2 == null || (interfaceC1635390sevL6 = L6()) == null) {
                return;
            }
            interfaceC1635390sevL6.LIZIZ(effectId2, linkedHashMap, new IFetchEffectListener() { // from class: X.09Ts
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    Effect effect2 = effect;
                    if (effect2 != null && C386350FCv.LIZJ(effect2)) {
                        C1446130njf c1446130njf = C1446130njf.LIZ;
                        c1446130njf.getClass();
                        if (!C1446130njf.LIZIZ(effect2, "is_publich_for_voice_clone", false)) {
                            c1446130njf.getClass();
                            String strLJFF = C1446130njf.LJFF(effect2, "creator_user_id");
                            if (strLJFF == null) {
                                strLJFF = "";
                            }
                            if (!Intrinsics.LJFF(strLJFF, C0CHQ.LIZ().getAccountService().getCurrentUserID())) {
                                this.LIZ.LLJLLL = C2378709Tt.LIZ(effect2);
                            }
                        }
                    }
                    this.LIZ.LLLLLLLLLL = true;
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) throws JSONException {
                    this.LIZ.LLLIZZ.LIZ(exceptionResult.getErrorCode());
                    C2378509Tr c2378509Tr = this.LIZ.LLLIZZ;
                    String msg = exceptionResult.getMsg();
                    if (msg == null) {
                        msg = "Unknown error";
                    }
                    c2378509Tr.LIZIZ(msg);
                    this.LIZ.LLLLLLLLLL = true;
                }
            });
        }
    }

    private final int U5(String str) {
        int i = 0;
        if (this.LLLIIL) {
            return 0;
        }
        for (ReadTextEffectBean readTextEffectBean : this.LLJLILLLLZIIL) {
            int i2 = i + 1;
            if (i >= 0) {
                ReadTextEffectBean readTextEffectBean2 = readTextEffectBean;
                if (Intrinsics.LJFF(readTextEffectBean2.mSpeaker.speakreID, str)) {
                    this.LLJJJJLIIL = readTextEffectBean2;
                    return i;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return -1;
    }

    private final void d5(TextStickerData textStickerData) {
        this.LLJJL = textStickerData;
        pa();
        if (!textStickerData.getHasReadTextAudio()) {
            this.LLJJJJJIL = SpeakerCenter.LIZLLL();
            return;
        }
        String str = "";
        if (!h8(textStickerData) && p8(textStickerData)) {
            F4(textStickerData);
            String speakerID = textStickerData.getSpeakerID();
            if (speakerID != null) {
                str = speakerID;
            }
            this.LLJJJJJIL = str;
            return;
        }
        P4(textStickerData);
        String speakerID2 = textStickerData.getSpeakerID();
        if (speakerID2 != null) {
            str = speakerID2;
        }
        this.LLJJJJJIL = str;
    }

    private final boolean p8(TextStickerData textStickerData) {
        if (TextUtils.isEmpty(textStickerData.getAudioTrackFilePath()) || !new C0VSJ(textStickerData.getAudioTrackFilePath()).exists() || textStickerData.getAudioTrackDuration() == 0) {
            return false;
        }
        return true;
    }

    private final void z8(String str) throws JSONException {
        C2378509Tr c2378509Tr = this.LLLIZZ;
        c2378509Tr.LIZ.put("scene_name", "");
        c2378509Tr.LIZ.put("extra", "");
        c2378509Tr.LIZ.put("total_duration", 0L);
        c2378509Tr.LIZ.put("resource_prepare_duration", 0L);
        c2378509Tr.LIZ.put("ui_duration", 0L);
        c2378509Tr.LIZ.put("use_cache", 0);
        c2378509Tr.LIZIZ("");
        c2378509Tr.LIZ(0);
        c2378509Tr.LIZ.put("creation_id", "");
        this.LLLJ.LJ();
        if (str.length() > 0) {
            this.LLLIZZ.LIZ.put("scene_name", str);
            this.LLLJ.LIZ.put("scene_name", str);
        }
        if (this.LLJLIL) {
            this.LLLIZZ.LIZ.put("use_cache", 1);
        } else {
            this.LLLIZZ.LIZ.put("use_cache", 0);
        }
        this.LLLJ.LIZ.put("feature_name", "apply_tts_effect");
        C11YC c11yc = this.LLLJ;
        c11yc.LIZ.put("creation_id", LJJJLIIL().getCreationId());
        this.LLLJIL = System.currentTimeMillis();
    }

    public final void Ba(boolean z) {
        this.LLLLLLZZ = z;
    }

    public final List<ReadTextEffectBean> FY1(List<ReadTextEffectBean> list) {
        return u7().FY1(list);
    }

    @Override // X.C0FWT
    public void GM2(TextStickerModel textStickerModel) {
        C0FWP c0fwpRi;
        C0FVT c0fvtN7 = n7();
        if (c0fvtN7 != null && (c0fwpRi = c0fvtN7.Ri()) != null && c0fwpRi.LJIILL) {
            this.LLLLJI = textStickerModel;
        }
    }

    public final Object H5(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        boolean zYi2 = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
        if (C19422210yi.LIZIZ() && !zYi2) {
            C05YQ c05yq = C05YQ.LIZ;
            String strLJJIZ = C05HM.LIZIZ.LJJIZ();
            InterfaceC1446480nkE interfaceC1446480nkE = new InterfaceC1446480nkE() { // from class: X.08Zb
                @Override // X.InterfaceC1446480nkE
                public final void onFailure() {
                    InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC1364105Vn2.resumeWith(unit);
                }

                @Override // X.InterfaceC1446480nkE
                public final void onSuccess(String str) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2137608Za(this.LIZ, c23260099m, str, null), 3);
                }
            };
            c05yq.getClass();
            C05YQ.LIZ("", strLJJIZ, interfaceC1446480nkE);
        } else {
            this.LLJLIL = !this.LLL.isEmpty();
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c23260099m.resumeWith(unit);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.C0FWT
    public void I10(ExceptionResult exceptionResult) throws JSONException {
        this.LLLL = System.currentTimeMillis() - this.LLLJL;
        if (exceptionResult != null) {
            this.LLLIZZ.LIZ(exceptionResult.getErrorCode());
            C2378509Tr c2378509Tr = this.LLLIZZ;
            String msg = exceptionResult.getMsg();
            if (msg == null) {
                msg = "Unknown error";
            }
            c2378509Tr.LIZIZ(msg);
        }
        this.LLLLII = true;
    }

    public final void Ka(boolean z) {
        this.LLJLIL = z;
    }

    @Override // X.C0FWT
    public void LR0(List<? extends ReadTextEffectBean> list) {
        this.LLLIIL = true;
        Iterator<? extends ReadTextEffectBean> it2 = list.iterator();
        while (it2.hasNext()) {
            ListProtector.add(this.LLLIL, 0, it2.next());
        }
        FY1(this.LLLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M5(TextStickerData textStickerData) {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        ReadTextEffectBean readTextEffectBean = new ReadTextEffectBean(new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54), new ReadTextEffectSpeakerExtra(true, "", "", "", 0, 0, null, null, null, null, false, 0L, 0L, null, 16352, null));
        this.LLL = Collections.singletonList(readTextEffectBean);
        this.LLJZ = Collections.singletonList(Collections.singletonList(readTextEffectBean));
        k5(textStickerData);
    }

    public final Object N5(InterfaceC1364105Vn<? super TTSSpeakerInfo> interfaceC1364105Vn) {
        InterfaceC19469111Ez interfaceC19469111EzW7;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C19419110yD.LIZ.getClass();
        if (!C19419110yD.LIZ() || ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
            this.LLLLLZIL = true;
            this.LLJLIL = !this.LLL.isEmpty();
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        } else if (this.LLLLLZIL) {
            TTSSpeakerInfo tTSSpeakerInfo = this.LLJLLIL;
            C189200o6.m2constructorimpl(tTSSpeakerInfo);
            c23260099m.resumeWith(tTSSpeakerInfo);
        } else {
            InterfaceC1635390sev interfaceC1635390sevL6 = L6();
            if (interfaceC1635390sevL6 != null && (interfaceC19469111EzW7 = W7()) != null) {
                interfaceC19469111EzW7.m60(interfaceC1635390sevL6, new InterfaceC2376809Ta() { // from class: X.11Y1
                    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
                    @Override // X.InterfaceC2376809Ta
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo r11, int r12, java.lang.String r13) throws org.json.JSONException {
                        /*
                            Method dump skipped, instruction units count: 219
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11Y1.LIZ(com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo, int, java.lang.String):void");
                    }
                });
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void Na(boolean z) {
        this.LLLLLZ = z;
    }

    public final void Oa(ReadTextEffectBean readTextEffectBean) {
        C0FWP c0fwpRi;
        List<String> urlList;
        String str;
        List<String> urlList2;
        Keva keva = SpeakerCenter.LIZ;
        String str2 = readTextEffectBean.mSpeaker.speakerName;
        Keva keva2 = SpeakerCenter.LIZ;
        keva2.storeString("setCheckText", str2);
        keva2.storeString("setCheckVoice", readTextEffectBean.mSpeaker.speakreID);
        keva2.storeString("setCheckStreamVoice", readTextEffectBean.mSpeaker.streamTTSSpkID);
        String effect_id = readTextEffectBean.effect.getEffect_id();
        String str3 = (String) C13LP.LJJJLL(readTextEffectBean.effect.getIcon_url().getUrlList());
        String str4 = readTextEffectBean.mSpeaker.ttsAnchorName;
        String resource_id = readTextEffectBean.effect.getResource_id();
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
        SpeakerCenter.LJII(new SpeakerCenter.KevaSpeakerBean(effect_id, str3, str4, resource_id, readTextEffectSpeakerExtra.voiceCreatorUserId, readTextEffectSpeakerExtra.voiceCreatorUserName, readTextEffectSpeakerExtra.isCreatorVoice, readTextEffectSpeakerExtra.ttsAnchorReleaseDate, readTextEffectSpeakerExtra.ttsReleaseDate));
        i3(new AwS608S0100000_29(readTextEffectBean, 404));
        this.LLLFZ = readTextEffectBean;
        Iterator<List<ReadTextEffectBean>> it2 = this.LLJLL.iterator();
        while (it2.hasNext()) {
            for (ReadTextEffectBean readTextEffectBean2 : it2.next()) {
                boolean zLJFF = Intrinsics.LJFF(readTextEffectBean2.mSpeaker.speakreID, readTextEffectBean.mSpeaker.speakreID);
                readTextEffectBean2.selected = zLJFF;
                if (zLJFF) {
                    C122Q c122qK7 = k7();
                    String str5 = null;
                    if (c122qK7 != null) {
                        String str6 = readTextEffectBean2.mSpeaker.speakerName;
                        UrlModel iconUrl = readTextEffectBean2.effect.getIconUrl();
                        if (iconUrl != null && (urlList2 = iconUrl.getUrlList()) != null) {
                            str = (String) C13LP.LJJJLL(urlList2);
                        } else {
                            str = null;
                        }
                        c122qK7.Qg0(str6, str);
                    }
                    C0FVT c0fvtN7 = n7();
                    if (c0fvtN7 != null && (c0fwpRi = c0fvtN7.Ri()) != null) {
                        String str7 = readTextEffectBean2.mSpeaker.speakerName;
                        UrlModel iconUrl2 = readTextEffectBean2.effect.getIconUrl();
                        if (iconUrl2 != null && (urlList = iconUrl2.getUrlList()) != null) {
                            str5 = (String) C13LP.LJJJLL(urlList);
                        }
                        c0fwpRi.LJIILLIIL(str7, str5);
                    }
                }
            }
        }
        i3(new AwS608S0100000_29(this, 405));
        this.LLLLLLLZIL = readTextEffectBean;
    }

    @Override // X.C0FWT
    public void Rh2(boolean z) {
        this.LLLIIL = z;
    }

    public final void U9(final String str) {
        SafeHandler safeHandler = this.LLJJJ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new Runnable() { // from class: X.0FWe
            public final void LIZ() {
                C0FWP c0fwpRi;
                this.LL.LLLLLL.LJIIJ(Unit.LIZ);
                if (this.LL.LLLLLLZZ) {
                    return;
                }
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                if (C790050Uyx.LIZ(C1664590tQ1.LJIIIZ(this.LL))) {
                    String str2 = str;
                    if (str2 == null || str2.length() == 0) {
                        creativeToastBuilder.messageRes(2131850137);
                    } else {
                        String str3 = str;
                        if (str3 == null) {
                            str3 = "";
                        }
                        creativeToastBuilder.message(str3);
                    }
                } else {
                    creativeToastBuilder.messageRes(2131829876);
                }
                C1390380mHk.LIZ(C1664590tQ1.LJII(this.LL), 3022, creativeToastBuilder);
                this.LL.J6().mw0(false);
                InterfaceC1452170ntP value = this.LL.J6().g().getValue();
                if (value != null) {
                    value.setLoopPlay(true);
                }
                InterfaceC1452170ntP value2 = this.LL.J6().g().getValue();
                if (value2 != null) {
                    value2.play();
                }
                C122Q c122qK7 = this.LL.k7();
                if (c122qK7 != null) {
                    c122qK7.ja(false);
                }
                C0FVT c0fvtN7 = this.LL.n7();
                if (c0fvtN7 != null && (c0fwpRi = c0fvtN7.Ri()) != null) {
                    c0fwpRi.LJIILL = false;
                }
                C345410DgR.LIZ(this.LL.W6());
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTSPanelUIComponent@ceaf.readTextWithOutUIFailed$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.readTextWithOutUIFailed$1");
            }
        });
    }

    public final void Ya(boolean z) {
        String str;
        C09TF c09tf;
        C09TF c09tf2 = this.LLLLIILLL;
        if (c09tf2 != null && (str = c09tf2.LIZJ) != null && C09TA.LIZIZ(str) == 1 && (c09tf = this.LLLLIILLL) != null) {
            c09tf.LIZLLL = Boolean.valueOf(z);
        }
    }

    public final boolean Z4(String str) {
        boolean zContainsKey;
        TextStickerData textStickerData;
        if (this.LLJJL == null) {
            return false;
        }
        if (Intrinsics.LJFF(str, this.LLLI)) {
            str = "";
        }
        if (Intrinsics.LJFF(str, "") && (textStickerData = this.LLJJL) != null) {
            zContainsKey = this.LLLFF.containsKey(new C386310FCr(textStickerData.getTextStr(), this.LLLI));
        } else {
            zContainsKey = false;
        }
        TextStickerData textStickerData2 = this.LLJJL;
        if ((textStickerData2 == null || !this.LLLFF.containsKey(new C386310FCr(textStickerData2.getTextStr(), str))) && !zContainsKey) {
            return false;
        }
        return true;
    }

    public final void a9(List<ReadTextEffectBean> list) {
        T8();
    }

    @Override // X.C0FWT
    public void at(TextStickerData textStickerData) {
        n5(textStickerData, "small_icon");
    }

    public final Pair<File, Integer> d6(String str) {
        TextStickerData textStickerData;
        Pair<File, Integer> pair;
        if (Intrinsics.LJFF(str, this.LLLI)) {
            str = "";
        }
        TextStickerData textStickerData2 = this.LLJJL;
        if (textStickerData2 != null && (pair = this.LLLFF.get(new C386310FCr(textStickerData2.getTextStr(), str))) != null) {
            return pair;
        }
        if (!Intrinsics.LJFF(str, "") || (textStickerData = this.LLJJL) == null) {
            return null;
        }
        return this.LLLFF.get(new C386310FCr(textStickerData.getTextStr(), this.LLLI));
    }

    public final void gb(String str) {
        String str2 = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLastContentAndResetVideo content:");
        sbLIZ.append(str);
        sbLIZ.append(",lastStreamContent:");
        sbLIZ.append(this.LLLLIL);
        C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        this.LLLLIL = str;
        oa(true);
        o7().Gn();
    }

    public final boolean h8(TextStickerData textStickerData) {
        if (!TextUtils.isEmpty(textStickerData.getAudioText()) && !Intrinsics.LJFF(textStickerData.getAudioText(), C123P.LJIIIIZZ(textStickerData.getTextWrapList()))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k5(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r20) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Y7.k5(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData):void");
    }

    @Override // X.C0FWT
    public void mq0(List<List<ReadTextEffectBean>> list) {
        this.LLJZ = new ArrayList(list);
    }

    public final boolean o8(NLETrack nLETrack) {
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "TEXT_SPEAK")) {
            return true;
        }
        return false;
    }

    public final void oa(boolean z) {
        int startTime;
        Integer numValueOf;
        TextStickerData textStickerData;
        if (z && (textStickerData = this.LLJJL) != null) {
            startTime = textStickerData.getStartTime();
        } else {
            startTime = 0;
        }
        InterfaceC1452170ntP value = J6().g().getValue();
        if (value != null) {
            value.nf(startTime, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
        String str = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetBackgroudFromTTSStart ttsStartTime:");
        sbLIZ.append(startTime);
        sbLIZ.append(",currenttime:");
        InterfaceC1452170ntP value2 = J6().g().getValue();
        if (value2 != null) {
            numValueOf = Integer.valueOf(value2.LLL());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0FWT
    public void oc2(String str) {
        C0FWP c0fwpRi;
        C0FWP c0fwpRi2;
        if (C123100dR.LIZ(str)) {
            C122Q c122qK7 = k7();
            if (c122qK7 != null) {
                c122qK7.Qg0(null, null);
            }
            C0FVT c0fvtN7 = n7();
            if (c0fvtN7 != null && (c0fwpRi2 = c0fvtN7.Ri()) != null) {
                c0fwpRi2.LJIILLIIL(null, null);
            }
        }
        AwS178S1100000_29 awS178S1100000_29 = new AwS178S1100000_29(this, str, 4);
        if (this.LLLLLZ && this.LLL.isEmpty() && !this.LLJLIL && str != null) {
            if (LJJJLIIL().mIsFromDraft && (!LJJJLIIL().creativeModel.stickerModel.aiCaptionShuffleTTSDatas.isEmpty())) {
                awS178S1100000_29.invoke();
            }
            RC0(new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null), true, new AwS430S0200000_29(this, awS178S1100000_29, 58));
            return;
        }
        if (((Boolean) awS178S1100000_29.invoke()).booleanValue()) {
            return;
        }
        C122Q c122qK72 = k7();
        if (c122qK72 != null) {
            c122qK72.Qg0(null, null);
        }
        C0FVT c0fvtN72 = n7();
        if (c0fvtN72 != null && (c0fwpRi = c0fvtN72.Ri()) != null) {
            c0fwpRi.LJIILLIIL(null, null);
        }
    }

    public final void r8(boolean z) {
        String str;
        Keva keva = SpeakerCenter.LIZ;
        keva.storeBoolean("checkbox", z);
        LJJJLIIL().setApplyVoiceToAllTextSwitch(z ? 1 : 0);
        if (!z) {
            ReadTextEffectBean readTextEffectBean = this.LLLLLLLZIL;
            if (readTextEffectBean == null) {
                keva.storeString("setCheckText", this.LLLIIII);
                keva.storeString("setCheckVoice", this.LLLI);
                keva.storeString("setCheckStreamVoice", this.LLLII);
                SpeakerCenter.KevaSpeakerBean kevaSpeakerBean = this.LLLIIIIL;
                if (kevaSpeakerBean != null) {
                    SpeakerCenter.LJII(kevaSpeakerBean);
                }
                i3(new AwS608S0100000_29(this, 409));
            } else {
                keva.storeString("setCheckText", readTextEffectBean.mSpeaker.speakerName);
                keva.storeString("setCheckVoice", readTextEffectBean.mSpeaker.speakreID);
                keva.storeString("setCheckStreamVoice", readTextEffectBean.mSpeaker.streamTTSSpkID);
                String effect_id = readTextEffectBean.effect.getEffect_id();
                String str2 = (String) C13LP.LJJJLL(readTextEffectBean.effect.getIcon_url().getUrlList());
                String str3 = readTextEffectBean.mSpeaker.ttsAnchorName;
                String resource_id = readTextEffectBean.effect.getResource_id();
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                SpeakerCenter.LJII(new SpeakerCenter.KevaSpeakerBean(effect_id, str2, str3, resource_id, readTextEffectSpeakerExtra.voiceCreatorUserId, readTextEffectSpeakerExtra.voiceCreatorUserName, readTextEffectSpeakerExtra.isCreatorVoice, readTextEffectSpeakerExtra.ttsAnchorReleaseDate, readTextEffectSpeakerExtra.ttsReleaseDate));
                i3(new AwS608S0100000_29(readTextEffectBean, 394));
            }
        }
        if (!this.LLJJI) {
            C0FWY c0fwy = C0FWY.LIZ;
            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(LJJJLIIL().mShootWay, C1428470nHB.LJIILIIL(LJJJLIIL()), C1428470nHB.LJIILL(LJJJLIIL()), LJJJLIIL().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null);
            c0fwy.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
            c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
            c0lab.LJ("content_type", shortVideoCommonParams.contentType);
            c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
            if (SpeakerCenter.LJFF()) {
                str = "on";
            } else {
                str = "off";
            }
            c0lab.LJ("to_status", str);
            C20684815ws.LJIILLIIL("click_apply_tone", c0lab.LIZ);
        }
        this.LLJJI = false;
    }

    public final void t5(boolean z) throws JSONException {
        String speakerID;
        C09TL c09tl;
        TextStickerData data;
        C196925122x c196925122x = this.LLJJLIIIJLLLLLLLZ;
        C09TL c09tl2 = null;
        if (c196925122x != null && (data = c196925122x.getData()) != null) {
            speakerID = data.getSpeakerID();
        } else {
            speakerID = null;
        }
        C09TF c09tf = this.LLLLIILLL;
        if (c09tf != null) {
            c09tl = c09tf.LJI;
        } else {
            c09tl = null;
        }
        C09TL c09tl3 = C09TL.IDLE;
        if (c09tl == c09tl3 || speakerID == null) {
            if (c09tf != null) {
                speakerID = c09tf.LIZ;
            } else {
                speakerID = null;
            }
        }
        String str = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click close curChooseSpeakerID : ");
        sbLIZ.append(speakerID);
        sbLIZ.append(" isPressFinish : ");
        sbLIZ.append(z);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (speakerID != null && d6(speakerID) == null) {
            C09TF c09tf2 = this.LLLLIILLL;
            if (c09tf2 != null) {
                c09tl2 = c09tf2.LJI;
            }
            if (c09tl2 == c09tl3 && z) {
                if (c09tf2 != null) {
                    c09tf2.LJFF = Boolean.TRUE;
                }
                W6().LIZIZ(C1664590tQ1.LJII(this));
                return;
            }
        }
        Bt2(false, this.LLJJJIL, null, "", this.LLLLLLL, new AwS573S0100000_29(this, 689));
        K4();
    }

    public final List<String> u6(Effect effect) {
        List<String> challenge;
        ArrayList arrayList = new ArrayList();
        if (effect != null && (challenge = effect.getChallenge()) != null) {
            Iterator<String> it2 = challenge.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }

    public final void u8(boolean z) {
        boolean z2 = this.LLJJJIL;
        if (z2) {
            Bt2(false, z2, null, "", this.LLLLLLL, new AwS573S0100000_29(this, 687));
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tts_preview_tap_to_save", true, false)) {
            t5(true);
            return;
        }
        if (!z) {
            J6().vW1().setValue(C1452730nuJ.LIZ());
            J6().vW1().setValue(C1452730nuJ.LIZJ());
            i3(AFwS273S0000000_29.get$arr$(214));
        } else {
            i3(AFwS273S0000000_29.get$arr$(215));
            InterfaceC1452170ntP value = J6().g().getValue();
            if (value != null) {
                value.setLoopPlay(true);
            }
            J6().vW1().setValue(C1452730nuJ.LIZ());
        }
    }

    public final void w9(String str) {
        InterfaceC497601wk interfaceC497601wk = this.LLLIIIL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C11F0(str, this, null), 2);
    }

    public final void y8(ReadTextEffectBean readTextEffectBean) {
        C0FWY c0fwy = C0FWY.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        String str = readTextEffectBean.category.name;
        c0fwy.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModelLJJJLIIL.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", videoPublishEditModelLJJJLIIL.mShootWay);
        c0lab.LJ("tab_name", str);
        C20684815ws.LJIILLIIL("click_text_reading_tab", c0lab.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.00B7] */
    public C11Y7(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 72));
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C122Q.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJJJJ = new C11YL() { // from class: X.00B7
            public final Map<String, Integer> LIZ = new LinkedHashMap();

            @Override // X.C11YL
            public final int LIZ(String str, String str2) {
                Map<String, Integer> map = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                Integer num = (Integer) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
                if (num != null) {
                    return num.intValue();
                }
                return -1;
            }

            @Override // X.C11YL
            public final void LIZIZ(int i, String str, String str2) {
                Integer numValueOf = Integer.valueOf(i);
                Map<String, Integer> map = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                map.put(C2188811AlT.LIZIZ(sbLIZ), numValueOf);
            }
        };
        this.LLJJJJJIL = "";
        this.LLJLILLLLZIIL = new CopyOnWriteArrayList<>();
        this.LLJLL = new ArrayList();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJZ = c13bv;
        this.LLJZIJLIL = new LinkedHashMap();
        this.LLL = c13bv;
        this.LLLF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 693));
        this.LLLFF = new HashMap<>(20);
        this.LLLI = "";
        this.LLLII = "";
        this.LLLIIII = "";
        this.LLLIIIL = C2296808zG.LIZIZ();
        this.LLLIILIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2378409Tq.class, null);
        this.LLLIL = new ArrayList();
        this.LLLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2246608rA.class, null);
        this.LLLILZJ = C1449630npJ.LIZ(this, InterfaceC391390FWf.class);
        this.LLLILZLLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19469111Ez.class, null);
        this.LLLIZZ = new C2378509Tr();
        this.LLLJ = new C11YC();
        this.LLLLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457820o2W.class, null);
        this.LLLLIL = "";
        this.LLLLILI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(76));
        this.LLLLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(75));
        this.LLLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 688));
        this.LLLLLILLIL = new MyHandler(this);
        this.LLLLLJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
        this.LLLLLJLJLL = C2191201ApK.LIZ();
        this.LLLLLL = new C560530Lyd<>();
        this.LLLLLLIL = AFwS218S0000000_29.get$arr$(274);
        this.LLLLLLJ = new AwS573S0100000_29(this, 686);
        this.LLLLLLL = AFwS218S0000000_29.get$arr$(275);
        this.LLLLLLLLL = AFwS231S0000000_3.get$arr$(103);
        this.LLLLLZ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC990330bsV
    public void Fm(Function1<? super List<? extends List<? extends ReadTextEffectBean>>, Unit> function1, Map<String, String> map) {
        if (this.LLJZ.isEmpty()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08WW(this, map, function1, null), 3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends List<? extends ReadTextEffectBean>> it2 = this.LLJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(FY1(new ArrayList(it2.next())));
        }
        Iterator<T> it3 = this.LLJZIJLIL.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            map.put(entry.getKey(), entry.getValue());
        }
        function1.invoke(arrayList);
    }

    public final void J8(ReadTextEffectBean readTextEffectBean, int i) {
        C0FWP c0fwpRi;
        List<String> urlList;
        String str;
        List<String> urlList2;
        String str2;
        String str3;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        ReadTextEffectBean readTextEffectBean2 = this.LLLLLLLZIL;
        String str4 = null;
        if (readTextEffectBean2 != null) {
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBean2.mSpeaker;
            if (readTextEffectSpeakerExtra2 != null) {
                str2 = readTextEffectSpeakerExtra2.speakreID;
            } else {
                str2 = null;
            }
            if (readTextEffectBean != null && (readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker) != null) {
                str3 = readTextEffectSpeakerExtra.speakreID;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str2, str3)) {
                return;
            }
        }
        if (readTextEffectBean == null) {
            n5(null, "text_reading_panel");
            return;
        }
        C122Q c122qK7 = k7();
        if (c122qK7 != null) {
            String str5 = readTextEffectBean.mSpeaker.speakerName;
            UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
            if (iconUrl != null && (urlList2 = iconUrl.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList2);
            } else {
                str = null;
            }
            c122qK7.Qg0(str5, str);
        }
        C0FVT c0fvtN7 = n7();
        if (c0fvtN7 != null && (c0fwpRi = c0fvtN7.Ri()) != null) {
            String str6 = readTextEffectBean.mSpeaker.speakerName;
            UrlModel iconUrl2 = readTextEffectBean.effect.getIconUrl();
            if (iconUrl2 != null && (urlList = iconUrl2.getUrlList()) != null) {
                str4 = (String) C13LP.LJJJLL(urlList);
            }
            c0fwpRi.LJIILLIIL(str6, str4);
        }
        IFoundationAVService iFoundationAVService = (IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class);
        iFoundationAVService.setLastInfo(new C1179004jM(readTextEffectBean.effect.getEffectId()));
        iFoundationAVService.setLastInfo(new C1259004wG(readTextEffectBean.effect.getResourceId()));
        this.LLLJ.LIZ.put("effect_id", readTextEffectBean.effect.getEffectId());
        TextStickerData textStickerData = this.LLJJL;
        if (textStickerData != null) {
            if (readTextEffectBean.LIZJ()) {
                Keva keva = SpeakerCenter.LIZ;
                if (SpeakerCenter.LJI(readTextEffectBean.mSpeaker.speakreID)) {
                    Activity activityLJII = C1664590tQ1.LJII(this);
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(C1664590tQ1.LJII(this).getResources().getString(2131858346));
                    creativeToastBuilder.duration(3000L);
                    C1390380mHk.LIZ(activityLJII, 3021, creativeToastBuilder);
                    SpeakerCenter.LJIIIZ(readTextEffectBean.mSpeaker.speakreID);
                }
            }
            String textStr = textStickerData.getTextStr();
            if (textStr != null) {
                x5(textStr, this.LLJL, readTextEffectBean);
            }
        }
        String strLIZIZ = C386350FCv.LIZIZ(readTextEffectBean.effect);
        Effect effect = readTextEffectBean.effect;
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "creator_user_id");
        if (strLJFF == null) {
            strLJFF = "";
        }
        boolean zLJFF = Intrinsics.LJFF(strLJFF, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C0FWY c0fwy = C0FWY.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        String str7 = readTextEffectBean.mSpeaker.speakreID;
        String effectId = readTextEffectBean.effect.getEffectId();
        TTSCategory tTSCategory = readTextEffectBean.category;
        C0FWY.LJII(c0fwy, videoPublishEditModelLJJJLIIL, str7, i, null, strLIZIZ, zLJFF ? 1 : 0, effectId, tTSCategory.name, tTSCategory.id, 1048);
        C0FWY.LJ(LJJJLIIL(), readTextEffectBean.mEffect);
    }

    @Override // X.C0FWT
    public void KJ(String str, TextStickerData textStickerData) {
        ReadTextEffectBean next;
        if (!this.LLJLILLLLZIIL.isEmpty()) {
            Iterator<ReadTextEffectBean> it2 = this.LLJLILLLLZIIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.mSpeaker.speakreID, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean = next;
            if (readTextEffectBean != null) {
                C386350FCv.LIZLLL(LJJJLIIL(), readTextEffectBean.effect);
                return;
            }
            return;
        }
        if (!textStickerData.getTtsAudioBean().getChallengeIds().isEmpty()) {
            C386350FCv.LJ(textStickerData.getTtsAudioBean().getChallengeIds(), LJJJLIIL());
        } else {
            if (!(!textStickerData.getTtsHashTagIds().isEmpty())) {
                return;
            }
            C386350FCv.LJ(textStickerData.getTtsHashTagIds(), LJJJLIIL());
            textStickerData.getTtsHashTagIds().clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R5(java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2140408a2
            if (r0 == 0) goto L23
            r4 = r9
            X.08a2 r4 = (X.C2140408a2) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L31
            if (r0 != r3) goto L29
            goto L78
        L23:
            X.08a2 r4 = new X.08a2
            r4.<init>(r7, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            java.lang.Object r8 = r4.LL
            java.util.Map r8 = (java.util.Map) r8
            goto L5e
        L36:
            X.C155000ia.LIZIZ(r6)
            java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> r0 = r7.LLL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L46
            java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> r0 = r7.LLL
            return r0
        L46:
            X.0sev r0 = r7.L6()     // Catch: java.lang.RuntimeException -> L7e
            if (r0 == 0) goto L96
            X.08rE r1 = new X.08rE     // Catch: java.lang.RuntimeException -> L7e
            r1.<init>(r0, r8)     // Catch: java.lang.RuntimeException -> L7e
            kotlin.jvm.functions.Function1<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.lang.Boolean> r0 = r7.LLLLLLLLL     // Catch: java.lang.RuntimeException -> L7e
            r4.LL = r8     // Catch: java.lang.RuntimeException -> L7e
            r4.LLILZ = r2     // Catch: java.lang.RuntimeException -> L7e
            java.lang.Object r6 = r1.LIZIZ(r4, r0)     // Catch: java.lang.RuntimeException -> L7e
            if (r6 != r5) goto L61
            return r5
        L5e:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.RuntimeException -> L7e
        L61:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.RuntimeException -> L7e
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.RuntimeException -> L7e
            X.08pq r2 = X.C2107308Nj.LIZ     // Catch: java.lang.RuntimeException -> L7e
            X.09Tp r1 = new X.09Tp     // Catch: java.lang.RuntimeException -> L7e
            r0 = 0
            r1.<init>(r6, r7, r8, r0)     // Catch: java.lang.RuntimeException -> L7e
            r4.LL = r0     // Catch: java.lang.RuntimeException -> L7e
            r4.LLILZ = r3     // Catch: java.lang.RuntimeException -> L7e
            java.lang.Object r6 = X.C23250099c.LJI(r4, r2, r1)     // Catch: java.lang.RuntimeException -> L7e
            if (r6 != r5) goto L7b
            return r5
        L78:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.RuntimeException -> L7e
        L7b:
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.RuntimeException -> L7e
            goto L96
        L7e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.09Tr r1 = r7.LLLIZZ
            r0 = 900(0x384, float:1.261E-42)
            r1.LIZ(r0)
            X.09Tr r1 = r7.LLLIZZ
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L93
            java.lang.String r0 = "fetch voice list failed"
        L93:
            r1.LIZIZ(r0)
        L96:
            java.util.List<? extends com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean> r0 = r7.LLL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Y7.R5(java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.C0FWT
    public void ay(List<? extends ReadTextEffectBean> list, Map<String, String> map) {
        this.LLL = FY1(new ArrayList(list));
        this.LLJZIJLIL = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cb(final boolean r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Y7.cb(boolean, X.05Vn):java.lang.Object");
    }

    public final Object d8(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C2286608xc.LJ(C05HM.LIZIZ.init(str));
    }

    public final void ma(String str, String str2) {
        s7().LIZIZ(str, str2);
    }

    public final void n5(TextStickerData textStickerData, String str) {
        C0FWP c0fwpRi;
        C0FWP c0fwpRi2;
        TextStickerData textStickerData2 = textStickerData;
        if (textStickerData2 == null && (textStickerData2 = this.LLJJL) == null) {
            textStickerData2 = this.LLLLLLZ;
        }
        if (textStickerData2 != null) {
            C0FVT c0fvtN7 = n7();
            if (c0fvtN7 != null && (c0fwpRi2 = c0fvtN7.Ri()) != null) {
                c0fwpRi2.LJIILIIL(C0F7U.LJ(textStickerData2, null, 3));
            }
            if (textStickerData2.getAudioTrackIndex() >= 0 || !TextUtils.isEmpty(textStickerData2.getNleUuid())) {
                C0FWY.LIZ(C0FWY.LIZ, new ShortVideoCommonParams(LJJJLIIL().mShootWay, C1428470nHB.LJIILIIL(LJJJLIIL()), C1428470nHB.LJIILL(LJJJLIIL()), LJJJLIIL().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), null, str, 2);
                String speakerID = textStickerData2.getSpeakerID();
                if (speakerID != null) {
                    KJ(speakerID, textStickerData2);
                }
                InterfaceC1452170ntP value = J6().g().getValue();
                if (value != null && !TextUtils.isEmpty(textStickerData2.getNleUuid())) {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
                    if (c348100DkmLIZIZ != null) {
                        C347650Dk3 c347650Dk3 = c348100DkmLIZIZ.LJFF().get(textStickerData2.getNleUuid());
                        if (c347650Dk3 != null) {
                            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
                            if (c348100DkmLIZIZ2 != null) {
                                c348100DkmLIZIZ2.LJFF().LJJJI(c347650Dk3);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        textStickerData2.setNleUuid("");
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                textStickerData2.setHasReadTextAudio(false);
                textStickerData2.setAudioTrackIndex(-1);
                textStickerData2.setSpeakerID(null);
                textStickerData2.getTtsExtraMap().put("is_instant_clone", CardStruct.IStatusCode.DEFAULT);
                textStickerData2.getTtsExtraMap().put("is_voice_clone", CardStruct.IStatusCode.DEFAULT);
                textStickerData2.getTtsExtraMap().put("is_tts_reuse_mdp", CardStruct.IStatusCode.DEFAULT);
                textStickerData2.getTtsExtraMap().put("from_tag", "");
                textStickerData2.getTtsExtraMap().put("stream_speaker_id", "");
            }
        }
        Iterator<List<ReadTextEffectBean>> it2 = this.LLJLL.iterator();
        while (it2.hasNext()) {
            Iterator<ReadTextEffectBean> it3 = it2.next().iterator();
            while (it3.hasNext()) {
                it3.next().selected = false;
            }
        }
        i3(new AwS608S0100000_29(this, 403));
        C122Q c122qK7 = k7();
        if (c122qK7 != null) {
            c122qK7.Qg0(null, null);
        }
        C0FVT c0fvtN72 = n7();
        if (c0fvtN72 != null && (c0fwpRi = c0fvtN72.Ri()) != null) {
            c0fwpRi.LJIILLIIL(null, null);
        }
        this.LLLLLLLZIL = null;
        this.LLLLLLZ = null;
    }

    private final void sa(String str, String str2, long j) {
        ra();
        Message messageObtain = Message.obtain(this.LLLLLILLIL, 1024);
        C786410Ut5.LJJJI("speakId", str2, messageObtain.getData());
        C786410Ut5.LJJJI("content", str, messageObtain.getData());
        C786410Ut5.LJLJLJ(this.LLLLLILLIL, messageObtain, j);
        String str3 = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMessage sendStreamDelayMsg speaker:");
        sbLIZ.append(str2);
        sbLIZ.append(",content:");
        sbLIZ.append(str);
        C201955140j.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void x5(String str, int i, ReadTextEffectBean readTextEffectBean) throws JSONException {
        ITTSService iTTSServiceY7;
        String str2 = readTextEffectBean.mSpeaker.speakreID;
        Pair<File, Integer> pairD6 = d6(str2);
        if (pairD6 != null) {
            E5(pairD6.getFirst(), pairD6.getSecond().intValue(), str, readTextEffectBean);
            this.LLLJ.LIZ.put("apply_duration", 0L);
            this.LLLJ.LIZ.put("use_cache", 1);
            SafeHandler safeHandler = this.LLJJJ;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS129S0100000_29(this, 109), 1000L);
                return;
            }
            return;
        }
        if (!C2279808wW.LIZIZ(str)) {
            Activity activityLJII = C1664590tQ1.LJII(this);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829881);
            C1390380mHk.LIZ(activityLJII, 1018, creativeToastBuilder);
            return;
        }
        ra();
        C09TF c09tf = new C09TF(str2, str, readTextEffectBean.mSpeaker.streamTTSSpkID, 120);
        this.LLLLIILLL = c09tf;
        String str3 = C09TA.LIZ;
        C09TA.LIZJ(c09tf, s7());
        this.LLLJ.LIZ.put("use_cache", 0);
        C09ZR c09zr = new C09ZR(CoroutineExceptionHandler.LJJLIL, this, i, readTextEffectBean);
        if (C09TA.LIZIZ(readTextEffectBean.mSpeaker.streamTTSSpkID) == 1 && (iTTSServiceY7 = y7()) != null) {
            iTTSServiceY7.initAudioSDKHandler(LJJJLIIL().getCreativeInfo());
        }
        C23250099c.LIZLLL(this.LLLIIIL, c09zr, null, new C2170508et(this, str2, readTextEffectBean, str, i, new C013C(), null), 2);
    }

    public final void H4(TextStickerData textStickerData, File file, int i) {
        String speakerID = textStickerData.getSpeakerID();
        if (Intrinsics.LJFF(textStickerData.getSpeakerID(), this.LLLI)) {
            speakerID = "";
        } else if (speakerID == null) {
            return;
        }
        this.LLLFF.put(new C386310FCr(textStickerData.getAudioText(), speakerID), new Pair<>(file, Integer.valueOf(i)));
    }

    @Override // X.C0FWT
    public void RC0(TextStickerData textStickerData, boolean z, Function0<Unit> function0) {
        C1664590tQ1.LJII(this);
        if (C1664590tQ1.LJII(this).isFinishing()) {
            return;
        }
        if (this.LLJLIL) {
            k5(textStickerData);
            return;
        }
        InterfaceC19469111Ez interfaceC19469111EzW7 = W7();
        if (interfaceC19469111EzW7 != null) {
            interfaceC19469111EzW7.hashCode();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2146508b1(this, z, textStickerData, function0, null), 3);
    }

    public final void q9(String str, String str2, ReadTextEffectBean readTextEffectBean) {
        C09TL c09tl;
        C09TF c09tfLIZ = s7().LIZ(str, str2);
        if (c09tfLIZ != null) {
            c09tl = c09tfLIZ.LJI;
        } else {
            c09tl = null;
        }
        if (c09tl == C09TL.IDLE) {
            InterfaceC497601wk interfaceC497601wk = this.LLLIIIL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2247108rF(this, readTextEffectBean, null), 2);
        }
    }

    private final void E5(File file, int i, String str, ReadTextEffectBean readTextEffectBean) {
        String str2;
        String str3;
        String textStr;
        boolean z;
        List<String> urlList;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
        String str4 = readTextEffectSpeakerExtra.speakreID;
        String str5 = readTextEffectSpeakerExtra.streamTTSSpkID;
        String effect_id = readTextEffectBean.effect.getEffect_id();
        UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLL(urlList);
        } else {
            str2 = null;
        }
        String str6 = readTextEffectBean.mSpeaker.ttsAnchorName;
        String resource_id = readTextEffectBean.effect.getResource_id();
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBean.mSpeaker;
        String str7 = readTextEffectSpeakerExtra2.voiceCreatorUserId;
        String str8 = readTextEffectSpeakerExtra2.voiceCreatorUserName;
        boolean z2 = readTextEffectSpeakerExtra2.isCreatorVoice;
        long j = readTextEffectSpeakerExtra2.ttsAnchorReleaseDate;
        long j2 = readTextEffectSpeakerExtra2.ttsReleaseDate;
        TextStickerData textStickerData = this.LLJJL;
        if (textStickerData != null) {
            Oa(readTextEffectBean);
            textStickerData.setAudioTrackDuration(i);
            textStickerData.setAudioTrackFilePath(file.getAbsolutePath());
            textStickerData.setVoiceEffectId(effect_id);
            textStickerData.setVoiceEffectIconUrl(str2);
            textStickerData.setVoiceAnchorName(str6);
            textStickerData.setVoiceEffectResourceId(resource_id);
            textStickerData.setVoiceCreatorUserId(str7);
            textStickerData.setVoiceCreatorUserName(str8);
            textStickerData.setCreatorVoice(z2);
            textStickerData.setTtsAnchorReleaseDate(j);
            textStickerData.setTtsReleaseDate(j2);
            textStickerData.getTtsExtraMap().put("tts_tab_name", readTextEffectBean.category.name);
            textStickerData.getTtsExtraMap().put("tts_tab_id", readTextEffectBean.category.id);
            textStickerData.getTtsExtraMap().put("is_aigc_content", C2378709Tt.LIZIZ(readTextEffectBean.effect));
            Map<String, String> ttsExtraMap = textStickerData.getTtsExtraMap();
            String str9 = "1";
            if (C386350FCv.LIZJ(readTextEffectBean.effect)) {
                str3 = "1";
            } else {
                str3 = "1";
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            ttsExtraMap.put("is_voice_clone", str9);
            Map<String, String> ttsExtraMap2 = textStickerData.getTtsExtraMap();
            Effect effect = readTextEffectBean.effect;
            C1446130njf.LIZ.getClass();
            if (!C1446130njf.LIZIZ(effect, "is_instant_clone", false)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            ttsExtraMap2.put("is_instant_clone", str3);
            textStickerData.getTtsExtraMap().put("stream_speaker_id", readTextEffectBean.mSpeaker.streamTTSSpkID);
            textStickerData.getTtsExtraMap().put("from_tag", C386350FCv.LIZIZ(readTextEffectBean.effect));
            textStickerData.getAudioPathList().add(file.getAbsolutePath());
            TextStickerData textStickerData2 = this.LLJJL;
            if (textStickerData2 != null) {
                textStr = textStickerData2.getTextStr();
            } else {
                textStr = null;
            }
            textStickerData.setAudioText(textStr);
            String speakerID = textStickerData.getSpeakerID();
            if (speakerID != null) {
                if (!Intrinsics.LJFF(speakerID, str4)) {
                    KJ(speakerID, textStickerData);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            textStickerData.setSpeakerID(str4);
            Keva keva = SpeakerCenter.LIZ;
            keva.storeString("setLastVoice", str4);
            SpeakerCenter.LJIIIIZZ(str4, str5);
            keva.storeString("last_voice_effect_bean", GsonProtectorUtils.toJson(C2219091BtD.LIZJ(), new SpeakerCenter.KevaSpeakerBean(effect_id, str2, str6, resource_id, str7, str8, z2, j, j2)));
            if (!this.LLJJJIL) {
                i3(AFwS273S0000000_29.get$arr$(219));
            }
            j9(C09TA.LIZIZ(str5), str4, str, new C11YM(textStickerData), i, true);
            if (z) {
                C386350FCv.LIZ(C372650EjH.LIZIZ(this.LLJILJILJ), LJJJLIIL(), readTextEffectBean.effect);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Type inference failed for: r0v123, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c9(java.lang.String r32, final com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r33, final java.lang.String r34, final X.InterfaceC1631620sYq<? super java.lang.String, ? super com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter.KevaSpeakerBean, ? super com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Y7.c9(java.lang.String, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, java.lang.String, X.0sYq):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FWT
    public void t81(TTSModel tTSModel, TextStickerData textStickerData, boolean z, Function1<? super Boolean, Unit> function1) {
        String str = tTSModel.audioTrackFilePath;
        String str2 = tTSModel.speakerID;
        String str3 = tTSModel.audioText;
        String str4 = tTSModel.voiceEffectId;
        String str5 = tTSModel.voiceEffectIconUrl;
        String str6 = tTSModel.voiceAnchorName;
        String str7 = tTSModel.voiceEffectResourceId;
        String str8 = tTSModel.voiceCreatorUserId;
        String str9 = tTSModel.voiceCreatorUserName;
        boolean z2 = tTSModel.isCreatorVoice;
        long j = tTSModel.ttsAnchorReleaseDate;
        long j2 = tTSModel.ttsReleaseDate;
        if (str != null && str3 != null) {
            if (str.length() != 0 && new C0VSJ(str).exists()) {
                if (!C2279808wW.LIZIZ(str3)) {
                    Activity activityLJII = C1664590tQ1.LJII(this);
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829881);
                    C1390380mHk.LIZ(activityLJII, 1018, creativeToastBuilder);
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C19775512Yv c19775512Yv = new C19775512Yv(CoroutineExceptionHandler.LJJLIL, this, 0);
                SpeakerCenter.KevaSpeakerBean kevaSpeakerBean = new SpeakerCenter.KevaSpeakerBean(str4, str5, str6, str7, str8, str9, z2, j, j2);
                Iterator<T> it2 = tTSModel.ttsExtraMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    textStickerData.getTtsExtraMap().put(entry.getKey(), entry.getValue());
                }
                this.LLLJ.LIZIZ = true;
                boolean z3 = this.LLLLIIIILLL;
                this.LLLLIIIILLL = !z;
                C0VSJ c0vsj = new C0VSJ(str);
                if (str2 == null) {
                    str2 = "";
                }
                P9(this, 0, str3, c0vsj, str2, "", kevaSpeakerBean, textStickerData, jCurrentTimeMillis, c19775512Yv, new AwS106S0210000_29(this, (C11Y7) z3, (boolean) function1, (Function1<? super Boolean, Unit>) 1));
                return;
            }
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    private final void O4(boolean z, boolean z2, boolean z3, boolean z4, C11FI<TTSAudioParam, TextStickerData> c11fi) {
        o7().pauseVideo();
        String str = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyNewAudio isMute:");
        sbLIZ.append(z2);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        LJJJLIIL().creativeModel.commonMobModel.editPageFuncTracking.isTextFuncUsed = true;
        if (z2) {
            o7().Jo1(c11fi);
        } else {
            o7().Vh0(c11fi);
        }
        oa(z3);
        if (!z4 || z) {
            o7().Gn();
        }
        this.LLLLIILL = c11fi;
    }

    public final void C5(final int i, final String str, final int i2, final String str2, final ReadTextEffectBean readTextEffectBean) {
        SafeHandler safeHandler = this.LLJJJ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new Runnable() { // from class: X.11FH
            public final void LIZ() throws JSONException {
                ReadTextEffectBean next;
                int i3 = i;
                C11Y7 c11y7 = this;
                if (i3 != c11y7.LLJL) {
                    return;
                }
                c11y7.i3(new AwS608S0100000_29(c11y7, 406));
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                if (C790050Uyx.LIZ(C1664590tQ1.LJIIIZ(this))) {
                    String str3 = str;
                    if (str3 == null || TextUtils.isEmpty(str3)) {
                        creativeToastBuilder.messageRes(2131850136);
                    } else {
                        creativeToastBuilder.message(str);
                    }
                } else {
                    creativeToastBuilder.messageRes(2131829876);
                }
                this.LLLJ.LIZ(i2);
                C11YC c11yc = this.LLLJ;
                String str4 = str;
                if (str4 == null) {
                    str4 = "unknown error";
                }
                c11yc.LIZIZ(str4);
                this.LLLJ.LIZJ(C11YJ.SAMI_SERVER.getValue());
                C11YC c11yc2 = this.LLLJ;
                String str5 = str2;
                c11yc2.LIZ.put("task_id", str5 != null ? str5 : "unknown error");
                this.LLLJ.LIZLLL();
                C1390380mHk.LIZ(C1664590tQ1.LJII(this), 3019, creativeToastBuilder);
                C11Y7 c11y72 = this;
                ReadTextEffectBean readTextEffectBean2 = readTextEffectBean;
                Iterator<List<ReadTextEffectBean>> it2 = c11y72.LLJLL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Iterator<ReadTextEffectBean> it3 = it2.next().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            if (Intrinsics.LJFF(next.effect.getEffectId(), readTextEffectBean2.effect.getEffectId())) {
                                break;
                            }
                        }
                    }
                    ReadTextEffectBean readTextEffectBean3 = next;
                    if (readTextEffectBean3 != null) {
                        readTextEffectBean3.selected = false;
                        break;
                    }
                }
                C11Y7 c11y73 = this;
                c11y73.i3(new AwS608S0100000_29(c11y73, 407));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTSPanelUIComponent@ceaf.downloadFailed$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.downloadFailed$1");
            }
        });
    }

    @Override // X.InterfaceC990330bsV
    public void Cm(List<String> list, List<String> list2, List<Boolean> list3, Function1<? super List<String>, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        u7().Cm(list, list2, list3, function1, function2);
    }

    public final void J9(String str, String str2, int i, String str3, String str4) {
        C201955140j.LIZIZ(LLLLZI, "processTtsWithOutUIFailResult start");
        C23250099c.LIZLLL(this.LLLIIIL, null, null, new C11FG(this, i, str3, str4, str2, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter$KevaSpeakerBean] */
    /* JADX WARN: Type inference failed for: r8v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17, types: [T, java.lang.String] */
    @Override // X.C0FWT
    public void Va0(String str, String str2, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, TextStickerData textStickerData, boolean z) throws JSONException {
        boolean zLJFF;
        String str3;
        String str4;
        C09TF c09tf = this.LLLLIILLL;
        if (c09tf != null) {
            zLJFF = Intrinsics.LJFF(c09tf.LIZLLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            C09TF c09tf2 = this.LLLLIILLL;
            if (c09tf2 != null) {
                str3 = c09tf2.LIZIZ;
            } else {
                str3 = null;
            }
            if (str.equals(str3)) {
                C09TF c09tf3 = this.LLLLIILLL;
                if (c09tf3 != null) {
                    str4 = c09tf3.LIZ;
                } else {
                    str4 = null;
                }
                if (str2.equals(str4)) {
                    C201955140j.LJFF(LLLLZI, "readTextWithOutUI current task is running");
                    return;
                }
            }
        }
        this.LLLLJI = null;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = str2;
        C259800zU c259800zU2 = new C259800zU();
        String str5 = "";
        c259800zU2.element = "";
        C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = kevaSpeakerBean;
        C11YC c11yc = this.LLLJ;
        c11yc.LJ();
        c11yc.LIZ.put("feature_name", "apply_tts_effect");
        c11yc.LIZ.put("scene_name", "tts_actionSheet");
        c11yc.LIZ.put("creation_id", LJJJLIIL().getCreationId());
        if (C11YF.LIZLLL() && z) {
            if (this.LLLLLZ && this.LLL.isEmpty() && !this.LLJLIL) {
                RC0(new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null), true, new C09TN(this, str, c259800zU, c259800zU3, textStickerData, z));
                this.LLLLLZ = false;
                return;
            }
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) C13LP.LJLJJL(this.LLL, AbstractC19994813Le.Default);
            if (readTextEffectBean != null) {
                if (C123100dR.LIZ(readTextEffectBean.mSpeaker.speakreID) && C123100dR.LIZ(readTextEffectBean.effect.getEffect_id())) {
                    c259800zU.element = readTextEffectBean.mSpeaker.speakreID;
                    c259800zU3.element = new SpeakerCenter.KevaSpeakerBean(readTextEffectBean.effect.getEffect_id(), null, null, null, "", "", false, 0L, 0L);
                }
                if (C123100dR.LIZ(readTextEffectBean.mSpeaker.streamTTSSpkID)) {
                    c259800zU2.element = readTextEffectBean.mSpeaker.streamTTSSpkID;
                }
            }
        }
        this.LLLIIL = false;
        if (!C2279808wW.LIZIZ(str)) {
            Activity activityLJII = C1664590tQ1.LJII(this);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829881);
            C1390380mHk.LIZ(activityLJII, 1018, creativeToastBuilder);
            return;
        }
        ra();
        this.LLLLLLZZ = false;
        Z7();
        v5();
        J6().mw0(true);
        InterfaceC1452170ntP value = J6().g().getValue();
        if (value != null) {
            value.pause();
        }
        C11YC c11yc2 = this.LLLJ;
        String str6 = ((SpeakerCenter.KevaSpeakerBean) c259800zU3.element).voiceEffectId;
        if (str6 == null) {
            str6 = "";
        }
        c11yc2.LIZ.put("effect_id", str6);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19775512Yv c19775512Yv = new C19775512Yv(CoroutineExceptionHandler.LJJLIL, this, 1);
        String str7 = (String) c259800zU.element;
        String str8 = ((SpeakerCenter.KevaSpeakerBean) c259800zU3.element).voiceEffectId;
        if (str8 != null) {
            str5 = str8;
        }
        c9(str7, textStickerData, str5, new C09TM(c259800zU2, this, c259800zU, str, c19775512Yv, textStickerData, jCurrentTimeMillis));
    }

    @Override // X.C0FWT
    public void vl2(boolean z, boolean z2, C196925122x c196925122x, String str, Function0<Unit> function0) throws JSONException {
        TextStickerData data;
        this.LLJJLIIIJLLLLLLLZ = c196925122x;
        if (c196925122x != null && (data = c196925122x.getData()) != null) {
            data.setTextStr(c196925122x.getText());
        } else {
            data = null;
        }
        Bt2(z, z2, data, str, function0, new AwS430S0200000_29(this, c196925122x, 57));
    }

    @Override // X.C0FWT
    public void Bt2(boolean z, boolean z2, TextStickerData textStickerData, String str, Function0<Unit> function0, Function0<Unit> function02) throws JSONException {
        boolean z3;
        String str2;
        String str3;
        C0FWP c0fwpRi;
        C0FWP c0fwpRi2;
        if (z) {
            this.LLLLLLL = function0;
        }
        String speakerID = null;
        this.LLLLJI = null;
        InterfaceC1455860nzM interfaceC1455860nzMJ6 = J6();
        if (!z2 && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1456140nzo.LIZIZ(interfaceC1455860nzMJ6, z3, false, false, false, 12);
        C122Q c122qK7 = k7();
        if (c122qK7 != null) {
            c122qK7.pM(z);
        }
        C0FVT c0fvtN7 = n7();
        if (c0fvtN7 != null && (c0fwpRi2 = c0fvtN7.Ri()) != null) {
            c0fwpRi2.LJIILJJIL = z;
        }
        this.LLLLIIIILLL = false;
        int iIntValue = -16777216;
        if (z) {
            z8(str);
            show();
            if (textStickerData == null) {
                return;
            }
            C391040FUw.LIZ.getClass();
            C391040FUw.LIZJ(true);
            this.LLJJJIL = z2;
            i3(new AwS608S0100000_29(this, 397));
            d5(textStickerData);
            RC0(textStickerData, false, AFwS218S0000000_29.get$arr$(273));
            Window window = C1664590tQ1.LJII(this).getWindow();
            if (window != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bn, C1664590tQ1.LJII(this));
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                window.setNavigationBarColor(iIntValue);
            }
        } else {
            Da();
            InterfaceC1452170ntP value = J6().g().getValue();
            if (value != null) {
                value.setLoopPlay(true);
            }
            J6().vW1().setValue(C1452730nuJ.LIZ());
            ReadTextEffectBean readTextEffectBean = this.LLLLLLLZIL;
            String str4 = "";
            if (readTextEffectBean == null) {
                str2 = "";
                str3 = "";
            } else {
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                str3 = readTextEffectSpeakerExtra.speakreID;
                str2 = readTextEffectSpeakerExtra.speakerName;
            }
            function02.invoke();
            C0FVT c0fvtN72 = n7();
            if (c0fvtN72 != null && (c0fwpRi = c0fvtN72.Ri()) != null) {
                c0fwpRi.LJIIZILJ.LJIIJ(Unit.LIZ);
            }
            C0FWY c0fwy = C0FWY.LIZ;
            String str5 = LJJJLIIL().mShootWay;
            String strLJIILIIL = C1428470nHB.LJIILIIL(LJJJLIIL());
            String strLJIILL = C1428470nHB.LJIILL(LJJJLIIL());
            String creationId = LJJJLIIL().getCreationId();
            String str6 = LJJJLIIL().creativeModel.ttsModel.enterMethod;
            if (str6 != null) {
                str4 = str6;
            }
            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(str5, strLJIILIIL, strLJIILL, creationId, 0, 0, 0, 0, str4, null, null, null, null, 7920, null);
            c0fwy.getClass();
            C0FWY.LIZLLL(shortVideoCommonParams, str3, str2, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
            Window window2 = C1664590tQ1.LJII(this).getWindow();
            if (window2 != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e1, C1664590tQ1.LJII(this));
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                }
                window2.setNavigationBarColor(iIntValue);
            }
        }
        i3(new AwS41S0010000_29(z, 36));
        if (z) {
            InterfaceC19530111b1 interfaceC19530111b1S6 = S6();
            if (interfaceC19530111b1S6 != null) {
                C1419240n2I.LIZ(interfaceC19530111b1S6, true, false, false, null, false, 30);
            }
            if (this.LLJJJIL) {
                Z7();
                return;
            }
            InterfaceC1455860nzM interfaceC1455860nzMJ62 = J6();
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            int iLIZJ = ((int) C12ES.LIZJ(52.0f, C1664590tQ1.LJII(this))) + ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this));
            int iLIZJ2 = (int) C12ES.LIZJ(LLLLZIL, C1664590tQ1.LJII(this));
            int iL7 = L7();
            c0.LIZ.n2();
            interfaceC1455860nzMJ62.aM0(C1453170nv1.LIZIZ(iLIZIZ, iLIZJ, iLIZJ2, iL7, false, false, 1984));
            return;
        }
        if (this.LLJJJIL) {
            this.LLLLLLL.invoke();
            TextStickerData textStickerData2 = this.LLJJL;
            if (textStickerData2 != null) {
                speakerID = textStickerData2.getSpeakerID();
            }
            oc2(speakerID);
        } else {
            InterfaceC19530111b1 interfaceC19530111b1S62 = S6();
            if (interfaceC19530111b1S62 != null) {
                C1419240n2I.LIZ(interfaceC19530111b1S62, false, false, false, null, false, 30);
            }
            InterfaceC1455860nzM interfaceC1455860nzMJ63 = J6();
            int iLIZ = C960203pA.LIZ(R.attr.e1, C1664590tQ1.LJIIIZ(this));
            int iLIZJ3 = ((int) C12ES.LIZJ(52.0f, C1664590tQ1.LJII(this))) + ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this));
            int iLIZJ4 = (int) C12ES.LIZJ(LLLLZIL, C1664590tQ1.LJII(this));
            int iL72 = L7();
            c0.LIZ.n2();
            interfaceC1455860nzMJ63.aM0(C1453170nv1.LIZ(iLIZ, iLIZJ3, iLIZJ4, iL72));
        }
        i3(AFwS273S0000000_29.get$arr$(217));
    }

    public final void I9(int i, String str, int i2, ReadTextEffectBean readTextEffectBean, File file, long j) {
        List<String> urlList;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
        String str2 = readTextEffectSpeakerExtra.speakreID;
        String str3 = readTextEffectSpeakerExtra.streamTTSSpkID;
        String effect_id = readTextEffectBean.effect.getEffect_id();
        UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
        String str4 = null;
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
            str4 = (String) C13LP.LJJJLL(urlList);
        }
        String str5 = readTextEffectBean.mSpeaker.ttsAnchorName;
        String resource_id = readTextEffectBean.effect.getResource_id();
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBean.mSpeaker;
        C23250099c.LIZLLL(this.LLLIIIL, new C09ZQ(CoroutineExceptionHandler.LJJLIL, this, i2, readTextEffectBean), null, new C11Y9(file, i2, this, j, effect_id, str4, str5, resource_id, readTextEffectSpeakerExtra2.voiceCreatorUserName, readTextEffectSpeakerExtra2.voiceCreatorUserId, readTextEffectSpeakerExtra2.isCreatorVoice, readTextEffectSpeakerExtra2.ttsAnchorReleaseDate, readTextEffectSpeakerExtra2.ttsReleaseDate, readTextEffectBean, str2, str3, i, str, null), 2);
    }

    public final void j9(int i, String str, String str2, C11FI<TTSAudioParam, TextStickerData> c11fi, int i2, boolean z) {
        String str3;
        Integer numValueOf;
        Integer numValueOf2;
        String str4;
        int startTime;
        int iIntValue = i2;
        if (z) {
            ITTSService iTTSServiceY7 = y7();
            if (iTTSServiceY7 != null) {
                iTTSServiceY7.stopStreamReading();
            }
            O4(true, false, true, false, c11fi);
            return;
        }
        Boolean bool = null;
        if (i != 0) {
            if (i == 1) {
                String str5 = C09TA.LIZ;
                InterfaceC1452170ntP value = J6().g().getValue();
                if (value != null) {
                    numValueOf = Integer.valueOf(value.getDuration());
                } else {
                    numValueOf = null;
                }
                InterfaceC1452170ntP value2 = J6().g().getValue();
                if (value2 != null) {
                    numValueOf2 = Integer.valueOf(value2.LLL());
                } else {
                    numValueOf2 = null;
                }
                TextStickerData textStickerData = this.LLJJL;
                if (numValueOf != null && numValueOf2 != null && numValueOf.intValue() >= numValueOf2.intValue()) {
                    if (textStickerData != null) {
                        startTime = textStickerData.getStartTime();
                    } else {
                        startTime = 0;
                    }
                    int iIntValue2 = 400;
                    if (Math.abs(numValueOf2.intValue() - startTime) < 400) {
                        iIntValue2 = numValueOf2.intValue();
                        C201955140j.LIZLLL(C11YP.LIZIZ, C09TA.LIZ, "calculateNeedDelayOrSeekTime right time");
                    }
                    C11YP c11yp = C11YP.LIZIZ;
                    String str6 = C09TA.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("calculateNeedDelayOrSeekTime totalTime: ");
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(",ttsTotalTime:");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(" ,alreadyPlayTime:");
                    sbLIZ.append(numValueOf2);
                    sbLIZ.append(' ');
                    C201955140j.LIZLLL(c11yp, str6, C2188811AlT.LIZIZ(sbLIZ));
                    iIntValue = (numValueOf.intValue() - startTime) - iIntValue2 > 0 ? (numValueOf.intValue() - startTime) - iIntValue2 : numValueOf.intValue() - startTime;
                }
                C09TF c09tfLIZ = s7().LIZ(str, str2);
                String str7 = LLLLZI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preTask is stream non-ui apply: ");
                if (c09tfLIZ != null) {
                    str4 = c09tfLIZ.LIZ;
                } else {
                    str4 = null;
                }
                sbLIZ2.append(str4);
                sbLIZ2.append(",isApplyAudioTrack:");
                if (c09tfLIZ != null) {
                    bool = c09tfLIZ.LJ;
                }
                sbLIZ2.append(bool);
                C201955140j.LIZIZ(str7, C2188811AlT.LIZIZ(sbLIZ2));
                if (c09tfLIZ == null || Intrinsics.LJFF(c09tfLIZ.LJ, Boolean.TRUE) || c09tfLIZ == null) {
                    O4(false, true, true, this.LLLLIIIILLL, c11fi);
                    sa(str2, str, iIntValue);
                }
                C09TF c09tfLIZ2 = s7().LIZ(str, str2);
                if (c09tfLIZ2 != null) {
                    c09tfLIZ2.LJI = C09TL.SUC;
                    return;
                }
                return;
            }
            return;
        }
        C09TF c09tfLIZ3 = s7().LIZ(str, str2);
        String str8 = LLLLZI;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("preTask is non-stream non-ui apply: ");
        if (c09tfLIZ3 != null) {
            str3 = c09tfLIZ3.LIZ;
        } else {
            str3 = null;
        }
        sbLIZ3.append(str3);
        sbLIZ3.append(" ,isApplyAudioTrack:");
        if (c09tfLIZ3 != null) {
            bool = c09tfLIZ3.LJ;
        }
        sbLIZ3.append(bool);
        C201955140j.LIZIZ(str8, C2188811AlT.LIZIZ(sbLIZ3));
        if (c09tfLIZ3 == null || Intrinsics.LJFF(c09tfLIZ3.LJ, Boolean.TRUE) || c09tfLIZ3 == null) {
            O4(false, false, true, this.LLLLIIIILLL, c11fi);
        }
        C09TF c09tfLIZ4 = s7().LIZ(str, str2);
        if (c09tfLIZ4 != null) {
            c09tfLIZ4.LJI = C09TL.SUC;
        }
        ma(str, str2);
    }

    public final void n9(int i, String str, String str2, String str3, C11FI<TTSAudioParam, TextStickerData> c11fi, int i2) {
        String str4;
        String str5;
        String str6 = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processDifferentTTSWithOutUIResult start. ttsType:");
        sbLIZ.append(i);
        C201955140j.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ));
        Boolean bool = null;
        if (i != 0) {
            if (i == 1) {
                new BPEAHandler();
                if (this.LLLLIILL == null) {
                    InterfaceC1452170ntP value = J6().g().getValue();
                    if (value != null) {
                        value.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    }
                    o7().Gn();
                }
                C09TF c09tfLIZ = s7().LIZ(str, str3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preTask is stream in-ui apply: ");
                if (c09tfLIZ != null) {
                    str5 = c09tfLIZ.LIZ;
                } else {
                    str5 = null;
                }
                sbLIZ2.append(str5);
                sbLIZ2.append(" ,isApplyAudioTrack:");
                if (c09tfLIZ != null) {
                    bool = c09tfLIZ.LJ;
                }
                sbLIZ2.append(bool);
                C201955140j.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ2));
                if (c09tfLIZ == null || Intrinsics.LJFF(c09tfLIZ.LJ, Boolean.TRUE) || c09tfLIZ == null) {
                    O4(false, true, true, this.LLLLIIIILLL, c11fi);
                    sa(str3, str, i2);
                }
                C09TF c09tfLIZ2 = s7().LIZ(str2, str3);
                if (c09tfLIZ2 != null) {
                    c09tfLIZ2.LJI = C09TL.SUC;
                    return;
                }
                return;
            }
            return;
        }
        C09TF c09tfLIZ3 = s7().LIZ(str, str3);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("preTask is non-stream in-ui apply: ");
        if (c09tfLIZ3 != null) {
            str4 = c09tfLIZ3.LIZ;
        } else {
            str4 = null;
        }
        sbLIZ3.append(str4);
        sbLIZ3.append(" ,isApplyAudioTrack:");
        if (c09tfLIZ3 != null) {
            bool = c09tfLIZ3.LJ;
        }
        sbLIZ3.append(bool);
        C201955140j.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ3));
        if (c09tfLIZ3 != null && !Intrinsics.LJFF(c09tfLIZ3.LJ, Boolean.TRUE) && c09tfLIZ3 != null) {
            return;
        }
        O4(false, false, true, this.LLLLIIIILLL, c11fi);
    }

    public final void t9(String str, int i, String str2, String str3, int i2, ReadTextEffectBean readTextEffectBean) {
        C5(i2, str2, i, str3, readTextEffectBean);
        InterfaceC497601wk interfaceC497601wk = this.LLLIIIL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C11FF(this, readTextEffectBean, str, null), 2);
    }

    public static final void P9(C11Y7 c11y7, int i, String str, File file, String str2, String str3, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, TextStickerData textStickerData, long j, CoroutineExceptionHandler coroutineExceptionHandler, Function0 function0) {
        String str4 = LLLLZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processTtsWithOutUISucResult start. ttsFile:");
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append(" cancelThisTask:");
        sbLIZ.append(c11y7.LLLLLLZZ);
        C201955140j.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(c11y7.LLLIIIL, coroutineExceptionHandler, null, new C11Y8(c11y7, j, file, function0, textStickerData, str, str2, kevaSpeakerBean, str3, i, null), 2);
    }
}
