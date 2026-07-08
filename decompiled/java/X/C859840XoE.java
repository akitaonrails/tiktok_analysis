package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl$toggleAnim$1", f = "AnimSeqShowMgrImpl.kt", l = {}, m = "invokeSuspend")
public final class C859840XoE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C859810XoB LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859840XoE(C859810XoB c859810XoB, boolean z, InterfaceC1364105Vn<? super C859840XoE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c859810XoB;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859840XoE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AnimSeqShowMgrImpl@5.toggleAnim$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C859810XoB c859810XoB = this.LL;
        ReentrantLock reentrantLock = c859810XoB.LLIZ;
        boolean z2 = this.LLILLJJLI;
        try {
            reentrantLock.lock();
            if (z2) {
                z = true;
            } else {
                z = false;
            }
            try {
                c859810XoB.LIZJ(z);
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        } catch (IllegalMonitorStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("throw ");
            sbLIZ.append(e);
            sbLIZ.append('!');
            C1706630uVp.LIZJ("AnimSeqShowMgrImpl", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unknown throwable = ");
            sbLIZ2.append(th2);
            C1706630uVp.LIZJ("AnimSeqShowMgrImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnimSeqShowMgrImpl@5.toggleAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
