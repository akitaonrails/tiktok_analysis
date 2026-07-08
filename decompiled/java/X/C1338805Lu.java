package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$enqueueInteraction$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1338805Lu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1338705Lt LL;
    public final /* synthetic */ C05M1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338805Lu(C1338705Lt c1338705Lt, C05M1 c05m1, InterfaceC1364105Vn<? super C1338805Lu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1338705Lt;
        this.LLILLJJLI = c05m1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338805Lu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objPutIfAbsent;
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.enqueueInteraction$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1338705Lt c1338705Lt = this.LL;
        C05M1 c05m1 = this.LLILLJJLI;
        String str = c05m1.LIZ;
        Object obj2 = c1338705Lt.LIZLLL.get(str);
        if (obj2 == null && (objPutIfAbsent = c1338705Lt.LIZLLL.putIfAbsent(str, (obj2 = new Object()))) != null) {
            obj2 = objPutIfAbsent;
        }
        synchronized (obj2) {
            try {
                Keva kevaLJIILIIL = c1338705Lt.LJIILIIL();
                String str2 = c05m1.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("iq_");
                sbLIZ.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C05M1 c05m1LJIIL = C1338705Lt.LJIIL(kevaLJIILIIL, strLIZIZ);
                if (c05m1LJIIL == null || c05m1LJIIL.LJ <= c05m1.LJ) {
                    kevaLJIILIIL.storeString(strLIZIZ, C1338705Lt.LJ.LJIILL(c05m1));
                    c1338705Lt.LJIIJ().put(c05m1.LIZ, c05m1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.enqueueInteraction$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
