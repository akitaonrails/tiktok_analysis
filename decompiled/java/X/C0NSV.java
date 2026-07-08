package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.SlimShortTouch;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shorttouch.ShortTouchController$doShowShortTouchItem$1$2", f = "ShortTouchController.kt", l = {507}, m = "invokeSuspend")
public final class C0NSV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Room LL;
    public C1741600vQE LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final /* synthetic */ Room LLILZIL;
    public final /* synthetic */ C1741600vQE LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSV(Room room, C1741600vQE c1741600vQE, boolean z, InterfaceC1364105Vn<? super C0NSV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = room;
        this.LLILZLL = c1741600vQE;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSV(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Room room;
        C1741600vQE c1741600vQE;
        boolean z;
        C1C7U.LIZ("ShortTouchController@79c8.doShowShortTouchItem$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    z = this.LLILLL;
                    c1741600vQE = this.LLILLJJLI;
                    room = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                room = this.LLILZIL;
                c1741600vQE = this.LLILZLL;
                z = this.LLIZ;
                C0NSX c0nsx = EcMessageApi.LIZ;
                String strValueOf = String.valueOf(room.getId());
                String strValueOf2 = String.valueOf(room.getOwnerUserId());
                this.LL = room;
                this.LLILLJJLI = c1741600vQE;
                this.LLILLL = z;
                this.LLILZ = 1;
                obj = c0nsx.LIZ(0L, strValueOf, strValueOf2, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShortTouchController@79c8.doShowShortTouchItem$1$2");
                    return objLJFF;
                }
            }
            List<SlimShortTouch> list = (List) obj;
            if (list != null) {
                if (!z) {
                    z2 = false;
                }
                c1741600vQE.LJ(room, list, z2, "refresh_api");
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortTouchController@79c8.doShowShortTouchItem$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
