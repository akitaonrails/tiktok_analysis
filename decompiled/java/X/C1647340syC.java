package X;

import Y.AObjectS246S0100000_25;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0syC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647340syC extends AbstractC2255721DQs<InterfaceC1646920sxW> implements InterfaceC379610EuV, InterfaceC1646920sxW {
    public static final int LLILZIL = 8;
    public final C1DRG LL;
    public final InterfaceC1646920sxW LLILLJJLI = this;
    public final ShortVideoContext LLILLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final a LLILZ = (a) getDiContainer().LJII(a.class, null);

    public final void Sh() {
        IFundraiserService iFundraiserServiceLJIILL = ComplianceServiceProvider.LJIILL();
        if (iFundraiserServiceLJIILL == null || !iFundraiserServiceLJIILL.LIZ()) {
            return;
        }
        iFundraiserServiceLJIILL.LJIIL(Intrinsics.LJFF(this.LLILLL.shootWay, "story"));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILZ.RS().LIZ(this, new AObjectS246S0100000_25(this, 0));
    }

    public InterfaceC1646920sxW W1() {
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

    public C1647340syC(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
