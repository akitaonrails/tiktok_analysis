package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.components.base.FrameInterpolator;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.track.CurrentSlotInfo;
import com.ss.ugc.android.editor.track.PlayPositionState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E54, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0E54 extends C0E5F implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C19EG LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final C1664750tQH LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final C1664750tQH LLJIJIL;
    public final C01GW LLJILJIL;
    public final FrameInterpolator LLJILLL;
    public final C0E56 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final IPreviewService LLILZ = C357280Dza.LIZ();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(305));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E54.class, "btmBarApiComponent", "getBtmBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E54.class, "consoleBar", "getConsoleBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E54.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E54.class, "keyFrameApi", "getKeyFrameApi()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0E54.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.C0E9K
    public void LIZIZ() {
    }

    public void LJIIIZ() {
    }

    public void LJIIJ(boolean z) {
    }

    @Override // X.C0E9K
    public void onDestroy() {
        C350110Do1.LIZ = false;
        ((LinkedHashMap) C350110Do1.LIZJ.LIZ).clear();
        C0E56 c0e56 = this.LLJJ;
        c0e56.LIZ();
        c0e56.LJ = null;
        IPreviewService iPreviewService = this.LLILZ;
        if (iPreviewService != null) {
            iPreviewService.onDestroy();
        }
    }

    private final LifecycleOwner LJ() {
        return (LifecycleOwner) this.LLJILJILJ.getValue();
    }

    public final C0EGY LIZ() {
        return (C0EGY) this.LLILZIL.getValue(this, LLJJIJI[0]);
    }

    public final InterfaceC360800ECo LIZJ() {
        return (InterfaceC360800ECo) this.LLIZLLLIL.getValue(this, LLJJIJI[1]);
    }

    public final C0E48 LIZLLL() {
        return (C0E48) this.LLJILJIL.getValue();
    }

    public final C0E5S LJI() {
        return (C0E5S) this.LLJIJIL.getValue(this, LLJJIJI[4]);
    }

    public final void LJIILIIL() {
        LiveData<Unit> liveDataZb0;
        ArrayList<C0E9K> arrayList;
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(C0E5X.LIZLLL);
        if (objLJJLIIIJL != null) {
            ConcurrentHashMap<String, ArrayList<C0E9K>> concurrentHashMap = C0E5X.LIZIZ;
            if (concurrentHashMap.containsKey(objLJJLIIIJL) && (arrayList = concurrentHashMap.get(objLJJLIIIJL)) != null && !arrayList.contains(this)) {
                arrayList.add(this);
            }
        }
        if (this.LLJJI) {
            return;
        }
        C1664740tQG c1664740tQG = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        if (c1664740tQG.getValue(this, interfaceC2217461BqaArr[2]) == null || LIZJ() == null) {
            return;
        }
        if (this.LLJ.getValue(this, interfaceC2217461BqaArr[2]) != null) {
            LJIIJ(true);
        }
        LIZJ();
        C0EGY c0egyLIZ = LIZ();
        if (c0egyLIZ != null && (liveDataZb0 = c0egyLIZ.zb0()) != null) {
            liveDataZb0.observe(this.LLILLJJLI, new AObserverS209S0100000_5((C358780E4u) this, 143));
        }
        LJIIJJI();
        this.LLJJI = true;
    }

    @Override // X.C0E9K
    public void onHide() {
        this.LLJJ.LIZ();
    }

    public final int LJFF() {
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        CurrentSlotInfo currentSlotInfoVD1 = LJI().vD1();
        int i = currentSlotInfoVD1.index;
        NLETrackSlot nLETrackSlot = currentSlotInfoVD1.slot;
        long j = currentSlotInfoVD1.playTime;
        if (nLETrackSlot != null) {
            return nLETrackSlot.getMeasuredEndTime() - j <= nLETrackSlot.getDuration() / ((long) 2) ? i + 1 : i;
        }
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL == null || (nLETrackRn = c0e48LIZLLL.Rn()) == null || (slots = nLETrackRn.getSlots()) == null) {
            return 0;
        }
        return slots.size();
    }

    public void LJIIJJI() {
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL == null) {
            return;
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(LJ(), new AObserverS170S0200000_5(this, c0e48LIZLLL, 20));
        c0e48LIZLLL.getPlayer().LJ().observe(LJ(), new AObserverS170S0200000_5(this, c0e48LIZLLL, 21));
        c0e48LIZLLL.getPlayer().LIZJ().LIZ(LJ(), new AObjectS240S0100000_5(this, 155));
        c0e48LIZLLL.getPlayer().LIZLLL().observe(LJ(), new AObserverS209S0100000_5(this, 133));
        c0e48LIZLLL.getPlayer().LJJIFFI().LIZ(LJ(), new AObjectS240S0100000_5(this, 156));
        MutableLiveData mutableLiveDataLIZ2 = c0e48LIZLLL.S7().LIZ("main_track_slot_move_event");
        if (mutableLiveDataLIZ2 != null) {
            mutableLiveDataLIZ2.observe(LJ(), new AObserverS209S0100000_5(c0e48LIZLLL, 134));
        }
        MutableLiveData mutableLiveDataLIZ3 = c0e48LIZLLL.S7().LIZ("main_track_slot_clip_event");
        if (mutableLiveDataLIZ3 != null) {
            mutableLiveDataLIZ3.observe(LJ(), new AObserverS209S0100000_5(c0e48LIZLLL, 135));
        }
        MutableLiveData mutableLiveDataLIZ4 = c0e48LIZLLL.S7().LIZ("selected_track_slot_event");
        if (mutableLiveDataLIZ4 != null) {
            mutableLiveDataLIZ4.observe(LJ(), new AObserverS209S0100000_5(c0e48LIZLLL, 136));
        }
        MutableLiveData mutableLiveDataLIZ5 = c0e48LIZLLL.S7().LIZ("ori_audio_mute_event");
        if (mutableLiveDataLIZ5 != null) {
            mutableLiveDataLIZ5.observe(LJ(), new AObserverS209S0100000_5(c0e48LIZLLL, 137));
        }
        MutableLiveData mutableLiveDataLIZ6 = c0e48LIZLLL.S7().LIZ("transition_track_slot_click_event");
        if (mutableLiveDataLIZ6 != null) {
            mutableLiveDataLIZ6.observe(LJ(), new AObserverS209S0100000_5(c0e48LIZLLL, 131));
        }
        if (C351230Dpp.LIZIZ() && (mutableLiveDataLIZ = c0e48LIZLLL.S7().LIZ("video_position_event")) != null) {
            mutableLiveDataLIZ.observe(LJ(), new AObserverS209S0100000_5(c0e48LIZLLL, 132));
        }
        if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_TRACK_PROGRESS), Boolean.TRUE)) {
            this.LLJJ.LJ = new AwS406S0200000_5(c0e48LIZLLL, this, 105);
        }
    }

    public boolean LJIIL() {
        C0E48 c0e48LIZLLL;
        InterfaceC351610DqR interfaceC351610DqROg;
        return C351230Dpp.LIZIZ() && (c0e48LIZLLL = LIZLLL()) != null && (interfaceC351610DqROg = c0e48LIZLLL.og()) != null && interfaceC351610DqROg.LJJLIIIJL();
    }

    public final void LJIILJJIL() {
        C0E55 player;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL == null || (player = c0e48LIZLLL.getPlayer()) == null) {
            return;
        }
        player.Wj(false);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final void LJII(long j) {
        if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_TRACK_PROGRESS), Boolean.TRUE)) {
            this.LLJJ.LIZ();
        } else {
            this.LLJILLL.LIZ();
        }
        EnumC373600Eko enumC373600Eko = EnumC373600Eko.PAUSE;
        InterfaceC360800ECo interfaceC360800ECoLIZJ = LIZJ();
        if (interfaceC360800ECoLIZJ != null) {
            interfaceC360800ECoLIZJ.b5(enumC373600Eko);
        }
        LJIILJJIL();
        LJIIIIZZ(this, Long.valueOf(j), null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.Long r12) {
        /*
            r11 = this;
            boolean r0 = X.C351230Dpp.LIZIZ()
            if (r0 == 0) goto L95
            X.0E48 r0 = r11.LIZLLL()
            r5 = 0
            if (r0 == 0) goto L8c
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r10 = r0.LLLLLLIL()
            if (r10 == 0) goto L8c
            r1 = 0
            if (r12 == 0) goto L9c
            long r3 = r12.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L9c
            long r0 = r12.longValue()
            long r1 = X.C351220Dpo.LLLLLLJ(r0)
        L27:
            X.0E48 r0 = r11.LIZLLL()
            if (r0 == 0) goto L43
            X.0DqR r6 = r0.og()
            if (r6 == 0) goto L43
            int r0 = X.C360610EBv.LIZIZ
            float r3 = (float) r0
            float r0 = X.C360610EBv.LIZJ()
            float r3 = r3 / r0
            long r3 = (long) r3
            long r3 = X.C351220Dpo.LLLLLLJ(r3)
            r6.LLF(r3)
        L43:
            boolean r0 = X.C0E5J.LIZJ(r10)
            r7 = 1
            if (r0 != 0) goto L9a
            boolean r0 = X.C0E5J.LIZLLL(r10)
            if (r0 != 0) goto L9a
            r6 = 0
        L51:
            boolean r0 = r11.LJIIL()
            if (r0 == 0) goto L98
            long r8 = r10.getStartTime()
            long r3 = r10.getEndTime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L98
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L98
            if (r6 != 0) goto L98
            r6 = 1
        L6a:
            X.0tQG r4 = r11.LLJI
            X.1Bqa<java.lang.Object>[] r3 = X.C0E54.LLJJIJI
            r0 = 3
            r0 = r3[r0]
            java.lang.Object r0 = r4.getValue(r11, r0)
            X.0ENB r0 = (X.C0ENB) r0
            if (r0 == 0) goto L96
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = r0.Ah(r1)
            if (r0 == 0) goto L96
        L7f:
            X.0ECo r0 = r11.LIZJ()
            if (r0 == 0) goto L8c
            r0.zB(r6, r7)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L95
        L8c:
            X.0ECo r0 = r11.LIZJ()
            if (r0 == 0) goto L95
            r0.zB(r5, r5)
        L95:
            return
        L96:
            r7 = 0
            goto L7f
        L98:
            r6 = 0
            goto L6a
        L9a:
            r6 = 1
            goto L51
        L9c:
            X.0E5S r0 = r11.LJI()
            androidx.lifecycle.LiveData r0 = r0.zE2()
            java.lang.Object r0 = r0.getValue()
            com.ss.ugc.android.editor.track.SeekInfo r0 = (com.ss.ugc.android.editor.track.SeekInfo) r0
            if (r0 == 0) goto L27
            long r1 = r0.position
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E54.LJIILL(java.lang.Long):void");
    }

    public final void LJIILLIIL(long j) {
        C0E55 player;
        NLETrack nLETrackPt;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48LIZLLL;
        InterfaceC351610DqR interfaceC351610DqROg;
        C0ENB c0enb = (C0ENB) this.LLJI.getValue(this, LLJJIJI[3]);
        if (c0enb != null && c0enb.xZ1()) {
            C0E48 c0e48LIZLLL2 = LIZLLL();
            if (c0e48LIZLLL2 != null && (nLETrackSlotLLLLLLIL = c0e48LIZLLL2.LLLLLLIL()) != null && (c0e48LIZLLL = LIZLLL()) != null && (interfaceC351610DqROg = c0e48LIZLLL.og()) != null) {
                interfaceC351610DqROg.LJJI(j, nLETrackSlotLLLLLLIL);
                return;
            }
            return;
        }
        C0E48 c0e48LIZLLL3 = LIZLLL();
        if (c0e48LIZLLL3 == null || (player = c0e48LIZLLL3.getPlayer()) == null) {
            return;
        }
        C0E48 c0e48LIZLLL4 = LIZLLL();
        NLETrackSlot nLETrackSlotLLLLLLIL2 = null;
        if (c0e48LIZLLL4 != null) {
            nLETrackPt = c0e48LIZLLL4.Pt();
        } else {
            nLETrackPt = null;
        }
        C0E48 c0e48LIZLLL5 = LIZLLL();
        if (c0e48LIZLLL5 != null) {
            nLETrackSlotLLLLLLIL2 = c0e48LIZLLL5.LLLLLLIL();
        }
        player.LJIIJJI(j, nLETrackPt, nLETrackSlotLLLLLLIL2);
    }

    public final void LJIIZILJ(long j) {
        C0E48 c0e48LIZLLL;
        if (C351230Dpp.LIZIZ() && (c0e48LIZLLL = LIZLLL()) != null && c0e48LIZLLL.LLLLLLIL() != null) {
            LJIILL(Long.valueOf(j));
            LJIILLIIL(C351220Dpo.LLLLLLJ(j));
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0E58] */
    public C0E54(C372480Ej0 c372480Ej0, C1DRG c1drg, C19GS c19gs) {
        this.LL = c19gs;
        this.LLILLJJLI = c372480Ej0;
        this.LLILLL = c1drg;
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C0EGY.class, null);
        final C358780E4u c358780E4u = (C358780E4u) this;
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(c358780E4u, 1095));
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(c358780E4u, 1093));
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, C0ENB.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(c358780E4u, 1094));
        this.LLJILLL = new FrameInterpolator(new C0FDG() { // from class: X.0E57
            @Override // X.C0FDG
            public final void handleMsg(Message message) {
                C0E5S c0e5sLJI = c358780E4u.LJI();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0e5sLJI.zv(new PlayPositionState(timeUnit.toMicros(message.arg1), false, false), false);
                c358780E4u.getClass();
                if (C351230Dpp.LIZIZ()) {
                    c358780E4u.LJIILLIIL(timeUnit.toMicros(message.arg1));
                }
            }
        });
        this.LLJJ = new C0E56(new AwS584S0100000_5(c358780E4u, 916), new C0E5C() { // from class: X.0E58
            public float LIZ = 1.0f;
            public long LIZIZ;
            public long LIZJ;
            public long LIZLLL;

            @Override // X.C0E5C
            public final void LIZ(long j) {
                this.LIZ = 1.0f;
                this.LIZIZ = j;
                this.LIZJ = j;
                this.LIZLLL = SystemClock.elapsedRealtime();
            }

            @Override // X.C0E5C
            public final long LIZIZ(long j) {
                return (long) (this.LIZ * j);
            }

            @Override // X.C0E5C
            public final void LIZJ(long j) {
                float fLIZLLL;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = jElapsedRealtime - this.LIZLLL;
                if (j2 < 1) {
                    j2 = 1;
                }
                this.LIZLLL = jElapsedRealtime;
                float f = (j - this.LIZJ) / j2;
                if (Math.abs(j - this.LIZIZ) < 200) {
                    fLIZLLL = 1.0f;
                } else if (j > this.LIZIZ) {
                    fLIZLLL = 1.2f;
                } else {
                    fLIZLLL = C13LZ.LIZLLL(f, 0.4f, 0.8f);
                }
                this.LIZ = fLIZLLL;
                this.LIZLLL = jElapsedRealtime;
                this.LIZJ = j;
            }

            @Override // X.C0E5C
            public final void LIZLLL(long j) {
                this.LIZIZ = j;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C0E54 r7, java.lang.Long r8, java.lang.Long r9, int r10) {
        /*
            r0 = r10 & 1
            r3 = 0
            if (r0 == 0) goto L6
            r8 = r3
        L6:
            r0 = r10 & 2
            r5 = 0
            if (r0 == 0) goto L10
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
        L10:
            if (r8 == 0) goto L58
            r7.getClass()
            long r1 = r8.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L58
            long r1 = r8.longValue()
        L21:
            X.0ECo r4 = r7.LIZJ()
            if (r4 == 0) goto L2e
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r4.gm0(r0, r3)
        L2e:
            r7.LJIIZILJ(r1)
            if (r9 == 0) goto L53
            long r1 = r9.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L53
            X.0E48 r0 = r7.LIZLLL()
            if (r0 == 0) goto L45
            long r5 = X.C350870DpF.LJII(r0)
        L45:
            X.0ECo r1 = r7.LIZJ()
            if (r1 == 0) goto L52
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.gm0(r3, r0)
        L52:
            return
        L53:
            long r5 = r9.longValue()
            goto L45
        L58:
            X.0E48 r0 = r7.LIZLLL()
            if (r0 == 0) goto L67
            X.0E55 r0 = r0.getPlayer()
            long r1 = r0.Jh()
            goto L21
        L67:
            r1 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E54.LJIIIIZZ(X.0E54, java.lang.Long, java.lang.Long, int):void");
    }
}
