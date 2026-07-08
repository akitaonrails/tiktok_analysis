package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.et.FullWidthEffectCarouselMobComponent$initJobs$1", f = "FullWidthEffectCarouselMobComponent.kt", l = {210}, m = "invokeSuspend")
public final class C1628430sTh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1628410sTf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628430sTh(C1628410sTf c1628410sTf, InterfaceC1364105Vn<? super C1628430sTh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1628410sTf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1628430sTh c1628430sTh = new C1628430sTh(this.LLILZ, interfaceC1364105Vn);
        c1628430sTh.LLILLL = obj;
        return c1628430sTh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        ArrayList arrayList;
        C1C7U.LIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                arrayList = (ArrayList) this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZ(arrayList, this.LLILZ);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            arrayList = new ArrayList(this.LLILZ.LLILLL);
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            C1628410sTf c1628410sTf = this.LLILZ;
            C1DE8 c1de8 = new C1DE8(getContext());
            c1de8.LIZJ(c1628410sTf.l1().LJIILJJIL(), new C1628420sTg(c1628410sTf, arrayList, null));
            C1DEB.LIZ(c1de8, c1628410sTf.LLILZ, new C1628460sTk(c1628410sTf, arrayList, null));
            this.LLILLL = interfaceC497601wk;
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            if (c1de8.LJII(this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1");
                return objLJFF;
            }
        }
        LIZ(arrayList, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1");
        return unit;
    }

    public static final void LIZ(ArrayList<C1628500sTo> arrayList, C1628410sTf c1628410sTf) {
        if (!arrayList.isEmpty()) {
            c1628410sTf.G2(C13LP.LLIIII(arrayList));
            arrayList.clear();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
