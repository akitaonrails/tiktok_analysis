package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429340nIa extends AbstractC2255721DQs<InterfaceC1452130ntL> implements InterfaceC1452130ntL, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453020num.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 540));
    public final h0<Boolean> LLJ = new h0<>(null);
    public final C560530Lyd<Pair<Float, Long>> LLJI = new C560530Lyd<>();
    public final C560530Lyd<C443120HZe<Float, Float, Float>> LLJIJIL = new C560530Lyd<>();
    public boolean LLJILJIL = true;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(208));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1429340nIa.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1429340nIa.class, "storyEditFilterApi", "getStoryEditFilterApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1429340nIa.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1429340nIa.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJ = 8;
    }

    public InterfaceC1452130ntL W1() {
        return this;
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLILZLL.getValue(this, LLJILLL[2]);
    }

    private final InterfaceC1453430nvR Z1() {
        return (InterfaceC1453430nvR) this.LLILZ.getValue(this, LLJILLL[0]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILLL[3]);
    }

    private final C1461370o8F o2() {
        return (C1461370o8F) this.LLIZLLLIL.getValue();
    }

    private final InterfaceC1453020num w2() {
        return (InterfaceC1453020num) this.LLILZIL.getValue(this, LLJILLL[1]);
    }

    @Override // X.InterfaceC1452130ntL
    public void JI0() {
        InterfaceC1453430nvR interfaceC1453430nvRZ1;
        InterfaceC1453020num interfaceC1453020numW2;
        if (!this.LLILLJJLI.isAdded(o2())) {
            this.LLILLJJLI.add(this.LLILLL, o2(), "EditGestureScene");
        }
        if (C1428520nHG.LJLIL(getEditModel())) {
            if (!C1428560nHK.LIZ() || (interfaceC1453020numW2 = w2()) == null) {
                return;
            }
            interfaceC1453020numW2.Fv(true);
            return;
        }
        if (C1428470nHB.LLIIIJ(getEditModel()) || C1428500nHE.LIZ() || C1429350nIb.LIZ) {
            return;
        }
        VideoPublishEditModel editModel = getEditModel();
        C1414930mvL.LIZ.getClass();
        if ((C1414930mvL.LJII(editModel, true) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_block_horizontal_sliding_gesture", true, false)) || getEditModel().isEnterFromLinkShare() || (interfaceC1453430nvRZ1 = Z1()) == null) {
            return;
        }
        interfaceC1453430nvRZ1.Fv(true);
    }

    @Override // X.InterfaceC1452130ntL
    public MutableLiveData<FilterBean> WO1() {
        return (MutableLiveData) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC1452130ntL
    public void qB1() {
        if (this.LLILLJJLI.isAdded(o2())) {
            this.LLILLJJLI.hide(o2());
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        if (interfaceC1455850nzLX1 != null) {
            interfaceC1455850nzLX1.Ty(this);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        if (interfaceC1455850nzLX1 != null) {
            interfaceC1455850nzLX1.Ty(null);
        }
    }

    public final int G2() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1452130ntL
    public LiveEvent<C443120HZe<Float, Float, Float>> gc0() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1452130ntL
    public LiveEvent<Pair<Float, Long>> lF0() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1452130ntL
    public C385670FAf<Boolean> tt1() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1452130ntL
    public void Nd(boolean z) {
        this.LLJ.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1452130ntL
    public void aB1(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC1452130ntL
    public void Vy(float f, long j) {
        if (!this.LLJILJIL) {
            return;
        }
        this.LLJI.LJIIJ(new Pair<>(Float.valueOf(f), Long.valueOf(j)));
    }

    public C1429340nIa(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC1452130ntL
    public void ih0(float f, float f2, float f3) {
        if (!this.LLJILJIL) {
            return;
        }
        this.LLJIJIL.LJIIJ(new C443120HZe<>(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }
}
