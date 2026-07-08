package X;

import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.InboxPageHelper$adjustCreateChatOrSearchEntranceViewIfNeed$2$2$1", f = "InboxPageHelper.kt", l = {}, m = "invokeSuspend")
public final class C1727706pf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C891780Yye LL;
    public final /* synthetic */ TuxIconView LLILLJJLI;
    public final /* synthetic */ TuxIconView LLILLL;
    public final /* synthetic */ TuxIconView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727706pf(C891780Yye c891780Yye, TuxIconView tuxIconView, TuxIconView tuxIconView2, TuxIconView tuxIconView3, InterfaceC1364105Vn<? super C1727706pf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c891780Yye;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = tuxIconView2;
        this.LLILZ = tuxIconView3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1727706pf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, false, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxPageHelper@ff22.adjustCreateChatOrSearchEntranceViewIfNeed$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
