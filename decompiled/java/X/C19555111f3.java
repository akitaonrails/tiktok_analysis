package X;

import Y.AfS198S0100000_29;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectTabApiResponse;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11f3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19555111f3 extends C0ETX<InterfaceC375960Eoc, C19553011ei, C19553411em, InterfaceC19552911eh> implements InterfaceC375960Eoc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final C19555011f2 LLJJLIIIJLLLLLLLZ;
    public final C11NJ LLJL;
    public final C20498815Ja LLJLIL;
    public long LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19555111f3.class, "draftApi", "getDraftApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/effect/ui/SheetPanelNavApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19555111f3.class, "loadingApi", "getLoadingApi()Lcom/ss/android/ugc/gamora/editorpro/components/loading/TuxLoadingApiComponent;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJZIJLIL = 8;
    }

    private final boolean R5() {
        return ((Boolean) this.LLJLLL.getValue()).booleanValue();
    }

    public final C19552511ed E5() {
        return (C19552511ed) this.LLJLL.getValue();
    }

    public final InterfaceC375970Eod H5() {
        return (InterfaceC375970Eod) this.LLJJJJLIIL.getValue(this, LLJZ[0]);
    }

    public final InterfaceC19555511f7 M5() {
        return (InterfaceC19555511f7) this.LLJJL.getValue(this, LLJZ[1]);
    }

    public final C0EBB N5() {
        return (C0EBB) this.LLJLLIL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19553411em> o2() {
        return AFwS218S0000000_29.get$arr$(291);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        this.LLJL.dispose();
        super.onDestroy();
        this.LLJLIL.release();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<InterfaceC19552911eh> w2() {
        return new AwS573S0100000_29(this, 712);
    }

    public final void S5() {
        InterfaceC19555511f7 interfaceC19555511f7M5 = M5();
        if (interfaceC19555511f7M5 != null) {
            interfaceC19555511f7M5.LJ();
        }
        InterfaceC19555511f7 interfaceC19555511f7M52 = M5();
        if (interfaceC19555511f7M52 != null) {
            interfaceC19555511f7M52.tO2(new InterfaceC19556011fC() { // from class: X.11f8
                @Override // X.InterfaceC19556011fC
                public final void LIZIZ() {
                    this.LIZ.S5();
                }
            });
        }
        final boolean zR5 = R5();
        final C19552511ed c19552511edE5 = E5();
        this.LLJL.LIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.11eY
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Pair<List<SoundEffectTabModel>, Boolean>> c09aj) {
                C19552511ed c19552511ed;
                int i;
                int i2;
                String str;
                List<SoundEffectTabModel> list;
                C1C7U.LIZ("SoundEffectTabApi$Companion@8833.getSoundEffectTab$1");
                try {
                    c19552511ed = c19552511edE5;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.tryOnError(e);
                    C19563211gM.LIZJ(!zR5 ? 1 : 0, -9999, false);
                }
                if (!c19552511ed.LIZ.isEmpty() && (list = c19552511ed.LIZ) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    c09aj.onNext(new Pair<>(arrayList, Boolean.TRUE));
                    C1C7U.LIZIZ("SoundEffectTabApi$Companion@8833.getSoundEffectTab$1");
                    return;
                }
                SoundEffectTabApiResponse soundEffectTabApiResponseLIZ = C19551911eX.LIZ(zR5);
                ArrayList<SoundEffectTabModel> arrayList2 = soundEffectTabApiResponseLIZ.list;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    ArrayList<SoundEffectTabModel> arrayList3 = soundEffectTabApiResponseLIZ.list;
                    ArrayList arrayList4 = new ArrayList();
                    for (SoundEffectTabModel soundEffectTabModel : arrayList3) {
                        SoundEffectTabModel soundEffectTabModel2 = soundEffectTabModel;
                        String str2 = soundEffectTabModel2.id;
                        if (str2 != null && str2.length() != 0 && (str = soundEffectTabModel2.name) != null && str.length() != 0) {
                            arrayList4.add(soundEffectTabModel);
                        }
                    }
                    C19552511ed c19552511ed2 = c19552511edE5;
                    c19552511ed2.LIZ.clear();
                    c19552511ed2.LIZ.addAll(arrayList4);
                    if (zR5) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    C19563211gM.LIZJ(i2, 0, true);
                    c09aj.onNext(new Pair<>(arrayList4, Boolean.FALSE));
                } else {
                    c09aj.tryOnError(new IllegalStateException("result list is null"));
                    if (zR5) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C19563211gM.LIZJ(i, soundEffectTabApiResponseLIZ.status_code, false);
                }
                C1C7U.LIZIZ("SoundEffectTabApi$Companion@8833.getSoundEffectTab$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(this, 16), new AfS198S0100000_29(this, 17)));
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJLILLLLZIIL = System.currentTimeMillis();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLJLIL.pause();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJLIL.resume();
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJJIL;
    }

    public C19555111f3(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c1drg;
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC375970Eod.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19555511f7.class, null);
        this.LLJJLIIIJLLLLLLLZ = new C19555011f2(this);
        this.LLJL = new C11NJ();
        this.LLJLIL = new C20498815Ja("SoundEffectFragment");
        this.LLJLILLLLZIIL = System.currentTimeMillis();
        this.LLJLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(120));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(121));
        this.LLJLLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(122));
    }
}
