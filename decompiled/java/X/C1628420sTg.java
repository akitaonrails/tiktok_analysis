package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0sTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.et.FullWidthEffectCarouselMobComponent$initJobs$1$1$1", f = "FullWidthEffectCarouselMobComponent.kt", l = {}, m = "invokeSuspend")
public final class C1628420sTg extends C09AX implements Function2<List<? extends C1628500sTo>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1628410sTf LLILLJJLI;
    public final /* synthetic */ ArrayList<C1628500sTo> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628420sTg(C1628410sTf c1628410sTf, ArrayList<C1628500sTo> arrayList, InterfaceC1364105Vn<? super C1628420sTg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1628410sTf;
        this.LLILLL = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1628420sTg c1628420sTg = new C1628420sTg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1628420sTg.LL = obj;
        return c1628420sTg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1628500sTo c1628500sTo : (List) this.LL) {
            if (this.LLILLJJLI.Z1().add(new Object(c1628500sTo.LIZLLL.getEffectId(), c1628500sTo.LIZIZ, c1628500sTo.LIZLLL.getLogId()) { // from class: X.0sTn
                public final String LIZ;
                public final String LIZIZ;
                public final String LIZJ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1628490sTn)) {
                        return false;
                    }
                    C1628490sTn c1628490sTn = (C1628490sTn) obj2;
                    return Intrinsics.LJFF(this.LIZ, c1628490sTn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1628490sTn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1628490sTn.LIZJ);
                }

                public final int hashCode() {
                    return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = str;
                    this.LIZJ = str;
                }
            })) {
                this.LLILLL.add(c1628500sTo);
                int size = this.LLILLL.size();
                C1628410sTf c1628410sTf = this.LLILLJJLI;
                if (size >= c1628410sTf.LLILLL) {
                    C1628430sTh.LIZ(this.LLILLL, c1628410sTf);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselMobComponent@588d.initJobs$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C1628500sTo> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
