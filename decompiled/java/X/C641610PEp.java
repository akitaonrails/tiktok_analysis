package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.profile.background.CommitUserBgResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.background.handler.ImageBackgroundHandler$commitProfileBackground$1", f = "ImageBackgroundHandler.kt", l = {384}, m = "invokeSuspend")
public final class C641610PEp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1254890ilD LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641610PEp(String str, C1254890ilD c1254890ilD, List<String> list, InterfaceC1364105Vn<? super C641610PEp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1254890ilD;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C641610PEp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("ImageBackgroundHandler@94e8.commitProfileBackground$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C1256030in3 c1256030in3 = C1256030in3.LIZ;
                String str = this.LLILLJJLI;
                this.LL = 1;
                objLIZ = c1256030in3.LIZ(str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ImageBackgroundHandler@94e8.commitProfileBackground$1");
                    return objLJFF;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1250180idc((CommitUserBgResponse) objLIZ, this.LLILLL, this.LLILLJJLI, this.LLILZ, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LJFF("");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageBackgroundHandler@94e8.commitProfileBackground$1");
        return unit;
    }
}
