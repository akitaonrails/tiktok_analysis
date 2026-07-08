package X;

import Y.AComparatorS504S0100000_5;
import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EIN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EIN extends AbstractC381020Ewm<C0EIW> implements C0EIW, InterfaceC379610EuV {
    public static final C0EIU LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLILLL;
    public C0ELJ LLILZ;
    public final InterfaceC362350EIn LLILZIL;
    public final C0EIW LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public MessageQueue.IdleHandler LLJJIII;
    public Set<? extends C0EIO> LLJJIJI;
    public List<C0EIS> LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public InterfaceC1441305kZ<C0E5A> LLJJJJJIL;

    private final void P4() {
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0EIU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EIN.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EIN.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0), new C2217381BqS(C0EIN.class, "slideInApi", "getSlideInApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/in/EditorProSlideApi;", 0), new C2217381BqS(C0EIN.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0), new C2217381BqS(C0EIN.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C0EIN.class, "canvasApi", "getCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0), new C2217381BqS(C0EIN.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C0EIN.class, "keyframeGuideApi", "getKeyframeGuideApi()Lcom/ss/android/ugc/gamora/editorpro/guide/keyframe/IKeyframeGuideApi;", 0), new C2217381BqS(C0EIN.class, "videoAnimGuiceApi", "getVideoAnimGuiceApi()Lcom/ss/android/ugc/gamora/editorpro/guide/anim/IAnimationGuideApi;", 0), new C2217381BqS(C0EIN.class, "editorProStateApi", "getEditorProStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0)};
        LLJJJJLIIL = new Object() { // from class: X.0EIU
        };
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final C0EFV B3() {
        return (C0EFV) this.LLJILLL.getValue(this, LLJJL[7]);
    }

    private final InterfaceC372680EjK E3() {
        return (InterfaceC372680EjK) this.LLJ.getValue(this, LLJJL[2]);
    }

    private final C0E5S H3() {
        return (C0E5S) this.LLJILJILJ.getValue(this, LLJJL[6]);
    }

    private final InterfaceC361310EEn O3() {
        return (InterfaceC361310EEn) this.LLJJ.getValue(this, LLJJL[8]);
    }

    private final InterfaceC362230EIb T2() {
        return (InterfaceC362230EIb) this.LLJILJIL.getValue(this, LLJJL[5]);
    }

    private final C0EFH W2() {
        return (C0EFH) this.LLJI.getValue(this, LLJJL[3]);
    }

    private final List<C0EIS> Z1() {
        ArrayList arrayList = new ArrayList();
        if (C349940Dnk.LIZ(W1(), bb2())) {
            arrayList.add(new C362280EIg(W1(), this));
        }
        C353560Dta c353560Dta = C353560Dta.LIZ;
        C0E48 c0e48W1 = W1();
        NLEModel nLEModelLJI = c0e48W1 != null ? C350870DpF.LJI(c0e48W1) : null;
        c353560Dta.getClass();
        if (C353560Dta.LJI(nLEModelLJI) && C290600BaE.LIZ()) {
            arrayList.add(new C362330EIl(W1(), bb2(), this));
        }
        VideoPublishEditModel videoPublishEditModelBb2 = bb2();
        if (videoPublishEditModelBb2 != null) {
            C363500EMy.LIZ.getClass();
            if (C363500EMy.LJIILJJIL(videoPublishEditModelBb2)) {
                arrayList.add(new C362250EId(W1(), this));
            }
        }
        return arrayList;
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLJIJIL.getValue(this, LLJJL[4]);
    }

    private final InterfaceC359950E9h i3() {
        return (InterfaceC359950E9h) this.LLJJI.getValue(this, LLJJL[9]);
    }

    private final C0EY2 m3() {
        return (C0EY2) this.LLIZ.getValue(this, LLJJL[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set<X.C0EIO> o2() {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EIN.o2():java.util.Set");
    }

    private final C0EIV q3() {
        return (C0EIV) this.LLJJJ.getValue();
    }

    private final boolean v3() {
        return this.LLJJIJIL != null;
    }

    public final C0EGY H2() {
        return (C0EGY) this.LLIZLLLIL.getValue(this, LLJJL[1]);
    }

    public final void K4() {
        O4(AFwS234S0000000_5.get$arr$(384));
    }

    public final void Q3() {
        MutableLiveData mutableLiveDataLIZ;
        C368000Ebm c368000Ebm;
        this.LLJJIJIIJIL.addAll(Z1());
        for (C0EIS c0eis : this.LLJJIJIIJIL) {
            c0eis.LIZ(W2(), new AwS406S0200000_5(this, c0eis, 89));
        }
        View viewXg = H3().xg();
        if ((viewXg instanceof C368000Ebm) && (c368000Ebm = (C368000Ebm) viewXg) != null) {
            c368000Ebm.setOnFingerAndTrackStop(new AwS549S0100000_5(this, 906));
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, new AObserverS209S0100000_5(this, 99));
        H2().aE0(new InterfaceC361900EGu() { // from class: X.0EIR
            @Override // X.InterfaceC361900EGu
            public final void LIZ(List<String> list) {
            }

            @Override // X.InterfaceC361900EGu
            public final void LIZIZ(List<String> list) {
                this.LIZ.F4(list);
            }
        });
        AObjectS240S0100000_5 aObjectS240S0100000_5 = new AObjectS240S0100000_5(this, 137);
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (mutableLiveDataLIZ = c0e48W1.S7().LIZ("selected_track_slot_event")) != null) {
            mutableLiveDataLIZ.observe(this, aObjectS240S0100000_5);
        }
        this.LLJJJJJIL = aObjectS240S0100000_5;
    }

    public final void o4() {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        List listLJIIJJI = q3().LIZ ? C1697810uHb.LJIIJJI(C0EIE.ANIM_MOVE, C0EIE.CANVAS_ADJUST, C0EIE.AUTO_SELECT, C0EIE.MAGIC, C0EIE.MAGIC_ANCHOR, C0EIE.CAPTION_ITEM, C0EIE.VOICE_CLONE, C0EIE.SMART_TRIM, C0EIE.VIDEO_ANIMATION, C0EIE.TRANSITION, C0EIE.FILTER, C0EIE.ADJUST, C0EIE.KEYFRAME, C0EIE.CUTOUT, C0EIE.FILTER_EDIT, C0EIE.SMART_TRIM_EDIT, C0EIE.ADJUST_EDIT, C0EIE.CAPTION_STYLE_ITEM, C0EIE.MULTI_MUSIC) : C1697810uHb.LJIIJJI(C0EIE.AI_PLAYGROUND, C0EIE.MUSIC_STRIP, C0EIE.ANIM_MOVE, C0EIE.CANVAS_ADJUST, C0EIE.AUTO_SELECT, C0EIE.CAPTION_ITEM, C0EIE.MAGIC, C0EIE.MAGIC_ANCHOR, C0EIE.VOICE_CLONE, C0EIE.SMART_TRIM, C0EIE.VIDEO_ANIMATION, C0EIE.TRANSITION, C0EIE.FILTER, C0EIE.ADJUST, C0EIE.AI_CREATE, C0EIE.SMART_TRIM_EDIT, C0EIE.FILTER_EDIT, C0EIE.CUTOUT, C0EIE.KEYFRAME, C0EIE.ADJUST_EDIT, C0EIE.CAPTION_STYLE_ITEM, C0EIE.MULTI_MUSIC);
        Set<C0EIO> setO2 = o2();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setO2) {
            C0EIO c0eio = (C0EIO) obj;
            C365090ETb.LIZIZ();
            if (listLJIIJJI.contains(c0eio.getType()) && !c0eio.LLLLLLL()) {
                arrayList.add(obj);
            }
        }
        this.LLJJIJI = C13LP.LLIIJI(C13LP.LJLLLL(new AComparatorS504S0100000_5(listLJIIJJI, 1), arrayList));
    }

    private final boolean X1() {
        InterfaceC372680EjK interfaceC372680EjKE3 = E3();
        return interfaceC372680EjKE3 != null && interfaceC372680EjKE3.Rh1();
    }

    private final void Xi() {
        LiveEvent<Unit> liveEventDx0;
        W2().getInitData().LIZ(this, new AObjectS240S0100000_5(this, 138));
        H2().zb0().observe(this, new AObserverS209S0100000_5(this, 100));
        W2().J50().LIZ(this, new AObjectS240S0100000_5(this, 139));
        InterfaceC359950E9h interfaceC359950E9hI3 = i3();
        if (interfaceC359950E9hI3 == null || (liveEventDx0 = interfaceC359950E9hI3.Dx0()) == null) {
            return;
        }
        liveEventDx0.LIZ(this, new AObjectS240S0100000_5(this, 140));
    }

    private final VideoPublishEditModel bb2() {
        C0ELJ c0eljC3 = c3();
        if (c0eljC3 != null) {
            return c0eljC3.getEditModel();
        }
        return null;
    }

    private final boolean w2() {
        C0ELJ c0eljC3 = c3();
        if (!C123100dR.LIZ(c0eljC3 != null ? c0eljC3.getEditorProAnchorType() : null)) {
            return false;
        }
        C0ELJ c0eljC32 = c3();
        return !Intrinsics.LJFF(c0eljC32 != null ? c0eljC32.getEditorProAnchorType() : null, "magic");
    }

    public final C0ELJ c3() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0EY2 c0ey2M3 = m3();
        if (c0ey2M3 == null || (liveDataZu2 = c0ey2M3.zu2()) == null || (value = liveDataZu2.getValue()) == null) {
            return null;
        }
        return value.LJ;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (X1() || w2()) {
            return;
        }
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        MessageQueue.IdleHandler idleHandler = this.LLJJIII;
        if (idleHandler != null) {
            Looper.myQueue().removeIdleHandler(idleHandler);
        }
    }

    public C0EIW G2() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    private final void z4(List<String> list) {
        O4(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 786));
    }

    public final void F4(List<String> list) {
        O4(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 787));
    }

    public final void O4(Function1<? super C0EIO, Boolean> function1) {
        EnumC359990E9l initIntent;
        EditorProModel editorProModel;
        if (v3() || !this.LLJJJIL) {
            return;
        }
        C0ELJ c0eljC3 = c3();
        if (c0eljC3 != null && c0eljC3.getEffectMultiTrackMode()) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelBb2 = bb2();
        if (videoPublishEditModelBb2 != null && videoPublishEditModelBb2.isRetakeVideo()) {
            return;
        }
        C0ELJ c0eljC32 = c3();
        String openEditToolType = null;
        if (c0eljC32 != null) {
            initIntent = c0eljC32.getInitIntent();
        } else {
            initIntent = null;
        }
        if (initIntent == EnumC359990E9l.OPEN_EDITOR_PRO_CAPTION) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelBb22 = bb2();
        if (videoPublishEditModelBb22 != null && (editorProModel = videoPublishEditModelBb22.getEditorProModel()) != null) {
            openEditToolType = editorProModel.getOpenEditToolType();
        }
        if (Intrinsics.LJFF(openEditToolType, "captions") || Intrinsics.LJFF(openEditToolType, "cutout")) {
            return;
        }
        for (C0EIO c0eio : this.LLJJIJI) {
            if (c0eio.LLLIILIL()) {
                if (function1.invoke(c0eio).booleanValue()) {
                    this.LLJJIJIL = c0eio.getType().name();
                    return;
                }
                return;
            } else if (function1.invoke(c0eio).booleanValue()) {
                this.LLJJIJIL = c0eio.getType().name();
                return;
            }
        }
    }

    public final void e4(List<String> list) {
        this.LLJJJIL = true;
        C0ELJ c0eljC3 = c3();
        if (c0eljC3 == null) {
            return;
        }
        O4(new AwS371S0200000_5((List) list, (List<String>) c0eljC3, (C0ELJ) 189));
    }

    public final void H4(C0E5A c0e5a, List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        O4(new AwS371S0200000_5(c0e5a, (C0E5A) list, (List<String>) 190));
    }

    public C0EIN(C1DRG c1drg, C0ELJ c0elj, InterfaceC362350EIn interfaceC362350EIn) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c0elj;
        this.LLILZIL = interfaceC362350EIn;
        this.LLILZLL = this;
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372680EjK.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), C0EFH.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EFV.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361310EEn.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJJIJI = C08CX.INSTANCE;
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 905));
    }
}
