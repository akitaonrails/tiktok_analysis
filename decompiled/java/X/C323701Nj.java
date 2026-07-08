package X;

import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.utils.StatusReportRetryUtilsKt$sendStatusV3$1$1", f = "StatusReportRetryUtils.kt", l = {124, 125}, m = "invokeSuspend")
public final class C323701Nj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<C09AE> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ C01QC LLIZ;
    public final /* synthetic */ C259800zU<C470590Icr<UpdateStatusResponse>> LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ C259800zU<Throwable> LLJI;
    public final /* synthetic */ Function2<C470590Icr<UpdateStatusResponse>, Integer, Unit> LLJIJIL;
    public final /* synthetic */ Function2<Throwable, Integer, Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C323701Nj(int i, List<C09AE> list, int i2, long j, C01QC c01qc, C259800zU<C470590Icr<UpdateStatusResponse>> c259800zU, C118300cf c118300cf, C259800zU<Throwable> c259800zU2, Function2<? super C470590Icr<UpdateStatusResponse>, ? super Integer, Unit> function2, Function2<? super Throwable, ? super Integer, Unit> function22, InterfaceC1364105Vn<? super C323701Nj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = i2;
        this.LLILZLL = j;
        this.LLIZ = c01qc;
        this.LLIZLLLIL = c259800zU;
        this.LLJ = c118300cf;
        this.LLJI = c259800zU2;
        this.LLJIJIL = function2;
        this.LLJILJIL = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323701Nj c323701Nj = new C323701Nj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c323701Nj.LLILLJJLI = obj;
        return c323701Nj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<C09AE> it2;
        C1C7U.LIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            int i2 = this.LLILLL;
            List<C09AE> list = this.LLILZ;
            int i3 = this.LLILZIL;
            long j = this.LLILZLL;
            C01QC c01qc = this.LLIZ;
            C259800zU<C470590Icr<UpdateStatusResponse>> c259800zU = this.LLIZLLLIL;
            C118300cf c118300cf = this.LLJ;
            C259800zU<Throwable> c259800zU2 = this.LLJI;
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i3;
                list.add(C23250099c.LIZLLL(interfaceC497601wk, null, null, new C01QB(i4, i5, j, c01qc, c259800zU, list, c118300cf, c259800zU2, null), 3));
                i4++;
                i3 = i5;
            }
            it2 = this.LLILZ.iterator();
        }
        while (it2.hasNext()) {
            C09AE next = it2.next();
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (next.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C323601Ni c323601Ni = new C323601Ni(this.LLIZLLLIL, this.LLJIJIL, this.LLJ, this.LLJI, this.LLJILJIL, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c323601Ni) == objLJFF) {
            C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
