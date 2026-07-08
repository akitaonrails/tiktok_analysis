package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.168Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C168Z implements InterfaceC1277100jL2 {
    public final Function0<Unit> LIZIZ;
    public C11JF LIZLLL;
    public final C557050Lt1 LIZJ = new C557050Lt1(false);
    public final long LJ = (long) (LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting.INSTANCE.getValue().interval * LSPassThroughRecordSizeConfig.DEFAULT);
    public C11RK<Long> LJFF = LIZ();

    public final C11RK<Long> LIZ() {
        C11RK<Long> c11rk = new C11RK<>();
        this.LIZLLL = (C11JF) c11rk.LJJLIIIJLLLLLLLZ(this.LJ, TimeUnit.MILLISECONDS).LJJJLZIJ(C969310bKb.LJ).LJJLJLI(new C09JN() { // from class: X.168b
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SeiFrequencyHandler@3959.createPublishSubject$disposable$1");
                this.LL.LIZIZ.invoke();
                C1C7U.LIZIZ("SeiFrequencyHandler@3959.createPublishSubject$disposable$1");
            }
        });
        return c11rk;
    }

    @Override // X.InterfaceC1277100jL2
    public final void LIZIZ() {
        if (this.LJFF == null && !this.LIZJ.LIZIZ()) {
            this.LJFF = LIZ();
        }
        C11RK<Long> c11rk = this.LJFF;
        if (c11rk != null) {
            c11rk.onNext(Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.InterfaceC1277100jL2
    public final void dispose() {
        if (this.LIZJ.LIZ(false, true)) {
            C11RK<Long> c11rk = this.LJFF;
            if (c11rk != null) {
                c11rk.onComplete();
            }
            C11JF c11jf = this.LIZLLL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJFF = null;
            this.LIZLLL = null;
        }
    }

    @Override // X.InterfaceC1277100jL2
    public final void reset() {
        if (this.LIZJ.LIZIZ()) {
            return;
        }
        C11RK<Long> c11rk = this.LJFF;
        if (c11rk != null) {
            c11rk.onComplete();
        }
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJFF = null;
        this.LIZLLL = null;
    }

    public C168Z(C1277020jKu c1277020jKu) {
        this.LIZIZ = c1277020jKu;
    }
}
