package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.data.network.RegionChangeUpdatedApi$Companion$sendUpdatedRegion$2", f = "RegionChangeUpdatedApi.kt", l = {31}, m = "invokeSuspend")
public final class C1423105hd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423105hd(C013C c013c, C118300cf c118300cf, InterfaceC1364105Vn<? super C1423105hd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423105hd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionChangeUpdatedApi$Companion@ab45.sendUpdatedRegion$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC1423205he interfaceC1423205he = C1423505hh.LIZIZ;
                this.LL = 1;
                if (interfaceC1423205he.sendUpdatedRegion(this) == objLJFF) {
                    C1C7U.LIZIZ("RegionChangeUpdatedApi$Companion@ab45.sendUpdatedRegion$2");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.element = true;
        } catch (C632200Oqw e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.element = e.getErrorCode();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegionChangeUpdatedApi$Companion@ab45.sendUpdatedRegion$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
