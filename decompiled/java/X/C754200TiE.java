package X;

import android.app.Activity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.helper.UnpolishedCreatorTipManager$startTipManagement$1$1", f = "UnpolishedCreatorTipManager.kt", l = {}, m = "invokeSuspend")
public final class C754200TiE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754200TiE(int i, Activity activity, DataChannel dataChannel, InterfaceC1364105Vn<? super C754200TiE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = activity;
        this.LLILLL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754200TiE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnpolishedCreatorTipManager@15a3.startTipManagement$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1840700y04.LIZ(null, null, C2286608xc.LJ(this.LL), this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnpolishedCreatorTipManager@15a3.startTipManagement$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
