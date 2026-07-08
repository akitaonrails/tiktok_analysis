package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl$queryEligibleForExplosion$2", f = "AwemeEffectRepositoryImpl.kt", l = {114}, m = "invokeSuspend")
public final class C593140NOe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C593160NOg>, Object> {
    public int LL;
    public final /* synthetic */ AwemeEffectRepositoryImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593140NOe(AwemeEffectRepositoryImpl awemeEffectRepositoryImpl, String str, String str2, long j, long j2, InterfaceC1364105Vn<? super C593140NOe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeEffectRepositoryImpl;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593140NOe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeEffectRepositoryImpl@f694.queryEligibleForExplosion$2");
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
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                long j = this.LLILZIL;
                long j2 = this.LLILZLL;
                this.LL = 1;
                obj = interfaceC593180NOiLJIIJJI.LIZIZ(j, j2, str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryEligibleForExplosion$2");
                    return objLJFF;
                }
            }
            C13BV c13bv = C13BV.INSTANCE;
            C593160NOg c593160NOg = new C593160NOg(c13bv, c13bv);
            C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryEligibleForExplosion$2");
            return c593160NOg;
        }
        C593170NOh c593170NOh = (C593170NOh) obj;
        if (c593170NOh != null) {
            List<C0NPC> list = c593170NOh.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C0NPC> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C0NPB.LIZ(it2.next()));
            }
            C593160NOg c593160NOg2 = new C593160NOg(arrayList, c593170NOh.LIZIZ);
            C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryEligibleForExplosion$2");
            return c593160NOg2;
        }
        C13BV c13bv2 = C13BV.INSTANCE;
        C593160NOg c593160NOg3 = new C593160NOg(c13bv2, c13bv2);
        C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.queryEligibleForExplosion$2");
        return c593160NOg3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C593160NOg> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
