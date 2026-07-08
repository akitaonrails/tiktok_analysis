package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pipo.kyc.singpass.PipoMiddleActivity;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import com.google.gson.Gson;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.kyc.singpass.PipoMiddleActivity$getPersonInfo$1$1$1$1", f = "PipoMiddleActivity.kt", l = {}, m = "invokeSuspend")
public final class C1739540vMu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Pair LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1739570vMx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739540vMu(Pair pair, InterfaceC1364105Vn interfaceC1364105Vn, String str, C1739570vMx c1739570vMx) {
        super(2, interfaceC1364105Vn);
        this.LL = pair;
        this.LLILLJJLI = str;
        this.LLILLL = c1739570vMx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739540vMu(this.LL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoMiddleActivity@45a3.getPersonInfo$1$invokeSuspend$$inlined$let$lambda$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PersonInfo personInfo = (PersonInfo) this.LL.getFirst();
        if (personInfo != null) {
            PipoMiddleActivity pipoMiddleActivity = this.LLILLL.LLILLJJLI;
            pipoMiddleActivity.getClass();
            InterfaceC1739510vMr interfaceC1739510vMr = C1739550vMv.LIZ;
            if (interfaceC1739510vMr != null) {
                GsonProtectorUtils.toJson(new Gson(), personInfo);
                interfaceC1739510vMr.LIZ(personInfo, null);
            }
            pipoMiddleActivity.finish();
        } else {
            PipoMiddleActivity pipoMiddleActivity2 = this.LLILLL.LLILLJJLI;
            this.LL.getSecond();
            this.LL.getSecond();
            pipoMiddleActivity2.LLLLLZL(new C1739500vMq(106, "fail to get person info"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoMiddleActivity@45a3.getPersonInfo$1$invokeSuspend$$inlined$let$lambda$1");
        return unit;
    }
}
