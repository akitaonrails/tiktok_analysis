package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lgo.a;

/* JADX INFO: renamed from: X.0tGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658900tGq extends AbstractC2255721DQs<InterfaceC1646880sxS> implements InterfaceC1646880sxS, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC362610EJn LLILZ = new InterfaceC362610EJn() { // from class: X.0tGr
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 24 && i != 25) {
                return false;
            }
            a.LIZIZ.LJFF().LIZIZ();
            return false;
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658900tGq.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    public InterfaceC1646880sxS W1() {
        return this;
    }

    public final void X1() {
        a.LIZIZ.LJFF().LIZJ(new AwS604S0100000_25(this, 216));
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LL);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.kF(this.LLILZ);
        }
        if (((Boolean) C283440B9a.LIZ.getValue()).booleanValue()) {
            C0CNO.LIZ(C15O7.LJI, new AwS569S0100000_25(this, 352));
        } else {
            X1();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        a.LIZIZ.LJFF().LIZ();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LL);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(this.LLILZ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1658900tGq(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
