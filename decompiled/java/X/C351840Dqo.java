package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.nlepro.NLEMusicManagerImpl$setBgms$1", f = "NLEMusicManagerImpl.kt", l = {160, 161}, m = "invokeSuspend")
public final class C351840Dqo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C347660Dk4> LLILLL;
    public final /* synthetic */ C347770DkF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351840Dqo(C347770DkF c347770DkF, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c347770DkF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C351840Dqo c351840Dqo = new C351840Dqo(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c351840Dqo.LLILLJJLI = obj;
        return c351840Dqo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLEMusicManagerImpl@358d.setBgms$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgms$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<C347660Dk4> list = this.LLILLL;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C347660Dk4> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C351850Dqp(it2.next(), null), 3));
                }
                this.LL = 1;
                if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgms$1");
                    return objLJFF;
                }
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C351830Dqn c351830Dqn = new C351830Dqn(this.LLILZ, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c351830Dqn) == objLJFF) {
            C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgms$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgms$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
