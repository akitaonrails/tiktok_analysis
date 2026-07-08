package X;

import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Odg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel$getUpdatedCards$1", f = "WorkBenchViewModel.kt", l = {132}, m = "invokeSuspend")
public final class C623980Odg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WorkBenchViewModel LLILLJJLI;
    public final /* synthetic */ List<Long> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623980Odg(WorkBenchViewModel workBenchViewModel, List<Long> list, InterfaceC1364105Vn<? super C623980Odg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = workBenchViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C623980Odg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MissionStruct> missionList;
        Object objLLJZ = obj;
        C1C7U.LIZ("WorkBenchViewModel@f1c.getUpdatedCards$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLLJZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLLJZ);
            InterfaceC624050Odn interfaceC624050Odn = (InterfaceC624050Odn) this.LLILLJJLI.LL.getValue().getOperator();
            List<Long> list = this.LLILLL;
            WorkBenchViewModel workBenchViewModel = this.LLILLJJLI;
            String str = workBenchViewModel.LLILLL;
            long j = workBenchViewModel.LLILLJJLI;
            this.LL = 1;
            objLLJZ = interfaceC624050Odn.LLJZ(j, str, list, this);
            if (objLLJZ == objLJFF) {
                C1C7U.LIZIZ("WorkBenchViewModel@f1c.getUpdatedCards$1");
                return objLJFF;
            }
        }
        C624120Odu c624120Odu = (C624120Odu) objLLJZ;
        if (c624120Odu.LIZ == EnumC623590Od3.SUCCESS) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(this.LLILLL);
            ArrayList arrayList = new ArrayList();
            WorkBenchNoticeResponse workBenchNoticeResponse = c624120Odu.LIZIZ;
            if (workBenchNoticeResponse != null && (missionList = workBenchNoticeResponse.getMissionList()) != null) {
                WorkBenchViewModel workBenchViewModel2 = this.LLILLJJLI;
                for (MissionStruct missionStruct : missionList) {
                    if (missionStruct != null) {
                        if (missionStruct.updateTime > workBenchViewModel2.LLILLJJLI) {
                            arrayList.add(new C623970Odf(missionStruct));
                        }
                        linkedHashSet.remove(C2286608xc.LJFF(missionStruct.mid));
                    }
                }
            }
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C623970Odf(new MissionStruct(((Number) it2.next()).longValue(), 0, 0, 0L, 0L, false, null, "", 0, "", "", 0)));
            }
            if (C866950Xzh.LIZIZ(arrayList)) {
                C1440005kM.LIZ(new C624080Odq(arrayList));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchViewModel@f1c.getUpdatedCards$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
