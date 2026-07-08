package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.06ER, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakPetLynxPanel$open$sparkContext$1$2$onLoadStart$1", f = "StreakPetLynxPanel.kt", l = {160, 162}, m = "invokeSuspend")
public final class C06ER extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06EK LLILLJJLI;
    public final /* synthetic */ InterfaceC1541990qEH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ER(C06EK c06ek, InterfaceC1541990qEH interfaceC1541990qEH, InterfaceC1364105Vn<? super C06ER> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06ek;
        this.LLILLL = interfaceC1541990qEH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ER(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakPetLynxPanel@7dcd.open$sparkContext$1$2$onLoadStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.open$sparkContext$1$2$onLoadStart$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C06EK c06ek = this.LLILLJJLI;
            this.LL = 1;
            obj = c06ek.LIZIZ(true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.open$sparkContext$1$2$onLoadStart$1");
                return objLJFF;
            }
        }
        C1590806Ks.LIZ("StreakPetLynxPanel onLoadStart updateDataByJson");
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C06ES c06es = new C06ES(this.LLILLL, (String) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c06es) == objLJFF) {
            C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.open$sparkContext$1$2$onLoadStart$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.open$sparkContext$1$2$onLoadStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
