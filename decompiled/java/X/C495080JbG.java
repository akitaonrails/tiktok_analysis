package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment$getSpotlightLoop$2", f = "SubscriptionSpotlightFragment.kt", l = {267}, m = "invokeSuspend")
public final class C495080JbG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLL;
    public final /* synthetic */ Function1<List<SpotlightItem>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C495080JbG(SubscriptionSpotlightFragment subscriptionSpotlightFragment, Function1<? super List<SpotlightItem>, Unit> function1, InterfaceC1364105Vn<? super C495080JbG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = subscriptionSpotlightFragment;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C495080JbG c495080JbG = new C495080JbG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c495080JbG.LLILLJJLI = obj;
        return c495080JbG;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Unit unit;
        C1C7U.LIZ("SubscriptionSpotlightFragment@e756.getSpotlightLoop$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C0K70.LIZLLL(this.LLILLL.getClass().getSimpleName(), this.LLILLL.getContext());
                    C0K70.LJ(this.LLILLL.getClass().getSimpleName(), this.LLILLL.getContext(), EnumC499450JiJ.GENERAL);
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
                    c1389890mGx.LJIIIZ(2131854909);
                    c1389890mGx.LJIIJJI();
                    DialogC1389620mGW dialogC1389620mGW = this.LLILLL.LLJJ;
                    if (dialogC1389620mGW != null) {
                        dialogC1389620mGW.dismiss();
                        C785410UrT.LIZ(dialogC1389620mGW);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.getSpotlightLoop$2");
                    return unit;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        do {
            C0K8F c0k8f = C0K8F.LIZ;
            String str = this.LLILLL.LLJ;
            C495090JbH c495090JbH = new C495090JbH(this.LLILZ, interfaceC497601wk);
            c0k8f.getClass();
            C0K8F.LIZIZ(str, c495090JbH);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
        } while (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) != objLJFF);
        C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.getSpotlightLoop$2");
        return objLJFF;
    }
}
