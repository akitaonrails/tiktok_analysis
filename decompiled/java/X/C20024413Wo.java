package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyManager$verifySchema$1", f = "EcSchemaVerifyManager.kt", l = {}, m = "invokeSuspend")
public final class C20024413Wo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EcSchemaVerifyRulesModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20024413Wo(boolean z, boolean z2, String str, EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, InterfaceC1364105Vn<? super C20024413Wo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = str;
        this.LLILZ = ecSchemaVerifyRulesModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20024413Wo(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("EcSchemaVerifyManager@375f.verifySchema$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        C20024613Wq c20024613Wq = C20024613Wq.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (this.LL) {
            str = "manual";
        } else if (this.LLILLJJLI) {
            str = "router";
        } else {
            str = "spark";
        }
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        c20024613Wq.getClass();
        C7879035x.LIZLLL();
        boolean zBooleanValue = false;
        try {
            Pair pairLIZ = C20024613Wq.LIZ(this.LLILZ, this.LLILLL, this.LL, this.LLILLJJLI, arrayList);
            zBooleanValue = ((Boolean) pairLIZ.getFirst()).booleanValue();
            str2 = (String) pairLIZ.getSecond();
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    th.getMessage();
                    arrayList.add(new C20024513Wp(99));
                    if (zBooleanValue || (!arrayList.isEmpty())) {
                        c20024613Wq = C20024613Wq.LIZ;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcSchemaVerifyManager@375f.verifySchema$1");
                    return unit;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (zBooleanValue || (!arrayList.isEmpty())) {
                        C20024613Wq c20024613Wq2 = C20024613Wq.LIZ;
                        EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel = this.LLILZ;
                        String str3 = this.LLILLL;
                        c20024613Wq2.getClass();
                        C20024613Wq.LIZJ(ecSchemaVerifyRulesModel, str3, str2, arrayList, jElapsedRealtime);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = "";
        }
        if (!zBooleanValue) {
            if (arrayList.isEmpty()) {
                C7879035x.LIZLLL();
            }
            Unit unit2 = Unit.LIZ;
            if (!arrayList.isEmpty()) {
                C20024613Wq.LIZJ(this.LLILZ, this.LLILLL, str2, arrayList, jElapsedRealtime);
            }
            C1C7U.LIZIZ("EcSchemaVerifyManager@375f.verifySchema$1");
            return unit2;
        }
        C20024613Wq.LJI(this.LLILZ, this.LLILLL, arrayList, "");
        C20024613Wq.LJII(this.LLILZ, this.LLILLL, arrayList, "");
        C20024613Wq.LJ(this.LLILZ, this.LLILLL, arrayList);
        EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel2 = this.LLILZ;
        String str4 = this.LLILLL;
        c20024613Wq.getClass();
        C20024613Wq.LIZJ(ecSchemaVerifyRulesModel2, str4, str2, arrayList, jElapsedRealtime);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcSchemaVerifyManager@375f.verifySchema$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
