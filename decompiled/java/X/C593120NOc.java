package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl$getEntitiesByUuids$2", f = "AwemeEffectRepositoryImpl.kt", l = {89}, m = "invokeSuspend")
public final class C593120NOc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0NPA>>, Object> {
    public int LL;
    public final /* synthetic */ AwemeEffectRepositoryImpl LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593120NOc(AwemeEffectRepositoryImpl awemeEffectRepositoryImpl, List<String> list, InterfaceC1364105Vn<? super C593120NOc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeEffectRepositoryImpl;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593120NOc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        C1C7U.LIZ("AwemeEffectRepositoryImpl@f694.getEntitiesByUuids$2");
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
            InterfaceC593180NOi interfaceC593180NOiLJIIJJI = this.LLILLJJLI.LJIIJJI();
            if (interfaceC593180NOiLJIIJJI != null) {
                List<String> list = this.LLILLL;
                this.LL = 1;
                obj = interfaceC593180NOiLJIIJJI.LIZJ(list, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.getEntitiesByUuids$2");
                    return objLJFF;
                }
            }
            arrayList = C13BV.INSTANCE;
            C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.getEntitiesByUuids$2");
            return arrayList;
        }
        List list2 = (List) obj;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(C0NPB.LIZ((C0NPC) it2.next()));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.getEntitiesByUuids$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0NPA>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
