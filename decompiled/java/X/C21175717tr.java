package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.event.TTKECMMKPageBridgeCenter$invokeMethod$4", f = "TTKECMMKPageBridgeCenter.kt", l = {373}, m = "invokeSuspend")
public final class C21175717tr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C21176017tu LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1775140wIK LLILZIL;
    public final /* synthetic */ C1775140wIK LLILZLL;
    public final /* synthetic */ C21176317tx LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21175717tr(long j, C21176017tu c21176017tu, String str, C1775140wIK c1775140wIK, C1775140wIK c1775140wIK2, C21176317tx c21176317tx, InterfaceC1364105Vn<? super C21175717tr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c21176017tu;
        this.LLILZ = str;
        this.LLILZIL = c1775140wIK;
        this.LLILZLL = c1775140wIK2;
        this.LLIZ = c21176317tx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21175717tr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TTKECMMKPageBridgeCenter@320f.invokeMethod$4");
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
                C1C7U.LIZIZ("TTKECMMKPageBridgeCenter@320f.invokeMethod$4");
                return objLJFF;
            }
        }
        C21175817ts c21175817ts = this.LLILLL.LJIILIIL().get(this.LLILZ);
        if (c21175817ts != null) {
            this.LLILLL.LJIILIIL().remove(this.LLILZ);
        }
        if (c21175817ts != null && !c21175817ts.LIZJ) {
            EnumC599620NfU enumC599620NfU = EnumC599620NfU.METHOD;
            EnumC993140bx2 enumC993140bx2 = EnumC993140bx2.CALL_METHOD;
            EnumC993160bx4 enumC993160bx4 = EnumC993160bx4.CALL_METHORD_WITHOUTBACK_IN_TIMEOUT;
            C1775140wIK c1775140wIK = this.LLILZIL;
            String str = c1775140wIK.LIZ;
            try {
                c098200Yq = C1741890vQh.LJIIIIZZ(c1775140wIK.LIZIZ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1771980wDE.LJ(enumC599620NfU, enumC993140bx2, enumC993160bx4, str, (String) c098200Yq);
            String str2 = "invokeMethod time out error=> " + this.LLILZLL.LIZ;
            c21175817ts.LIZ.LIZ(-9999, str2, null);
            C21176217tw c21176217tw = this.LLILLL.LJII;
            C21176317tx c21176317tx = this.LLIZ;
            c21176217tw.getClass();
            c21176317tx.LJII = -9999;
            c21176317tx.LJIIIIZZ = str2;
            C21176117tv c21176117tv = C21176117tv.LIZ;
            EnumC21165817sG enumC21165817sG = EnumC21165817sG.METHOD;
            c21176117tv.getClass();
            C21176117tv.LIZ(c21176317tx, enumC21165817sG);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTKECMMKPageBridgeCenter@320f.invokeMethod$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
