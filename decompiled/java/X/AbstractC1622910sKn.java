package X;

import X.InterfaceC1625000sOA;
import Y.ACallableS253S0200000_25;
import Y.AObjectS246S0100000_25;
import Y.AObserverS130S0300000_25;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1622910sKn<API extends InterfaceC1625000sOA> extends AbstractC2255721DQs<API> implements InterfaceC1625000sOA, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C1DRG LL;
    public final C19GS LLILLJJLI = (C19GS) getDiContainer().LJII(C19GS.class, null);
    public final InterfaceC1625220sOW LLILLL;
    public final InterfaceC1650230t2r LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC2254081DKk LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final C1622920sKo LLIZLLLIL;
    public final C11NJ LLJ;
    public final AbstractC1623220sLI LLJI;
    public final C385670FAf<Boolean> LLJIJIL;
    public final C1623050sL1 LLJILJIL;
    public final C1624590sNV LLJILJILJ;
    public C1623130sL9 LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public C1628610sTz LLJJIJI;
    public final C1622930sKp LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final MessageCenter.Listener LLJJJ;
    public final C560530Lyd<Boolean> LLJJJIL;
    public final C560530Lyd<Boolean> LLJJJJ;
    public final C560530Lyd<AbstractC1448380nnI> LLJJJJJIL;
    public final C560530Lyd<Boolean> LLJJJJLIIL;
    public boolean LLJJL;
    public final C1623000sKw LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<Boolean> LLJL;
    public final C560530Lyd<Boolean> LLJLIL;
    public final C560530Lyd<Effect> LLJLILLLLZIIL;
    public final C560530Lyd<Boolean> LLJLL;
    public final C560530Lyd<Unit> LLJLLIL;
    public final MutableLiveData<Effect> LLJLLL;
    public final MutableLiveData<Boolean> LLJZ;
    public final C560530Lyd<AbstractC1627380sS0> LLJZIJLIL;
    public final C11RK<Pair<Effect, C991780buq>> LLL;
    public final C1623150sLB LLLF;
    public boolean LLLFF;
    public List<String> LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1622910sKn.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1622910sKn.class, "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/tools/effectplatform/api/IEffectPlatformPrimitive;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public void B3(long j) {
    }

    public boolean E3() {
        return false;
    }

    public abstract AiMeStyleInfo F4();

    public void G2(InterfaceC1621520sIY interfaceC1621520sIY) {
    }

    public List<String> P4(Effect effect) {
        return null;
    }

    public void c3(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp) {
    }

    @Override // X.InterfaceC1625000sOA
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    public void u7(List<? extends Effect> list) {
    }

    public C1623130sL9 y7() {
        C1623130sL9 c1623130sL9 = new C1623130sL9(this.LLILLJJLI, this, (InterfaceC1628180sTI) getDiContainer().LJII(InterfaceC1628180sTI.class, null), C0(), this.LLILLL, (InterfaceC1630220sWa) getDiContainer().LJII(InterfaceC1630220sWa.class, null), new AwS639S0100000_25(this, 11), null, new AwS569S0100000_25((AbstractC1622910sKn) this, 88), 128);
        this.LLJILLL = c1623130sL9;
        return c1623130sL9;
    }

    private final void L7() {
        AbstractC1623220sLI abstractC1623220sLI = this.LLJI;
        for (InterfaceC1635880sfi interfaceC1635880sfi : (ArrayList) abstractC1623220sLI.LLILZLL) {
            InterfaceC1623190sLF interfaceC1623190sLF = abstractC1623220sLI.LLJI;
            if (interfaceC1623190sLF != null) {
                interfaceC1623190sLF.LIZLLL(interfaceC1635880sfi);
            }
        }
    }

    private final boolean d5() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    private final boolean d6() {
        return this.LLIZLLLIL.LIZ;
    }

    private final void o8() {
        if (C2281551ESb.LIZIZ.LIZJ()) {
            this.LLILZ.St2().mk(new InterfaceC1623210sLH() { // from class: X.0sKz
                @Override // X.InterfaceC1623210sLH
                public final void onResult(String[] strArr) {
                }
            });
        } else {
            this.LLILZ.St2().mk(new InterfaceC1623210sLH() { // from class: X.0sKy
                @Override // X.InterfaceC1623210sLH
                public final void onResult(String[] strArr) {
                }
            });
        }
    }

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    public InterfaceC1624480sNK C0() {
        return (InterfaceC1624480sNK) this.LLJJ.getValue();
    }

    public final CameraComponentModel D5() {
        return this.LLILZ.pw0();
    }

    public final InterfaceC2254001DKc E5() {
        return this.LLILZLL.getMediaController();
    }

    @Override // X.InterfaceC1625000sOA
    public void Mg2() {
        this.LLJILJIL.LIZJ();
    }

    public final C1DHX O4() {
        return this.LLILZLL.getCameraController();
    }

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    public InterfaceC1623190sLF U() {
        return this.LLJI.LLJI;
    }

    @Override // X.InterfaceC1625000sOA
    public C11NZ<AbstractC1557360qd4> U6() {
        return this.LLJI.LLJILJILJ;
    }

    @Override // X.InterfaceC1625000sOA
    public C11NZ<Pair<Effect, C991780buq>> WJ0() {
        C11RK<Pair<Effect, C991780buq>> c11rk = this.LLL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C1629320sV8 Z4() {
        return this.LLIZLLLIL.LJFF;
    }

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    public SafeHandler b1() {
        return this.LLJI.LLJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sKr] */
    public void d8() {
        final int size = this.LLILZ.pw0().LIZIZ().size() - 1;
        final Effect effect = (Effect) C0().LJII().LJIJJLI().getValue();
        if (C1624570sNT.LJJIIZI(effect)) {
            getRecordControlApi().uI(false);
            final C013C c013c = new C013C();
            if (!((Boolean) C256370A2x.LIZ.getValue()).booleanValue()) {
                List<String> listP4 = P4(effect);
                if (listP4 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : listP4) {
                        String str2 = str;
                        if (str2 != null && str2.length() != 0) {
                            arrayList.add(str);
                        }
                    }
                    if (!arrayList.isEmpty() && size >= 0 && size < this.LLILZ.pw0().LIZIZ().size()) {
                        TimeSpeedModelExtension timeSpeedModelExtension = this.LLILZ.pw0().LIZIZ().get(size);
                        timeSpeedModelExtension.setBubbleText(new ArrayList(arrayList));
                        timeSpeedModelExtension.setARText(C1624570sNT.LJFF(effect) ? new ArrayList(arrayList) : null);
                        c013c.element = true;
                    }
                }
            }
            this.LLILZ.St2().mk(new C1623200sLG(new InterfaceC1623210sLH(this) { // from class: X.0sKr
                public final /* synthetic */ AbstractC1622910sKn<API> LIZ;

                @Override // X.InterfaceC1623210sLH
                public final void onResult(final String[] strArr) {
                    SafeHandler safeHandlerB1 = this.LIZ.b1();
                    final int i = size;
                    final AbstractC1622910sKn<API> abstractC1622910sKn = this.LIZ;
                    final Effect effect2 = effect;
                    final C013C c013c2 = c013c;
                    safeHandlerB1.post(new Runnable() { // from class: X.0sKs
                        public final void LIZ() {
                            int i2 = i;
                            if (i2 >= 0 && i2 < abstractC1622910sKn.LLILZ.pw0().LIZIZ().size()) {
                                TimeSpeedModelExtension timeSpeedModelExtension2 = abstractC1622910sKn.LLILZ.pw0().LIZIZ().get(i);
                                String[] strArr2 = strArr;
                                Effect effect3 = effect2;
                                C013C c013c3 = c013c2;
                                TimeSpeedModelExtension timeSpeedModelExtension3 = timeSpeedModelExtension2;
                                if (!(strArr2 == null || strArr2.length == 0)) {
                                    ArrayList arrayList2 = new ArrayList(C13LQ.LJJLL(strArr2));
                                    timeSpeedModelExtension3.setBubbleText(arrayList2);
                                    timeSpeedModelExtension3.setARText(C1624570sNT.LJFF(effect3) ? arrayList2 : null);
                                } else if (!c013c3.element) {
                                    timeSpeedModelExtension3.setBubbleText(null);
                                    timeSpeedModelExtension3.setARText(null);
                                }
                            }
                            abstractC1622910sKn.getRecordControlApi().uI(true);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("StickerCoreLogicComponent@3a44.setSegmentText$2$onResult$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("StickerCoreLogicComponent@3a44.setSegmentText$2$onResult$1");
                        }
                    });
                }

                {
                    this.LIZ = this;
                }
            }, getRecordControlApi(), b1()));
        }
    }

    @Override // X.InterfaceC1625000sOA
    public C11NZ<EnumC1159860gHw> dj() {
        return this.LLJI.LLJJ;
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLLFZ[0]);
    }

    public final InterfaceC1635390sev n5() {
        return (InterfaceC1635390sev) this.LLIZ.getValue(this, LLLFZ[1]);
    }

    @Override // X.InterfaceC1625000sOA
    public void qf() {
        this.LLJI.qf();
    }

    @Override // X.InterfaceC1625000sOA
    public void sv1() {
        this.LLILZ.tS1().LIZ(this, new AObjectS246S0100000_25(this, 19));
    }

    public final InterfaceC1645720sva t5() {
        return this.LLILZLL.getEffectController();
    }

    @Override // X.InterfaceC1625000sOA
    public C0LH1 vS0() {
        return (C0LH1) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    public InterfaceC1625410sOp w4() {
        return (InterfaceC1625410sOp) this.LLJJI.getValue();
    }

    private final void Z7() {
        Effect effect;
        GameDuetResource gameDuetResource = D5().gameDuetResource;
        if (gameDuetResource == null || (effect = gameDuetResource.gameSticker) == null || C1624200sMs.LJIIIIZZ(effect)) {
            return;
        }
        C1624010sMZ.LJII(this, gameDuetResource.gameSticker);
    }

    public final Effect C5() {
        return C0().LJJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[PHI: r7
      0x0041: PHI (r7v3 boolean) = (r7v0 boolean), (r7v4 boolean) binds: [B:69:0x010b, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f A[PHI: r7
      0x010f: PHI (r7v2 boolean) = (r7v0 boolean), (r7v3 boolean) binds: [B:69:0x010b, B:24:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1441200nbi N5() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1622910sKn.N5():X.0nbi");
    }

    @Override // X.InterfaceC1625000sOA
    public void e62() {
        t5().Un(null);
    }

    @Override // X.InterfaceC1625000sOA
    public void ez2() {
        InterfaceC1627350sRx stickerRepository = C0().getStickerRepository();
        InterfaceC1633140sbI interfaceC1633140sbILJFF = stickerRepository.LJFF();
        LiveData liveDataLJIIJ = interfaceC1633140sbILJFF.LJIIJ(null, true, true, C0().LJJLIIIJJIZ().LJFF);
        getLifecycleOwner();
        liveDataLJIIJ.observe(this, new AObserverS130S0300000_25(interfaceC1633140sbILJFF, this, stickerRepository, 0));
    }

    @Override // X.InterfaceC1625000sOA
    public void jg2() {
        t5().Tn(this.LLJJJ);
    }

    @Override // X.InterfaceC1625000sOA
    public FaceStickerBean jr() {
        return v5();
    }

    public final void m3() {
        C0().LJIL();
        if (Intrinsics.LJFF(getRecordControlApi().isRecording().LIZJ(), Boolean.FALSE)) {
            pp2(true, "auto_open");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0();
        C385670FAf<Boolean> c385670FAf = this.LLJIJIL;
        getLifecycleOwner();
        c385670FAf.LIZ(this, new AObjectS246S0100000_25(this, 20));
        X1(this, false, 1, null);
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            C0().LJJJI().observe(this, new AObserverS227S0100000_25(this, 5));
        }
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS604S0100000_25(this, 68));
        }
        LiveEvent<Unit> liveEventBr2 = this.LLILZ.Br2();
        getLifecycleOwner();
        liveEventBr2.LIZ(this, new AObjectS246S0100000_25(this, 25));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJ.LJ();
        o8();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        Mg2();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        InterfaceC1623040sL0 interfaceC1623040sL0;
        super.onResume();
        C1623050sL1 c1623050sL1 = this.LLJILJIL;
        c1623050sL1.getClass();
        if (C1623050sL1.LIZLLL() || (interfaceC1623040sL0 = c1623050sL1.LIZJ) == null || interfaceC1623040sL0.co1()) {
            return;
        }
        interfaceC1623040sL0.register();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        e4(true);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        e4(false);
    }

    public final void s7() {
        if (C1624570sNT.LJI(C0().LLILIL()) || !this.LLIZLLLIL.LJIIL.invoke().booleanValue()) {
            b1().post(new ARunnableS125S0100000_25(this, 7));
        }
    }

    public FaceStickerBean v5() {
        return C1441210nbj.LIZ(C5());
    }

    @Override // X.InterfaceC1625000sOA
    public AiMeStyleInfo zH2() {
        return F4();
    }

    public final InterfaceC2254081DKk H4() {
        return this.LLILZLL;
    }

    public final C385670FAf<Boolean> H5() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent Iq0() {
        return this.LLJLLIL;
    }

    public C560530Lyd<Boolean> J6() {
        return this.LLJLL;
    }

    public final AbstractC1623220sLI K4() {
        return this.LLJI;
    }

    public C560530Lyd<Boolean> K6() {
        return this.LLJJJJLIIL;
    }

    public C560530Lyd<Boolean> L6() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveData Lq0() {
        return this.LLJLLL;
    }

    public C560530Lyd<AbstractC1627380sS0> M5() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent Ma2() {
        return this.LLJZIJLIL;
    }

    public MessageCenter.Listener N6() {
        return this.LLJJJ;
    }

    public final InterfaceC1625220sOW P6() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ InterfaceC1638150sjN Qb0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C1624590sNV R5() {
        return this.LLJILJILJ;
    }

    public final C1623050sL1 S5() {
        return this.LLJILJIL;
    }

    public C560530Lyd<AbstractC1448380nnI> S6() {
        return this.LLJJJJJIL;
    }

    public final C1622920sKo T4() {
        return this.LLIZLLLIL;
    }

    public final C1628610sTz T6() {
        return this.LLJJIJI;
    }

    public MutableLiveData<Boolean> U5() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1625000sOA
    public boolean VS1() {
        return this.LLJJL;
    }

    public C560530Lyd<Boolean> W6() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1625000sOA
    public C1623150sLB Ye1() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent aD0() {
        return this.LLJJJJLIIL;
    }

    public C560530Lyd<Effect> d7() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent dN1() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent gH() {
        return this.LLJJJJ;
    }

    public final InterfaceC1650230t2r getCameraApi() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public final C11NJ k5() {
        return this.LLJ;
    }

    public C1623000sKw k7() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public MutableLiveData<Effect> m6() {
        return this.LLJLLL;
    }

    public C560530Lyd<Boolean> n7() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveData o60() {
        return this.LLJZ;
    }

    public C560530Lyd<Boolean> o7() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent pb2() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent qr1() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent rV1() {
        return this.LLJLILLLLZIIL;
    }

    public C560530Lyd<Unit> u6() {
        return this.LLJLLIL;
    }

    public final C1623130sL9 x5() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent xP0() {
        return this.LLJLL;
    }

    public final C19GS z4() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1625000sOA
    public /* bridge */ /* synthetic */ LiveEvent zI() {
        return this.LLJL;
    }

    private final void Q3(Effect effect) {
        if (effect != null) {
            C0().LJJLIIIIJ(new C1629340sVA(effect, true, null, 4), null);
        }
    }

    private final void q3(FrameLayout frameLayout) {
        InterfaceC1623070sL3 interfaceC1623070sL3 = (InterfaceC1623070sL3) getDiContainer().LJIIL(null, InterfaceC1623070sL3.class);
        if (interfaceC1623070sL3 != null) {
            InterfaceC1628620sU0 interfaceC1628620sU0LIZ = interfaceC1623070sL3.LIZ(this.LLILZLL.getViewFunction().getView(), this.LLILZ.fF2(), frameLayout);
            interfaceC1628620sU0LIZ.kg(this);
            sk(new C1622890sKl(interfaceC1628620sU0LIZ));
            getLifecycleOwner();
            this.LLJJIJI = new C1628610sTz(this, C0(), interfaceC1628620sU0LIZ, new AwS639S0100000_25(this, 10));
        }
    }

    @Override // X.InterfaceC1625000sOA
    public void Es2(boolean z) {
        List<String> tags;
        String strInvoke;
        Effect effectC5 = C5();
        String str = this.LLILZ.pw0().mMusicPath;
        if (effectC5 != null && effectC5.getTags() != null && !TextUtils.isEmpty(str) && (tags = effectC5.getTags()) != null && tags.contains("strong_beat")) {
            Function1<? super String, String> function1 = this.LLIZLLLIL.LIZJ;
            if (function1 == null || (strInvoke = function1.invoke(str)) == null) {
                strInvoke = "";
            }
            t5().Un(strInvoke);
            if (z) {
                InterfaceC1622080sJS interfaceC1622080sJSI2 = I2(AFwS266S0000000_25.get$arr$(76));
                if (!(interfaceC1622080sJSI2 instanceof C1622890sKl)) {
                    interfaceC1622080sJSI2 = null;
                }
                C1622890sKl c1622890sKl = (C1622890sKl) interfaceC1622080sJSI2;
                if (c1622890sKl != null) {
                    c1622890sKl.LL.s(effectC5);
                }
            }
        }
    }

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1622570sKF
    public InterfaceC1622080sJS I2(Function1<? super InterfaceC1622080sJS, Boolean> function1) {
        return this.LLJI.I2(function1);
    }

    public final void I7(boolean z) {
        this.LLJILJIL.LIZIZ(v3(z), true);
    }

    @Override // X.InterfaceC1625000sOA
    public boolean II0(C1627370sRz c1627370sRz) {
        if (d5() || c1627370sRz.LIZJ != EnumC1448980noG.MANUAL_SET) {
            return false;
        }
        Bundle bundle = c1627370sRz.LJ;
        if (bundle != null && bundle.getBoolean("share_from_green_screen_kit")) {
            return false;
        }
        C0().LJJLIIIJLJLI();
        Function0<Boolean> function0 = this.LLIZLLLIL.LIZIZ;
        if (function0 != null && function0.invoke().booleanValue()) {
            return false;
        }
        return C1624570sNT.LJIIIIZZ(c1627370sRz.LIZ);
    }

    public void O3(Effect effect) {
        Q3(effect);
    }

    @Override // X.InterfaceC1625000sOA
    public void QV(InterfaceC1623190sLF interfaceC1623190sLF) {
        rf(interfaceC1623190sLF);
        L7();
        MutableLiveData mutableLiveDataAG = interfaceC1623190sLF.AG();
        getLifecycleOwner();
        mutableLiveDataAG.observe(this, new AObjectS246S0100000_25(this, 18));
        this.LLJLLIL.LJIIJ(null);
    }

    @Override // X.InterfaceC1625000sOA
    public void RK2(boolean z) {
        this.LLJJJJ.LJIIJ(Boolean.valueOf(z));
    }

    public void W1(boolean z) {
        o2(z);
    }

    public final void W7(C1623130sL9 c1623130sL9) {
        this.LLJILLL = c1623130sL9;
    }

    public void Z1(InterfaceC1624480sNK interfaceC1624480sNK) {
        C094000Xa c094000XaLIZJ = interfaceC1624480sNK.getStickerRepository().LIZ().LIZJ();
        if (this.LLILZ.pw0().isRetakeMode) {
            c094000XaLIZJ.LIZ(C1622100sJU.LIZ);
        }
        c094000XaLIZJ.LIZ(new AbstractC23051091l() { // from class: X.0sLh
            @Override // X.AbstractC23051091l
            public final boolean LIZ(Effect effect, String str) {
                if (!C1623480sLi.LIZ() && C1449600npG.LJIIIIZZ(effect)) {
                    return true;
                }
                return false;
            }
        });
        G2(c094000XaLIZJ);
        c094000XaLIZJ.LIZIZ();
    }

    @Override // X.InterfaceC1625000sOA
    public void Zw2(boolean z) {
        this.LLJLL.LJIIIZ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1625000sOA
    public void ao0(boolean z) {
        this.LLJJL = z;
    }

    @Override // X.InterfaceC1625000sOA
    public void c21(Effect effect) {
        ez2();
        C0().getStickerRepository().LIZ().LIZJ().LIZIZ();
        this.LLJLLL.setValue(effect);
    }

    public void e4(boolean z) {
        if (z) {
            t5().to(this.LLJJJ);
        } else {
            t5().Tn(this.LLJJJ);
        }
    }

    public final void h8(C1628610sTz c1628610sTz) {
        this.LLJJIJI = c1628610sTz;
    }

    public final void i3(InterfaceC1159800gHq interfaceC1159800gHq) {
        ((ArrayList) this.LLJI.LLILZIL).add(interfaceC1159800gHq);
    }

    @Override // X.InterfaceC1625000sOA
    public void kd1(boolean z) {
        ao0(z);
    }

    @Override // X.InterfaceC1625000sOA
    public void nS1(boolean z) {
        this.LLJJJJLIIL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1625000sOA
    public void ng2(Effect effect) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            this.LLJLILLLLZIIL.LJIIJ(effect);
        } else {
            this.LLJLILLLLZIIL.LJIIIZ(effect);
        }
    }

    public void o2(boolean z) {
        if (Z4().LIZIZ) {
            C0().getStickerRepository().LJII().LIZIZ(new C1623630sLx(new C1629070sUj(C452501pT.LIZIZ(new AwS569S0100000_25((AbstractC1622910sKn) this, 84)), Z4().LJIILLIIL, C452501pT.LIZIZ(new AwS569S0100000_25((AbstractC1622910sKn) this, 85)), Ye1()), C786410Ut5.O3(this.LLILLJJLI), z));
            C1623130sL9 c1623130sL9Y7 = y7();
            if (c1623130sL9Y7 != null) {
                sk(c1623130sL9Y7);
            }
        }
    }

    @Override // X.InterfaceC1625000sOA
    public void rf(InterfaceC1623190sLF interfaceC1623190sLF) {
        this.LLJI.rf(interfaceC1623190sLF);
        interfaceC1623190sLF.Bo(new InterfaceC1159800gHq(this) { // from class: X.0sKu
            public final /* synthetic */ AbstractC1622910sKn<API> LL;

            @Override // X.InterfaceC1159800gHq
            public final void LJI() {
            }

            {
                this.LL = this;
            }

            @Override // X.InterfaceC1159800gHq
            public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
                if (enumC1155090gAF == EnumC1155090gAF.BEFORE_ANIMATE) {
                    this.LL.LLJLIL.LJIIJ(Boolean.TRUE);
                }
            }

            @Override // X.InterfaceC1159800gHq
            public final void LJIIIZ(View view) {
                this.LL.LLJL.LJIIJ(Boolean.TRUE);
            }

            @Override // X.InterfaceC1159800gHq
            public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
                if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE) {
                    this.LL.LLJLIL.LJIIJ(Boolean.FALSE);
                }
            }
        });
    }

    @Override // X.InterfaceC1625000sOA
    public void sb(InterfaceC1622080sJS interfaceC1622080sJS) {
        AbstractC1623220sLI abstractC1623220sLI = this.LLJI;
        if (!abstractC1623220sLI.LLILZ.remove(interfaceC1622080sJS)) {
            abstractC1623220sLI.LIZJ().LL.remove(interfaceC1622080sJS);
        }
    }

    @Override // X.InterfaceC1625000sOA
    public void sk(InterfaceC1622080sJS interfaceC1622080sJS) {
        this.LLJI.LIZ(interfaceC1622080sJS, false);
    }

    @Override // X.InterfaceC1625000sOA
    public void t8(Function1<? super InterfaceC1622080sJS, Boolean> function1) {
        AbstractC1623220sLI abstractC1623220sLI = this.LLJI;
        Iterator<InterfaceC1622080sJS> it2 = abstractC1623220sLI.LLILZ.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                it2.remove();
            }
        }
        Iterator<InterfaceC1622080sJS> it3 = abstractC1623220sLI.LIZJ().LL.iterator();
        while (it3.hasNext()) {
            if (function1.invoke(it3.next()).booleanValue()) {
                it3.remove();
            }
        }
    }

    public InterfaceC1623040sL0 v3(boolean z) {
        C19GS c19gs = this.LLILLJJLI;
        getLifecycleOwner();
        Handler handler = this.LLJILJIL.LIZ;
        C1622920sKo c1622920sKo = this.LLIZLLLIL;
        return new DefaultSenorPresenter(c19gs, this, z, this.LLJILJILJ, false, handler, c1622920sKo.LJII, c1622920sKo.LJIIIIZZ, 16);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0sKp] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0sNV] */
    public AbstractC1622910sKn(C1DRG c1drg, Function1<? super C1622920sKo, Unit> function1) {
        this.LL = c1drg;
        InterfaceC1625220sOW interfaceC1625220sOW = (InterfaceC1625220sOW) getDiContainer().LJIIL(null, InterfaceC1625220sOW.class);
        this.LLILLL = interfaceC1625220sOW == null ? C1449080noQ.LIZ : interfaceC1625220sOW;
        InterfaceC1650230t2r interfaceC1650230t2r = (InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null);
        this.LLILZ = interfaceC1650230t2r;
        this.LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLILZLL = interfaceC1650230t2r.St2();
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1635390sev.class, null);
        C1622920sKo c1622920sKo = new C1622920sKo(null);
        this.LLIZLLLIL = c1622920sKo;
        if (function1 != null) {
            function1.invoke(c1622920sKo);
        }
        this.LLJ = new C11NJ();
        getLifecycleOwner();
        final InterfaceC1463990oCT interfaceC1463990oCT = c1622920sKo.LIZLLL;
        this.LLJI = new AbstractC1623220sLI(this, this, interfaceC1463990oCT) { // from class: X.0sKq
            public final /* synthetic */ AbstractC1622910sKn<API> LLJJI;

            @Override // X.InterfaceC1623390sLZ
            public final InterfaceC1624480sNK C0() {
                return this.LLJJI.C0();
            }

            @Override // X.AbstractC1623220sLI
            public final C1628610sTz LIZLLL() {
                return this.LLJJI.LLJJIJI;
            }

            @Override // X.AbstractC1623220sLI
            public final C0LH1 vS0() {
                return this.LLJJI.vS0();
            }

            @Override // X.InterfaceC1623390sLZ
            public final InterfaceC1625410sOp w4() {
                return this.LLJJI.w4();
            }

            {
                this.LLJJI = this;
            }
        };
        this.LLJIJIL = interfaceC1650230t2r.yj1();
        this.LLJILJIL = new C1623050sL1(null, new AwS569S0100000_25((AbstractC1622910sKn) this, 82));
        final C1DHX c1dhxO4 = O4();
        this.LLJILJILJ = new InterfaceC2218931Bsx(c1dhxO4) { // from class: X.0sNV
            public final C1DHX LIZ;

            {
                this.LIZ = c1dhxO4;
            }

            @Override // X.InterfaceC2218931Bsx
            public final void LIZ(float f) {
                this.LIZ.O2(f);
            }

            @Override // X.InterfaceC2218931Bsx
            public final void LJ(float[] fArr, double d) {
                this.LIZ.P3(fArr, d);
            }
        };
        this.LLJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS569S0100000_25((AbstractC1622910sKn) this, 83));
        this.LLJJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25((AbstractC1622910sKn) this, 87));
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25((AbstractC1622910sKn) this, 86));
        this.LLJJIJIIJIL = new InterfaceC1622080sJS(this) { // from class: X.0sKp
            public final /* synthetic */ AbstractC1622910sKn<API> LL;

            @Override // X.InterfaceC1622080sJS
            public final int getPriority() {
                return C1623350sLV.LIZ();
            }

            {
                this.LL = this;
            }

            @Override // X.InterfaceC1622080sJS
            public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
                this.LL.LLJZIJLIL.LJIIJ(abstractC1627380sS0);
                C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
                if ((abstractC1627380sS0 instanceof C1627370sRz) && this.LL.II0((C1627370sRz) abstractC1627380sS0)) {
                    this.LL.m3();
                }
                this.LL.Es2(false);
                return c1623370sLXLIZ;
            }
        };
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(124));
        this.LLJJJ = new MessageCenter.Listener(this) { // from class: X.0sKv
            public final /* synthetic */ AbstractC1622910sKn<API> LL;

            {
                this.LL = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public final void onMessageReceived(int i, int i2, int i3, String str) {
                this.LL.H3(i, i2, i3, str);
            }
        };
        this.LLJJJIL = new C560530Lyd<>();
        this.LLJJJJ = new C560530Lyd<>();
        this.LLJJJJJIL = new C560530Lyd<>();
        this.LLJJJJLIIL = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = new C1623000sKw();
        this.LLJL = new C560530Lyd<>();
        this.LLJLIL = new C560530Lyd<>();
        this.LLJLILLLLZIIL = new C560530Lyd<>();
        this.LLJLL = new C560530Lyd<>();
        this.LLJLLIL = new C560530Lyd<>();
        this.LLJLLL = new MutableLiveData<>();
        this.LLJZ = new MutableLiveData<>();
        this.LLJZIJLIL = new C560530Lyd<>();
        this.LLL = new C11RK<>();
        this.LLLF = new C1623150sLB();
    }

    public final void H2(InterfaceC1622080sJS interfaceC1622080sJS, boolean z) {
        this.LLJI.LIZ(interfaceC1622080sJS, z);
    }

    public void T2(FrameLayout frameLayout, InterfaceC1622330sJr interfaceC1622330sJr) {
        sk(this.LLJJIJIIJIL);
        q3(frameLayout);
    }

    @Override // X.InterfaceC1625000sOA
    public void kx0(List<? extends Effect> list, boolean z) {
        if (this.LLLFF) {
            return;
        }
        Effect effect = (Effect) C13LP.LJJJLL(list);
        if (effect != null) {
            this.LLJJLIIIJLLLLLLLZ.LIZIZ.LJIIJ(effect);
            if (!E3()) {
                Q3(effect);
            }
        }
        if (d6() && C0().LLILIL() == null) {
            this.LLJJLIIIJLLLLLLLZ.LIZ.LJIIJ(C1441210nbj.LIZJ(list));
        }
        this.LLLFF = z;
    }

    @Override // X.InterfaceC1625000sOA
    public void pp2(boolean z, String str) {
        this.LLILLL.LJIIIZ().start();
        this.LLJJJIL.LJIIJ(Boolean.valueOf(z));
        if (z) {
            boolean zLJFF = Intrinsics.LJFF(getRecordControlApi().ec().LIZJ(), Boolean.TRUE);
            if (str.length() == 0) {
                this.LLILLL.LIZIZ("click_entrance", zLJFF);
                return;
            } else {
                this.LLILLL.LIZIZ(str, zLJFF);
                return;
            }
        }
        C0().LJJIFFI("");
        C0().LJJJJJ("");
    }

    @Override // X.InterfaceC1625000sOA
    public void tb1(InterfaceC1622330sJr interfaceC1622330sJr, FrameLayout frameLayout) {
        T2(frameLayout, interfaceC1622330sJr);
        L7();
        Z1(C0());
        c3(C0(), w4());
        qf();
        Z7();
        this.LLJLLIL.LJIIJ(null);
    }

    public void W2(FrameLayout frameLayout, InterfaceC1622330sJr interfaceC1622330sJr, C1635820sfc c1635820sfc) {
        sk(this.LLJJIJIIJIL);
        q3(frameLayout);
    }

    @Override // X.InterfaceC1625000sOA
    public void aR0(InterfaceC1622330sJr interfaceC1622330sJr, FrameLayout frameLayout, C1635820sfc c1635820sfc) {
        W2(frameLayout, interfaceC1622330sJr, c1635820sfc);
        Z1(C0());
        c3(C0(), w4());
        qf();
        Z7();
    }

    public void o4(final InterfaceC1627350sRx interfaceC1627350sRx, final InterfaceC1625880sPa interfaceC1625880sPa, final String str) {
        MutableLiveData mutableLiveDataLJIJJLI = interfaceC1625880sPa.LJIJJLI(str, null, true, false);
        getLifecycleOwner();
        mutableLiveDataLJIJJLI.observe(this, new Observer<C1641640sp0<CategoryEffectModel>>() { // from class: X.0sJW
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(C1641640sp0<CategoryEffectModel> c1641640sp0) {
                CategoryEffectModel categoryEffectModel = c1641640sp0.LIZ;
                if (categoryEffectModel != null) {
                    InterfaceC1625880sPa interfaceC1625880sPa2 = interfaceC1625880sPa;
                    String str2 = str;
                    AbstractC1622910sKn<API> abstractC1622910sKn = this;
                    InterfaceC1627350sRx interfaceC1627350sRx2 = interfaceC1627350sRx;
                    interfaceC1625880sPa2.LJIJJLI(str2, null, true, false).removeObserver(this);
                    if (abstractC1622910sKn.LLIZLLLIL.LJIIJ) {
                        abstractC1622910sKn.kx0(categoryEffectModel.getEffects(), false);
                    }
                    abstractC1622910sKn.u7(categoryEffectModel.getEffects());
                    if (!C2281551ESb.LIZIZ.LJIILL() && abstractC1622910sKn.U() != null) {
                        ViewModelProvider viewModelProviderOf = (ViewModelProvider) abstractC1622910sKn.getDiContainer().LJIIL(null, ViewModelProvider.class);
                        if (viewModelProviderOf == null) {
                            viewModelProviderOf = ViewModelProviders.of(abstractC1622910sKn.LLILLJJLI);
                        }
                        C15O7.LIZJ(new ACallableS253S0200000_25(categoryEffectModel, ((StickerStatesStoreViewModel) viewModelProviderOf.get(StickerStatesStoreViewModel.class)).vQ2(interfaceC1627350sRx2.LJI(), categoryEffectModel.getCategory_key(), abstractC1622910sKn.n5()), 1));
                    }
                }
            }
        });
    }

    public static /* synthetic */ void X1(AbstractC1622910sKn abstractC1622910sKn, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            abstractC1622910sKn.W1(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomCategories");
    }

    public final void H3(int i, int i2, int i3, String str) {
        vq(i, i2, i3, str);
        this.LLL.onNext(new Pair<>(C5(), new C991780buq(i, i2, i3, str)));
    }

    @Override // X.InterfaceC1625000sOA
    public void vq(int i, int i2, int i3, String str) {
        Iterator<InterfaceC1623110sL7> it2 = this.LLJI.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onMessageReceived(i, i2, i3, str);
        }
    }
}
