package X;

import Y.AgS282S0100000_1;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.creatorfeed.PdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04IA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.creatorvideo.PdpCreatorVideoManager$fetchCreatorVideoList$1$1", f = "PdpCreatorVideoManager.kt", l = {137, 147}, m = "invokeSuspend")
public final class C04IA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C04BG LLILLJJLI;
    public final /* synthetic */ HashMap<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04IA(C04BG c04bg, HashMap<String, Object> map, InterfaceC1364105Vn<? super C04IA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c04bg;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04IA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LJI = "loading";
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin = PdpCreatorVideoFeedDependencyService.createIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IPdpCreatorVideoFeedDependencyService.class.getName();
                if (anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPdpCreatorVideoFeedDependencyService.class);
            }
            HashMap<String, Object> map = this.LLILLL;
            this.LL = 1;
            obj = ((IPdpCreatorVideoFeedDependencyService) anonymousClass0317CreateIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin).fetchCreatorVideoList(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1");
                return objLJFF;
            }
        }
        InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) obj;
        if (interfaceC346201Wa != null) {
            C2501109r7 c2501109r7 = new C2501109r7(new C04IB(this.LLILLJJLI, null), interfaceC346201Wa, 0);
            AgS282S0100000_1 agS282S0100000_1 = new AgS282S0100000_1(this.LLILLJJLI, 0);
            this.LL = 2;
            if (c2501109r7.collect(agS282S0100000_1, this) == objLJFF) {
                C1C7U.LIZIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
