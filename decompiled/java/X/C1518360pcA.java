package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.GenericDeclaration;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.engine.PNSNetworkEngine$asyncCall$1", f = "PNSNetworkEngine.kt", l = {69, 71}, m = "invokeSuspend")
public final class C1518360pcA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1518410pcF LLILLJJLI;
    public final /* synthetic */ InterfaceC1518350pc9<T> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1518420pcG LLILZIL;
    public final /* synthetic */ Class<T> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518360pcA(C1518410pcF c1518410pcF, InterfaceC1518350pc9<T> interfaceC1518350pc9, boolean z, C1518420pcG c1518420pcG, Class<T> cls, InterfaceC1364105Vn<? super C1518360pcA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1518410pcF;
        this.LLILLL = interfaceC1518350pc9;
        this.LLILZ = z;
        this.LLILZIL = c1518420pcG;
        this.LLILZLL = cls;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518360pcA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PNSNetworkEngine@3e07.asyncCall$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PNSNetworkEngine@3e07.asyncCall$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1518410pcF c1518410pcF = this.LLILLJJLI;
            C1518420pcG c1518420pcG = this.LLILZIL;
            GenericDeclaration genericDeclaration = this.LLILZLL;
            this.LL = 1;
            obj = c1518410pcF.LIZLLL(c1518420pcG, genericDeclaration, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PNSNetworkEngine@3e07.asyncCall$1");
                return objLJFF;
            }
        }
        c098200Yq = (C1518330pc7) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        C1518410pcF c1518410pcF2 = this.LLILLJJLI;
        Object obj2 = this.LLILLL;
        boolean z = this.LLILZ;
        this.LL = 2;
        if (c1518410pcF2.LIZIZ(c098200Yq, obj2, z, this) == objLJFF) {
            C1C7U.LIZIZ("PNSNetworkEngine@3e07.asyncCall$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PNSNetworkEngine@3e07.asyncCall$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
