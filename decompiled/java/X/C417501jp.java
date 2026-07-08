package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$prepareToShow$3", f = "ECDuringLiveBroadcasterWidget.kt", l = {290}, m = "invokeSuspend")
public final class C417501jp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C180M LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C417501jp(int i, C180M c180m, String str, InterfaceC1364105Vn<? super C417501jp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c180m;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C417501jp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$3");
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
                int i2 = this.LLILLJJLI;
                if (i2 > 0) {
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(i2, this) == objLJFF) {
                        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$3");
                        return objLJFF;
                    }
                }
            }
            C21210917zX.LIZ.LIZJ(this.LLILLL.LLJJJJ, this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload_view_failed room=");
            Room room = this.LLILLL.LLJJJJ;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            sbLIZ.append(idStr);
            Logger.e("ECDuringLiveBroadcasterWidget", C2188811AlT.LIZIZ(sbLIZ), th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
