package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation.IMAIBotCreationVM;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation.IMAIBotCreationVM$onCreateClick$2", f = "IMAIBotCreationVM.kt", l = {186}, m = "invokeSuspend")
public final class C1523905xt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMAIBotCreationVM LLILLJJLI;
    public final /* synthetic */ WeakReference<Context> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523905xt(IMAIBotCreationVM iMAIBotCreationVM, WeakReference<Context> weakReference, InterfaceC1364105Vn<? super C1523905xt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMAIBotCreationVM;
        this.LLILLL = weakReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523905xt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        Object objLIZ = obj;
        C1C7U.LIZ("IMAIBotCreationVM@1cef.onCreateClick$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C15408061m c15408061m = C15408061m.LIZ;
            int i2 = IMAIBotCreationVM.LLILLJJLI;
            boolean z = this.LLILLJJLI.getState().LLIZLLLIL;
            this.LL = 1;
            c15408061m.getClass();
            objLIZ = C15408061m.LIZIZ.LIZ(i2, z, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("IMAIBotCreationVM@1cef.onCreateClick$2");
                return objLJFF;
            }
        }
        long jLongValue = ((Number) objLIZ).longValue();
        if (jLongValue <= 0) {
            C1508705vR c1508705vR = C1508705vR.LL;
            c1508705vR.getClass();
            AnonymousClass0956 anonymousClass0956 = C1508705vR.LLJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            if (C1508705vR.LLJILJILJ > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = C1508705vR.LLJILJILJ;
                long j3 = jElapsedRealtime - j2;
                long j4 = C1508705vR.LLJILJIL;
                if (j4 > 0) {
                    j = j2 - j4;
                } else {
                    j = 0;
                }
                C1508705vR.LJI(j3, j, null, String.valueOf(C1508705vR.LLJILLL), "fail");
                C1508705vR.LLJILJILJ = 0L;
                C1508705vR.LLJILJIL = 0L;
                C15408061m.LIZ.getClass();
                C15407061l c15407061l = C15408061m.LIZIZ;
                synchronized (c15407061l.LLILZIL) {
                    try {
                        ((ArrayList) c15407061l.LLILZIL).remove(c1508705vR);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            this.LLILLJJLI.runOnUIThread(new AwS581S0100000_2((WeakReference) this.LLILLL, (WeakReference<Context>) 202));
            this.LLILLJJLI.setState(AFwS229S0000000_2.get$arr$(209));
        } else {
            this.LLILLJJLI.setState(AFwS229S0000000_2.get$arr$(210));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create success, botId: ");
            sbLIZ.append(jLongValue);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMAIBotCreationVM@1cef.onCreateClick$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
