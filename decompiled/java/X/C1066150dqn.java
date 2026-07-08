package X;

import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderLowImgRep$LowImgLoadTask$start$1", f = "HeaderLowImgRep.kt", l = {315}, m = "invokeSuspend")
public final class C1066150dqn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1066160dqo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1066150dqn(boolean z, C1066160dqo c1066160dqo, InterfaceC1364105Vn<? super C1066150dqn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1066160dqo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1066150dqn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long length;
        C1C7U.LIZ("HeaderLowImgRep$LowImgLoadTask@9a75.start$1");
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
            C1066100dqi c1066100dqi = new C1066100dqi();
            C1066160dqo c1066160dqo = this.LLILLL;
            c1066100dqi.LIZJ = "pdp_lower";
            c1066100dqi.LIZJ(new C03IT(Collections.singletonList(c1066160dqo.LIZJ)));
            if (!this.LLILLJJLI) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                String str = this.LLILLL.LIZJ;
                c1326790kdB.getClass();
                if (C1326790kdB.LIZJ(str)) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LLILLL.LJFF.getResources(), C1326790kdB.LIZ(this.LLILLL.LIZJ));
                    C1066160dqo c1066160dqo2 = this.LLILLL;
                    c1066160dqo2.LJI = bitmapDrawable;
                    c1066160dqo2.LIZ(bitmapDrawable);
                    String str2 = this.LLILLL.LIZJ;
                    this.LL = 1;
                    c1066100dqi.LJIIIZ = str2;
                    c1066100dqi.LIZIZ = SystemClock.uptimeMillis();
                    c1066100dqi.LJIIIIZZ = true;
                    c1066100dqi.LJIIJJI++;
                    C238400w2 c238400w2 = new C238400w2();
                    try {
                        File fileLIZLLL = C1331660kl2.LIZJ().LIZLLL(UriProtector.parse(str2));
                        if (fileLIZLLL != null) {
                            length = fileLIZLLL.length();
                        } else {
                            length = 0;
                        }
                        c238400w2.element = length;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C1058180ddw(c1066100dqi, c238400w2, null));
                    if (objLJI != C099R.LJFF()) {
                        objLJI = Unit.LIZ;
                    }
                    if (objLJI == objLJFF) {
                        C1C7U.LIZIZ("HeaderLowImgRep$LowImgLoadTask@9a75.start$1");
                        return objLJFF;
                    }
                }
            }
            C1066160dqo c1066160dqo3 = this.LLILLL;
            if (!c1066160dqo3.LIZLLL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HeaderLowImgRep$LowImgLoadTask@9a75.start$1");
                return unit;
            }
            C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
            String str3 = c1066160dqo3.LIZJ;
            c1326790kdB2.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str3);
            Pair<Integer, Integer> pairLIZ = C1743690vTb.LIZ(this.LLILLL.LIZJ);
            if (pairLIZ != null) {
                int iIntValue = pairLIZ.getFirst().intValue();
                int iIntValue2 = pairLIZ.getSecond().intValue();
                c1331670kl3LIZLLL.LJIIIIZZ = iIntValue;
                c1331670kl3LIZLLL.LJIIIZ = iIntValue2;
            }
            c1331670kl3LIZLLL.LIZLLL("HeaderLowImgRep");
            c1331670kl3LIZLLL.LJJII(new C1077500e96(this.LLILLL, c1066100dqi, 1));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("HeaderLowImgRep$LowImgLoadTask@9a75.start$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("HeaderLowImgRep$LowImgLoadTask@9a75.start$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
