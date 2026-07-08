package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.incentive.taskevent.watchvideo.WatchVideoTimeTaskTrigger$tryStartShowBubble$1", f = "WatchVideoTimeTaskTrigger.kt", l = {616}, m = "invokeSuspend")
public final class C1898600zVS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1898820zVo LLILLJJLI;
    public final /* synthetic */ BaseTimerPendantManager<TaskEvent> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898600zVS(C1898820zVo c1898820zVo, BaseTimerPendantManager<TaskEvent> baseTimerPendantManager, InterfaceC1364105Vn<? super C1898600zVS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1898820zVo;
        this.LLILLL = baseTimerPendantManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1898600zVS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("WatchVideoTimeTaskTrigger@a6ab.tryStartShowBubble$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        while (true) {
            Bubble bubble = (Bubble) C13LP.LJJJLL(this.LLILLJJLI.LLJJJJLIIL);
            if (bubble == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.tryStartShowBubble$1");
                return unit;
            }
            int iIntValue = 0;
            ListProtector.remove(this.LLILLJJLI.LLJJJJLIIL, 0);
            C1898820zVo c1898820zVo = this.LLILLJJLI;
            BaseTimerPendantManager<TaskEvent> baseTimerPendantManager = this.LLILLL;
            c1898820zVo.getClass();
            int i2 = bubble.bubbleType;
            String str = "";
            if (i2 != 13) {
                if (baseTimerPendantManager != null) {
                    String str2 = bubble.taskKey;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (bubble.showDuration != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    baseTimerPendantManager.LIZLLL(i2, str, "", "", z, false, bubble);
                }
            } else {
                String str3 = bubble.LJIIIZ;
                if (str3 != null && baseTimerPendantManager != null) {
                    String str4 = c1898820zVo.LL.taskEventKey;
                    if (str4 != null) {
                        str = str4;
                    }
                    iIntValue = 0;
                    baseTimerPendantManager.LIZLLL(13, str, str3, null, true, false, bubble);
                }
            }
            Integer num = bubble.showDuration;
            if (num != null) {
                iIntValue = num.intValue();
            }
            long j = (((long) iIntValue) * 1000) + 1000;
            if (j >= 0 && j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.tryStartShowBubble$1");
                    return objLJFF;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
