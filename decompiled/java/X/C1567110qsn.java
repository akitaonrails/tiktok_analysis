package X;

import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel$loadNotice$1", f = "RechargePanelHeaderViewModel.kt", l = {BaseNotice.CREATOR, BaseNotice.CREATOR, 74}, m = "invokeSuspend")
public final class C1567110qsn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ RechargePanelHeaderViewModel LLILZ;
    public final /* synthetic */ C1566250qrP LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567110qsn(RechargePanelHeaderViewModel rechargePanelHeaderViewModel, C1566250qrP c1566250qrP, InterfaceC1364105Vn<? super C1567110qsn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = rechargePanelHeaderViewModel;
        this.LLILZIL = c1566250qrP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1567110qsn c1567110qsn = new C1567110qsn(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1567110qsn.LLILLL = obj;
        return c1567110qsn;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0198  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567110qsn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
