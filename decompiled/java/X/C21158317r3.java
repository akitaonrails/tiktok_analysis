package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS576S0100000_32;
import njp.a;

/* JADX INFO: renamed from: X.17r3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.popuptask.task.EcMixMallInternalHybridPopupTask$handlePopupTaskExecute$1", f = "EcMixMallInternalHybridPopupTask.kt", l = {114}, m = "invokeSuspend")
public final class C21158317r3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC21155717qd LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, Pair<Integer, String>, Map<String, Object>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21158317r3(long j, ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd, InterfaceC1631620sYq<? super Boolean, ? super Pair<Integer, String>, ? super Map<String, Object>, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C21158317r3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = viewTreeObserverOnGlobalLayoutListenerC21155717qd;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21158317r3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$1");
                return objLJFF;
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd = this.LLILLL;
        viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLJIJIL = null;
        new AwS576S0100000_32(viewTreeObserverOnGlobalLayoutListenerC21155717qd, 14);
        InterfaceC1631620sYq<Boolean, Pair<Integer, String>, Map<String, Object>, Unit> interfaceC1631620sYq = this.LLILZ;
        Pair<Integer, String> pair = C21155317qZ.LIZIZ;
        interfaceC1631620sYq.invoke(false, pair, null);
        ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd2 = this.LLILLL;
        C21157017qq.LIZ(viewTreeObserverOnGlobalLayoutListenerC21155717qd2.LLILLJJLI, viewTreeObserverOnGlobalLayoutListenerC21155717qd2, false, pair, null, 17);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallInternalHybridPopupTask@6414.handlePopupTaskExecute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
