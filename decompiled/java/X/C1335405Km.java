package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMMessagePreloader$addResources$1$1", f = "IMMessagePreloader.kt", l = {}, m = "invokeSuspend")
public final class C1335405Km extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1329605Ig LL;
    public final /* synthetic */ InterfaceC1329505If LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1335405Km(C1329605Ig c1329605Ig, InterfaceC1329505If interfaceC1329505If, int i, InterfaceC1364105Vn<? super C1335405Km> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1329605Ig;
        this.LLILLJJLI = interfaceC1329505If;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1335405Km(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessagePreloader@e74f.addResources$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1329605Ig c1329605Ig = this.LL;
        String resourceId = this.LLILLJJLI.getResourceId();
        int i = this.LLILLL;
        c1329605Ig.getClass();
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null) {
            InterfaceC1335605Ko interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ();
            interfaceC1335605KoLIZIZ.LIZIZ(resourceId, "message");
            try {
                List<C869590Y9l> listLJIJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIJJ(i, resourceId, C13BV.INSTANCE);
                if (listLJIJJ.isEmpty()) {
                    interfaceC1335605KoLIZIZ.LIZJ(resourceId);
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C869590Y9l c869590Y9l : listLJIJJ) {
                        if (C896070ZDh.LIZ(c869590Y9l, AFwS187S0000000_2.get$arr$(1216))) {
                            arrayList.add(c869590Y9l);
                        } else {
                            arrayList2.add(c869590Y9l);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        iIMPreloadService.getEventCenter().LIZ(new C05GP(arrayList2));
                    }
                    if (!arrayList.isEmpty()) {
                        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIIIZ(new C1768906wJ(10), resourceId, arrayList);
                    }
                    interfaceC1335605KoLIZIZ.LIZJ(resourceId);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC1335605KoLIZIZ.onFailed(resourceId);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMessagePreloader@e74f.addResources$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
