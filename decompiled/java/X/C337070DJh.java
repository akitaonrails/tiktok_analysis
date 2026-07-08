package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog$initObserver$2", f = "SubPackagePageDialog.kt", l = {}, m = "invokeSuspend")
public final class C337070DJh extends C09AX implements Function2<C221500tJ, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubPackagePageDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337070DJh(SubPackagePageDialog subPackagePageDialog, InterfaceC1364105Vn<? super C337070DJh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subPackagePageDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C337070DJh c337070DJh = new C337070DJh(this.LLILLJJLI, interfaceC1364105Vn);
        c337070DJh.LL = obj;
        return c337070DJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubPackagePageDialog@79bf.initObserver$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C221500tJ c221500tJ = (C221500tJ) this.LL;
        Dialog dialog = this.LLILLJJLI.getDialog();
        if (dialog != null && dialog.isShowing() && Intrinsics.LJFF(c221500tJ.LIZ, this.LLILLJJLI.LLIZLLLIL.LIZ)) {
            this.LLILLJJLI.dismiss();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubPackagePageDialog@79bf.initObserver$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C221500tJ c221500tJ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c221500tJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
