package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ozn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.compliance.MinisThirdPartyIdentifierManager$willStart$1", f = "MinisThirdPartyIdentifierManager.kt", l = {}, m = "invokeSuspend")
public final class C637690Ozn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637690Ozn(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637690Ozn(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisThirdPartyIdentifierManager@67b8.willStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2197011Ayh c2197011Ayh = C2197011Ayh.LIZ;
        String str = this.LL;
        long j = this.LLILLJJLI;
        c2197011Ayh.getClass();
        if (!a0.LJJJIL(str)) {
            synchronized (c2197011Ayh) {
                try {
                    JSONObject jSONObjectLJIIJ = C2197011Ayh.LJIIJ();
                    jSONObjectLJIIJ.put(str, j);
                    C2197011Ayh.LJFF().storeString("TTMinis3pIdLastDismissMap", C786410Ut5.J3(jSONObjectLJIIJ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisThirdPartyIdentifierManager@67b8.willStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
