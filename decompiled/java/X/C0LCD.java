package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LCD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskDraftHelper$processPushMessage$1", f = "CreationAsyncTaskDraftHelper.kt", l = {89}, m = "invokeSuspend")
public final class C0LCD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCPushMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LCD(AIGCPushMessage aIGCPushMessage, InterfaceC1364105Vn<? super C0LCD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCPushMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LCD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskDraftHelper@dd98.processPushMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI.creationId;
            StringBuilder sb = new StringBuilder("processPushMessage: creationId=");
            sb.append(str);
            sb.append(", statusCode=");
            sb.append(this.LLILLJJLI.statusCode);
            sb.append(", taskDetails=");
            List<TaskDetail> list = this.LLILLJJLI.taskDetailList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TaskDetail> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().taskId);
            }
            sb.append(arrayList);
            C09JK.LIZ(sb.toString());
            AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, true, true, 2));
            if (awemeDraftLJI == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("processPushMessage: queryDraft returned null for creationId=");
                sbLIZ.append(str);
                C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CreationAsyncTaskDraftHelper@dd98.processPushMessage$1");
                return unit;
            }
            C0LCT c0lct = C0LCT.LIZ;
            AIGCPushMessage aIGCPushMessage = this.LLILLJJLI;
            this.LL = 1;
            if (c0lct.LJ(aIGCPushMessage, awemeDraftLJI, this) == objLJFF) {
                C1C7U.LIZIZ("CreationAsyncTaskDraftHelper@dd98.processPushMessage$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskDraftHelper@dd98.processPushMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
