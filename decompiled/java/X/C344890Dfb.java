package X;

import android.content.Context;
import com.aweme.storage.StorageCleanServiceImpl;
import com.ss.android.ugc.aweme.base.storage.IStorageCleanService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$cleanCacheForRecord$cleanCacheTime$1$2", f = "RecordConditionCheck.kt", l = {319}, m = "invokeSuspend")
public final class C344890Dfb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<AtomicLong> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344890Dfb(C259800zU<AtomicLong> c259800zU, Context context, InterfaceC1364105Vn<? super C344890Dfb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344890Dfb(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Context context = this.LLILZ;
            this.LL = context;
            this.LLILLJJLI = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            IStorageCleanService iStorageCleanServiceLIZJ = StorageCleanServiceImpl.LIZJ();
            if (iStorageCleanServiceLIZJ != null) {
                iStorageCleanServiceLIZJ.LIZIZ(context, new C0CS6() { // from class: X.0Dfc
                    @Override // X.C0CS6
                    public final void LIZ(long j, boolean z) {
                        InterfaceC1364105Vn<Long> interfaceC1364105Vn = c23260099m;
                        if (!z || j <= 0) {
                            j = 0;
                        }
                        Long lValueOf = Long.valueOf(j);
                        C189200o6.m2constructorimpl(lValueOf);
                        interfaceC1364105Vn.resumeWith(lValueOf);
                    }
                });
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        return C2286608xc.LJFF(this.LLILLL.element.addAndGet(((Number) obj).longValue()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
