package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage$startC2PATagging$1", f = "TakoLongImageSharePackage.kt", l = {100}, m = "invokeSuspend")
public final class C063Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoLongImageSharePackage LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063Z(TakoLongImageSharePackage takoLongImageSharePackage, String str, InterfaceC1364105Vn<? super C063Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoLongImageSharePackage;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C063Z c063z = new C063Z(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c063z.LLILLJJLI = obj;
        return c063z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TakoLongImageSharePackage@f869.startC2PATagging$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILZ;
                C15453063f c15453063f = C15453063f.LIZ;
                this.LL = 1;
                c15453063f.getClass();
                obj = C15453063f.LIZIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoLongImageSharePackage@f869.startC2PATagging$1");
                    return objLJFF;
                }
            }
            c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        this.LLILLL.c2paWritten.LJIIZILJ(Boolean.valueOf(((Boolean) c098200Yq).booleanValue()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.startC2PATagging$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
