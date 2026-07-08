package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS569S0100000_25;
import pyl.q;

/* JADX INFO: renamed from: X.0szM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648060szM extends AbstractC2255721DQs<InterfaceC1646960sxa> implements InterfaceC1646960sxa, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1646960sxa LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
    public final InterfaceC332260D0u<q> LLILZ = C1BNE.LIZ(w2());
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), lnn.q.class, null);
    public final InterfaceC346201Wa<Effect> LLILZLL = getStickerApiComponent().C0().LJII().LJJ();
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 728));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648060szM.class, "commonCameraApiComponent", "getCommonCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648060szM.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJ = 8;
    }

    private final C1648080szO G2() {
        return (C1648080szO) this.LLIZ.getValue();
    }

    private final lnn.q getStickerApiComponent() {
        return (lnn.q) this.LLILZIL.getValue(this, LLIZLLLIL[1]);
    }

    public final InterfaceC1650190t2n o2() {
        return (InterfaceC1650190t2n) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final q w2() {
        boolean zLe0 = o2().le0();
        if (o2().Ue()) {
            q qVarLIZ = q.LIZ();
            qVarLIZ.LIZJ = Boolean.valueOf(zLe0);
            return qVarLIZ;
        }
        q qVarLIZIZ = q.LIZIZ();
        qVarLIZIZ.LIZJ = Boolean.valueOf(zLe0);
        return qVarLIZIZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1648080szO c1648080szOG2 = G2();
        C09IC.LJJI(c1648080szOG2.LIZ, new C861640Xr8(new C862290XsB(c1648080szOG2, null), new C1698270uIL(c1648080szOG2.LIZIZ, 14)));
        C09IC.LJJI(c1648080szOG2.LIZ, new C861640Xr8(new C862300XsC(c1648080szOG2, null), new C1698260uIK(c1648080szOG2.LIZLLL, c1648080szOG2, 10)));
        o2().p92().LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 682));
    }

    public InterfaceC1646960sxa Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1648060szM(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final q W1(q qVar) {
        if (qVar.LIZJ.booleanValue()) {
            return q.LIZ();
        }
        return qVar;
    }

    public final void X1(q qVar) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1648070szN(qVar, this, null), 2);
    }
}
