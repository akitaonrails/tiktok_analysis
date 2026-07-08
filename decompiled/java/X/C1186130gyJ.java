package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadConfigModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import njp.a;

/* JADX INFO: renamed from: X.0gyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.LsResPreloadHandler$parseDetailSlashNode$1", f = "LsResPreloadHandler.kt", l = {}, m = "invokeSuspend")
public final class C1186130gyJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ n LL;
    public final /* synthetic */ LsResourcePreloadConfigModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186130gyJ(n nVar, LsResourcePreloadConfigModel lsResourcePreloadConfigModel, String str, String str2, InterfaceC1364105Vn<? super C1186130gyJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
        this.LLILLJJLI = lsResourcePreloadConfigModel;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1186130gyJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        n nVarLIZJ;
        C1C7U.LIZ("LsResPreloadHandler@ec70.parseDetailSlashNode$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            n nVar = this.LL;
            Map map = null;
            if (nVar != null) {
                nVarLIZJ = nVar.LIZJ();
            } else {
                nVarLIZJ = null;
            }
            try {
                Gson gsonLIZ = C2365509Or.LIZ();
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                Object objLIZLLL = gsonLIZ.LIZLLL(nVarLIZJ, C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class)))));
                if (!(objLIZLLL instanceof Map)) {
                    objLIZLLL = null;
                }
                map = (Map) objLIZLLL;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("data", map));
            C1336370ksd c1336370ksd = C1336370ksd.LIZ;
            C1336370ksd.LIZLLL(this.LLILLJJLI, mapLIZJ, this.LLILLL, this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LsResPreloadHandler@ec70.parseDetailSlashNode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
