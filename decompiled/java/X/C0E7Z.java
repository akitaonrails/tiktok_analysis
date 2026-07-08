package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.android.editor.track.CurrentSlotInfo;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS2S0020000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E7Z extends C0ETZ<C0E5S, C359740E8m, C359400E7e, C359370E7b> implements C0E5S {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final int LLLIIIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final Function0<C359400E7e> LLJJIJI;
    public final Function0<C359370E7b> LLJJIJIIJIL;
    public final Function0<C359740E8m> LLJJIJIL;
    public final C560530Lyd<NLETrackSlot> LLJJJ;
    public final C560530Lyd<Unit> LLJJJIL;
    public final MutableLiveData<Pair<List<NLETrackSlot>, List<NLETrackSlot>>> LLJJJJ;
    public final MutableLiveData<SeekInfo> LLJJJJJIL;
    public final MutableLiveData<C0E6I> LLJJJJLIIL;
    public final MutableLiveData<C0E75> LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public InterfaceC359430E7h LLJLIL;
    public Boolean LLJLILLLLZIIL;
    public Boolean LLJLL;
    public Boolean LLJLLIL;
    public final InterfaceC350080Dny LLJLLL;
    public final C0E7T LLJZ;
    public final C0E7Y LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C348830Dlx LLLI;
    public final C356950Dz3 LLLII;
    public final C0E8D LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E7Z.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E7Z.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLLIIIL = 8;
    }

    private final InterfaceC359950E9h T4() {
        return (InterfaceC359950E9h) this.LLJL.getValue(this, LLLIIIIL[1]);
    }

    @Override // X.C0E5S
    public double A9() {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            return interfaceC359430E7h.A9();
        }
        return 1.0d;
    }

    public final C0E74 D5() {
        return (C0E74) this.LLLFZ.getValue();
    }

    public final C0EG6 E5() {
        return (C0EG6) this.LLLFFI.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0E7a] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0E7X] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0E7W] */
    public final C359370E7b K4() {
        return new C359370E7b(new InterfaceC359570E7v() { // from class: X.0E7a
            @Override // X.InterfaceC359570E7v
            public final void LIZIZ(boolean z) {
                this.LIZ.Z4().wQ2().LJFF(z);
            }

            @Override // X.InterfaceC359570E7v
            public final void LIZJ(InterfaceC371030Egf interfaceC371030Egf) {
                C370920EgU c370920EgUWQ2 = this.LIZ.Z4().wQ2();
                C23250099c.LIZLLL(c370920EgUWQ2, c370920EgUWQ2.LLJILJIL, null, new C358360E3e(c370920EgUWQ2, interfaceC371030Egf, null), 2);
            }

            @Override // X.InterfaceC359570E7v
            public final Bitmap LIZ(int i, String str) {
                return this.LIZ.Z4().vQ2(i, str);
            }
        }, new C359170E6h(this), new C0E8M() { // from class: X.0E7X
            @Override // X.C0E8M
            public final void LJJJJ() {
                this.LIZ.i3(AFwS234S0000000_5.get$arr$(383));
            }

            @Override // X.C0E8M
            public final void LJFF(int i, NLETrackSlot nLETrackSlot) {
                this.LIZ.N5(true, nLETrackSlot, Integer.valueOf(i));
            }

            @Override // X.C0E8M
            public final void LIZJ(int i, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
                if (this.LIZ.d5().LIZLLL(new C0E67(nLETrackSlot, nLETrackSlot2))) {
                    this.LIZ.i3(new AwS20S0001000_5(i, 29));
                }
            }

            @Override // X.C0E8M
            public final void LJ(NLETrackSlot nLETrackSlot, int i, int i2) {
                this.LIZ.c3(AFwS234S0000000_5.get$arr$(377));
                this.LIZ.k5().onMainTrackMoveSlot(nLETrackSlot, i, i2);
                this.LIZ.LLJZ.w6(null, false, false);
            }

            @Override // X.C0E8M
            public final void LIZ(long j, NLETrackSlot nLETrackSlot, int i, long j2) {
                this.LIZ.k5().LJIIIZ(j, nLETrackSlot, i, j2);
            }
        }, new InterfaceC368840Ed8() { // from class: X.0E7W
            @Override // X.InterfaceC368840Ed8
            public final void LIZIZ(C368790Ed3 c368790Ed3) {
                if (!C0OBG.LIZIZ(c368790Ed3)) {
                    this.LIZ.d5().LIZJ();
                }
            }

            @Override // X.InterfaceC368840Ed8
            public final void LIZJ(C368800Ed4 c368800Ed4) {
                if (!C0OBG.LIZIZ(c368800Ed4)) {
                    this.LIZ.d5().LJI();
                }
            }

            @Override // X.InterfaceC368840Ed8
            public final boolean LJ(NLETrackSlot nLETrackSlot) {
                NLEModel nLEModel;
                C0E48 c0e48F4;
                if (C361460EFc.LIZ(this.LIZ.getEditModel()) || (nLEModel = this.LIZ.T2().LIZJ.LIZ) == null) {
                    return true;
                }
                C0E7Z c0e7z = this.LIZ;
                NLETrack nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModel, nLETrackSlot.getUUID());
                if (nLETrackLJLLILLLL == null) {
                    return false;
                }
                boolean zLLJLL = C351220Dpo.LLJLL(nLETrackLJLLILLLL);
                if (zLLJLL && (c0e48F4 = c0e7z.F4()) != null) {
                    c0e48F4.S7().LIZIZ(Unit.LIZ, "event_click_disable_replace_music_with_loop", false);
                }
                return !zLLJLL;
            }

            @Override // X.InterfaceC368840Ed8
            public final String getInfoStickerAssetInfo(String str) {
                return this.LIZ.k5().getInfoStickerAssetInfo(str);
            }

            @Override // X.InterfaceC368840Ed8
            public final void onClipStart(NLETrackSlot nLETrackSlot) {
                this.LIZ.LLJZIJLIL.LIZLLL();
            }

            @Override // X.InterfaceC368840Ed8
            public final void LIZ(NLETrackSlot nLETrackSlot, C0E6E c0e6e, boolean z, boolean z2) {
                if (nLETrackSlot == null) {
                    if (this.LIZ.T2().LIZLLL.LIZJ != null) {
                        this.LIZ.LLJZ.w6(null, z2, false);
                    }
                } else if (z) {
                    this.LIZ.N5(false, nLETrackSlot, null);
                } else {
                    this.LIZ.LLJZ.LJFF(nLETrackSlot, c0e6e, EnumC358760E4s.NORMAL, true, false, true, false);
                }
            }

            @Override // X.InterfaceC368840Ed8
            public final void onClip(EnumC368970EdL enumC368970EdL, EnumC368970EdL enumC368970EdL2, long j, long j2) {
                this.LIZ.LLJZIJLIL.LJFF(enumC368970EdL, enumC368970EdL2, j, j2);
            }

            @Override // X.InterfaceC368840Ed8
            public final void LIZLLL(long j, NLETrackSlot nLETrackSlot, long j2, long j3, boolean z) {
                this.LIZ.LLJZIJLIL.LJ();
                if (z) {
                    InterfaceC359180E6i interfaceC359180E6iK5 = this.LIZ.k5();
                    long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                    interfaceC359180E6iK5.LJIIIIZZ(j * j4, nLETrackSlot, j3 * j4, j2);
                }
            }
        }, this.LLJZIJLIL, this.LLLIIII, this.LLLII);
    }

    @Override // X.C0E5S
    public void LJJIJIIJIL() {
        i3(AFwS234S0000000_5.get$arr$(382));
    }

    @Override // X.C0E5S
    public void NT0() {
        NLETrack mainTrack;
        SeekInfo value = this.LLJJJJJIL.getValue();
        long j = value != null ? value.position : 0L;
        NLEModel nLEModel = T2().LIZJ.LIZ;
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null) {
            return;
        }
        int i = 0;
        for (NLETrackSlot nLETrackSlot : mainTrack.getSortedSlots()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
            long startTime = nLETrackSlot2.getStartTime();
            if (j <= nLETrackSlot2.getMeasuredEndTime() && startTime <= j) {
                this.LLJZ.LJFF(nLETrackSlot2, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true, true);
                return;
            }
            i = i2;
        }
    }

    public final C359400E7e O4() {
        C350090Dnz c350090Dnz = new C350090Dnz(0);
        C350040Dnu c350040Dnu = new C350040Dnu(false, EnumC356210Dxr.NONE);
        C13BV c13bv = C13BV.INSTANCE;
        C0E7S c0e7s = new C0E7S(null, c350090Dnz, false, true, new C350100Do0(c350040Dnu, c13bv), new C0E7P(new C350050Dnv(false, false, false, false), new C350070Dnx(null), c13bv, c13bv, c13bv, c13bv, c13bv, c13bv, c13bv, c13bv));
        C0E75 c0e75 = new C0E75(true, null, null, null, null, null, false, false, false, false, null, false, 4094);
        TrackShowType trackShowType = TrackShowType.NORMAL;
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.NEW_SUBTRACK_STYLE_HEIGHT;
        Boolean bool = Boolean.FALSE;
        return new C359400E7e(new C359410E7f(null, null), null, c0e7s, c0e75, new C359620E8a(trackShowType, ((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue() ? 6.0f : 20.0f, 4.0f, 4.0f, 4.0f, 1920), new C359380E7c(0), new C359480E7m(((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_EFFECT, bool)).booleanValue(), 4194175), new C359500E7o(false), null, null, null, null, null, null);
    }

    public final C0EY2 P4() {
        return (C0EY2) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIIIIL[0]);
    }

    @Override // X.C0E5S
    public LiveState<TrackShowType> Q82() {
        return Z1(new C2217381BqS() { // from class: X.0E7p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C359400E7e) obj).LJ;
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0E7q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C359620E8a) obj).LIZ;
            }
        });
    }

    public final void U5() {
        Float fValueOf;
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        float fA9 = interfaceC359430E7h != null ? (float) interfaceC359430E7h.A9() : 1.0f;
        long j = T2().LIZJ.LIZIZ.LIZIZ;
        if (0 <= j && j < 60000000) {
            fValueOf = Float.valueOf(1.0f / fA9);
        } else if (60000000 <= j && j < 180000000) {
            fValueOf = Float.valueOf(0.5f / fA9);
        } else if (180000000 <= j && j < 360000000) {
            fValueOf = Float.valueOf(0.25f / fA9);
        } else if (360000000 <= j && j < 720000000) {
            fValueOf = Float.valueOf(0.125f / fA9);
        } else {
            if (720000000 > j || j > Long.MAX_VALUE) {
                return;
            }
            C368130Ebz.LIZJ = 0.0625f;
            fValueOf = Float.valueOf(0.0625f / fA9);
        }
        if (fValueOf != null) {
            pl(fValueOf.floatValue());
        }
    }

    public final FrameCacheViewModel Z4() {
        return (FrameCacheViewModel) this.LLLF.getValue();
    }

    @Override // X.C0E5S
    public void Zv() {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            interfaceC359430E7h.Zv();
        }
    }

    @Override // X.C0E5S
    public void ai() {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            interfaceC359430E7h.ai();
        }
    }

    public final C0E7V d5() {
        return (C0E7V) this.LLLFF.getValue();
    }

    public final void d6() {
        i3(AFwS234S0000000_5.get$arr$(381));
    }

    @Override // X.C0E5S
    public LiveState<C359380E7c> fC2() {
        return Z1(new C2217381BqS() { // from class: X.0E7r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C359400E7e) obj).LJFF;
            }
        });
    }

    @Override // X.C0E5S
    public void jB2() {
        i3(AFwS234S0000000_5.get$arr$(378));
    }

    public final InterfaceC359180E6i k5() {
        return (InterfaceC359180E6i) this.LLL.getValue();
    }

    @Override // X.C0E5S
    public View xg() {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            return interfaceC359430E7h.xg();
        }
        return null;
    }

    public final VideoPublishEditModel getEditModel() {
        C0EY2 c0ey2P4 = P4();
        if (c0ey2P4 != null) {
            return c0ey2P4.getEditModel();
        }
        return null;
    }

    @Override // X.C0E5S
    public void j() {
        FrameCacheViewModel.yQ2(Z4());
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventDx0;
        LiveEvent<Unit> liveEventJI;
        LiveEvent<Unit> liveEventAU;
        LiveData<Boolean> liveDataQO0;
        LiveData<Boolean> liveDataN71;
        super.onCreate();
        InterfaceC359950E9h interfaceC359950E9hT4 = T4();
        if (interfaceC359950E9hT4 != null && (liveDataN71 = interfaceC359950E9hT4.N71()) != null) {
            liveDataN71.observe(this, new AObserverS209S0100000_5(this, 97));
        }
        InterfaceC359950E9h interfaceC359950E9hT42 = T4();
        if (interfaceC359950E9hT42 != null && (liveDataQO0 = interfaceC359950E9hT42.QO0()) != null) {
            liveDataQO0.observe(this, new AObserverS209S0100000_5(this, 98));
        }
        InterfaceC359950E9h interfaceC359950E9hT43 = T4();
        if (interfaceC359950E9hT43 != null && (liveEventAU = interfaceC359950E9hT43.AU()) != null) {
            liveEventAU.LIZ(this, new AObjectS240S0100000_5(this, 133));
        }
        InterfaceC359950E9h interfaceC359950E9hT44 = T4();
        if (interfaceC359950E9hT44 != null && (liveEventJI = interfaceC359950E9hT44.JI()) != null) {
            liveEventJI.LIZ(this, new AObjectS240S0100000_5(this, 134));
        }
        InterfaceC359950E9h interfaceC359950E9hT45 = T4();
        if (interfaceC359950E9hT45 == null || (liveEventDx0 = interfaceC359950E9hT45.Dx0()) == null) {
            return;
        }
        liveEventDx0.LIZ(this, new AObjectS240S0100000_5(this, 135));
    }

    @Override // X.C0E5S
    public boolean u80() {
        return T2().LIZJ.LIZJ;
    }

    @Override // X.C0E5S
    public CurrentSlotInfo vD1() {
        NLETrackSlot nLETrackSlot;
        C350100Do0 c350100Do0 = T2().LIZJ.LJ;
        SeekInfo value = this.LLJJJJJIL.getValue();
        long j = value != null ? value.position : 0L;
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(c350100Do0.LIZIZ);
        if (j >= (nLETimeSpaceNode != null ? nLETimeSpaceNode.getEndTime() : 0L)) {
            return new CurrentSlotInfo(c350100Do0.LIZIZ.size() - 1, (NLETrackSlot) C13LP.LJJLIIIJL(c350100Do0.LIZIZ), j);
        }
        Iterator<NLETrackSlot> it2 = c350100Do0.LIZIZ.iterator();
        int i = 0;
        while (true) {
            nLETrackSlot = null;
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            NLETrackSlot next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            nLETrackSlot = next;
            long startTime = nLETrackSlot.getStartTime();
            if (j < nLETrackSlot.getMeasuredEndTime() && startTime <= j) {
                break;
            }
            i = i2;
        }
        return new CurrentSlotInfo(i, nLETrackSlot, j);
    }

    public MutableLiveData<SeekInfo> C5() {
        return this.LLJJJJJIL;
    }

    @Override // ge.i
    public Function0<C359740E8m> E3() {
        return this.LLJJIJIL;
    }

    public MutableLiveData<C0E75> H5() {
        return this.LLJJL;
    }

    @Override // X.C0E5S
    public /* bridge */ /* synthetic */ LiveData LLLIIIL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0E5S
    public /* bridge */ /* synthetic */ LiveData NU1() {
        return this.LLJJJJ;
    }

    @Override // X.C0E5S
    public /* bridge */ /* synthetic */ LiveEvent dE0() {
        return this.LLJJJ;
    }

    @Override // X.C0E5S
    public /* bridge */ /* synthetic */ LiveData dQ() {
        return this.LLJJL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public C560530Lyd<Unit> n5() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C359400E7e> o2() {
        return this.LLJJIJI;
    }

    public MutableLiveData<Pair<List<NLETrackSlot>, List<NLETrackSlot>>> t5() {
        return this.LLJJJJ;
    }

    @Override // X.C0E5S
    public /* bridge */ /* synthetic */ LiveEvent uo2() {
        return this.LLJJJIL;
    }

    public C560530Lyd<NLETrackSlot> v5() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C359370E7b> w2() {
        return this.LLJJIJIIJIL;
    }

    public MutableLiveData<C0E6I> x5() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0E5S
    public /* bridge */ /* synthetic */ LiveData zE2() {
        return this.LLJJJJJIL;
    }

    @Override // X.C0E5S
    public InterfaceC368720Ecw Ji(Function1<? super NLETrackSlot, Boolean> function1) {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            return interfaceC359430E7h.Ji(function1);
        }
        return null;
    }

    public final void M5(C0EHI c0ehi) {
        boolean z;
        C367190EaT c367190EaT;
        C366970Ea7 c366970Ea7;
        boolean effectMultiTrackMode = c0ehi.LJ.getEffectMultiTrackMode();
        boolean z2 = true;
        if (c0ehi.LJ.getRetouchMultiTrackMode() && c0ehi.LJ.getFromRetouch()) {
            z = true;
        } else {
            z = false;
        }
        if (c0ehi.LJ.getChangeBanMusicMode() == null) {
            z2 = false;
        }
        C0ELG c0elg = c0ehi.LIZJ.LIZ;
        InterfaceC369240Edm interfaceC369240Edm = c0elg.LJFF;
        if ((interfaceC369240Edm instanceof C366970Ea7) && (c366970Ea7 = (C366970Ea7) interfaceC369240Edm) != null) {
            c366970Ea7.LJIIL = this;
        }
        c0elg.LJI = new AwS549S0100000_5(this, 899);
        InterfaceC367810EbT interfaceC367810EbT = c0elg.LIZJ;
        if ((interfaceC367810EbT instanceof C367190EaT) && (c367190EaT = (C367190EaT) interfaceC367810EbT) != null) {
            c367190EaT.LIZJ.LJIIZILJ = this;
            c367190EaT.LIZLLL.LJI = this;
            c367190EaT.LJ.LJII = this;
            c367190EaT.LJFF.LJI = this;
        }
        i3(new AwS371S0200000_5(c0ehi, this, 188));
        S5(effectMultiTrackMode, z, z2, c0ehi.LIZ.LIZIZ);
        C348830Dlx c348830Dlx = this.LLLI;
        NLEModel nLEModel = c0ehi.LIZ.LIZIZ;
        c348830Dlx.getClass();
        C348830Dlx.LIZLLL(nLEModel);
        I61(c0ehi.LIZ.LIZIZ, false, false);
    }

    @Override // X.C0E5S
    public void R41(boolean z) {
        i3(new AwS20S0010000_5(z, 41));
    }

    @Override // X.C0E5S
    public void Tp(boolean z) {
        if (!T2().LIZJ.LIZLLL) {
            return;
        }
        this.LLLIIII.onAudioMuteClick(!T2().LIZJ.LIZJ, true);
    }

    @Override // X.C0E5S
    public void Xa2(Function1<? super C359500E7o, C359500E7o> function1) {
        i3(new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 765));
    }

    @Override // X.C0E5S
    public void ZP0(boolean z) {
        i3(new AwS20S0010000_5(z, 40));
    }

    @Override // X.C0E5S
    public void da0(TrackShowType trackShowType) {
        this.LLJZ.LJ(trackShowType);
    }

    @Override // X.C0E5S
    public void pl(float f) {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            interfaceC359430E7h.pl(f);
        } else {
            i3(new AwS3S0000001_5(f, 12));
        }
    }

    @Override // X.C0E5S
    public void q8(C0E6E c0e6e) {
        this.LLJZ.q8(c0e6e);
    }

    @Override // X.C0E5S
    public void wE(boolean z) {
        i3(new AwS20S0010000_5(z, 39));
    }

    @Override // X.C0E5S
    public void yV(Function1<? super C359480E7m, C359480E7m> function1) {
        C359480E7m c359480E7mInvoke = function1.invoke(T2().LJI);
        Boolean bool = this.LLJLILLLLZIIL;
        Boolean bool2 = Boolean.TRUE;
        if ((Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(this.LLJLL, bool2)) && c359480E7mInvoke.LJIIIIZZ) {
            c359480E7mInvoke = C359480E7m.LIZ(c359480E7mInvoke, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, 4194047);
        }
        i3(new AwS584S0100000_5(c359480E7mInvoke, 764));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0E7U] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0E7l] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0E45] */
    public C0E7Z(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = new C359460E7k(this);
        this.LLJJIJIIJIL = new C359490E7n(this);
        this.LLJJIJIL = new AwS549S0100000_5(this, 901);
        this.LLJJJ = new C560530Lyd<>();
        this.LLJJJIL = new C560530Lyd<>();
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = new MutableLiveData<>(C0E6I.IDLE);
        this.LLJJL = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        final ?? r0 = new InterfaceC350060Dnw() { // from class: X.0E7U
            @Override // X.InterfaceC350060Dnw
            public final void LIZ(C0E7P c0e7p) {
                if (c0e7p.LIZ.LIZJ) {
                    C0E7Z c0e7z = this.LIZ;
                    MutableLiveData<Pair<List<NLETrackSlot>, List<NLETrackSlot>>> mutableLiveData = c0e7z.LLJJJJ;
                    List<C350030Dnt> list = c0e7z.T2().LIZJ.LJFF.LIZJ;
                    ArrayList arrayList = new ArrayList();
                    Iterator<C350030Dnt> it2 = list.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().LIZLLL, arrayList);
                    }
                    List<C350030Dnt> list2 = c0e7p.LIZJ;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<C350030Dnt> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().LIZLLL, arrayList2);
                    }
                    mutableLiveData.setValue(new Pair<>(arrayList, arrayList2));
                }
                this.LIZ.i3(new AwS584S0100000_5(c0e7p, 761));
                if (c0e7p.LIZ.LIZLLL) {
                    this.LIZ.d5().LIZIZ();
                }
                this.LIZ.LLJZ.LJII();
            }

            @Override // X.InterfaceC350060Dnw
            public final void LIZIZ(C350100Do0 c350100Do0) {
                this.LIZ.i3(new AwS584S0100000_5(c350100Do0, 759));
            }

            @Override // X.InterfaceC350060Dnw
            public final void LIZJ(C350000Dnq c350000Dnq) {
                this.LIZ.i3(new AwS584S0100000_5(c350000Dnq, 760));
            }
        };
        this.LLJLLL = new InterfaceC350080Dny(r0) { // from class: X.0Dnp
            public final InterfaceC350060Dnw LIZ;
            public NLEModel LIZIZ;
            public final AFwS234S0000000_5 LIZJ = AFwS234S0000000_5.get$arr$(488);

            {
                this.LIZ = r0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x02b2  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x0322  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x0331  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0340  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x0362  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x03a2  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x03b3  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0435  */
            /* JADX WARN: Removed duplicated region for block: B:222:0x049b  */
            /* JADX WARN: Removed duplicated region for block: B:266:0x060f  */
            /* JADX WARN: Removed duplicated region for block: B:272:0x062a  */
            /* JADX WARN: Removed duplicated region for block: B:276:0x064e A[LOOP:17: B:274:0x0648->B:276:0x064e, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:280:0x0678  */
            /* JADX WARN: Removed duplicated region for block: B:283:0x0688  */
            /* JADX WARN: Removed duplicated region for block: B:286:0x0698  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x06a8  */
            /* JADX WARN: Removed duplicated region for block: B:292:0x06b8  */
            /* JADX WARN: Removed duplicated region for block: B:295:0x06c8  */
            /* JADX WARN: Removed duplicated region for block: B:298:0x06d8  */
            /* JADX WARN: Removed duplicated region for block: B:301:0x06e8  */
            /* JADX WARN: Removed duplicated region for block: B:306:0x0747  */
            /* JADX WARN: Removed duplicated region for block: B:314:0x0772  */
            /* JADX WARN: Removed duplicated region for block: B:319:0x078b  */
            /* JADX WARN: Removed duplicated region for block: B:322:0x0798  */
            /* JADX WARN: Removed duplicated region for block: B:325:0x07a8  */
            /* JADX WARN: Removed duplicated region for block: B:328:0x07cc  */
            /* JADX WARN: Removed duplicated region for block: B:329:0x07ce  */
            /* JADX WARN: Removed duplicated region for block: B:330:0x07d0  */
            /* JADX WARN: Removed duplicated region for block: B:401:0x04b7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:427:0x042f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:439:0x066f A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r10v1, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r10v50, types: [java.util.ArrayList] */
            @Override // X.InterfaceC350080Dny
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.ies.nle.editor_jni.NLEModel r35, boolean r36, boolean r37) {
                /*
                    Method dump skipped, instruction units count: 2003
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C349990Dnp.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel, boolean, boolean):void");
            }
        };
        final ?? r02 = new C0E7Q() { // from class: X.0E7l
            @Override // X.C0E7Q
            public final NLEModel LIZIZ() {
                return this.LIZ.T2().LIZJ.LIZ;
            }

            @Override // X.C0E7Q
            public final C0EG6 LIZJ() {
                return this.LIZ.E5();
            }

            @Override // X.C0E7Q
            public final C359400E7e LLD() {
                return this.LIZ.G2().LIZ;
            }

            @Override // X.C0E7Q
            public final void LIZ(C359620E8a c359620E8a) {
                if (!this.LIZ.T2().LJI.LJIJI) {
                    return;
                }
                this.LIZ.i3(new AwS584S0100000_5(c359620E8a, 763));
            }

            @Override // X.C0E7Q
            public final void LIZLLL(C0E75 c0e75) {
                this.LIZ.i3(new AwS584S0100000_5(c0e75, 762));
                this.LIZ.LLJJL.setValue(c0e75);
            }
        };
        this.LLJZ = new C0E7T(r02) { // from class: X.0E7N
            public final C0E7Q LIZ;
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(371));
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(372));

            @Override // X.C0E7T
            public final void LJII() {
                C359400E7e c359400E7eLLD = this.LIZ.LLD();
                TrackShowType trackShowType = c359400E7eLLD.LJ.LIZ;
                this.LIZ.LIZ(C359620E8a.LIZ(c359400E7eLLD.LJ, null, LIZIZ(trackShowType), LJIIIZ(trackShowType), LIZJ(trackShowType), LIZ(trackShowType), C0E7O.LIZ(c359400E7eLLD.LIZJ.LJFF, trackShowType).isEmpty(), false, 1793));
            }

            @Override // X.C0E7T
            public final void LJIIIIZZ() {
                C0E75 c0e75 = this.LIZ.LLD().LIZLLL;
                if (c0e75.LIZJ != null) {
                    if (c0e75.LJ == C0E6E.CLIP || C351220Dpo.LLJLLIL(c0e75.LIZIZ)) {
                        LJIIL(this, C0E75.LIZ(c0e75, C0E6E.LINE, EnumC358760E4s.USER_CLICK, 4047));
                    }
                }
            }

            public final boolean LJIIJJI() {
                return ((Boolean) this.LIZJ.getValue()).booleanValue();
            }

            {
                this.LIZ = r02;
            }

            public final float LIZ(TrackShowType trackShowType) {
                C359400E7e c359400E7eLLD = this.LIZ.LLD();
                boolean z = c359400E7eLLD.LJI.LJII;
                List<C350030Dnt> list = c359400E7eLLD.LIZJ.LJFF.LJII;
                if (!z) {
                    return 0.0f;
                }
                boolean z2 = !list.isEmpty();
                int iLJIIJ = 0;
                if (C0E7J.LIZIZ[trackShowType.ordinal()] != 1) {
                    iLJIIJ = LJIIJ(this, new boolean[]{z2});
                }
                return (iLJIIJ * 5.0f) + 4.0f;
            }

            public final float LIZIZ(TrackShowType trackShowType) {
                boolean z;
                float f;
                int iLJIIJ;
                C359400E7e c359400E7eLLD = this.LIZ.LLD();
                C0E7P c0e7p = c359400E7eLLD.LIZJ.LJFF;
                List<C350030Dnt> list = c0e7p.LJIIIIZZ;
                C359480E7m c359480E7m = c359400E7eLLD.LJI;
                boolean z2 = c359480E7m.LJII;
                boolean z3 = c359480E7m.LJI;
                List<C350030Dnt> list2 = c0e7p.LJII;
                List<C350030Dnt> list3 = c0e7p.LIZLLL;
                boolean z4 = !c0e7p.LIZJ.isEmpty();
                list3.isEmpty();
                if ((!list.isEmpty()) && z2) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = !list2.isEmpty();
                float f2 = 6.0f;
                if (!z3) {
                    if (LJIIJJI()) {
                        return 6.0f;
                    }
                    return 20.0f;
                }
                int[] iArr = C0E7J.LIZIZ;
                switch (iArr[trackShowType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        int i = iArr[trackShowType.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        iLJIIJ = LJIIJ(this, new boolean[]{z, z4, z5});
                                    } else {
                                        iLJIIJ = LJIIJ(this, new boolean[]{false, z5, z4});
                                    }
                                } else {
                                    iLJIIJ = LJIIJ(this, new boolean[]{z, z5, z4});
                                }
                            } else {
                                iLJIIJ = LJIIJ(this, new boolean[]{false, z, z5});
                            }
                        } else {
                            iLJIIJ = LJIIJ(this, new boolean[]{false, z, z4});
                        }
                        if (!LJIIJJI()) {
                            f2 = 20.0f;
                        }
                        return f2 + (iLJIIJ * 5.0f);
                    case 7:
                        if (LJIIJJI()) {
                            f = 34.0f;
                        } else {
                            f = 26.0f;
                        }
                        if (!LJIIJJI()) {
                            f2 = 20.0f;
                        }
                        return f2 + (0 * 5.0f) + ((z4 ? 1.0f : 0.0f) * f);
                    default:
                        if (LJIIJJI()) {
                            return 6.0f;
                        }
                        return 20.0f;
                }
            }

            public final float LIZJ(TrackShowType trackShowType) {
                boolean z;
                C359400E7e c359400E7eLLD = this.LIZ.LLD();
                C0E7P c0e7p = c359400E7eLLD.LIZJ.LJFF;
                List<C350030Dnt> list = c0e7p.LJIIIIZZ;
                boolean z2 = c359400E7eLLD.LJI.LJII;
                List<C350030Dnt> list2 = c0e7p.LJII;
                c0e7p.LIZLLL.isEmpty();
                int iLJIIJ = 0;
                if ((!list.isEmpty()) && z2) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = !list2.isEmpty();
                switch (C0E7J.LIZIZ[trackShowType.ordinal()]) {
                    case 1:
                        iLJIIJ = LJIIJ(this, new boolean[]{false, z});
                        break;
                    case 3:
                        iLJIIJ = LJIIJ(this, new boolean[]{z, z3});
                        break;
                    case 4:
                        iLJIIJ = LJIIJ(this, new boolean[]{false, z3});
                        break;
                    case 5:
                    case 6:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        iLJIIJ = LJIIJ(this, new boolean[]{false, z, z3});
                        break;
                }
                return (iLJIIJ * 5.0f) + 4.0f;
            }

            @Override // X.C0E7T
            public final void LJ(TrackShowType trackShowType) {
                boolean z;
                C359400E7e c359400E7eLLD = this.LIZ.LLD();
                TrackShowType trackShowType2 = c359400E7eLLD.LJ.LIZ;
                float fLIZIZ = LIZIZ(trackShowType);
                float fLJIIIZ = LJIIIZ(trackShowType);
                float fLIZJ = LIZJ(trackShowType);
                float fLIZ = LIZ(trackShowType);
                TrackShowType trackShowType3 = TrackShowType.PIP;
                if (trackShowType2 == trackShowType3 && trackShowType != trackShowType3) {
                    z = true;
                } else {
                    z = false;
                }
                this.LIZ.LIZ(C359620E8a.LIZ(c359400E7eLLD.LJ, trackShowType, fLIZIZ, fLJIIIZ, fLIZJ, fLIZ, C0E7O.LIZ(c359400E7eLLD.LIZJ.LJFF, trackShowType2).isEmpty(), z, 784));
            }

            public final float LJIIIZ(TrackShowType trackShowType) {
                boolean z = this.LIZ.LLD().LJI.LJI;
                List<C350030Dnt> list = this.LIZ.LLD().LIZJ.LJFF.LJI;
                if (!z) {
                    if (LJIIJJI()) {
                        return 2.0f;
                    }
                    return 0.0f;
                }
                switch (C0E7J.LIZIZ[trackShowType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        if (!list.isEmpty()) {
                            if (LJIIJJI()) {
                                return 11.0f;
                            }
                            return 9.0f;
                        }
                        if (LJIIJJI()) {
                            return 2.0f;
                        }
                        return 0.0f;
                    default:
                        if (LJIIJJI()) {
                            return 2.0f;
                        }
                        return 0.0f;
                }
            }

            @Override // X.C0E7T
            public final void q8(C0E6E c0e6e) {
                LJIIL(this, C0E75.LIZ(this.LIZ.LLD().LIZLLL, c0e6e, EnumC358760E4s.NORMAL, 4047));
            }

            public static int LJIIJ(C0E7N c0e7n, boolean[] zArr) {
                c0e7n.getClass();
                int i = 0;
                for (boolean z : zArr) {
                    if (z) {
                        i++;
                    }
                }
                return i;
            }

            /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LJIIL(X.C0E7N r19, X.C0E75 r20) {
                /*
                    Method dump skipped, instruction units count: 276
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0E7N.LJIIL(X.0E7N, X.0E75):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
            @Override // X.C0E7T
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(int r30, long r31, com.bytedance.ies.nle.editor_jni.NLETrack r33) {
                /*
                    Method dump skipped, instruction units count: 204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0E7N.LIZLLL(int, long, com.bytedance.ies.nle.editor_jni.NLETrack):void");
            }

            @Override // X.C0E7T
            public final void LJI(boolean z, NLETrackSlot nLETrackSlot, Integer num) {
                String name;
                C0E75 c0e75 = this.LIZ.LLD().LIZLLL;
                C0E6E c0e6e = C0E6E.CLIP;
                NLETrack nLETrackLJLLILLLL = null;
                if (c0e75 != null) {
                    String name2 = nLETrackSlot.getName();
                    NLETrackSlot nLETrackSlot2 = c0e75.LIZJ;
                    if (nLETrackSlot2 != null) {
                        name = nLETrackSlot2.getName();
                    } else {
                        name = null;
                    }
                    if (Intrinsics.LJFF(name2, name)) {
                        if (c0e75.LJ == c0e6e) {
                            c0e6e = C0E6E.LINE;
                        }
                        if (C0E5J.LIZJ(nLETrackSlot) || C0E5J.LIZLLL(nLETrackSlot) || C123100dR.LIZ(C351220Dpo.LJLJL(nLETrackSlot, "lyric_id", null))) {
                            c0e6e = C0E6E.LINE;
                        }
                    }
                }
                if (z) {
                    NLEModel nLEModelLIZIZ = this.LIZ.LIZIZ();
                    if (nLEModelLIZIZ != null) {
                        nLETrackLJLLILLLL = nLEModelLIZIZ.getMainTrack();
                    }
                    LJIIL(this, new C0E75(true, nLETrackLJLLILLLL, nLETrackSlot, num, c0e6e, EnumC358760E4s.USER_CLICK, false, false, false, false, null, false, 4032));
                    return;
                }
                NLEModel nLEModelLIZIZ2 = this.LIZ.LIZIZ();
                if (nLEModelLIZIZ2 != null) {
                    nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModelLIZIZ2, nLETrackSlot.getUUID());
                }
                LJIIL(this, new C0E75(false, nLETrackLJLLILLLL, nLETrackSlot, null, c0e6e, EnumC358760E4s.USER_CLICK, false, false, false, false, null, false, 4040));
            }

            @Override // X.C0E7T
            public final void w6(NLETrack nLETrack, boolean z, boolean z2) {
                EnumC358760E4s enumC358760E4s;
                this.LIZ.LIZJ();
                C0EG6.LIZLLL();
                if (z2) {
                    enumC358760E4s = EnumC358760E4s.CANCEL;
                } else {
                    enumC358760E4s = EnumC358760E4s.NORMAL;
                }
                LJIIL(this, new C0E75(true, nLETrack, null, null, null, enumC358760E4s, false, false, z, false, null, false, 3804));
            }

            @Override // X.C0E7T
            public final void LJFF(NLETrackSlot nLETrackSlot, C0E6E c0e6e, EnumC358760E4s enumC358760E4s, boolean z, boolean z2, boolean z3, boolean z4) {
                NLETrack trackBySlot;
                TrackShowType trackShowType;
                NLEModel nLEModelLIZIZ = this.LIZ.LIZIZ();
                if (nLEModelLIZIZ == null || (trackBySlot = nLEModelLIZIZ.getTrackBySlot(nLETrackSlot)) == null) {
                    return;
                }
                boolean z5 = true;
                if (!trackBySlot.getMainTrack()) {
                    NLETrackType nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(trackBySlot);
                    if (nLETrackTypeLJIIIIZZ == NLETrackType.AUDIO) {
                        trackShowType = TrackShowType.AUDIO;
                    } else if (nLETrackTypeLJIIIIZZ == NLETrackType.VIDEO && !trackBySlot.getMainTrack()) {
                        trackShowType = TrackShowType.PIP;
                    } else if (nLETrackTypeLJIIIIZZ == NLETrackType.STICKER) {
                        NLEResType resourceType = trackBySlot.getResourceType();
                        if (resourceType != null && C348640Dle.LIZ[resourceType.ordinal()] == 1) {
                            trackShowType = TrackShowType.TEXT;
                        } else {
                            trackShowType = TrackShowType.STICKER;
                        }
                    } else if (nLETrackTypeLJIIIIZZ == NLETrackType.EFFECT) {
                        trackShowType = TrackShowType.VIDEOEFFECT;
                    } else if (C351220Dpo.LLIILII(trackBySlot)) {
                        trackShowType = TrackShowType.ADJUST;
                    } else if (C351220Dpo.LLJI(trackBySlot)) {
                        trackShowType = TrackShowType.FILTER;
                    } else if (C351220Dpo.LLJLLIL(trackBySlot)) {
                        trackShowType = TrackShowType.LYRIC;
                    }
                    if (trackShowType != null && trackShowType != this.LIZ.LLD().LJ.LIZ) {
                        LJ(trackShowType);
                    }
                }
                if (!trackBySlot.getMainTrack() || C351220Dpo.LLJJI(nLETrackSlot)) {
                    z5 = false;
                }
                LJIIL(this, new C0E75(z5, trackBySlot, nLETrackSlot, Integer.valueOf(trackBySlot.getSlotIndex(nLETrackSlot)), c0e6e, enumC358760E4s, z, z2, false, z4, null, z3, 1280));
            }
        };
        this.LLJZIJLIL = new C0E44(getDiContainer(), c19a3, new AwS584S0100000_5(this, 758));
        this.LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 900));
        this.LLLF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(272));
        this.LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 898));
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 897));
        this.LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 896));
        this.LLLI = new C348830Dlx();
        this.LLLII = new C356950Dz3(getDiContainer(), new InterfaceC356960Dz4() { // from class: X.0E45
            @Override // X.InterfaceC356960Dz4
            public final void LIZ() {
                C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
                C0E46.LIZ().LIZ().LJ.LIZ(this.LIZ.LLJJI.mView, C0E4C.VIBRATE_IMPACT_LIGHT);
            }
        });
        this.LLLIIII = new C0E8D() { // from class: X.0E7R
            @Override // X.C0E8D
            public final boolean LIZJ() {
                return this.LIZ.k5().LIZ();
            }

            @Override // X.C0E8D
            public final void LIZLLL() {
                this.LIZ.LLJZ.LJIIIIZZ();
            }

            @Override // X.C0E8D
            public final void LJ() {
                this.LIZ.LLJJJIL.LJIIJ(Unit.LIZ);
            }

            @Override // X.C0E8D
            public final boolean LJI() {
                TrackShowType trackShowType = this.LIZ.T2().LJ.LIZ;
                boolean z = trackShowType == TrackShowType.NORMAL || trackShowType == TrackShowType.NORMAL_WITHOUT_OVERLAY;
                boolean z2 = !this.LIZ.T2().LIZJ.LJFF.LJI.isEmpty();
                NLEModel nLEModel = this.LIZ.T2().LIZJ.LIZ;
                if (nLEModel == null) {
                    return false;
                }
                C0EY2 c0ey2P4 = this.LIZ.P4();
                return z && z2 && C348840Dly.LIZ(c0ey2P4 != null ? c0ey2P4.getEditModel() : null, nLEModel);
            }

            @Override // X.C0E8D
            public final void LJII() {
                NLEModel nLEModel = this.LIZ.T2().LIZJ.LIZ;
                if (nLEModel == null) {
                    return;
                }
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(nLEModel.getExtra("editor_pro_seek_count"));
                if (numLJIIJJI == null) {
                    nLEModel.setExtra("editor_pro_seek_count", "1");
                } else {
                    nLEModel.setExtra("editor_pro_seek_count", String.valueOf(numLJIIJJI.intValue() + 1));
                }
            }

            @Override // X.C0E8D
            public final void onAddResourceClick() {
                if (C361460EFc.LIZ(this.LIZ.getEditModel())) {
                    this.LIZ.d5().LJFF();
                    return;
                }
                C0E48 c0e48F4 = this.LIZ.F4();
                if (c0e48F4 != null) {
                    c0e48F4.S7().LIZIZ(Unit.LIZ, "event_click_disable_replace_music_with_loop", false);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            @Override // X.C0E8D
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(com.ss.ugc.android.editor.track.TrackShowType r5) {
                /*
                    r4 = this;
                    X.0E7Z r0 = r4.LIZ
                    X.0EY2 r0 = r0.P4()
                    r3 = 0
                    if (r0 == 0) goto L31
                    androidx.lifecycle.LiveData r0 = r0.zu2()
                    if (r0 == 0) goto L31
                    java.lang.Object r0 = r0.getValue()
                    X.0EHI r0 = (X.C0EHI) r0
                    if (r0 == 0) goto L31
                    X.0ELJ r0 = r0.LJ
                    if (r0 == 0) goto L31
                    boolean r0 = r0.getEffectMultiTrackMode()
                    r2 = 1
                    if (r0 != r2) goto L31
                L22:
                    X.0E7Z r0 = r4.LIZ
                    java.lang.Object r0 = r0.T2()
                    X.0E7e r0 = (X.C359400E7e) r0
                    X.0E7S r0 = r0.LIZJ
                    com.bytedance.ies.nle.editor_jni.NLEModel r1 = r0.LIZ
                    if (r1 != 0) goto L33
                    return r3
                L31:
                    r2 = 0
                    goto L22
                L33:
                    if (r2 == 0) goto L3e
                    java.util.List r0 = X.C351220Dpo.LJJIJLIJ(r1)
                    boolean r3 = r0.isEmpty()
                L3d:
                    return r3
                L3e:
                    com.ss.ugc.android.editor.track.TrackShowType r0 = com.ss.ugc.android.editor.track.TrackShowType.VIDEOEFFECT
                    if (r5 != r0) goto L3d
                    java.util.List r0 = X.C351220Dpo.LJJIJLIJ(r1)
                    boolean r3 = r0.isEmpty()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0E7R.LIZ(com.ss.ugc.android.editor.track.TrackShowType):boolean");
            }

            @Override // X.C0E8D
            public final void LIZIZ(C0E6I c0e6i) {
                this.LIZ.LLJJJJLIIL.setValue(c0e6i);
            }

            @Override // X.C0E8D
            public final void LJFF(String str) {
                VecNLETrackSPtr tracks;
                NLETrackSlot next;
                NLEModel nLEModel = this.LIZ.T2().LIZJ.LIZ;
                if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
                    C0E7Z c0e7z = this.LIZ;
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(next.getName(), str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrackSlot nLETrackSlot = next;
                        if (nLETrackSlot != null) {
                            C0EU3 c0eu3 = C0EU3.LIZ;
                            NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
                            C0E48 c0e48LIZ = C349830DnZ.LIZ(c0e7z.getDiContainer());
                            c0eu3.getClass();
                            C0EU3.LIZJ(trackBySlot, nLETrackSlot, c0e48LIZ);
                            c0e7z.LLJZ.LJ(TrackShowType.PIP);
                            c0e7z.LLJZ.LJFF(nLETrackSlot, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true, false);
                        }
                    }
                }
            }

            @Override // X.C0E8D
            public final boolean LJIIIIZZ(TrackShowType trackShowType) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int iLIZJ;
                boolean z5;
                boolean z6;
                boolean z7;
                LiveData<C0EHI> liveDataZu2;
                C0EHI value;
                C0ELJ c0elj;
                C0EY2 c0ey2P4 = this.LIZ.P4();
                C0ELL changeBanMusicMode = null;
                if (c0ey2P4 != null && (liveDataZu2 = c0ey2P4.zu2()) != null && (value = liveDataZu2.getValue()) != null && (c0elj = value.LJ) != null) {
                    changeBanMusicMode = c0elj.getChangeBanMusicMode();
                }
                if (changeBanMusicMode != null) {
                    z = true;
                } else {
                    z = false;
                }
                NLEModel nLEModel = this.LIZ.T2().LIZJ.LIZ;
                if (nLEModel == null) {
                    return false;
                }
                if (z) {
                    return ((ArrayList) C351220Dpo.LJIJJ(nLEModel)).isEmpty();
                }
                if (trackShowType != TrackShowType.NORMAL && trackShowType != TrackShowType.NORMAL_WITHOUT_OVERLAY) {
                    if (trackShowType != TrackShowType.AUDIO) {
                        return false;
                    }
                    return ((ArrayList) C351220Dpo.LJIJJ(nLEModel)).isEmpty();
                }
                if (!(!((ArrayList) C349930Dnj.LJFF(nLEModel)).isEmpty()) && C351220Dpo.LJLIIL(nLEModel) <= 0 && C351220Dpo.LJIJI(nLEModel) <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (C351220Dpo.LJJIJL(nLEModel) > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (C351220Dpo.LJLL(nLEModel) > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_STICKER, Boolean.FALSE)).booleanValue()) {
                    iLIZJ = C351220Dpo.LJJJJZI(nLEModel);
                } else {
                    iLIZJ = C0EKP.LIZJ(nLEModel);
                }
                if (iLIZJ > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (((ArrayList) C351220Dpo.LJJJJLI(nLEModel)).size() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    NLETrack next = it2.next();
                    if (C351220Dpo.LLIILZL(next)) {
                        if (next != null) {
                            z7 = true;
                        }
                    }
                }
                z7 = false;
                if (z2 || z3 || z4 || z7 || z6 || z5) {
                    return false;
                }
                return true;
            }

            @Override // X.C0E8D
            public final void onVideoPositionChanged(SeekInfo seekInfo) {
                this.LIZ.LLJJJJJIL.setValue(seekInfo);
            }

            @Override // X.C0E8D
            public final boolean LJIIIZ(NLETrackSlot nLETrackSlot, View view) {
                boolean z;
                NLETrack trackBySlot;
                if (nLETrackSlot == null || !this.LIZ.T2().LJI.LJ) {
                    return false;
                }
                if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && C0OBG.LIZ(200L, view)) {
                    this.LIZ.d5().LIZ(nLETrackSlot);
                    return true;
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_double_tap_sound_track_to_open_the_adjust_panel", true, false)) {
                    NLEModel nLEModel = this.LIZ.T2().LIZJ.LIZ;
                    if (nLEModel != null) {
                        trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
                    } else {
                        trackBySlot = null;
                    }
                    if (C351220Dpo.LLILLL(trackBySlot) && C0OBG.LIZ(200L, view)) {
                        this.LIZ.d5().LJ(nLETrackSlot);
                        return true;
                    }
                }
                return false;
            }

            @Override // X.C0E8D
            public final void onAudioMuteClick(boolean z, boolean z2) {
                this.LIZ.k5().LJFF(z, z2);
            }

            @Override // X.C0E8D
            public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
                this.LIZ.k5().LJII(i, i2, nLETrackSlot, j, j2, j3, z);
                if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null || NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null || C351220Dpo.LLJJI(nLETrackSlot)) {
                    this.LIZ.LLJZ.LJFF(nLETrackSlot, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true, false);
                }
            }
        };
    }

    public final void H4(NLEModel nLEModel, NLEModel nLEModel2) {
        boolean z;
        if (nLEModel2 == null) {
            return;
        }
        if (nLEModel != null && nLEModel.getId() == nLEModel2.getId()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (z2) {
            I61(nLEModel2, false, true);
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check track NLEModel need update:");
        sbLIZ.append(z2);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0E5S
    public void QD2(boolean z, boolean z2) {
        i3(new AwS2S0020000_5(z, z2, 1));
    }

    @Override // X.C0E5S
    public void lf1(long j, int i) {
        i3(new C359420E7g(j, i));
    }

    @Override // X.C0E5S
    public void zv(PlayPositionState playPositionState, boolean z) {
        InterfaceC359430E7h interfaceC359430E7h = this.LLJLIL;
        if (interfaceC359430E7h != null) {
            interfaceC359430E7h.zv(playPositionState, z);
        } else {
            i3(new AwS584S0100000_5(playPositionState, 766));
        }
    }

    @Override // X.C0E5S
    public void I61(NLEModel nLEModel, boolean z, boolean z2) {
        if (!T2().LJFF.LIZ.LIZ) {
            return;
        }
        T2().LIZJ.LIZ = nLEModel;
        this.LLJLLL.LIZ(nLEModel, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(boolean r7, com.bytedance.ies.nle.editor_jni.NLETrackSlot r8, java.lang.Integer r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.T2()
            X.0E7e r0 = (X.C359400E7e) r0
            X.0E7S r0 = r0.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = r0.LIZ
            if (r2 != 0) goto Ld
            return
        Ld:
            com.bytedance.ies.nle.editor_jni.NLETrack r3 = r2.getTrackBySlot(r8)
            X.0EG6 r0 = r6.E5()
            r0.getClass()
            X.0EU3 r1 = X.C0EU3.LIZ
            X.01GW r0 = r0.LLILLL
            java.lang.Object r0 = r0.getValue()
            X.0E48 r0 = (X.C0E48) r0
            r1.getClass()
            X.C0EU3.LIZJ(r3, r8, r0)
            java.lang.Object r0 = r6.T2()
            X.0E7e r0 = (X.C359400E7e) r0
            X.0E8a r0 = r0.LJ
            com.ss.ugc.android.editor.track.TrackShowType r1 = r0.LIZ
            com.ss.ugc.android.editor.track.TrackShowType r0 = com.ss.ugc.android.editor.track.TrackShowType.NORMAL
            r4 = 1
            if (r1 != r0) goto Lb4
            r5 = 1
        L38:
            boolean r0 = X.C351220Dpo.LLLJL(r3)
            if (r0 == 0) goto L4e
            int r0 = X.C351220Dpo.LJLL(r2)
        L42:
            if (r7 != 0) goto Lb6
            if (r5 == 0) goto Lb6
            if (r0 <= r4) goto Lb6
            X.0Lyd<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r6.LLJJJ
            r0.LJIIJ(r8)
            return
        L4e:
            boolean r0 = X.C351220Dpo.LLJJIII(r3)
            if (r0 != 0) goto Laf
            boolean r0 = X.C351220Dpo.LLLLILI(r3)
            if (r0 != 0) goto Laf
            boolean r0 = X.C351220Dpo.LLJI(r3)
            if (r0 == 0) goto L6b
            java.util.List r0 = X.C351220Dpo.LJJJJLI(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            goto L42
        L6b:
            boolean r0 = X.C351220Dpo.LLIILZL(r3)
            if (r0 == 0) goto L9c
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r2.getTracks()
            if (r0 == 0) goto Lad
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L80:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            boolean r0 = X.C351220Dpo.LLIILZL(r0)
            if (r0 == 0) goto L80
            r3.add(r1)
            goto L80
        L97:
            int r0 = r3.size()
            goto L42
        L9c:
            boolean r0 = X.C351220Dpo.LLJLILLLLZIIL(r3)
            if (r0 != 0) goto La8
            boolean r0 = X.C351220Dpo.LLJJJJ(r3)
            if (r0 == 0) goto Lad
        La8:
            int r0 = X.C351220Dpo.LJJJJZI(r2)
            goto L42
        Lad:
            r0 = 0
            goto L42
        Laf:
            int r0 = X.C351220Dpo.LJJIJL(r2)
            goto L42
        Lb4:
            r5 = 0
            goto L38
        Lb6:
            X.0E7T r0 = r6.LLJZ
            r0.LJI(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E7Z.N5(boolean, com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.Integer):void");
    }

    @Override // X.C0E5S
    public void w6(NLETrack nLETrack, boolean z, boolean z2) {
        this.LLJZ.w6(nLETrack, z, z2);
    }

    private final void S5(boolean z, boolean z2, boolean z3, NLEModel nLEModel) {
        boolean z4;
        TrackShowType trackShowType;
        if (Intrinsics.LJFF(this.LLJLILLLLZIIL, Boolean.valueOf(z)) && Intrinsics.LJFF(this.LLJLLIL, Boolean.valueOf(z3)) && Intrinsics.LJFF(this.LLJLL, Boolean.valueOf(z2))) {
            return;
        }
        this.LLJLILLLLZIIL = Boolean.valueOf(z);
        this.LLJLL = Boolean.valueOf(z2);
        this.LLJLLIL = Boolean.valueOf(z3);
        if (z3 && C346780Die.LIZ(nLEModel) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        i3(new C359390E7d(z, z3, z2, z4));
        I61(nLEModel, true, false);
        if (z) {
            trackShowType = TrackShowType.VIDEOEFFECT;
        } else if (z3) {
            trackShowType = TrackShowType.AUDIO;
        } else if (z2) {
            trackShowType = TrackShowType.RETOUCH;
        } else {
            trackShowType = TrackShowType.NORMAL;
        }
        this.LLJZ.LJ(trackShowType);
    }

    @Override // X.C0E5S
    public void G22(NLETrackSlot nLETrackSlot, C0E6E c0e6e, EnumC358760E4s enumC358760E4s, boolean z, boolean z2, boolean z3) {
        this.LLJZ.LJFF(nLETrackSlot, c0e6e, enumC358760E4s, z, z2, z3, false);
    }
}
