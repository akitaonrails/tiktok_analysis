package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.168a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207250168a implements InterfaceC1277100jL2 {
    public final Function0<Unit> LIZIZ;
    public long LJ;
    public C19487111Lx LJFF;
    public final C557050Lt1 LIZJ = new C557050Lt1(false);
    public final List<C207255168f> LIZLLL = new ArrayList();
    public final C11NJ LJI = new C11NJ();

    public final void LIZ() {
        if (!((ArrayList) this.LIZLLL).isEmpty()) {
            long j = (long) (LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting.INSTANCE.getValue().interval * LSPassThroughRecordSizeConfig.DEFAULT);
            if (System.currentTimeMillis() - this.LJ >= j) {
                List listLLIIII = C13LP.LLIIII(this.LIZLLL);
                ((ArrayList) this.LIZLLL).clear();
                this.LJ = System.currentTimeMillis();
                C1304630k3R.LJFF();
                Iterator it2 = listLLIIII.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!((C207255168f) next).LIZ) {
                        if (next != null) {
                            this.LIZIZ.invoke();
                        }
                    }
                }
                C19487111Lx c19487111Lx = this.LJFF;
                if (c19487111Lx != null) {
                    c19487111Lx.dispose();
                }
                if (this.LIZJ.LIZIZ()) {
                    return;
                }
                C11QJ c11qj = C11QJ.LL;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C1701780uO0 c1701780uO0 = C969310bKb.LJ;
                this.LJFF = (C19487111Lx) c11qj.LJFF(j, timeUnit, c1701780uO0).LJIILJJIL(c1701780uO0).LJII(new InterfaceC781210Ukh() { // from class: X.168e
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        this.LIZ.LIZ();
                    }
                }).LJIILL().LJIIZILJ();
            }
        }
    }

    @Override // X.InterfaceC1277100jL2
    public final void LIZIZ() {
        if (!LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting.INSTANCE.getValue().enable) {
            C965900bF6.LIZ(new C207253168d(this));
        } else {
            if (this.LIZJ.LIZIZ()) {
                return;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C19487311Lz.LIZ(C11QJ.LL.LJIILJJIL(C969310bKb.LJ).LJII(new InterfaceC781210Ukh(jCurrentTimeMillis) { // from class: X.168c
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    ((ArrayList) this.LIZ.LIZLLL).add(new C207255168f());
                    this.LIZ.LIZ();
                }
            }).LJIILL(), this.LJI, null, null, 30);
        }
    }

    @Override // X.InterfaceC1277100jL2
    public final void dispose() {
        if (this.LIZJ.LIZ(false, true)) {
            this.LJ = 0L;
            ((ArrayList) this.LIZLLL).clear();
            C19487111Lx c19487111Lx = this.LJFF;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            this.LJI.LJ();
            this.LJFF = null;
        }
    }

    @Override // X.InterfaceC1277100jL2
    public final void reset() {
        if (this.LIZJ.LIZIZ()) {
            return;
        }
        Iterator<C207255168f> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ = true;
        }
    }

    public C207250168a(C1277020jKu c1277020jKu) {
        this.LIZIZ = c1277020jKu;
    }
}
