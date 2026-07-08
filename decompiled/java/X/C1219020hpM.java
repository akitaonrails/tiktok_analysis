package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS20S0210000_19;
import Y.ARunnableS88S0200000_19;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.detail.DetailFriendsV3Operator$requestStandaloneLoadMore$2", f = "DetailFriendsV3Operator.kt", l = {580}, m = "invokeSuspend")
public final class C1219020hpM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1588120rQg LLILLJJLI;
    public final /* synthetic */ C1219030hpN LLILLL;
    public final /* synthetic */ C1219040hpO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219020hpM(AbstractC1588120rQg abstractC1588120rQg, C1219030hpN c1219030hpN, C1219040hpO c1219040hpO, InterfaceC1364105Vn<? super C1219020hpM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1588120rQg;
        this.LLILLL = c1219030hpN;
        this.LLILZ = c1219040hpO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219020hpM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1219050hpP c1219050hpP;
        boolean z;
        ArrayList arrayList;
        C1C7U.LIZ("DetailFriendsV3Operator@5dd.requestStandaloneLoadMore$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1587860rQG c1587860rQG = C1587860rQG.LIZ;
                AbstractC1588120rQg abstractC1588120rQg = this.LLILLJJLI;
                C1219030hpN c1219030hpN = this.LLILLL;
                List<String> list = c1219030hpN.LIZLLL;
                List<Aweme> list2 = c1219030hpN.LIZ;
                this.LL = 1;
                obj = c1587860rQG.LIZ(abstractC1588120rQg, list, list2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DetailFriendsV3Operator@5dd.requestStandaloneLoadMore$2");
                    return objLJFF;
                }
            }
            c1219050hpP = (C1219050hpP) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0W17.LIZIZ("DetailFriendsV3Operator", th);
            C2487409ou.LIZJ(new ARunnableS88S0200000_19(this.LLILZ, th, 50));
        }
        if (c1219050hpP == null) {
            C2487409ou.LIZJ(new ARunnableS119S0100000_19(this.LLILZ, 180));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DetailFriendsV3Operator@5dd.requestStandaloneLoadMore$2");
            return unit;
        }
        this.LLILLL.LIZ.addAll(c1219050hpP.LIZ);
        this.LLILLL.LIZIZ.addAll(c1219050hpP.LIZIZ);
        C1219030hpN c1219030hpN2 = this.LLILLL;
        c1219030hpN2.LIZJ = c1219050hpP.LIZLLL;
        c1219030hpN2.LJ = c1219050hpP.LJ;
        List<String> list3 = c1219050hpP.LJFF;
        ArrayList arrayList2 = null;
        if (list3 != null) {
            if (!(!list3.isEmpty())) {
                list3 = null;
            }
            if (list3 != null) {
                C1219030hpN c1219030hpN3 = this.LLILLL;
                List<String> list4 = c1219030hpN3.LIZLLL;
                if (list4 != null) {
                    arrayList = new ArrayList(list4);
                } else {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(list3);
                c1219030hpN3.LIZLLL = arrayList;
            }
        }
        this.LLILZ.LLJ.addAll(c1219050hpP.LIZJ);
        C1219040hpO.LJIIIIZZ(this.LLILLL.LIZIZ, this.LLILZ.LLJ);
        List<? extends Aweme> listLLIIII = C13LP.LLIIII(this.LLILLL.LIZ);
        C1219030hpN c1219030hpN4 = this.LLILLL;
        boolean z3 = c1219030hpN4.LJ;
        C1219040hpO c1219040hpO = this.LLILZ;
        c1219040hpO.LLJILJIL = listLLIIII;
        AbstractC1588120rQg abstractC1588120rQg2 = c1219030hpN4.LIZJ;
        List<String> list5 = c1219030hpN4.LIZLLL;
        if (list5 != null) {
            arrayList2 = new ArrayList(list5);
        }
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        c1219040hpO.LLJIJIL = new C1219060hpQ(abstractC1588120rQg2, arrayList2, z);
        C1219040hpO c1219040hpO2 = this.LLILZ;
        if (!z3) {
            z2 = false;
        }
        C2487409ou.LIZJ(new ARunnableS20S0210000_19(listLLIIII, c1219040hpO2, z2, 3));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DetailFriendsV3Operator@5dd.requestStandaloneLoadMore$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
