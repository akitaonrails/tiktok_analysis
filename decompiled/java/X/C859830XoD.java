package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl$register$1", f = "AnimSeqShowMgrImpl.kt", l = {}, m = "invokeSuspend")
public final class C859830XoD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C859810XoB LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C01LM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859830XoD(C859810XoB c859810XoB, String str, float f, C01LM c01lm, InterfaceC1364105Vn<? super C859830XoD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c859810XoB;
        this.LLILLJJLI = str;
        this.LLILLL = f;
        this.LLILZ = c01lm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859830XoD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimSeqShowMgrImpl@5.register$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C859810XoB c859810XoB = this.LL;
        int i = c859810XoB.LLILLL.get() + 1;
        if (i != c859810XoB.LLILLL.get()) {
            c859810XoB.LLILLL.getAndSet(i);
        }
        C1706630uVp.LJFF("AnimSeqShowMgrImpl", this.LLILLJJLI);
        C859810XoB c859810XoB2 = this.LL;
        ReentrantLock reentrantLock = c859810XoB2.LLIZ;
        float f = this.LLILLL;
        C01LM c01lm = this.LLILZ;
        try {
            reentrantLock.lock();
            try {
                c859810XoB2.LIZIZ(f, c01lm);
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
        C1C7U.LIZIZ("AnimSeqShowMgrImpl@5.register$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
