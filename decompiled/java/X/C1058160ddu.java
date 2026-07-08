package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ddu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ImageLogReporter$onComplete$3", f = "ImageLogReporter.kt", l = {150}, m = "invokeSuspend")
public final class C1058160ddu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1066100dqi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1058160ddu(C1066100dqi c1066100dqi, InterfaceC1364105Vn<? super C1058160ddu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1066100dqi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1058160ddu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long length;
        C1C7U.LIZ("ImageLogReporter@b0a1.onComplete$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C238400w2 c238400w2 = new C238400w2();
            List<String> list = this.LLILLJJLI.LJ;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        File fileLIZLLL = C1331660kl2.LIZJ().LIZLLL(UriProtector.parse(it2.next()));
                        if (fileLIZLLL != null) {
                            length = fileLIZLLL.length();
                        } else {
                            length = 0;
                        }
                        c238400w2.element = length;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (c238400w2.element > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1058170ddv c1058170ddv = new C1058170ddv(this.LLILLJJLI, c238400w2, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1058170ddv) == objLJFF) {
                C1C7U.LIZIZ("ImageLogReporter@b0a1.onComplete$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageLogReporter@b0a1.onComplete$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
