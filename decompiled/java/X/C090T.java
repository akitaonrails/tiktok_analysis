package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$tryGetPortalList$1", f = "PortalLeaf.kt", l = {906}, m = "invokeSuspend")
public final class C090T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1100380ek0 LLILZ;
    public final /* synthetic */ List<EnvelopePortalMessage.PortalInfo> LLILZIL;
    public final /* synthetic */ C11NJ LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090T(long j, long j2, C1100380ek0 c1100380ek0, List<EnvelopePortalMessage.PortalInfo> list, C11NJ c11nj, InterfaceC1364105Vn<? super C090T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c1100380ek0;
        this.LLILZIL = list;
        this.LLILZLL = c11nj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PortalLeaf@b89.tryGetPortalList$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PortalLeaf@b89.tryGetPortalList$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> PortalLeaf.tryGetPortalList is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.LLILLL);
        C20441214yg.LIZIZ("PortalLeaf", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.LJJJIL(this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PortalLeaf@b89.tryGetPortalList$1");
        return unit;
    }
}
