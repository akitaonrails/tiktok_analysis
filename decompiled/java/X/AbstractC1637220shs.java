package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import Y.AfS194S0100000_25;
import com.bytedance.als.LiveEvent;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0shs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1637220shs extends AbstractC1643610ssB<RecordStickerPanelViewModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ;
    public final InterfaceC1650230t2r LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1637230sht LLJILJILJ;
    public C11JF LLJILLL;
    public final C01GW LLJJ;
    public final AwS569S0100000_25 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1637220shs.class, "stickerApi", "getStickerApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1637220shs.class, "stickerViewConfigure", "getStickerViewConfigure()Lcom/ss/android/ugc/aweme/sticker/panel/StickerViewConfigure;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public boolean w2() {
        return false;
    }

    public final InterfaceC1625000sOA G2() {
        return (InterfaceC1625000sOA) this.LLJIJIL.getValue(this, LLJJIII[0]);
    }

    public final InterfaceC1637240shu H2() {
        return (InterfaceC1637240shu) this.LLJJ.getValue();
    }

    public void T2() {
        C11NZ<Pair<Effect, C991780buq>> c11nzWJ0;
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        if (this.LLJILJILJ.LJII && this.LLIZLLLIL.findSceneByTag("RecordStickerPanelScene") == null) {
            this.LLIZLLLIL.add(this.LLJ, H2().getScene(), "RecordStickerPanelScene");
        }
        InterfaceC420801kM interfaceC420801kMLJJLJLI = null;
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) ((C0ETY) this.LLIZ.LJII(C0ETY.class, null)).MY1(InterfaceC1625000sOA.class);
        if (!w2()) {
            H2().LLIIII(interfaceC1625000sOA);
            return;
        }
        int iIntValue = ((Number) C0BII.LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            InterfaceC1625000sOA interfaceC1625000sOAG2 = G2();
            if (interfaceC1625000sOAG2 != null && (c11nzWJ0 = interfaceC1625000sOAG2.WJ0()) != null) {
                interfaceC420801kMLJJLJLI = c11nzWJ0.LJJIL(new C1698300uIO(this, 6)).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 214));
            }
            this.LLJILLL = (C11JF) interfaceC420801kMLJJLJLI;
        } else if (iIntValue != 2) {
            InterfaceC1625000sOA interfaceC1625000sOAG22 = G2();
            if (interfaceC1625000sOAG22 != null && (liveEventMa2 = interfaceC1625000sOAG22.Ma2()) != null) {
                liveEventMa2.LIZ(this, new AObjectS246S0100000_25(this, 728));
            }
        } else {
            this.LLJI.A31().LIZ(this, new AObjectS246S0100000_25(this, 727));
        }
        C1635820sfc c1635820sfc = (C1635820sfc) this.LLJILJIL.getValue(this, LLJJIII[1]);
        if (c1635820sfc != null) {
            H2().LLIFFJFJJ(interfaceC1625000sOA, c1635820sfc);
        }
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        if (!this.LLJILJILJ.LJII) {
            H2().hide();
        } else if (this.LLIZLLLIL.findSceneByTag("RecordStickerPanelScene") != null) {
            H2().hide();
        }
    }

    @Override // X.AbstractC1643600ssA
    public void o2() {
        if (this.LLJILJILJ.LJII && this.LLIZLLLIL.findSceneByTag("RecordStickerPanelScene") == null) {
            this.LLIZLLLIL.add(this.LLJ, H2().getScene(), "RecordStickerPanelScene");
        }
        if (!w2()) {
            H2().LLIIII(G2());
        }
        InterfaceC1625000sOA interfaceC1625000sOAG2 = G2();
        if (interfaceC1625000sOAG2 == null || interfaceC1625000sOAG2.U() == null) {
            if (w2()) {
                H2().LJJIJIIJI(G2());
            } else {
                H2().LJJZZI(G2());
            }
        }
        H2().show();
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!this.LLJILJILJ.LJII) {
            this.LLIZLLLIL.add(this.LLJ, H2().getScene(), "RecordStickerPanelScene");
        }
        C1637230sht c1637230sht = this.LLJILJILJ;
        if (c1637230sht.LJI) {
            this.LLJI.A31().LIZ(this, new AObjectS246S0100000_25(this, 27));
        } else if (c1637230sht.LJFF) {
            if (c1637230sht.LJ) {
                this.LLJI.A31().LIZ(this, new AObjectS246S0100000_25(this, 28));
            } else {
                C12WG.LIZLLL(this.LLIZLLLIL, new ARunnableS125S0100000_25(this, 8), 100L);
            }
        }
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<RecordStickerPanelViewModel> W1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public AbstractC1637220shs(C1DRG c1drg, C19A3 c19a3, int i, Function1<? super C1637230sht, Unit> function1) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJ = i;
        this.LLJI = (InterfaceC1650230t2r) c1drg.LJII(InterfaceC1650230t2r.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1625000sOA.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, C1635820sfc.class, null);
        C1637110shh c1637110shh = (C1637110shh) this;
        C1637230sht c1637230sht = new C1637230sht(c1637110shh);
        this.LLJILJILJ = c1637230sht;
        function1.invoke(c1637230sht);
        this.LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(c1637110shh, 89));
        this.LLJJI = new AwS569S0100000_25(c1637110shh, 90);
    }
}
