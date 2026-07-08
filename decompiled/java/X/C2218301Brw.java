package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Brw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218301Brw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2218321Bry LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ C1461250o83 LLILLL;
    public final /* synthetic */ C2218271Brt LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218301Brw(C2218321Bry c2218321Bry, Effect effect, C1461250o83 c1461250o83, C2218271Brt c2218271Brt) {
        super(0);
        this.LL = c2218321Bry;
        this.LLILLJJLI = effect;
        this.LLILLL = c1461250o83;
        this.LLILZ = c2218271Brt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            this.LL.LIZ = true;
            C1664460tPo.LJIIIIZZ(this.LLILLJJLI);
            if (this.LLILLL.LIZ()) {
                this.LLILZ.LIZJ();
                this.LLILZ.LJFF(this.LLILLJJLI);
                this.LLILZ.LJ();
                byte[] bArr = new byte[8820];
                String str = this.LLILLL.LIZIZ;
                if (C2286708xd.LJIIL(str) <= 0) {
                    Thread.interrupted();
                }
                C0VSP c0vsp = new C0VSP(str);
                while (this.LL.LIZ) {
                    int i = c0vsp.read(bArr);
                    this.LLILZ.LIZLLL(false, bArr);
                    this.LL.LIZIZ.getClass();
                    Thread.sleep(20L);
                    if (i == -1) {
                        break;
                    }
                }
                this.LLILZ.LJII();
                this.LL.LIZJ.getClass();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LIZLLL.invoke(th);
        }
        return Unit.LIZ;
    }
}
