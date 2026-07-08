package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander$onComplete$1", f = "EcomResourceBystander.kt", l = {}, m = "invokeSuspend")
public final class C2128108Vj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TypedInput LL;
    public final /* synthetic */ Request LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2128108Vj(TypedInput typedInput, Request request, InterfaceC1364105Vn<? super C2128108Vj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = typedInput;
        this.LLILLJJLI = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2128108Vj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("EcomResourceBystander@3e02.onComplete$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
        AbsTypedOutput absTypedOutput = (AbsTypedOutput) this.LL;
        ecomResourceBystander.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                absTypedOutput.writeTo(byteArrayOutputStream);
                string = byteArrayOutputStream.toString();
                try {
                    byteArrayOutputStream.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    byteArrayOutputStream.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                string = null;
            }
            EcomResourceBystander.LJIILLIIL(C1741890vQh.LJIIJ(string), this.LLILLJJLI.getPath(), Boolean.FALSE, null, null);
            if (jCurrentTimeMillis % ((long) 100) == 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int i = C1505950pI9.LIZ;
                C1505950pI9.LIZJ(jCurrentTimeMillis2 - jCurrentTimeMillis, "i_native_response_async", this.LLILLJJLI.getPath());
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcomResourceBystander@3e02.onComplete$1");
            return unit;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                byteArrayOutputStream.close();
                C189200o6.m2constructorimpl(Unit.LIZ);
                throw th3;
            } finally {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
