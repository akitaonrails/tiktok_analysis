package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveTaskHandler$initTaskFromFlow$1", f = "AILiveTaskHandler.kt", l = {122, 127}, m = "invokeSuspend")
public final class C545730Lal extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C558710Lvh LLILLL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545730Lal(C558710Lvh c558710Lvh, ICreationAsyncTaskManager iCreationAsyncTaskManager, InterfaceC1364105Vn<? super C545730Lal> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c558710Lvh;
        this.LLILZ = iCreationAsyncTaskManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545730Lal(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object taskId;
        C1C7U.LIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskId = this.LL;
            C155000ia.LIZIZ(obj);
            C01GW c01gw = AnonymousClass0913.LIZ;
            AnonymousClass0913.LIZ("AILiveTaskHandler", Collections.singletonList(taskId));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        if (this.LLILLL.getEditModel().getAILivePhotoModel().LJIIIZ() && (taskId = this.LLILLL.getEditModel().getAILivePhotoModel().getTaskId()) != null) {
            ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILZ;
            List listSingletonList = Collections.singletonList(taskId);
            this.LL = taskId;
            this.LLILLJJLI = 1;
            if (iCreationAsyncTaskManager.LJIJI("AILiveTaskHandler", listSingletonList, this) == objLJFF) {
                C1C7U.LIZIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
                return objLJFF;
            }
            C01GW c01gw2 = AnonymousClass0913.LIZ;
            AnonymousClass0913.LIZ("AILiveTaskHandler", Collections.singletonList(taskId));
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
            return unit22;
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManager2 = this.LLILZ;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILLJJLI = 2;
        if (iCreationAsyncTaskManager2.LJIJI("AILiveTaskHandler", c13bv, this) == objLJFF) {
            C1C7U.LIZIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AILiveTaskHandler@e060.initTaskFromFlow$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
