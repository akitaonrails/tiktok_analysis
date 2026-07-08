package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06XY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$parseBizData$2", f = "ProfileIdentifierFragment.kt", l = {}, m = "invokeSuspend")
public final class C06XY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BizBaseData>, Object> {
    public final /* synthetic */ n LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06XY(n nVar, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XY(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BizBaseData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1$invokeSuspend$$inlined$parseBizData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        n nVar = this.LL;
        if (nVar != null) {
            try {
                objLIZ = C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("ProfileIdentifierPage", "parseBizData error:", e);
                objLIZ = null;
            }
        } else {
            objLIZ = null;
        }
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1$invokeSuspend$$inlined$parseBizData$1");
        return objLIZ;
    }
}
