package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadNode$run$2$1", f = "AIGCWorkflowDownloadNode.kt", l = {132}, m = "invokeSuspend")
public final class C1385105bV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1177704j9>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1257504w1 LLILZ;
    public final /* synthetic */ C552040Lkw LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385105bV(int i, C1257504w1 c1257504w1, C552040Lkw c552040Lkw, String str, int i2, long j, InterfaceC1364105Vn<? super C1385105bV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = c1257504w1;
        this.LLILZIL = c552040Lkw;
        this.LLILZLL = str;
        this.LLIZ = i2;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1385105bV c1385105bV = new C1385105bV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1385105bV.LLILLJJLI = obj;
        return c1385105bV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("AIGCWorkflowDownloadNode@bb4b.run$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1DEU c1deuLIZ = C2252461DEe.LIZ(this.LLILLL);
            List<DownloadInput> list = this.LLILZ.LIZ;
            C552040Lkw c552040Lkw = this.LLILZIL;
            String str = this.LLILZLL;
            int i3 = this.LLIZ;
            long j = this.LLIZLLLIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<DownloadInput> it2 = list.iterator();
            while (it2.hasNext()) {
                C1DEU c1deu = c1deuLIZ;
                int i4 = i3;
                String str2 = str;
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1385305bX(c1deu, it2.next(), c552040Lkw, str2, i4, j, null), 3));
                i3 = i4;
                str = str2;
                i2 = 1;
                c1deuLIZ = c1deu;
            }
            this.LL = i2;
            objLIZ = C1D9F.LIZ(arrayList, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AIGCWorkflowDownloadNode@bb4b.run$2$1");
                return objLJFF;
            }
        }
        C1177704j9 c1177704j9 = new C1177704j9((List) objLIZ);
        C1C7U.LIZIZ("AIGCWorkflowDownloadNode@bb4b.run$2$1");
        return c1177704j9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1177704j9> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
