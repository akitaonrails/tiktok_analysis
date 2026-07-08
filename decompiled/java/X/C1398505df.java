package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aime.AIMEServiceImpl$saveToAlbum$save$1", f = "AIMEServiceImpl.kt", l = {38}, m = "invokeSuspend")
public final class C1398505df extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398505df(C19EG c19eg, String str, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = c19eg;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1398505df(this.LLILZIL, this.LLILZ, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strLIZIZ;
        String name;
        C1C7U.LIZ("AIMEServiceImpl@4990.saveToAlbum$save$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    name = (String) this.LLILLJJLI;
                    strLIZIZ = (String) this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getNickname();
                strLIZIZ = new C2481209nu(this.LLILZ, this.LLILZIL).LIZIZ(null);
                if (strLIZIZ != null) {
                    name = new C0VSJ(strLIZIZ).getName();
                    C140D c140d = C140D.LIZ;
                    this.LL = strLIZIZ;
                    this.LLILLJJLI = name;
                    this.LLILLL = 1;
                    if (c140d.LJJIL(strLIZIZ, this) == objLJFF) {
                        C1C7U.LIZIZ("AIMEServiceImpl@4990.saveToAlbum$save$1");
                        return objLJFF;
                    }
                } else {
                    throw new RuntimeException("");
                }
            }
            C2471909mP.LJJIJIIJI(this.LLILZIL, strLIZIZ, name, false, null, 112);
            this.LLILZLL.invoke(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZLL.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMEServiceImpl@4990.saveToAlbum$save$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
