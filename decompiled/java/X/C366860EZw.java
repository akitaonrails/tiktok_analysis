package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ATListenerS334S0200000_5;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366860EZw extends AbstractC381020Ewm<C0EFW> implements C0EFW, InterfaceC379610EuV {
    public static final C366880EZy LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final FrameLayout LLILZIL;
    public final C0EIE LLILZLL;
    public final C0EFW LLIZ;
    public final C19EG LLIZLLLIL;
    public final C01GW LLJ;
    public final Keva LLJI;
    public final int LLJIJIL;
    public boolean LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final C01GW LLJJI;
    public final InterfaceC1731706qJ LLJJIII;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0EZy] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C366860EZw.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C366860EZw.class, "canvasApi", "getCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0), new C2217381BqS(C366860EZw.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0), new C2217381BqS(C366860EZw.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0)};
        LLJJIJI = new Object() { // from class: X.0EZy
        };
        LLJJIJIL = 8;
    }

    private final Pair<Integer, Integer> T2() {
        int[] iArr = new int[2];
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout == null) {
            return new Pair<>(0, 0);
        }
        frameLayout.getLocationInWindow(iArr);
        return new Pair<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    @Override // X.C0EFW, X.C0EIO
    public boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EFW, X.C0EIO
    public boolean LLLZZIL(List<String> list) {
        return false;
    }

    private final InterfaceC359950E9h G2() {
        return (InterfaceC359950E9h) this.LLJJIII.getValue(this, LLJJIJIIJIL[3]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    private final int getScreenWidth() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    private final InterfaceC362230EIb o2() {
        return (InterfaceC362230EIb) this.LLJILLL.getValue(this, LLJJIJIIJIL[1]);
    }

    private final C0EB6 w2() {
        return (C0EB6) this.LLJJ.getValue(this, LLJJIJIIJIL[2]);
    }

    public final C0E5S W2() {
        return (C0E5S) this.LLJILJILJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final boolean i3() {
        return this.LLJI.getBoolean("editor_pro_transition_guide_init", false);
    }

    public final C366920Ea2 m3() {
        return (C366920Ea2) this.LLJ.getValue();
    }

    private final boolean H3() {
        C368000Ebm c368000Ebm;
        LiveEvent<Unit> liveEventDx0;
        C0E48 c0e48W1;
        C0E55 player;
        InterfaceC362230EIb interfaceC362230EIbO2;
        if (o2() != null && ((interfaceC362230EIbO2 = o2()) == null || interfaceC362230EIbO2.qG1() != 0)) {
            return false;
        }
        View viewXg = W2().xg();
        if (!(viewXg instanceof C368000Ebm) || (c368000Ebm = (C368000Ebm) viewXg) == null) {
            return false;
        }
        C0E48 c0e48W12 = W1();
        if ((c0e48W12 != null && Intrinsics.LJFF(C0EB5.LIZJ(c0e48W12, w2()), Boolean.TRUE)) || !c368000Ebm.checkFirstTransitionVisibleInSafeArea(this.LLJIJIL)) {
            return false;
        }
        C0E48 c0e48W13 = W1();
        if (c0e48W13 != null && (player = c0e48W13.getPlayer()) != null && player.isPlaying()) {
            return false;
        }
        B3(c368000Ebm);
        X1();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (c0e48W1 = W1()) != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48W1, new Pair(-1, -1));
            c0labLJFF.LJ("music_id", videoPublishEditModelLJJJLIIL.getMusicId());
            c0labLJFF.LJ("enter_from", videoPublishEditModelLJJJLIIL.getEnterFrom());
            c0labLJFF.LIZ(1, "is_editor_pro");
            C20684815ws.LJIILLIIL("add_transition_guide_show", c0labLJFF.LIZ);
        }
        C369010EdP frameScrollerFromXml = c368000Ebm.getFrameScrollerFromXml();
        O3(c368000Ebm, frameScrollerFromXml != null ? Integer.valueOf(frameScrollerFromXml.getHeight()) : null);
        E3(true);
        C1524805y2.LIZIZ(3000L, new AwS549S0100000_5(this, 468));
        InterfaceC359950E9h interfaceC359950E9hG2 = G2();
        if (interfaceC359950E9hG2 != null && (liveEventDx0 = interfaceC359950E9hG2.Dx0()) != null) {
            liveEventDx0.LIZ(this, new AObjectS240S0100000_5(this, 75));
        }
        return true;
    }

    private final void X1() {
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (mutableLiveDataLIZ = c0e48W1.S7().LIZ("video_position_event")) == null) {
            return;
        }
        mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 57));
    }

    private final boolean q3() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return false;
        }
        return ((Boolean) c0e48W1.S7().LIZJ("event_user_guide_intercepted", Boolean.FALSE)).booleanValue();
    }

    private final void v3() {
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (mutableLiveDataLIZ = c0e48W1.S7().LIZ("video_position_event")) == null) {
            return;
        }
        mutableLiveDataLIZ.removeObservers(this);
    }

    @Override // X.C0EFW, X.C0EIO
    public boolean LLJJ() {
        return H3();
    }

    @Override // X.C0EFW, X.C0EIO
    public boolean LLLLLLL() {
        return i3();
    }

    @Override // X.C0EFW
    public void T30() {
        C366920Ea2 c366920Ea2M3 = m3();
        int visibility = c366920Ea2M3.getVisibility();
        c366920Ea2M3.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c366920Ea2M3);
        v3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        v3();
    }

    public final boolean H2() {
        return this.LLJILJIL;
    }

    public C0EFW Z1() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.C0EFW, X.C0EIO
    public C0EIE getType() {
        return this.LLILZLL;
    }

    private final void B3(C368000Ebm c368000Ebm) {
        int height;
        Rect rect = new Rect(0, c3(c368000Ebm).getSecond().intValue(), getScreenWidth(), c3(c368000Ebm).getSecond().intValue() + c368000Ebm.getHeight());
        int iIntValue = T2().getSecond().intValue();
        int screenWidth = getScreenWidth();
        int iIntValue2 = T2().getSecond().intValue();
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            height = frameLayout.getHeight();
        } else {
            height = 0;
        }
        m3().setOnTouchListener(new ATListenerS334S0200000_5(rect, new Rect(0, iIntValue, screenWidth, iIntValue2 + height), 1));
    }

    private final Pair<Integer, Integer> c3(C368000Ebm c368000Ebm) {
        int[] iArr = new int[2];
        c368000Ebm.getLocationInWindow(iArr);
        return new Pair<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final void E3(boolean z) {
        this.LLJI.storeBoolean("editor_pro_transition_guide_init", z);
    }

    @Override // X.C0EFW, X.C0EIO
    public boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return H3();
    }

    @Override // X.C0EFW, X.C0EIO
    public boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        if (!c0e5a.LIZJ) {
            return false;
        }
        return H3();
    }

    public final void O3(C368000Ebm c368000Ebm, Integer num) {
        int iLIZIZ;
        int iLIZIZ2;
        Pair<Integer, Integer> firstTransitionLocation = c368000Ebm.getFirstTransitionLocation();
        C366920Ea2 c366920Ea2M3 = m3();
        int iIntValue = firstTransitionLocation.getFirst().intValue();
        int iIntValue2 = firstTransitionLocation.getSecond().intValue();
        int iIntValue3 = c3(c368000Ebm).getSecond().intValue();
        int iIntValue4 = c3(c368000Ebm).getSecond().intValue() + c368000Ebm.getHeight();
        c366920Ea2M3.getClass();
        C19MB c19mb = new C19MB();
        c19mb.LJII(c366920Ea2M3.LLJI);
        if (C293810BfP.LIZ() && num != null) {
            iLIZIZ = ((num.intValue() / 2) - c366920Ea2M3.LLILZIL) - (c366920Ea2M3.LLILZ / 2);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        c19mb.LJIIIZ(R.id.yi0, 3, R.id.yhz, 3, c366920Ea2M3.LLILZLL + iIntValue2 + iLIZIZ);
        if (((Boolean) c366920Ea2M3.LLJIJIL.getValue()).booleanValue()) {
            iLIZIZ2 = ((C1415610mwR.LIZIZ() - iIntValue) - c366920Ea2M3.LLJILJIL) - c366920Ea2M3.LLILZ;
        } else {
            iLIZIZ2 = c366920Ea2M3.LLJILJIL + iIntValue;
        }
        c19mb.LJIIIZ(R.id.yi0, 6, R.id.yhz, 6, iLIZIZ2);
        c19mb.LIZIZ(c366920Ea2M3.LLJI);
        int i = c366920Ea2M3.LLILZIL;
        int i2 = iIntValue + i;
        int i3 = iIntValue2 + i + iLIZIZ;
        Rect rect = c366920Ea2M3.LLIZ;
        int i4 = c366920Ea2M3.LLILZ;
        rect.set(i2, i3, i2 + i4, i4 + i3);
        c366920Ea2M3.LLIZLLLIL.set(0, iIntValue3, C0FU0.LIZJ(c366920Ea2M3.getContext()), iIntValue4);
        int visibility = c366920Ea2M3.getVisibility();
        c366920Ea2M3.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c366920Ea2M3);
        c366920Ea2M3.invalidate();
        Path path = new Path();
        path.moveTo(1.0f, 1.0f);
        path.lineTo(1.5f, 1.5f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c366920Ea2M3.LLJ, "scaleX", "scaleY", path);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new InterpolatorC366870EZx());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public C366860EZw(C19A3 c19a3, C1DRG c1drg, FrameLayout frameLayout) {
        super(c1drg);
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = frameLayout;
        this.LLILZLL = C0EIE.TRANSITION;
        this.LLIZ = this;
        this.LLIZLLLIL = (C19EG) c19a3.requireActivity();
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 467));
        this.LLJI = Keva.getRepo("transition_guide_repo");
        this.LLJIJIL = C0FU0.LIZ(56.0f);
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 466));
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
    }
}
