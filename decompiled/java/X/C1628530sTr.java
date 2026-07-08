package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628530sTr extends AbstractC2255721DQs<C098Y> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final int LLILLL = R.id.dmg;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 408));
    public final C1664750tQH LLILZIL;
    public final C1627520sSE LLILZLL;
    public final InterfaceC1625470sOv LLIZ;
    public final InterfaceC346201Wa<Effect> LLIZLLLIL;
    public final C098Y LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628530sTr.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1628530sTr.class, "recordApi", "getRecordApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        ((q) this.LLILZIL.getValue(this, LLJI[0])).sk(this.LLILZLL);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C23232098k(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public final /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1628530sTr(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLILZIL = c1664750tQHLIZ;
        C1664750tQH c1664750tQHLIZ2 = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        C1627520sSE c1627520sSE = new C1627520sSE(LifecycleOwnerKt.getLifecycleScope(this));
        this.LLILZLL = c1627520sSE;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        final AnonymousClass0951 anonymousClass0951 = ((q) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).sx1().LLILZ;
        InterfaceC1625470sOv interfaceC1625470sOvLJII = ((q) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).C0().LJII();
        this.LLIZ = interfaceC1625470sOvLJII;
        final C095D c095dLJJ = interfaceC1625470sOvLJII.LJJ();
        this.LLIZLLLIL = c095dLJJ;
        C1698270uIL c1698270uIL = new C1698270uIL(new C1698260uIK(c1627520sSE.LLILZ, this, 8), 8);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1370905Yd c1370905Yd = C05YW.LIZ;
        c1370905Yd.getClass();
        final AnonymousClass0951 anonymousClass0951LJJIJIL = C09IC.LJJIJIL(c1698270uIL, lifecycleScope, C1370905Yd.LIZIZ, "");
        C385670FAf<Boolean> c385670FAfIsRecording = ((InterfaceC1648570t0B) c1664750tQHLIZ2.getValue(this, interfaceC2217461BqaArr[1])).isRecording();
        final C1698270uIL c1698270uIL2 = new C1698270uIL(C09IC.LJJIJIL(C540970LJn.LIZ(c385670FAfIsRecording), LifecycleOwnerKt.getLifecycleScope(this), C1370905Yd.LIZ(c1370905Yd, 0L, 3), c385670FAfIsRecording.LIZJ()), 9);
        final LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
        final C0AUU c0auu = C0AUU.LIZ;
        this.LLJ = new C098Y(c095dLJJ, anonymousClass0951LJJIJIL, c1698270uIL2, anonymousClass0951, lifecycleScope2, c0auu) { // from class: X.098S
            public final InterfaceC346201Wa<C097X> LL;
            public final C05YD<Boolean> LLILLJJLI;

            @Override // X.C098Y
            public C05YD<Boolean> q32() {
                return this.LLILLJJLI;
            }

            {
                C05YD<Boolean> c05ydLIZ;
                C23127094j c23127094jLJJII = C09IC.LJJII(C09IC.LJIIIIZZ(c095dLJJ, c1698270uIL2, anonymousClass0951LJJIJIL, new C23196097a(null)), new C2501209r8(new C2501209r8(anonymousClass0951, 0), 1));
                this.LL = c23127094jLJJII;
                if (c0auu.LIZ()) {
                    int iLIZIZ = c0auu.LIZIZ();
                    C23123094f c23123094fLJJIZ = C09IC.LJJIZ(c23127094jLJJII, new C097W(null, C19990313Jl.LJII(iLIZIZ >= 0 ? iLIZIZ : 0, EnumC19990213Jk.MILLISECONDS)));
                    C054G c054gLJII = C2296808zG.LJII(lifecycleScope2, C0PEM.LIZ);
                    C05YW.LIZ.getClass();
                    c05ydLIZ = C09IC.LJJIJIL(c23123094fLJJIZ, c054gLJII, C1370905Yd.LIZIZ, Boolean.FALSE);
                } else {
                    c05ydLIZ = C1BNE.LIZ(Boolean.FALSE);
                }
                this.LLILLJJLI = c05ydLIZ;
            }
        };
    }
}
