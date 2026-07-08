package X;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358990E5p extends C0ETZ<InterfaceC373190Ek9, C359670E8f, C359700E8i, InterfaceC359660E8e> implements InterfaceC373190Ek9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLJJI;
    public final Function0<C359700E8i> LLJJIII;
    public final Function0<C0E40> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public C359010E5r LLJJJIL;
    public final C359020E5s LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public InterfaceC358980E5o LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C358990E5p.class, "loadingApi", "getLoadingApi()Lcom/ss/android/ugc/gamora/editorpro/components/loading/CircleLoadingApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C358990E5p.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/android/ugc/gamora/editorpro/components/consolebar/PanelConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C358990E5p.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/trim/SmartTrimPanelContext;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final C0E64 O4() {
        return (C0E64) this.LLJJJJJIL.getValue(this, LLJJL[2]);
    }

    public final C0E5D H4() {
        return (C0E5D) this.LLJJJ.getValue(this, LLJJL[1]);
    }

    public final InterfaceC359070E5x K4() {
        return (InterfaceC359070E5x) this.LLJJIJIL.getValue(this, LLJJL[0]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC373190Ek9
    public void cancel() {
        final C0E60 c0e60;
        C359010E5r c359010E5r;
        C0E64 c0e64O4 = O4();
        if (c0e64O4 == null || (c0e60 = c0e64O4.LLILZ) == null || (c359010E5r = this.LLJJJIL) == null) {
            return;
        }
        c359010E5r.LIZ();
        c0e60.LIZIZ(new AbstractC356490DyJ() { // from class: X.0DyM
            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZIZ() {
                super.LIZIZ();
                this.LIZIZ.getClass();
            }

            {
                super(this.LIZIZ);
            }
        }, true);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            this.LLJJJIL = new C359010E5r(c0e48F4);
        }
        C359010E5r c359010E5r = this.LLJJJIL;
        if (c359010E5r != null) {
            C359040E5u c359040E5u = c359010E5r.LJ;
            c359040E5u.LLILLJJLI.LIZ.getPlayer().LJJ(c359040E5u);
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, c359040E5u);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C359010E5r c359010E5r = this.LLJJJIL;
        if (c359010E5r != null) {
            c359010E5r.LIZ();
        }
    }

    @Override // X.InterfaceC373190Ek9
    public void save() {
        final C0E60 c0e60;
        final C359010E5r c359010E5r;
        C0E64 c0e64O4 = O4();
        if (c0e64O4 == null || (c0e60 = c0e64O4.LLILZ) == null || (c359010E5r = this.LLJJJIL) == null) {
            return;
        }
        c359010E5r.LIZ();
        c0e60.LIZIZ(new AbstractC356490DyJ(c359010E5r) { // from class: X.0Dzc
            public long LIZIZ;
            public long LIZJ;
            public final /* synthetic */ C359010E5r LJ;

            /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
            @Override // X.AbstractC356490DyJ, X.C0E62
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.Long> LIZJ() {
                /*
                    Method dump skipped, instruction units count: 364
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C357300Dzc.LIZJ():kotlin.Pair");
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZLLL() {
                this.LIZIZ = C350870DpF.LJ(this.LJ.LIZ);
                NLETrack mainTrack = C350870DpF.LJI(this.LJ.LIZ).getMainTrack();
                this.LIZJ = mainTrack != null ? mainTrack.getMaxEnd() : 0L;
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LIZIZ() {
                super.LIZIZ();
                this.LIZLLL.getClass();
            }

            @Override // X.AbstractC356490DyJ, X.C0E62
            public final void LJ(Pair<? extends NLETrackSlot, Long> pair) {
                Long second;
                InterfaceC360800ECo consoleBar;
                if (pair != null && (second = pair.getSecond()) != null) {
                    long jLongValue = second.longValue();
                    IConsoleBarService iConsoleBarService = (IConsoleBarService) C792600V7i.LIZ(IConsoleBarService.class);
                    if (iConsoleBarService != null && (consoleBar = iConsoleBarService.getConsoleBar()) != null) {
                        consoleBar.gm0(Long.valueOf(C351220Dpo.LLLLLLL(jLongValue)), null);
                    }
                }
            }

            @Override // X.AbstractC356490DyJ
            public final boolean LJFF(C0E48 c0e48) {
                boolean z;
                ArrayList<C351480DqE> arrayList = new ArrayList<>();
                C359010E5r c359010E5r2 = this.LJ;
                synchronized (c359010E5r2.LIZJ) {
                    try {
                        arrayList.clear();
                        arrayList.addAll(c359010E5r2.LIZJ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                ((SmartTrimViewModel) this.LJ.LJIIL.getValue()).CQ2(arrayList, this.LJ.LJII);
                long jLongValue = 0;
                for (Pair<Long, Long> pair : this.LJ.LIZIZ) {
                    jLongValue += pair.getSecond().longValue() - pair.getFirst().longValue();
                }
                if (C352310DrZ.LIZLLL(jLongValue) - this.LIZJ != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c0e48.Rn().setExtra("is_editor_pro_smart_trim", String.valueOf(z));
                EditModelProvider.Companion.getClass();
                VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
                if (editModel != null) {
                    C361680EFy.LJJLJ(editModel, c0e48, z);
                }
                C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(C0E1V.SMART_TRIM.getNameId(), null, null, null, null, 30)));
                return true;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.LIZLLL);
                this.LJ = c359010E5r;
            }
        }, true);
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C359700E8i> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0E40> w2() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC373190Ek9
    public void MI1(InterfaceC358980E5o interfaceC358980E5o) {
        this.LLJJJJLIIL = interfaceC358980E5o;
        C0E64 c0e64O4 = O4();
        if (c0e64O4 != null) {
            P4(c0e64O4);
        }
    }

    public final void P4(C0E64 c0e64) {
        VecNLETrackSlotSPtr slots;
        int slotIndex;
        C359010E5r c359010E5r = this.LLJJJIL;
        if (c359010E5r != null) {
            c0e64.getClass();
            c359010E5r.LJII = false;
            ((SmartTrimViewModel) c359010E5r.LJIIL.getValue()).AQ2();
            long jLLLLLLL = C351220Dpo.LLLLLLL(c359010E5r.LIZ.Rn().getMaxEnd());
            if (!c359010E5r.LJII) {
                NLETrackSlot nLETrackSlotLLLLLLIL = c359010E5r.LIZ.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL != null) {
                    jLLLLLLL = C351220Dpo.LLLLLLL(nLETrackSlotLLLLLLIL.getDuration());
                    slotIndex = c359010E5r.LIZ.Rn().getSlotIndex(nLETrackSlotLLLLLLIL);
                } else {
                    slotIndex = -1;
                }
                c359010E5r.LJIIIZ = slotIndex;
                NLETrackSlot nLETrackSlotLLLLLLIL2 = c359010E5r.LIZ.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL2 != null) {
                    ((SmartTrimViewModel) c359010E5r.LJIIL.getValue()).BQ2(nLETrackSlotLLLLLLIL2);
                }
            }
            c359010E5r.LJIIIIZZ = C350870DpF.LJI(c359010E5r.LIZ).deepClone(false);
            c359010E5r.LIZLLL.LIZIZ(0L, C0E3L.LIZ, true, true);
            C0E5D c0e5dH4 = H4();
            if (c0e5dH4 != null) {
                c0e5dH4.y2(jLLLLLLL);
            }
        }
        C359010E5r c359010E5r2 = this.LLJJJIL;
        if (c359010E5r2 != null) {
            NLETrack mainTrack = C350870DpF.LJI(c359010E5r2.LIZ).getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                if (it2.hasNext()) {
                    Long lValueOf = Long.valueOf(it2.next().getDuration());
                    while (it2.hasNext()) {
                        Long lValueOf2 = Long.valueOf(it2.next().getDuration());
                        if (lValueOf.compareTo(lValueOf2) > 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                    if (lValueOf != null) {
                        float fLIZ = C352310DrZ.LIZ(lValueOf.longValue());
                        float fLIZJ = C360610EBv.LIZJ() * fLIZ;
                        float f = c359010E5r2.LJFF;
                        float f2 = C360610EBv.LIZJ / (f / fLIZ);
                        float f3 = LSPassThroughRecordSizeConfig.DEFAULT / f2;
                        if (fLIZJ < f) {
                            C360610EBv.LIZ = (int) f2;
                        }
                        c359010E5r2.LJIIJ = Math.max(f3, C368130Ebz.LIZJ);
                    }
                }
            }
            i3(new AwS3S0000001_5(c359010E5r2.LJIIJ, 11));
        }
        C359010E5r c359010E5r3 = this.LLJJJIL;
        if (c359010E5r3 != null) {
            c359010E5r3.LJIIJJI = new C359080E5y(this);
        }
        final C359020E5s c359020E5s = this.LLJJJJ;
        InterfaceC359070E5x interfaceC359070E5xK4 = c359020E5s.LJ.K4();
        if (interfaceC359070E5xK4 != null) {
            interfaceC359070E5xK4.ik0(new AwS406S0200000_5(c359020E5s, c359020E5s.LJ, 70));
        }
        c359020E5s.LIZ = System.currentTimeMillis();
        BaseViewModel baseViewModel = (BaseViewModel) c359020E5s.LIZLLL.getValue();
        InterfaceC355380DwW interfaceC355380DwW = new InterfaceC355380DwW() { // from class: X.0E5j
            @Override // X.InterfaceC355380DwW
            public final void LIZ(long j, boolean z) {
                C361680EFy.LJIIIZ(j, z);
            }
        };
        C0E48 c0e48 = baseViewModel.editorContext;
        if (c0e48 != null) {
            c0e48.LLFII().LJJLL(interfaceC355380DwW);
        }
        SmartTrimViewModel smartTrimViewModel = (SmartTrimViewModel) c359020E5s.LIZLLL.getValue();
        final C358990E5p c358990E5p = c359020E5s.LJ;
        smartTrimViewModel.vQ2(new InterfaceC355360DwU() { // from class: X.0E5q
            @Override // X.InterfaceC355360DwU
            public final void onProgress(int i) {
                InterfaceC359070E5x interfaceC359070E5xK42 = c358990E5p.K4();
                if (interfaceC359070E5xK42 != null) {
                    interfaceC359070E5xK42.setProgress(i);
                }
            }

            @Override // X.InterfaceC355360DwU
            public final void onSuccess(List<Pair<Long, Long>> list) {
                boolean z;
                C359010E5r c359010E5r4;
                Long l;
                C358990E5p c358990E5p2;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL;
                InterfaceC358980E5o interfaceC358980E5o = c358990E5p.LLJJJJLIIL;
                if (interfaceC358980E5o != null) {
                    interfaceC358980E5o.onSuccess();
                }
                InterfaceC359070E5x interfaceC359070E5xK42 = c358990E5p.K4();
                if (interfaceC359070E5xK42 != null) {
                    interfaceC359070E5xK42.setProgress(100.0f);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - c359020E5s.LIZ;
                Long l2 = null;
                C361680EFy.LJJLL("", jCurrentTimeMillis, 0, null);
                if (c358990E5p.F4() != null && (videoPublishEditModelLJJJLIIL = (c358990E5p2 = c358990E5p).LJJJLIIL()) != null) {
                    C361680EFy.LJJLJLI(jCurrentTimeMillis, videoPublishEditModelLJJJLIIL, c358990E5p2.F4());
                }
                C359020E5s c359020E5s2 = c359020E5s;
                Keva keva = c359020E5s2.LIZIZ;
                if (keva != null) {
                    z = keva.getBoolean((String) c359020E5s2.LIZJ.getValue(), false);
                } else {
                    z = false;
                }
                if (!z) {
                    c359020E5s.LJ.i3(new AwS20S0001000_5(2131848553, 18));
                    C359020E5s c359020E5s3 = c359020E5s;
                    Keva keva2 = c359020E5s3.LIZIZ;
                    if (keva2 != null) {
                        keva2.storeBoolean((String) c359020E5s3.LIZJ.getValue(), true);
                    }
                }
                C359010E5r c359010E5r5 = c358990E5p.LLJJJIL;
                if (c359010E5r5 != null) {
                    C359020E5s c359020E5s4 = c359020E5s;
                    long maxEnd = c359010E5r5.LIZ.Rn().getMaxEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    long j = maxEnd - ((long) 3);
                    if (list.size() <= 1) {
                        Pair pair = (Pair) C13LP.LJJJLL(list);
                        if (pair != null) {
                            l = (Long) pair.getFirst();
                        } else {
                            l = null;
                        }
                        Pair pair2 = (Pair) C13LP.LJJJLL(list);
                        if (pair2 != null) {
                            l2 = (Long) pair2.getSecond();
                        }
                        if (l != null && l.longValue() == 0) {
                            C354710DvR c354710DvR = new C354710DvR(j, maxEnd);
                            if (l2 != null && c354710DvR.LJIIIIZZ(l2.longValue())) {
                                c359020E5s4.LJ.i3(new AwS20S0001000_5(2131848551, 18));
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                c358990E5p.i3(new AwS584S0100000_5(arrayList, (ArrayList<Bitmap>) 662));
                if (c358990E5p.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED && (c359010E5r4 = c358990E5p.LLJJJIL) != null && !c359010E5r4.LIZ.getPlayer().isPlaying()) {
                    c359010E5r4.LIZ.getPlayer().LLIL(false);
                }
            }

            @Override // X.InterfaceC355360DwU
            public final void onFail(int i, String str) {
                C361680EFy.LJJLL(str, System.currentTimeMillis() - c359020E5s.LIZ, 1, Integer.valueOf(i));
                c359020E5s.LJ.i3(new AwS20S0001000_5(2131848557, 18));
                InterfaceC359070E5x interfaceC359070E5xK42 = c358990E5p.K4();
                if (interfaceC359070E5xK42 != null) {
                    interfaceC359070E5xK42.dismiss();
                }
                InterfaceC358980E5o interfaceC358980E5o = c358990E5p.LLJJJJLIIL;
                if (interfaceC358980E5o != null) {
                    interfaceC358980E5o.onFail();
                }
            }
        });
    }

    public C358990E5p(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = AFwS191S0000000_5.get$arr$(208);
        this.LLJJIJI = new AwS549S0100000_5(this, 746);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(209));
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359070E5x.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0E5D.class, null);
        this.LLJJJJ = new C359020E5s(this);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E64.class, null);
    }
}
