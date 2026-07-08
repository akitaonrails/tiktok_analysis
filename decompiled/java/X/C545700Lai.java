package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveTaskHandler$runUtilAsyncIfNeed$1", f = "AILiveTaskHandler.kt", l = {188}, m = "invokeSuspend")
public final class C545700Lai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C558710Lvh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545700Lai(C558710Lvh c558710Lvh, InterfaceC1364105Vn<? super C545700Lai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c558710Lvh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545700Lai(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveTaskHandler@e060.runUtilAsyncIfNeed$1");
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
            String taskId = this.LLILLJJLI.getEditModel().getAILivePhotoModel().getTaskId();
            if (taskId == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AILiveTaskHandler@e060.runUtilAsyncIfNeed$1");
                return unit;
            }
            ICreationAsyncTaskManager iCreationAsyncTaskManagerO2 = this.LLILLJJLI.o2();
            if (iCreationAsyncTaskManagerO2 != null) {
                List<String> listSingletonList = Collections.singletonList(taskId);
                this.LL = 1;
                obj = iCreationAsyncTaskManagerO2.LJIJJ(listSingletonList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AILiveTaskHandler@e060.runUtilAsyncIfNeed$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AILiveTaskHandler@e060.runUtilAsyncIfNeed$1");
            return unit2;
        }
        List<C0LSZ> list = (List) obj;
        if (list != null) {
            for (C0LSZ c0lsz : list) {
                if (!C381270ExB.LIZ(c0lsz.LJFF)) {
                    C01GW c01gw = AnonymousClass0913.LIZ;
                    AnonymousClass0913.LIZLLL.add(c0lsz.LIZ);
                    AnonymousClass0913.LIZIZ();
                }
            }
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("AILiveTaskHandler@e060.runUtilAsyncIfNeed$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
