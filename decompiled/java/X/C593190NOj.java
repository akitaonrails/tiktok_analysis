package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl$queryEntityList$2", f = "AwemeManageServiceImpl.kt", l = {284}, m = "invokeSuspend")
public final class C593190NOj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0NPA>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593190NOj(String str, long j, long j2, InterfaceC1364105Vn<? super C593190NOj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593190NOj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("AwemeManageServiceImpl@876f.queryEntityList$2");
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
            InterfaceC593180NOi.LIZ.getClass();
            InterfaceC593180NOi interfaceC593180NOiLIZ = C611550Nyj.LIZ();
            if (interfaceC593180NOiLIZ != null) {
                String str = this.LLILLJJLI;
                long j = this.LLILLL;
                long j2 = this.LLILZ;
                this.LL = 1;
                obj = interfaceC593180NOiLIZ.LJIIIZ(str, j, j2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeManageServiceImpl@876f.queryEntityList$2");
                    return objLJFF;
                }
            }
            arrayList = null;
            C1C7U.LIZIZ("AwemeManageServiceImpl@876f.queryEntityList$2");
            return arrayList;
        }
        List list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C0NPB.LIZ((C0NPC) it2.next()));
            }
        } else {
            arrayList = null;
        }
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.queryEntityList$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0NPA>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
