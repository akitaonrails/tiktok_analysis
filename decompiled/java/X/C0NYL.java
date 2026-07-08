package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS410S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NYL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.client.ActivityStatusClientImpl$replaceAllObserver$1", f = "ActivityStatusClientImpl.kt", l = {149}, m = "invokeSuspend")
public final class C0NYL extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NYK LLILLJJLI;
    public final /* synthetic */ List<AbstractC595720NYc> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NYL(C0NYK c0nyk, List<? extends AbstractC595720NYc> list, InterfaceC1364105Vn<? super C0NYL> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0nyk;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NYL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> listLJLI;
        C1C7U.LIZ("ActivityStatusClientImpl@16b7.replaceAllObserver$1");
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
            C0NYK c0nyk = this.LLILLJJLI;
            Object obj2 = c0nyk.LJIILIIL;
            List<AbstractC595720NYc> list = this.LLILLL;
            synchronized (obj2) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int size = list.size();
                    List<String> listLIZ = C0NYU.LIZ(c0nyk.LJIIJ);
                    c0nyk.LJIIJ.clear();
                    for (AbstractC595720NYc abstractC595720NYc : list) {
                        c0nyk.LJIIJ.put(abstractC595720NYc.LIZ, abstractC595720NYc);
                    }
                    List<String> listLIZ2 = C0NYU.LIZ(c0nyk.LJIIJ);
                    int size2 = listLIZ.size();
                    int size3 = listLIZ2.size();
                    listLJLI = C13LP.LJLI(listLIZ2, C13LP.LLIIJI(listLIZ));
                    int size4 = listLJLI.size();
                    List<String> listLJLI2 = C13LP.LJLI(listLIZ, C13LP.LLIIJI(listLIZ2));
                    int size5 = listLJLI2.size();
                    if (c0nyk.LJIIJJI) {
                        c0nyk.LJIILIIL().LJI(listLJLI2);
                        c0nyk.LJIILIIL().LIZ(listLJLI);
                    }
                    C0NXT c0nxtLJIILJJIL = c0nyk.LJIILJJIL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("replace isActive(");
                    sbLIZ.append(c0nyk.LJIIJJI);
                    sbLIZ.append(") observer(");
                    sbLIZ.append(size);
                    sbLIZ.append(") pre(");
                    sbLIZ.append(size2);
                    sbLIZ.append(") new(");
                    sbLIZ.append(size3);
                    sbLIZ.append(") add(");
                    sbLIZ.append(size4);
                    sbLIZ.append(") remove(");
                    sbLIZ.append(size5);
                    sbLIZ.append(") duration(");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append(')');
                    C0NXR.LIZLLL(c0nyk, c0nxtLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (C595320NWo.LIZ((C595330NWp) this.LLILLJJLI.LJIIIIZZ.getValue()).LJIIZILJ) {
                this.LLILLJJLI.LJIILIIL().LJ(listLJLI);
            }
            C0NYK c0nyk2 = this.LLILLJJLI;
            AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(c0nyk2, (C0NYK) listLJLI, (List<String>) 93);
            this.LL = 1;
            if (c0nyk2.LJIILL(awS410S0200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.replaceAllObserver$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.replaceAllObserver$1");
        return unit;
    }
}
