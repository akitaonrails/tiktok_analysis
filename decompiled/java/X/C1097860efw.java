package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0efw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.notify.LiveNotifyLogManager$logConsumed$1", f = "LiveNotifyLogManager.kt", l = {}, m = "invokeSuspend")
public final class C1097860efw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ C1097740efk LLILLJJLI;
    public final /* synthetic */ InterfaceC1102110emn LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Set<String> LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097860efw(DataChannel dataChannel, C1097740efk c1097740efk, InterfaceC1102110emn interfaceC1102110emn, String str, Set<String> set, Map<String, String> map, InterfaceC1364105Vn<? super C1097860efw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dataChannel;
        this.LLILLJJLI = c1097740efk;
        this.LLILLL = interfaceC1102110emn;
        this.LLILZ = str;
        this.LLILZIL = set;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1097860efw(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotifyLogManager@58f4.logConsumed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1102100emm.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotifyLogManager@58f4.logConsumed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
