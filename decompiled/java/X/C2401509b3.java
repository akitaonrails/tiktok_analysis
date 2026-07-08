package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09b3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.selector.MvChooseAlbumFragment$loadDataV2$1", f = "MvChooseAlbumFragment.kt", l = {174}, m = "invokeSuspend")
public final class C2401509b3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20639615pa LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401509b3(C20639615pa c20639615pa, Context context, InterfaceC1364105Vn<? super C2401509b3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20639615pa;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2401509b3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MvChooseAlbumFragment@b589.loadDataV2$1");
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
            C20639615pa c20639615pa = this.LLILLJJLI;
            Context context = this.LLILLL;
            c20639615pa.getClass();
            try {
                c098200Yq = C2400609au.LIZIZ(context, false, -1, -1, null, true, true, false, -1);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            List list = (List) c098200Yq;
            if (list == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MvChooseAlbumFragment@b589.loadDataV2$1");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2402309bB c2402309bB = new C2402309bB(this.LLILLJJLI, list, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2402309bB) == objLJFF) {
                C1C7U.LIZIZ("MvChooseAlbumFragment@b589.loadDataV2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MvChooseAlbumFragment@b589.loadDataV2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
