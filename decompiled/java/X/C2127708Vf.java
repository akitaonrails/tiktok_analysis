package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.config.EcNetInterceptPerfConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkBystander;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS547S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.08Vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkBystander$onComplete$1", f = "ECAPIInterceptorNetworkBystander.kt", l = {}, m = "invokeSuspend")
public final class C2127708Vf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<?> LL;
    public final /* synthetic */ TypedInput LLILLJJLI;
    public final /* synthetic */ Request LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2127708Vf(C0X52<?> c0x52, TypedInput typedInput, Request request, InterfaceC1364105Vn<? super C2127708Vf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = typedInput;
        this.LLILLL = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2127708Vf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        String string;
        HashMap<String, Object> mapLJIIJ;
        C1C7U.LIZ("ECAPIInterceptorNetworkBystander@205a.onComplete$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (EcNetInterceptPerfConfig.LIZ.memOpt == 1) {
            String strLIZ = C1336330ksZ.LIZ(this.LL);
            AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(this.LLILLJJLI, 20);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (strLIZ.length() == 0) {
                mapLJIIJ = (HashMap) awS547S0100000_3.invoke();
            } else {
                Map<String, C2127908Vh> map = C2127808Vg.LIZ;
                synchronized (map) {
                    try {
                        C2127908Vh c2127908Vh = map.get(strLIZ);
                        if (c2127908Vh != null && c2127908Vh.LIZIZ >= jCurrentTimeMillis2) {
                            mapLJIIJ = c2127908Vh.LIZ;
                        } else {
                            map.remove(strLIZ);
                            mapLJIIJ = (HashMap) awS547S0100000_3.invoke();
                            if (mapLJIIJ != null && !mapLJIIJ.isEmpty()) {
                                map.put(strLIZ, new C2127908Vh(mapLJIIJ, 3000 + jCurrentTimeMillis2));
                                Iterator<Map.Entry<String, C2127908Vh>> it2 = map.entrySet().iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getValue().LIZIZ < jCurrentTimeMillis2) {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else {
            ECAPIInterceptorNetworkBystander eCAPIInterceptorNetworkBystander = ECAPIInterceptorNetworkBystander.LIZ;
            AbsTypedOutput absTypedOutput = (AbsTypedOutput) this.LLILLJJLI;
            eCAPIInterceptorNetworkBystander.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    absTypedOutput.writeTo(byteArrayOutputStream);
                    string = byteArrayOutputStream.toString();
                    try {
                        byteArrayOutputStream.close();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        byteArrayOutputStream = byteArrayOutputStream;
                    } catch (Throwable th2) {
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    try {
                        byteArrayOutputStream.close();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        throw th3;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    byteArrayOutputStream.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    r1 = byteArrayOutputStream;
                } catch (Throwable th4) {
                }
                string = null;
                byteArrayOutputStream = r1;
            }
            mapLJIIJ = C1741890vQh.LJIIJ(string);
        }
        C2175508fh c2175508fh = this.LL.LIZ;
        Object obj2 = c2175508fh.LJFF;
        List<C080U> list = c2175508fh.LIZLLL;
        ECAPIInterceptorNetworkBystander.LIZ.getClass();
        List<InterfaceC2027307wt> list2 = (List) ECAPIInterceptorNetworkBystander.LIZIZ.getValue();
        Request request = this.LLILLL;
        for (InterfaceC2027307wt interfaceC2027307wt : list2) {
            if (interfaceC2027307wt.LIZIZ(request.getPath(), request, request.isResponseStreaming())) {
                interfaceC2027307wt.LJ(mapLJIIJ, request, request.getPath(), false, obj2, list, new C07WL(false));
            }
        }
        if (jCurrentTimeMillis % ((long) 100) == 0) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            int i = C1505950pI9.LIZ;
            C1505950pI9.LIZJ(jCurrentTimeMillis3 - jCurrentTimeMillis, "api_dispatch_bystander_total", this.LLILLL.getPath());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAPIInterceptorNetworkBystander@205a.onComplete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
