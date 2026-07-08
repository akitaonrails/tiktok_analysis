package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentKeva$needProcessCommand$2", f = "TakoClientAgentKeva.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C444501oB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444501oB(String str, InterfaceC1364105Vn<? super C444501oB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444501oB(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        String str;
        C1C7U.LIZ("TakoClientAgentKeva@6edd.needProcessCommand$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C444601oC.LIZIZ;
            str = this.LLILZ;
            this.LL = c1dev;
            this.LLILLJJLI = str;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("TakoClientAgentKeva@6edd.needProcessCommand$2");
                return objLJFF;
            }
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processed_command_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C01GW c01gw = C444601oC.LIZ;
            if (((Keva) c01gw.getValue()).contains(strLIZIZ)) {
                z = false;
            } else {
                ((Keva) c01gw.getValue()).storeBoolean(strLIZIZ, true);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            c1dev.LIZIZ(null);
            C1C7U.LIZIZ("TakoClientAgentKeva@6edd.needProcessCommand$2");
            return boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
