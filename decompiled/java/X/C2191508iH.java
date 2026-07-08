package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.FakeProgressCalculator$start$1", f = "FakeProgressCalculator.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C2191508iH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2191608iI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191508iH(C2191608iI c2191608iI, InterfaceC1364105Vn<? super C2191508iH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2191608iI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2191508iH c2191508iH = new C2191508iH(this.LLILLL, interfaceC1364105Vn);
        c2191508iH.LLILLJJLI = obj;
        return c2191508iH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("FakeProgressCalculator@3282.start$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2191608iI c2191608iI = this.LLILLL;
            int iLIZ = c2191608iI.LIZ(jCurrentTimeMillis - c2191608iI.LJFF);
            this.LLILLL.LIZJ.setValue(C2286608xc.LJ(iLIZ));
            if (iLIZ >= 95) {
                break;
            }
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("FakeProgressCalculator@3282.start$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FakeProgressCalculator@3282.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
