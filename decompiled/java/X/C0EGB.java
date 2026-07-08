package X;

import Y.ACallableS238S0200000_5;
import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS14S0400000_5;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResFillMode;
import com.bytedance.ies.nle.editor_jni.NLEResizeAlgorithm;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EGB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EGB extends AbstractC381020Ewm<C0EC7> implements C0EC7, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final int LLLIILIL;
    public final C1DRG LLILLL;
    public final C372480Ej0 LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public String LLILZLL;
    public final C01GW LLIZ;
    public C355570Dwp LLIZLLLIL;
    public C0E6Y LLJ;
    public C0EGC LLJI;
    public final ArrayList<AVMusic> LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final NLEEditorListener LLJJL;
    public final C361650EFv LLJJLIIIJLLLLLLLZ;
    public final C0EGI LLJL;
    public boolean LLJLIL;
    public Long LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public C348650Dlf LLJLLL;
    public Runnable LLJZ;
    public Runnable LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public final Map<String, InterfaceC2257101DWa> LLLFF;
    public final C01GW LLLFFI;
    public C0EBB LLLFZ;
    public SoftKeyBoardListener LLLI;
    public C0EGD LLLII;
    public boolean LLLIIII;
    public C1465100oEG LLLIIIIL;
    public long LLLIIIL;

    public C0EC7 T2() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EGB.class, "textNewApi", "getTextNewApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EGB.class, "infoStickerApi", "getInfoStickerApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EGB.class, "lyricStickerApi", "getLyricStickerApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EGB.class, "stickerApi", "getStickerApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EGB.class, "editorProVoiceClonePanelApi", "getEditorProVoiceClonePanelApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/voiceclone/EditorProVoiceClonePanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EGB.class, "multiMusicApi", "getMultiMusicApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/music/ui/EditorProMultiMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0EGB.class, "videoSizeProvider", "getVideoSizeProvider$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0EGB.class, "epPanelApi", "getEpPanelApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0EGB.class, "trackPanelApi", "getTrackPanelApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0EGB.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0EGB.class, "previewPanel", "getPreviewPanel$tools_camera_edit_release()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C0EGB.class, "controlBar", "getControlBar$tools_camera_edit_release()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C0EGB.class, "epLoaderApi", "getEpLoaderApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C0EGB.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14};
        LLLIILIL = 8;
    }

    private final InterfaceC359950E9h H4() {
        return (InterfaceC359950E9h) this.LLJLLIL.getValue(this, LLLIIL[13]);
    }

    private final C0EGY q3() {
        return (C0EGY) this.LLJJJ.getValue(this, LLLIIL[9]);
    }

    public final VideoPublishEditModel B3() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final C358780E4u C5() {
        return (C358780E4u) this.LLJJJJLIIL.getValue();
    }

    public final InterfaceC361710EGb D5() {
        return (InterfaceC361710EGb) this.LLJJJIL.getValue(this, LLLIIL[10]);
    }

    public final InterfaceC362470EIz H3() {
        return (InterfaceC362470EIz) this.LLJJI.getValue(this, LLLIIL[4]);
    }

    public final C0EOK H5() {
        return (C0EOK) this.LLJJ.getValue(this, LLLIIL[3]);
    }

    public final void I7() {
        C0EGD c0egd = this.LLLII;
        boolean z = c0egd.LIZ || c0egd.LIZIZ || c0egd.LIZJ || c0egd.LIZLLL || c0egd.LJ;
        C0E5S c0e5sR5 = R5();
        if (c0e5sR5 != null) {
            c0e5sR5.Xa2(new AwS20S0010000_5(z, 43));
        }
    }

    public final C19GS L7() {
        return (C19GS) this.LLILZ.requireActivity();
    }

    public final C0EJ3 M5() {
        return (C0EJ3) this.LLJILJIL.getValue(this, LLLIIL[0]);
    }

    public final InterfaceC363820EOe P4() {
        return (InterfaceC363820EOe) this.LLJILJILJ.getValue(this, LLLIIL[1]);
    }

    public final void P6() {
        C361730EGd c361730EGd;
        C19GS c19gsW2;
        C1DRG c1drgLJIIIZ;
        InterfaceC1455860nzM interfaceC1455860nzM;
        C0E48 c0e48O3;
        CreativeModel creativeModel;
        SoundEffectInfoModel soundEffectInfoModel;
        List<SoundEffect> list;
        CreativeModel creativeModel2;
        SoundEffectInfoModel soundEffectInfoModel2;
        List<SoundEffect> list2;
        if (this.LLILZ.mActivity == null || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            C201955140j.LJIJ("EPSceneLegacyComponent", "initWhenFirstEnter skipped: scene detached or component destroyed");
            return;
        }
        C359780E8q.LIZ("EPSceneLegacyComponent.registerEPSceneLegacyLiveDataEvents", new AwS549S0100000_5(this, 928));
        C359780E8q.LIZ("TikTokEditorPlayground start", new AwS549S0100000_5(this, 1249));
        C359780E8q.LIZ("initMusicController", new AwS549S0100000_5(this, 1250));
        D5().wF();
        C359780E8q.LIZ("initTextSticker", new AwS549S0100000_5(this, 1251));
        C0E48 c0e48O32 = O3();
        if (c0e48O32 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48O32);
            C350110Do1.LIZLLL(nLEModelLJI, L7());
            this.LLJLLL.LJ(nLEModelLJI);
        }
        C356690Dyd c356690Dyd = new C356690Dyd(L7(), C5(), O3());
        C0E6D c0e6d = C0E6D.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("soundEffectList: ");
        C0E1T c0e1t = EditModelProvider.Companion;
        c0e1t.getClass();
        VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
        sbLIZ.append((editModel == null || (creativeModel2 = editModel.creativeModel) == null || (soundEffectInfoModel2 = creativeModel2.soundEffectInfoModel) == null || (list2 = soundEffectInfoModel2.soundEffectList) == null) ? null : list2.toString());
        C356530DyN.LIZIZ(c0e6d, "initSoundEffect", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) c356690Dyd.LIZJ).clear();
        c0e1t.getClass();
        VideoPublishEditModel editModel2 = C0E1T.LIZ().getEditModel();
        if (editModel2 != null && (creativeModel = editModel2.creativeModel) != null && (soundEffectInfoModel = creativeModel.soundEffectInfoModel) != null && (list = soundEffectInfoModel.soundEffectList) != null) {
            ((ArrayList) c356690Dyd.LIZJ).addAll(list);
        }
        Iterator it2 = ((ArrayList) c356690Dyd.LIZJ).iterator();
        while (it2.hasNext()) {
            C356680Dyc.LIZ((SoundEffect) it2.next());
        }
        this.LLLFZ = c356690Dyd;
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setSoundEffectController(this.LLLFZ);
        C359780E8q.LIZ("initAIMattingIfNeed", new AwS549S0100000_5(this, 1252));
        N6();
        if (C0E1T.LIZ().getFilterController$tools_camera_edit_release() == null && (c19gsW2 = W2()) != null && (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this.LLILZ)) != null && (interfaceC1455860nzM = (InterfaceC1455860nzM) c1drgLJIIIZ.LJIIL(null, InterfaceC1455860nzM.class)) != null && (c0e48O3 = O3()) != null) {
            EditModelProvider editModelProviderLIZ = C0E1T.LIZ();
            NLEEditor nLEEditorLJI = c0e48O3.LLFII().LJI();
            INLEMediaSession iNLEMediaSessionF1 = c0e48O3.f1();
            editModelProviderLIZ.setFilterController$tools_camera_edit_release(new C355510Dwj(c19gsW2, interfaceC1455860nzM, null, nLEEditorLJI, iNLEMediaSessionF1 != null ? iNLEMediaSessionF1.getPlayerApi() : null, new C350520Dog(c0e48O3), c0e48O3));
        }
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege != null && (c361730EGd = c0ege.LJIIIZ) != null) {
            c361730EGd.setInterceptListener(new AwS584S0100000_5(this, 977));
        }
        L7();
        y7();
        u7();
        o7(null);
        this.LLILZIL.setValue(Boolean.TRUE);
    }

    public final C0EK4 Q3() {
        return (C0EK4) this.LLLFFI.getValue();
    }

    public final C0E5S R5() {
        return (C0E5S) this.LLJJIJIL.getValue(this, LLLIIL[8]);
    }

    public final boolean T6() {
        long videoLength;
        Long l = this.LLJLILLLLZIIL;
        if (l != null) {
            videoLength = l.longValue();
        } else {
            VideoPublishEditModel videoPublishEditModelB3 = B3();
            if (videoPublishEditModelB3 == null) {
                return true;
            }
            videoLength = videoPublishEditModelB3.getVideoLength();
        }
        return videoLength < 60000;
    }

    public final InterfaceC1444130ngR U5() {
        return (InterfaceC1444130ngR) this.LLJJIJI.getValue(this, LLLIIL[6]);
    }

    @Override // X.C0EC7
    public View Wq() {
        return this.LLILZ.Wq();
    }

    public final C0EFX c3() {
        return (C0EFX) this.LLJJJJJIL.getValue();
    }

    public final C0EHC k5() {
        return (C0EHC) this.LLJILLL.getValue(this, LLLIIL[2]);
    }

    public final C0EGQ n5() {
        return (C0EGQ) this.LLJJIII.getValue(this, LLLIIL[5]);
    }

    public final void n7() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        C11VK c11vk = C11VK.LIZ;
        VideoPublishEditModel videoPublishEditModelB3 = B3();
        boolean z = (videoPublishEditModelB3 == null || (creativeModel = videoPublishEditModelB3.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true;
        c11vk.getClass();
        C11VK.LJ("editor_pro_sound", "click", z);
        InterfaceC362470EIz interfaceC362470EIzH3 = H3();
        if (interfaceC362470EIzH3 != null) {
            interfaceC362470EIzH3.aI2(true, EnumC361800EGk.SOUND);
        }
    }

    public final C0EGH o2() {
        return (C0EGH) this.LLIZ.getValue();
    }

    public final C0EY2 o4() {
        return (C0EY2) this.LLJLL.getValue(this, LLLIIL[12]);
    }

    public final InterfaceC360800ECo v3() {
        return (InterfaceC360800ECo) this.LLJJJJ.getValue(this, LLLIIL[11]);
    }

    public final C0EB6 z4() {
        return (C0EB6) this.LLJJIJIIJIL.getValue(this, LLLIIL[7]);
    }

    private final void m6() {
        C0E6Y c0e6y;
        if (C357540E0a.LIZIZ(B3())) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            if (C354090DuR.LJIIIZ(W1()).isEmpty() && (c0e6y = this.LLJ) != null) {
                C337180DJs.LIZ(c0e6y.LIZLLL);
                c0e6y.LIZ();
                C354090DuR.LIZ.clear();
            }
            C0E6Y c0e6y2 = this.LLJ;
            if (c0e6y2 != null) {
                C354090DuR.LJIILJJIL(c0e6y2.LJII);
            }
        }
    }

    public final void Aq() {
        C372830EjZ c372830EjZ;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C5().LLJJIII = false;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Ej(this.LLJJL);
        }
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege == null || (c372830EjZ = c0ege.LJIIJ) == null) {
            return;
        }
        View controlLayout = c372830EjZ.getControlLayout();
        if ((controlLayout instanceof ViewGroup) && (viewGroup2 = (ViewGroup) controlLayout) != null && this.LLL == null) {
            View view = new View(viewGroup2.getContext());
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0EGN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
            this.LLL = view;
            viewGroup2.addView(view);
        }
        View previewLayout = c372830EjZ.getPreviewLayout();
        if ((previewLayout instanceof ViewGroup) && (viewGroup = (ViewGroup) previewLayout) != null && this.LLLF == null) {
            View view2 = new View(viewGroup.getContext());
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0EGO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                }
            }, view2);
            this.LLLF = view2;
            viewGroup.addView(view2);
        }
    }

    public final Lifecycle F4() {
        return getLifecycle();
    }

    public final void J6() {
        ViewGroup viewGroup;
        TuxIconView tuxIconView;
        C0EK4 c0ek4Q3 = Q3();
        c0ek4Q3.getClass();
        if (!C357540E0a.LIZIZ(c0ek4Q3.LIZIZ()) || C301700Bs8.LIZ()) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            C354090DuR.LJIILIIL(c0ek4Q3.LIZ());
            C354090DuR.LJIILL(c0ek4Q3.LIZ());
        } else {
            C0E6Y c0e6y = c0ek4Q3.LIZ.LLJ;
            if (c0e6y != null) {
                C337180DJs.LIZ(c0e6y.LIZLLL);
                c0e6y.LIZ();
                C354090DuR.LIZ.clear();
            }
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet2 = C354090DuR.LIZ;
            C354090DuR.LJIIJ(c0ek4Q3.LIZ());
            C0E48 c0e48LIZ = c0ek4Q3.LIZ();
            if (c0e48LIZ == null) {
                return;
            }
            View view = c0ek4Q3.LIZ.LLILZ.mView;
            if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.gtq)) != null) {
                C0EGB c0egb = c0ek4Q3.LIZ;
                if (c0egb.LLJ == null) {
                    c0egb.LLJ = new C0E6Y(c0e48LIZ);
                }
                C0EGB c0egb2 = c0ek4Q3.LIZ;
                C0E6Y c0e6y2 = c0egb2.LLJ;
                if (c0e6y2 != null) {
                    InterfaceC361710EGb interfaceC361710EGbD5 = c0egb2.D5();
                    C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
                    Context contextLIZ = C351010DpT.LIZ().LIZ();
                    C354090DuR.LJIILIIL(c0e6y2.LIZ);
                    View viewFindViewById = viewGroup.findViewById(R.id.ap8);
                    c0e6y2.LIZJ = viewFindViewById;
                    if (viewFindViewById == null) {
                        try {
                            c0e6y2.LIZJ = C786410Ut5.LJLLJ(contextLIZ, R.layout.bz7, null);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                            viewGroup.addView(c0e6y2.LIZJ, layoutParams);
                        } catch (InflateException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C1295960jpS c1295960jpS = (C1295960jpS) viewGroup.findViewById(R.id.ap6);
                    c0e6y2.LJ = c1295960jpS;
                    if (c1295960jpS != null) {
                        c1295960jpS.setAnimation("creation_ep_cutout_loading_tux_lottie.json");
                    }
                    C1295960jpS c1295960jpS2 = c0e6y2.LJ;
                    if (c1295960jpS2 != null) {
                        c1295960jpS2.setRepeatMode(1);
                    }
                    C1295960jpS c1295960jpS3 = c0e6y2.LJ;
                    if (c1295960jpS3 != null) {
                        c1295960jpS3.setRepeatCount(-1);
                    }
                    C1295960jpS c1295960jpS4 = c0e6y2.LJ;
                    if (c1295960jpS4 != null) {
                        HandlerHook.viewPost(c1295960jpS4, new ARunnableS74S0200000_5(c0e6y2, interfaceC361710EGbD5, 53));
                    }
                    View viewFindViewById2 = viewGroup.findViewById(R.id.ap7);
                    c0e6y2.LIZLLL = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        C337180DJs.LIZ(viewFindViewById2);
                    }
                    View view2 = c0e6y2.LIZLLL;
                    c0e6y2.LIZIZ = view2 != null ? (TuxTextView) view2.findViewById(R.id.gus) : null;
                    View view3 = c0e6y2.LIZLLL;
                    c0e6y2.LJFF = view3 != null ? (TuxIconView) view3.findViewById(R.id.gur) : null;
                    CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet3 = C354090DuR.LIZ;
                    C354090DuR.LJIILL(c0e6y2.LIZ);
                    C354090DuR.LJIILJJIL(c0e6y2.LJII);
                    Context context = viewGroup.getContext();
                    if (c0e6y2.LJIIIIZZ == null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C0EGK.LIZ(20);
                        c419910GdJ.LIZJ = C0EGK.LIZ(20);
                        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.eg);
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LJII = C0EGK.LIZ(28);
                        c384050F3z.LJI = C0EGK.LIZ(28);
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
                        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                        c0e6y2.LJIIIIZZ = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                    }
                    Drawable drawable = c0e6y2.LJIIIIZZ;
                    if (drawable != null && (tuxIconView = c0e6y2.LJFF) != null) {
                        tuxIconView.setImageDrawable(drawable);
                    }
                    TuxIconView tuxIconView2 = c0e6y2.LJFF;
                    if (tuxIconView2 != null) {
                        C786410Ut5.I7(new C391500FWq(c0e6y2, 2), tuxIconView2);
                    }
                }
            }
        }
        C569610MVr.LIZ(LifecycleOwnerKt.getLifecycleScope(c0ek4Q3.LIZ), c0ek4Q3.LIZ.LLILZ.requireSceneContext());
    }

    @Override // X.C0EC7
    public C0EGH K10() {
        return o2();
    }

    public final InterfaceC359850E8x K4() {
        return q3().B20();
    }

    public final void K6() {
        VecNLETrackSPtr tracks;
        C0EK4 c0ek4Q3 = Q3();
        c0ek4Q3.LIZ.LLJI = new C363230ELx(c0ek4Q3.LIZ.L7(), c0ek4Q3.LIZ.C5(), c0ek4Q3.LIZ(), c0ek4Q3.LIZ.LLILZ);
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setMusicController(c0ek4Q3.LIZ.LLJI);
        c0ek4Q3.LJI();
        C0EGC c0egc = c0ek4Q3.LIZ.LLJI;
        if (c0egc != null) {
            c0egc.h1(new AwS549S0100000_5(c0ek4Q3, 1248));
        }
        VideoPublishEditModel videoPublishEditModelLIZIZ = c0ek4Q3.LIZIZ();
        if (videoPublishEditModelLIZIZ != null) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelLIZIZ.creativeModel.musicBuzModel);
            String strLJFF = C1444820nhY.LJFF(aVMusicExtractAVMusic);
            C363500EMy.LIZ.getClass();
            if (C363500EMy.LJIIJ(videoPublishEditModelLIZIZ) && videoPublishEditModelLIZIZ.hasMusic() && aVMusicExtractAVMusic != null && C123100dR.LIZ(strLJFF)) {
                C0E48 c0e48LIZ = c0ek4Q3.LIZ();
                if (c0e48LIZ != null && (tracks = C350870DpF.LJI(c0e48LIZ).getTracks()) != null && !tracks.isEmpty()) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        if (C351220Dpo.LLLFF(it2.next())) {
                            return;
                        }
                    }
                }
                C0EGC c0egc2 = c0ek4Q3.LIZ.LLJI;
                if (c0egc2 != null) {
                    c0egc2.X0(aVMusicExtractAVMusic, strLJFF, 0L, 0L, false, EnumC356070Dxd.NONE, true, true);
                }
            }
        }
    }

    public final void L6() {
        Q3().LIZJ();
    }

    public final void N6() {
        Q3().LIZLLL();
    }

    public final C0E48 O3() {
        return W1();
    }

    public final boolean S6() {
        LiveState<TrackShowType> liveStateQ82;
        C0E5S c0e5sR5 = R5();
        return ((c0e5sR5 == null || (liveStateQ82 = c0e5sR5.Q82()) == null) ? null : liveStateQ82.LIZJ()) == TrackShowType.NORMAL;
    }

    public final C19GS W2() {
        Activity activityLJII = C1664590tQ1.LJII(this);
        if (activityLJII instanceof C19GS) {
            return (C19GS) activityLJII;
        }
        return null;
    }

    public final void W6() {
        C0E55 player;
        C0EK4 c0ek4Q3 = Q3();
        C0E48 c0e48LIZ = c0ek4Q3.LIZ();
        if (c0e48LIZ != null && (player = c0e48LIZ.getPlayer()) != null) {
            player.pause(false);
        }
        C0EGC c0egc = c0ek4Q3.LIZ.LLJI;
        if (c0egc != null) {
            c0egc.Y0(null, true, true);
        }
    }

    public final Window d6() {
        return L7().getWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7() {
        /*
            r5 = this;
            X.0EK4 r1 = r5.Q3()
            X.0E48 r0 = r1.LIZ()
            r4 = 0
            if (r0 == 0) goto L14
            X.0E55 r0 = r0.getPlayer()
            if (r0 == 0) goto L14
            r0.pause(r4)
        L14:
            X.0EGB r0 = r1.LIZ
            X.0EGC r3 = r0.LLJI
            if (r3 == 0) goto L48
            X.0E48 r2 = r1.LIZ()
            if (r2 == 0) goto L49
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = r2.Pt()
            if (r1 == 0) goto L49
            boolean r0 = X.C351220Dpo.LLLFF(r1)
            if (r0 == 0) goto L49
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r1.getSlots()
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L49
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r2 = r2.LLLLLLIL()
            if (r2 == 0) goto L49
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L49
        L44:
            r0 = 1
            r3.Y0(r2, r4, r0)
        L48:
            return
        L49:
            r2 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EGB.d7():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H4().QO0().observe(this, new AObserverS209S0100000_5(this, 106));
        H4().JI().LIZ(this, new AObjectS240S0100000_5(this, 141));
        H4().Dx0().LIZ(this, new AObjectS240S0100000_5(this, 142));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        INLEMattingRuntime mattingApi;
        C0E55 player;
        MutableLiveData mutableLiveDataLIZLLL;
        super.onDestroy();
        SoftKeyBoardListener softKeyBoardListener = this.LLLI;
        if (softKeyBoardListener != null) {
            softKeyBoardListener.LIZ();
        }
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJI) {
            C0F1Z.LIZ.getClass();
            C0F1Z.LIZJ = null;
        } else {
            C0F1Z.LIZ.getClass();
            C0F1Z.LIZJ = null;
            C0F1Z.LIZIZ = null;
            C0F1Z.LIZLLL = null;
            C0F1Z.LJ = null;
            C0F1Z.LJFF = null;
            C0F1Z.LJIIL = false;
            C0F1Z.LJIIIIZZ = null;
            C0F1Z.LJIIIZ.clear();
        }
        C1465100oEG c1465100oEG = this.LLLIIIIL;
        if (c1465100oEG != null) {
            C1465110oEH c1465110oEH = c1465100oEG.LIZJ;
            C0E48 c0e48 = c1465110oEH.LIZJ;
            if (c0e48 != null && (player = c0e48.getPlayer()) != null && (mutableLiveDataLIZLLL = player.LIZLLL()) != null) {
                mutableLiveDataLIZLLL.removeObservers(c1465110oEH.LIZ);
            }
            InterfaceC1459070o4X interfaceC1459070o4X = c1465110oEH.LJFF;
            if (interfaceC1459070o4X != null) {
                interfaceC1459070o4X.destroy();
            }
        }
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        INLEMediaSession iNLEMediaSessionLJIIIIZZ = C354090DuR.LJIIIIZZ(W1());
        if (iNLEMediaSessionLJIIIIZZ != null && (mattingApi = iNLEMediaSessionLJIIIIZZ.getMattingApi()) != null) {
            mattingApi.removeMattingListener();
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Ej(this.LLJJL);
        }
        C0EGC c0egc = this.LLJI;
        if (c0egc != null) {
            c0egc.onDestroy();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (H4().gn1()) {
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                c0e48W1.S7().LIZIZ(Boolean.FALSE, "is_showing_album_page", false);
            }
            C0E48 c0e48W12 = W1();
            if (c0e48W12 != null) {
                C0ELN.LIZ(C350870DpF.LJI(c0e48W12), this.LLILZ);
            }
        }
        Runnable runnable = this.LLJZIJLIL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLJZIJLIL = null;
        Runnable runnable2 = this.LLJZ;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.LLJZ = null;
        m6();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Bo().LIZLLL(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Bo().LIZJ(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    public final void s7() {
        InterfaceC359940E9g interfaceC359940E9gAZ0 = q3().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LJFF();
        }
    }

    public final void u6() {
        C0EGE c0ege = Q3().LIZ.LLILZ.LLLILZ;
        if (c0ege != null) {
            C786410Ut5.LJLLLLLL(8, c0ege.LJII);
            C786410Ut5.LLZZLLIL(c0ege.LJI, 8);
            C786410Ut5.LLLLZLL(c0ege.LJFF, 8);
        }
    }

    public final void u7() {
        if (C0BNE.LIZ()) {
            C201955140j.LIZIZ("EPSceneLegacyComponent", "CancelTextFontPreDownloadExp is enable, skip download edit pro text font.");
            return;
        }
        VideoPublishEditModel videoPublishEditModelB3 = B3();
        if (videoPublishEditModelB3 == null || !C1416310mxZ.LJIIZILJ(videoPublishEditModelB3)) {
            return;
        }
        C0FI2.LJIJJLI("editor_pro_font_panel").LJJIL(C1664590tQ1.LJIIIIZZ(this), Boolean.TRUE);
    }

    @Override // X.C0EC7
    public C358780E4u xJ2() {
        return C5();
    }

    public final void y7() {
        if (!C0BNE.LIZ()) {
            C0FI2.LJIJJ().LJJIL(C1664590tQ1.LJIIIIZZ(this), Boolean.TRUE);
        } else {
            C201955140j.LIZIZ("EPSceneLegacyComponent", "CancelTextFontPreDownloadExp is enable, skip download text font.");
            C0FI2.LJIJJ().LIZIZ();
        }
    }

    public final C1465100oEG E3() {
        return this.LLLIIIIL;
    }

    public final C0EBB E5() {
        return this.LLLFZ;
    }

    public final Runnable G2() {
        return this.LLJZ;
    }

    public final C0E6Y H2() {
        return this.LLJ;
    }

    public final Long N5() {
        return this.LLJLILLLLZIIL;
    }

    public final C0EGD O4() {
        return this.LLLII;
    }

    public final C355570Dwp S5() {
        return this.LLIZLLLIL;
    }

    public MutableLiveData<Boolean> T4() {
        return this.LLILZIL;
    }

    @Override // X.C0EC7
    public C0EXJ Vi0() {
        return this.LLJLLL;
    }

    public final long Z4() {
        return this.LLLIIIL;
    }

    public final boolean d5() {
        return this.LLJLIL;
    }

    public final Map<String, InterfaceC2257101DWa> e4() {
        return this.LLLFF;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        T2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0EC7
    public C355570Dwp getEffectController() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0EC7
    public C0EGC getMusicController() {
        return this.LLJI;
    }

    public final C348650Dlf i3() {
        return this.LLJLLL;
    }

    public final Runnable m3() {
        return this.LLJZIJLIL;
    }

    @Override // X.C0EC7
    public String mw2() {
        return this.LLILZLL;
    }

    public final C0EGC t5() {
        return this.LLJI;
    }

    public final NLEEditorListener v5() {
        return this.LLJJL;
    }

    public final boolean w2() {
        return this.LLLIIII;
    }

    public final C372480Ej0 x5() {
        return this.LLILZ;
    }

    @Override // X.C0EC7
    public /* bridge */ /* synthetic */ LiveData xi1() {
        return this.LLILZIL;
    }

    public final void J8(C0EGC c0egc) {
        this.LLJI = c0egc;
    }

    @Override // X.C0EC7
    public Boolean Jn2(boolean z) {
        Boolean boolValueOf;
        C361730EGd c361730EGd;
        C361730EGd c361730EGd2;
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege != null && (c361730EGd2 = c0ege.LJIIIZ) != null) {
            boolValueOf = Boolean.valueOf(c361730EGd2.isMotionEventSplittingEnabled());
        } else {
            boolValueOf = null;
        }
        C0EGE c0ege2 = this.LLILZ.LLLILZ;
        if (c0ege2 != null && (c361730EGd = c0ege2.LJIIIZ) != null) {
            c361730EGd.setMotionEventSplittingEnabled(z);
        }
        return boolValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    @Override // X.C0EC7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LLLLILI(final android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EGB.LLLLILI(android.os.Bundle):boolean");
    }

    public final void P8(C0EBB c0ebb) {
        this.LLLFZ = c0ebb;
    }

    public final void T8(Long l) {
        this.LLJLILLLLZIIL = l;
    }

    public final void W7(boolean z) {
        this.LLLIIII = z;
    }

    public final void X1(long j) {
        long jLongValue;
        String strLIZIZ;
        String str;
        int size;
        List<StickerItemModel> list;
        C0EHI value = o4().zu2().getValue();
        if (value == null) {
            return;
        }
        C0ELJ c0elj = value.LJ;
        VideoPublishEditModel videoPublishEditModel = value.LIZ.LIZ;
        boolean zIsSlideInto = c0elj.isSlideInto();
        Long l = this.LLILZ.LLJLILLLLZIIL.LIZLLL;
        if (l != null && !zIsSlideInto) {
            jLongValue = j - l.longValue();
        } else {
            jLongValue = 0;
        }
        C0EGJ c0egj = this.LLILZ.LLJLILLLLZIIL;
        C0EGR c0egr = C0EGR.LIZ;
        boolean needStartEditorProImmediately = c0elj.getNeedStartEditorProImmediately();
        long j2 = c0egj.LIZIZ;
        boolean z = c0egj.LIZ;
        C0ELK performanceEnterFrom = c0elj.getPerformanceEnterFrom();
        Long l2 = c0egj.LJFF;
        boolean z2 = c0egj.LJI;
        c0egr.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        if (needStartEditorProImmediately) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobFirstFrameRun: ");
            sbLIZ.append(performanceEnterFrom.getMobName());
            sbLIZ.append(" ,cost: ");
            sbLIZ.append(j2);
            sbLIZ.append(", veFrameCost: ");
            sbLIZ.append(l2);
            sbLIZ.append(", animFinishCost: ");
            sbLIZ.append(jLongValue);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mobFirstFrameRun: ");
            sbLIZ2.append(performanceEnterFrom.getMobName());
            sbLIZ2.append(" ,cost: ");
            sbLIZ2.append(j2);
            sbLIZ2.append(" , animFinishCost: ");
            sbLIZ2.append(jLongValue);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C201955140j.LIZLLL(c563650M8t, "Local_Performance_Log", strLIZIZ);
        if (j2 > 0) {
            C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModel);
            c0labLIZIZ.LIZIZ(j2, "first_draw_duration");
            c0labLIZIZ.LJ("enter_editor_pro_method", performanceEnterFrom.getMobName());
            c0labLIZIZ.LIZIZ(jLongValue, "animation_finish_cost");
            String str2 = "1";
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLIZIZ.LJ("is_first_enter_ep", str);
            InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c0labLIZIZ.LIZ(size, "text_and_captions_cnt");
            if (!z2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLIZIZ.LJ("is_video_compressed", str2);
            if (needStartEditorProImmediately && l2 != null) {
                c0labLIZIZ.LIZIZ(l2.longValue(), "first_frame_duration_ve");
            }
            C20684815ws.LJIILLIIL("tool_performance_edit_pro_first_frame", c0labLIZIZ.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z1(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EGB.Z1(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public final void Z7(Runnable runnable) {
        this.LLJZ = runnable;
    }

    public final void a9(C355570Dwp c355570Dwp) {
        this.LLIZLLLIL = c355570Dwp;
    }

    public final boolean c9(C0EGS c0egs) {
        View view;
        C0EK4 c0ek4Q3 = Q3();
        c0ek4Q3.getClass();
        if (C0EGG.LIZ(c0egs)) {
            C0EGE c0ege = c0ek4Q3.LIZ.LLILZ.LLLILZ;
            if (c0ege != null && (view = c0ege.LJII) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            InterfaceC2257101DWa interfaceC2257101DWa = c0ek4Q3.LIZ.LLLFF.get(c0egs.LIZ);
            if (interfaceC2257101DWa != null) {
                c0ek4Q3.LJFF(interfaceC2257101DWa);
            }
            C15O7.LIZJ(new ACallableS238S0200000_5(c0ek4Q3, c0egs, 3)).LJ(new C0FXB(c0ek4Q3, c0egs, 3), C15O7.LJIIIIZZ, null);
            return true;
        }
        C0EGE c0ege2 = c0ek4Q3.LIZ.LLILZ.LLLILZ;
        if (c0ege2 == null) {
            return false;
        }
        C786410Ut5.LJLLLLLL(8, c0ege2.LJII);
        C786410Ut5.LLZZLLIL(c0ege2.LJI, 8);
        C786410Ut5.LLLLZLL(c0ege2.LJFF, 8);
        return false;
    }

    public final void d8(C0E6Y c0e6y) {
        this.LLJ = c0e6y;
    }

    public final void h8(C348650Dlf c348650Dlf) {
        this.LLJLLL = c348650Dlf;
    }

    @Override // X.C0EC7
    public boolean jU1(NLEModel nLEModel) {
        return this.LLJLLL.LIZLLL(nLEModel);
    }

    public final void k7(C357920E1m c357920E1m) {
        C0EK4 c0ek4Q3 = Q3();
        c0ek4Q3.getClass();
        if (System.currentTimeMillis() - c0ek4Q3.LIZ.LLLIIIL > 600) {
            C354270Duj.LIZJ(0L, new AwS406S0200000_5(c0ek4Q3, c357920E1m, 128));
        }
    }

    public final void o7(Long l) {
        boolean z;
        C372830EjZ c372830EjZ;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C0E48 c0e48W1;
        InterfaceC359940E9g interfaceC359940E9gAZ0;
        RecyclerView recyclerViewLLII;
        C0E48 c0e48W12;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaSettings mediaSettingApi;
        C0EGE c0ege;
        View view;
        C0EHI value = o4().zu2().getValue();
        if (value == null) {
            return;
        }
        C0ELJ c0elj = value.LJ;
        VideoPublishEditModel videoPublishEditModel = value.LIZ.LIZ;
        if (l == null) {
            C0EHK.LJIIJ(q3().jq2(), this, new AObserverS209S0100000_5(this, 107));
        } else {
            X1(l.longValue());
        }
        if (c0elj.getNeedStartEditorProImmediately() && (c0ege = this.LLILZ.LLLILZ) != null && (view = c0ege.LJIIIIZZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C5().LLJLILLLLZIIL = c0elj.getEffectMultiTrackMode();
        C5().LLJLL = c0elj.getRetouchMultiTrackMode();
        C358780E4u c358780E4uC5 = C5();
        if (c0elj.getChangeBanMusicMode() != null) {
            z = true;
        } else {
            z = false;
        }
        c358780E4uC5.LLJLLIL = z;
        C0E9S.LIZ(this);
        if (C389790FQb.LIZIZ && (c0e48W12 = W1()) != null && (iNLEMediaSessionF1 = c0e48W12.f1()) != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
            mediaSettingApi.setImageResizeInfo(0, 0, NLEResFillMode.RES_FILL_MODE_ASPECT_FIT, NLEResizeAlgorithm.RESIZE_ALGORITHM_BILINEAR);
        }
        if (!value.LIZ.LIZ.isRetakeVideo() && (c0e48W1 = W1()) != null && (interfaceC359940E9gAZ0 = q3().AZ0()) != null && (recyclerViewLLII = interfaceC359940E9gAZ0.LLII()) != null) {
            HandlerHook.viewPost(recyclerViewLLII, new ARunnableS14S0400000_5(recyclerViewLLII, c0e48W1, interfaceC359940E9gAZ0, videoPublishEditModel, 10));
        }
        C0E48 c0e48W13 = W1();
        if (c0e48W13 != null) {
            c0e48W13.S7().LIZIZ(Unit.LIZ, "check_effect_func_event", false);
        }
        C0E48 c0e48W14 = W1();
        if (c0e48W14 != null) {
            C350870DpF.LJI(c0e48W14);
            C361680EFy.LJLJI("enter_editor_pro_time", String.valueOf(this.LLILZ.LLLIILIL));
        }
        C0EGE c0ege2 = this.LLILZ.LLLILZ;
        if (c0ege2 != null && (c372830EjZ = c0ege2.LJIIJ) != null) {
            View controlLayout = c372830EjZ.getControlLayout();
            if ((controlLayout instanceof ViewGroup) && (viewGroup2 = (ViewGroup) controlLayout) != null) {
                C786410Ut5.LJJJLZIJ(this.LLL, viewGroup2);
                this.LLL = null;
            }
            View previewLayout = c372830EjZ.getPreviewLayout();
            if ((previewLayout instanceof ViewGroup) && (viewGroup = (ViewGroup) previewLayout) != null) {
                C786410Ut5.LJJJLZIJ(this.LLLF, viewGroup);
                this.LLLF = null;
            }
        }
        D5().LLJJIJIIJIL(!c0elj.isSpecialMode());
    }

    public final void o8(Runnable runnable) {
        this.LLJZIJLIL = runnable;
    }

    public final void p8(boolean z) {
        InterfaceC359940E9g interfaceC359940E9gAZ0 = q3().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZ(z);
        }
    }

    public final void r8(C1465100oEG c1465100oEG) {
        this.LLLIIIIL = c1465100oEG;
    }

    public final void u8(C0EGD c0egd) {
        this.LLLII = c0egd;
    }

    public final void y8(long j) {
        this.LLLIIIL = j;
    }

    public final void z8(boolean z) {
        this.LLJLIL = z;
    }

    public C0EGB(C1DRG c1drg, C372480Ej0 c372480Ej0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c372480Ej0;
        this.LLILZIL = new MutableLiveData<>();
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 925));
        this.LLJIJIL = new ArrayList<>();
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363820EOe.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EHC.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362470EIz.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C0EGQ.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 926));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 931));
        this.LLJJL = new C1407160mio(new AwS549S0100000_5(this, 929));
        this.LLJJLIIIJLLLLLLLZ = new C361650EFv() { // from class: X.0EGF
            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                C354270Duj.LIZJ(0L, new AwS549S0100000_5(this.LIZ, 930));
            }
        };
        this.LLJL = new C0EGI(this);
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJLLL = new C348650Dlf();
        this.LLLFF = new HashMap();
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 927));
        this.LLLII = new C0EGD(0);
    }

    @Override // X.C0EC7
    public void Bi0(C0EC6 c0ec6, boolean z) {
        MusicBuzModel musicBuzModel;
        C0E48 c0e48LIZ;
        CreativeModel creativeModel;
        C0EK4 c0ek4Q3 = Q3();
        if (!z && C349940Dnk.LIZ(c0ek4Q3.LIZ(), c0ek4Q3.LIZIZ())) {
            int i = C0EC2.LIZIZ;
            C0E48 c0e48LIZ2 = c0ek4Q3.LIZ();
            VideoPublishEditModel videoPublishEditModelLIZIZ = c0ek4Q3.LIZIZ();
            if (videoPublishEditModelLIZIZ != null && (creativeModel = videoPublishEditModelLIZIZ.creativeModel) != null) {
                musicBuzModel = creativeModel.musicBuzModel;
            } else {
                musicBuzModel = null;
            }
            C0EC3 c0ec3LIZIZ = C0EC2.LIZIZ(c0e48LIZ2, musicBuzModel);
            if (c0ec3LIZIZ == C0EC3.COUNT_LIMIT) {
                C19GS c19gsL7 = c0ek4Q3.LIZ.L7();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131837599);
                C1390380mHk.LIZ(c19gsL7, 1074, creativeToastBuilder);
                C0EFJ c0efj = C0EFJ.LIZ;
                C0E48 c0e48LIZ3 = c0ek4Q3.LIZ();
                VideoPublishEditModel videoPublishEditModelLIZIZ2 = c0ek4Q3.LIZIZ();
                c0efj.getClass();
                C20684815ws.LJIILLIIL("add_sound_limit_toast_show", C0EFJ.LIZ(videoPublishEditModelLIZIZ2, c0e48LIZ3).LIZ);
                return;
            }
            if (c0ec3LIZIZ == C0EC3.TIME_LIMIT) {
                C19GS c19gsL72 = c0ek4Q3.LIZ.L7();
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131837602);
                C1390380mHk.LIZ(c19gsL72, 1074, creativeToastBuilder2);
                return;
            }
            if (c0ec3LIZIZ == C0EC3.CAN_NOT_BE_STITCHED) {
                C19GS c19gsL73 = c0ek4Q3.LIZ.L7();
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.messageRes(2131837623);
                C1390380mHk.LIZ(c19gsL73, 1074, creativeToastBuilder3);
                return;
            }
            C0EGC c0egc = c0ek4Q3.LIZ.LLJI;
            if (c0egc != null && c0egc.a1() && (c0e48LIZ = c0ek4Q3.LIZ()) != null && C349940Dnk.LJ(C350870DpF.LJI(c0e48LIZ), AFwS234S0000000_5.get$arr$(19))) {
                C1397580mTM c1397580mTM = new C1397580mTM(c0ek4Q3.LIZ.L7());
                c1397580mTM.LJFF(2131837598);
                c1397580mTM.LIZ(2131837595);
                C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(c0ek4Q3, c0ec6, 244));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C0EFJ c0efj2 = C0EFJ.LIZ;
                C0E48 c0e48LIZ4 = c0ek4Q3.LIZ();
                VideoPublishEditModel videoPublishEditModelLIZIZ3 = c0ek4Q3.LIZIZ();
                c0efj2.getClass();
                C20684815ws.LJIILLIIL("sound_sync_conflict_toast_show", C0EFJ.LIZ(videoPublishEditModelLIZIZ3, c0e48LIZ4).LIZ);
                return;
            }
        }
        c0ek4Q3.LJ(c0ec6, z);
    }
}
