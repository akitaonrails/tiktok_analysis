package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ShareProfileCellKt$ShareProfileCell$3$1", f = "ShareProfileCell.kt", l = {}, m = "invokeSuspend")
public final class C1057580dcy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2025707wd LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057580dcy(C2025707wd c2025707wd, Context context, View view, InterfaceC1364105Vn<? super C1057580dcy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2025707wd;
        this.LLILLJJLI = context;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1057580dcy(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareProfileCellKt@7329.ShareProfileCell$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLILLJJLI != null) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(this.LLILLJJLI, this.LLILLL, this.LL.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareProfileCellKt@7329.ShareProfileCell$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
