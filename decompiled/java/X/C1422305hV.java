package X;

import Y.AComparatorS21S0000000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixRefreshRepo$doWorkPrivate$5$4$onNext$3$mixPageVOData$1", f = "BaseMixRefreshRepo.kt", l = {468}, m = "invokeSuspend")
public final class C1422305hV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1422405hW>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC677500Qho LLILLJJLI;
    public final /* synthetic */ C677540Qhs LLILLL;
    public final /* synthetic */ C1422405hW LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422305hV(AbstractC677500Qho abstractC677500Qho, C677540Qhs c677540Qhs, C1422405hW c1422405hW, InterfaceC1364105Vn<? super C1422305hV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC677500Qho;
        this.LLILLL = c677540Qhs;
        this.LLILZ = c1422405hW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1422305hV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objLIZ = obj;
        C1C7U.LIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$mixPageVOData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            AbstractC677500Qho abstractC677500Qho = this.LLILLJJLI;
            C677540Qhs c677540Qhs = this.LLILLL;
            this.LL = 1;
            abstractC677500Qho.getClass();
            objLIZ = C1422805ha.LIZ.LIZ(c677540Qhs, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$mixPageVOData$1");
                return objLJFF;
            }
        }
        C1422405hW c1422405hW = (C1422405hW) objLIZ;
        if (c1422405hW != null) {
            this.LLILLJJLI.LIZ.LLJILJIL = true;
            C1422405hW c1422405hW2 = this.LLILZ;
            if (c1422405hW2 != null && !c1422405hW2.LIZJ.isEmpty()) {
                ArrayList arrayList = new ArrayList(c1422405hW.LIZJ);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C1397705dX) obj2).LIZ, obj2);
                }
                for (C1397705dX c1397705dX : c1422405hW2.LIZJ) {
                    if (linkedHashMap.containsKey(c1397705dX.LIZ)) {
                        int iIndexOf = arrayList.indexOf(linkedHashMap.get(c1397705dX.LIZ));
                        if (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ListProtector.set(arrayList, iIndexOf, c1397705dX);
                        }
                    } else {
                        arrayList.add(c1397705dX);
                    }
                }
                if (arrayList.size() > 1) {
                    try {
                        C08XD.LJJ(arrayList, new AComparatorS21S0000000_2(10));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.addAll(((C1397705dX) it2.next()).LIZLLL);
                }
                int i2 = c1422405hW2.LIZLLL;
                if (i2 < 0) {
                    i2 = c1422405hW.LIZLLL;
                }
                long j = c1422405hW2.LJ;
                if (j < 0) {
                    j = c1422405hW.LJ;
                }
                int i3 = c1422405hW2.LJFF;
                if (i3 < 0) {
                    i3 = c1422405hW.LJFF;
                }
                EComSearchBffResp eComSearchBffResp = c1422405hW2.LIZ;
                if (eComSearchBffResp == null) {
                    eComSearchBffResp = c1422405hW.LIZ;
                }
                C675270QeD c675270QeD = c1422405hW2.LJI;
                if (c675270QeD == null) {
                    c675270QeD = c1422405hW.LJI;
                }
                LogPbBean logPbBean = c1422405hW2.LJII;
                if (logPbBean == null) {
                    logPbBean = c1422405hW.LJII;
                }
                c1422405hW = new C1422405hW(eComSearchBffResp, arrayList2, arrayList, i2, j, i3, c675270QeD, logPbBean);
            }
        } else {
            c1422405hW = this.LLILZ;
        }
        C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$mixPageVOData$1");
        return c1422405hW;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1422405hW> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
