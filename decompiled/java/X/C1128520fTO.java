package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$postScroll$1$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
public final class C1128520fTO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GiftPanelLeafViewModel LL;
    public final /* synthetic */ RunnableC781530UlD LLILLJJLI;
    public final /* synthetic */ GridLayoutManager LLILLL;
    public final /* synthetic */ C1128710fTh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128520fTO(GiftPanelLeafViewModel giftPanelLeafViewModel, RunnableC781530UlD runnableC781530UlD, GridLayoutManager gridLayoutManager, C1128710fTh c1128710fTh, InterfaceC1364105Vn<? super C1128520fTO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftPanelLeafViewModel;
        this.LLILLJJLI = runnableC781530UlD;
        this.LLILLL = gridLayoutManager;
        this.LLILZ = c1128710fTh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1128520fTO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[LOOP:0: B:10:0x005c->B:35:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b5 A[EDGE_INSN: B:92:0x00b5->B:40:0x00b5 BREAK  A[LOOP:0: B:10:0x005c->B:35:0x00a8], SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128520fTO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
