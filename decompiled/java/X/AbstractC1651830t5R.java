package X;

import X.InterfaceC1651940t5c;
import Y.AObjectS246S0100000_25;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0t5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1651830t5R<T extends InterfaceC1651940t5c> extends AbstractC2255721DQs<T> implements InterfaceC379610EuV, InterfaceC1651940t5c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1651800t5O LLILZ;
    public final List<C1650980t44> LLILZIL;
    public final boolean LLILZLL;
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), ln3.a.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
    public final C560530Lyd<C1662100tM0> LLJJ = new C560530Lyd<>();
    public final C560530Lyd<Pair<EnumC1651790t5N, Boolean>> LLJJI = new C560530Lyd<>();
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(233));
    public final C560530Lyd<Pair<Boolean, Boolean>> LLJJIJI = new C560530Lyd<>();
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, (AbstractC1651830t5R<InterfaceC1651940t5c>) 449));
    public final HashMap<Integer, String> LLJJIJIL = new HashMap<>();
    public final LiveData<Boolean> LLJJJ = new MutableLiveData();
    public final C560530Lyd<Unit> LLJJJIL = new C560530Lyd<>();

    @Override // X.InterfaceC856260XiS
    public void X31(boolean z) {
    }

    @Override // X.InterfaceC856260XiS
    public int getPanelType() {
        return -1;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1651830t5R.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1651830t5R.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AbstractC1651830t5R.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AbstractC1651830t5R.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AbstractC1651830t5R.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(AbstractC1651830t5R.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(AbstractC1651830t5R.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(AbstractC1651830t5R.class, "permissionUIApiComponent", "getPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJJJJJIL = 8;
    }

    private final C1645380sv2 G2() {
        return (C1645380sv2) this.LLJILJILJ.getValue(this, LLJJJJ[6]);
    }

    private final C1657710tEv H2() {
        return (C1657710tEv) this.LLJJIJIIJIL.getValue();
    }

    private final ln3.a Z1() {
        return (ln3.a) this.LLJIJIL.getValue(this, LLJJJJ[4]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJ.getValue(this, LLJJJJ[2]);
    }

    private final boolean m3() {
        Iterator<C1650980t44> it2 = this.LLILZ.getItems().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), this.LLILZ.LIZLLL())) {
                return false;
            }
        }
        return true;
    }

    public final InterfaceC1652190t61 T2() {
        return (InterfaceC1652190t61) this.LLJILLL.getValue(this, LLJJJJ[7]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLIZLLLIL.getValue(this, LLJJJJ[1]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJI.getValue(this, LLJJJJ[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJJJ[0]);
    }

    public final C560530Lyd<Boolean> i3() {
        return (C560530Lyd) this.LLJJIII.getValue();
    }

    private final InterfaceC1650620t3U w2() {
        return getRecordAdapterApi().eX1().LIZJ();
    }

    public final InterfaceC1651760t5K c3() {
        return H2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LL.add(this.LLILLL, c3().LJI(), "ToolbarScene");
        this.LLILZ.LJIIIIZZ(this.LLILZIL, true);
        registerObservers();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (C1651120t4I.LIZ() && C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") && !m3()) {
            InterfaceC1651800t5O interfaceC1651800t5O = this.LLILZ;
            C1650980t44 c1650980t44LIZLLL = interfaceC1651800t5O.LIZLLL();
            if (c1650980t44LIZLLL != null) {
                interfaceC1651800t5O.LJFF(c1650980t44LIZLLL, true);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public void registerObservers() {
        LiveEvent<AbstractC1652010t5j> liveEventXR0;
        LiveEvent<C1648160szW> liveEventVC1;
        LiveEvent<pyl.q> liveEventP92;
        LiveEvent<Integer> liveEventON;
        C385670FAf<Boolean> c385670FAfUn2;
        C385670FAf<Boolean> c385670FAfL00;
        getPlanCUIApiComponent().sK0().LIZ(this, new AObjectS246S0100000_25(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        if (C1622090sJT.LIZ(G2())) {
            whenReady(this, ln3.a.class, new AwS604S0100000_25(this, 329));
        } else {
            ln3.a aVarZ1 = Z1();
            if (aVarZ1 != null && (liveEventXR0 = aVarZ1.XR0()) != null) {
                liveEventXR0.LIZ(this, new AObjectS246S0100000_25(this, 301));
            }
        }
        InterfaceC1652190t61 interfaceC1652190t61T2 = T2();
        if (interfaceC1652190t61T2 != null && (c385670FAfL00 = interfaceC1652190t61T2.L00()) != null) {
            c385670FAfL00.LIZ(this, new AObjectS246S0100000_25(this, 302));
        }
        InterfaceC1652190t61 interfaceC1652190t61T22 = T2();
        if (interfaceC1652190t61T22 != null && (c385670FAfUn2 = interfaceC1652190t61T22.un2()) != null) {
            c385670FAfUn2.LIZ(this, new AObjectS246S0100000_25(this, 303));
        }
        getRecordAdapterApi().eX1().LIZ(this, new AObjectS246S0100000_25(this, 304));
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent(this);
        if (cameraApiComponent != null && (liveEventON = cameraApiComponent.oN()) != null) {
            liveEventON.LIZ(this, new AObjectS246S0100000_25(this, 305));
        }
        InterfaceC1650230t2r cameraApiComponent2 = getCameraApiComponent(this);
        if (cameraApiComponent2 != null && (liveEventP92 = cameraApiComponent2.p92()) != null) {
            liveEventP92.LIZ(this, new AObjectS246S0100000_25(this, 306));
        }
        InterfaceC1650230t2r cameraApiComponent3 = getCameraApiComponent(this);
        if (cameraApiComponent3 == null || (liveEventVC1 = cameraApiComponent3.vC1()) == null) {
            return;
        }
        liveEventVC1.LIZ(this, new AObjectS246S0100000_25(this, 307));
    }

    @Override // X.InterfaceC1651940t5c
    public /* bridge */ /* synthetic */ LiveEvent LLLLLZL() {
        return this.LLJJJIL;
    }

    public EnumC1651870t5V W2() {
        return EnumC1651870t5V.RECORD_PHOTO;
    }

    public final InterfaceC1651800t5O XI0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C560530Lyd<Unit> o2() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC856260XiS
    public LiveData<Boolean> p02() {
        return this.LLJJJ;
    }

    public static final InterfaceC1650230t2r getCameraApiComponent(AbstractC1651830t5R abstractC1651830t5R) {
        return (InterfaceC1650230t2r) abstractC1651830t5R.LLJILJIL.getValue(abstractC1651830t5R, LLJJJJ[5]);
    }

    @Override // X.InterfaceC1651940t5c
    public void LLLLZLL(boolean z) {
        InterfaceC1628590sTx interfaceC1628590sTxLIZJ;
        C385670FAf<Boolean> c385670FAfGx;
        if (z && ((interfaceC1628590sTxLIZJ = getRecordAdapterApi().NL1().LIZJ()) == null || (c385670FAfGx = interfaceC1628590sTxLIZJ.Gx()) == null || !Intrinsics.LJFF(c385670FAfGx.LIZJ(), Boolean.TRUE))) {
            this.LL.show(c3().LJI());
            C560530Lyd<Pair<Boolean, Boolean>> c560530Lyd = this.LLJJIJI;
            Boolean bool = Boolean.FALSE;
            c560530Lyd.LJIIJ(new Pair<>(bool, bool));
            return;
        }
        this.LL.hide(c3().LJI());
    }

    @Override // X.InterfaceC1651940t5c
    public void Nh(C1662100tM0 c1662100tM0) {
        this.LLJJ.LJIIJ(c1662100tM0);
    }

    public final String X1(int i) {
        HashMap<Integer, String> map = this.LLJJIJIL;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }

    @Override // X.InterfaceC1651940t5c
    public void m2(C1650980t44 c1650980t44) {
        this.LLILZ.LIZ(c1650980t44, true);
    }

    @Override // X.InterfaceC1651940t5c
    public View rY0(InterfaceC1651320t4c<?> interfaceC1651320t4c) {
        return c3().wv(interfaceC1651320t4c);
    }

    @Override // X.InterfaceC1651940t5c
    public void DX0(EnumC1651790t5N enumC1651790t5N, boolean z) {
        this.LLJJI.LJIIJ(new Pair<>(enumC1651790t5N, Boolean.valueOf(z)));
    }

    public AbstractC1651830t5R(C19A3 c19a3, C1DRG c1drg, int i, InterfaceC1651800t5O interfaceC1651800t5O, List<C1650980t44> list, boolean z) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = interfaceC1651800t5O;
        this.LLILZIL = list;
        this.LLILZLL = z;
    }
}
