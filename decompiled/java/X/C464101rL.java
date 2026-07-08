package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment$onCreate$2$2$1$1$2", f = "TakoViewLargeImageDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C464101rL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C464101rL(C013C c013c, Context context, View view, InterfaceC1364105Vn<? super C464101rL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = context;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C464101rL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.element) {
            i = R.raw.icon_tick_circle_fill;
        } else {
            i = R.raw.icon_exclamation_mark_circle_fill;
        }
        Resources resources = this.LLILLJJLI.getResources();
        if (this.LL.element) {
            i2 = 2131822518;
        } else {
            i2 = 2131822517;
        }
        C0DQF.LJ(this.LLILLL, resources.getString(i2), C2286608xc.LJ(i), C2286608xc.LJ(R.attr.a01), false, 16);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewLargeImageDialogFragment@3345.onCreate$2$2$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
