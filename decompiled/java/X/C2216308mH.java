package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.keva.IMCriticalFlowKeva$storeShareIconClickedTimeStamp$1", f = "IMCriticalFlowKeva.kt", l = {}, m = "invokeSuspend")
public final class C2216308mH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216308mH(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2216308mH(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCriticalFlowKeva@93a4.storeShareIconClickedTimeStamp$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2216408mI c2216408mI = C2216408mI.LIZ;
        String str = this.LL;
        long j = this.LLILLJJLI;
        Keva kevaLIZ = c2216408mI.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("share_head_show_performance");
        sbLIZ.append(str);
        kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMCriticalFlowKeva@93a4.storeShareIconClickedTimeStamp$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
